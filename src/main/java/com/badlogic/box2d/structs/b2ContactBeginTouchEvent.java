package com.badlogic.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.box2d.FFITypes;
import com.badlogic.box2d.structs.b2ShapeId;
import com.badlogic.box2d.structs.b2Manifold;

public final class b2ContactBeginTouchEvent extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(23).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ContactBeginTouchEvent(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2ContactBeginTouchEvent() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2ContactBeginTouchEvent.b2ContactBeginTouchEventPointer asPointer() {
        return new b2ContactBeginTouchEvent.b2ContactBeginTouchEventPointer(getPointer(), getsGCFreed());
    }

    public b2ShapeId shapeIdA() {
        return __shapeIdA;
    }

    private static final int __shapeIdA_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2ShapeId __shapeIdA = new b2ShapeId(getPointer() + __shapeIdA_offset, false);

    public b2ShapeId shapeIdB() {
        return __shapeIdB;
    }

    private static final int __shapeIdB_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2ShapeId __shapeIdB = new b2ShapeId(getPointer() + __shapeIdB_offset, false);

    public b2Manifold manifold() {
        return __manifold;
    }

    private static final int __manifold_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Manifold __manifold = new b2Manifold(getPointer() + __manifold_offset, false);

    public static final class b2ContactBeginTouchEventPointer extends StackElementPointer<b2ContactBeginTouchEvent> {

        public b2ContactBeginTouchEventPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ContactBeginTouchEventPointer() {
            this(1, true, true);
        }

        public b2ContactBeginTouchEventPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2ContactBeginTouchEvent.b2ContactBeginTouchEventPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2ContactBeginTouchEvent createStackElement(long ptr, boolean freeOnGC) {
            return new b2ContactBeginTouchEvent(ptr, freeOnGC);
        }
    }
}
