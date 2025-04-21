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
        __ffi_type = FFITypes.getCTypeInfo(80).getFfiType();
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
        return new b2WheelJointDef.b2WheelJointDefPointer(getPointer(), false, this);
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
     * The local translation unit axis in bodyA
     */
    public b2Vec2 localAxisA() {
        return __localAxisA;
    }

    private static final int __localAxisA_offset = 32;

    private final b2Vec2 __localAxisA = new b2Vec2(getPointer() + __localAxisA_offset, false);

    /**
     * Enable a linear spring along the local axis
     */
    public boolean enableSpring() {
        return getBufPtr().getBoolean(40);
    }

    /**
     * Enable a linear spring along the local axis
     */
    public void enableSpring(boolean enableSpring) {
        getBufPtr().setBoolean(40, enableSpring);
    }

    /**
     * Spring stiffness in Hertz
     */
    public float hertz() {
        return getBufPtr().getFloat(44);
    }

    /**
     * Spring stiffness in Hertz
     */
    public void hertz(float hertz) {
        getBufPtr().setFloat(44, hertz);
    }

    /**
     * Spring damping ratio, non-dimensional
     */
    public float dampingRatio() {
        return getBufPtr().getFloat(48);
    }

    /**
     * Spring damping ratio, non-dimensional
     */
    public void dampingRatio(float dampingRatio) {
        getBufPtr().setFloat(48, dampingRatio);
    }

    /**
     * Enable/disable the joint linear limit
     */
    public boolean enableLimit() {
        return getBufPtr().getBoolean(52);
    }

    /**
     * Enable/disable the joint linear limit
     */
    public void enableLimit(boolean enableLimit) {
        getBufPtr().setBoolean(52, enableLimit);
    }

    /**
     * The lower translation limit
     */
    public float lowerTranslation() {
        return getBufPtr().getFloat(56);
    }

    /**
     * The lower translation limit
     */
    public void lowerTranslation(float lowerTranslation) {
        getBufPtr().setFloat(56, lowerTranslation);
    }

    /**
     * The upper translation limit
     */
    public float upperTranslation() {
        return getBufPtr().getFloat(60);
    }

    /**
     * The upper translation limit
     */
    public void upperTranslation(float upperTranslation) {
        getBufPtr().setFloat(60, upperTranslation);
    }

    /**
     * Enable/disable the joint rotational motor
     */
    public boolean enableMotor() {
        return getBufPtr().getBoolean(64);
    }

    /**
     * Enable/disable the joint rotational motor
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
     * Set this flag to true if the attached bodies should collide
     */
    public boolean collideConnected() {
        return getBufPtr().getBoolean(76);
    }

    /**
     * Set this flag to true if the attached bodies should collide
     */
    public void collideConnected(boolean collideConnected) {
        getBufPtr().setBoolean(76, collideConnected);
    }

    /**
     * User data pointer
     */
    public VoidPointer userData() {
        return new VoidPointer(getBufPtr().getNativePointer(80), false);
    }

    /**
     * User data pointer
     */
    public void userData(VoidPointer userData) {
        getBufPtr().setNativePointer(80, userData.getPointer());
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int internalValue() {
        return getBufPtr().getInt(CHandler.IS_32_BIT ? 84 : 88);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void internalValue(int internalValue) {
        getBufPtr().setInt(CHandler.IS_32_BIT ? 84 : 88, internalValue);
    }

    public static final class b2WheelJointDefPointer extends StackElementPointer<b2WheelJointDef> {

        public b2WheelJointDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2WheelJointDefPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2WheelJointDefPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2WheelJointDefPointer() {
            this(1, true);
        }

        public b2WheelJointDefPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2WheelJointDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2WheelJointDef(ptr, freeOnGC);
        }
    }
}
