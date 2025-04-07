package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
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
        __ffi_type = FFITypes.getCTypeInfo(59).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ShapeCastPairInput(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
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
        return new b2ShapeCastPairInput.b2ShapeCastPairInputPointer(getPointer(), false, this);
    }

    /**
     * The proxy for shape A
     */
    public b2ShapeProxy proxyA() {
        return __proxyA;
    }

    private static final int __proxyA_offset = 0;

    private final b2ShapeProxy __proxyA = new b2ShapeProxy(getPointer() + __proxyA_offset, false);

    /**
     * The proxy for shape B
     */
    public b2ShapeProxy proxyB() {
        return __proxyB;
    }

    private static final int __proxyB_offset = 72;

    private final b2ShapeProxy __proxyB = new b2ShapeProxy(getPointer() + __proxyB_offset, false);

    /**
     * The world transform for shape A
     */
    public b2Transform transformA() {
        return __transformA;
    }

    private static final int __transformA_offset = 144;

    private final b2Transform __transformA = new b2Transform(getPointer() + __transformA_offset, false);

    /**
     * The world transform for shape B
     */
    public b2Transform transformB() {
        return __transformB;
    }

    private static final int __transformB_offset = 160;

    private final b2Transform __transformB = new b2Transform(getPointer() + __transformB_offset, false);

    /**
     * The translation of shape B
     */
    public b2Vec2 translationB() {
        return __translationB;
    }

    private static final int __translationB_offset = 176;

    private final b2Vec2 __translationB = new b2Vec2(getPointer() + __translationB_offset, false);

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

    public static final class b2ShapeCastPairInputPointer extends StackElementPointer<b2ShapeCastPairInput> {

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
