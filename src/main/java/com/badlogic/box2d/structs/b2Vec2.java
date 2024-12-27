package com.badlogic.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.box2d.FFITypes;

public final class b2Vec2 extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(74).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2Vec2(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2Vec2() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2Vec2.b2Vec2Pointer asPointer() {
        return new b2Vec2.b2Vec2Pointer(getPointer(), getsGCFreed());
    }

    public float x() {
        return (float) getValueFloat(0);
    }

    public void x(float x) {
        setValue(x, 0);
    }

    public float y() {
        return (float) getValueFloat(1);
    }

    public void y(float y) {
        setValue(y, 1);
    }

    public static final class b2Vec2Pointer extends StackElementPointer<b2Vec2> {

        public b2Vec2Pointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2Vec2Pointer() {
            this(1, true, true);
        }

        public b2Vec2Pointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2Vec2.b2Vec2Pointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2Vec2 createStackElement(long ptr, boolean freeOnGC) {
            return new b2Vec2(ptr, freeOnGC);
        }
    }
}
