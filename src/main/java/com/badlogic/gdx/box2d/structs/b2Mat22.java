package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * A 2-by-2 Matrix
 */
public final class b2Mat22 extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(43).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2Mat22(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2Mat22(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2Mat22() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2Mat22.b2Mat22Pointer asPointer() {
        return new b2Mat22.b2Mat22Pointer(getPointer(), false, 1, this);
    }

    /**
     * columns
     */
    public b2Vec2 cx() {
        return new b2Vec2(getPointer(), false);
    }

    /**
     * columns
     */
    public void cx(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    /**
     * columns
     */
    public b2Vec2 getCx() {
        return new b2Vec2(getBufPtr().duplicate(0, 8), true);
    }

    /**
     * columns
     */
    public void getCx(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    /**
     * columns
     */
    public void setCx(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * columns
     */
    public b2Vec2 cy() {
        return new b2Vec2(getPointer() + (8), false);
    }

    /**
     * columns
     */
    public void cy(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (8), 8, this);
    }

    /**
     * columns
     */
    public b2Vec2 getCy() {
        return new b2Vec2(getBufPtr().duplicate(8, 8), true);
    }

    /**
     * columns
     */
    public void getCy(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 8, 8);
    }

    /**
     * columns
     */
    public void setCy(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(8, toCopyFrom.getBufPtr(), 0, 8);
    }

    public static final class b2Mat22Pointer extends StackElementPointer<b2Mat22> {

        public b2Mat22Pointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2Mat22Pointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2Mat22Pointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2Mat22Pointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2Mat22Pointer() {
            this(1, true);
        }

        public b2Mat22Pointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2Mat22 createStackElement(long ptr, boolean freeOnGC) {
            return new b2Mat22(ptr, freeOnGC);
        }
    }
}
