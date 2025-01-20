package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
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
        __ffi_type = FFITypes.getCTypeInfo(56).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2SensorEndTouchEvent(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
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
        return new b2SensorEndTouchEvent.b2SensorEndTouchEventPointer(getPointer(), getsGCFreed());
    }

    /**
     *  The id of the sensor shape
     * 		@warning this shape may have been destroyed
     * 		@see b2Shape_IsValid
     */
    public b2ShapeId sensorShapeId() {
        return __sensorShapeId;
    }

    private static final int __sensorShapeId_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2ShapeId __sensorShapeId = new b2ShapeId(getPointer() + __sensorShapeId_offset, false);

    /**
     *  The id of the dynamic shape that stopped touching the sensor shape
     * 		@warning this shape may have been destroyed
     * 		@see b2Shape_IsValid
     */
    public b2ShapeId visitorShapeId() {
        return __visitorShapeId;
    }

    private static final int __visitorShapeId_offset = CHandler.getOffsetForField(__ffi_type, 1);

    private final b2ShapeId __visitorShapeId = new b2ShapeId(getPointer() + __visitorShapeId_offset, false);

    public static final class b2SensorEndTouchEventPointer extends StackElementPointer<b2SensorEndTouchEvent> {

        public b2SensorEndTouchEventPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2SensorEndTouchEventPointer() {
            this(1, true, true);
        }

        public b2SensorEndTouchEventPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2SensorEndTouchEvent.b2SensorEndTouchEventPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2SensorEndTouchEvent createStackElement(long ptr, boolean freeOnGC) {
            return new b2SensorEndTouchEvent(ptr, freeOnGC);
        }
    }
}
