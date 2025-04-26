package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2ShapeId;

/**
 *  An end touch event is generated when a shape stops overlapping a sensor shape.
 * 	These include things like setting the transform, destroying a body or shape, or changing
 * 	a filter. You will also get an end event if the sensor or visitor are destroyed.
 * 	Therefore you should always confirm the shape id is valid using b2Shape_IsValid.
 */
public final class b2SensorEndTouchEvent extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(60).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2SensorEndTouchEvent(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2SensorEndTouchEvent(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2SensorEndTouchEvent() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2SensorEndTouchEvent.b2SensorEndTouchEventPointer asPointer() {
        return new b2SensorEndTouchEvent.b2SensorEndTouchEventPointer(getPointer(), false, 1, this);
    }

    /**
     *  The id of the sensor shape
     * 		@warning this shape may have been destroyed
     * 		@see b2Shape_IsValid
     */
    public b2ShapeId sensorShapeId() {
        return new b2ShapeId(getPointer(), false);
    }

    /**
     *  The id of the sensor shape
     * 		@warning this shape may have been destroyed
     * 		@see b2Shape_IsValid
     */
    public void sensorShapeId(b2ShapeId toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    /**
     *  The id of the sensor shape
     * 		@warning this shape may have been destroyed
     * 		@see b2Shape_IsValid
     */
    public b2ShapeId getSensorShapeId() {
        return new b2ShapeId(getBufPtr().duplicate(0, 8), true);
    }

    /**
     *  The id of the sensor shape
     * 		@warning this shape may have been destroyed
     * 		@see b2Shape_IsValid
     */
    public void getSensorShapeId(b2ShapeId toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    /**
     *  The id of the sensor shape
     * 		@warning this shape may have been destroyed
     * 		@see b2Shape_IsValid
     */
    public void setSensorShapeId(b2ShapeId toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     *  The id of the dynamic shape that stopped touching the sensor shape
     * 		@warning this shape may have been destroyed
     * 		@see b2Shape_IsValid
     */
    public b2ShapeId visitorShapeId() {
        return new b2ShapeId(getPointer() + (8), false);
    }

    /**
     *  The id of the dynamic shape that stopped touching the sensor shape
     * 		@warning this shape may have been destroyed
     * 		@see b2Shape_IsValid
     */
    public void visitorShapeId(b2ShapeId toSetPtr) {
        toSetPtr.setPointer(getPointer() + (8), 8, this);
    }

    /**
     *  The id of the dynamic shape that stopped touching the sensor shape
     * 		@warning this shape may have been destroyed
     * 		@see b2Shape_IsValid
     */
    public b2ShapeId getVisitorShapeId() {
        return new b2ShapeId(getBufPtr().duplicate(8, 8), true);
    }

    /**
     *  The id of the dynamic shape that stopped touching the sensor shape
     * 		@warning this shape may have been destroyed
     * 		@see b2Shape_IsValid
     */
    public void getVisitorShapeId(b2ShapeId toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 8, 8);
    }

    /**
     *  The id of the dynamic shape that stopped touching the sensor shape
     * 		@warning this shape may have been destroyed
     * 		@see b2Shape_IsValid
     */
    public void setVisitorShapeId(b2ShapeId toCopyFrom) {
        getBufPtr().copyFrom(8, toCopyFrom.getBufPtr(), 0, 8);
    }

    public static final class b2SensorEndTouchEventPointer extends StackElementPointer<b2SensorEndTouchEvent> {

        public b2SensorEndTouchEventPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2SensorEndTouchEventPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2SensorEndTouchEventPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2SensorEndTouchEventPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2SensorEndTouchEventPointer() {
            this(1, true);
        }

        public b2SensorEndTouchEventPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2SensorEndTouchEvent createStackElement(long ptr, boolean freeOnGC) {
            return new b2SensorEndTouchEvent(ptr, freeOnGC);
        }
    }
}
