package com.badlogic.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.box2d.FFITypes;
import com.badlogic.box2d.structs.b2Vec2;

public final class b2DistanceProxy extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(34).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2DistanceProxy(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2DistanceProxy() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2DistanceProxy.b2DistanceProxyPointer asPointer() {
        return new b2DistanceProxy.b2DistanceProxyPointer(getPointer(), getsGCFreed());
    }

    public b2Vec2.b2Vec2Pointer points() {
        return __points;
    }

    private static final int __points_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2.b2Vec2Pointer __points = new b2Vec2.b2Vec2Pointer(getPointer() + __points_offset, false).guardCount(8);

    public int count() {
        return (int) getValue(8);
    }

    public void count(int count) {
        setValue(count, 8);
    }

    public float radius() {
        return (float) getValueFloat(9);
    }

    public void radius(float radius) {
        setValue(radius, 9);
    }

    public static final class b2DistanceProxyPointer extends StackElementPointer<b2DistanceProxy> {

        public b2DistanceProxyPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2DistanceProxyPointer() {
            this(1, true, true);
        }

        public b2DistanceProxyPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2DistanceProxy.b2DistanceProxyPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2DistanceProxy createStackElement(long ptr, boolean freeOnGC) {
            return new b2DistanceProxy(ptr, freeOnGC);
        }
    }
}
