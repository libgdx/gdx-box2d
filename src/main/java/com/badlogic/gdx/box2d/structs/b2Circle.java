package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
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
        return new b2Circle.b2CirclePointer(getPointer(), false, this);
    }

    /**
     * The local center
     */
    public b2Vec2 center() {
        return __center;
    }

    private static final int __center_offset = 0;

    private final b2Vec2 __center = new b2Vec2(getPointer() + __center_offset, false);

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
