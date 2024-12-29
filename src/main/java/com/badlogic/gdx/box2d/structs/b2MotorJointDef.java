package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2BodyId;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public final class b2MotorJointDef extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(43).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2MotorJointDef(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2MotorJointDef() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2MotorJointDef.b2MotorJointDefPointer asPointer() {
        return new b2MotorJointDef.b2MotorJointDefPointer(getPointer(), getsGCFreed());
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

    public b2Vec2 linearOffset() {
        return __linearOffset;
    }

    private static final int __linearOffset_offset = CHandler.getOffsetForField(__ffi_type, 2);

    private final b2Vec2 __linearOffset = new b2Vec2(getPointer() + __linearOffset_offset, false);

    public float angularOffset() {
        return (float) getValueFloat(3);
    }

    public void angularOffset(float angularOffset) {
        setValue(angularOffset, 3);
    }

    public float maxForce() {
        return (float) getValueFloat(4);
    }

    public void maxForce(float maxForce) {
        setValue(maxForce, 4);
    }

    public float maxTorque() {
        return (float) getValueFloat(5);
    }

    public void maxTorque(float maxTorque) {
        setValue(maxTorque, 5);
    }

    public float correctionFactor() {
        return (float) getValueFloat(6);
    }

    public void correctionFactor(float correctionFactor) {
        setValue(correctionFactor, 6);
    }

    public boolean collideConnected() {
        return getValue(7) != 0;
    }

    public void collideConnected(boolean collideConnected) {
        setValue(collideConnected, 7);
    }

    public VoidPointer userData() {
        return new VoidPointer(getValue(8), false);
    }

    public void userData(VoidPointer userData) {
        setValue(userData.getPointer(), 8);
    }

    public int internalValue() {
        return (int) getValue(9);
    }

    public void internalValue(int internalValue) {
        setValue(internalValue, 9);
    }

    public static final class b2MotorJointDefPointer extends StackElementPointer<b2MotorJointDef> {

        public b2MotorJointDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2MotorJointDefPointer() {
            this(1, true, true);
        }

        public b2MotorJointDefPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2MotorJointDef.b2MotorJointDefPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2MotorJointDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2MotorJointDef(ptr, freeOnGC);
        }
    }
}
