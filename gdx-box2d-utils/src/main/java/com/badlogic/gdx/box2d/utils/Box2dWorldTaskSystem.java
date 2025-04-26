package com.badlogic.gdx.box2d.utils;

import com.badlogic.gdx.box2d.Box2d;
import com.badlogic.gdx.box2d.structs.b2WorldDef;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import com.badlogic.gdx.jnigen.runtime.closure.PointingPoolManager;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.utils.Disposable;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * This class implements a basic TaskSystem in java, for multithreading of a box2d world.
 * One {@link Box2dWorldTaskSystem} handles one world.
 * The MultiThreader will create and keep alive the configured amount of workers,
 * After every world step, {@link Box2dWorldTaskSystem#afterStep()} needs to be called.
 * After the world is destroyed, {@link Box2dWorldTaskSystem#dispose()} needs to be called.
 * This class, like box2d, is not thread safe.
 */
public class Box2dWorldTaskSystem implements Disposable {

    private static final int MAX_TASKS = 128;

    private final Thread[] workers;
    private final int numWorkers;
    private final AtomicInteger aliveWorkers;
    private final Box2dWorldTaskSystemDeathHandler deathHandler;
    private final BlockingQueue<Box2dTaskChunk> taskChunks;
    private final Box2dCountdown[] countDownLatches = new Box2dCountdown[MAX_TASKS];
    private final ClosureObject<Box2d.b2EnqueueTaskCallback> enqueueTaskCallback;
    private final ClosureObject<Box2d.b2FinishTaskCallback> finishTaskCallback;
    private final PointingPoolManager poolManager = new PointingPoolManager(2);
    private final ArrayBlockingQueue<Box2dTaskChunk> chunkPool;
    private final VoidPointer TASK_INDEX_WRAPPER = new VoidPointer(0L, false);
    private final boolean poolingEnabled;

    private int taskCount = 0;
    private boolean running = true;

    /**
     * This method creates and configures a {@link b2WorldDef} to use a newly created {@link Box2dWorldTaskSystem}
     *
     * After the world is destroyed, {@link Box2dWorldTaskSystem#dispose()} needs to be called.
     *
     * @param worldDef The world to configure
     * @param numWorkers The amount of worker
     * @param deathHandler Handler for when the task system dies. see {@link Box2dWorldTaskSystemDeathHandler}
     * @param enablePooling Whether the TaskSystem should avoid per-frame allocation
     * @return The created {@link Box2dWorldTaskSystem}
     */
    public static Box2dWorldTaskSystem createForWorld(b2WorldDef worldDef, int numWorkers, Box2dWorldTaskSystemDeathHandler deathHandler, boolean enablePooling) {
        Box2dWorldTaskSystem multiThreader = new Box2dWorldTaskSystem(numWorkers, deathHandler, enablePooling);
        multiThreader.configureForWorld(worldDef);
        return multiThreader;
    }

    private Box2dWorldTaskSystem(int numWorkers, Box2dWorldTaskSystemDeathHandler deathHandler, boolean enablePooling) {
        if (numWorkers <= 1)
            throw new IllegalArgumentException("Number of workers must be greater than 1");

        this.poolingEnabled = enablePooling;
        this.numWorkers = numWorkers;
        this.workers = new Thread[numWorkers];
        this.taskChunks = new ArrayBlockingQueue<>(MAX_TASKS * numWorkers);
        this.chunkPool = new ArrayBlockingQueue<>(MAX_TASKS * numWorkers);
        this.aliveWorkers = new AtomicInteger(numWorkers);
        this.deathHandler = deathHandler;

        for (int i = 0; i < MAX_TASKS; i++) {
            countDownLatches[i] = new Box2dCountdown();
        }

        for (int i = 0; i < numWorkers; i++) {
            final int workerId = i;
            workers[i] = new Thread(() -> {
                try {
                    while (running) {
                       try {
                           Box2dTaskChunk task = taskChunks.take();
                           task.execute(workerId);
                           countDownLatches[task.taskIndex].countDown();
                           if (poolingEnabled)
                               chunkPool.offer(task);
                       } catch (InterruptedException e) {
                           break;
                       }
                   }
                } finally {
                    if (running)
                        onThreadDies();
                }
            }, "Box2d-Worker-" + workerId);
            workers[i].setDaemon(true);
            workers[i].start();
        }

        enqueueTaskCallback = ClosureObject.fromClosure(((task, itemCount, minRange, taskContext, userContext) -> {
            if (!running)
                throw new IllegalStateException("Scheduler shut down");
            if (taskCount < MAX_TASKS) {
                int numTasks = Math.min(numWorkers, (itemCount + minRange - 1) / minRange);
                int baseItemsPerTask = itemCount / numTasks;
                int remainingItems = itemCount % numTasks;

                countDownLatches[taskCount].setCount(numTasks);

                int start = 0;
                for (int i = 0; i < numTasks; i++) {
                    int itemsInThisTask = baseItemsPerTask + (i < remainingItems ? 1 : 0);
                    int end = start + itemsInThisTask;

                    Box2dTaskChunk box2DTaskChunk = poolingEnabled ? chunkPool.poll() : new Box2dTaskChunk();
                    if (box2DTaskChunk == null)
                        box2DTaskChunk = new Box2dTaskChunk();

                    box2DTaskChunk.setData(taskCount, task, start, end, taskContext.getPointer());
                    if (!taskChunks.offer(box2DTaskChunk))
                        throw new IllegalStateException("Task queue is full - impossible");
                    start = end;
                }

                TASK_INDEX_WRAPPER.setPointer(taskCount + 1);
                taskCount++;
                return TASK_INDEX_WRAPPER;
            } else {
                task.getClosure().b2TaskCallback_call(0, itemCount, 0, taskContext);
                return VoidPointer.NULL;
            }
        }));

        finishTaskCallback = ClosureObject.fromClosure((userTask, userContext) -> {
            if (!running)
                throw new IllegalStateException("Scheduler shut down");

            int taskId = (int) userTask.getPointer() - 1;
            try {
                countDownLatches[taskId].await();
            } catch (InterruptedException e) {
                throw new Box2dWorldTaskSystemInterruptException(e);
            }
        });

        if (poolingEnabled) {
            poolManager.addPool(VoidPointer::new, 2);
            enqueueTaskCallback.setPoolManager(poolManager);
            finishTaskCallback.setPoolManager(poolManager);
        }
    }

    private void onThreadDies() {
        if (aliveWorkers.getAndDecrement() == numWorkers) {
            deathHandler.taskSystemDied();
        }
    }

    private void configureForWorld(b2WorldDef worldDef) {
        worldDef.enqueueTask(enqueueTaskCallback);
        worldDef.finishTask(finishTaskCallback);
        worldDef.workerCount(numWorkers);
    }

    /**
     * This method needs to be called after every world step
     */
    public void afterStep() {
        taskCount = 0;
    }

    /**
     * Cleans up all resources. Should not be called before destroying the world.
     */
    @Override
    public void dispose() {
        running = false;

        for (Thread worker : workers) {
            worker.interrupt();
            try {
                worker.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        enqueueTaskCallback.free();
        finishTaskCallback.free();
    }

    private static class Box2dTaskChunk {
        private int taskIndex;
        private ClosureObject<Box2d.b2TaskCallback> task;
        private int start;
        private int end;
        private final VoidPointer taskContext = new VoidPointer(0L, false);

        public void setData(int taskIndex, ClosureObject<Box2d.b2TaskCallback> task, int start, int end, long taskContext) {
            this.taskIndex = taskIndex;
            this.task = task;
            this.start = start;
            this.end = end;
            this.taskContext.setPointer(taskContext);
        }

        public void execute(int workerId) {
            task.getClosure().b2TaskCallback_call(start, end, workerId, taskContext);
        }
    }

    public static class Box2dWorldTaskSystemInterruptException extends RuntimeException {
        public Box2dWorldTaskSystemInterruptException(InterruptedException e) {
            super(e);
        }
    }

    @FunctionalInterface
    public interface Box2dWorldTaskSystemDeathHandler {
        /**
         * So, your task system died, hooray! This was caused by an exception on a worker thread. <br>
         * The most important thing to do now is, to call {@link Thread#interrupt()} on the thread, that runs {@link Box2d#b2World_Step}.<br>
         * This will make your {@link Box2d#b2World_Step} method throw a {@link Box2dWorldTaskSystemInterruptException}.<br>
         * Now you have two options:<br>
         * 1. Let everything crash and don't catch the exception <br>
         * 2. Catch the exception and handle it gracefully. After you caught the exception, you can safely dispose the current TaskSystem.
         *      You should also be able to gracefully tear down the world, but that's more risky. In any case, you shouldn't use the world further and create a new one. <br>
         * The exception that made the worker thread crash can be seen over the {@link Thread#setDefaultUncaughtExceptionHandler}}
         */
        void taskSystemDied();
    }

    private static class Box2dCountdown extends AbstractQueuedSynchronizer {

        private Box2dCountdown() {
            setState(0);
        }

        public void setCount(int count) {
            setState(count);
        }

        public void await() throws InterruptedException {
            acquireSharedInterruptibly(1);
        }

        public void countDown() {
            releaseShared(1);
        }

        @Override
        protected int tryAcquireShared(int acquires) {
            return (getState() == 0) ? 1 : -1;
        }

        @Override
        protected boolean tryReleaseShared(int releases) {
            // Decrement count; signal when transition to zero
            for (;;) {
                int c = getState();
                if (c == 0)
                    return false;
                int nextc = c - 1;
                if (compareAndSetState(c, nextc))
                    return nextc == 0;
            }
        }
    }
}
