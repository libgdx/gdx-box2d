package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * A distance proxy is used by the GJK algorithm. It encapsulates any shape.
 */
public final class b2ShapeProxy extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(62).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ShapeProxy(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
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
        return new b2ShapeProxy.b2ShapeProxyPointer(getPointer(), false, this);
    }

    /**
     * The point cloud
     */
    public b2Vec2.b2Vec2Pointer points() {
        return __points;
    }

    private static final int __points_offset = 0;

    private final b2Vec2.b2Vec2Pointer __points = new b2Vec2.b2Vec2Pointer(getPointer() + __points_offset, false, 8);

    /**
     * The number of points
     */
    public int count() {
        return getBufPtr().getInt(64);
    }

    /**
     * The number of points
     */
    public void count(int count) {
        getBufPtr().setInt(64, count);
    }

    /**
     * The external radius of the point cloud
     */
    public float radius() {
        return getBufPtr().getFloat(68);
    }

    /**
     * The external radius of the point cloud
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
