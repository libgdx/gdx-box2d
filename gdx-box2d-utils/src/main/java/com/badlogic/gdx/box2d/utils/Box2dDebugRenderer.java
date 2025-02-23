package com.badlogic.gdx.box2d.utils;

import com.badlogic.gdx.box2d.enums.b2HexColor;
import com.badlogic.gdx.box2d.structs.b2DebugDraw;
import com.badlogic.gdx.box2d.structs.b2Transform;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.box2d.structs.b2WorldId;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import com.badlogic.gdx.jnigen.runtime.pointer.CSizedIntPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.utils.Disposable;

import static com.badlogic.gdx.box2d.Box2d.b2DefaultDebugDraw;
import static com.badlogic.gdx.box2d.Box2d.b2World_Draw;

public class Box2dDebugRenderer implements Disposable {

    private final ShapeRenderer renderer;

    private final b2DebugDraw b2DebugDraw;

    public Box2dDebugRenderer () {
        renderer = new ShapeRenderer();
        renderer.setAutoShapeType(true);
        b2DebugDraw = b2DefaultDebugDraw();
        b2DebugDraw.DrawPolygon(ClosureObject.fromClosure(this::drawPolygon));
        b2DebugDraw.DrawSolidPolygon(ClosureObject.fromClosure(this::drawSolidPolygon));
        b2DebugDraw.DrawCircle(ClosureObject.fromClosure(this::drawCircle));
        b2DebugDraw.DrawSolidCircle(ClosureObject.fromClosure(this::drawSolidCircle));
        b2DebugDraw.DrawSolidCapsule(ClosureObject.fromClosure(this::drawSolidCapsule));
        b2DebugDraw.DrawSegment(ClosureObject.fromClosure(this::drawSegment));
        b2DebugDraw.DrawTransform(ClosureObject.fromClosure(this::drawTransform));
        b2DebugDraw.DrawPoint(ClosureObject.fromClosure(this::drawPoint));
        b2DebugDraw.DrawString(ClosureObject.fromClosure(this::drawString));
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
            b2Vec2 vec2 = vertices.asStackElement(i);
            verticesArray[i * 2] = vec2.x();
            verticesArray[i * 2 + 1] = vec2.y();
        }
        renderer.set(ShapeRenderer.ShapeType.Line);
        Box2dUtils.box2dColorToGDXColor(renderer.getColor(), color);
        renderer.polygon(verticesArray);
    }

    private void drawSolidPolygon(b2Transform transform, b2Vec2.b2Vec2Pointer vertices, int vertexCount, float radius, b2HexColor color, VoidPointer context) {
        float[] verticesArray = new float[vertexCount * 2];

        for (int i = 0; i < vertexCount; i++) {
            b2Vec2 vertex = vertices.asStackElement(i);
            
            float vx = vertex.x();
            float vy = vertex.y();

            float px = transform.p().x();
            float py = transform.p().y();
            float cos = transform.q().c();
            float sin = transform.q().s();

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
        renderer.circle(transform.p().x(), transform.p().y(), radius);
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
        
        float px = transform.p().x();
        float py = transform.p().y();
        float cos = transform.q().c();
        float sin = transform.q().s();
        
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

    private void drawString(b2Vec2 p, CSizedIntPointer s, b2HexColor color, VoidPointer context) {
        // TODO: Implement
    }

    public b2DebugDraw getB2DebugDraw() {
        return b2DebugDraw;
    }

    public void dispose () {
        renderer.dispose();
        b2DebugDraw.DrawPolygon().free();
        b2DebugDraw.DrawSolidPolygon().free();
        b2DebugDraw.DrawCircle().free();
        b2DebugDraw.DrawSolidCircle().free();
        b2DebugDraw.DrawSolidCapsule().free();
        b2DebugDraw.DrawSegment().free();
        b2DebugDraw.DrawTransform().free();
        b2DebugDraw.DrawPoint().free();
        b2DebugDraw.DrawString().free();
    }
}

