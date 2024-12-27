package com.badlogic.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.box2d.FFITypes;
import com.badlogic.box2d.structs.b2DistanceProxy;
import com.badlogic.box2d.structs.b2Sweep;

public final class b2TOIInput extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(66).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2TOIInput(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2TOIInput() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2TOIInput.b2TOIInputPointer asPointer() {
        return new b2TOIInput.b2TOIInputPointer(getPointer(), getsGCFreed());
    }

    public b2DistanceProxy proxyA() {
        return __proxyA;
    }

    private static final int __proxyA_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2DistanceProxy __proxyA = new b2DistanceProxy(getPointer() + __proxyA_offset, false);

    public b2DistanceProxy proxyB() {
        return __proxyB;
    }

    private static final int __proxyB_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2DistanceProxy __proxyB = new b2DistanceProxy(getPointer() + __proxyB_offset, false);

    public b2Sweep sweepA() {
        return __sweepA;
    }

    private static final int __sweepA_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Sweep __sweepA = new b2Sweep(getPointer() + __sweepA_offset, false);

    public b2Sweep sweepB() {
        return __sweepB;
    }

    private static final int __sweepB_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Sweep __sweepB = new b2Sweep(getPointer() + __sweepB_offset, false);

    public float tMax() {
        return (float) getValueFloat(0);
    }

    public void tMax(float tMax) {
        setValue(tMax, 0);
    }

    public static final class b2TOIInputPointer extends StackElementPointer<b2TOIInput> {

        public b2TOIInputPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2TOIInputPointer() {
            this(1, true, true);
        }

        public b2TOIInputPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2TOIInput.b2TOIInputPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2TOIInput createStackElement(long ptr, boolean freeOnGC) {
            return new b2TOIInput(ptr, freeOnGC);
        }
    }
}
