package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.enums.b2BodyType;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.box2d.structs.b2Rot;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public final class b2BodyDef extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(13).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2BodyDef(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2BodyDef() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2BodyDef.b2BodyDefPointer asPointer() {
        return new b2BodyDef.b2BodyDefPointer(getPointer(), getsGCFreed());
    }

    public b2BodyType type() {
        return b2BodyType.getByIndex((int) getValue(0));
    }

    public void type(b2BodyType type) {
        setValue(type.getIndex(), 0);
    }

    public b2Vec2 position() {
        return __position;
    }

    private static final int __position_offset = CHandler.getOffsetForField(__ffi_type, 1);

    private final b2Vec2 __position = new b2Vec2(getPointer() + __position_offset, false);

    public b2Rot rotation() {
        return __rotation;
    }

    private static final int __rotation_offset = CHandler.getOffsetForField(__ffi_type, 2);

    private final b2Rot __rotation = new b2Rot(getPointer() + __rotation_offset, false);

    public b2Vec2 linearVelocity() {
        return __linearVelocity;
    }

    private static final int __linearVelocity_offset = CHandler.getOffsetForField(__ffi_type, 3);

    private final b2Vec2 __linearVelocity = new b2Vec2(getPointer() + __linearVelocity_offset, false);

    public float angularVelocity() {
        return (float) getValueFloat(4);
    }

    public void angularVelocity(float angularVelocity) {
        setValue(angularVelocity, 4);
    }

    public float linearDamping() {
        return (float) getValueFloat(5);
    }

    public void linearDamping(float linearDamping) {
        setValue(linearDamping, 5);
    }

    public float angularDamping() {
        return (float) getValueFloat(6);
    }

    public void angularDamping(float angularDamping) {
        setValue(angularDamping, 6);
    }

    public float gravityScale() {
        return (float) getValueFloat(7);
    }

    public void gravityScale(float gravityScale) {
        setValue(gravityScale, 7);
    }

    public float sleepThreshold() {
        return (float) getValueFloat(8);
    }

    public void sleepThreshold(float sleepThreshold) {
        setValue(sleepThreshold, 8);
    }

    public VoidPointer userData() {
        return new VoidPointer(getValue(9), false);
    }

    public void userData(VoidPointer userData) {
        setValue(userData.getPointer(), 9);
    }

    public boolean enableSleep() {
        return getValue(10) != 0;
    }

    public void enableSleep(boolean enableSleep) {
        setValue(enableSleep, 10);
    }

    public boolean isAwake() {
        return getValue(11) != 0;
    }

    public void isAwake(boolean isAwake) {
        setValue(isAwake, 11);
    }

    public boolean fixedRotation() {
        return getValue(12) != 0;
    }

    public void fixedRotation(boolean fixedRotation) {
        setValue(fixedRotation, 12);
    }

    public boolean isBullet() {
        return getValue(13) != 0;
    }

    public void isBullet(boolean isBullet) {
        setValue(isBullet, 13);
    }

    public boolean isEnabled() {
        return getValue(14) != 0;
    }

    public void isEnabled(boolean isEnabled) {
        setValue(isEnabled, 14);
    }

    public boolean allowFastRotation() {
        return getValue(15) != 0;
    }

    public void allowFastRotation(boolean allowFastRotation) {
        setValue(allowFastRotation, 15);
    }

    public int internalValue() {
        return (int) getValue(16);
    }

    public void internalValue(int internalValue) {
        setValue(internalValue, 16);
    }

    public static final class b2BodyDefPointer extends StackElementPointer<b2BodyDef> {

        public b2BodyDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2BodyDefPointer() {
            this(1, true, true);
        }

        public b2BodyDefPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2BodyDef.b2BodyDefPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2BodyDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2BodyDef(ptr, freeOnGC);
        }
    }
}
