package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.FFITypes;

/**
 * 2D rotation
 * This is similar to using a complex number for rotation
 */
public final class b2Rot extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(56).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2Rot(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2Rot(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
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
        return new b2Rot.b2RotPointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2Rot.b2RotPointer ptr) {
        ptr.setPointer(this);
    }

    /**
     * cosine and sine
     */
    public float c() {
        return getBufPtr().getFloat(0);
    }

    /**
     * cosine and sine
     */
    public void c(float c) {
        getBufPtr().setFloat(0, c);
    }

    /**
     * cosine and sine
     */
    public float s() {
        return getBufPtr().getFloat(4);
    }

    /**
     * cosine and sine
     */
    public void s(float s) {
        getBufPtr().setFloat(4, s);
    }

    public static final class b2RotPointer extends StackElementPointer<b2Rot> {

        public b2RotPointer(VoidPointer pointer) {
            super(pointer);
        }

        public b2RotPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2RotPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2RotPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2RotPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2RotPointer() {
            this(1, true);
        }

        public b2RotPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2Rot createStackElement(long ptr, boolean freeOnGC) {
            return new b2Rot(ptr, freeOnGC);
        }
    }
}
