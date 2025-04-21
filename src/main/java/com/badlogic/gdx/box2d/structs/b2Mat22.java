package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * A 2-by-2 Matrix
 */
public final class b2Mat22 extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(43).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2Mat22(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2Mat22() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2Mat22.b2Mat22Pointer asPointer() {
        return new b2Mat22.b2Mat22Pointer(getPointer(), false, this);
    }

    /**
     * columns
     */
    public b2Vec2 cx() {
        return __cx;
    }

    private static final int __cx_offset = 0;

    private final b2Vec2 __cx = new b2Vec2(getPointer() + __cx_offset, false);

    /**
     * columns
     */
    public b2Vec2 cy() {
        return __cy;
    }

    private static final int __cy_offset = 8;

    private final b2Vec2 __cy = new b2Vec2(getPointer() + __cy_offset, false);

    public static final class b2Mat22Pointer extends StackElementPointer<b2Mat22> {

        public b2Mat22Pointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2Mat22Pointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2Mat22Pointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2Mat22Pointer() {
            this(1, true);
        }

        public b2Mat22Pointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2Mat22 createStackElement(long ptr, boolean freeOnGC) {
            return new b2Mat22(ptr, freeOnGC);
        }
    }
}
