package com.badlogic.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.box2d.FFITypes;

public final class b2WorldId extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(79).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2WorldId(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2WorldId() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2WorldId.b2WorldIdPointer asPointer() {
        return new b2WorldId.b2WorldIdPointer(getPointer(), getsGCFreed());
    }

    public char index1() {
        return (char) getValue(0);
    }

    public void index1(char index1) {
        setValue(index1, 0);
    }

    public char revision() {
        return (char) getValue(1);
    }

    public void revision(char revision) {
        setValue(revision, 1);
    }

    public static final class b2WorldIdPointer extends StackElementPointer<b2WorldId> {

        public b2WorldIdPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2WorldIdPointer() {
            this(1, true, true);
        }

        public b2WorldIdPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2WorldId.b2WorldIdPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2WorldId createStackElement(long ptr, boolean freeOnGC) {
            return new b2WorldId(ptr, freeOnGC);
        }
    }
}
