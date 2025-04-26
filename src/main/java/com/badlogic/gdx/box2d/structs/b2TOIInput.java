package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2ShapeProxy;
import com.badlogic.gdx.box2d.structs.b2Sweep;

/**
 * Input parameters for b2TimeOfImpact
 */
public final class b2TOIInput extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(72).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2TOIInput(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2TOIInput(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2TOIInput() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2TOIInput.b2TOIInputPointer asPointer() {
        return new b2TOIInput.b2TOIInputPointer(getPointer(), false, 1, this);
    }

    /**
     * The proxy for shape A
     */
    public b2ShapeProxy proxyA() {
        return new b2ShapeProxy(getPointer(), false);
    }

    /**
     * The proxy for shape A
     */
    public void proxyA(b2ShapeProxy toSetPtr) {
        toSetPtr.setPointer(getPointer(), 72, this);
    }

    /**
     * The proxy for shape A
     */
    public b2ShapeProxy getProxyA() {
        return new b2ShapeProxy(getBufPtr().duplicate(0, 72), true);
    }

    /**
     * The proxy for shape A
     */
    public void getProxyA(b2ShapeProxy toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 72);
    }

    /**
     * The proxy for shape A
     */
    public void setProxyA(b2ShapeProxy toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 72);
    }

    /**
     * The proxy for shape B
     */
    public b2ShapeProxy proxyB() {
        return new b2ShapeProxy(getPointer() + (72), false);
    }

    /**
     * The proxy for shape B
     */
    public void proxyB(b2ShapeProxy toSetPtr) {
        toSetPtr.setPointer(getPointer() + (72), 72, this);
    }

    /**
     * The proxy for shape B
     */
    public b2ShapeProxy getProxyB() {
        return new b2ShapeProxy(getBufPtr().duplicate(72, 72), true);
    }

    /**
     * The proxy for shape B
     */
    public void getProxyB(b2ShapeProxy toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 72, 72);
    }

    /**
     * The proxy for shape B
     */
    public void setProxyB(b2ShapeProxy toCopyFrom) {
        getBufPtr().copyFrom(72, toCopyFrom.getBufPtr(), 0, 72);
    }

    /**
     * The movement of shape A
     */
    public b2Sweep sweepA() {
        return new b2Sweep(getPointer() + (144), false);
    }

    /**
     * The movement of shape A
     */
    public void sweepA(b2Sweep toSetPtr) {
        toSetPtr.setPointer(getPointer() + (144), 40, this);
    }

    /**
     * The movement of shape A
     */
    public b2Sweep getSweepA() {
        return new b2Sweep(getBufPtr().duplicate(144, 40), true);
    }

    /**
     * The movement of shape A
     */
    public void getSweepA(b2Sweep toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 144, 40);
    }

    /**
     * The movement of shape A
     */
    public void setSweepA(b2Sweep toCopyFrom) {
        getBufPtr().copyFrom(144, toCopyFrom.getBufPtr(), 0, 40);
    }

    /**
     * The movement of shape B
     */
    public b2Sweep sweepB() {
        return new b2Sweep(getPointer() + (184), false);
    }

    /**
     * The movement of shape B
     */
    public void sweepB(b2Sweep toSetPtr) {
        toSetPtr.setPointer(getPointer() + (184), 40, this);
    }

    /**
     * The movement of shape B
     */
    public b2Sweep getSweepB() {
        return new b2Sweep(getBufPtr().duplicate(184, 40), true);
    }

    /**
     * The movement of shape B
     */
    public void getSweepB(b2Sweep toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 184, 40);
    }

    /**
     * The movement of shape B
     */
    public void setSweepB(b2Sweep toCopyFrom) {
        getBufPtr().copyFrom(184, toCopyFrom.getBufPtr(), 0, 40);
    }

    /**
     * Defines the sweep interval [0, maxFraction]
     */
    public float maxFraction() {
        return getBufPtr().getFloat(224);
    }

    /**
     * Defines the sweep interval [0, maxFraction]
     */
    public void maxFraction(float maxFraction) {
        getBufPtr().setFloat(224, maxFraction);
    }

    public static final class b2TOIInputPointer extends StackElementPointer<b2TOIInput> {

        public b2TOIInputPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2TOIInputPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2TOIInputPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2TOIInputPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2TOIInputPointer() {
            this(1, true);
        }

        public b2TOIInputPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2TOIInput createStackElement(long ptr, boolean freeOnGC) {
            return new b2TOIInput(ptr, freeOnGC);
        }
    }
}
