package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2BodyId;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

/**
 * Wheel joint definition
 *
 * This requires defining a line of motion using an axis and an anchor point.
 * The definition uses local  anchor points and a local axis so that the initial
 * configuration can violate the constraint slightly. The joint translation is zero
 * when the local anchor points coincide in world space.
 * @ingroup wheel_joint
 */
public final class b2WheelJointDef extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(75).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2WheelJointDef(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2WheelJointDef() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2WheelJointDef.b2WheelJointDefPointer asPointer() {
        return new b2WheelJointDef.b2WheelJointDefPointer(getPointer(), getsGCFreed());
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
     * The local translation unit axis in bodyA
     */
    public b2Vec2 localAxisA() {
        return __localAxisA;
    }

    private static final int __localAxisA_offset = CHandler.getOffsetForField(__ffi_type, 4);

    private final b2Vec2 __localAxisA = new b2Vec2(getPointer() + __localAxisA_offset, false);

    /**
     * Enable a linear spring along the local axis
     */
    public boolean enableSpring() {
        return getValue(5) != 0;
    }

    /**
     * Enable a linear spring along the local axis
     */
    public void enableSpring(boolean enableSpring) {
        setValue(enableSpring, 5);
    }

    /**
     * Spring stiffness in Hertz
     */
    public float hertz() {
        return (float) getValueFloat(6);
    }

    /**
     * Spring stiffness in Hertz
     */
    public void hertz(float hertz) {
        setValue(hertz, 6);
    }

    /**
     * Spring damping ratio, non-dimensional
     */
    public float dampingRatio() {
        return (float) getValueFloat(7);
    }

    /**
     * Spring damping ratio, non-dimensional
     */
    public void dampingRatio(float dampingRatio) {
        setValue(dampingRatio, 7);
    }

    /**
     * Enable/disable the joint linear limit
     */
    public boolean enableLimit() {
        return getValue(8) != 0;
    }

    /**
     * Enable/disable the joint linear limit
     */
    public void enableLimit(boolean enableLimit) {
        setValue(enableLimit, 8);
    }

    /**
     * The lower translation limit
     */
    public float lowerTranslation() {
        return (float) getValueFloat(9);
    }

    /**
     * The lower translation limit
     */
    public void lowerTranslation(float lowerTranslation) {
        setValue(lowerTranslation, 9);
    }

    /**
     * The upper translation limit
     */
    public float upperTranslation() {
        return (float) getValueFloat(10);
    }

    /**
     * The upper translation limit
     */
    public void upperTranslation(float upperTranslation) {
        setValue(upperTranslation, 10);
    }

    /**
     * Enable/disable the joint rotational motor
     */
    public boolean enableMotor() {
        return getValue(11) != 0;
    }

    /**
     * Enable/disable the joint rotational motor
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
     * Set this flag to true if the attached bodies should collide
     */
    public boolean collideConnected() {
        return getValue(14) != 0;
    }

    /**
     * Set this flag to true if the attached bodies should collide
     */
    public void collideConnected(boolean collideConnected) {
        setValue(collideConnected, 14);
    }

    /**
     * User data pointer
     */
    public VoidPointer userData() {
        return new VoidPointer(getValue(15), false);
    }

    /**
     * User data pointer
     */
    public void userData(VoidPointer userData) {
        setValue(userData.getPointer(), 15);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int internalValue() {
        return (int) getValue(16);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void internalValue(int internalValue) {
        setValue(internalValue, 16);
    }

    public static final class b2WheelJointDefPointer extends StackElementPointer<b2WheelJointDef> {

        public b2WheelJointDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2WheelJointDefPointer() {
            this(1, true, true);
        }

        public b2WheelJointDefPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2WheelJointDef.b2WheelJointDefPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2WheelJointDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2WheelJointDef(ptr, freeOnGC);
        }
    }
}
