package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * A solid circle
 */
public final class b2Circle extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(21).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2Circle(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2Circle(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2Circle() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2Circle.b2CirclePointer asPointer() {
        return new b2Circle.b2CirclePointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2Circle.b2CirclePointer ptr) {
        ptr.setPointer(this);
    }

    /**
     * The local center
     */
    public b2Vec2 center() {
        return new b2Vec2(getPointer(), false);
    }

    /**
     * The local center
     */
    public void center(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    /**
     * The local center
     */
    public b2Vec2 getCenter() {
        return new b2Vec2(getBufPtr().duplicate(0, 8), true);
    }

    /**
     * The local center
     */
    public void getCenter(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    /**
     * The local center
     */
    public void setCenter(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * The radius
     */
    public float radius() {
        return getBufPtr().getFloat(8);
    }

    /**
     * The radius
     */
    public void radius(float radius) {
        getBufPtr().setFloat(8, radius);
    }

    public static final class b2CirclePointer extends StackElementPointer<b2Circle> {

        public b2CirclePointer(VoidPointer pointer) {
            super(pointer);
        }

        public b2CirclePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2CirclePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2CirclePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2CirclePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2CirclePointer() {
            this(1, true);
        }

        public b2CirclePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2Circle createStackElement(long ptr, boolean freeOnGC) {
            return new b2Circle(ptr, freeOnGC);
        }
    }
}
