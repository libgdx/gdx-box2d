package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;

/**
 * Version numbering scheme.
 * See https://semver.org/
 */
public final class b2Version extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(78).getFfiType();
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
        return new b2Version.b2VersionPointer(getPointer(), false, this);
    }

    /**
     * Significant changes
     */
    public int major() {
        return getBufPtr().getInt(0);
    }

    /**
     * Significant changes
     */
    public void major(int major) {
        getBufPtr().setInt(0, major);
    }

    /**
     * Incremental changes
     */
    public int minor() {
        return getBufPtr().getInt(4);
    }

    /**
     * Incremental changes
     */
    public void minor(int minor) {
        getBufPtr().setInt(4, minor);
    }

    /**
     * Bug fixes
     */
    public int revision() {
        return getBufPtr().getInt(8);
    }

    /**
     * Bug fixes
     */
    public void revision(int revision) {
        getBufPtr().setInt(8, revision);
    }

    public static final class b2VersionPointer extends StackElementPointer<b2Version> {

        public b2VersionPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2VersionPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2VersionPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2VersionPointer() {
            this(1, true);
        }

        public b2VersionPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2Version createStackElement(long ptr, boolean freeOnGC) {
            return new b2Version(ptr, freeOnGC);
        }
    }
}
