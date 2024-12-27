package com.badlogic.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.box2d.FFITypes;
import com.badlogic.box2d.structs.b2Vec2;

public final class b2RayCastInput extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(49).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2RayCastInput(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
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
        return new b2RayCastInput.b2RayCastInputPointer(getPointer(), getsGCFreed());
    }

    public b2Vec2 origin() {
        return __origin;
    }

    private static final int __origin_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __origin = new b2Vec2(getPointer() + __origin_offset, false);

    public b2Vec2 translation() {
        return __translation;
    }

    private static final int __translation_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __translation = new b2Vec2(getPointer() + __translation_offset, false);

    public float maxFraction() {
        return (float) getValueFloat(0);
    }

    public void maxFraction(float maxFraction) {
        setValue(maxFraction, 0);
    }

    public static final class b2RayCastInputPointer extends StackElementPointer<b2RayCastInput> {

        public b2RayCastInputPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2RayCastInputPointer() {
            this(1, true, true);
        }

        public b2RayCastInputPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2RayCastInput.b2RayCastInputPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2RayCastInput createStackElement(long ptr, boolean freeOnGC) {
            return new b2RayCastInput(ptr, freeOnGC);
        }
    }
}
