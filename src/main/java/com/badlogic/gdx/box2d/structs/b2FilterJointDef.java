package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2BodyId;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

/**
 * A filter joint is used to disable collision between two specific bodies.
 *
 * @ingroup filter_joint
 */
public final class b2FilterJointDef extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(37).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2FilterJointDef(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2FilterJointDef(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2FilterJointDef() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2FilterJointDef.b2FilterJointDefPointer asPointer() {
        return new b2FilterJointDef.b2FilterJointDefPointer(getPointer(), false, 1, this);
    }

    /**
     * The first attached body.
     */
    public b2BodyId bodyIdA() {
        return new b2BodyId(getPointer(), false);
    }

    /**
     * The first attached body.
     */
    public void bodyIdA(b2BodyId toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    /**
     * The first attached body.
     */
    public b2BodyId getBodyIdA() {
        return new b2BodyId(getBufPtr().duplicate(0, 8), true);
    }

    /**
     * The first attached body.
     */
    public void getBodyIdA(b2BodyId toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    /**
     * The first attached body.
     */
    public void setBodyIdA(b2BodyId toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * The second attached body.
     */
    public b2BodyId bodyIdB() {
        return new b2BodyId(getPointer() + (8), false);
    }

    /**
     * The second attached body.
     */
    public void bodyIdB(b2BodyId toSetPtr) {
        toSetPtr.setPointer(getPointer() + (8), 8, this);
    }

    /**
     * The second attached body.
     */
    public b2BodyId getBodyIdB() {
        return new b2BodyId(getBufPtr().duplicate(8, 8), true);
    }

    /**
     * The second attached body.
     */
    public void getBodyIdB(b2BodyId toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 8, 8);
    }

    /**
     * The second attached body.
     */
    public void setBodyIdB(b2BodyId toCopyFrom) {
        getBufPtr().copyFrom(8, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * User data pointer
     */
    public VoidPointer userData() {
        return new VoidPointer(getBufPtr().getNativePointer(16), false);
    }

    /**
     * User data pointer
     */
    public void userData(VoidPointer userData) {
        getBufPtr().setNativePointer(16, userData.getPointer());
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int internalValue() {
        return getBufPtr().getInt(CHandler.IS_32_BIT ? 20 : 24);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void internalValue(int internalValue) {
        getBufPtr().setInt(CHandler.IS_32_BIT ? 20 : 24, internalValue);
    }

    public static final class b2FilterJointDefPointer extends StackElementPointer<b2FilterJointDef> {

        public b2FilterJointDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2FilterJointDefPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2FilterJointDefPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2FilterJointDefPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2FilterJointDefPointer() {
            this(1, true);
        }

        public b2FilterJointDefPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2FilterJointDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2FilterJointDef(ptr, freeOnGC);
        }
    }
}
