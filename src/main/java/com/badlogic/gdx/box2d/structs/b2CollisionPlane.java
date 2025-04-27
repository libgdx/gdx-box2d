package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Plane;

/**
 * These are collision planes that can be fed to b2SolvePlanes. Normally
 * this is assembled by the user from plane results in b2PlaneResult
 */
public final class b2CollisionPlane extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(22).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2CollisionPlane(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2CollisionPlane(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2CollisionPlane() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2CollisionPlane.b2CollisionPlanePointer asPointer() {
        return new b2CollisionPlane.b2CollisionPlanePointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2CollisionPlane.b2CollisionPlanePointer ptr) {
        ptr.setPointer(this);
    }

    /**
     * The collision plane between the mover and some shape
     */
    public b2Plane plane() {
        return new b2Plane(getPointer(), false);
    }

    /**
     * The collision plane between the mover and some shape
     */
    public void plane(b2Plane toSetPtr) {
        toSetPtr.setPointer(getPointer(), 12, this);
    }

    /**
     * The collision plane between the mover and some shape
     */
    public b2Plane getPlane() {
        return new b2Plane(getBufPtr().duplicate(0, 12), true);
    }

    /**
     * The collision plane between the mover and some shape
     */
    public void getPlane(b2Plane toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 12);
    }

    /**
     * The collision plane between the mover and some shape
     */
    public void setPlane(b2Plane toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 12);
    }

    /**
     *  Setting this to FLT_MAX makes the plane as rigid as possible. Lower values can
     * 	 make the plane collision soft. Usually in meters.
     */
    public float pushLimit() {
        return getBufPtr().getFloat(12);
    }

    /**
     *  Setting this to FLT_MAX makes the plane as rigid as possible. Lower values can
     * 	 make the plane collision soft. Usually in meters.
     */
    public void pushLimit(float pushLimit) {
        getBufPtr().setFloat(12, pushLimit);
    }

    /**
     * The push on the mover determined by b2SolvePlanes. Usually in meters.
     */
    public float push() {
        return getBufPtr().getFloat(16);
    }

    /**
     * The push on the mover determined by b2SolvePlanes. Usually in meters.
     */
    public void push(float push) {
        getBufPtr().setFloat(16, push);
    }

    /**
     * Indicates if b2ClipVector should clip against this plane. Should be false for soft collision.
     */
    public boolean clipVelocity() {
        return getBufPtr().getBoolean(20);
    }

    /**
     * Indicates if b2ClipVector should clip against this plane. Should be false for soft collision.
     */
    public void clipVelocity(boolean clipVelocity) {
        getBufPtr().setBoolean(20, clipVelocity);
    }

    public static final class b2CollisionPlanePointer extends StackElementPointer<b2CollisionPlane> {

        public b2CollisionPlanePointer(VoidPointer pointer) {
            super(pointer);
        }

        public b2CollisionPlanePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2CollisionPlanePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2CollisionPlanePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2CollisionPlanePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2CollisionPlanePointer() {
            this(1, true);
        }

        public b2CollisionPlanePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2CollisionPlane createStackElement(long ptr, boolean freeOnGC) {
            return new b2CollisionPlane(ptr, freeOnGC);
        }
    }
}
