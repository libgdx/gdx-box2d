package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;

/**
 * Joint id references a joint instance. This should be treated as an opaque handle.
 */
public final class b2JointId extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(37).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2JointId(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2JointId() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2JointId.b2JointIdPointer asPointer() {
        return new b2JointId.b2JointIdPointer(getPointer(), getsGCFreed());
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

    public static final class b2JointIdPointer extends StackElementPointer<b2JointId> {

        public b2JointIdPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2JointIdPointer() {
            this(1, true, true);
        }

        public b2JointIdPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2JointId.b2JointIdPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2JointId createStackElement(long ptr, boolean freeOnGC) {
            return new b2JointId(ptr, freeOnGC);
        }
    }
}
