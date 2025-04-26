package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;

/**
 * Cosine and sine pair
 * This uses a custom implementation designed for cross-platform determinism
 */
public final class b2CosSin extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(28).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2CosSin(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2CosSin(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
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
        return new b2CosSin.b2CosSinPointer(getPointer(), false, 1, this);
    }

    /**
     * cosine and sine
     */
    public float cosine() {
        return getBufPtr().getFloat(0);
    }

    /**
     * cosine and sine
     */
    public void cosine(float cosine) {
        getBufPtr().setFloat(0, cosine);
    }

    public float sine() {
        return getBufPtr().getFloat(4);
    }

    public void sine(float sine) {
        getBufPtr().setFloat(4, sine);
    }

    public static final class b2CosSinPointer extends StackElementPointer<b2CosSin> {

        public b2CosSinPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2CosSinPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2CosSinPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2CosSinPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2CosSinPointer() {
            this(1, true);
        }

        public b2CosSinPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2CosSin createStackElement(long ptr, boolean freeOnGC) {
            return new b2CosSin(ptr, freeOnGC);
        }
    }
}
