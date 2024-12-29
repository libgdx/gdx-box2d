package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2BodyId;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public final class b2PrismaticJointDef extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(47).getFfiType();
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
        return new b2PrismaticJointDef.b2PrismaticJointDefPointer(getPointer(), getsGCFreed());
    }

    public b2BodyId bodyIdA() {
        return __bodyIdA;
    }

    private static final int __bodyIdA_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2BodyId __bodyIdA = new b2BodyId(getPointer() + __bodyIdA_offset, false);

    public b2BodyId bodyIdB() {
        return __bodyIdB;
    }

    private static final int __bodyIdB_offset = CHandler.getOffsetForField(__ffi_type, 1);

    private final b2BodyId __bodyIdB = new b2BodyId(getPointer() + __bodyIdB_offset, false);

    public b2Vec2 localAnchorA() {
        return __localAnchorA;
    }

    private static final int __localAnchorA_offset = CHandler.getOffsetForField(__ffi_type, 2);

    private final b2Vec2 __localAnchorA = new b2Vec2(getPointer() + __localAnchorA_offset, false);

    public b2Vec2 localAnchorB() {
        return __localAnchorB;
    }

    private static final int __localAnchorB_offset = CHandler.getOffsetForField(__ffi_type, 3);

    private final b2Vec2 __localAnchorB = new b2Vec2(getPointer() + __localAnchorB_offset, false);

    public b2Vec2 localAxisA() {
        return __localAxisA;
    }

    private static final int __localAxisA_offset = CHandler.getOffsetForField(__ffi_type, 4);

    private final b2Vec2 __localAxisA = new b2Vec2(getPointer() + __localAxisA_offset, false);

    public float referenceAngle() {
        return (float) getValueFloat(5);
    }

    public void referenceAngle(float referenceAngle) {
        setValue(referenceAngle, 5);
    }

    public boolean enableSpring() {
        return getValue(6) != 0;
    }

    public void enableSpring(boolean enableSpring) {
        setValue(enableSpring, 6);
    }

    public float hertz() {
        return (float) getValueFloat(7);
    }

    public void hertz(float hertz) {
        setValue(hertz, 7);
    }

    public float dampingRatio() {
        return (float) getValueFloat(8);
    }

    public void dampingRatio(float dampingRatio) {
        setValue(dampingRatio, 8);
    }

    public boolean enableLimit() {
        return getValue(9) != 0;
    }

    public void enableLimit(boolean enableLimit) {
        setValue(enableLimit, 9);
    }

    public float lowerTranslation() {
        return (float) getValueFloat(10);
    }

    public void lowerTranslation(float lowerTranslation) {
        setValue(lowerTranslation, 10);
    }

    public float upperTranslation() {
        return (float) getValueFloat(11);
    }

    public void upperTranslation(float upperTranslation) {
        setValue(upperTranslation, 11);
    }

    public boolean enableMotor() {
        return getValue(12) != 0;
    }

    public void enableMotor(boolean enableMotor) {
        setValue(enableMotor, 12);
    }

    public float maxMotorForce() {
        return (float) getValueFloat(13);
    }

    public void maxMotorForce(float maxMotorForce) {
        setValue(maxMotorForce, 13);
    }

    public float motorSpeed() {
        return (float) getValueFloat(14);
    }

    public void motorSpeed(float motorSpeed) {
        setValue(motorSpeed, 14);
    }

    public boolean collideConnected() {
        return getValue(15) != 0;
    }

    public void collideConnected(boolean collideConnected) {
        setValue(collideConnected, 15);
    }

    public VoidPointer userData() {
        return new VoidPointer(getValue(16), false);
    }

    public void userData(VoidPointer userData) {
        setValue(userData.getPointer(), 16);
    }

    public int internalValue() {
        return (int) getValue(17);
    }

    public void internalValue(int internalValue) {
        setValue(internalValue, 17);
    }

    public static final class b2PrismaticJointDefPointer extends StackElementPointer<b2PrismaticJointDef> {

        public b2PrismaticJointDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2PrismaticJointDefPointer() {
            this(1, true, true);
        }

        public b2PrismaticJointDefPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2PrismaticJointDef.b2PrismaticJointDefPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2PrismaticJointDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2PrismaticJointDef(ptr, freeOnGC);
        }
    }
}
