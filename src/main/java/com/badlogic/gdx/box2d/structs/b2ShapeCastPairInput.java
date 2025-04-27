package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2ShapeProxy;
import com.badlogic.gdx.box2d.structs.b2Transform;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * Input parameters for b2ShapeCast
 */
public final class b2ShapeCastPairInput extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(63).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ShapeCastPairInput(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2ShapeCastPairInput(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2ShapeCastPairInput() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2ShapeCastPairInput.b2ShapeCastPairInputPointer asPointer() {
        return new b2ShapeCastPairInput.b2ShapeCastPairInputPointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2ShapeCastPairInput.b2ShapeCastPairInputPointer ptr) {
        ptr.setPointer(this);
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
     * The translation of shape B
     */
    public b2Vec2 translationB() {
        return new b2Vec2(getPointer() + (176), false);
    }

    /**
     * The translation of shape B
     */
    public void translationB(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (176), 8, this);
    }

    /**
     * The translation of shape B
     */
    public b2Vec2 getTranslationB() {
        return new b2Vec2(getBufPtr().duplicate(176, 8), true);
    }

    /**
     * The translation of shape B
     */
    public void getTranslationB(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 176, 8);
    }

    /**
     * The translation of shape B
     */
    public void setTranslationB(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(176, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * The fraction of the translation to consider, typically 1
     */
    public float maxFraction() {
        return getBufPtr().getFloat(184);
    }

    /**
     * The fraction of the translation to consider, typically 1
     */
    public void maxFraction(float maxFraction) {
        getBufPtr().setFloat(184, maxFraction);
    }

    /**
     * Allows shapes with a radius to move slightly closer if already touching
     */
    public boolean canEncroach() {
        return getBufPtr().getBoolean(188);
    }

    /**
     * Allows shapes with a radius to move slightly closer if already touching
     */
    public void canEncroach(boolean canEncroach) {
        getBufPtr().setBoolean(188, canEncroach);
    }

    public static final class b2ShapeCastPairInputPointer extends StackElementPointer<b2ShapeCastPairInput> {

        public b2ShapeCastPairInputPointer(VoidPointer pointer) {
            super(pointer);
        }

        public b2ShapeCastPairInputPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ShapeCastPairInputPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2ShapeCastPairInputPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2ShapeCastPairInputPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2ShapeCastPairInputPointer() {
            this(1, true);
        }

        public b2ShapeCastPairInputPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2ShapeCastPairInput createStackElement(long ptr, boolean freeOnGC) {
            return new b2ShapeCastPairInput(ptr, freeOnGC);
        }
    }
}
