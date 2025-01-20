package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
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
        return new b2Vec2.b2Vec2Pointer(getPointer(), getsGCFreed());
    }

    /**
     * coordinates
     */
    public float x() {
        return (float) getValueFloat(0);
    }

    /**
     * coordinates
     */
    public void x(float x) {
        setValue(x, 0);
    }

    /**
     * coordinates
     */
    public float y() {
        return (float) getValueFloat(1);
    }

    /**
     * coordinates
     */
    public void y(float y) {
        setValue(y, 1);
    }

    public static final class b2Vec2Pointer extends StackElementPointer<b2Vec2> {

        public b2Vec2Pointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2Vec2Pointer() {
            this(1, true, true);
        }

        public b2Vec2Pointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2Vec2.b2Vec2Pointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2Vec2 createStackElement(long ptr, boolean freeOnGC) {
            return new b2Vec2(ptr, freeOnGC);
        }
    }
}
