package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * A distance proxy is used by the GJK algorithm. It encapsulates any shape.
 * You can provide between 1 and B2_MAX_POLYGON_VERTICES and a radius.
 */
public final class b2ShapeProxy extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(66).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ShapeProxy(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2ShapeProxy(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2ShapeProxy() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2ShapeProxy.b2ShapeProxyPointer asPointer() {
        return new b2ShapeProxy.b2ShapeProxyPointer(getPointer(), false, 1, this);
    }

    /**
     * The point cloud
     */
    public b2Vec2.b2Vec2Pointer points() {
        return new b2Vec2.b2Vec2Pointer(getPointer(), false, 8);
    }

    /**
     * The point cloud
     */
    public void points(b2Vec2.b2Vec2Pointer toSetPtr) {
        toSetPtr.setPointer(getPointer(), 64, this);
    }

    /**
     * The point cloud
     */
    public b2Vec2.b2Vec2Pointer getPoints() {
        return new b2Vec2.b2Vec2Pointer(getBufPtr().duplicate(0, 64), false, 8);
    }

    /**
     * The point cloud
     */
    public void getPoints(b2Vec2.b2Vec2Pointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 64);
    }

    /**
     * The point cloud
     */
    public void setPoints(b2Vec2.b2Vec2Pointer toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 64);
    }

    /**
     * The number of points. Must be greater than 0.
     */
    public int count() {
        return getBufPtr().getInt(64);
    }

    /**
     * The number of points. Must be greater than 0.
     */
    public void count(int count) {
        getBufPtr().setInt(64, count);
    }

    /**
     * The external radius of the point cloud. May be zero.
     */
    public float radius() {
        return getBufPtr().getFloat(68);
    }

    /**
     * The external radius of the point cloud. May be zero.
     */
    public void radius(float radius) {
        getBufPtr().setFloat(68, radius);
    }

    public static final class b2ShapeProxyPointer extends StackElementPointer<b2ShapeProxy> {

        public b2ShapeProxyPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ShapeProxyPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2ShapeProxyPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2ShapeProxyPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2ShapeProxyPointer() {
            this(1, true);
        }

        public b2ShapeProxyPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2ShapeProxy createStackElement(long ptr, boolean freeOnGC) {
            return new b2ShapeProxy(ptr, freeOnGC);
        }
    }
}
