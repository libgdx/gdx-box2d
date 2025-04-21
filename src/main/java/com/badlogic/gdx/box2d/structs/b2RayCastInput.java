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
        return new b2RayCastInput.b2RayCastInputPointer(getPointer(), false, this);
    }

    /**
     * Start point of the ray cast
     */
    public b2Vec2 origin() {
        return __origin;
    }

    private static final int __origin_offset = 0;

    private final b2Vec2 __origin = new b2Vec2(getPointer() + __origin_offset, false);

    /**
     * Translation of the ray cast
     */
    public b2Vec2 translation() {
        return __translation;
    }

    private static final int __translation_offset = 8;

    private final b2Vec2 __translation = new b2Vec2(getPointer() + __translation_offset, false);

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
