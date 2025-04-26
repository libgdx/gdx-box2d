package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.box2d.structs.b2Rot;

/**
 * This describes the motion of a body/shape for TOI computation. Shapes are defined with respect to the body origin,
 * which may not coincide with the center of mass. However, to support dynamics we must interpolate the center of mass
 * position.
 */
public final class b2Sweep extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(71).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2Sweep(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2Sweep(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2Sweep() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2Sweep.b2SweepPointer asPointer() {
        return new b2Sweep.b2SweepPointer(getPointer(), false, 1, this);
    }

    /**
     * Local center of mass position
     */
    public b2Vec2 localCenter() {
        return new b2Vec2(getPointer(), false);
    }

    /**
     * Local center of mass position
     */
    public void localCenter(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    /**
     * Local center of mass position
     */
    public b2Vec2 getLocalCenter() {
        return new b2Vec2(getBufPtr().duplicate(0, 8), true);
    }

    /**
     * Local center of mass position
     */
    public void getLocalCenter(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    /**
     * Local center of mass position
     */
    public void setLocalCenter(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * Starting center of mass world position
     */
    public b2Vec2 c1() {
        return new b2Vec2(getPointer() + (8), false);
    }

    /**
     * Starting center of mass world position
     */
    public void c1(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (8), 8, this);
    }

    /**
     * Starting center of mass world position
     */
    public b2Vec2 getC1() {
        return new b2Vec2(getBufPtr().duplicate(8, 8), true);
    }

    /**
     * Starting center of mass world position
     */
    public void getC1(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 8, 8);
    }

    /**
     * Starting center of mass world position
     */
    public void setC1(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(8, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * Ending center of mass world position
     */
    public b2Vec2 c2() {
        return new b2Vec2(getPointer() + (16), false);
    }

    /**
     * Ending center of mass world position
     */
    public void c2(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (16), 8, this);
    }

    /**
     * Ending center of mass world position
     */
    public b2Vec2 getC2() {
        return new b2Vec2(getBufPtr().duplicate(16, 8), true);
    }

    /**
     * Ending center of mass world position
     */
    public void getC2(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 16, 8);
    }

    /**
     * Ending center of mass world position
     */
    public void setC2(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(16, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * Starting world rotation
     */
    public b2Rot q1() {
        return new b2Rot(getPointer() + (24), false);
    }

    /**
     * Starting world rotation
     */
    public void q1(b2Rot toSetPtr) {
        toSetPtr.setPointer(getPointer() + (24), 8, this);
    }

    /**
     * Starting world rotation
     */
    public b2Rot getQ1() {
        return new b2Rot(getBufPtr().duplicate(24, 8), true);
    }

    /**
     * Starting world rotation
     */
    public void getQ1(b2Rot toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 24, 8);
    }

    /**
     * Starting world rotation
     */
    public void setQ1(b2Rot toCopyFrom) {
        getBufPtr().copyFrom(24, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * Ending world rotation
     */
    public b2Rot q2() {
        return new b2Rot(getPointer() + (32), false);
    }

    /**
     * Ending world rotation
     */
    public void q2(b2Rot toSetPtr) {
        toSetPtr.setPointer(getPointer() + (32), 8, this);
    }

    /**
     * Ending world rotation
     */
    public b2Rot getQ2() {
        return new b2Rot(getBufPtr().duplicate(32, 8), true);
    }

    /**
     * Ending world rotation
     */
    public void getQ2(b2Rot toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 32, 8);
    }

    /**
     * Ending world rotation
     */
    public void setQ2(b2Rot toCopyFrom) {
        getBufPtr().copyFrom(32, toCopyFrom.getBufPtr(), 0, 8);
    }

    public static final class b2SweepPointer extends StackElementPointer<b2Sweep> {

        public b2SweepPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2SweepPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2SweepPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2SweepPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2SweepPointer() {
            this(1, true);
        }

        public b2SweepPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2Sweep createStackElement(long ptr, boolean freeOnGC) {
            return new b2Sweep(ptr, freeOnGC);
        }
    }
}
