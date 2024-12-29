package com.badlogic.gdx.box2d.test;

import com.badlogic.gdx.box2d.Box2d;
import com.badlogic.gdx.box2d.enums.b2BodyType;
import com.badlogic.gdx.box2d.structs.b2BodyDef;
import com.badlogic.gdx.box2d.structs.b2BodyId;
import com.badlogic.gdx.box2d.structs.b2Polygon;
import com.badlogic.gdx.box2d.structs.b2Rot;
import com.badlogic.gdx.box2d.structs.b2ShapeDef;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.box2d.structs.b2WorldDef;
import com.badlogic.gdx.box2d.structs.b2WorldId;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import static com.badlogic.gdx.box2d.Box2d.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Box2dMultithreadTest {

    private static final int e_maxTasks = 128;
    private static final int e_columns = 10;
    private static final int e_rows = 10;
    private static final int e_count = e_columns * e_rows;

    public static void tiltedStacks(int testIndex, int workerCount, b2Vec2[][] finalPositions, b2Rot[][] finalRotations) {

        AtomicInteger taskCount = new AtomicInteger(0);
        HashMap<Long, List<Future<Void>>> userTasks = new HashMap<>();
        ConcurrentHashMap<Long, Integer> threadToWorkerIndex = new ConcurrentHashMap<>();

        AtomicInteger nextWorkerIndex = new AtomicInteger(0);
        ThreadFactory threadFactory = r -> {
            Thread thread = new Thread(r);
            threadToWorkerIndex.put(thread.getId(), nextWorkerIndex.getAndIncrement());
            return thread;
        };

        ExecutorService executor = Executors.newFixedThreadPool(workerCount, threadFactory);

        ClosureObject<Box2d.b2EnqueueTaskCallback> enqueueTask = ClosureObject.fromClosure((box2dTask, itemCount, minRange, box2dContext, userContext) -> {
            if (taskCount.get() < e_maxTasks) {

                int numTasks = Math.min(workerCount, (itemCount + minRange - 1) / minRange);
                int baseItemsPerTask = itemCount / numTasks;
                int remainingItems = itemCount % numTasks;

                List<Future<Void>> tasks = new ArrayList<>(numTasks);

                for (int i = 0; i < numTasks; i++) {
                    int start = i * baseItemsPerTask + Math.min(i, remainingItems);
                    int end = (i + 1) * baseItemsPerTask + Math.min(i + 1, remainingItems);

                    tasks.add(executor.submit(() -> {
                        box2dTask.getClosure().b2TaskCallback_call(start, end, threadToWorkerIndex.get(Thread.currentThread().getId()), box2dContext);
                        return null;
                    }));
                }

                VoidPointer voidPointer = new VoidPointer(taskCount.incrementAndGet(), false);

                userTasks.put(voidPointer.getPointer(), tasks);
                return voidPointer;
            } else {
                box2dTask.getClosure().b2TaskCallback_call(0, itemCount, 0, box2dContext);
                return VoidPointer.NULL;
            }
        });

        ClosureObject<Box2d.b2FinishTaskCallback> finishTask = ClosureObject.fromClosure((userTask, userContext) -> {
            try {
                for (Future<Void> task : userTasks.get(userTask.getPointer())) {
                    task.get();
                }
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        });

        b2WorldDef worldDef = b2DefaultWorldDef();
        worldDef.enqueueTask(enqueueTask);
        worldDef.finishTask(finishTask);
        worldDef.workerCount(workerCount);
        worldDef.enableSleep(false);

        b2WorldId worldId = b2CreateWorld(worldDef.asPointer());
        b2BodyId[] bodies = new b2BodyId[e_count];

        {
            b2BodyDef bd = b2DefaultBodyDef();
            bd.position().x(0.0f);
            bd.position().y(-1.0f);
            b2BodyId groundId = b2CreateBody(worldId, bd.asPointer());

            b2Polygon box = b2MakeBox(1000.0f, 1.0f);
            b2ShapeDef sd = b2DefaultShapeDef();
            b2CreatePolygonShape(groundId, sd.asPointer(), box.asPointer());
        }

        b2Polygon box = b2MakeRoundedBox(0.45f, 0.45f, 0.05f);
        b2ShapeDef sd = b2DefaultShapeDef();
        sd.density(1.0f);
        sd.friction(0.3f);

        float offset = 0.2f;
        float dx = 5.0f;
        float xroot = -0.5f * dx * (e_columns - 1.0f);

        for (int j = 0; j < e_columns; ++j) {
            float x = xroot + j * dx;
            for (int i = 0; i < e_rows; ++i) {
                b2BodyDef bd = b2DefaultBodyDef();
                bd.type(b2BodyType.b2_dynamicBody);
                int n = j * e_rows + i;
                bd.position().x(x + offset * i);
                bd.position().y(0.5f + 1.0f * i);

                b2BodyId bodyId = b2CreateBody(worldId, bd.asPointer());
                bodies[n] = bodyId;
                b2CreatePolygonShape(bodyId, sd.asPointer(), box.asPointer());
            }
        }

        float timeStep = 1.0f / 60.0f;
        int subStepCount = 3;
        for (int i = 0; i < 100; ++i) {
            b2World_Step(worldId, timeStep, subStepCount);
            taskCount.set(0);
        }

        for (int i = 0; i < e_count; ++i) {
            finalPositions[testIndex][i] = b2Body_GetPosition(bodies[i]);
            finalRotations[testIndex][i] = b2Body_GetRotation(bodies[i]);
        }

        b2DestroyWorld(worldId);

        executor.shutdown();
        try {
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        finishTask.free();
        enqueueTask.free();
    }

    // Test multithreaded determinism
    @Test
    public void MultithreadingTest() {

        Box2d.initialize();

        b2Vec2[][] finalPositions = new b2Vec2[2][e_count];
        b2Rot[][] finalRotations = new b2Rot[2][e_count];
        // Test with 4 threads
        tiltedStacks(0, 4, finalPositions, finalRotations);
        // Test with 1 thread
        tiltedStacks(1, 1, finalPositions, finalRotations);

        // Both runs should produce identical results
        for (int i = 0; i < e_count; ++i) {
            b2Vec2 p1 = finalPositions[0][i];
            b2Vec2 p2 = finalPositions[1][i];
            b2Rot rot1 = finalRotations[0][i];
            b2Rot rot2 = finalRotations[1][i];

            assertEquals(p1.x(), p2.x());
            assertEquals(p1.y(), p2.y());
            assertEquals(rot1.c(), rot2.c());
            assertEquals(rot1.s(), rot2.s());
        }
    }
}
