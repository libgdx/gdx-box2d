package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;

/**
 * Chain id references a chain instances. This should be treated as an opaque handle.
 */
public final class b2ChainId extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(19).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ChainId(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2ChainId(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2ChainId() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2ChainId.b2ChainIdPointer asPointer() {
        return new b2ChainId.b2ChainIdPointer(getPointer(), false, 1, this);
    }

    public int index1() {
        return getBufPtr().getInt(0);
    }

    public void index1(int index1) {
        getBufPtr().setInt(0, index1);
    }

    public char world0() {
        return getBufPtr().getChar(4);
    }

    public void world0(char world0) {
        getBufPtr().setChar(4, world0);
    }

    public char generation() {
        return getBufPtr().getChar(6);
    }

    public void generation(char generation) {
        getBufPtr().setChar(6, generation);
    }

    public static final class b2ChainIdPointer extends StackElementPointer<b2ChainId> {

        public b2ChainIdPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ChainIdPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2ChainIdPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2ChainIdPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2ChainIdPointer() {
            this(1, true);
        }

        public b2ChainIdPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2ChainId createStackElement(long ptr, boolean freeOnGC) {
            return new b2ChainId(ptr, freeOnGC);
        }
    }
}
