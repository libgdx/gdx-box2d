package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2SimplexVertex;

/**
 * Simplex from the GJK algorithm
 */
public final class b2Simplex extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(63).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2Simplex(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2Simplex() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2Simplex.b2SimplexPointer asPointer() {
        return new b2Simplex.b2SimplexPointer(getPointer(), false, this);
    }

    /**
     * vertices
     */
    public b2SimplexVertex v1() {
        return __v1;
    }

    private static final int __v1_offset = 0;

    private final b2SimplexVertex __v1 = new b2SimplexVertex(getPointer() + __v1_offset, false);

    /**
     * vertices
     */
    public b2SimplexVertex v2() {
        return __v2;
    }

    private static final int __v2_offset = 36;

    private final b2SimplexVertex __v2 = new b2SimplexVertex(getPointer() + __v2_offset, false);

    /**
     * vertices
     */
    public b2SimplexVertex v3() {
        return __v3;
    }

    private static final int __v3_offset = 72;

    private final b2SimplexVertex __v3 = new b2SimplexVertex(getPointer() + __v3_offset, false);

    /**
     * number of valid vertices
     */
    public int count() {
        return getBufPtr().getInt(108);
    }

    /**
     * number of valid vertices
     */
    public void count(int count) {
        getBufPtr().setInt(108, count);
    }

    public static final class b2SimplexPointer extends StackElementPointer<b2Simplex> {

        public b2SimplexPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2SimplexPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2SimplexPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2SimplexPointer() {
            this(1, true);
        }

        public b2SimplexPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2Simplex createStackElement(long ptr, boolean freeOnGC) {
            return new b2Simplex(ptr, freeOnGC);
        }
    }
}
