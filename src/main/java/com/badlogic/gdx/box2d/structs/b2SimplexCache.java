package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UBytePointer;

/**
 * Used to warm start the GJK simplex. If you call this function multiple times with nearby
 * transforms this might improve performance. Otherwise you can zero initialize this.
 * The distance cache must be initialized to zero on the first call.
 * Users should generally just zero initialize this structure for each call.
 */
public final class b2SimplexCache extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(68).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2SimplexCache(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2SimplexCache(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2SimplexCache() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2SimplexCache.b2SimplexCachePointer asPointer() {
        return new b2SimplexCache.b2SimplexCachePointer(getPointer(), false, 1, this);
    }

    /**
     * The number of stored simplex points
     */
    public char count() {
        return getBufPtr().getChar(0);
    }

    /**
     * The number of stored simplex points
     */
    public void count(char count) {
        getBufPtr().setChar(0, count);
    }

    /**
     * The cached simplex indices on shape A
     */
    public UBytePointer indexA() {
        return new UBytePointer(getPointer() + (2), false, 3);
    }

    /**
     * The cached simplex indices on shape A
     */
    public void indexA(UBytePointer toSetPtr) {
        toSetPtr.setPointer(getPointer() + (2), 3, this);
    }

    /**
     * The cached simplex indices on shape A
     */
    public UBytePointer getIndexA() {
        return new UBytePointer(getBufPtr().duplicate(2, 3), false, 3);
    }

    /**
     * The cached simplex indices on shape A
     */
    public void getIndexA(UBytePointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 2, 3);
    }

    /**
     * The cached simplex indices on shape A
     */
    public void setIndexA(UBytePointer toCopyFrom) {
        getBufPtr().copyFrom(2, toCopyFrom.getBufPtr(), 0, 3);
    }

    /**
     * The cached simplex indices on shape B
     */
    public UBytePointer indexB() {
        return new UBytePointer(getPointer() + (5), false, 3);
    }

    /**
     * The cached simplex indices on shape B
     */
    public void indexB(UBytePointer toSetPtr) {
        toSetPtr.setPointer(getPointer() + (5), 3, this);
    }

    /**
     * The cached simplex indices on shape B
     */
    public UBytePointer getIndexB() {
        return new UBytePointer(getBufPtr().duplicate(5, 3), false, 3);
    }

    /**
     * The cached simplex indices on shape B
     */
    public void getIndexB(UBytePointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 5, 3);
    }

    /**
     * The cached simplex indices on shape B
     */
    public void setIndexB(UBytePointer toCopyFrom) {
        getBufPtr().copyFrom(5, toCopyFrom.getBufPtr(), 0, 3);
    }

    public static final class b2SimplexCachePointer extends StackElementPointer<b2SimplexCache> {

        public b2SimplexCachePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2SimplexCachePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2SimplexCachePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2SimplexCachePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2SimplexCachePointer() {
            this(1, true);
        }

        public b2SimplexCachePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2SimplexCache createStackElement(long ptr, boolean freeOnGC) {
            return new b2SimplexCache(ptr, freeOnGC);
        }
    }
}
