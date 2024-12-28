package com.badlogic.gdx.box2d.test;

import com.badlogic.gdx.box2d.Box2d;
import com.badlogic.gdx.box2d.structs.*;
import com.badlogic.gdx.box2d.enums.*;

import org.junit.jupiter.api.Test;

import static com.badlogic.gdx.box2d.Box2d.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Box2dHelloWorldTest {

    @Test
    public void testBox2dHelloWorldSample() {
        // Ported from https://github.com/erincatto/box2d/blob/f377034920c42a26cd498c0a0b1b2e9f2b064989/test/test_world.c
        Box2d.initialize();

        // Construct a world object, which will hold and simulate the rigid bodies.
        b2WorldDef worldDef = b2DefaultWorldDef();
        worldDef.gravity().x(0.0f);
        worldDef.gravity().y(-10.0f);

        b2WorldId worldId = b2CreateWorld(worldDef.asPointer());
        assertTrue(b2World_IsValid(worldId));

        // Define the ground body.
        b2BodyDef groundBodyDef = b2DefaultBodyDef();
        groundBodyDef.position().x(0.0f);
        groundBodyDef.position().y(-10.0f);

        // Call the body factory which allocates memory for the ground body
        // from a pool and creates the ground box shape (also from a pool).
        // The body is also added to the world.
        b2BodyId groundId = b2CreateBody(worldId, groundBodyDef.asPointer());
        assertTrue(b2Body_IsValid(groundId));

        // Define the ground box shape. The extents are the half-widths of the box.
        b2Polygon groundBox = b2MakeBox(50.0f, 10.0f);

        // Add the box shape to the ground body.
        b2ShapeDef groundShapeDef = b2DefaultShapeDef();
        b2CreatePolygonShape(groundId, groundShapeDef.asPointer(), groundBox.asPointer());

        // Define the dynamic body. We set its position and call the body factory.
        b2BodyDef bodyDef = b2DefaultBodyDef();
        bodyDef.type(b2BodyType.b2_dynamicBody);
        bodyDef.position().x(0.0f);
        bodyDef.position().y(4.0f);

        b2BodyId bodyId = b2CreateBody(worldId, bodyDef.asPointer());

        // Define another box shape for our dynamic body.
        b2Polygon dynamicBox = b2MakeBox(1.0f, 1.0f);

        // Define the dynamic body shape
        b2ShapeDef shapeDef = b2DefaultShapeDef();

        // Set the box density to be non-zero, so it will be dynamic.
        shapeDef.density(1.0f);

        // Override the default friction.
        shapeDef.friction(0.3f);

        // Add the shape to the body.
        b2CreatePolygonShape(bodyId, shapeDef.asPointer(), dynamicBox.asPointer());

        // Prepare for simulation. Typically we use a time step of 1/60 of a
        // second (60Hz) and 4 sub-steps. This provides a high quality simulation
        // in most game scenarios.
        float timeStep = 1.0f / 60.0f;
        int subStepCount = 4;

        b2Vec2 position = b2Body_GetPosition(bodyId);
        b2Rot rotation = b2Body_GetRotation(bodyId);

        // This is our little game loop.
        for (int i = 0; i < 90; i++) {

            // Instruct the world to perform a single step of simulation.
            // It is generally best to keep the time step and iterations fixed.
            b2World_Step(worldId, timeStep, subStepCount);

            // Now print the position and angle of the body.
            position = b2Body_GetPosition(bodyId);
            rotation = b2Body_GetRotation(bodyId);

            //System.out.println("x: " + position.x() + " y: " + position.y() + " rotation: " + b2Rot_GetAngle(rotation));
        }

        // When the world destructor is called, all bodies and joints are freed. This can
        // create orphaned ids, so be careful about your world management.
        b2DestroyWorld(worldId);

        assertTrue(position.x() < 0.01f);
        assertTrue(position.y() - 1.0f < 0.01f);
        assertTrue(b2Rot_GetAngle(rotation) < 0.01f);
    }
}
