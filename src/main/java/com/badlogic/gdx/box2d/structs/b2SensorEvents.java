package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
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
        __ffi_type = FFITypes.getCTypeInfo(61).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2SensorEvents(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2SensorEvents(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
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
        return new b2SensorEvents.b2SensorEventsPointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2SensorEvents.b2SensorEventsPointer ptr) {
        ptr.setPointer(this);
    }

    /**
     * Array of sensor begin touch events
     */
    public b2SensorBeginTouchEvent.b2SensorBeginTouchEventPointer beginEvents() {
        return new b2SensorBeginTouchEvent.b2SensorBeginTouchEventPointer(getBufPtr().getNativePointer(0), false);
    }

    /**
     * Array of sensor begin touch events
     */
    public void beginEvents(b2SensorBeginTouchEvent.b2SensorBeginTouchEventPointer beginEvents) {
        getBufPtr().setNativePointer(0, beginEvents.getPointer());
    }

    /**
     * Array of sensor end touch events
     */
    public b2SensorEndTouchEvent.b2SensorEndTouchEventPointer endEvents() {
        return new b2SensorEndTouchEvent.b2SensorEndTouchEventPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false);
    }

    /**
     * Array of sensor end touch events
     */
    public void endEvents(b2SensorEndTouchEvent.b2SensorEndTouchEventPointer endEvents) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, endEvents.getPointer());
    }

    /**
     * The number of begin touch events
     */
    public int beginCount() {
        return getBufPtr().getInt(CHandler.IS_64_BIT ? 16 : 8);
    }

    /**
     * The number of begin touch events
     */
    public void beginCount(int beginCount) {
        getBufPtr().setInt(CHandler.IS_64_BIT ? 16 : 8, beginCount);
    }

    /**
     * The number of end touch events
     */
    public int endCount() {
        return getBufPtr().getInt(CHandler.IS_64_BIT ? 20 : 12);
    }

    /**
     * The number of end touch events
     */
    public void endCount(int endCount) {
        getBufPtr().setInt(CHandler.IS_64_BIT ? 20 : 12, endCount);
    }

    public static final class b2SensorEventsPointer extends StackElementPointer<b2SensorEvents> {

        public b2SensorEventsPointer(VoidPointer pointer) {
            super(pointer);
        }

        public b2SensorEventsPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2SensorEventsPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2SensorEventsPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2SensorEventsPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2SensorEventsPointer() {
            this(1, true);
        }

        public b2SensorEventsPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2SensorEvents createStackElement(long ptr, boolean freeOnGC) {
            return new b2SensorEvents(ptr, freeOnGC);
        }
    }
}
