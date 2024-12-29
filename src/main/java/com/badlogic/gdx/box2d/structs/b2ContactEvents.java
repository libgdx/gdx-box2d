package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2ContactBeginTouchEvent;
import com.badlogic.gdx.box2d.structs.b2ContactEndTouchEvent;
import com.badlogic.gdx.box2d.structs.b2ContactHitEvent;

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
        return new b2ContactEvents.b2ContactEventsPointer(getPointer(), getsGCFreed());
    }

    public b2ContactBeginTouchEvent.b2ContactBeginTouchEventPointer beginEvents() {
        return new b2ContactBeginTouchEvent.b2ContactBeginTouchEventPointer(getValue(0), false);
    }

    public void beginEvents(b2ContactBeginTouchEvent.b2ContactBeginTouchEventPointer beginEvents) {
        setValue(beginEvents.getPointer(), 0);
    }

    public b2ContactEndTouchEvent.b2ContactEndTouchEventPointer endEvents() {
        return new b2ContactEndTouchEvent.b2ContactEndTouchEventPointer(getValue(1), false);
    }

    public void endEvents(b2ContactEndTouchEvent.b2ContactEndTouchEventPointer endEvents) {
        setValue(endEvents.getPointer(), 1);
    }

    public b2ContactHitEvent.b2ContactHitEventPointer hitEvents() {
        return new b2ContactHitEvent.b2ContactHitEventPointer(getValue(2), false);
    }

    public void hitEvents(b2ContactHitEvent.b2ContactHitEventPointer hitEvents) {
        setValue(hitEvents.getPointer(), 2);
    }

    public int beginCount() {
        return (int) getValue(3);
    }

    public void beginCount(int beginCount) {
        setValue(beginCount, 3);
    }

    public int endCount() {
        return (int) getValue(4);
    }

    public void endCount(int endCount) {
        setValue(endCount, 4);
    }

    public int hitCount() {
        return (int) getValue(5);
    }

    public void hitCount(int hitCount) {
        setValue(hitCount, 5);
    }

    public static final class b2ContactEventsPointer extends StackElementPointer<b2ContactEvents> {

        public b2ContactEventsPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ContactEventsPointer() {
            this(1, true, true);
        }

        public b2ContactEventsPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2ContactEvents.b2ContactEventsPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2ContactEvents createStackElement(long ptr, boolean freeOnGC) {
            return new b2ContactEvents(ptr, freeOnGC);
        }
    }
}