package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2ShapeId;
import com.badlogic.gdx.box2d.structs.b2Vec2;

public final class b2RayResult extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(51).getFfiType();
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

    private static final int __point_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __point = new b2Vec2(getPointer() + __point_offset, false);

    public b2Vec2 normal() {
        return __normal;
    }

    private static final int __normal_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __normal = new b2Vec2(getPointer() + __normal_offset, false);

    public float fraction() {
        return (float) getValueFloat(0);
    }

    public void fraction(float fraction) {
        setValue(fraction, 0);
    }

    public int nodeVisits() {
        return (int) getValue(1);
    }

    public void nodeVisits(int nodeVisits) {
        setValue(nodeVisits, 1);
    }

    public int leafVisits() {
        return (int) getValue(2);
    }

    public void leafVisits(int leafVisits) {
        setValue(leafVisits, 2);
    }

    public boolean hit() {
        return getValue(3) != 0;
    }

    public void hit(boolean hit) {
        setValue(hit, 3);
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
