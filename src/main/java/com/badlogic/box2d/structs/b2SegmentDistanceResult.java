package com.badlogic.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.box2d.FFITypes;
import com.badlogic.box2d.structs.b2Vec2;

public final class b2SegmentDistanceResult extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(55).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2SegmentDistanceResult(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2SegmentDistanceResult() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2SegmentDistanceResult.b2SegmentDistanceResultPointer asPointer() {
        return new b2SegmentDistanceResult.b2SegmentDistanceResultPointer(getPointer(), getsGCFreed());
    }

    public b2Vec2 closest1() {
        return __closest1;
    }

    private static final int __closest1_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __closest1 = new b2Vec2(getPointer() + __closest1_offset, false);

    public b2Vec2 closest2() {
        return __closest2;
    }

    private static final int __closest2_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __closest2 = new b2Vec2(getPointer() + __closest2_offset, false);

    public float fraction1() {
        return (float) getValueFloat(0);
    }

    public void fraction1(float fraction1) {
        setValue(fraction1, 0);
    }

    public float fraction2() {
        return (float) getValueFloat(1);
    }

    public void fraction2(float fraction2) {
        setValue(fraction2, 1);
    }

    public float distanceSquared() {
        return (float) getValueFloat(2);
    }

    public void distanceSquared(float distanceSquared) {
        setValue(distanceSquared, 2);
    }

    public static final class b2SegmentDistanceResultPointer extends StackElementPointer<b2SegmentDistanceResult> {

        public b2SegmentDistanceResultPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2SegmentDistanceResultPointer() {
            this(1, true, true);
        }

        public b2SegmentDistanceResultPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2SegmentDistanceResult.b2SegmentDistanceResultPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2SegmentDistanceResult createStackElement(long ptr, boolean freeOnGC) {
            return new b2SegmentDistanceResult(ptr, freeOnGC);
        }
    }
}
