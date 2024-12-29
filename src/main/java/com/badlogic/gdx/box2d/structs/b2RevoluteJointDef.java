package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2BodyId;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public final class b2RevoluteJointDef extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(52).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2RevoluteJointDef(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2RevoluteJointDef() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2RevoluteJointDef.b2RevoluteJointDefPointer asPointer() {
        return new b2RevoluteJointDef.b2RevoluteJointDefPointer(getPointer(), getsGCFreed());
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

    public float referenceAngle() {
        return (float) getValueFloat(4);
    }

    public void referenceAngle(float referenceAngle) {
        setValue(referenceAngle, 4);
    }

    public boolean enableSpring() {
        return getValue(5) != 0;
    }

    public void enableSpring(boolean enableSpring) {
        setValue(enableSpring, 5);
    }

    public float hertz() {
        return (float) getValueFloat(6);
    }

    public void hertz(float hertz) {
        setValue(hertz, 6);
    }

    public float dampingRatio() {
        return (float) getValueFloat(7);
    }

    public void dampingRatio(float dampingRatio) {
        setValue(dampingRatio, 7);
    }

    public boolean enableLimit() {
        return getValue(8) != 0;
    }

    public void enableLimit(boolean enableLimit) {
        setValue(enableLimit, 8);
    }

    public float lowerAngle() {
        return (float) getValueFloat(9);
    }

    public void lowerAngle(float lowerAngle) {
        setValue(lowerAngle, 9);
    }

    public float upperAngle() {
        return (float) getValueFloat(10);
    }

    public void upperAngle(float upperAngle) {
        setValue(upperAngle, 10);
    }

    public boolean enableMotor() {
        return getValue(11) != 0;
    }

    public void enableMotor(boolean enableMotor) {
        setValue(enableMotor, 11);
    }

    public float maxMotorTorque() {
        return (float) getValueFloat(12);
    }

    public void maxMotorTorque(float maxMotorTorque) {
        setValue(maxMotorTorque, 12);
    }

    public float motorSpeed() {
        return (float) getValueFloat(13);
    }

    public void motorSpeed(float motorSpeed) {
        setValue(motorSpeed, 13);
    }

    public float drawSize() {
        return (float) getValueFloat(14);
    }

    public void drawSize(float drawSize) {
        setValue(drawSize, 14);
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

    public static final class b2RevoluteJointDefPointer extends StackElementPointer<b2RevoluteJointDef> {

        public b2RevoluteJointDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2RevoluteJointDefPointer() {
            this(1, true, true);
        }

        public b2RevoluteJointDefPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2RevoluteJointDef.b2RevoluteJointDefPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2RevoluteJointDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2RevoluteJointDef(ptr, freeOnGC);
        }
    }
}
