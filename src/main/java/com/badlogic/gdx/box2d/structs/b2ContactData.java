package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2ShapeId;
import com.badlogic.gdx.box2d.structs.b2Manifold;

/**
 * The contact data for two shapes. By convention the manifold normal points
 * from shape A to shape B.
 * @see b2Shape_GetContactData() and b2Body_GetContactData()
 */
public final class b2ContactData extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(24).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ContactData(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2ContactData(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2ContactData() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2ContactData.b2ContactDataPointer asPointer() {
        return new b2ContactData.b2ContactDataPointer(getPointer(), false, 1, this);
    }

    public b2ShapeId shapeIdA() {
        return new b2ShapeId(getPointer(), false);
    }

    public void shapeIdA(b2ShapeId toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    public b2ShapeId getShapeIdA() {
        return new b2ShapeId(getBufPtr().duplicate(0, 8), true);
    }

    public void getShapeIdA(b2ShapeId toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    public void setShapeIdA(b2ShapeId toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    public b2ShapeId shapeIdB() {
        return new b2ShapeId(getPointer() + (8), false);
    }

    public void shapeIdB(b2ShapeId toSetPtr) {
        toSetPtr.setPointer(getPointer() + (8), 8, this);
    }

    public b2ShapeId getShapeIdB() {
        return new b2ShapeId(getBufPtr().duplicate(8, 8), true);
    }

    public void getShapeIdB(b2ShapeId toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 8, 8);
    }

    public void setShapeIdB(b2ShapeId toCopyFrom) {
        getBufPtr().copyFrom(8, toCopyFrom.getBufPtr(), 0, 8);
    }

    public b2Manifold manifold() {
        return new b2Manifold(getPointer() + (16), false);
    }

    public void manifold(b2Manifold toSetPtr) {
        toSetPtr.setPointer(getPointer() + (16), 112, this);
    }

    public b2Manifold getManifold() {
        return new b2Manifold(getBufPtr().duplicate(16, 112), true);
    }

    public void getManifold(b2Manifold toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 16, 112);
    }

    public void setManifold(b2Manifold toCopyFrom) {
        getBufPtr().copyFrom(16, toCopyFrom.getBufPtr(), 0, 112);
    }

    public static final class b2ContactDataPointer extends StackElementPointer<b2ContactData> {

        public b2ContactDataPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ContactDataPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2ContactDataPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2ContactDataPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2ContactDataPointer() {
            this(1, true);
        }

        public b2ContactDataPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2ContactData createStackElement(long ptr, boolean freeOnGC) {
            return new b2ContactData(ptr, freeOnGC);
        }
    }
}
