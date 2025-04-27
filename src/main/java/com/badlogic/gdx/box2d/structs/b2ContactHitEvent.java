package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2ShapeId;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * A hit touch event is generated when two shapes collide with a speed faster than the hit speed threshold.
 */
public final class b2ContactHitEvent extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(27).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ContactHitEvent(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2ContactHitEvent(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2ContactHitEvent() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2ContactHitEvent.b2ContactHitEventPointer asPointer() {
        return new b2ContactHitEvent.b2ContactHitEventPointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2ContactHitEvent.b2ContactHitEventPointer ptr) {
        ptr.setPointer(this);
    }

    /**
     * Id of the first shape
     */
    public b2ShapeId shapeIdA() {
        return new b2ShapeId(getPointer(), false);
    }

    /**
     * Id of the first shape
     */
    public void shapeIdA(b2ShapeId toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    /**
     * Id of the first shape
     */
    public b2ShapeId getShapeIdA() {
        return new b2ShapeId(getBufPtr().duplicate(0, 8), true);
    }

    /**
     * Id of the first shape
     */
    public void getShapeIdA(b2ShapeId toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    /**
     * Id of the first shape
     */
    public void setShapeIdA(b2ShapeId toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * Id of the second shape
     */
    public b2ShapeId shapeIdB() {
        return new b2ShapeId(getPointer() + (8), false);
    }

    /**
     * Id of the second shape
     */
    public void shapeIdB(b2ShapeId toSetPtr) {
        toSetPtr.setPointer(getPointer() + (8), 8, this);
    }

    /**
     * Id of the second shape
     */
    public b2ShapeId getShapeIdB() {
        return new b2ShapeId(getBufPtr().duplicate(8, 8), true);
    }

    /**
     * Id of the second shape
     */
    public void getShapeIdB(b2ShapeId toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 8, 8);
    }

    /**
     * Id of the second shape
     */
    public void setShapeIdB(b2ShapeId toCopyFrom) {
        getBufPtr().copyFrom(8, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * Point where the shapes hit
     */
    public b2Vec2 point() {
        return new b2Vec2(getPointer() + (16), false);
    }

    /**
     * Point where the shapes hit
     */
    public void point(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (16), 8, this);
    }

    /**
     * Point where the shapes hit
     */
    public b2Vec2 getPoint() {
        return new b2Vec2(getBufPtr().duplicate(16, 8), true);
    }

    /**
     * Point where the shapes hit
     */
    public void getPoint(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 16, 8);
    }

    /**
     * Point where the shapes hit
     */
    public void setPoint(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(16, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * Normal vector pointing from shape A to shape B
     */
    public b2Vec2 normal() {
        return new b2Vec2(getPointer() + (24), false);
    }

    /**
     * Normal vector pointing from shape A to shape B
     */
    public void normal(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (24), 8, this);
    }

    /**
     * Normal vector pointing from shape A to shape B
     */
    public b2Vec2 getNormal() {
        return new b2Vec2(getBufPtr().duplicate(24, 8), true);
    }

    /**
     * Normal vector pointing from shape A to shape B
     */
    public void getNormal(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 24, 8);
    }

    /**
     * Normal vector pointing from shape A to shape B
     */
    public void setNormal(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(24, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * The speed the shapes are approaching. Always positive. Typically in meters per second.
     */
    public float approachSpeed() {
        return getBufPtr().getFloat(32);
    }

    /**
     * The speed the shapes are approaching. Always positive. Typically in meters per second.
     */
    public void approachSpeed(float approachSpeed) {
        getBufPtr().setFloat(32, approachSpeed);
    }

    public static final class b2ContactHitEventPointer extends StackElementPointer<b2ContactHitEvent> {

        public b2ContactHitEventPointer(VoidPointer pointer) {
            super(pointer);
        }

        public b2ContactHitEventPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ContactHitEventPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2ContactHitEventPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2ContactHitEventPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2ContactHitEventPointer() {
            this(1, true);
        }

        public b2ContactHitEventPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2ContactHitEvent createStackElement(long ptr, boolean freeOnGC) {
            return new b2ContactHitEvent(ptr, freeOnGC);
        }
    }
}
