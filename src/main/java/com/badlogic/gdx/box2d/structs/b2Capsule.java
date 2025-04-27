package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * A solid capsule can be viewed as two semicircles connected
 * by a rectangle.
 */
public final class b2Capsule extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(16).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2Capsule(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2Capsule(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2Capsule() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2Capsule.b2CapsulePointer asPointer() {
        return new b2Capsule.b2CapsulePointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2Capsule.b2CapsulePointer ptr) {
        ptr.setPointer(this);
    }

    /**
     * Local center of the first semicircle
     */
    public b2Vec2 center1() {
        return new b2Vec2(getPointer(), false);
    }

    /**
     * Local center of the first semicircle
     */
    public void center1(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    /**
     * Local center of the first semicircle
     */
    public b2Vec2 getCenter1() {
        return new b2Vec2(getBufPtr().duplicate(0, 8), true);
    }

    /**
     * Local center of the first semicircle
     */
    public void getCenter1(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    /**
     * Local center of the first semicircle
     */
    public void setCenter1(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * Local center of the second semicircle
     */
    public b2Vec2 center2() {
        return new b2Vec2(getPointer() + (8), false);
    }

    /**
     * Local center of the second semicircle
     */
    public void center2(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (8), 8, this);
    }

    /**
     * Local center of the second semicircle
     */
    public b2Vec2 getCenter2() {
        return new b2Vec2(getBufPtr().duplicate(8, 8), true);
    }

    /**
     * Local center of the second semicircle
     */
    public void getCenter2(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 8, 8);
    }

    /**
     * Local center of the second semicircle
     */
    public void setCenter2(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(8, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * The radius of the semicircles
     */
    public float radius() {
        return getBufPtr().getFloat(16);
    }

    /**
     * The radius of the semicircles
     */
    public void radius(float radius) {
        getBufPtr().setFloat(16, radius);
    }

    public static final class b2CapsulePointer extends StackElementPointer<b2Capsule> {

        public b2CapsulePointer(VoidPointer pointer) {
            super(pointer);
        }

        public b2CapsulePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2CapsulePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2CapsulePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2CapsulePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2CapsulePointer() {
            this(1, true);
        }

        public b2CapsulePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2Capsule createStackElement(long ptr, boolean freeOnGC) {
            return new b2Capsule(ptr, freeOnGC);
        }
    }
}
