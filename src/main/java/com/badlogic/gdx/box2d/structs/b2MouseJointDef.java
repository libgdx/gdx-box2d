package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2BodyId;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

/**
 * A mouse joint is used to make a point on a body track a specified world point.
 *
 * This a soft constraint and allows the constraint to stretch without
 * applying huge forces. This also applies rotation constraint heuristic to improve control.
 * @ingroup mouse_joint
 */
public final class b2MouseJointDef extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(43).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2MouseJointDef(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2MouseJointDef() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2MouseJointDef.b2MouseJointDefPointer asPointer() {
        return new b2MouseJointDef.b2MouseJointDefPointer(getPointer(), getsGCFreed());
    }

    /**
     * The first attached body. This is assumed to be static.
     */
    public b2BodyId bodyIdA() {
        return __bodyIdA;
    }

    private static final int __bodyIdA_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2BodyId __bodyIdA = new b2BodyId(getPointer() + __bodyIdA_offset, false);

    /**
     * The second attached body.
     */
    public b2BodyId bodyIdB() {
        return __bodyIdB;
    }

    private static final int __bodyIdB_offset = CHandler.getOffsetForField(__ffi_type, 1);

    private final b2BodyId __bodyIdB = new b2BodyId(getPointer() + __bodyIdB_offset, false);

    /**
     * The initial target point in world space
     */
    public b2Vec2 target() {
        return __target;
    }

    private static final int __target_offset = CHandler.getOffsetForField(__ffi_type, 2);

    private final b2Vec2 __target = new b2Vec2(getPointer() + __target_offset, false);

    /**
     * Stiffness in hertz
     */
    public float hertz() {
        return (float) getValueFloat(3);
    }

    /**
     * Stiffness in hertz
     */
    public void hertz(float hertz) {
        setValue(hertz, 3);
    }

    /**
     * Damping ratio, non-dimensional
     */
    public float dampingRatio() {
        return (float) getValueFloat(4);
    }

    /**
     * Damping ratio, non-dimensional
     */
    public void dampingRatio(float dampingRatio) {
        setValue(dampingRatio, 4);
    }

    /**
     * Maximum force, typically in newtons
     */
    public float maxForce() {
        return (float) getValueFloat(5);
    }

    /**
     * Maximum force, typically in newtons
     */
    public void maxForce(float maxForce) {
        setValue(maxForce, 5);
    }

    /**
     * Set this flag to true if the attached bodies should collide.
     */
    public boolean collideConnected() {
        return getValue(6) != 0;
    }

    /**
     * Set this flag to true if the attached bodies should collide.
     */
    public void collideConnected(boolean collideConnected) {
        setValue(collideConnected, 6);
    }

    /**
     * User data pointer
     */
    public VoidPointer userData() {
        return new VoidPointer(getValue(7), false);
    }

    /**
     * User data pointer
     */
    public void userData(VoidPointer userData) {
        setValue(userData.getPointer(), 7);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int internalValue() {
        return (int) getValue(8);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void internalValue(int internalValue) {
        setValue(internalValue, 8);
    }

    public static final class b2MouseJointDefPointer extends StackElementPointer<b2MouseJointDef> {

        public b2MouseJointDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2MouseJointDefPointer() {
            this(1, true, true);
        }

        public b2MouseJointDefPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2MouseJointDef.b2MouseJointDefPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2MouseJointDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2MouseJointDef(ptr, freeOnGC);
        }
    }
}
