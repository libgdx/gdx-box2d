package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2ShapeId;

/**
 * A begin touch event is generated when a shape starts to overlap a sensor shape.
 */
public final class b2SensorBeginTouchEvent extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(59).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2SensorBeginTouchEvent(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2SensorBeginTouchEvent(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2SensorBeginTouchEvent() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2SensorBeginTouchEvent.b2SensorBeginTouchEventPointer asPointer() {
        return new b2SensorBeginTouchEvent.b2SensorBeginTouchEventPointer(getPointer(), false, 1, this);
    }

    /**
     * The id of the sensor shape
     */
    public b2ShapeId sensorShapeId() {
        return new b2ShapeId(getPointer(), false);
    }

    /**
     * The id of the sensor shape
     */
    public void sensorShapeId(b2ShapeId toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    /**
     * The id of the sensor shape
     */
    public b2ShapeId getSensorShapeId() {
        return new b2ShapeId(getBufPtr().duplicate(0, 8), true);
    }

    /**
     * The id of the sensor shape
     */
    public void getSensorShapeId(b2ShapeId toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    /**
     * The id of the sensor shape
     */
    public void setSensorShapeId(b2ShapeId toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * The id of the dynamic shape that began touching the sensor shape
     */
    public b2ShapeId visitorShapeId() {
        return new b2ShapeId(getPointer() + (8), false);
    }

    /**
     * The id of the dynamic shape that began touching the sensor shape
     */
    public void visitorShapeId(b2ShapeId toSetPtr) {
        toSetPtr.setPointer(getPointer() + (8), 8, this);
    }

    /**
     * The id of the dynamic shape that began touching the sensor shape
     */
    public b2ShapeId getVisitorShapeId() {
        return new b2ShapeId(getBufPtr().duplicate(8, 8), true);
    }

    /**
     * The id of the dynamic shape that began touching the sensor shape
     */
    public void getVisitorShapeId(b2ShapeId toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 8, 8);
    }

    /**
     * The id of the dynamic shape that began touching the sensor shape
     */
    public void setVisitorShapeId(b2ShapeId toCopyFrom) {
        getBufPtr().copyFrom(8, toCopyFrom.getBufPtr(), 0, 8);
    }

    public static final class b2SensorBeginTouchEventPointer extends StackElementPointer<b2SensorBeginTouchEvent> {

        public b2SensorBeginTouchEventPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2SensorBeginTouchEventPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2SensorBeginTouchEventPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2SensorBeginTouchEventPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2SensorBeginTouchEventPointer() {
            this(1, true);
        }

        public b2SensorBeginTouchEventPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2SensorBeginTouchEvent createStackElement(long ptr, boolean freeOnGC) {
            return new b2SensorBeginTouchEvent(ptr, freeOnGC);
        }
    }
}
