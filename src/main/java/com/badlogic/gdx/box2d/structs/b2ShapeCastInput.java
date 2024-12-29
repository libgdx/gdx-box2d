package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

public final class b2ShapeCastInput extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(59).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ShapeCastInput(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
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
        return new b2ShapeCastInput.b2ShapeCastInputPointer(getPointer(), getsGCFreed());
    }

    public b2Vec2.b2Vec2Pointer points() {
        return __points;
    }

    private static final int __points_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2.b2Vec2Pointer __points = new b2Vec2.b2Vec2Pointer(getPointer() + __points_offset, false).guardCount(8);

    public int count() {
        return (int) getValue(8);
    }

    public void count(int count) {
        setValue(count, 8);
    }

    public float radius() {
        return (float) getValueFloat(9);
    }

    public void radius(float radius) {
        setValue(radius, 9);
    }

    public b2Vec2 translation() {
        return __translation;
    }

    private static final int __translation_offset = CHandler.getOffsetForField(__ffi_type, 10);

    private final b2Vec2 __translation = new b2Vec2(getPointer() + __translation_offset, false);

    public float maxFraction() {
        return (float) getValueFloat(11);
    }

    public void maxFraction(float maxFraction) {
        setValue(maxFraction, 11);
    }

    public static final class b2ShapeCastInputPointer extends StackElementPointer<b2ShapeCastInput> {

        public b2ShapeCastInputPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ShapeCastInputPointer() {
            this(1, true, true);
        }

        public b2ShapeCastInputPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2ShapeCastInput.b2ShapeCastInputPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2ShapeCastInput createStackElement(long ptr, boolean freeOnGC) {
            return new b2ShapeCastInput(ptr, freeOnGC);
        }
    }
}
