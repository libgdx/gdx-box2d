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
        return new b2DistanceJointDef.b2DistanceJointDefPointer(getPointer(), false, this);
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
     * The local anchor point relative to bodyA's origin
     */
    public b2Vec2 localAnchorA() {
        return __localAnchorA;
    }

    private static final int __localAnchorA_offset = 16;

    private final b2Vec2 __localAnchorA = new b2Vec2(getPointer() + __localAnchorA_offset, false);

    /**
     * The local anchor point relative to bodyB's origin
     */
    public b2Vec2 localAnchorB() {
        return __localAnchorB;
    }

    private static final int __localAnchorB_offset = 24;

    private final b2Vec2 __localAnchorB = new b2Vec2(getPointer() + __localAnchorB_offset, false);

    /**
     * The rest length of this joint. Clamped to a stable minimum value.
     */
    public float length() {
        return getBufPtr().getFloat(32);
    }

    /**
     * The rest length of this joint. Clamped to a stable minimum value.
     */
    public void length(float length) {
        getBufPtr().setFloat(32, length);
    }

    /**
     *  Enable the distance constraint to behave like a spring. If false
     * 	 then the distance joint will be rigid, overriding the limit and motor.
     */
    public boolean enableSpring() {
        return getBufPtr().getBoolean(36);
    }

    /**
     *  Enable the distance constraint to behave like a spring. If false
     * 	 then the distance joint will be rigid, overriding the limit and motor.
     */
    public void enableSpring(boolean enableSpring) {
        getBufPtr().setBoolean(36, enableSpring);
    }

    /**
     * The spring linear stiffness Hertz, cycles per second
     */
    public float hertz() {
        return getBufPtr().getFloat(40);
    }

    /**
     * The spring linear stiffness Hertz, cycles per second
     */
    public void hertz(float hertz) {
        getBufPtr().setFloat(40, hertz);
    }

    /**
     * The spring linear damping ratio, non-dimensional
     */
    public float dampingRatio() {
        return getBufPtr().getFloat(44);
    }

    /**
     * The spring linear damping ratio, non-dimensional
     */
    public void dampingRatio(float dampingRatio) {
        getBufPtr().setFloat(44, dampingRatio);
    }

    /**
     * Enable/disable the joint limit
     */
    public boolean enableLimit() {
        return getBufPtr().getBoolean(48);
    }

    /**
     * Enable/disable the joint limit
     */
    public void enableLimit(boolean enableLimit) {
        getBufPtr().setBoolean(48, enableLimit);
    }

    /**
     * Minimum length. Clamped to a stable minimum value.
     */
    public float minLength() {
        return getBufPtr().getFloat(52);
    }

    /**
     * Minimum length. Clamped to a stable minimum value.
     */
    public void minLength(float minLength) {
        getBufPtr().setFloat(52, minLength);
    }

    /**
     * Maximum length. Must be greater than or equal to the minimum length.
     */
    public float maxLength() {
        return getBufPtr().getFloat(56);
    }

    /**
     * Maximum length. Must be greater than or equal to the minimum length.
     */
    public void maxLength(float maxLength) {
        getBufPtr().setFloat(56, maxLength);
    }

    /**
     * Enable/disable the joint motor
     */
    public boolean enableMotor() {
        return getBufPtr().getBoolean(60);
    }

    /**
     * Enable/disable the joint motor
     */
    public void enableMotor(boolean enableMotor) {
        getBufPtr().setBoolean(60, enableMotor);
    }

    /**
     * The maximum motor force, usually in newtons
     */
    public float maxMotorForce() {
        return getBufPtr().getFloat(64);
    }

    /**
     * The maximum motor force, usually in newtons
     */
    public void maxMotorForce(float maxMotorForce) {
        getBufPtr().setFloat(64, maxMotorForce);
    }

    /**
     * The desired motor speed, usually in meters per second
     */
    public float motorSpeed() {
        return getBufPtr().getFloat(68);
    }

    /**
     * The desired motor speed, usually in meters per second
     */
    public void motorSpeed(float motorSpeed) {
        getBufPtr().setFloat(68, motorSpeed);
    }

    /**
     * Set this flag to true if the attached bodies should collide
     */
    public boolean collideConnected() {
        return getBufPtr().getBoolean(72);
    }

    /**
     * Set this flag to true if the attached bodies should collide
     */
    public void collideConnected(boolean collideConnected) {
        getBufPtr().setBoolean(72, collideConnected);
    }

    /**
     * User data pointer
     */
    public VoidPointer userData() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 76 : 80), false);
    }

    /**
     * User data pointer
     */
    public void userData(VoidPointer userData) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 76 : 80, userData.getPointer());
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int internalValue() {
        return getBufPtr().getInt(CHandler.IS_32_BIT ? 80 : 88);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void internalValue(int internalValue) {
        getBufPtr().setInt(CHandler.IS_32_BIT ? 80 : 88, internalValue);
    }

    public static final class b2DistanceJointDefPointer extends StackElementPointer<b2DistanceJointDef> {

        public b2DistanceJointDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2DistanceJointDefPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2DistanceJointDefPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2DistanceJointDefPointer() {
            this(1, true);
        }

        public b2DistanceJointDefPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2DistanceJointDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2DistanceJointDef(ptr, freeOnGC);
        }
    }
}
