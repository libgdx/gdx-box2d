package com.badlogic.gdx.box2d.utils.test;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.badlogic.gdx.box2d.Box2d;
import com.badlogic.gdx.box2d.enums.b2BodyType;
import com.badlogic.gdx.box2d.structs.*;
import com.badlogic.gdx.box2d.utils.Box2dDebugRenderer;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.TimeUtils;

import static com.badlogic.gdx.box2d.Box2d.*;

public class Box2dDebugRendererTest extends ApplicationAdapter {

    private static final int e_columns = 100;
    private static final int e_rows = 100;

    private Box2dDebugRenderer renderer;
    private b2WorldId worldId;
    private OrthographicCamera camera;

    public static void main(String[] args) {
        Lwjgl3ApplicationConfiguration configuration = new Lwjgl3ApplicationConfiguration();
        configuration.useVsync(true);
        configuration.setWindowedMode(640, 480);
        new Lwjgl3Application(new Box2dDebugRendererTest(), configuration);
    }

    @Override
    public void create() {
        Box2d.initialize();

        b2WorldDef worldDef = b2DefaultWorldDef();
        worldId = b2CreateWorld(worldDef.asPointer());

        b2BodyDef bd = b2DefaultBodyDef();
        bd.position().x(0.0f);
        bd.position().y(-1.0f);
        b2BodyId groundId = b2CreateBody(worldId, bd.asPointer());

        b2Polygon box = b2MakeBox(1000.0f, 1.0f);
        b2ShapeDef sd = b2DefaultShapeDef();
        b2CreatePolygonShape(groundId, sd.asPointer(), box.asPointer());

        b2Polygon roundedBox = b2MakeRoundedBox(0.45f, 0.45f, 0.05f);
        b2ShapeDef roundedSd = b2DefaultShapeDef();
        roundedSd.density(1.0f);
        roundedSd.friction(0.3f);

        float offset = 0.2f;
        float dx = 5.0f;
        float xroot = -0.5f * dx * (e_columns - 1.0f);

        for (int j = 0; j < e_columns; ++j) {
            float x = xroot + j * dx;
            for (int i = 0; i < e_rows; ++i) {
                b2BodyDef dynamicBd = b2DefaultBodyDef();
                dynamicBd.type(b2BodyType.b2_dynamicBody);
                dynamicBd.position().x(x + offset * i);
                dynamicBd.position().y(0.5f + 1.0f * i);

                b2BodyId bodyId = b2CreateBody(worldId, dynamicBd.asPointer());
                b2CreatePolygonShape(bodyId, roundedSd.asPointer(), roundedBox.asPointer());
            }
        }

        renderer = new Box2dDebugRenderer();
        renderer.getB2DebugDraw().drawShapes(true);

        camera = new OrthographicCamera(48, 32);
        camera.position.set(0, 15, 0);
    }

    @Override
    public void render() {
        long startTime = TimeUtils.nanoTime();
        b2World_Step(worldId, 1 / 60f, 4);
        float updateTime = (TimeUtils.nanoTime() - startTime) / 1_000_000.0f;

        startTime = TimeUtils.nanoTime();
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera.update();

        renderer.render(worldId, camera.combined);
        float renderTime = (TimeUtils.nanoTime() - startTime) / 1_000_000.0f;

        System.out.println("fps:" + Gdx.graphics.getFramesPerSecond() + ", update: " + updateTime + "ms, render: " + renderTime + "ms");
    }

    @Override
    public void dispose() {
        renderer.dispose();
        b2DestroyWorld(worldId);
    }
}
