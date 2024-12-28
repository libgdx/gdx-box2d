package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2BodyId;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public final class b2MouseJointDef extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(44).getFfiType();
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

    public b2Vec2 target() {
        return __target;
    }

    private static final int __target_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __target = new b2Vec2(getPointer() + __target_offset, false);

    public float hertz() {
        return (float) getValueFloat(0);
    }

    public void hertz(float hertz) {
        setValue(hertz, 0);
    }

    public float dampingRatio() {
        return (float) getValueFloat(1);
    }

    public void dampingRatio(float dampingRatio) {
        setValue(dampingRatio, 1);
    }

    public float maxForce() {
        return (float) getValueFloat(2);
    }

    public void maxForce(float maxForce) {
        setValue(maxForce, 2);
    }

    public boolean collideConnected() {
        return getValue(3) != 0;
    }

    public void collideConnected(boolean collideConnected) {
        setValue(collideConnected, 3);
    }

    public VoidPointer userData() {
        return new VoidPointer(getValue(4), false);
    }

    public void userData(VoidPointer userData) {
        setValue(userData.getPointer(), 4);
    }

    public int internalValue() {
        return (int) getValue(5);
    }

    public void internalValue(int internalValue) {
        setValue(internalValue, 5);
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
