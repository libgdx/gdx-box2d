package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2BodyId;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

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
        __ffi_type = FFITypes.getCTypeInfo(51).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2RevoluteJointDef(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
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
        return new b2RevoluteJointDef.b2RevoluteJointDefPointer(getPointer(), getsGCFreed());
    }

    /**
     * The first attached body
     */
    public b2BodyId bodyIdA() {
        return __bodyIdA;
    }

    private static final int __bodyIdA_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2BodyId __bodyIdA = new b2BodyId(getPointer() + __bodyIdA_offset, false);

    /**
     * The second attached body
     */
    public b2BodyId bodyIdB() {
        return __bodyIdB;
    }

    private static final int __bodyIdB_offset = CHandler.getOffsetForField(__ffi_type, 1);

    private final b2BodyId __bodyIdB = new b2BodyId(getPointer() + __bodyIdB_offset, false);

    /**
     * The local anchor point relative to bodyA's origin
     */
    public b2Vec2 localAnchorA() {
        return __localAnchorA;
    }

    private static final int __localAnchorA_offset = CHandler.getOffsetForField(__ffi_type, 2);

    private final b2Vec2 __localAnchorA = new b2Vec2(getPointer() + __localAnchorA_offset, false);

    /**
     * The local anchor point relative to bodyB's origin
     */
    public b2Vec2 localAnchorB() {
        return __localAnchorB;
    }

    private static final int __localAnchorB_offset = CHandler.getOffsetForField(__ffi_type, 3);

    private final b2Vec2 __localAnchorB = new b2Vec2(getPointer() + __localAnchorB_offset, false);

    /**
     *  The bodyB angle minus bodyA angle in the reference state (radians).
     * 	 This defines the zero angle for the joint limit.
     */
    public float referenceAngle() {
        return (float) getValueFloat(4);
    }

    /**
     *  The bodyB angle minus bodyA angle in the reference state (radians).
     * 	 This defines the zero angle for the joint limit.
     */
    public void referenceAngle(float referenceAngle) {
        setValue(referenceAngle, 4);
    }

    /**
     * Enable a rotational spring on the revolute hinge axis
     */
    public boolean enableSpring() {
        return getValue(5) != 0;
    }

    /**
     * Enable a rotational spring on the revolute hinge axis
     */
    public void enableSpring(boolean enableSpring) {
        setValue(enableSpring, 5);
    }

    /**
     * The spring stiffness Hertz, cycles per second
     */
    public float hertz() {
        return (float) getValueFloat(6);
    }

    /**
     * The spring stiffness Hertz, cycles per second
     */
    public void hertz(float hertz) {
        setValue(hertz, 6);
    }

    /**
     * The spring damping ratio, non-dimensional
     */
    public float dampingRatio() {
        return (float) getValueFloat(7);
    }

    /**
     * The spring damping ratio, non-dimensional
     */
    public void dampingRatio(float dampingRatio) {
        setValue(dampingRatio, 7);
    }

    /**
     * A flag to enable joint limits
     */
    public boolean enableLimit() {
        return getValue(8) != 0;
    }

    /**
     * A flag to enable joint limits
     */
    public void enableLimit(boolean enableLimit) {
        setValue(enableLimit, 8);
    }

    /**
     * The lower angle for the joint limit in radians
     */
    public float lowerAngle() {
        return (float) getValueFloat(9);
    }

    /**
     * The lower angle for the joint limit in radians
     */
    public void lowerAngle(float lowerAngle) {
        setValue(lowerAngle, 9);
    }

    /**
     * The upper angle for the joint limit in radians
     */
    public float upperAngle() {
        return (float) getValueFloat(10);
    }

    /**
     * The upper angle for the joint limit in radians
     */
    public void upperAngle(float upperAngle) {
        setValue(upperAngle, 10);
    }

    /**
     * A flag to enable the joint motor
     */
    public boolean enableMotor() {
        return getValue(11) != 0;
    }

    /**
     * A flag to enable the joint motor
     */
    public void enableMotor(boolean enableMotor) {
        setValue(enableMotor, 11);
    }

    /**
     * The maximum motor torque, typically in newton-meters
     */
    public float maxMotorTorque() {
        return (float) getValueFloat(12);
    }

    /**
     * The maximum motor torque, typically in newton-meters
     */
    public void maxMotorTorque(float maxMotorTorque) {
        setValue(maxMotorTorque, 12);
    }

    /**
     * The desired motor speed in radians per second
     */
    public float motorSpeed() {
        return (float) getValueFloat(13);
    }

    /**
     * The desired motor speed in radians per second
     */
    public void motorSpeed(float motorSpeed) {
        setValue(motorSpeed, 13);
    }

    /**
     * Scale the debug draw
     */
    public float drawSize() {
        return (float) getValueFloat(14);
    }

    /**
     * Scale the debug draw
     */
    public void drawSize(float drawSize) {
        setValue(drawSize, 14);
    }

    /**
     * Set this flag to true if the attached bodies should collide
     */
    public boolean collideConnected() {
        return getValue(15) != 0;
    }

    /**
     * Set this flag to true if the attached bodies should collide
     */
    public void collideConnected(boolean collideConnected) {
        setValue(collideConnected, 15);
    }

    /**
     * User data pointer
     */
    public VoidPointer userData() {
        return new VoidPointer(getValue(16), false);
    }

    /**
     * User data pointer
     */
    public void userData(VoidPointer userData) {
        setValue(userData.getPointer(), 16);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int internalValue() {
        return (int) getValue(17);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void internalValue(int internalValue) {
        setValue(internalValue, 17);
    }

    public static final class b2RevoluteJointDefPointer extends StackElementPointer<b2RevoluteJointDef> {

        public b2RevoluteJointDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2RevoluteJointDefPointer() {
            this(1, true, true);
        }

        public b2RevoluteJointDefPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2RevoluteJointDef.b2RevoluteJointDefPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2RevoluteJointDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2RevoluteJointDef(ptr, freeOnGC);
        }
    }
}
