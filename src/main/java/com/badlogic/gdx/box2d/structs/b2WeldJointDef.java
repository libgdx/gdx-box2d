package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
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
        __ffi_type = FFITypes.getCTypeInfo(74).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2WeldJointDef(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
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
        return new b2WeldJointDef.b2WeldJointDefPointer(getPointer(), getsGCFreed());
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
     * The bodyB angle minus bodyA angle in the reference state (radians)
     */
    public float referenceAngle() {
        return (float) getValueFloat(4);
    }

    /**
     * The bodyB angle minus bodyA angle in the reference state (radians)
     */
    public void referenceAngle(float referenceAngle) {
        setValue(referenceAngle, 4);
    }

    /**
     * Linear stiffness expressed as Hertz (cycles per second). Use zero for maximum stiffness.
     */
    public float linearHertz() {
        return (float) getValueFloat(5);
    }

    /**
     * Linear stiffness expressed as Hertz (cycles per second). Use zero for maximum stiffness.
     */
    public void linearHertz(float linearHertz) {
        setValue(linearHertz, 5);
    }

    /**
     * Angular stiffness as Hertz (cycles per second). Use zero for maximum stiffness.
     */
    public float angularHertz() {
        return (float) getValueFloat(6);
    }

    /**
     * Angular stiffness as Hertz (cycles per second). Use zero for maximum stiffness.
     */
    public void angularHertz(float angularHertz) {
        setValue(angularHertz, 6);
    }

    /**
     * Linear damping ratio, non-dimensional. Use 1 for critical damping.
     */
    public float linearDampingRatio() {
        return (float) getValueFloat(7);
    }

    /**
     * Linear damping ratio, non-dimensional. Use 1 for critical damping.
     */
    public void linearDampingRatio(float linearDampingRatio) {
        setValue(linearDampingRatio, 7);
    }

    /**
     * Linear damping ratio, non-dimensional. Use 1 for critical damping.
     */
    public float angularDampingRatio() {
        return (float) getValueFloat(8);
    }

    /**
     * Linear damping ratio, non-dimensional. Use 1 for critical damping.
     */
    public void angularDampingRatio(float angularDampingRatio) {
        setValue(angularDampingRatio, 8);
    }

    /**
     * Set this flag to true if the attached bodies should collide
     */
    public boolean collideConnected() {
        return getValue(9) != 0;
    }

    /**
     * Set this flag to true if the attached bodies should collide
     */
    public void collideConnected(boolean collideConnected) {
        setValue(collideConnected, 9);
    }

    /**
     * User data pointer
     */
    public VoidPointer userData() {
        return new VoidPointer(getValue(10), false);
    }

    /**
     * User data pointer
     */
    public void userData(VoidPointer userData) {
        setValue(userData.getPointer(), 10);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int internalValue() {
        return (int) getValue(11);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void internalValue(int internalValue) {
        setValue(internalValue, 11);
    }

    public static final class b2WeldJointDefPointer extends StackElementPointer<b2WeldJointDef> {

        public b2WeldJointDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2WeldJointDefPointer() {
            this(1, true, true);
        }

        public b2WeldJointDefPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2WeldJointDef.b2WeldJointDefPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2WeldJointDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2WeldJointDef(ptr, freeOnGC);
        }
    }
}
