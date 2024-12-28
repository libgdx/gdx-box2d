package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

public final class b2MassData extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(41).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2MassData(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2MassData() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2MassData.b2MassDataPointer asPointer() {
        return new b2MassData.b2MassDataPointer(getPointer(), getsGCFreed());
    }

    public float mass() {
        return (float) getValueFloat(0);
    }

    public void mass(float mass) {
        setValue(mass, 0);
    }

    public b2Vec2 center() {
        return __center;
    }

    private static final int __center_offset = CHandler.getOffsetForField(__ffi_type, 1);

    private final b2Vec2 __center = new b2Vec2(getPointer() + __center_offset, false);

    public float rotationalInertia() {
        return (float) getValueFloat(1);
    }

    public void rotationalInertia(float rotationalInertia) {
        setValue(rotationalInertia, 1);
    }

    public static final class b2MassDataPointer extends StackElementPointer<b2MassData> {

        public b2MassDataPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2MassDataPointer() {
            this(1, true, true);
        }

        public b2MassDataPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2MassData.b2MassDataPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2MassData createStackElement(long ptr, boolean freeOnGC) {
            return new b2MassData(ptr, freeOnGC);
        }
    }
}
