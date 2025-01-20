package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
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
        __ffi_type = FFITypes.getCTypeInfo(50).getFfiType();
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
        return new b2RayResult.b2RayResultPointer(getPointer(), getsGCFreed());
    }

    public b2ShapeId shapeId() {
        return __shapeId;
    }

    private static final int __shapeId_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2ShapeId __shapeId = new b2ShapeId(getPointer() + __shapeId_offset, false);

    public b2Vec2 point() {
        return __point;
    }

    private static final int __point_offset = CHandler.getOffsetForField(__ffi_type, 1);

    private final b2Vec2 __point = new b2Vec2(getPointer() + __point_offset, false);

    public b2Vec2 normal() {
        return __normal;
    }

    private static final int __normal_offset = CHandler.getOffsetForField(__ffi_type, 2);

    private final b2Vec2 __normal = new b2Vec2(getPointer() + __normal_offset, false);

    public float fraction() {
        return (float) getValueFloat(3);
    }

    public void fraction(float fraction) {
        setValue(fraction, 3);
    }

    public int nodeVisits() {
        return (int) getValue(4);
    }

    public void nodeVisits(int nodeVisits) {
        setValue(nodeVisits, 4);
    }

    public int leafVisits() {
        return (int) getValue(5);
    }

    public void leafVisits(int leafVisits) {
        setValue(leafVisits, 5);
    }

    public boolean hit() {
        return getValue(6) != 0;
    }

    public void hit(boolean hit) {
        setValue(hit, 6);
    }

    public static final class b2RayResultPointer extends StackElementPointer<b2RayResult> {

        public b2RayResultPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2RayResultPointer() {
            this(1, true, true);
        }

        public b2RayResultPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2RayResult.b2RayResultPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2RayResult createStackElement(long ptr, boolean freeOnGC) {
            return new b2RayResult(ptr, freeOnGC);
        }
    }
}
