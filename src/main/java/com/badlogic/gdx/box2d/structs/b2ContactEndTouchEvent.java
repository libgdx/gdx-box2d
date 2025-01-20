package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2ShapeId;

/**
 *  An end touch event is generated when two shapes stop touching.
 * 	You will get an end event if you do anything that destroys contacts previous to the last
 * 	world step. These include things like setting the transform, destroying a body
 * 	or shape, or changing a filter or body type.
 */
public final class b2ContactEndTouchEvent extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(24).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ContactEndTouchEvent(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2ContactEndTouchEvent() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2ContactEndTouchEvent.b2ContactEndTouchEventPointer asPointer() {
        return new b2ContactEndTouchEvent.b2ContactEndTouchEventPointer(getPointer(), getsGCFreed());
    }

    /**
     *  Id of the first shape
     * 		@warning this shape may have been destroyed
     * 		@see b2Shape_IsValid
     */
    public b2ShapeId shapeIdA() {
        return __shapeIdA;
    }

    private static final int __shapeIdA_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2ShapeId __shapeIdA = new b2ShapeId(getPointer() + __shapeIdA_offset, false);

    /**
     *  Id of the second shape
     * 		@warning this shape may have been destroyed
     * 		@see b2Shape_IsValid
     */
    public b2ShapeId shapeIdB() {
        return __shapeIdB;
    }

    private static final int __shapeIdB_offset = CHandler.getOffsetForField(__ffi_type, 1);

    private final b2ShapeId __shapeIdB = new b2ShapeId(getPointer() + __shapeIdB_offset, false);

    public static final class b2ContactEndTouchEventPointer extends StackElementPointer<b2ContactEndTouchEvent> {

        public b2ContactEndTouchEventPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ContactEndTouchEventPointer() {
            this(1, true, true);
        }

        public b2ContactEndTouchEventPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2ContactEndTouchEvent.b2ContactEndTouchEventPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2ContactEndTouchEvent createStackElement(long ptr, boolean freeOnGC) {
            return new b2ContactEndTouchEvent(ptr, freeOnGC);
        }
    }
}
