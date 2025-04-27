package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.FFITypes;

/**
 * Joint id references a joint instance. This should be treated as an opaque handle.
 */
public final class b2JointId extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(39).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2JointId(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2JointId(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
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
        return new b2JointId.b2JointIdPointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2JointId.b2JointIdPointer ptr) {
        ptr.setPointer(this);
    }

    public int index1() {
        return getBufPtr().getInt(0);
    }

    public void index1(int index1) {
        getBufPtr().setInt(0, index1);
    }

    public char world0() {
        return getBufPtr().getChar(4);
    }

    public void world0(char world0) {
        getBufPtr().setChar(4, world0);
    }

    public char generation() {
        return getBufPtr().getChar(6);
    }

    public void generation(char generation) {
        getBufPtr().setChar(6, generation);
    }

    public static final class b2JointIdPointer extends StackElementPointer<b2JointId> {

        public b2JointIdPointer(VoidPointer pointer) {
            super(pointer);
        }

        public b2JointIdPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2JointIdPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2JointIdPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2JointIdPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2JointIdPointer() {
            this(1, true);
        }

        public b2JointIdPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2JointId createStackElement(long ptr, boolean freeOnGC) {
            return new b2JointId(ptr, freeOnGC);
        }
    }
}
