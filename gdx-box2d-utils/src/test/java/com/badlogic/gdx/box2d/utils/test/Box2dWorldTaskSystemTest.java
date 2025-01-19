package com.badlogic.gdx.box2d.utils.test;

import com.badlogic.gdx.box2d.Box2d;
import com.badlogic.gdx.box2d.enums.b2BodyType;
import com.badlogic.gdx.box2d.structs.*;
import com.badlogic.gdx.box2d.utils.Box2dWorldTaskSystem;
import org.junit.jupiter.api.Test;

import static com.badlogic.gdx.box2d.Box2d.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Box2dWorldTaskSystemTest {

    private static final int e_columns = 10;
    private static final int e_rows = 10;
    private static final int e_count = e_columns * e_rows;

    public static void tiltedStacks(int testIndex, int workerCount, b2Vec2[][] finalPositions, b2Rot[][] finalRotations) {
        b2WorldDef worldDef = b2DefaultWorldDef();
        worldDef.enableSleep(false);

        Box2dWorldTaskSystem multiThreader = null;
        if (workerCount > 1)
            multiThreader = Box2dWorldTaskSystem.createForWorld(worldDef, workerCount);

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
            if (multiThreader != null)
                multiThreader.afterStep();
        }

        for (int i = 0; i < e_count; ++i) {
            finalPositions[testIndex][i] = b2Body_GetPosition(bodies[i]);
            finalRotations[testIndex][i] = b2Body_GetRotation(bodies[i]);
        }

        b2DestroyWorld(worldId);

        if (multiThreader != null)
            multiThreader.dispose();
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
