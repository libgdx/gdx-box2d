package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.jnigen.runtime.pointer.CSizedIntPointer;

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
        __ffi_type = FFITypes.getCTypeInfo(64).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2SimplexCache(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
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
        return new b2SimplexCache.b2SimplexCachePointer(getPointer(), getsGCFreed());
    }

    /**
     * The number of stored simplex points
     */
    public char count() {
        return (char) getValue(0);
    }

    /**
     * The number of stored simplex points
     */
    public void count(char count) {
        setValue(count, 0);
    }

    /**
     * The cached simplex indices on shape A
     */
    public CSizedIntPointer indexA() {
        return __indexA;
    }

    private static final int __indexA_offset = CHandler.getOffsetForField(__ffi_type, 1);

    private final CSizedIntPointer __indexA = new CSizedIntPointer(getPointer() + __indexA_offset, false, "uint8_t").guardCount(3);

    /**
     * The cached simplex indices on shape B
     */
    public CSizedIntPointer indexB() {
        return __indexB;
    }

    private static final int __indexB_offset = CHandler.getOffsetForField(__ffi_type, 4);

    private final CSizedIntPointer __indexB = new CSizedIntPointer(getPointer() + __indexB_offset, false, "uint8_t").guardCount(3);

    public static final class b2SimplexCachePointer extends StackElementPointer<b2SimplexCache> {

        public b2SimplexCachePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2SimplexCachePointer() {
            this(1, true, true);
        }

        public b2SimplexCachePointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2SimplexCache.b2SimplexCachePointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2SimplexCache createStackElement(long ptr, boolean freeOnGC) {
            return new b2SimplexCache(ptr, freeOnGC);
        }
    }
}
