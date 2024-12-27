package com.badlogic.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.box2d.FFITypes;

public final class b2QueryFilter extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(49).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2QueryFilter(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2QueryFilter() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2QueryFilter.b2QueryFilterPointer asPointer() {
        return new b2QueryFilter.b2QueryFilterPointer(getPointer(), getsGCFreed());
    }

    public long categoryBits() {
        return (long) getValue(0);
    }

    public void categoryBits(long categoryBits) {
        setValue(categoryBits, 0);
    }

    public long maskBits() {
        return (long) getValue(1);
    }

    public void maskBits(long maskBits) {
        setValue(maskBits, 1);
    }

    public static final class b2QueryFilterPointer extends StackElementPointer<b2QueryFilter> {

        public b2QueryFilterPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2QueryFilterPointer() {
            this(1, true, true);
        }

        public b2QueryFilterPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2QueryFilter.b2QueryFilterPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2QueryFilter createStackElement(long ptr, boolean freeOnGC) {
            return new b2QueryFilter(ptr, freeOnGC);
        }
    }
}
