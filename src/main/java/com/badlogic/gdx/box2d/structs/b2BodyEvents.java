package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2BodyMoveEvent;

public final class b2BodyEvents extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(14).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2BodyEvents(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2BodyEvents() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2BodyEvents.b2BodyEventsPointer asPointer() {
        return new b2BodyEvents.b2BodyEventsPointer(getPointer(), getsGCFreed());
    }

    public b2BodyMoveEvent.b2BodyMoveEventPointer moveEvents() {
        return new b2BodyMoveEvent.b2BodyMoveEventPointer(getValue(0), false);
    }

    public void moveEvents(b2BodyMoveEvent.b2BodyMoveEventPointer moveEvents) {
        setValue(moveEvents.getPointer(), 0);
    }

    public int moveCount() {
        return (int) getValue(1);
    }

    public void moveCount(int moveCount) {
        setValue(moveCount, 1);
    }

    public static final class b2BodyEventsPointer extends StackElementPointer<b2BodyEvents> {

        public b2BodyEventsPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2BodyEventsPointer() {
            this(1, true, true);
        }

        public b2BodyEventsPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2BodyEvents.b2BodyEventsPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2BodyEvents createStackElement(long ptr, boolean freeOnGC) {
            return new b2BodyEvents(ptr, freeOnGC);
        }
    }
}
