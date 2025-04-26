package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * Low level ray cast input data
 */
public final class b2RayCastInput extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(53).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2RayCastInput(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2RayCastInput(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2RayCastInput() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2RayCastInput.b2RayCastInputPointer asPointer() {
        return new b2RayCastInput.b2RayCastInputPointer(getPointer(), false, 1, this);
    }

    /**
     * Start point of the ray cast
     */
    public b2Vec2 origin() {
        return new b2Vec2(getPointer(), false);
    }

    /**
     * Start point of the ray cast
     */
    public void origin(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    /**
     * Start point of the ray cast
     */
    public b2Vec2 getOrigin() {
        return new b2Vec2(getBufPtr().duplicate(0, 8), true);
    }

    /**
     * Start point of the ray cast
     */
    public void getOrigin(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    /**
     * Start point of the ray cast
     */
    public void setOrigin(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * Translation of the ray cast
     */
    public b2Vec2 translation() {
        return new b2Vec2(getPointer() + (8), false);
    }

    /**
     * Translation of the ray cast
     */
    public void translation(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (8), 8, this);
    }

    /**
     * Translation of the ray cast
     */
    public b2Vec2 getTranslation() {
        return new b2Vec2(getBufPtr().duplicate(8, 8), true);
    }

    /**
     * Translation of the ray cast
     */
    public void getTranslation(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 8, 8);
    }

    /**
     * Translation of the ray cast
     */
    public void setTranslation(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(8, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * The maximum fraction of the translation to consider, typically 1
     */
    public float maxFraction() {
        return getBufPtr().getFloat(16);
    }

    /**
     * The maximum fraction of the translation to consider, typically 1
     */
    public void maxFraction(float maxFraction) {
        getBufPtr().setFloat(16, maxFraction);
    }

    public static final class b2RayCastInputPointer extends StackElementPointer<b2RayCastInput> {

        public b2RayCastInputPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2RayCastInputPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2RayCastInputPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2RayCastInputPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2RayCastInputPointer() {
            this(1, true);
        }

        public b2RayCastInputPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2RayCastInput createStackElement(long ptr, boolean freeOnGC) {
            return new b2RayCastInput(ptr, freeOnGC);
        }
    }
}
