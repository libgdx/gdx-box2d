package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import com.badlogic.gdx.box2d.structs.b2AABB;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.jnigen.runtime.closure.Closure;
import com.badlogic.gdx.box2d.Box2d_Internal.b2DebugDraw_Internal.DrawPolygon_Internal;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.box2d.enums.b2HexColor;
import com.badlogic.gdx.box2d.Box2d_Internal.b2DebugDraw_Internal.DrawSolidPolygon_Internal;
import com.badlogic.gdx.box2d.structs.b2Transform;
import com.badlogic.gdx.box2d.Box2d_Internal.b2DebugDraw_Internal.DrawCircle_Internal;
import com.badlogic.gdx.box2d.Box2d_Internal.b2DebugDraw_Internal.DrawSolidCircle_Internal;
import com.badlogic.gdx.box2d.Box2d_Internal.b2DebugDraw_Internal.DrawSolidCapsule_Internal;
import com.badlogic.gdx.box2d.Box2d_Internal.b2DebugDraw_Internal.DrawSegment_Internal;
import com.badlogic.gdx.box2d.Box2d_Internal.b2DebugDraw_Internal.DrawTransform_Internal;
import com.badlogic.gdx.box2d.Box2d_Internal.b2DebugDraw_Internal.DrawPoint_Internal;
import com.badlogic.gdx.box2d.Box2d_Internal.b2DebugDraw_Internal.DrawString_Internal;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.BytePointer;

/**
 * This struct holds callbacks you can implement to draw a Box2D world.
 * This structure should be zero initialized.
 * @ingroup world
 */
public final class b2DebugDraw extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(29).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2DebugDraw(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2DebugDraw() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2DebugDraw.b2DebugDrawPointer asPointer() {
        return new b2DebugDraw.b2DebugDrawPointer(getPointer(), false, this);
    }

    /**
     * Draw a closed polygon provided in CCW order.
     */
    public ClosureObject<DrawPolygon> DrawPolygon() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(0), DrawPolygon_Internal::DrawPolygon_downcall);
    }

    /**
     * Draw a closed polygon provided in CCW order.
     */
    public void DrawPolygon(ClosureObject<DrawPolygon> DrawPolygon) {
        getBufPtr().setNativePointer(0, DrawPolygon.getPointer());
    }

    /**
     * Draw a solid closed polygon provided in CCW order.
     */
    public ClosureObject<DrawSolidPolygon> DrawSolidPolygon() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 4 : 8), DrawSolidPolygon_Internal::DrawSolidPolygon_downcall);
    }

    /**
     * Draw a solid closed polygon provided in CCW order.
     */
    public void DrawSolidPolygon(ClosureObject<DrawSolidPolygon> DrawSolidPolygon) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 4 : 8, DrawSolidPolygon.getPointer());
    }

    /**
     * Draw a circle.
     */
    public ClosureObject<DrawCircle> DrawCircle() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 8 : 16), DrawCircle_Internal::DrawCircle_downcall);
    }

    /**
     * Draw a circle.
     */
    public void DrawCircle(ClosureObject<DrawCircle> DrawCircle) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 8 : 16, DrawCircle.getPointer());
    }

    /**
     * Draw a solid circle.
     */
    public ClosureObject<DrawSolidCircle> DrawSolidCircle() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 12 : 24), DrawSolidCircle_Internal::DrawSolidCircle_downcall);
    }

    /**
     * Draw a solid circle.
     */
    public void DrawSolidCircle(ClosureObject<DrawSolidCircle> DrawSolidCircle) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 12 : 24, DrawSolidCircle.getPointer());
    }

    /**
     * Draw a solid capsule.
     */
    public ClosureObject<DrawSolidCapsule> DrawSolidCapsule() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 16 : 32), DrawSolidCapsule_Internal::DrawSolidCapsule_downcall);
    }

    /**
     * Draw a solid capsule.
     */
    public void DrawSolidCapsule(ClosureObject<DrawSolidCapsule> DrawSolidCapsule) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 16 : 32, DrawSolidCapsule.getPointer());
    }

    /**
     * Draw a line segment.
     */
    public ClosureObject<DrawSegment> DrawSegment() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 20 : 40), DrawSegment_Internal::DrawSegment_downcall);
    }

    /**
     * Draw a line segment.
     */
    public void DrawSegment(ClosureObject<DrawSegment> DrawSegment) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 20 : 40, DrawSegment.getPointer());
    }

    /**
     * Draw a transform. Choose your own length scale.
     */
    public ClosureObject<DrawTransform> DrawTransform() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 24 : 48), DrawTransform_Internal::DrawTransform_downcall);
    }

    /**
     * Draw a transform. Choose your own length scale.
     */
    public void DrawTransform(ClosureObject<DrawTransform> DrawTransform) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 24 : 48, DrawTransform.getPointer());
    }

    /**
     * Draw a point.
     */
    public ClosureObject<DrawPoint> DrawPoint() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 28 : 56), DrawPoint_Internal::DrawPoint_downcall);
    }

    /**
     * Draw a point.
     */
    public void DrawPoint(ClosureObject<DrawPoint> DrawPoint) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 28 : 56, DrawPoint.getPointer());
    }

    /**
     * Draw a string in world space
     */
    public ClosureObject<DrawString> DrawString() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 32 : 64), DrawString_Internal::DrawString_downcall);
    }

    /**
     * Draw a string in world space
     */
    public void DrawString(ClosureObject<DrawString> DrawString) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 32 : 64, DrawString.getPointer());
    }

    /**
     * Bounds to use if restricting drawing to a rectangular region
     */
    public b2AABB drawingBounds() {
        return __drawingBounds;
    }

    private static final int __drawingBounds_offset = CHandler.IS_32_BIT ? 36 : 72;

    private final b2AABB __drawingBounds = new b2AABB(getPointer() + __drawingBounds_offset, false);

    /**
     * Option to restrict drawing to a rectangular region. May suffer from unstable depth sorting.
     */
    public boolean useDrawingBounds() {
        return getBufPtr().getBoolean(CHandler.IS_32_BIT ? 52 : 88);
    }

    /**
     * Option to restrict drawing to a rectangular region. May suffer from unstable depth sorting.
     */
    public void useDrawingBounds(boolean useDrawingBounds) {
        getBufPtr().setBoolean(CHandler.IS_32_BIT ? 52 : 88, useDrawingBounds);
    }

    /**
     * Option to draw shapes
     */
    public boolean drawShapes() {
        return getBufPtr().getBoolean(CHandler.IS_32_BIT ? 53 : 89);
    }

    /**
     * Option to draw shapes
     */
    public void drawShapes(boolean drawShapes) {
        getBufPtr().setBoolean(CHandler.IS_32_BIT ? 53 : 89, drawShapes);
    }

    /**
     * Option to draw joints
     */
    public boolean drawJoints() {
        return getBufPtr().getBoolean(CHandler.IS_32_BIT ? 54 : 90);
    }

    /**
     * Option to draw joints
     */
    public void drawJoints(boolean drawJoints) {
        getBufPtr().setBoolean(CHandler.IS_32_BIT ? 54 : 90, drawJoints);
    }

    /**
     * Option to draw additional information for joints
     */
    public boolean drawJointExtras() {
        return getBufPtr().getBoolean(CHandler.IS_32_BIT ? 55 : 91);
    }

    /**
     * Option to draw additional information for joints
     */
    public void drawJointExtras(boolean drawJointExtras) {
        getBufPtr().setBoolean(CHandler.IS_32_BIT ? 55 : 91, drawJointExtras);
    }

    /**
     * Option to draw the bounding boxes for shapes
     */
    public boolean drawAABBs() {
        return getBufPtr().getBoolean(CHandler.IS_32_BIT ? 56 : 92);
    }

    /**
     * Option to draw the bounding boxes for shapes
     */
    public void drawAABBs(boolean drawAABBs) {
        getBufPtr().setBoolean(CHandler.IS_32_BIT ? 56 : 92, drawAABBs);
    }

    /**
     * Option to draw the mass and center of mass of dynamic bodies
     */
    public boolean drawMass() {
        return getBufPtr().getBoolean(CHandler.IS_32_BIT ? 57 : 93);
    }

    /**
     * Option to draw the mass and center of mass of dynamic bodies
     */
    public void drawMass(boolean drawMass) {
        getBufPtr().setBoolean(CHandler.IS_32_BIT ? 57 : 93, drawMass);
    }

    /**
     * Option to draw body names
     */
    public boolean drawBodyNames() {
        return getBufPtr().getBoolean(CHandler.IS_32_BIT ? 58 : 94);
    }

    /**
     * Option to draw body names
     */
    public void drawBodyNames(boolean drawBodyNames) {
        getBufPtr().setBoolean(CHandler.IS_32_BIT ? 58 : 94, drawBodyNames);
    }

    /**
     * Option to draw contact points
     */
    public boolean drawContacts() {
        return getBufPtr().getBoolean(CHandler.IS_32_BIT ? 59 : 95);
    }

    /**
     * Option to draw contact points
     */
    public void drawContacts(boolean drawContacts) {
        getBufPtr().setBoolean(CHandler.IS_32_BIT ? 59 : 95, drawContacts);
    }

    /**
     * Option to visualize the graph coloring used for contacts and joints
     */
    public boolean drawGraphColors() {
        return getBufPtr().getBoolean(CHandler.IS_32_BIT ? 60 : 96);
    }

    /**
     * Option to visualize the graph coloring used for contacts and joints
     */
    public void drawGraphColors(boolean drawGraphColors) {
        getBufPtr().setBoolean(CHandler.IS_32_BIT ? 60 : 96, drawGraphColors);
    }

    /**
     * Option to draw contact normals
     */
    public boolean drawContactNormals() {
        return getBufPtr().getBoolean(CHandler.IS_32_BIT ? 61 : 97);
    }

    /**
     * Option to draw contact normals
     */
    public void drawContactNormals(boolean drawContactNormals) {
        getBufPtr().setBoolean(CHandler.IS_32_BIT ? 61 : 97, drawContactNormals);
    }

    /**
     * Option to draw contact normal impulses
     */
    public boolean drawContactImpulses() {
        return getBufPtr().getBoolean(CHandler.IS_32_BIT ? 62 : 98);
    }

    /**
     * Option to draw contact normal impulses
     */
    public void drawContactImpulses(boolean drawContactImpulses) {
        getBufPtr().setBoolean(CHandler.IS_32_BIT ? 62 : 98, drawContactImpulses);
    }

    /**
     * Option to draw contact friction impulses
     */
    public boolean drawFrictionImpulses() {
        return getBufPtr().getBoolean(CHandler.IS_32_BIT ? 63 : 99);
    }

    /**
     * Option to draw contact friction impulses
     */
    public void drawFrictionImpulses(boolean drawFrictionImpulses) {
        getBufPtr().setBoolean(CHandler.IS_32_BIT ? 63 : 99, drawFrictionImpulses);
    }

    /**
     * User context that is passed as an argument to drawing callback functions
     */
    public VoidPointer context() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 64 : 104), false);
    }

    /**
     * User context that is passed as an argument to drawing callback functions
     */
    public void context(VoidPointer context) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 64 : 104, context.getPointer());
    }

    public static final class b2DebugDrawPointer extends StackElementPointer<b2DebugDraw> {

        public b2DebugDrawPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2DebugDrawPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2DebugDrawPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2DebugDrawPointer() {
            this(1, true);
        }

        public b2DebugDrawPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2DebugDraw createStackElement(long ptr, boolean freeOnGC) {
            return new b2DebugDraw(ptr, freeOnGC);
        }
    }

    public interface DrawPolygon extends Closure, DrawPolygon_Internal {

        /**
         * Draw a closed polygon provided in CCW order.
         */
        void DrawPolygon_call(b2Vec2.b2Vec2Pointer vertices, int vertexCount, b2HexColor color, VoidPointer context);
    }

    public interface DrawSolidPolygon extends Closure, DrawSolidPolygon_Internal {

        /**
         * Draw a solid closed polygon provided in CCW order.
         */
        void DrawSolidPolygon_call(b2Transform transform, b2Vec2.b2Vec2Pointer vertices, int vertexCount, float radius, b2HexColor color, VoidPointer context);
    }

    public interface DrawCircle extends Closure, DrawCircle_Internal {

        /**
         * Draw a circle.
         */
        void DrawCircle_call(b2Vec2 center, float radius, b2HexColor color, VoidPointer context);
    }

    public interface DrawSolidCircle extends Closure, DrawSolidCircle_Internal {

        /**
         * Draw a solid circle.
         */
        void DrawSolidCircle_call(b2Transform transform, float radius, b2HexColor color, VoidPointer context);
    }

    public interface DrawSolidCapsule extends Closure, DrawSolidCapsule_Internal {

        /**
         * Draw a solid capsule.
         */
        void DrawSolidCapsule_call(b2Vec2 p1, b2Vec2 p2, float radius, b2HexColor color, VoidPointer context);
    }

    public interface DrawSegment extends Closure, DrawSegment_Internal {

        /**
         * Draw a line segment.
         */
        void DrawSegment_call(b2Vec2 p1, b2Vec2 p2, b2HexColor color, VoidPointer context);
    }

    public interface DrawTransform extends Closure, DrawTransform_Internal {

        /**
         * Draw a transform. Choose your own length scale.
         */
        void DrawTransform_call(b2Transform transform, VoidPointer context);
    }

    public interface DrawPoint extends Closure, DrawPoint_Internal {

        /**
         * Draw a point.
         */
        void DrawPoint_call(b2Vec2 p, float size, b2HexColor color, VoidPointer context);
    }

    public interface DrawString extends Closure, DrawString_Internal {

        /**
         * Draw a string in world space
         */
        void DrawString_call(b2Vec2 p, BytePointer s, b2HexColor color, VoidPointer context);
    }
}
