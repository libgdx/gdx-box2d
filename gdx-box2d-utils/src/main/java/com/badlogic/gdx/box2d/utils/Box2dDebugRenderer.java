package com.badlogic.gdx.box2d.utils;

import com.badlogic.gdx.box2d.enums.b2HexColor;
import com.badlogic.gdx.box2d.structs.*;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.jnigen.runtime.closure.Closure;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import com.badlogic.gdx.jnigen.runtime.closure.PointingPoolManager;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.BytePointer;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.utils.Disposable;

import static com.badlogic.gdx.box2d.Box2d.b2DefaultDebugDraw;
import static com.badlogic.gdx.box2d.Box2d.b2World_Draw;

public class Box2dDebugRenderer implements Disposable {

    private static final b2Vec2 TEMP_VEC_PTR = new b2Vec2(0L, false);
    private static final b2Rot TEMP_ROT_PTR = new b2Rot(0L, false);

    private final ShapeRenderer renderer;

    private final b2DebugDraw b2DebugDraw;
    private final PointingPoolManager pointingPoolManager;

    public Box2dDebugRenderer () {
        pointingPoolManager = new PointingPoolManager(5);
        pointingPoolManager.addPool(b2Vec2.b2Vec2Pointer::new, 5);
        pointingPoolManager.addPool(VoidPointer::new, 5);
        pointingPoolManager.addPool(b2Transform::new, 5);
        pointingPoolManager.addPool(b2Vec2::new, 5);
        pointingPoolManager.addPool(BytePointer::new, 5);

        renderer = new ShapeRenderer();
        renderer.setAutoShapeType(true);
        b2DebugDraw = b2DefaultDebugDraw();
        b2DebugDraw.DrawPolygonFcn(createPooledClosure(this::drawPolygon));
        b2DebugDraw.DrawSolidPolygonFcn(createPooledClosure(this::drawSolidPolygon));
        b2DebugDraw.DrawCircleFcn(createPooledClosure(this::drawCircle));
        b2DebugDraw.DrawSolidCircleFcn(createPooledClosure(this::drawSolidCircle));
        b2DebugDraw.DrawSolidCapsuleFcn(createPooledClosure(this::drawSolidCapsule));
        b2DebugDraw.DrawSegmentFcn(createPooledClosure(this::drawSegment));
        b2DebugDraw.DrawTransformFcn(createPooledClosure(this::drawTransform));
        b2DebugDraw.DrawPointFcn(createPooledClosure(this::drawPoint));
        b2DebugDraw.DrawStringFcn(createPooledClosure(this::drawString));
    }

    private <T extends Closure> ClosureObject<T> createPooledClosure(T closure) {
        ClosureObject<T> closureObject = ClosureObject.fromClosure(closure);
        closureObject.setPoolManager(pointingPoolManager);
        return closureObject;
    }

    /** This assumes that the projection matrix has already been set. */
    public void render (b2WorldId world, Matrix4 projMatrix) {
        renderer.setProjectionMatrix(projMatrix);
        renderer.begin();
        b2World_Draw(world, b2DebugDraw.asPointer());
        renderer.end();
    }

    private void drawPolygon(b2Vec2.b2Vec2Pointer vertices, int vertexCount, b2HexColor color, VoidPointer context) {

        float[] verticesArray = new float[vertexCount * 2];
        for (int i = 0; i < vertexCount; i++) {
            vertices.asStackElement(i, TEMP_VEC_PTR);
            verticesArray[i * 2] = TEMP_VEC_PTR.x();
            verticesArray[i * 2 + 1] = TEMP_VEC_PTR.y();
        }
        renderer.set(ShapeRenderer.ShapeType.Line);
        Box2dUtils.box2dColorToGDXColor(renderer.getColor(), color);
        renderer.polygon(verticesArray);
    }

    private void drawSolidPolygon(b2Transform transform, b2Vec2.b2Vec2Pointer vertices, int vertexCount, float radius, b2HexColor color, VoidPointer context) {
        float[] verticesArray = new float[vertexCount * 2];

        for (int i = 0; i < vertexCount; i++) {
            vertices.asStackElement(i, TEMP_VEC_PTR);

            float vx = TEMP_VEC_PTR.x();
            float vy = TEMP_VEC_PTR.y();

            transform.p(TEMP_VEC_PTR);
            float px = TEMP_VEC_PTR.x();
            float py = TEMP_VEC_PTR.y();

            transform.q(TEMP_ROT_PTR);
            float cos = TEMP_ROT_PTR.c();
            float sin = TEMP_ROT_PTR.s();

            float x = px + cos * vx - sin * vy;
            float y = py + sin * vx + cos * vy;

            verticesArray[i * 2] = x;
            verticesArray[i * 2 + 1] = y;
        }

        renderer.set(ShapeRenderer.ShapeType.Filled);
        Box2dUtils.box2dColorToGDXColor(renderer.getColor(), color);

        for (int i = 0; i < vertexCount - 2; i++) {
            renderer.triangle(
                    verticesArray[0], verticesArray[1],
                    verticesArray[i*2 + 2], verticesArray[i*2 + 3],
                    verticesArray[i*2 + 4], verticesArray[i*2 + 5]
            );
        }
    }

    private void drawCircle(b2Vec2 center, float radius, b2HexColor color, VoidPointer context) {
        renderer.set(ShapeRenderer.ShapeType.Line);
        Box2dUtils.box2dColorToGDXColor(renderer.getColor(), color);
        renderer.circle(center.x(), center.y(), radius);
    }

    private void drawSolidCircle(b2Transform transform, float radius, b2HexColor color, VoidPointer context) {
        renderer.set(ShapeRenderer.ShapeType.Filled);
        Box2dUtils.box2dColorToGDXColor(renderer.getColor(), color);
        transform.p(TEMP_VEC_PTR);
        renderer.circle(TEMP_VEC_PTR.x(), TEMP_VEC_PTR.y(), radius);
    }

    private void drawSolidCapsule(b2Vec2 p1, b2Vec2 p2, float radius, b2HexColor color, VoidPointer context) {
        // TODO: Implement
    }

    private void drawSegment(b2Vec2 p1, b2Vec2 p2, b2HexColor color, VoidPointer context) {
        renderer.set(ShapeRenderer.ShapeType.Line);
        Box2dUtils.box2dColorToGDXColor(renderer.getColor(), color);
        renderer.line(p1.x(), p1.y(), p2.x(), p2.y());
    }

    private void drawTransform(b2Transform transform, VoidPointer context) {
        float axisScale = 0.4f;

        transform.p(TEMP_VEC_PTR);
        transform.q(TEMP_ROT_PTR);
        float px = TEMP_VEC_PTR.x();
        float py = TEMP_VEC_PTR.y();
        float cos = TEMP_ROT_PTR.c();
        float sin = TEMP_ROT_PTR.s();
        
        renderer.set(ShapeRenderer.ShapeType.Line);
        renderer.setColor(Color.RED);
        renderer.line(
                px, py,
                px + axisScale * cos, py + axisScale * sin
        );

        renderer.setColor(Color.GREEN);
        renderer.line(
                px, py,
                px - axisScale * sin, py + axisScale * cos
        );
    }

    private void drawPoint(b2Vec2 p, float size, b2HexColor color, VoidPointer context) {
        renderer.set(ShapeRenderer.ShapeType.Filled);
        Box2dUtils.box2dColorToGDXColor(renderer.getColor(), color);
        renderer.circle(p.x(), p.y(), size);
    }

    private void drawString(b2Vec2 p, BytePointer s, b2HexColor color, VoidPointer context) {
        // TODO: Implement
    }

    public b2DebugDraw getB2DebugDraw() {
        return b2DebugDraw;
    }

    public void dispose () {
        renderer.dispose();
        b2DebugDraw.DrawPolygonFcn().free();
        b2DebugDraw.DrawSolidPolygonFcn().free();
        b2DebugDraw.DrawCircleFcn().free();
        b2DebugDraw.DrawSolidCircleFcn().free();
        b2DebugDraw.DrawSolidCapsuleFcn().free();
        b2DebugDraw.DrawSegmentFcn().free();
        b2DebugDraw.DrawTransformFcn().free();
        b2DebugDraw.DrawPointFcn().free();
        b2DebugDraw.DrawStringFcn().free();
    }
}

