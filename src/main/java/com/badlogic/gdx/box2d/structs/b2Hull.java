package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * A convex hull. Used to create convex polygons.
 * @warning Do not modify these values directly, instead use b2ComputeHull()
 */
public final class b2Hull extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(36).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2Hull(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2Hull() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2Hull.b2HullPointer asPointer() {
        return new b2Hull.b2HullPointer(getPointer(), false, this);
    }

    /**
     * The final points of the hull
     */
    public b2Vec2.b2Vec2Pointer points() {
        return __points;
    }

    private static final int __points_offset = 0;

    private final b2Vec2.b2Vec2Pointer __points = new b2Vec2.b2Vec2Pointer(getPointer() + __points_offset, false, 8);

    /**
     * The number of points
     */
    public int count() {
        return getBufPtr().getInt(64);
    }

    /**
     * The number of points
     */
    public void count(int count) {
        getBufPtr().setInt(64, count);
    }

    public static final class b2HullPointer extends StackElementPointer<b2Hull> {

        public b2HullPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2HullPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2HullPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2HullPointer() {
            this(1, true);
        }

        public b2HullPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2Hull createStackElement(long ptr, boolean freeOnGC) {
            return new b2Hull(ptr, freeOnGC);
        }
    }
}
