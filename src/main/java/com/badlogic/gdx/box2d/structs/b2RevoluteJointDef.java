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
 * Revolute joint definition
 *
 * This requires defining an anchor point where the bodies are joined.
 * The definition uses local anchor points so that the
 * initial configuration can violate the constraint slightly. You also need to
 * specify the initial relative angle for joint limits. This helps when saving
 * and loading a game.
 * The local anchor points are measured from the body's origin
 * rather than the center of mass because:
 * 1. you might not know where the center of mass will be
 * 2. if you add/remove shapes from a body and recompute the mass, the joints will be broken
 * @ingroup revolute_joint
 */
public final class b2RevoluteJointDef extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(55).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2RevoluteJointDef(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2RevoluteJointDef(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2RevoluteJointDef() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2RevoluteJointDef.b2RevoluteJointDefPointer asPointer() {
        return new b2RevoluteJointDef.b2RevoluteJointDefPointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2RevoluteJointDef.b2RevoluteJointDefPointer ptr) {
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
     * The local anchor point relative to bodyA's origin
     */
    public b2Vec2 localAnchorA() {
        return new b2Vec2(getPointer() + (16), false);
    }

    /**
     * The local anchor point relative to bodyA's origin
     */
    public void localAnchorA(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (16), 8, this);
    }

    /**
     * The local anchor point relative to bodyA's origin
     */
    public b2Vec2 getLocalAnchorA() {
        return new b2Vec2(getBufPtr().duplicate(16, 8), true);
    }

    /**
     * The local anchor point relative to bodyA's origin
     */
    public void getLocalAnchorA(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 16, 8);
    }

    /**
     * The local anchor point relative to bodyA's origin
     */
    public void setLocalAnchorA(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(16, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * The local anchor point relative to bodyB's origin
     */
    public b2Vec2 localAnchorB() {
        return new b2Vec2(getPointer() + (24), false);
    }

    /**
     * The local anchor point relative to bodyB's origin
     */
    public void localAnchorB(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (24), 8, this);
    }

    /**
     * The local anchor point relative to bodyB's origin
     */
    public b2Vec2 getLocalAnchorB() {
        return new b2Vec2(getBufPtr().duplicate(24, 8), true);
    }

    /**
     * The local anchor point relative to bodyB's origin
     */
    public void getLocalAnchorB(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 24, 8);
    }

    /**
     * The local anchor point relative to bodyB's origin
     */
    public void setLocalAnchorB(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(24, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     *  The bodyB angle minus bodyA angle in the reference state (radians).
     * 	 This defines the zero angle for the joint limit.
     */
    public float referenceAngle() {
        return getBufPtr().getFloat(32);
    }

    /**
     *  The bodyB angle minus bodyA angle in the reference state (radians).
     * 	 This defines the zero angle for the joint limit.
     */
    public void referenceAngle(float referenceAngle) {
        getBufPtr().setFloat(32, referenceAngle);
    }

    /**
     *  The target angle for the joint in radians. The spring-damper will drive
     * 	 to this angle.
     */
    public float targetAngle() {
        return getBufPtr().getFloat(36);
    }

    /**
     *  The target angle for the joint in radians. The spring-damper will drive
     * 	 to this angle.
     */
    public void targetAngle(float targetAngle) {
        getBufPtr().setFloat(36, targetAngle);
    }

    /**
     * Enable a rotational spring on the revolute hinge axis
     */
    public boolean enableSpring() {
        return getBufPtr().getBoolean(40);
    }

    /**
     * Enable a rotational spring on the revolute hinge axis
     */
    public void enableSpring(boolean enableSpring) {
        getBufPtr().setBoolean(40, enableSpring);
    }

    /**
     * The spring stiffness Hertz, cycles per second
     */
    public float hertz() {
        return getBufPtr().getFloat(44);
    }

    /**
     * The spring stiffness Hertz, cycles per second
     */
    public void hertz(float hertz) {
        getBufPtr().setFloat(44, hertz);
    }

    /**
     * The spring damping ratio, non-dimensional
     */
    public float dampingRatio() {
        return getBufPtr().getFloat(48);
    }

    /**
     * The spring damping ratio, non-dimensional
     */
    public void dampingRatio(float dampingRatio) {
        getBufPtr().setFloat(48, dampingRatio);
    }

    /**
     * A flag to enable joint limits
     */
    public boolean enableLimit() {
        return getBufPtr().getBoolean(52);
    }

    /**
     * A flag to enable joint limits
     */
    public void enableLimit(boolean enableLimit) {
        getBufPtr().setBoolean(52, enableLimit);
    }

    /**
     * The lower angle for the joint limit in radians. Minimum of -0.99*pi radians.
     */
    public float lowerAngle() {
        return getBufPtr().getFloat(56);
    }

    /**
     * The lower angle for the joint limit in radians. Minimum of -0.99*pi radians.
     */
    public void lowerAngle(float lowerAngle) {
        getBufPtr().setFloat(56, lowerAngle);
    }

    /**
     * The upper angle for the joint limit in radians. Maximum of 0.99*pi radians.
     */
    public float upperAngle() {
        return getBufPtr().getFloat(60);
    }

    /**
     * The upper angle for the joint limit in radians. Maximum of 0.99*pi radians.
     */
    public void upperAngle(float upperAngle) {
        getBufPtr().setFloat(60, upperAngle);
    }

    /**
     * A flag to enable the joint motor
     */
    public boolean enableMotor() {
        return getBufPtr().getBoolean(64);
    }

    /**
     * A flag to enable the joint motor
     */
    public void enableMotor(boolean enableMotor) {
        getBufPtr().setBoolean(64, enableMotor);
    }

    /**
     * The maximum motor torque, typically in newton-meters
     */
    public float maxMotorTorque() {
        return getBufPtr().getFloat(68);
    }

    /**
     * The maximum motor torque, typically in newton-meters
     */
    public void maxMotorTorque(float maxMotorTorque) {
        getBufPtr().setFloat(68, maxMotorTorque);
    }

    /**
     * The desired motor speed in radians per second
     */
    public float motorSpeed() {
        return getBufPtr().getFloat(72);
    }

    /**
     * The desired motor speed in radians per second
     */
    public void motorSpeed(float motorSpeed) {
        getBufPtr().setFloat(72, motorSpeed);
    }

    /**
     * Scale the debug draw
     */
    public float drawSize() {
        return getBufPtr().getFloat(76);
    }

    /**
     * Scale the debug draw
     */
    public void drawSize(float drawSize) {
        getBufPtr().setFloat(76, drawSize);
    }

    /**
     * Set this flag to true if the attached bodies should collide
     */
    public boolean collideConnected() {
        return getBufPtr().getBoolean(80);
    }

    /**
     * Set this flag to true if the attached bodies should collide
     */
    public void collideConnected(boolean collideConnected) {
        getBufPtr().setBoolean(80, collideConnected);
    }

    /**
     * User data pointer
     */
    public VoidPointer userData() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 88 : 84), false);
    }

    /**
     * User data pointer
     */
    public void userData(VoidPointer userData) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 88 : 84, userData.getPointer());
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int internalValue() {
        return getBufPtr().getInt(CHandler.IS_64_BIT ? 96 : 88);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void internalValue(int internalValue) {
        getBufPtr().setInt(CHandler.IS_64_BIT ? 96 : 88, internalValue);
    }

    public static final class b2RevoluteJointDefPointer extends StackElementPointer<b2RevoluteJointDef> {

        public b2RevoluteJointDefPointer(VoidPointer pointer) {
            super(pointer);
        }

        public b2RevoluteJointDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2RevoluteJointDefPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2RevoluteJointDefPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2RevoluteJointDefPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2RevoluteJointDefPointer() {
            this(1, true);
        }

        public b2RevoluteJointDefPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2RevoluteJointDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2RevoluteJointDef(ptr, freeOnGC);
        }
    }
}
