package com.badlogic.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.box2d.FFITypes;
import com.badlogic.box2d.structs.b2DistanceProxy;
import com.badlogic.box2d.structs.b2Transform;
import com.badlogic.box2d.structs.b2Vec2;

public final class b2ShapeCastPairInput extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

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
        return new b2ShapeCastPairInput.b2ShapeCastPairInputPointer(getPointer(), getsGCFreed());
    }

    public b2DistanceProxy proxyA() {
        return __proxyA;
    }

    private static final int __proxyA_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2DistanceProxy __proxyA = new b2DistanceProxy(getPointer() + __proxyA_offset, false);

    public b2DistanceProxy proxyB() {
        return __proxyB;
    }

    private static final int __proxyB_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2DistanceProxy __proxyB = new b2DistanceProxy(getPointer() + __proxyB_offset, false);

    public b2Transform transformA() {
        return __transformA;
    }

    private static final int __transformA_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Transform __transformA = new b2Transform(getPointer() + __transformA_offset, false);

    public b2Transform transformB() {
        return __transformB;
    }

    private static final int __transformB_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Transform __transformB = new b2Transform(getPointer() + __transformB_offset, false);

    public b2Vec2 translationB() {
        return __translationB;
    }

    private static final int __translationB_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __translationB = new b2Vec2(getPointer() + __translationB_offset, false);

    public float maxFraction() {
        return (float) getValueFloat(0);
    }

    public void maxFraction(float maxFraction) {
        setValue(maxFraction, 0);
    }

    public static final class b2ShapeCastPairInputPointer extends StackElementPointer<b2ShapeCastPairInput> {

        public b2ShapeCastPairInputPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ShapeCastPairInputPointer() {
            this(1, true, true);
        }

        public b2ShapeCastPairInputPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2ShapeCastPairInput.b2ShapeCastPairInputPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2ShapeCastPairInput createStackElement(long ptr, boolean freeOnGC) {
            return new b2ShapeCastPairInput(ptr, freeOnGC);
        }
    }
}
