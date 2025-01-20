package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2SensorBeginTouchEvent;
import com.badlogic.gdx.box2d.structs.b2SensorEndTouchEvent;

/**
 * Sensor events are buffered in the Box2D world and are available
 * as begin/end overlap event arrays after the time step is complete.
 * Note: these may become invalid if bodies and/or shapes are destroyed
 */
public final class b2SensorEvents extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(57).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2SensorEvents(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2SensorEvents() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2SensorEvents.b2SensorEventsPointer asPointer() {
        return new b2SensorEvents.b2SensorEventsPointer(getPointer(), getsGCFreed());
    }

    /**
     * Array of sensor begin touch events
     */
    public b2SensorBeginTouchEvent.b2SensorBeginTouchEventPointer beginEvents() {
        return new b2SensorBeginTouchEvent.b2SensorBeginTouchEventPointer(getValue(0), false);
    }

    /**
     * Array of sensor begin touch events
     */
    public void beginEvents(b2SensorBeginTouchEvent.b2SensorBeginTouchEventPointer beginEvents) {
        setValue(beginEvents.getPointer(), 0);
    }

    /**
     * Array of sensor end touch events
     */
    public b2SensorEndTouchEvent.b2SensorEndTouchEventPointer endEvents() {
        return new b2SensorEndTouchEvent.b2SensorEndTouchEventPointer(getValue(1), false);
    }

    /**
     * Array of sensor end touch events
     */
    public void endEvents(b2SensorEndTouchEvent.b2SensorEndTouchEventPointer endEvents) {
        setValue(endEvents.getPointer(), 1);
    }

    /**
     * The number of begin touch events
     */
    public int beginCount() {
        return (int) getValue(2);
    }

    /**
     * The number of begin touch events
     */
    public void beginCount(int beginCount) {
        setValue(beginCount, 2);
    }

    /**
     * The number of end touch events
     */
    public int endCount() {
        return (int) getValue(3);
    }

    /**
     * The number of end touch events
     */
    public void endCount(int endCount) {
        setValue(endCount, 3);
    }

    public static final class b2SensorEventsPointer extends StackElementPointer<b2SensorEvents> {

        public b2SensorEventsPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2SensorEventsPointer() {
            this(1, true, true);
        }

        public b2SensorEventsPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2SensorEvents.b2SensorEventsPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2SensorEvents createStackElement(long ptr, boolean freeOnGC) {
            return new b2SensorEvents(ptr, freeOnGC);
        }
    }
}
