package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2ShapeProxy;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * Low level shape cast input in generic form. This allows casting an arbitrary point
 * cloud wrap with a radius. For example, a circle is a single point with a non-zero radius.
 * A capsule is two points with a non-zero radius. A box is four points with a zero radius.
 */
public final class b2ShapeCastInput extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(62).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ShapeCastInput(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2ShapeCastInput(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2ShapeCastInput() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2ShapeCastInput.b2ShapeCastInputPointer asPointer() {
        return new b2ShapeCastInput.b2ShapeCastInputPointer(getPointer(), false, 1, this);
    }

    /**
     * A generic shape
     */
    public b2ShapeProxy proxy() {
        return new b2ShapeProxy(getPointer(), false);
    }

    /**
     * A generic shape
     */
    public void proxy(b2ShapeProxy toSetPtr) {
        toSetPtr.setPointer(getPointer(), 72, this);
    }

    /**
     * A generic shape
     */
    public b2ShapeProxy getProxy() {
        return new b2ShapeProxy(getBufPtr().duplicate(0, 72), true);
    }

    /**
     * A generic shape
     */
    public void getProxy(b2ShapeProxy toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 72);
    }

    /**
     * A generic shape
     */
    public void setProxy(b2ShapeProxy toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 72);
    }

    /**
     * The translation of the shape cast
     */
    public b2Vec2 translation() {
        return new b2Vec2(getPointer() + (72), false);
    }

    /**
     * The translation of the shape cast
     */
    public void translation(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (72), 8, this);
    }

    /**
     * The translation of the shape cast
     */
    public b2Vec2 getTranslation() {
        return new b2Vec2(getBufPtr().duplicate(72, 8), true);
    }

    /**
     * The translation of the shape cast
     */
    public void getTranslation(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 72, 8);
    }

    /**
     * The translation of the shape cast
     */
    public void setTranslation(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(72, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * The maximum fraction of the translation to consider, typically 1
     */
    public float maxFraction() {
        return getBufPtr().getFloat(80);
    }

    /**
     * The maximum fraction of the translation to consider, typically 1
     */
    public void maxFraction(float maxFraction) {
        getBufPtr().setFloat(80, maxFraction);
    }

    /**
     * Allow shape cast to encroach when initially touching. This only works if the radius is greater than zero.
     */
    public boolean canEncroach() {
        return getBufPtr().getBoolean(84);
    }

    /**
     * Allow shape cast to encroach when initially touching. This only works if the radius is greater than zero.
     */
    public void canEncroach(boolean canEncroach) {
        getBufPtr().setBoolean(84, canEncroach);
    }

    public static final class b2ShapeCastInputPointer extends StackElementPointer<b2ShapeCastInput> {

        public b2ShapeCastInputPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ShapeCastInputPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2ShapeCastInputPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2ShapeCastInputPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2ShapeCastInputPointer() {
            this(1, true);
        }

        public b2ShapeCastInputPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2ShapeCastInput createStackElement(long ptr, boolean freeOnGC) {
            return new b2ShapeCastInput(ptr, freeOnGC);
        }
    }
}
