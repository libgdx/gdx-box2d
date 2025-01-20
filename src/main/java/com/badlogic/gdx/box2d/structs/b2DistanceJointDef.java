package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2BodyId;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

/**
 * Distance joint definition
 *
 * This requires defining an anchor point on both
 * bodies and the non-zero distance of the distance joint. The definition uses
 * local anchor points so that the initial configuration can violate the
 * constraint slightly. This helps when saving and loading a game.
 * @ingroup distance_joint
 */
public final class b2DistanceJointDef extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(31).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2DistanceJointDef(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2DistanceJointDef() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2DistanceJointDef.b2DistanceJointDefPointer asPointer() {
        return new b2DistanceJointDef.b2DistanceJointDefPointer(getPointer(), getsGCFreed());
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
     * The rest length of this joint. Clamped to a stable minimum value.
     */
    public float length() {
        return (float) getValueFloat(4);
    }

    /**
     * The rest length of this joint. Clamped to a stable minimum value.
     */
    public void length(float length) {
        setValue(length, 4);
    }

    /**
     *  Enable the distance constraint to behave like a spring. If false
     * 	 then the distance joint will be rigid, overriding the limit and motor.
     */
    public boolean enableSpring() {
        return getValue(5) != 0;
    }

    /**
     *  Enable the distance constraint to behave like a spring. If false
     * 	 then the distance joint will be rigid, overriding the limit and motor.
     */
    public void enableSpring(boolean enableSpring) {
        setValue(enableSpring, 5);
    }

    /**
     * The spring linear stiffness Hertz, cycles per second
     */
    public float hertz() {
        return (float) getValueFloat(6);
    }

    /**
     * The spring linear stiffness Hertz, cycles per second
     */
    public void hertz(float hertz) {
        setValue(hertz, 6);
    }

    /**
     * The spring linear damping ratio, non-dimensional
     */
    public float dampingRatio() {
        return (float) getValueFloat(7);
    }

    /**
     * The spring linear damping ratio, non-dimensional
     */
    public void dampingRatio(float dampingRatio) {
        setValue(dampingRatio, 7);
    }

    /**
     * Enable/disable the joint limit
     */
    public boolean enableLimit() {
        return getValue(8) != 0;
    }

    /**
     * Enable/disable the joint limit
     */
    public void enableLimit(boolean enableLimit) {
        setValue(enableLimit, 8);
    }

    /**
     * Minimum length. Clamped to a stable minimum value.
     */
    public float minLength() {
        return (float) getValueFloat(9);
    }

    /**
     * Minimum length. Clamped to a stable minimum value.
     */
    public void minLength(float minLength) {
        setValue(minLength, 9);
    }

    /**
     * Maximum length. Must be greater than or equal to the minimum length.
     */
    public float maxLength() {
        return (float) getValueFloat(10);
    }

    /**
     * Maximum length. Must be greater than or equal to the minimum length.
     */
    public void maxLength(float maxLength) {
        setValue(maxLength, 10);
    }

    /**
     * Enable/disable the joint motor
     */
    public boolean enableMotor() {
        return getValue(11) != 0;
    }

    /**
     * Enable/disable the joint motor
     */
    public void enableMotor(boolean enableMotor) {
        setValue(enableMotor, 11);
    }

    /**
     * The maximum motor force, usually in newtons
     */
    public float maxMotorForce() {
        return (float) getValueFloat(12);
    }

    /**
     * The maximum motor force, usually in newtons
     */
    public void maxMotorForce(float maxMotorForce) {
        setValue(maxMotorForce, 12);
    }

    /**
     * The desired motor speed, usually in meters per second
     */
    public float motorSpeed() {
        return (float) getValueFloat(13);
    }

    /**
     * The desired motor speed, usually in meters per second
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

    public static final class b2DistanceJointDefPointer extends StackElementPointer<b2DistanceJointDef> {

        public b2DistanceJointDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2DistanceJointDefPointer() {
            this(1, true, true);
        }

        public b2DistanceJointDefPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2DistanceJointDef.b2DistanceJointDefPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2DistanceJointDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2DistanceJointDef(ptr, freeOnGC);
        }
    }
}
