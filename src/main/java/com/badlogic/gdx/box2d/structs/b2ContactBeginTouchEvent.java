package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2ShapeId;
import com.badlogic.gdx.box2d.structs.b2Manifold;

/**
 * A begin touch event is generated when two shapes begin touching.
 */
public final class b2ContactBeginTouchEvent extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(23).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ContactBeginTouchEvent(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2ContactBeginTouchEvent(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
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
        return new b2ContactBeginTouchEvent.b2ContactBeginTouchEventPointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2ContactBeginTouchEvent.b2ContactBeginTouchEventPointer ptr) {
        ptr.setPointer(this);
    }

    /**
     * Id of the first shape
     */
    public b2ShapeId shapeIdA() {
        return new b2ShapeId(getPointer(), false);
    }

    /**
     * Id of the first shape
     */
    public void shapeIdA(b2ShapeId toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    /**
     * Id of the first shape
     */
    public b2ShapeId getShapeIdA() {
        return new b2ShapeId(getBufPtr().duplicate(0, 8), true);
    }

    /**
     * Id of the first shape
     */
    public void getShapeIdA(b2ShapeId toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    /**
     * Id of the first shape
     */
    public void setShapeIdA(b2ShapeId toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * Id of the second shape
     */
    public b2ShapeId shapeIdB() {
        return new b2ShapeId(getPointer() + (8), false);
    }

    /**
     * Id of the second shape
     */
    public void shapeIdB(b2ShapeId toSetPtr) {
        toSetPtr.setPointer(getPointer() + (8), 8, this);
    }

    /**
     * Id of the second shape
     */
    public b2ShapeId getShapeIdB() {
        return new b2ShapeId(getBufPtr().duplicate(8, 8), true);
    }

    /**
     * Id of the second shape
     */
    public void getShapeIdB(b2ShapeId toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 8, 8);
    }

    /**
     * Id of the second shape
     */
    public void setShapeIdB(b2ShapeId toCopyFrom) {
        getBufPtr().copyFrom(8, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     *  The initial contact manifold. This is recorded before the solver is called,
     * 	 so all the impulses will be zero.
     */
    public b2Manifold manifold() {
        return new b2Manifold(getPointer() + (16), false);
    }

    /**
     *  The initial contact manifold. This is recorded before the solver is called,
     * 	 so all the impulses will be zero.
     */
    public void manifold(b2Manifold toSetPtr) {
        toSetPtr.setPointer(getPointer() + (16), 112, this);
    }

    /**
     *  The initial contact manifold. This is recorded before the solver is called,
     * 	 so all the impulses will be zero.
     */
    public b2Manifold getManifold() {
        return new b2Manifold(getBufPtr().duplicate(16, 112), true);
    }

    /**
     *  The initial contact manifold. This is recorded before the solver is called,
     * 	 so all the impulses will be zero.
     */
    public void getManifold(b2Manifold toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 16, 112);
    }

    /**
     *  The initial contact manifold. This is recorded before the solver is called,
     * 	 so all the impulses will be zero.
     */
    public void setManifold(b2Manifold toCopyFrom) {
        getBufPtr().copyFrom(16, toCopyFrom.getBufPtr(), 0, 112);
    }

    public static final class b2ContactBeginTouchEventPointer extends StackElementPointer<b2ContactBeginTouchEvent> {

        public b2ContactBeginTouchEventPointer(VoidPointer pointer) {
            super(pointer);
        }

        public b2ContactBeginTouchEventPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ContactBeginTouchEventPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2ContactBeginTouchEventPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2ContactBeginTouchEventPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2ContactBeginTouchEventPointer() {
            this(1, true);
        }

        public b2ContactBeginTouchEventPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2ContactBeginTouchEvent createStackElement(long ptr, boolean freeOnGC) {
            return new b2ContactBeginTouchEvent(ptr, freeOnGC);
        }
    }
}
