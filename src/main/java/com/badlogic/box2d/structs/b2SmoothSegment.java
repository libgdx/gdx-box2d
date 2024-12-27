package com.badlogic.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.box2d.FFITypes;
import com.badlogic.box2d.structs.b2Vec2;
import com.badlogic.box2d.structs.b2Segment;

public final class b2SmoothSegment extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(64).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2SmoothSegment(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2SmoothSegment() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2SmoothSegment.b2SmoothSegmentPointer asPointer() {
        return new b2SmoothSegment.b2SmoothSegmentPointer(getPointer(), getsGCFreed());
    }

    public b2Vec2 ghost1() {
        return __ghost1;
    }

    private static final int __ghost1_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __ghost1 = new b2Vec2(getPointer() + __ghost1_offset, false);

    public b2Segment segment() {
        return __segment;
    }

    private static final int __segment_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Segment __segment = new b2Segment(getPointer() + __segment_offset, false);

    public b2Vec2 ghost2() {
        return __ghost2;
    }

    private static final int __ghost2_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __ghost2 = new b2Vec2(getPointer() + __ghost2_offset, false);

    public int chainId() {
        return (int) getValue(0);
    }

    public void chainId(int chainId) {
        setValue(chainId, 0);
    }

    public static final class b2SmoothSegmentPointer extends StackElementPointer<b2SmoothSegment> {

        public b2SmoothSegmentPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2SmoothSegmentPointer() {
            this(1, true, true);
        }

        public b2SmoothSegmentPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2SmoothSegment.b2SmoothSegmentPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2SmoothSegment createStackElement(long ptr, boolean freeOnGC) {
            return new b2SmoothSegment(ptr, freeOnGC);
        }
    }
}
