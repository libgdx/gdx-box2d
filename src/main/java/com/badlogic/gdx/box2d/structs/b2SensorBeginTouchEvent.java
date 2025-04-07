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
        __ffi_type = FFITypes.getCTypeInfo(55).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2SensorBeginTouchEvent(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
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
        return new b2SensorBeginTouchEvent.b2SensorBeginTouchEventPointer(getPointer(), false, this);
    }

    /**
     * The id of the sensor shape
     */
    public b2ShapeId sensorShapeId() {
        return __sensorShapeId;
    }

    private static final int __sensorShapeId_offset = 0;

    private final b2ShapeId __sensorShapeId = new b2ShapeId(getPointer() + __sensorShapeId_offset, false);

    /**
     * The id of the dynamic shape that began touching the sensor shape
     */
    public b2ShapeId visitorShapeId() {
        return __visitorShapeId;
    }

    private static final int __visitorShapeId_offset = 8;

    private final b2ShapeId __visitorShapeId = new b2ShapeId(getPointer() + __visitorShapeId_offset, false);

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
