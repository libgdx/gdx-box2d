package com.badlogic.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.box2d.FFITypes;
import com.badlogic.box2d.structs.b2Transform;
import com.badlogic.box2d.structs.b2BodyId;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public final class b2BodyMoveEvent extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(16).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2BodyMoveEvent(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2BodyMoveEvent() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2BodyMoveEvent.b2BodyMoveEventPointer asPointer() {
        return new b2BodyMoveEvent.b2BodyMoveEventPointer(getPointer(), getsGCFreed());
    }

    public b2Transform transform() {
        return __transform;
    }

    private static final int __transform_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Transform __transform = new b2Transform(getPointer() + __transform_offset, false);

    public b2BodyId bodyId() {
        return __bodyId;
    }

    private static final int __bodyId_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2BodyId __bodyId = new b2BodyId(getPointer() + __bodyId_offset, false);

    public VoidPointer userData() {
        return new VoidPointer(getValue(0), false);
    }

    public void userData(VoidPointer userData) {
        setValue(userData.getPointer(), 0);
    }

    public boolean fellAsleep() {
        return getValue(1) != 0;
    }

    public void fellAsleep(boolean fellAsleep) {
        setValue(fellAsleep, 1);
    }

    public static final class b2BodyMoveEventPointer extends StackElementPointer<b2BodyMoveEvent> {

        public b2BodyMoveEventPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2BodyMoveEventPointer() {
            this(1, true, true);
        }

        public b2BodyMoveEventPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2BodyMoveEvent.b2BodyMoveEventPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2BodyMoveEvent createStackElement(long ptr, boolean freeOnGC) {
            return new b2BodyMoveEvent(ptr, freeOnGC);
        }
    }
}
