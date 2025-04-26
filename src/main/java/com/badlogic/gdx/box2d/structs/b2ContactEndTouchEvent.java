package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
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
        __ffi_type = FFITypes.getCTypeInfo(25).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ContactEndTouchEvent(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2ContactEndTouchEvent(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
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
        return new b2ContactEndTouchEvent.b2ContactEndTouchEventPointer(getPointer(), false, 1, this);
    }

    /**
     *  Id of the first shape
     * 		@warning this shape may have been destroyed
     * 		@see b2Shape_IsValid
     */
    public b2ShapeId shapeIdA() {
        return new b2ShapeId(getPointer(), false);
    }

    /**
     *  Id of the first shape
     * 		@warning this shape may have been destroyed
     * 		@see b2Shape_IsValid
     */
    public void shapeIdA(b2ShapeId toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    /**
     *  Id of the first shape
     * 		@warning this shape may have been destroyed
     * 		@see b2Shape_IsValid
     */
    public b2ShapeId getShapeIdA() {
        return new b2ShapeId(getBufPtr().duplicate(0, 8), true);
    }

    /**
     *  Id of the first shape
     * 		@warning this shape may have been destroyed
     * 		@see b2Shape_IsValid
     */
    public void getShapeIdA(b2ShapeId toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    /**
     *  Id of the first shape
     * 		@warning this shape may have been destroyed
     * 		@see b2Shape_IsValid
     */
    public void setShapeIdA(b2ShapeId toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     *  Id of the second shape
     * 		@warning this shape may have been destroyed
     * 		@see b2Shape_IsValid
     */
    public b2ShapeId shapeIdB() {
        return new b2ShapeId(getPointer() + (8), false);
    }

    /**
     *  Id of the second shape
     * 		@warning this shape may have been destroyed
     * 		@see b2Shape_IsValid
     */
    public void shapeIdB(b2ShapeId toSetPtr) {
        toSetPtr.setPointer(getPointer() + (8), 8, this);
    }

    /**
     *  Id of the second shape
     * 		@warning this shape may have been destroyed
     * 		@see b2Shape_IsValid
     */
    public b2ShapeId getShapeIdB() {
        return new b2ShapeId(getBufPtr().duplicate(8, 8), true);
    }

    /**
     *  Id of the second shape
     * 		@warning this shape may have been destroyed
     * 		@see b2Shape_IsValid
     */
    public void getShapeIdB(b2ShapeId toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 8, 8);
    }

    /**
     *  Id of the second shape
     * 		@warning this shape may have been destroyed
     * 		@see b2Shape_IsValid
     */
    public void setShapeIdB(b2ShapeId toCopyFrom) {
        getBufPtr().copyFrom(8, toCopyFrom.getBufPtr(), 0, 8);
    }

    public static final class b2ContactEndTouchEventPointer extends StackElementPointer<b2ContactEndTouchEvent> {

        public b2ContactEndTouchEventPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ContactEndTouchEventPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2ContactEndTouchEventPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2ContactEndTouchEventPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2ContactEndTouchEventPointer() {
            this(1, true);
        }

        public b2ContactEndTouchEventPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2ContactEndTouchEvent createStackElement(long ptr, boolean freeOnGC) {
            return new b2ContactEndTouchEvent(ptr, freeOnGC);
        }
    }
}
