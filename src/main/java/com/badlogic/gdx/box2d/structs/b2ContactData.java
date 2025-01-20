package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2ShapeId;
import com.badlogic.gdx.box2d.structs.b2Manifold;

/**
 * The contact data for two shapes. By convention the manifold normal points
 * from shape A to shape B.
 * @see b2Shape_GetContactData() and b2Body_GetContactData()
 */
public final class b2ContactData extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(23).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ContactData(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2ContactData() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2ContactData.b2ContactDataPointer asPointer() {
        return new b2ContactData.b2ContactDataPointer(getPointer(), getsGCFreed());
    }

    public b2ShapeId shapeIdA() {
        return __shapeIdA;
    }

    private static final int __shapeIdA_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2ShapeId __shapeIdA = new b2ShapeId(getPointer() + __shapeIdA_offset, false);

    public b2ShapeId shapeIdB() {
        return __shapeIdB;
    }

    private static final int __shapeIdB_offset = CHandler.getOffsetForField(__ffi_type, 1);

    private final b2ShapeId __shapeIdB = new b2ShapeId(getPointer() + __shapeIdB_offset, false);

    public b2Manifold manifold() {
        return __manifold;
    }

    private static final int __manifold_offset = CHandler.getOffsetForField(__ffi_type, 2);

    private final b2Manifold __manifold = new b2Manifold(getPointer() + __manifold_offset, false);

    public static final class b2ContactDataPointer extends StackElementPointer<b2ContactData> {

        public b2ContactDataPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ContactDataPointer() {
            this(1, true, true);
        }

        public b2ContactDataPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2ContactData.b2ContactDataPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2ContactData createStackElement(long ptr, boolean freeOnGC) {
            return new b2ContactData(ptr, freeOnGC);
        }
    }
}
