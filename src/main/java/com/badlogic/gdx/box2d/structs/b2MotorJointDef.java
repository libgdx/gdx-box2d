package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2BodyId;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

/**
 * A motor joint is used to control the relative motion between two bodies
 *
 * A typical usage is to control the movement of a dynamic body with respect to the ground.
 * @ingroup motor_joint
 */
public final class b2MotorJointDef extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(44).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2MotorJointDef(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2MotorJointDef() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2MotorJointDef.b2MotorJointDefPointer asPointer() {
        return new b2MotorJointDef.b2MotorJointDefPointer(getPointer(), false, this);
    }

    /**
     * The first attached body
     */
    public b2BodyId bodyIdA() {
        return __bodyIdA;
    }

    private static final int __bodyIdA_offset = 0;

    private final b2BodyId __bodyIdA = new b2BodyId(getPointer() + __bodyIdA_offset, false);

    /**
     * The second attached body
     */
    public b2BodyId bodyIdB() {
        return __bodyIdB;
    }

    private static final int __bodyIdB_offset = 8;

    private final b2BodyId __bodyIdB = new b2BodyId(getPointer() + __bodyIdB_offset, false);

    /**
     * Position of bodyB minus the position of bodyA, in bodyA's frame
     */
    public b2Vec2 linearOffset() {
        return __linearOffset;
    }

    private static final int __linearOffset_offset = 16;

    private final b2Vec2 __linearOffset = new b2Vec2(getPointer() + __linearOffset_offset, false);

    /**
     * The bodyB angle minus bodyA angle in radians
     */
    public float angularOffset() {
        return getBufPtr().getFloat(24);
    }

    /**
     * The bodyB angle minus bodyA angle in radians
     */
    public void angularOffset(float angularOffset) {
        getBufPtr().setFloat(24, angularOffset);
    }

    /**
     * The maximum motor force in newtons
     */
    public float maxForce() {
        return getBufPtr().getFloat(28);
    }

    /**
     * The maximum motor force in newtons
     */
    public void maxForce(float maxForce) {
        getBufPtr().setFloat(28, maxForce);
    }

    /**
     * The maximum motor torque in newton-meters
     */
    public float maxTorque() {
        return getBufPtr().getFloat(32);
    }

    /**
     * The maximum motor torque in newton-meters
     */
    public void maxTorque(float maxTorque) {
        getBufPtr().setFloat(32, maxTorque);
    }

    /**
     * Position correction factor in the range [0,1]
     */
    public float correctionFactor() {
        return getBufPtr().getFloat(36);
    }

    /**
     * Position correction factor in the range [0,1]
     */
    public void correctionFactor(float correctionFactor) {
        getBufPtr().setFloat(36, correctionFactor);
    }

    /**
     * Set this flag to true if the attached bodies should collide
     */
    public boolean collideConnected() {
        return getBufPtr().getBoolean(40);
    }

    /**
     * Set this flag to true if the attached bodies should collide
     */
    public void collideConnected(boolean collideConnected) {
        getBufPtr().setBoolean(40, collideConnected);
    }

    /**
     * User data pointer
     */
    public VoidPointer userData() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 44 : 48), false);
    }

    /**
     * User data pointer
     */
    public void userData(VoidPointer userData) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 44 : 48, userData.getPointer());
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int internalValue() {
        return getBufPtr().getInt(CHandler.IS_32_BIT ? 48 : 56);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void internalValue(int internalValue) {
        getBufPtr().setInt(CHandler.IS_32_BIT ? 48 : 56, internalValue);
    }

    public static final class b2MotorJointDefPointer extends StackElementPointer<b2MotorJointDef> {

        public b2MotorJointDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2MotorJointDefPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2MotorJointDefPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2MotorJointDefPointer() {
            this(1, true);
        }

        public b2MotorJointDefPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2MotorJointDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2MotorJointDef(ptr, freeOnGC);
        }
    }
}
