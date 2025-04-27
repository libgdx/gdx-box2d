package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * This holds the mass data computed for a shape.
 */
public final class b2MassData extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(42).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2MassData(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2MassData(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
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
        return new b2MassData.b2MassDataPointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2MassData.b2MassDataPointer ptr) {
        ptr.setPointer(this);
    }

    /**
     * The mass of the shape, usually in kilograms.
     */
    public float mass() {
        return getBufPtr().getFloat(0);
    }

    /**
     * The mass of the shape, usually in kilograms.
     */
    public void mass(float mass) {
        getBufPtr().setFloat(0, mass);
    }

    /**
     * The position of the shape's centroid relative to the shape's origin.
     */
    public b2Vec2 center() {
        return new b2Vec2(getPointer() + (4), false);
    }

    /**
     * The position of the shape's centroid relative to the shape's origin.
     */
    public void center(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (4), 8, this);
    }

    /**
     * The position of the shape's centroid relative to the shape's origin.
     */
    public b2Vec2 getCenter() {
        return new b2Vec2(getBufPtr().duplicate(4, 8), true);
    }

    /**
     * The position of the shape's centroid relative to the shape's origin.
     */
    public void getCenter(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 4, 8);
    }

    /**
     * The position of the shape's centroid relative to the shape's origin.
     */
    public void setCenter(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(4, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * The rotational inertia of the shape about the local origin.
     */
    public float rotationalInertia() {
        return getBufPtr().getFloat(12);
    }

    /**
     * The rotational inertia of the shape about the local origin.
     */
    public void rotationalInertia(float rotationalInertia) {
        getBufPtr().setFloat(12, rotationalInertia);
    }

    public static final class b2MassDataPointer extends StackElementPointer<b2MassData> {

        public b2MassDataPointer(VoidPointer pointer) {
            super(pointer);
        }

        public b2MassDataPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2MassDataPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2MassDataPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2MassDataPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2MassDataPointer() {
            this(1, true);
        }

        public b2MassDataPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2MassData createStackElement(long ptr, boolean freeOnGC) {
            return new b2MassData(ptr, freeOnGC);
        }
    }
}
