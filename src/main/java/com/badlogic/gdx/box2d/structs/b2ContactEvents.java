package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2ContactBeginTouchEvent;
import com.badlogic.gdx.box2d.structs.b2ContactEndTouchEvent;
import com.badlogic.gdx.box2d.structs.b2ContactHitEvent;

/**
 * Contact events are buffered in the Box2D world and are available
 * as event arrays after the time step is complete.
 * Note: these may become invalid if bodies and/or shapes are destroyed
 */
public final class b2ContactEvents extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(26).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ContactEvents(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2ContactEvents() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2ContactEvents.b2ContactEventsPointer asPointer() {
        return new b2ContactEvents.b2ContactEventsPointer(getPointer(), false, this);
    }

    /**
     * Array of begin touch events
     */
    public b2ContactBeginTouchEvent.b2ContactBeginTouchEventPointer beginEvents() {
        return new b2ContactBeginTouchEvent.b2ContactBeginTouchEventPointer(getBufPtr().getNativePointer(0), false);
    }

    /**
     * Array of begin touch events
     */
    public void beginEvents(b2ContactBeginTouchEvent.b2ContactBeginTouchEventPointer beginEvents) {
        getBufPtr().setNativePointer(0, beginEvents.getPointer());
    }

    /**
     * Array of end touch events
     */
    public b2ContactEndTouchEvent.b2ContactEndTouchEventPointer endEvents() {
        return new b2ContactEndTouchEvent.b2ContactEndTouchEventPointer(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 4 : 8), false);
    }

    /**
     * Array of end touch events
     */
    public void endEvents(b2ContactEndTouchEvent.b2ContactEndTouchEventPointer endEvents) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 4 : 8, endEvents.getPointer());
    }

    /**
     * Array of hit events
     */
    public b2ContactHitEvent.b2ContactHitEventPointer hitEvents() {
        return new b2ContactHitEvent.b2ContactHitEventPointer(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 8 : 16), false);
    }

    /**
     * Array of hit events
     */
    public void hitEvents(b2ContactHitEvent.b2ContactHitEventPointer hitEvents) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 8 : 16, hitEvents.getPointer());
    }

    /**
     * Number of begin touch events
     */
    public int beginCount() {
        return getBufPtr().getInt(CHandler.IS_32_BIT ? 12 : 24);
    }

    /**
     * Number of begin touch events
     */
    public void beginCount(int beginCount) {
        getBufPtr().setInt(CHandler.IS_32_BIT ? 12 : 24, beginCount);
    }

    /**
     * Number of end touch events
     */
    public int endCount() {
        return getBufPtr().getInt(CHandler.IS_32_BIT ? 16 : 28);
    }

    /**
     * Number of end touch events
     */
    public void endCount(int endCount) {
        getBufPtr().setInt(CHandler.IS_32_BIT ? 16 : 28, endCount);
    }

    /**
     * Number of hit events
     */
    public int hitCount() {
        return getBufPtr().getInt(CHandler.IS_32_BIT ? 20 : 32);
    }

    /**
     * Number of hit events
     */
    public void hitCount(int hitCount) {
        getBufPtr().setInt(CHandler.IS_32_BIT ? 20 : 32, hitCount);
    }

    public static final class b2ContactEventsPointer extends StackElementPointer<b2ContactEvents> {

        public b2ContactEventsPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ContactEventsPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2ContactEventsPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2ContactEventsPointer() {
            this(1, true);
        }

        public b2ContactEventsPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2ContactEvents createStackElement(long ptr, boolean freeOnGC) {
            return new b2ContactEvents(ptr, freeOnGC);
        }
    }
}
