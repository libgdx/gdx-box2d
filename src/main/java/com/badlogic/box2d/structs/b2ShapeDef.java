package com.badlogic.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.box2d.FFITypes;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.box2d.structs.b2Filter;

public final class b2ShapeDef extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(60).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ShapeDef(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2ShapeDef() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2ShapeDef.b2ShapeDefPointer asPointer() {
        return new b2ShapeDef.b2ShapeDefPointer(getPointer(), getsGCFreed());
    }

    public VoidPointer userData() {
        return new VoidPointer(getValue(0), false);
    }

    public void userData(VoidPointer userData) {
        setValue(userData.getPointer(), 0);
    }

    public float friction() {
        return (float) getValueFloat(1);
    }

    public void friction(float friction) {
        setValue(friction, 1);
    }

    public float restitution() {
        return (float) getValueFloat(2);
    }

    public void restitution(float restitution) {
        setValue(restitution, 2);
    }

    public float density() {
        return (float) getValueFloat(3);
    }

    public void density(float density) {
        setValue(density, 3);
    }

    public b2Filter filter() {
        return __filter;
    }

    private static final int __filter_offset = CHandler.getOffsetForField(__ffi_type, 4);

    private final b2Filter __filter = new b2Filter(getPointer() + __filter_offset, false);

    public long customColor() {
        return (long) getValue(4);
    }

    public void customColor(long customColor) {
        setValue(customColor, 4);
    }

    public boolean isSensor() {
        return getValue(5) != 0;
    }

    public void isSensor(boolean isSensor) {
        setValue(isSensor, 5);
    }

    public boolean enableSensorEvents() {
        return getValue(6) != 0;
    }

    public void enableSensorEvents(boolean enableSensorEvents) {
        setValue(enableSensorEvents, 6);
    }

    public boolean enableContactEvents() {
        return getValue(7) != 0;
    }

    public void enableContactEvents(boolean enableContactEvents) {
        setValue(enableContactEvents, 7);
    }

    public boolean enableHitEvents() {
        return getValue(8) != 0;
    }

    public void enableHitEvents(boolean enableHitEvents) {
        setValue(enableHitEvents, 8);
    }

    public boolean enablePreSolveEvents() {
        return getValue(9) != 0;
    }

    public void enablePreSolveEvents(boolean enablePreSolveEvents) {
        setValue(enablePreSolveEvents, 9);
    }

    public boolean forceContactCreation() {
        return getValue(10) != 0;
    }

    public void forceContactCreation(boolean forceContactCreation) {
        setValue(forceContactCreation, 10);
    }

    public int internalValue() {
        return (int) getValue(11);
    }

    public void internalValue(int internalValue) {
        setValue(internalValue, 11);
    }

    public static final class b2ShapeDefPointer extends StackElementPointer<b2ShapeDef> {

        public b2ShapeDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ShapeDefPointer() {
            this(1, true, true);
        }

        public b2ShapeDefPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2ShapeDef.b2ShapeDefPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2ShapeDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2ShapeDef(ptr, freeOnGC);
        }
    }
}
