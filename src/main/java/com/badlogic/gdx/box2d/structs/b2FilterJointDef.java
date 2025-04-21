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
        return new b2FilterJointDef.b2FilterJointDefPointer(getPointer(), false, this);
    }

    /**
     * The first attached body.
     */
    public b2BodyId bodyIdA() {
        return __bodyIdA;
    }

    private static final int __bodyIdA_offset = 0;

    private final b2BodyId __bodyIdA = new b2BodyId(getPointer() + __bodyIdA_offset, false);

    /**
     * The second attached body.
     */
    public b2BodyId bodyIdB() {
        return __bodyIdB;
    }

    private static final int __bodyIdB_offset = 8;

    private final b2BodyId __bodyIdB = new b2BodyId(getPointer() + __bodyIdB_offset, false);

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
