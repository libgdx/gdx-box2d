package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2ShapeProxy;
import com.badlogic.gdx.box2d.structs.b2Transform;

/**
 * Input for b2ShapeDistance
 */
public final class b2DistanceInput extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(31).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2DistanceInput(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2DistanceInput(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2DistanceInput() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2DistanceInput.b2DistanceInputPointer asPointer() {
        return new b2DistanceInput.b2DistanceInputPointer(getPointer(), false, 1, this);
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
     * The world transform for shape A
     */
    public b2Transform transformA() {
        return new b2Transform(getPointer() + (144), false);
    }

    /**
     * The world transform for shape A
     */
    public void transformA(b2Transform toSetPtr) {
        toSetPtr.setPointer(getPointer() + (144), 16, this);
    }

    /**
     * The world transform for shape A
     */
    public b2Transform getTransformA() {
        return new b2Transform(getBufPtr().duplicate(144, 16), true);
    }

    /**
     * The world transform for shape A
     */
    public void getTransformA(b2Transform toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 144, 16);
    }

    /**
     * The world transform for shape A
     */
    public void setTransformA(b2Transform toCopyFrom) {
        getBufPtr().copyFrom(144, toCopyFrom.getBufPtr(), 0, 16);
    }

    /**
     * The world transform for shape B
     */
    public b2Transform transformB() {
        return new b2Transform(getPointer() + (160), false);
    }

    /**
     * The world transform for shape B
     */
    public void transformB(b2Transform toSetPtr) {
        toSetPtr.setPointer(getPointer() + (160), 16, this);
    }

    /**
     * The world transform for shape B
     */
    public b2Transform getTransformB() {
        return new b2Transform(getBufPtr().duplicate(160, 16), true);
    }

    /**
     * The world transform for shape B
     */
    public void getTransformB(b2Transform toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 160, 16);
    }

    /**
     * The world transform for shape B
     */
    public void setTransformB(b2Transform toCopyFrom) {
        getBufPtr().copyFrom(160, toCopyFrom.getBufPtr(), 0, 16);
    }

    /**
     * Should the proxy radius be considered?
     */
    public boolean useRadii() {
        return getBufPtr().getBoolean(176);
    }

    /**
     * Should the proxy radius be considered?
     */
    public void useRadii(boolean useRadii) {
        getBufPtr().setBoolean(176, useRadii);
    }

    public static final class b2DistanceInputPointer extends StackElementPointer<b2DistanceInput> {

        public b2DistanceInputPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2DistanceInputPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2DistanceInputPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2DistanceInputPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2DistanceInputPointer() {
            this(1, true);
        }

        public b2DistanceInputPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2DistanceInput createStackElement(long ptr, boolean freeOnGC) {
            return new b2DistanceInput(ptr, freeOnGC);
        }
    }
}
