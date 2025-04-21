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
 * Prismatic joint definition
 *
 * This requires defining a line of motion using an axis and an anchor point.
 * The definition uses local anchor points and a local axis so that the initial
 * configuration can violate the constraint slightly. The joint translation is zero
 * when the local anchor points coincide in world space.
 * @ingroup prismatic_joint
 */
public final class b2PrismaticJointDef extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(50).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2PrismaticJointDef(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2PrismaticJointDef() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2PrismaticJointDef.b2PrismaticJointDefPointer asPointer() {
        return new b2PrismaticJointDef.b2PrismaticJointDefPointer(getPointer(), false, this);
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
     * The constrained angle between the bodies: bodyB_angle - bodyA_angle
     */
    public float referenceAngle() {
        return getBufPtr().getFloat(40);
    }

    /**
     * The constrained angle between the bodies: bodyB_angle - bodyA_angle
     */
    public void referenceAngle(float referenceAngle) {
        getBufPtr().setFloat(40, referenceAngle);
    }

    /**
     * Enable a linear spring along the prismatic joint axis
     */
    public boolean enableSpring() {
        return getBufPtr().getBoolean(44);
    }

    /**
     * Enable a linear spring along the prismatic joint axis
     */
    public void enableSpring(boolean enableSpring) {
        getBufPtr().setBoolean(44, enableSpring);
    }

    /**
     * The spring stiffness Hertz, cycles per second
     */
    public float hertz() {
        return getBufPtr().getFloat(48);
    }

    /**
     * The spring stiffness Hertz, cycles per second
     */
    public void hertz(float hertz) {
        getBufPtr().setFloat(48, hertz);
    }

    /**
     * The spring damping ratio, non-dimensional
     */
    public float dampingRatio() {
        return getBufPtr().getFloat(52);
    }

    /**
     * The spring damping ratio, non-dimensional
     */
    public void dampingRatio(float dampingRatio) {
        getBufPtr().setFloat(52, dampingRatio);
    }

    /**
     * Enable/disable the joint limit
     */
    public boolean enableLimit() {
        return getBufPtr().getBoolean(56);
    }

    /**
     * Enable/disable the joint limit
     */
    public void enableLimit(boolean enableLimit) {
        getBufPtr().setBoolean(56, enableLimit);
    }

    /**
     * The lower translation limit
     */
    public float lowerTranslation() {
        return getBufPtr().getFloat(60);
    }

    /**
     * The lower translation limit
     */
    public void lowerTranslation(float lowerTranslation) {
        getBufPtr().setFloat(60, lowerTranslation);
    }

    /**
     * The upper translation limit
     */
    public float upperTranslation() {
        return getBufPtr().getFloat(64);
    }

    /**
     * The upper translation limit
     */
    public void upperTranslation(float upperTranslation) {
        getBufPtr().setFloat(64, upperTranslation);
    }

    /**
     * Enable/disable the joint motor
     */
    public boolean enableMotor() {
        return getBufPtr().getBoolean(68);
    }

    /**
     * Enable/disable the joint motor
     */
    public void enableMotor(boolean enableMotor) {
        getBufPtr().setBoolean(68, enableMotor);
    }

    /**
     * The maximum motor force, typically in newtons
     */
    public float maxMotorForce() {
        return getBufPtr().getFloat(72);
    }

    /**
     * The maximum motor force, typically in newtons
     */
    public void maxMotorForce(float maxMotorForce) {
        getBufPtr().setFloat(72, maxMotorForce);
    }

    /**
     * The desired motor speed, typically in meters per second
     */
    public float motorSpeed() {
        return getBufPtr().getFloat(76);
    }

    /**
     * The desired motor speed, typically in meters per second
     */
    public void motorSpeed(float motorSpeed) {
        getBufPtr().setFloat(76, motorSpeed);
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
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 84 : 88), false);
    }

    /**
     * User data pointer
     */
    public void userData(VoidPointer userData) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 84 : 88, userData.getPointer());
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int internalValue() {
        return getBufPtr().getInt(CHandler.IS_32_BIT ? 88 : 96);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void internalValue(int internalValue) {
        getBufPtr().setInt(CHandler.IS_32_BIT ? 88 : 96, internalValue);
    }

    public static final class b2PrismaticJointDefPointer extends StackElementPointer<b2PrismaticJointDef> {

        public b2PrismaticJointDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2PrismaticJointDefPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2PrismaticJointDefPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2PrismaticJointDefPointer() {
            this(1, true);
        }

        public b2PrismaticJointDefPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2PrismaticJointDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2PrismaticJointDef(ptr, freeOnGC);
        }
    }
}
