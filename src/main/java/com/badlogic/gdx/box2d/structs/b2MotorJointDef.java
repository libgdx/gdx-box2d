package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2BodyId;
import com.badlogic.gdx.box2d.structs.b2Vec2;

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

    public b2MotorJointDef(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
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
        return new b2MotorJointDef.b2MotorJointDefPointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2MotorJointDef.b2MotorJointDefPointer ptr) {
        ptr.setPointer(this);
    }

    /**
     * The first attached body
     */
    public b2BodyId bodyIdA() {
        return new b2BodyId(getPointer(), false);
    }

    /**
     * The first attached body
     */
    public void bodyIdA(b2BodyId toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    /**
     * The first attached body
     */
    public b2BodyId getBodyIdA() {
        return new b2BodyId(getBufPtr().duplicate(0, 8), true);
    }

    /**
     * The first attached body
     */
    public void getBodyIdA(b2BodyId toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    /**
     * The first attached body
     */
    public void setBodyIdA(b2BodyId toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * The second attached body
     */
    public b2BodyId bodyIdB() {
        return new b2BodyId(getPointer() + (8), false);
    }

    /**
     * The second attached body
     */
    public void bodyIdB(b2BodyId toSetPtr) {
        toSetPtr.setPointer(getPointer() + (8), 8, this);
    }

    /**
     * The second attached body
     */
    public b2BodyId getBodyIdB() {
        return new b2BodyId(getBufPtr().duplicate(8, 8), true);
    }

    /**
     * The second attached body
     */
    public void getBodyIdB(b2BodyId toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 8, 8);
    }

    /**
     * The second attached body
     */
    public void setBodyIdB(b2BodyId toCopyFrom) {
        getBufPtr().copyFrom(8, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * Position of bodyB minus the position of bodyA, in bodyA's frame
     */
    public b2Vec2 linearOffset() {
        return new b2Vec2(getPointer() + (16), false);
    }

    /**
     * Position of bodyB minus the position of bodyA, in bodyA's frame
     */
    public void linearOffset(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (16), 8, this);
    }

    /**
     * Position of bodyB minus the position of bodyA, in bodyA's frame
     */
    public b2Vec2 getLinearOffset() {
        return new b2Vec2(getBufPtr().duplicate(16, 8), true);
    }

    /**
     * Position of bodyB minus the position of bodyA, in bodyA's frame
     */
    public void getLinearOffset(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 16, 8);
    }

    /**
     * Position of bodyB minus the position of bodyA, in bodyA's frame
     */
    public void setLinearOffset(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(16, toCopyFrom.getBufPtr(), 0, 8);
    }

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
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 48 : 44), false);
    }

    /**
     * User data pointer
     */
    public void userData(VoidPointer userData) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 48 : 44, userData.getPointer());
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int internalValue() {
        return getBufPtr().getInt(CHandler.IS_64_BIT ? 56 : 48);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void internalValue(int internalValue) {
        getBufPtr().setInt(CHandler.IS_64_BIT ? 56 : 48, internalValue);
    }

    public static final class b2MotorJointDefPointer extends StackElementPointer<b2MotorJointDef> {

        public b2MotorJointDefPointer(VoidPointer pointer) {
            super(pointer);
        }

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

        public b2MotorJointDefPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
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
