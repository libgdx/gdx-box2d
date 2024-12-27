package com.badlogic.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.box2d.FFITypes;
import com.badlogic.box2d.structs.b2BodyId;
import com.badlogic.box2d.structs.b2Vec2;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public final class b2DistanceJointDef extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(32).getFfiType();
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

    public b2BodyId bodyIdA() {
        return __bodyIdA;
    }

    private static final int __bodyIdA_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2BodyId __bodyIdA = new b2BodyId(getPointer() + __bodyIdA_offset, false);

    public b2BodyId bodyIdB() {
        return __bodyIdB;
    }

    private static final int __bodyIdB_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2BodyId __bodyIdB = new b2BodyId(getPointer() + __bodyIdB_offset, false);

    public b2Vec2 localAnchorA() {
        return __localAnchorA;
    }

    private static final int __localAnchorA_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __localAnchorA = new b2Vec2(getPointer() + __localAnchorA_offset, false);

    public b2Vec2 localAnchorB() {
        return __localAnchorB;
    }

    private static final int __localAnchorB_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __localAnchorB = new b2Vec2(getPointer() + __localAnchorB_offset, false);

    public float length() {
        return (float) getValueFloat(0);
    }

    public void length(float length) {
        setValue(length, 0);
    }

    public boolean enableSpring() {
        return getValue(1) != 0;
    }

    public void enableSpring(boolean enableSpring) {
        setValue(enableSpring, 1);
    }

    public float hertz() {
        return (float) getValueFloat(2);
    }

    public void hertz(float hertz) {
        setValue(hertz, 2);
    }

    public float dampingRatio() {
        return (float) getValueFloat(3);
    }

    public void dampingRatio(float dampingRatio) {
        setValue(dampingRatio, 3);
    }

    public boolean enableLimit() {
        return getValue(4) != 0;
    }

    public void enableLimit(boolean enableLimit) {
        setValue(enableLimit, 4);
    }

    public float minLength() {
        return (float) getValueFloat(5);
    }

    public void minLength(float minLength) {
        setValue(minLength, 5);
    }

    public float maxLength() {
        return (float) getValueFloat(6);
    }

    public void maxLength(float maxLength) {
        setValue(maxLength, 6);
    }

    public boolean enableMotor() {
        return getValue(7) != 0;
    }

    public void enableMotor(boolean enableMotor) {
        setValue(enableMotor, 7);
    }

    public float maxMotorForce() {
        return (float) getValueFloat(8);
    }

    public void maxMotorForce(float maxMotorForce) {
        setValue(maxMotorForce, 8);
    }

    public float motorSpeed() {
        return (float) getValueFloat(9);
    }

    public void motorSpeed(float motorSpeed) {
        setValue(motorSpeed, 9);
    }

    public boolean collideConnected() {
        return getValue(10) != 0;
    }

    public void collideConnected(boolean collideConnected) {
        setValue(collideConnected, 10);
    }

    public VoidPointer userData() {
        return new VoidPointer(getValue(11), false);
    }

    public void userData(VoidPointer userData) {
        setValue(userData.getPointer(), 11);
    }

    public int internalValue() {
        return (int) getValue(12);
    }

    public void internalValue(int internalValue) {
        setValue(internalValue, 12);
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
