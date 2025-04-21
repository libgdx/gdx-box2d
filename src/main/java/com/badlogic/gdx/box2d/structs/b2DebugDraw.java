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
import com.badlogic.gdx.box2d.Box2d_Internal.b2DebugDraw_Internal.DrawPolygonFcn_Internal;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.box2d.enums.b2HexColor;
import com.badlogic.gdx.box2d.Box2d_Internal.b2DebugDraw_Internal.DrawSolidPolygonFcn_Internal;
import com.badlogic.gdx.box2d.structs.b2Transform;
import com.badlogic.gdx.box2d.Box2d_Internal.b2DebugDraw_Internal.DrawCircleFcn_Internal;
import com.badlogic.gdx.box2d.Box2d_Internal.b2DebugDraw_Internal.DrawSolidCircleFcn_Internal;
import com.badlogic.gdx.box2d.Box2d_Internal.b2DebugDraw_Internal.DrawSolidCapsuleFcn_Internal;
import com.badlogic.gdx.box2d.Box2d_Internal.b2DebugDraw_Internal.DrawSegmentFcn_Internal;
import com.badlogic.gdx.box2d.Box2d_Internal.b2DebugDraw_Internal.DrawTransformFcn_Internal;
import com.badlogic.gdx.box2d.Box2d_Internal.b2DebugDraw_Internal.DrawPointFcn_Internal;
import com.badlogic.gdx.box2d.Box2d_Internal.b2DebugDraw_Internal.DrawStringFcn_Internal;
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
        __ffi_type = FFITypes.getCTypeInfo(30).getFfiType();
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
    public ClosureObject<DrawPolygonFcn> DrawPolygonFcn() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(0), DrawPolygonFcn_Internal::DrawPolygonFcn_downcall);
    }

    /**
     * Draw a closed polygon provided in CCW order.
     */
    public void DrawPolygonFcn(ClosureObject<DrawPolygonFcn> DrawPolygonFcn) {
        getBufPtr().setNativePointer(0, DrawPolygonFcn.getPointer());
    }

    /**
     * Draw a solid closed polygon provided in CCW order.
     */
    public ClosureObject<DrawSolidPolygonFcn> DrawSolidPolygonFcn() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 4 : 8), DrawSolidPolygonFcn_Internal::DrawSolidPolygonFcn_downcall);
    }

    /**
     * Draw a solid closed polygon provided in CCW order.
     */
    public void DrawSolidPolygonFcn(ClosureObject<DrawSolidPolygonFcn> DrawSolidPolygonFcn) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 4 : 8, DrawSolidPolygonFcn.getPointer());
    }

    /**
     * Draw a circle.
     */
    public ClosureObject<DrawCircleFcn> DrawCircleFcn() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 8 : 16), DrawCircleFcn_Internal::DrawCircleFcn_downcall);
    }

    /**
     * Draw a circle.
     */
    public void DrawCircleFcn(ClosureObject<DrawCircleFcn> DrawCircleFcn) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 8 : 16, DrawCircleFcn.getPointer());
    }

    /**
     * Draw a solid circle.
     */
    public ClosureObject<DrawSolidCircleFcn> DrawSolidCircleFcn() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 12 : 24), DrawSolidCircleFcn_Internal::DrawSolidCircleFcn_downcall);
    }

    /**
     * Draw a solid circle.
     */
    public void DrawSolidCircleFcn(ClosureObject<DrawSolidCircleFcn> DrawSolidCircleFcn) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 12 : 24, DrawSolidCircleFcn.getPointer());
    }

    /**
     * Draw a solid capsule.
     */
    public ClosureObject<DrawSolidCapsuleFcn> DrawSolidCapsuleFcn() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 16 : 32), DrawSolidCapsuleFcn_Internal::DrawSolidCapsuleFcn_downcall);
    }

    /**
     * Draw a solid capsule.
     */
    public void DrawSolidCapsuleFcn(ClosureObject<DrawSolidCapsuleFcn> DrawSolidCapsuleFcn) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 16 : 32, DrawSolidCapsuleFcn.getPointer());
    }

    /**
     * Draw a line segment.
     */
    public ClosureObject<DrawSegmentFcn> DrawSegmentFcn() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 20 : 40), DrawSegmentFcn_Internal::DrawSegmentFcn_downcall);
    }

    /**
     * Draw a line segment.
     */
    public void DrawSegmentFcn(ClosureObject<DrawSegmentFcn> DrawSegmentFcn) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 20 : 40, DrawSegmentFcn.getPointer());
    }

    /**
     * Draw a transform. Choose your own length scale.
     */
    public ClosureObject<DrawTransformFcn> DrawTransformFcn() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 24 : 48), DrawTransformFcn_Internal::DrawTransformFcn_downcall);
    }

    /**
     * Draw a transform. Choose your own length scale.
     */
    public void DrawTransformFcn(ClosureObject<DrawTransformFcn> DrawTransformFcn) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 24 : 48, DrawTransformFcn.getPointer());
    }

    /**
     * Draw a point.
     */
    public ClosureObject<DrawPointFcn> DrawPointFcn() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 28 : 56), DrawPointFcn_Internal::DrawPointFcn_downcall);
    }

    /**
     * Draw a point.
     */
    public void DrawPointFcn(ClosureObject<DrawPointFcn> DrawPointFcn) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 28 : 56, DrawPointFcn.getPointer());
    }

    /**
     * Draw a string in world space
     */
    public ClosureObject<DrawStringFcn> DrawStringFcn() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 32 : 64), DrawStringFcn_Internal::DrawStringFcn_downcall);
    }

    /**
     * Draw a string in world space
     */
    public void DrawStringFcn(ClosureObject<DrawStringFcn> DrawStringFcn) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 32 : 64, DrawStringFcn.getPointer());
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
    public boolean drawBounds() {
        return getBufPtr().getBoolean(CHandler.IS_32_BIT ? 56 : 92);
    }

    /**
     * Option to draw the bounding boxes for shapes
     */
    public void drawBounds(boolean drawBounds) {
        getBufPtr().setBoolean(CHandler.IS_32_BIT ? 56 : 92, drawBounds);
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
     * Option to draw contact feature ids
     */
    public boolean drawContactFeatures() {
        return getBufPtr().getBoolean(CHandler.IS_32_BIT ? 63 : 99);
    }

    /**
     * Option to draw contact feature ids
     */
    public void drawContactFeatures(boolean drawContactFeatures) {
        getBufPtr().setBoolean(CHandler.IS_32_BIT ? 63 : 99, drawContactFeatures);
    }

    /**
     * Option to draw contact friction impulses
     */
    public boolean drawFrictionImpulses() {
        return getBufPtr().getBoolean(CHandler.IS_32_BIT ? 64 : 100);
    }

    /**
     * Option to draw contact friction impulses
     */
    public void drawFrictionImpulses(boolean drawFrictionImpulses) {
        getBufPtr().setBoolean(CHandler.IS_32_BIT ? 64 : 100, drawFrictionImpulses);
    }

    /**
     * Option to draw islands as bounding boxes
     */
    public boolean drawIslands() {
        return getBufPtr().getBoolean(CHandler.IS_32_BIT ? 65 : 101);
    }

    /**
     * Option to draw islands as bounding boxes
     */
    public void drawIslands(boolean drawIslands) {
        getBufPtr().setBoolean(CHandler.IS_32_BIT ? 65 : 101, drawIslands);
    }

    /**
     * User context that is passed as an argument to drawing callback functions
     */
    public VoidPointer context() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 68 : 104), false);
    }

    /**
     * User context that is passed as an argument to drawing callback functions
     */
    public void context(VoidPointer context) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 68 : 104, context.getPointer());
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

    public interface DrawPolygonFcn extends Closure, DrawPolygonFcn_Internal {

        /**
         * Draw a closed polygon provided in CCW order.
         */
        void DrawPolygonFcn_call(b2Vec2.b2Vec2Pointer vertices, int vertexCount, b2HexColor color, VoidPointer context);
    }

    public interface DrawSolidPolygonFcn extends Closure, DrawSolidPolygonFcn_Internal {

        /**
         * Draw a solid closed polygon provided in CCW order.
         */
        void DrawSolidPolygonFcn_call(b2Transform transform, b2Vec2.b2Vec2Pointer vertices, int vertexCount, float radius, b2HexColor color, VoidPointer context);
    }

    public interface DrawCircleFcn extends Closure, DrawCircleFcn_Internal {

        /**
         * Draw a circle.
         */
        void DrawCircleFcn_call(b2Vec2 center, float radius, b2HexColor color, VoidPointer context);
    }

    public interface DrawSolidCircleFcn extends Closure, DrawSolidCircleFcn_Internal {

        /**
         * Draw a solid circle.
         */
        void DrawSolidCircleFcn_call(b2Transform transform, float radius, b2HexColor color, VoidPointer context);
    }

    public interface DrawSolidCapsuleFcn extends Closure, DrawSolidCapsuleFcn_Internal {

        /**
         * Draw a solid capsule.
         */
        void DrawSolidCapsuleFcn_call(b2Vec2 p1, b2Vec2 p2, float radius, b2HexColor color, VoidPointer context);
    }

    public interface DrawSegmentFcn extends Closure, DrawSegmentFcn_Internal {

        /**
         * Draw a line segment.
         */
        void DrawSegmentFcn_call(b2Vec2 p1, b2Vec2 p2, b2HexColor color, VoidPointer context);
    }

    public interface DrawTransformFcn extends Closure, DrawTransformFcn_Internal {

        /**
         * Draw a transform. Choose your own length scale.
         */
        void DrawTransformFcn_call(b2Transform transform, VoidPointer context);
    }

    public interface DrawPointFcn extends Closure, DrawPointFcn_Internal {

        /**
         * Draw a point.
         */
        void DrawPointFcn_call(b2Vec2 p, float size, b2HexColor color, VoidPointer context);
    }

    public interface DrawStringFcn extends Closure, DrawStringFcn_Internal {

        /**
         * Draw a string in world space
         */
        void DrawStringFcn_call(b2Vec2 p, BytePointer s, b2HexColor color, VoidPointer context);
    }
}
