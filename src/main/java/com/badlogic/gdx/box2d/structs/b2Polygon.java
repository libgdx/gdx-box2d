package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
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

    public b2Polygon(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
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
        return new b2Polygon.b2PolygonPointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2Polygon.b2PolygonPointer ptr) {
        ptr.setPointer(this);
    }

    /**
     * The polygon vertices
     */
    public b2Vec2.b2Vec2Pointer vertices() {
        return new b2Vec2.b2Vec2Pointer(getPointer(), false, 8);
    }

    /**
     * The polygon vertices
     */
    public void vertices(b2Vec2.b2Vec2Pointer toSetPtr) {
        toSetPtr.setPointer(getPointer(), 64, this);
    }

    /**
     * The polygon vertices
     */
    public b2Vec2.b2Vec2Pointer getVertices() {
        return new b2Vec2.b2Vec2Pointer(getBufPtr().duplicate(0, 64), false, 8);
    }

    /**
     * The polygon vertices
     */
    public void getVertices(b2Vec2.b2Vec2Pointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 64);
    }

    /**
     * The polygon vertices
     */
    public void setVertices(b2Vec2.b2Vec2Pointer toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 64);
    }

    /**
     * The outward normal vectors of the polygon sides
     */
    public b2Vec2.b2Vec2Pointer normals() {
        return new b2Vec2.b2Vec2Pointer(getPointer() + (64), false, 8);
    }

    /**
     * The outward normal vectors of the polygon sides
     */
    public void normals(b2Vec2.b2Vec2Pointer toSetPtr) {
        toSetPtr.setPointer(getPointer() + (64), 64, this);
    }

    /**
     * The outward normal vectors of the polygon sides
     */
    public b2Vec2.b2Vec2Pointer getNormals() {
        return new b2Vec2.b2Vec2Pointer(getBufPtr().duplicate(64, 64), false, 8);
    }

    /**
     * The outward normal vectors of the polygon sides
     */
    public void getNormals(b2Vec2.b2Vec2Pointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 64, 64);
    }

    /**
     * The outward normal vectors of the polygon sides
     */
    public void setNormals(b2Vec2.b2Vec2Pointer toCopyFrom) {
        getBufPtr().copyFrom(64, toCopyFrom.getBufPtr(), 0, 64);
    }

    /**
     * The centroid of the polygon
     */
    public b2Vec2 centroid() {
        return new b2Vec2(getPointer() + (128), false);
    }

    /**
     * The centroid of the polygon
     */
    public void centroid(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (128), 8, this);
    }

    /**
     * The centroid of the polygon
     */
    public b2Vec2 getCentroid() {
        return new b2Vec2(getBufPtr().duplicate(128, 8), true);
    }

    /**
     * The centroid of the polygon
     */
    public void getCentroid(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 128, 8);
    }

    /**
     * The centroid of the polygon
     */
    public void setCentroid(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(128, toCopyFrom.getBufPtr(), 0, 8);
    }

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

        public b2PolygonPointer(VoidPointer pointer) {
            super(pointer);
        }

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

        public b2PolygonPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
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
