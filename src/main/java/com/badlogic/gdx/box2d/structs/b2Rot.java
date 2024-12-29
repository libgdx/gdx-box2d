package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;

public final class b2Rot extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(53).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2Rot(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2Rot() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2Rot.b2RotPointer asPointer() {
        return new b2Rot.b2RotPointer(getPointer(), getsGCFreed());
    }

    public float c() {
        return (float) getValueFloat(0);
    }

    public void c(float c) {
        setValue(c, 0);
    }

    public float s() {
        return (float) getValueFloat(1);
    }

    public void s(float s) {
        setValue(s, 1);
    }

    public static final class b2RotPointer extends StackElementPointer<b2Rot> {

        public b2RotPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2RotPointer() {
            this(1, true, true);
        }

        public b2RotPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2Rot.b2RotPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2Rot createStackElement(long ptr, boolean freeOnGC) {
            return new b2Rot(ptr, freeOnGC);
        }
    }
}
