package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;

/**
 * Shape id references a shape instance. This should be treated as an opaque handle.
 */
public final class b2ShapeId extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(61).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ShapeId(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2ShapeId() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2ShapeId.b2ShapeIdPointer asPointer() {
        return new b2ShapeId.b2ShapeIdPointer(getPointer(), getsGCFreed());
    }

    public int index1() {
        return (int) getValue(0);
    }

    public void index1(int index1) {
        setValue(index1, 0);
    }

    public char world0() {
        return (char) getValue(1);
    }

    public void world0(char world0) {
        setValue(world0, 1);
    }

    public char generation() {
        return (char) getValue(2);
    }

    public void generation(char generation) {
        setValue(generation, 2);
    }

    public static final class b2ShapeIdPointer extends StackElementPointer<b2ShapeId> {

        public b2ShapeIdPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ShapeIdPointer() {
            this(1, true, true);
        }

        public b2ShapeIdPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2ShapeId.b2ShapeIdPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2ShapeId createStackElement(long ptr, boolean freeOnGC) {
            return new b2ShapeId(ptr, freeOnGC);
        }
    }
}
