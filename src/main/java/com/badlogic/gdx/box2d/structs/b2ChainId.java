package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
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
        return new b2ChainId.b2ChainIdPointer(getPointer(), getsGCFreed());
    }

    public int index1() {
        return (int) getValue(0);
    }

    public void index1(int index1) {
        setValue(index1, 0);
    }

    public char world0() {
        return (char) getValue(1);
    }

    public void world0(char world0) {
        setValue(world0, 1);
    }

    public char generation() {
        return (char) getValue(2);
    }

    public void generation(char generation) {
        setValue(generation, 2);
    }

    public static final class b2ChainIdPointer extends StackElementPointer<b2ChainId> {

        public b2ChainIdPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ChainIdPointer() {
            this(1, true, true);
        }

        public b2ChainIdPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2ChainId.b2ChainIdPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2ChainId createStackElement(long ptr, boolean freeOnGC) {
            return new b2ChainId(ptr, freeOnGC);
        }
    }
}
