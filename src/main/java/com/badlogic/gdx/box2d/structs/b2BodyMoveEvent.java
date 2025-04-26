package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Transform;
import com.badlogic.gdx.box2d.structs.b2BodyId;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

/**
 * Body move events triggered when a body moves.
 * Triggered when a body moves due to simulation. Not reported for bodies moved by the user.
 * This also has a flag to indicate that the body went to sleep so the application can also
 * sleep that actor/entity/object associated with the body.
 * On the other hand if the flag does not indicate the body went to sleep then the application
 * can treat the actor/entity/object associated with the body as awake.
 * This is an efficient way for an application to update game object transforms rather than
 * calling functions such as b2Body_GetTransform() because this data is delivered as a contiguous array
 * and it is only populated with bodies that have moved.
 * @note If sleeping is disabled all dynamic and kinematic bodies will trigger move events.
 */
public final class b2BodyMoveEvent extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(15).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2BodyMoveEvent(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2BodyMoveEvent(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
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
        return new b2BodyMoveEvent.b2BodyMoveEventPointer(getPointer(), false, 1, this);
    }

    public b2Transform transform() {
        return new b2Transform(getPointer(), false);
    }

    public void transform(b2Transform toSetPtr) {
        toSetPtr.setPointer(getPointer(), 16, this);
    }

    public b2Transform getTransform() {
        return new b2Transform(getBufPtr().duplicate(0, 16), true);
    }

    public void getTransform(b2Transform toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 16);
    }

    public void setTransform(b2Transform toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 16);
    }

    public b2BodyId bodyId() {
        return new b2BodyId(getPointer() + (16), false);
    }

    public void bodyId(b2BodyId toSetPtr) {
        toSetPtr.setPointer(getPointer() + (16), 8, this);
    }

    public b2BodyId getBodyId() {
        return new b2BodyId(getBufPtr().duplicate(16, 8), true);
    }

    public void getBodyId(b2BodyId toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 16, 8);
    }

    public void setBodyId(b2BodyId toCopyFrom) {
        getBufPtr().copyFrom(16, toCopyFrom.getBufPtr(), 0, 8);
    }

    public VoidPointer userData() {
        return new VoidPointer(getBufPtr().getNativePointer(24), false);
    }

    public void userData(VoidPointer userData) {
        getBufPtr().setNativePointer(24, userData.getPointer());
    }

    public boolean fellAsleep() {
        return getBufPtr().getBoolean(CHandler.IS_32_BIT ? 28 : 32);
    }

    public void fellAsleep(boolean fellAsleep) {
        getBufPtr().setBoolean(CHandler.IS_32_BIT ? 28 : 32, fellAsleep);
    }

    public static final class b2BodyMoveEventPointer extends StackElementPointer<b2BodyMoveEvent> {

        public b2BodyMoveEventPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2BodyMoveEventPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2BodyMoveEventPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2BodyMoveEventPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2BodyMoveEventPointer() {
            this(1, true);
        }

        public b2BodyMoveEventPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2BodyMoveEvent createStackElement(long ptr, boolean freeOnGC) {
            return new b2BodyMoveEvent(ptr, freeOnGC);
        }
    }
}
