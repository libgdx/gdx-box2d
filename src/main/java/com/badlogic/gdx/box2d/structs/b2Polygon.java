package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
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
        __ffi_type = FFITypes.getCTypeInfo(49).getFfiType();
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
        return new b2Polygon.b2PolygonPointer(getPointer(), false, this);
    }

    /**
     * The polygon vertices
     */
    public b2Vec2.b2Vec2Pointer vertices() {
        return __vertices;
    }

    private static final int __vertices_offset = 0;

    private final b2Vec2.b2Vec2Pointer __vertices = new b2Vec2.b2Vec2Pointer(getPointer() + __vertices_offset, false, 8);

    /**
     * The outward normal vectors of the polygon sides
     */
    public b2Vec2.b2Vec2Pointer normals() {
        return __normals;
    }

    private static final int __normals_offset = 64;

    private final b2Vec2.b2Vec2Pointer __normals = new b2Vec2.b2Vec2Pointer(getPointer() + __normals_offset, false, 8);

    /**
     * The centroid of the polygon
     */
    public b2Vec2 centroid() {
        return __centroid;
    }

    private static final int __centroid_offset = 128;

    private final b2Vec2 __centroid = new b2Vec2(getPointer() + __centroid_offset, false);

    /**
     * The external radius for rounded polygons
     */
    public float radius() {
        return getBufPtr().getFloat(136);
    }

    /**
     * The external radius for rounded polygons
     */
    public void radius(float radius) {
        getBufPtr().setFloat(136, radius);
    }

    /**
     * The number of polygon vertices
     */
    public int count() {
        return getBufPtr().getInt(140);
    }

    /**
     * The number of polygon vertices
     */
    public void count(int count) {
        getBufPtr().setInt(140, count);
    }

    public static final class b2PolygonPointer extends StackElementPointer<b2Polygon> {

        public b2PolygonPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2PolygonPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2PolygonPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2PolygonPointer() {
            this(1, true);
        }

        public b2PolygonPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2Polygon createStackElement(long ptr, boolean freeOnGC) {
            return new b2Polygon(ptr, freeOnGC);
        }
    }
}
