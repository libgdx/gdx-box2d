package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2ShapeId;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * Result from b2World_RayCastClosest
 * @ingroup world
 */
public final class b2RayResult extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(54).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2RayResult(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2RayResult(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2RayResult() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2RayResult.b2RayResultPointer asPointer() {
        return new b2RayResult.b2RayResultPointer(getPointer(), false, 1, this);
    }

    public b2ShapeId shapeId() {
        return new b2ShapeId(getPointer(), false);
    }

    public void shapeId(b2ShapeId toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    public b2ShapeId getShapeId() {
        return new b2ShapeId(getBufPtr().duplicate(0, 8), true);
    }

    public void getShapeId(b2ShapeId toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    public void setShapeId(b2ShapeId toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    public b2Vec2 point() {
        return new b2Vec2(getPointer() + (8), false);
    }

    public void point(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (8), 8, this);
    }

    public b2Vec2 getPoint() {
        return new b2Vec2(getBufPtr().duplicate(8, 8), true);
    }

    public void getPoint(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 8, 8);
    }

    public void setPoint(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(8, toCopyFrom.getBufPtr(), 0, 8);
    }

    public b2Vec2 normal() {
        return new b2Vec2(getPointer() + (16), false);
    }

    public void normal(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (16), 8, this);
    }

    public b2Vec2 getNormal() {
        return new b2Vec2(getBufPtr().duplicate(16, 8), true);
    }

    public void getNormal(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 16, 8);
    }

    public void setNormal(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(16, toCopyFrom.getBufPtr(), 0, 8);
    }

    public float fraction() {
        return getBufPtr().getFloat(24);
    }

    public void fraction(float fraction) {
        getBufPtr().setFloat(24, fraction);
    }

    public int nodeVisits() {
        return getBufPtr().getInt(28);
    }

    public void nodeVisits(int nodeVisits) {
        getBufPtr().setInt(28, nodeVisits);
    }

    public int leafVisits() {
        return getBufPtr().getInt(32);
    }

    public void leafVisits(int leafVisits) {
        getBufPtr().setInt(32, leafVisits);
    }

    public boolean hit() {
        return getBufPtr().getBoolean(36);
    }

    public void hit(boolean hit) {
        getBufPtr().setBoolean(36, hit);
    }

    public static final class b2RayResultPointer extends StackElementPointer<b2RayResult> {

        public b2RayResultPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2RayResultPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2RayResultPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2RayResultPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2RayResultPointer() {
            this(1, true);
        }

        public b2RayResultPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2RayResult createStackElement(long ptr, boolean freeOnGC) {
            return new b2RayResult(ptr, freeOnGC);
        }
    }
}
