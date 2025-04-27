package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Plane;

/**
 * These are the collision planes returned from b2World_CollideMover
 */
public final class b2PlaneResult extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(47).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2PlaneResult(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2PlaneResult(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2PlaneResult() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2PlaneResult.b2PlaneResultPointer asPointer() {
        return new b2PlaneResult.b2PlaneResultPointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2PlaneResult.b2PlaneResultPointer ptr) {
        ptr.setPointer(this);
    }

    /**
     * The collision plane between the mover and a convex shape
     */
    public b2Plane plane() {
        return new b2Plane(getPointer(), false);
    }

    /**
     * The collision plane between the mover and a convex shape
     */
    public void plane(b2Plane toSetPtr) {
        toSetPtr.setPointer(getPointer(), 12, this);
    }

    /**
     * The collision plane between the mover and a convex shape
     */
    public b2Plane getPlane() {
        return new b2Plane(getBufPtr().duplicate(0, 12), true);
    }

    /**
     * The collision plane between the mover and a convex shape
     */
    public void getPlane(b2Plane toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 12);
    }

    /**
     * The collision plane between the mover and a convex shape
     */
    public void setPlane(b2Plane toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 12);
    }

    /**
     * Did the collision register a hit? If not this plane should be ignored.
     */
    public boolean hit() {
        return getBufPtr().getBoolean(12);
    }

    /**
     * Did the collision register a hit? If not this plane should be ignored.
     */
    public void hit(boolean hit) {
        getBufPtr().setBoolean(12, hit);
    }

    public static final class b2PlaneResultPointer extends StackElementPointer<b2PlaneResult> {

        public b2PlaneResultPointer(VoidPointer pointer) {
            super(pointer);
        }

        public b2PlaneResultPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2PlaneResultPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2PlaneResultPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2PlaneResultPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2PlaneResultPointer() {
            this(1, true);
        }

        public b2PlaneResultPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2PlaneResult createStackElement(long ptr, boolean freeOnGC) {
            return new b2PlaneResult(ptr, freeOnGC);
        }
    }
}
