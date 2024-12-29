package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;

public final class b2Timer extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(70).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2Timer(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2Timer() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2Timer.b2TimerPointer asPointer() {
        return new b2Timer.b2TimerPointer(getPointer(), getsGCFreed());
    }

    public long start() {
        return (long) getValue(0);
    }

    public void start(long start) {
        setValue(start, 0);
    }

    public static final class b2TimerPointer extends StackElementPointer<b2Timer> {

        public b2TimerPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2TimerPointer() {
            this(1, true, true);
        }

        public b2TimerPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2Timer.b2TimerPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2Timer createStackElement(long ptr, boolean freeOnGC) {
            return new b2Timer(ptr, freeOnGC);
        }
    }
}
