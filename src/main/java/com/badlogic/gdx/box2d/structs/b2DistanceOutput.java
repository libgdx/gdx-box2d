package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * Output for b2ShapeDistance
 */
public final class b2DistanceOutput extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(33).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2DistanceOutput(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2DistanceOutput(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2DistanceOutput() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2DistanceOutput.b2DistanceOutputPointer asPointer() {
        return new b2DistanceOutput.b2DistanceOutputPointer(getPointer(), false, 1, this);
    }

    /**
     * Closest point on shapeA
     */
    public b2Vec2 pointA() {
        return new b2Vec2(getPointer(), false);
    }

    /**
     * Closest point on shapeA
     */
    public void pointA(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    /**
     * Closest point on shapeA
     */
    public b2Vec2 getPointA() {
        return new b2Vec2(getBufPtr().duplicate(0, 8), true);
    }

    /**
     * Closest point on shapeA
     */
    public void getPointA(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    /**
     * Closest point on shapeA
     */
    public void setPointA(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * Closest point on shapeB
     */
    public b2Vec2 pointB() {
        return new b2Vec2(getPointer() + (8), false);
    }

    /**
     * Closest point on shapeB
     */
    public void pointB(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (8), 8, this);
    }

    /**
     * Closest point on shapeB
     */
    public b2Vec2 getPointB() {
        return new b2Vec2(getBufPtr().duplicate(8, 8), true);
    }

    /**
     * Closest point on shapeB
     */
    public void getPointB(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 8, 8);
    }

    /**
     * Closest point on shapeB
     */
    public void setPointB(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(8, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * Normal vector that points from A to B
     */
    public b2Vec2 normal() {
        return new b2Vec2(getPointer() + (16), false);
    }

    /**
     * Normal vector that points from A to B
     */
    public void normal(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (16), 8, this);
    }

    /**
     * Normal vector that points from A to B
     */
    public b2Vec2 getNormal() {
        return new b2Vec2(getBufPtr().duplicate(16, 8), true);
    }

    /**
     * Normal vector that points from A to B
     */
    public void getNormal(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 16, 8);
    }

    /**
     * Normal vector that points from A to B
     */
    public void setNormal(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(16, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * The final distance, zero if overlapped
     */
    public float distance() {
        return getBufPtr().getFloat(24);
    }

    /**
     * The final distance, zero if overlapped
     */
    public void distance(float distance) {
        getBufPtr().setFloat(24, distance);
    }

    /**
     * Number of GJK iterations used
     */
    public int iterations() {
        return getBufPtr().getInt(28);
    }

    /**
     * Number of GJK iterations used
     */
    public void iterations(int iterations) {
        getBufPtr().setInt(28, iterations);
    }

    /**
     * The number of simplexes stored in the simplex array
     */
    public int simplexCount() {
        return getBufPtr().getInt(32);
    }

    /**
     * The number of simplexes stored in the simplex array
     */
    public void simplexCount(int simplexCount) {
        getBufPtr().setInt(32, simplexCount);
    }

    public static final class b2DistanceOutputPointer extends StackElementPointer<b2DistanceOutput> {

        public b2DistanceOutputPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2DistanceOutputPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2DistanceOutputPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2DistanceOutputPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2DistanceOutputPointer() {
            this(1, true);
        }

        public b2DistanceOutputPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2DistanceOutput createStackElement(long ptr, boolean freeOnGC) {
            return new b2DistanceOutput(ptr, freeOnGC);
        }
    }
}
