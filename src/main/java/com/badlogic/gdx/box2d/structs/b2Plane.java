package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * separation = dot(normal, point) - offset
 */
public final class b2Plane extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(46).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2Plane(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2Plane(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2Plane() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2Plane.b2PlanePointer asPointer() {
        return new b2Plane.b2PlanePointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2Plane.b2PlanePointer ptr) {
        ptr.setPointer(this);
    }

    public b2Vec2 normal() {
        return new b2Vec2(getPointer(), false);
    }

    public void normal(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    public b2Vec2 getNormal() {
        return new b2Vec2(getBufPtr().duplicate(0, 8), true);
    }

    public void getNormal(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    public void setNormal(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    public float offset() {
        return getBufPtr().getFloat(8);
    }

    public void offset(float offset) {
        getBufPtr().setFloat(8, offset);
    }

    public static final class b2PlanePointer extends StackElementPointer<b2Plane> {

        public b2PlanePointer(VoidPointer pointer) {
            super(pointer);
        }

        public b2PlanePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2PlanePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2PlanePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2PlanePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2PlanePointer() {
            this(1, true);
        }

        public b2PlanePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2Plane createStackElement(long ptr, boolean freeOnGC) {
            return new b2Plane(ptr, freeOnGC);
        }
    }
}
