package com.badlogic.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.box2d.FFITypes;
import com.badlogic.gdx.jnigen.runtime.pointer.CSizedIntPointer;

public final class b2DistanceCache extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(30).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2DistanceCache(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2DistanceCache() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2DistanceCache.b2DistanceCachePointer asPointer() {
        return new b2DistanceCache.b2DistanceCachePointer(getPointer(), getsGCFreed());
    }

    public char count() {
        return (char) getValue(0);
    }

    public void count(char count) {
        setValue(count, 0);
    }

    public CSizedIntPointer indexA() {
        return __indexA;
    }

    private static final int __indexA_offset = CHandler.getOffsetForField(__ffi_type, 1);

    private final CSizedIntPointer __indexA = new CSizedIntPointer(getPointer() + __indexA_offset, false, "uint8_t").guardCount(3);

    public CSizedIntPointer indexB() {
        return __indexB;
    }

    private static final int __indexB_offset = CHandler.getOffsetForField(__ffi_type, 4);

    private final CSizedIntPointer __indexB = new CSizedIntPointer(getPointer() + __indexB_offset, false, "uint8_t").guardCount(3);

    public static final class b2DistanceCachePointer extends StackElementPointer<b2DistanceCache> {

        public b2DistanceCachePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2DistanceCachePointer() {
            this(1, true, true);
        }

        public b2DistanceCachePointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2DistanceCache.b2DistanceCachePointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2DistanceCache createStackElement(long ptr, boolean freeOnGC) {
            return new b2DistanceCache(ptr, freeOnGC);
        }
    }
}
