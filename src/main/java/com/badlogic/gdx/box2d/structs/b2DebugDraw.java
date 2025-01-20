package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
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
import com.badlogic.gdx.jnigen.runtime.pointer.CSizedIntPointer;

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
        return new b2DebugDraw.b2DebugDrawPointer(getPointer(), getsGCFreed());
    }

    /**
     * Draw a closed polygon provided in CCW order.
     */
    public ClosureObject<DrawPolygon> DrawPolygon() {
        return CHandler.getClosureObject(getValue(0), DrawPolygon_Internal::DrawPolygon_downcall);
    }

    /**
     * Draw a closed polygon provided in CCW order.
     */
    public void DrawPolygon(ClosureObject<DrawPolygon> DrawPolygon) {
        setValue(DrawPolygon.getPointer(), 0);
    }

    /**
     * Draw a solid closed polygon provided in CCW order.
     */
    public ClosureObject<DrawSolidPolygon> DrawSolidPolygon() {
        return CHandler.getClosureObject(getValue(1), DrawSolidPolygon_Internal::DrawSolidPolygon_downcall);
    }

    /**
     * Draw a solid closed polygon provided in CCW order.
     */
    public void DrawSolidPolygon(ClosureObject<DrawSolidPolygon> DrawSolidPolygon) {
        setValue(DrawSolidPolygon.getPointer(), 1);
    }

    /**
     * Draw a circle.
     */
    public ClosureObject<DrawCircle> DrawCircle() {
        return CHandler.getClosureObject(getValue(2), DrawCircle_Internal::DrawCircle_downcall);
    }

    /**
     * Draw a circle.
     */
    public void DrawCircle(ClosureObject<DrawCircle> DrawCircle) {
        setValue(DrawCircle.getPointer(), 2);
    }

    /**
     * Draw a solid circle.
     */
    public ClosureObject<DrawSolidCircle> DrawSolidCircle() {
        return CHandler.getClosureObject(getValue(3), DrawSolidCircle_Internal::DrawSolidCircle_downcall);
    }

    /**
     * Draw a solid circle.
     */
    public void DrawSolidCircle(ClosureObject<DrawSolidCircle> DrawSolidCircle) {
        setValue(DrawSolidCircle.getPointer(), 3);
    }

    /**
     * Draw a solid capsule.
     */
    public ClosureObject<DrawSolidCapsule> DrawSolidCapsule() {
        return CHandler.getClosureObject(getValue(4), DrawSolidCapsule_Internal::DrawSolidCapsule_downcall);
    }

    /**
     * Draw a solid capsule.
     */
    public void DrawSolidCapsule(ClosureObject<DrawSolidCapsule> DrawSolidCapsule) {
        setValue(DrawSolidCapsule.getPointer(), 4);
    }

    /**
     * Draw a line segment.
     */
    public ClosureObject<DrawSegment> DrawSegment() {
        return CHandler.getClosureObject(getValue(5), DrawSegment_Internal::DrawSegment_downcall);
    }

    /**
     * Draw a line segment.
     */
    public void DrawSegment(ClosureObject<DrawSegment> DrawSegment) {
        setValue(DrawSegment.getPointer(), 5);
    }

    /**
     * Draw a transform. Choose your own length scale.
     */
    public ClosureObject<DrawTransform> DrawTransform() {
        return CHandler.getClosureObject(getValue(6), DrawTransform_Internal::DrawTransform_downcall);
    }

    /**
     * Draw a transform. Choose your own length scale.
     */
    public void DrawTransform(ClosureObject<DrawTransform> DrawTransform) {
        setValue(DrawTransform.getPointer(), 6);
    }

    /**
     * Draw a point.
     */
    public ClosureObject<DrawPoint> DrawPoint() {
        return CHandler.getClosureObject(getValue(7), DrawPoint_Internal::DrawPoint_downcall);
    }

    /**
     * Draw a point.
     */
    public void DrawPoint(ClosureObject<DrawPoint> DrawPoint) {
        setValue(DrawPoint.getPointer(), 7);
    }

    /**
     * Draw a string in world space
     */
    public ClosureObject<DrawString> DrawString() {
        return CHandler.getClosureObject(getValue(8), DrawString_Internal::DrawString_downcall);
    }

    /**
     * Draw a string in world space
     */
    public void DrawString(ClosureObject<DrawString> DrawString) {
        setValue(DrawString.getPointer(), 8);
    }

    /**
     * Bounds to use if restricting drawing to a rectangular region
     */
    public b2AABB drawingBounds() {
        return __drawingBounds;
    }

    private static final int __drawingBounds_offset = CHandler.getOffsetForField(__ffi_type, 9);

    private final b2AABB __drawingBounds = new b2AABB(getPointer() + __drawingBounds_offset, false);

    /**
     * Option to restrict drawing to a rectangular region. May suffer from unstable depth sorting.
     */
    public boolean useDrawingBounds() {
        return getValue(10) != 0;
    }

    /**
     * Option to restrict drawing to a rectangular region. May suffer from unstable depth sorting.
     */
    public void useDrawingBounds(boolean useDrawingBounds) {
        setValue(useDrawingBounds, 10);
    }

    /**
     * Option to draw shapes
     */
    public boolean drawShapes() {
        return getValue(11) != 0;
    }

    /**
     * Option to draw shapes
     */
    public void drawShapes(boolean drawShapes) {
        setValue(drawShapes, 11);
    }

    /**
     * Option to draw joints
     */
    public boolean drawJoints() {
        return getValue(12) != 0;
    }

    /**
     * Option to draw joints
     */
    public void drawJoints(boolean drawJoints) {
        setValue(drawJoints, 12);
    }

    /**
     * Option to draw additional information for joints
     */
    public boolean drawJointExtras() {
        return getValue(13) != 0;
    }

    /**
     * Option to draw additional information for joints
     */
    public void drawJointExtras(boolean drawJointExtras) {
        setValue(drawJointExtras, 13);
    }

    /**
     * Option to draw the bounding boxes for shapes
     */
    public boolean drawAABBs() {
        return getValue(14) != 0;
    }

    /**
     * Option to draw the bounding boxes for shapes
     */
    public void drawAABBs(boolean drawAABBs) {
        setValue(drawAABBs, 14);
    }

    /**
     * Option to draw the mass and center of mass of dynamic bodies
     */
    public boolean drawMass() {
        return getValue(15) != 0;
    }

    /**
     * Option to draw the mass and center of mass of dynamic bodies
     */
    public void drawMass(boolean drawMass) {
        setValue(drawMass, 15);
    }

    /**
     * Option to draw body names
     */
    public boolean drawBodyNames() {
        return getValue(16) != 0;
    }

    /**
     * Option to draw body names
     */
    public void drawBodyNames(boolean drawBodyNames) {
        setValue(drawBodyNames, 16);
    }

    /**
     * Option to draw contact points
     */
    public boolean drawContacts() {
        return getValue(17) != 0;
    }

    /**
     * Option to draw contact points
     */
    public void drawContacts(boolean drawContacts) {
        setValue(drawContacts, 17);
    }

    /**
     * Option to visualize the graph coloring used for contacts and joints
     */
    public boolean drawGraphColors() {
        return getValue(18) != 0;
    }

    /**
     * Option to visualize the graph coloring used for contacts and joints
     */
    public void drawGraphColors(boolean drawGraphColors) {
        setValue(drawGraphColors, 18);
    }

    /**
     * Option to draw contact normals
     */
    public boolean drawContactNormals() {
        return getValue(19) != 0;
    }

    /**
     * Option to draw contact normals
     */
    public void drawContactNormals(boolean drawContactNormals) {
        setValue(drawContactNormals, 19);
    }

    /**
     * Option to draw contact normal impulses
     */
    public boolean drawContactImpulses() {
        return getValue(20) != 0;
    }

    /**
     * Option to draw contact normal impulses
     */
    public void drawContactImpulses(boolean drawContactImpulses) {
        setValue(drawContactImpulses, 20);
    }

    /**
     * Option to draw contact friction impulses
     */
    public boolean drawFrictionImpulses() {
        return getValue(21) != 0;
    }

    /**
     * Option to draw contact friction impulses
     */
    public void drawFrictionImpulses(boolean drawFrictionImpulses) {
        setValue(drawFrictionImpulses, 21);
    }

    /**
     * User context that is passed as an argument to drawing callback functions
     */
    public VoidPointer context() {
        return new VoidPointer(getValue(22), false);
    }

    /**
     * User context that is passed as an argument to drawing callback functions
     */
    public void context(VoidPointer context) {
        setValue(context.getPointer(), 22);
    }

    public static final class b2DebugDrawPointer extends StackElementPointer<b2DebugDraw> {

        public b2DebugDrawPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2DebugDrawPointer() {
            this(1, true, true);
        }

        public b2DebugDrawPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2DebugDraw.b2DebugDrawPointer guardCount(long count) {
            super.guardCount(count);
            return this;
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
        void DrawString_call(b2Vec2 p, CSizedIntPointer s, b2HexColor color, VoidPointer context);
    }
}
