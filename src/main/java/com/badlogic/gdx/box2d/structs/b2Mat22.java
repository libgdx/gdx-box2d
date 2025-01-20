package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * A 2-by-2 Matrix
 */
public final class b2Mat22 extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(41).getFfiType();
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
        return new b2Mat22.b2Mat22Pointer(getPointer(), getsGCFreed());
    }

    /**
     * columns
     */
    public b2Vec2 cx() {
        return __cx;
    }

    private static final int __cx_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __cx = new b2Vec2(getPointer() + __cx_offset, false);

    /**
     * columns
     */
    public b2Vec2 cy() {
        return __cy;
    }

    private static final int __cy_offset = CHandler.getOffsetForField(__ffi_type, 1);

    private final b2Vec2 __cy = new b2Vec2(getPointer() + __cy_offset, false);

    public static final class b2Mat22Pointer extends StackElementPointer<b2Mat22> {

        public b2Mat22Pointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2Mat22Pointer() {
            this(1, true, true);
        }

        public b2Mat22Pointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2Mat22.b2Mat22Pointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2Mat22 createStackElement(long ptr, boolean freeOnGC) {
            return new b2Mat22(ptr, freeOnGC);
        }
    }
}
