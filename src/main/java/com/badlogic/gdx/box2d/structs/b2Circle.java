package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
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
        return new b2Circle.b2CirclePointer(getPointer(), getsGCFreed());
    }

    /**
     * The local center
     */
    public b2Vec2 center() {
        return __center;
    }

    private static final int __center_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __center = new b2Vec2(getPointer() + __center_offset, false);

    /**
     * The radius
     */
    public float radius() {
        return (float) getValueFloat(1);
    }

    /**
     * The radius
     */
    public void radius(float radius) {
        setValue(radius, 1);
    }

    public static final class b2CirclePointer extends StackElementPointer<b2Circle> {

        public b2CirclePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2CirclePointer() {
            this(1, true, true);
        }

        public b2CirclePointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2Circle.b2CirclePointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2Circle createStackElement(long ptr, boolean freeOnGC) {
            return new b2Circle(ptr, freeOnGC);
        }
    }
}
