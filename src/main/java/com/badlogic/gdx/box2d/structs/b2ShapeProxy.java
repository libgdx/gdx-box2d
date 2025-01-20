package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
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
        return new b2ShapeProxy.b2ShapeProxyPointer(getPointer(), getsGCFreed());
    }

    /**
     * The point cloud
     */
    public b2Vec2.b2Vec2Pointer points() {
        return __points;
    }

    private static final int __points_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2.b2Vec2Pointer __points = new b2Vec2.b2Vec2Pointer(getPointer() + __points_offset, false).guardCount(8);

    /**
     * The number of points
     */
    public int count() {
        return (int) getValue(8);
    }

    /**
     * The number of points
     */
    public void count(int count) {
        setValue(count, 8);
    }

    /**
     * The external radius of the point cloud
     */
    public float radius() {
        return (float) getValueFloat(9);
    }

    /**
     * The external radius of the point cloud
     */
    public void radius(float radius) {
        setValue(radius, 9);
    }

    public static final class b2ShapeProxyPointer extends StackElementPointer<b2ShapeProxy> {

        public b2ShapeProxyPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ShapeProxyPointer() {
            this(1, true, true);
        }

        public b2ShapeProxyPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2ShapeProxy.b2ShapeProxyPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2ShapeProxy createStackElement(long ptr, boolean freeOnGC) {
            return new b2ShapeProxy(ptr, freeOnGC);
        }
    }
}
