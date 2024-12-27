package com.badlogic.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.box2d.FFITypes;
import com.badlogic.box2d.structs.b2DistanceProxy;
import com.badlogic.box2d.structs.b2Transform;

public final class b2DistanceInput extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(31).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2DistanceInput(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2DistanceInput() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2DistanceInput.b2DistanceInputPointer asPointer() {
        return new b2DistanceInput.b2DistanceInputPointer(getPointer(), getsGCFreed());
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

    public b2Transform transformA() {
        return __transformA;
    }

    private static final int __transformA_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Transform __transformA = new b2Transform(getPointer() + __transformA_offset, false);

    public b2Transform transformB() {
        return __transformB;
    }

    private static final int __transformB_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Transform __transformB = new b2Transform(getPointer() + __transformB_offset, false);

    public boolean useRadii() {
        return getValue(0) != 0;
    }

    public void useRadii(boolean useRadii) {
        setValue(useRadii, 0);
    }

    public static final class b2DistanceInputPointer extends StackElementPointer<b2DistanceInput> {

        public b2DistanceInputPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2DistanceInputPointer() {
            this(1, true, true);
        }

        public b2DistanceInputPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2DistanceInput.b2DistanceInputPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2DistanceInput createStackElement(long ptr, boolean freeOnGC) {
            return new b2DistanceInput(ptr, freeOnGC);
        }
    }
}
