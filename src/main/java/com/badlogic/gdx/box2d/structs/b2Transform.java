package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.box2d.structs.b2Rot;

/**
 * A 2D rigid transform
 */
public final class b2Transform extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(74).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2Transform(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2Transform() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2Transform.b2TransformPointer asPointer() {
        return new b2Transform.b2TransformPointer(getPointer(), false, this);
    }

    public b2Vec2 p() {
        return __p;
    }

    private static final int __p_offset = 0;

    private final b2Vec2 __p = new b2Vec2(getPointer() + __p_offset, false);

    public b2Rot q() {
        return __q;
    }

    private static final int __q_offset = 8;

    private final b2Rot __q = new b2Rot(getPointer() + __q_offset, false);

    public static final class b2TransformPointer extends StackElementPointer<b2Transform> {

        public b2TransformPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2TransformPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2TransformPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2TransformPointer() {
            this(1, true);
        }

        public b2TransformPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2Transform createStackElement(long ptr, boolean freeOnGC) {
            return new b2Transform(ptr, freeOnGC);
        }
    }
}
