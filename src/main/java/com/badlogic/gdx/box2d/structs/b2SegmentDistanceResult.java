package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * Result of computing the distance between two line segments
 */
public final class b2SegmentDistanceResult extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(58).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2SegmentDistanceResult(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2SegmentDistanceResult(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
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
        return new b2SegmentDistanceResult.b2SegmentDistanceResultPointer(getPointer(), false, 1, this);
    }

    /**
     * The closest point on the first segment
     */
    public b2Vec2 closest1() {
        return new b2Vec2(getPointer(), false);
    }

    /**
     * The closest point on the first segment
     */
    public void closest1(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    /**
     * The closest point on the first segment
     */
    public b2Vec2 getClosest1() {
        return new b2Vec2(getBufPtr().duplicate(0, 8), true);
    }

    /**
     * The closest point on the first segment
     */
    public void getClosest1(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    /**
     * The closest point on the first segment
     */
    public void setClosest1(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * The closest point on the second segment
     */
    public b2Vec2 closest2() {
        return new b2Vec2(getPointer() + (8), false);
    }

    /**
     * The closest point on the second segment
     */
    public void closest2(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (8), 8, this);
    }

    /**
     * The closest point on the second segment
     */
    public b2Vec2 getClosest2() {
        return new b2Vec2(getBufPtr().duplicate(8, 8), true);
    }

    /**
     * The closest point on the second segment
     */
    public void getClosest2(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 8, 8);
    }

    /**
     * The closest point on the second segment
     */
    public void setClosest2(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(8, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * The barycentric coordinate on the first segment
     */
    public float fraction1() {
        return getBufPtr().getFloat(16);
    }

    /**
     * The barycentric coordinate on the first segment
     */
    public void fraction1(float fraction1) {
        getBufPtr().setFloat(16, fraction1);
    }

    /**
     * The barycentric coordinate on the second segment
     */
    public float fraction2() {
        return getBufPtr().getFloat(20);
    }

    /**
     * The barycentric coordinate on the second segment
     */
    public void fraction2(float fraction2) {
        getBufPtr().setFloat(20, fraction2);
    }

    /**
     * The squared distance between the closest points
     */
    public float distanceSquared() {
        return getBufPtr().getFloat(24);
    }

    /**
     * The squared distance between the closest points
     */
    public void distanceSquared(float distanceSquared) {
        getBufPtr().setFloat(24, distanceSquared);
    }

    public static final class b2SegmentDistanceResultPointer extends StackElementPointer<b2SegmentDistanceResult> {

        public b2SegmentDistanceResultPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2SegmentDistanceResultPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2SegmentDistanceResultPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2SegmentDistanceResultPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2SegmentDistanceResultPointer() {
            this(1, true);
        }

        public b2SegmentDistanceResultPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2SegmentDistanceResult createStackElement(long ptr, boolean freeOnGC) {
            return new b2SegmentDistanceResult(ptr, freeOnGC);
        }
    }
}
