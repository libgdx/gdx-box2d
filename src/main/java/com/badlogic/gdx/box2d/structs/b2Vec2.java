package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;

/**
 * 2D vector
 * This can be used to represent a point or free vector
 */
public final class b2Vec2 extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(72).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2Vec2(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2Vec2() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2Vec2.b2Vec2Pointer asPointer() {
        return new b2Vec2.b2Vec2Pointer(getPointer(), false, this);
    }

    /**
     * coordinates
     */
    public float x() {
        return getBufPtr().getFloat(0);
    }

    /**
     * coordinates
     */
    public void x(float x) {
        getBufPtr().setFloat(0, x);
    }

    /**
     * coordinates
     */
    public float y() {
        return getBufPtr().getFloat(4);
    }

    /**
     * coordinates
     */
    public void y(float y) {
        getBufPtr().setFloat(4, y);
    }

    public static final class b2Vec2Pointer extends StackElementPointer<b2Vec2> {

        public b2Vec2Pointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2Vec2Pointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2Vec2Pointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2Vec2Pointer() {
            this(1, true);
        }

        public b2Vec2Pointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2Vec2 createStackElement(long ptr, boolean freeOnGC) {
            return new b2Vec2(ptr, freeOnGC);
        }
    }
}
