package com.badlogic.gdx.box2d.utils;

import com.badlogic.gdx.box2d.Box2d;
import com.badlogic.gdx.box2d.structs.b2WorldDef;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.utils.Disposable;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;

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
    private final BlockingQueue<Box2dTaskChunk> taskChunks;
    private final CountDownLatch[] countDownLatches = new CountDownLatch[MAX_TASKS];
    private final ClosureObject<Box2d.b2EnqueueTaskCallback> enqueueTaskCallback;
    private final ClosureObject<Box2d.b2FinishTaskCallback> finishTaskCallback;

    private int taskCount = 0;
    private boolean running = true;

    /**
     * This method creates and configures a {@link b2WorldDef} to use a newly created {@link Box2dWorldTaskSystem}
     *
     * After the world is destroyed, {@link Box2dWorldTaskSystem#dispose()} needs to be called.
     *
     * @param worldDef The world to configure
     * @param numWorkers The amount of worker
     * @return The created {@link Box2dWorldTaskSystem}
     */
    public static Box2dWorldTaskSystem createForWorld(b2WorldDef worldDef, int numWorkers) {
        Box2dWorldTaskSystem multiThreader = new Box2dWorldTaskSystem(numWorkers);
        multiThreader.configureForWorld(worldDef);
        return multiThreader;
    }

    private Box2dWorldTaskSystem(int numWorkers) {
        if (numWorkers <= 1)
            throw new IllegalArgumentException("Number of workers must be greater than 1");
        this.numWorkers = numWorkers;
        this.workers = new Thread[numWorkers];
        this.taskChunks = new ArrayBlockingQueue<>(MAX_TASKS * numWorkers);

        for (int i = 0; i < numWorkers; i++) {
            final int workerId = i;
            workers[i] = new Thread(() -> {
               while (running) {
                   try {
                       Box2dTaskChunk task = taskChunks.take();
                       try {
                           task.execute(workerId);
                       } finally {
                           countDownLatches[task.taskIndex].countDown();
                       }
                   } catch (InterruptedException e) {
                       break;
                   }
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

                countDownLatches[taskCount] = new CountDownLatch(numTasks);

                int start = 0;
                for (int i = 0; i < numTasks; i++) {
                    int itemsInThisTask = baseItemsPerTask + (i < remainingItems ? 1 : 0);
                    int end = start + itemsInThisTask;

                    Box2dTaskChunk box2DTaskChunk = new Box2dTaskChunk(taskCount, task, start, end, taskContext);
                    if (!taskChunks.offer(box2DTaskChunk))
                        throw new IllegalStateException("Task queue is full - impossible");
                    start = end;
                }

                VoidPointer taskIndex = new VoidPointer(taskCount + 1, false);
                taskCount++;
                return taskIndex;
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
                countDownLatches[taskId] = null;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
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
        private final int taskIndex;
        private final ClosureObject<Box2d.b2TaskCallback> task;
        private final int start;
        private final int end;
        private final VoidPointer taskContext;

        public Box2dTaskChunk(int taskIndex, ClosureObject<Box2d.b2TaskCallback> task, int start, int end, VoidPointer taskContext) {
            this.taskIndex = taskIndex;
            this.task = task;
            this.start = start;
            this.end = end;
            this.taskContext = taskContext;
        }

        public void execute(int workerId) {
            task.getClosure().b2TaskCallback_call(start, end, workerId, taskContext);
        }
    }
}
