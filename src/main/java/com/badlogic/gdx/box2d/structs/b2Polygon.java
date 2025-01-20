package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * A solid convex polygon. It is assumed that the interior of the polygon is to
 * the left of each edge.
 * Polygons have a maximum number of vertices equal to B2_MAX_POLYGON_VERTICES.
 * In most cases you should not need many vertices for a convex polygon.
 * @warning DO NOT fill this out manually, instead use a helper function like
 * b2MakePolygon or b2MakeBox.
 */
public final class b2Polygon extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(45).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2Polygon(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2Polygon() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2Polygon.b2PolygonPointer asPointer() {
        return new b2Polygon.b2PolygonPointer(getPointer(), getsGCFreed());
    }

    /**
     * The polygon vertices
     */
    public b2Vec2.b2Vec2Pointer vertices() {
        return __vertices;
    }

    private static final int __vertices_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2.b2Vec2Pointer __vertices = new b2Vec2.b2Vec2Pointer(getPointer() + __vertices_offset, false).guardCount(8);

    /**
     * The outward normal vectors of the polygon sides
     */
    public b2Vec2.b2Vec2Pointer normals() {
        return __normals;
    }

    private static final int __normals_offset = CHandler.getOffsetForField(__ffi_type, 8);

    private final b2Vec2.b2Vec2Pointer __normals = new b2Vec2.b2Vec2Pointer(getPointer() + __normals_offset, false).guardCount(8);

    /**
     * The centroid of the polygon
     */
    public b2Vec2 centroid() {
        return __centroid;
    }

    private static final int __centroid_offset = CHandler.getOffsetForField(__ffi_type, 16);

    private final b2Vec2 __centroid = new b2Vec2(getPointer() + __centroid_offset, false);

    /**
     * The external radius for rounded polygons
     */
    public float radius() {
        return (float) getValueFloat(17);
    }

    /**
     * The external radius for rounded polygons
     */
    public void radius(float radius) {
        setValue(radius, 17);
    }

    /**
     * The number of polygon vertices
     */
    public int count() {
        return (int) getValue(18);
    }

    /**
     * The number of polygon vertices
     */
    public void count(int count) {
        setValue(count, 18);
    }

    public static final class b2PolygonPointer extends StackElementPointer<b2Polygon> {

        public b2PolygonPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2PolygonPointer() {
            this(1, true, true);
        }

        public b2PolygonPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2Polygon.b2PolygonPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2Polygon createStackElement(long ptr, boolean freeOnGC) {
            return new b2Polygon(ptr, freeOnGC);
        }
    }
}
