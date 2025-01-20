package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * Result of computing the distance between two line segments
 */
public final class b2SegmentDistanceResult extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(54).getFfiType();
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

    /**
     * The closest point on the first segment
     */
    public b2Vec2 closest1() {
        return __closest1;
    }

    private static final int __closest1_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __closest1 = new b2Vec2(getPointer() + __closest1_offset, false);

    /**
     * The closest point on the second segment
     */
    public b2Vec2 closest2() {
        return __closest2;
    }

    private static final int __closest2_offset = CHandler.getOffsetForField(__ffi_type, 1);

    private final b2Vec2 __closest2 = new b2Vec2(getPointer() + __closest2_offset, false);

    /**
     * The barycentric coordinate on the first segment
     */
    public float fraction1() {
        return (float) getValueFloat(2);
    }

    /**
     * The barycentric coordinate on the first segment
     */
    public void fraction1(float fraction1) {
        setValue(fraction1, 2);
    }

    /**
     * The barycentric coordinate on the second segment
     */
    public float fraction2() {
        return (float) getValueFloat(3);
    }

    /**
     * The barycentric coordinate on the second segment
     */
    public void fraction2(float fraction2) {
        setValue(fraction2, 3);
    }

    /**
     * The squared distance between the closest points
     */
    public float distanceSquared() {
        return (float) getValueFloat(4);
    }

    /**
     * The squared distance between the closest points
     */
    public void distanceSquared(float distanceSquared) {
        setValue(distanceSquared, 4);
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
