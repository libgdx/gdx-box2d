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

    public b2PrismaticJointDef(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
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
        return new b2PrismaticJointDef.b2PrismaticJointDefPointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2PrismaticJointDef.b2PrismaticJointDefPointer ptr) {
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
     * The local translation unit axis in bodyA
     */
    public b2Vec2 localAxisA() {
        return new b2Vec2(getPointer() + (32), false);
    }

    /**
     * The local translation unit axis in bodyA
     */
    public void localAxisA(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (32), 8, this);
    }

    /**
     * The local translation unit axis in bodyA
     */
    public b2Vec2 getLocalAxisA() {
        return new b2Vec2(getBufPtr().duplicate(32, 8), true);
    }

    /**
     * The local translation unit axis in bodyA
     */
    public void getLocalAxisA(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 32, 8);
    }

    /**
     * The local translation unit axis in bodyA
     */
    public void setLocalAxisA(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(32, toCopyFrom.getBufPtr(), 0, 8);
    }

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
     *  The target translation for the joint in meters. The spring-damper will drive
     * 	 to this translation.
     */
    public float targetTranslation() {
        return getBufPtr().getFloat(44);
    }

    /**
     *  The target translation for the joint in meters. The spring-damper will drive
     * 	 to this translation.
     */
    public void targetTranslation(float targetTranslation) {
        getBufPtr().setFloat(44, targetTranslation);
    }

    /**
     * Enable a linear spring along the prismatic joint axis
     */
    public boolean enableSpring() {
        return getBufPtr().getBoolean(48);
    }

    /**
     * Enable a linear spring along the prismatic joint axis
     */
    public void enableSpring(boolean enableSpring) {
        getBufPtr().setBoolean(48, enableSpring);
    }

    /**
     * The spring stiffness Hertz, cycles per second
     */
    public float hertz() {
        return getBufPtr().getFloat(52);
    }

    /**
     * The spring stiffness Hertz, cycles per second
     */
    public void hertz(float hertz) {
        getBufPtr().setFloat(52, hertz);
    }

    /**
     * The spring damping ratio, non-dimensional
     */
    public float dampingRatio() {
        return getBufPtr().getFloat(56);
    }

    /**
     * The spring damping ratio, non-dimensional
     */
    public void dampingRatio(float dampingRatio) {
        getBufPtr().setFloat(56, dampingRatio);
    }

    /**
     * Enable/disable the joint limit
     */
    public boolean enableLimit() {
        return getBufPtr().getBoolean(60);
    }

    /**
     * Enable/disable the joint limit
     */
    public void enableLimit(boolean enableLimit) {
        getBufPtr().setBoolean(60, enableLimit);
    }

    /**
     * The lower translation limit
     */
    public float lowerTranslation() {
        return getBufPtr().getFloat(64);
    }

    /**
     * The lower translation limit
     */
    public void lowerTranslation(float lowerTranslation) {
        getBufPtr().setFloat(64, lowerTranslation);
    }

    /**
     * The upper translation limit
     */
    public float upperTranslation() {
        return getBufPtr().getFloat(68);
    }

    /**
     * The upper translation limit
     */
    public void upperTranslation(float upperTranslation) {
        getBufPtr().setFloat(68, upperTranslation);
    }

    /**
     * Enable/disable the joint motor
     */
    public boolean enableMotor() {
        return getBufPtr().getBoolean(72);
    }

    /**
     * Enable/disable the joint motor
     */
    public void enableMotor(boolean enableMotor) {
        getBufPtr().setBoolean(72, enableMotor);
    }

    /**
     * The maximum motor force, typically in newtons
     */
    public float maxMotorForce() {
        return getBufPtr().getFloat(76);
    }

    /**
     * The maximum motor force, typically in newtons
     */
    public void maxMotorForce(float maxMotorForce) {
        getBufPtr().setFloat(76, maxMotorForce);
    }

    /**
     * The desired motor speed, typically in meters per second
     */
    public float motorSpeed() {
        return getBufPtr().getFloat(80);
    }

    /**
     * The desired motor speed, typically in meters per second
     */
    public void motorSpeed(float motorSpeed) {
        getBufPtr().setFloat(80, motorSpeed);
    }

    /**
     * Set this flag to true if the attached bodies should collide
     */
    public boolean collideConnected() {
        return getBufPtr().getBoolean(84);
    }

    /**
     * Set this flag to true if the attached bodies should collide
     */
    public void collideConnected(boolean collideConnected) {
        getBufPtr().setBoolean(84, collideConnected);
    }

    /**
     * User data pointer
     */
    public VoidPointer userData() {
        return new VoidPointer(getBufPtr().getNativePointer(88), false);
    }

    /**
     * User data pointer
     */
    public void userData(VoidPointer userData) {
        getBufPtr().setNativePointer(88, userData.getPointer());
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int internalValue() {
        return getBufPtr().getInt(CHandler.IS_64_BIT ? 96 : 92);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void internalValue(int internalValue) {
        getBufPtr().setInt(CHandler.IS_64_BIT ? 96 : 92, internalValue);
    }

    public static final class b2PrismaticJointDefPointer extends StackElementPointer<b2PrismaticJointDef> {

        public b2PrismaticJointDefPointer(VoidPointer pointer) {
            super(pointer);
        }

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

        public b2PrismaticJointDefPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
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
