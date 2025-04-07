package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
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
        return new b2ContactHitEvent.b2ContactHitEventPointer(getPointer(), false, this);
    }

    /**
     * Id of the first shape
     */
    public b2ShapeId shapeIdA() {
        return __shapeIdA;
    }

    private static final int __shapeIdA_offset = 0;

    private final b2ShapeId __shapeIdA = new b2ShapeId(getPointer() + __shapeIdA_offset, false);

    /**
     * Id of the second shape
     */
    public b2ShapeId shapeIdB() {
        return __shapeIdB;
    }

    private static final int __shapeIdB_offset = 8;

    private final b2ShapeId __shapeIdB = new b2ShapeId(getPointer() + __shapeIdB_offset, false);

    /**
     * Point where the shapes hit
     */
    public b2Vec2 point() {
        return __point;
    }

    private static final int __point_offset = 16;

    private final b2Vec2 __point = new b2Vec2(getPointer() + __point_offset, false);

    /**
     * Normal vector pointing from shape A to shape B
     */
    public b2Vec2 normal() {
        return __normal;
    }

    private static final int __normal_offset = 24;

    private final b2Vec2 __normal = new b2Vec2(getPointer() + __normal_offset, false);

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
