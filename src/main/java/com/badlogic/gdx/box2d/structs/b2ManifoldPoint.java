package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

public final class b2ManifoldPoint extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(40).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ManifoldPoint(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2ManifoldPoint() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2ManifoldPoint.b2ManifoldPointPointer asPointer() {
        return new b2ManifoldPoint.b2ManifoldPointPointer(getPointer(), getsGCFreed());
    }

    public b2Vec2 point() {
        return __point;
    }

    private static final int __point_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __point = new b2Vec2(getPointer() + __point_offset, false);

    public b2Vec2 anchorA() {
        return __anchorA;
    }

    private static final int __anchorA_offset = CHandler.getOffsetForField(__ffi_type, 1);

    private final b2Vec2 __anchorA = new b2Vec2(getPointer() + __anchorA_offset, false);

    public b2Vec2 anchorB() {
        return __anchorB;
    }

    private static final int __anchorB_offset = CHandler.getOffsetForField(__ffi_type, 2);

    private final b2Vec2 __anchorB = new b2Vec2(getPointer() + __anchorB_offset, false);

    public float separation() {
        return (float) getValueFloat(3);
    }

    public void separation(float separation) {
        setValue(separation, 3);
    }

    public float normalImpulse() {
        return (float) getValueFloat(4);
    }

    public void normalImpulse(float normalImpulse) {
        setValue(normalImpulse, 4);
    }

    public float tangentImpulse() {
        return (float) getValueFloat(5);
    }

    public void tangentImpulse(float tangentImpulse) {
        setValue(tangentImpulse, 5);
    }

    public float maxNormalImpulse() {
        return (float) getValueFloat(6);
    }

    public void maxNormalImpulse(float maxNormalImpulse) {
        setValue(maxNormalImpulse, 6);
    }

    public float normalVelocity() {
        return (float) getValueFloat(7);
    }

    public void normalVelocity(float normalVelocity) {
        setValue(normalVelocity, 7);
    }

    public char id() {
        return (char) getValue(8);
    }

    public void id(char id) {
        setValue(id, 8);
    }

    public boolean persisted() {
        return getValue(9) != 0;
    }

    public void persisted(boolean persisted) {
        setValue(persisted, 9);
    }

    public static final class b2ManifoldPointPointer extends StackElementPointer<b2ManifoldPoint> {

        public b2ManifoldPointPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ManifoldPointPointer() {
            this(1, true, true);
        }

        public b2ManifoldPointPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2ManifoldPoint.b2ManifoldPointPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2ManifoldPoint createStackElement(long ptr, boolean freeOnGC) {
            return new b2ManifoldPoint(ptr, freeOnGC);
        }
    }
}
