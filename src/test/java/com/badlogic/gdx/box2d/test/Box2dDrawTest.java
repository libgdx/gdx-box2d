package com.badlogic.gdx.box2d.test;

import com.badlogic.gdx.box2d.Box2d;
import com.badlogic.gdx.box2d.enums.b2BodyType;
import com.badlogic.gdx.box2d.structs.b2BodyDef;
import com.badlogic.gdx.box2d.structs.b2BodyId;
import com.badlogic.gdx.box2d.structs.b2DebugDraw;
import com.badlogic.gdx.box2d.structs.b2Polygon;
import com.badlogic.gdx.box2d.structs.b2ShapeDef;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.box2d.structs.b2WorldDef;
import com.badlogic.gdx.box2d.structs.b2WorldId;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

import static com.badlogic.gdx.box2d.Box2d.*;

public class Box2dDrawTest {

    private static final int e_columns = 100;
    private static final int e_rows = 100;

    public static void main (String[] args) {
        Box2d.initialize();

        b2WorldDef worldDef = b2DefaultWorldDef();
        b2WorldId worldId = b2CreateWorld(worldDef.asPointer());

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
                bd.position().x(x + offset * i);
                bd.position().y(0.5f + 1.0f * i);

                b2BodyId bodyId = b2CreateBody(worldId, bd.asPointer());
                b2CreatePolygonShape(bodyId, sd.asPointer(), box.asPointer());
            }
        }


        startLoop(worldId);
    }

    public static void startLoop(b2WorldId worldId) {
        JFrame frame = new JFrame("Example");
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        Canvas canvas = new Canvas();
        frame.add(canvas);
        canvas.createBufferStrategy(2);

        b2DebugDraw draw = b2DefaultDebugDraw();
        draw.drawAABBs(true);

        draw.DrawPolygon(ClosureObject.fromClosure((vertices, vertexCount, color, context) -> {
            BufferStrategy bs = canvas.getBufferStrategy();
            Graphics g = bs.getDrawGraphics();


            Polygon polygon = new Polygon();
            for (int i = 0; i < vertexCount; i++) {
                b2Vec2 vec2 = vertices.asStackElement(i);
                polygon.addPoint((int)vec2.x() * 10, (int)vec2.y() * 10);
            }

            g.setColor(new Color(color.getIndex()));
            g.drawPolygon(polygon);

        }));

        Timer timer = new Timer(1000 / 60, e -> {
            float timeStep = 1.0f / 60.0f;
            int subStepCount = 4;
            b2World_Step(worldId, timeStep, subStepCount);

            BufferStrategy bs = canvas.getBufferStrategy();
            Graphics g = bs.getDrawGraphics();
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

            b2World_Draw(worldId, draw.asPointer());

            g.dispose();
            bs.show();
        });

        timer.start();
    }
}
