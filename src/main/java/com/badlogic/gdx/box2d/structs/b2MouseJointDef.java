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
        __ffi_type = FFITypes.getCTypeInfo(45).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2MouseJointDef(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2MouseJointDef(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
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
        return new b2MouseJointDef.b2MouseJointDefPointer(getPointer(), false, 1, this);
    }

    /**
     * The first attached body. This is assumed to be static.
     */
    public b2BodyId bodyIdA() {
        return new b2BodyId(getPointer(), false);
    }

    /**
     * The first attached body. This is assumed to be static.
     */
    public void bodyIdA(b2BodyId toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    /**
     * The first attached body. This is assumed to be static.
     */
    public b2BodyId getBodyIdA() {
        return new b2BodyId(getBufPtr().duplicate(0, 8), true);
    }

    /**
     * The first attached body. This is assumed to be static.
     */
    public void getBodyIdA(b2BodyId toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    /**
     * The first attached body. This is assumed to be static.
     */
    public void setBodyIdA(b2BodyId toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * The second attached body.
     */
    public b2BodyId bodyIdB() {
        return new b2BodyId(getPointer() + (8), false);
    }

    /**
     * The second attached body.
     */
    public void bodyIdB(b2BodyId toSetPtr) {
        toSetPtr.setPointer(getPointer() + (8), 8, this);
    }

    /**
     * The second attached body.
     */
    public b2BodyId getBodyIdB() {
        return new b2BodyId(getBufPtr().duplicate(8, 8), true);
    }

    /**
     * The second attached body.
     */
    public void getBodyIdB(b2BodyId toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 8, 8);
    }

    /**
     * The second attached body.
     */
    public void setBodyIdB(b2BodyId toCopyFrom) {
        getBufPtr().copyFrom(8, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * The initial target point in world space
     */
    public b2Vec2 target() {
        return new b2Vec2(getPointer() + (16), false);
    }

    /**
     * The initial target point in world space
     */
    public void target(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (16), 8, this);
    }

    /**
     * The initial target point in world space
     */
    public b2Vec2 getTarget() {
        return new b2Vec2(getBufPtr().duplicate(16, 8), true);
    }

    /**
     * The initial target point in world space
     */
    public void getTarget(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 16, 8);
    }

    /**
     * The initial target point in world space
     */
    public void setTarget(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(16, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * Stiffness in hertz
     */
    public float hertz() {
        return getBufPtr().getFloat(24);
    }

    /**
     * Stiffness in hertz
     */
    public void hertz(float hertz) {
        getBufPtr().setFloat(24, hertz);
    }

    /**
     * Damping ratio, non-dimensional
     */
    public float dampingRatio() {
        return getBufPtr().getFloat(28);
    }

    /**
     * Damping ratio, non-dimensional
     */
    public void dampingRatio(float dampingRatio) {
        getBufPtr().setFloat(28, dampingRatio);
    }

    /**
     * Maximum force, typically in newtons
     */
    public float maxForce() {
        return getBufPtr().getFloat(32);
    }

    /**
     * Maximum force, typically in newtons
     */
    public void maxForce(float maxForce) {
        getBufPtr().setFloat(32, maxForce);
    }

    /**
     * Set this flag to true if the attached bodies should collide.
     */
    public boolean collideConnected() {
        return getBufPtr().getBoolean(36);
    }

    /**
     * Set this flag to true if the attached bodies should collide.
     */
    public void collideConnected(boolean collideConnected) {
        getBufPtr().setBoolean(36, collideConnected);
    }

    /**
     * User data pointer
     */
    public VoidPointer userData() {
        return new VoidPointer(getBufPtr().getNativePointer(40), false);
    }

    /**
     * User data pointer
     */
    public void userData(VoidPointer userData) {
        getBufPtr().setNativePointer(40, userData.getPointer());
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int internalValue() {
        return getBufPtr().getInt(CHandler.IS_32_BIT ? 44 : 48);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void internalValue(int internalValue) {
        getBufPtr().setInt(CHandler.IS_32_BIT ? 44 : 48, internalValue);
    }

    public static final class b2MouseJointDefPointer extends StackElementPointer<b2MouseJointDef> {

        public b2MouseJointDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2MouseJointDefPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2MouseJointDefPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2MouseJointDefPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2MouseJointDefPointer() {
            this(1, true);
        }

        public b2MouseJointDefPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2MouseJointDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2MouseJointDef(ptr, freeOnGC);
        }
    }
}
