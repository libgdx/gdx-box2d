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

    public b2Transform(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
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
        return new b2Transform.b2TransformPointer(getPointer(), false, 1, this);
    }

    public b2Vec2 p() {
        return new b2Vec2(getPointer(), false);
    }

    public void p(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    public b2Vec2 getP() {
        return new b2Vec2(getBufPtr().duplicate(0, 8), true);
    }

    public void getP(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    public void setP(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    public b2Rot q() {
        return new b2Rot(getPointer() + (8), false);
    }

    public void q(b2Rot toSetPtr) {
        toSetPtr.setPointer(getPointer() + (8), 8, this);
    }

    public b2Rot getQ() {
        return new b2Rot(getBufPtr().duplicate(8, 8), true);
    }

    public void getQ(b2Rot toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 8, 8);
    }

    public void setQ(b2Rot toCopyFrom) {
        getBufPtr().copyFrom(8, toCopyFrom.getBufPtr(), 0, 8);
    }

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

        public b2TransformPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
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
