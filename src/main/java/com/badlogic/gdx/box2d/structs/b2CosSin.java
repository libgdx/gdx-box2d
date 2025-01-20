package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;

/**
 * Cosine and sine pair
 * This uses a custom implementation designed for cross-platform determinism
 */
public final class b2CosSin extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(27).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2CosSin(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2CosSin() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2CosSin.b2CosSinPointer asPointer() {
        return new b2CosSin.b2CosSinPointer(getPointer(), getsGCFreed());
    }

    /**
     * cosine and sine
     */
    public float cosine() {
        return (float) getValueFloat(0);
    }

    /**
     * cosine and sine
     */
    public void cosine(float cosine) {
        setValue(cosine, 0);
    }

    public float sine() {
        return (float) getValueFloat(1);
    }

    public void sine(float sine) {
        setValue(sine, 1);
    }

    public static final class b2CosSinPointer extends StackElementPointer<b2CosSin> {

        public b2CosSinPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2CosSinPointer() {
            this(1, true, true);
        }

        public b2CosSinPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2CosSin.b2CosSinPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2CosSin createStackElement(long ptr, boolean freeOnGC) {
            return new b2CosSin(ptr, freeOnGC);
        }
    }
}
