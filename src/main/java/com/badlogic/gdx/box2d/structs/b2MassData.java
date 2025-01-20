package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * This holds the mass data computed for a shape.
 */
public final class b2MassData extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(40).getFfiType();
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

    /**
     * The mass of the shape, usually in kilograms.
     */
    public float mass() {
        return (float) getValueFloat(0);
    }

    /**
     * The mass of the shape, usually in kilograms.
     */
    public void mass(float mass) {
        setValue(mass, 0);
    }

    /**
     * The position of the shape's centroid relative to the shape's origin.
     */
    public b2Vec2 center() {
        return __center;
    }

    private static final int __center_offset = CHandler.getOffsetForField(__ffi_type, 1);

    private final b2Vec2 __center = new b2Vec2(getPointer() + __center_offset, false);

    /**
     * The rotational inertia of the shape about the local origin.
     */
    public float rotationalInertia() {
        return (float) getValueFloat(2);
    }

    /**
     * The rotational inertia of the shape about the local origin.
     */
    public void rotationalInertia(float rotationalInertia) {
        setValue(rotationalInertia, 2);
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
