package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * Axis-aligned bounding box
 */
public final class b2AABB extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(11).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2AABB(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2AABB(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2AABB() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2AABB.b2AABBPointer asPointer() {
        return new b2AABB.b2AABBPointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2AABB.b2AABBPointer ptr) {
        ptr.setPointer(this);
    }

    public b2Vec2 lowerBound() {
        return new b2Vec2(getPointer(), false);
    }

    public void lowerBound(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    public b2Vec2 getLowerBound() {
        return new b2Vec2(getBufPtr().duplicate(0, 8), true);
    }

    public void getLowerBound(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    public void setLowerBound(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    public b2Vec2 upperBound() {
        return new b2Vec2(getPointer() + (8), false);
    }

    public void upperBound(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (8), 8, this);
    }

    public b2Vec2 getUpperBound() {
        return new b2Vec2(getBufPtr().duplicate(8, 8), true);
    }

    public void getUpperBound(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 8, 8);
    }

    public void setUpperBound(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(8, toCopyFrom.getBufPtr(), 0, 8);
    }

    public static final class b2AABBPointer extends StackElementPointer<b2AABB> {

        public b2AABBPointer(VoidPointer pointer) {
            super(pointer);
        }

        public b2AABBPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2AABBPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2AABBPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2AABBPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2AABBPointer() {
            this(1, true);
        }

        public b2AABBPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2AABB createStackElement(long ptr, boolean freeOnGC) {
            return new b2AABB(ptr, freeOnGC);
        }
    }
}
