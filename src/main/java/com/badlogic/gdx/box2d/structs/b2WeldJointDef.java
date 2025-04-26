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
 * Weld joint definition
 *
 * A weld joint connect to bodies together rigidly. This constraint provides springs to mimic
 * soft-body simulation.
 * @note The approximate solver in Box2D cannot hold many bodies together rigidly
 * @ingroup weld_joint
 */
public final class b2WeldJointDef extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(79).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2WeldJointDef(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2WeldJointDef(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2WeldJointDef() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2WeldJointDef.b2WeldJointDefPointer asPointer() {
        return new b2WeldJointDef.b2WeldJointDefPointer(getPointer(), false, 1, this);
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
     *  The bodyB angle minus bodyA angle in the reference state (radians)
     * 	 todo maybe make this a b2Rot
     */
    public float referenceAngle() {
        return getBufPtr().getFloat(32);
    }

    /**
     *  The bodyB angle minus bodyA angle in the reference state (radians)
     * 	 todo maybe make this a b2Rot
     */
    public void referenceAngle(float referenceAngle) {
        getBufPtr().setFloat(32, referenceAngle);
    }

    /**
     * Linear stiffness expressed as Hertz (cycles per second). Use zero for maximum stiffness.
     */
    public float linearHertz() {
        return getBufPtr().getFloat(36);
    }

    /**
     * Linear stiffness expressed as Hertz (cycles per second). Use zero for maximum stiffness.
     */
    public void linearHertz(float linearHertz) {
        getBufPtr().setFloat(36, linearHertz);
    }

    /**
     * Angular stiffness as Hertz (cycles per second). Use zero for maximum stiffness.
     */
    public float angularHertz() {
        return getBufPtr().getFloat(40);
    }

    /**
     * Angular stiffness as Hertz (cycles per second). Use zero for maximum stiffness.
     */
    public void angularHertz(float angularHertz) {
        getBufPtr().setFloat(40, angularHertz);
    }

    /**
     * Linear damping ratio, non-dimensional. Use 1 for critical damping.
     */
    public float linearDampingRatio() {
        return getBufPtr().getFloat(44);
    }

    /**
     * Linear damping ratio, non-dimensional. Use 1 for critical damping.
     */
    public void linearDampingRatio(float linearDampingRatio) {
        getBufPtr().setFloat(44, linearDampingRatio);
    }

    /**
     * Linear damping ratio, non-dimensional. Use 1 for critical damping.
     */
    public float angularDampingRatio() {
        return getBufPtr().getFloat(48);
    }

    /**
     * Linear damping ratio, non-dimensional. Use 1 for critical damping.
     */
    public void angularDampingRatio(float angularDampingRatio) {
        getBufPtr().setFloat(48, angularDampingRatio);
    }

    /**
     * Set this flag to true if the attached bodies should collide
     */
    public boolean collideConnected() {
        return getBufPtr().getBoolean(52);
    }

    /**
     * Set this flag to true if the attached bodies should collide
     */
    public void collideConnected(boolean collideConnected) {
        getBufPtr().setBoolean(52, collideConnected);
    }

    /**
     * User data pointer
     */
    public VoidPointer userData() {
        return new VoidPointer(getBufPtr().getNativePointer(56), false);
    }

    /**
     * User data pointer
     */
    public void userData(VoidPointer userData) {
        getBufPtr().setNativePointer(56, userData.getPointer());
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int internalValue() {
        return getBufPtr().getInt(CHandler.IS_32_BIT ? 60 : 64);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void internalValue(int internalValue) {
        getBufPtr().setInt(CHandler.IS_32_BIT ? 60 : 64, internalValue);
    }

    public static final class b2WeldJointDefPointer extends StackElementPointer<b2WeldJointDef> {

        public b2WeldJointDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2WeldJointDefPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2WeldJointDefPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2WeldJointDefPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2WeldJointDefPointer() {
            this(1, true);
        }

        public b2WeldJointDefPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2WeldJointDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2WeldJointDef(ptr, freeOnGC);
        }
    }
}
