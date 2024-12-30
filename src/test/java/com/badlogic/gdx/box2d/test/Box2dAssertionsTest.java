package com.badlogic.gdx.box2d.test;

import com.badlogic.gdx.box2d.Box2dAssertionError;
import com.badlogic.gdx.box2d.Box2d;
import com.badlogic.gdx.box2d.structs.b2WorldDef;
import com.badlogic.gdx.box2d.structs.b2WorldId;
import org.junit.jupiter.api.Test;

import static com.badlogic.gdx.box2d.Box2d.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Box2dAssertionsTest {

    @Test
    public void testAssertionThrowToJava () {
        Box2d.initialize();

        b2WorldDef worldDef = b2DefaultWorldDef();
        b2WorldId worldId = b2CreateWorld(worldDef.asPointer());
        char worldIndex = worldId.index1();

        // We set an invalid index which will throw an assertion error when stepping
        worldId.index1((char)0);

        assertThrows(Box2dAssertionError.class, () -> b2World_Step(worldId, 1/60f, 4));

        // Reset and clean up
        worldId.index1(worldIndex);
        b2DestroyWorld(worldId);
    }
}
