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
        return new b2RayResult.b2RayResultPointer(getPointer(), false, this);
    }

    public b2ShapeId shapeId() {
        return __shapeId;
    }

    private static final int __shapeId_offset = 0;

    private final b2ShapeId __shapeId = new b2ShapeId(getPointer() + __shapeId_offset, false);

    public b2Vec2 point() {
        return __point;
    }

    private static final int __point_offset = 8;

    private final b2Vec2 __point = new b2Vec2(getPointer() + __point_offset, false);

    public b2Vec2 normal() {
        return __normal;
    }

    private static final int __normal_offset = 16;

    private final b2Vec2 __normal = new b2Vec2(getPointer() + __normal_offset, false);

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
