package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
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
        __ffi_type = FFITypes.getCTypeInfo(26).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ContactHitEvent(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
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
        return new b2ContactHitEvent.b2ContactHitEventPointer(getPointer(), getsGCFreed());
    }

    /**
     * Id of the first shape
     */
    public b2ShapeId shapeIdA() {
        return __shapeIdA;
    }

    private static final int __shapeIdA_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2ShapeId __shapeIdA = new b2ShapeId(getPointer() + __shapeIdA_offset, false);

    /**
     * Id of the second shape
     */
    public b2ShapeId shapeIdB() {
        return __shapeIdB;
    }

    private static final int __shapeIdB_offset = CHandler.getOffsetForField(__ffi_type, 1);

    private final b2ShapeId __shapeIdB = new b2ShapeId(getPointer() + __shapeIdB_offset, false);

    /**
     * Point where the shapes hit
     */
    public b2Vec2 point() {
        return __point;
    }

    private static final int __point_offset = CHandler.getOffsetForField(__ffi_type, 2);

    private final b2Vec2 __point = new b2Vec2(getPointer() + __point_offset, false);

    /**
     * Normal vector pointing from shape A to shape B
     */
    public b2Vec2 normal() {
        return __normal;
    }

    private static final int __normal_offset = CHandler.getOffsetForField(__ffi_type, 3);

    private final b2Vec2 __normal = new b2Vec2(getPointer() + __normal_offset, false);

    /**
     * The speed the shapes are approaching. Always positive. Typically in meters per second.
     */
    public float approachSpeed() {
        return (float) getValueFloat(4);
    }

    /**
     * The speed the shapes are approaching. Always positive. Typically in meters per second.
     */
    public void approachSpeed(float approachSpeed) {
        setValue(approachSpeed, 4);
    }

    public static final class b2ContactHitEventPointer extends StackElementPointer<b2ContactHitEvent> {

        public b2ContactHitEventPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ContactHitEventPointer() {
            this(1, true, true);
        }

        public b2ContactHitEventPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2ContactHitEvent.b2ContactHitEventPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2ContactHitEvent createStackElement(long ptr, boolean freeOnGC) {
            return new b2ContactHitEvent(ptr, freeOnGC);
        }
    }
}
