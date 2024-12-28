package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2BodyId;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public final class b2WeldJointDef extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(76).getFfiType();
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

    public float referenceAngle() {
        return (float) getValueFloat(0);
    }

    public void referenceAngle(float referenceAngle) {
        setValue(referenceAngle, 0);
    }

    public float linearHertz() {
        return (float) getValueFloat(1);
    }

    public void linearHertz(float linearHertz) {
        setValue(linearHertz, 1);
    }

    public float angularHertz() {
        return (float) getValueFloat(2);
    }

    public void angularHertz(float angularHertz) {
        setValue(angularHertz, 2);
    }

    public float linearDampingRatio() {
        return (float) getValueFloat(3);
    }

    public void linearDampingRatio(float linearDampingRatio) {
        setValue(linearDampingRatio, 3);
    }

    public float angularDampingRatio() {
        return (float) getValueFloat(4);
    }

    public void angularDampingRatio(float angularDampingRatio) {
        setValue(angularDampingRatio, 4);
    }

    public boolean collideConnected() {
        return getValue(5) != 0;
    }

    public void collideConnected(boolean collideConnected) {
        setValue(collideConnected, 5);
    }

    public VoidPointer userData() {
        return new VoidPointer(getValue(6), false);
    }

    public void userData(VoidPointer userData) {
        setValue(userData.getPointer(), 6);
    }

    public int internalValue() {
        return (int) getValue(7);
    }

    public void internalValue(int internalValue) {
        setValue(internalValue, 7);
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
