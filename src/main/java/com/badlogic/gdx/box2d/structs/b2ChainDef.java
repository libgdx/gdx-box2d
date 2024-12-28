package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.box2d.structs.b2Filter;

public final class b2ChainDef extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(19).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ChainDef(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2ChainDef() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2ChainDef.b2ChainDefPointer asPointer() {
        return new b2ChainDef.b2ChainDefPointer(getPointer(), getsGCFreed());
    }

    public VoidPointer userData() {
        return new VoidPointer(getValue(0), false);
    }

    public void userData(VoidPointer userData) {
        setValue(userData.getPointer(), 0);
    }

    public b2Vec2.b2Vec2Pointer points() {
        return new b2Vec2.b2Vec2Pointer(getValue(1), false);
    }

    public void points(b2Vec2.b2Vec2Pointer points) {
        setValue(points.getPointer(), 1);
    }

    public int count() {
        return (int) getValue(2);
    }

    public void count(int count) {
        setValue(count, 2);
    }

    public float friction() {
        return (float) getValueFloat(3);
    }

    public void friction(float friction) {
        setValue(friction, 3);
    }

    public float restitution() {
        return (float) getValueFloat(4);
    }

    public void restitution(float restitution) {
        setValue(restitution, 4);
    }

    public b2Filter filter() {
        return __filter;
    }

    private static final int __filter_offset = CHandler.getOffsetForField(__ffi_type, 5);

    private final b2Filter __filter = new b2Filter(getPointer() + __filter_offset, false);

    public long customColor() {
        return (long) getValue(5);
    }

    public void customColor(long customColor) {
        setValue(customColor, 5);
    }

    public boolean isLoop() {
        return getValue(6) != 0;
    }

    public void isLoop(boolean isLoop) {
        setValue(isLoop, 6);
    }

    public int internalValue() {
        return (int) getValue(7);
    }

    public void internalValue(int internalValue) {
        setValue(internalValue, 7);
    }

    public static final class b2ChainDefPointer extends StackElementPointer<b2ChainDef> {

        public b2ChainDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ChainDefPointer() {
            this(1, true, true);
        }

        public b2ChainDefPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2ChainDef.b2ChainDefPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2ChainDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2ChainDef(ptr, freeOnGC);
        }
    }
}
