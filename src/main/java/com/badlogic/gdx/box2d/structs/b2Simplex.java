package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2SimplexVertex;

/**
 * Simplex from the GJK algorithm
 */
public final class b2Simplex extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(67).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2Simplex(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2Simplex(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
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
        return new b2Simplex.b2SimplexPointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2Simplex.b2SimplexPointer ptr) {
        ptr.setPointer(this);
    }

    /**
     * vertices
     */
    public b2SimplexVertex v1() {
        return new b2SimplexVertex(getPointer(), false);
    }

    /**
     * vertices
     */
    public void v1(b2SimplexVertex toSetPtr) {
        toSetPtr.setPointer(getPointer(), 36, this);
    }

    /**
     * vertices
     */
    public b2SimplexVertex getV1() {
        return new b2SimplexVertex(getBufPtr().duplicate(0, 36), true);
    }

    /**
     * vertices
     */
    public void getV1(b2SimplexVertex toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 36);
    }

    /**
     * vertices
     */
    public void setV1(b2SimplexVertex toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 36);
    }

    /**
     * vertices
     */
    public b2SimplexVertex v2() {
        return new b2SimplexVertex(getPointer() + (36), false);
    }

    /**
     * vertices
     */
    public void v2(b2SimplexVertex toSetPtr) {
        toSetPtr.setPointer(getPointer() + (36), 36, this);
    }

    /**
     * vertices
     */
    public b2SimplexVertex getV2() {
        return new b2SimplexVertex(getBufPtr().duplicate(36, 36), true);
    }

    /**
     * vertices
     */
    public void getV2(b2SimplexVertex toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 36, 36);
    }

    /**
     * vertices
     */
    public void setV2(b2SimplexVertex toCopyFrom) {
        getBufPtr().copyFrom(36, toCopyFrom.getBufPtr(), 0, 36);
    }

    /**
     * vertices
     */
    public b2SimplexVertex v3() {
        return new b2SimplexVertex(getPointer() + (72), false);
    }

    /**
     * vertices
     */
    public void v3(b2SimplexVertex toSetPtr) {
        toSetPtr.setPointer(getPointer() + (72), 36, this);
    }

    /**
     * vertices
     */
    public b2SimplexVertex getV3() {
        return new b2SimplexVertex(getBufPtr().duplicate(72, 36), true);
    }

    /**
     * vertices
     */
    public void getV3(b2SimplexVertex toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 72, 36);
    }

    /**
     * vertices
     */
    public void setV3(b2SimplexVertex toCopyFrom) {
        getBufPtr().copyFrom(72, toCopyFrom.getBufPtr(), 0, 36);
    }

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

        public b2SimplexPointer(VoidPointer pointer) {
            super(pointer);
        }

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

        public b2SimplexPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
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
