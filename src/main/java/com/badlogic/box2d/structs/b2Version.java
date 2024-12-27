package com.badlogic.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.box2d.FFITypes;

public final class b2Version extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(75).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2Version(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2Version() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2Version.b2VersionPointer asPointer() {
        return new b2Version.b2VersionPointer(getPointer(), getsGCFreed());
    }

    public int major() {
        return (int) getValue(0);
    }

    public void major(int major) {
        setValue(major, 0);
    }

    public int minor() {
        return (int) getValue(1);
    }

    public void minor(int minor) {
        setValue(minor, 1);
    }

    public int revision() {
        return (int) getValue(2);
    }

    public void revision(int revision) {
        setValue(revision, 2);
    }

    public static final class b2VersionPointer extends StackElementPointer<b2Version> {

        public b2VersionPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2VersionPointer() {
            this(1, true, true);
        }

        public b2VersionPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2Version.b2VersionPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2Version createStackElement(long ptr, boolean freeOnGC) {
            return new b2Version(ptr, freeOnGC);
        }
    }
}
