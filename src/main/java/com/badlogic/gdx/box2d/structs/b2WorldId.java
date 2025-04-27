package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.FFITypes;

/**
 * World id references a world instance. This should be treated as an opaque handle.
 */
public final class b2WorldId extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(82).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2WorldId(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2WorldId(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2WorldId() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2WorldId.b2WorldIdPointer asPointer() {
        return new b2WorldId.b2WorldIdPointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2WorldId.b2WorldIdPointer ptr) {
        ptr.setPointer(this);
    }

    public char index1() {
        return getBufPtr().getChar(0);
    }

    public void index1(char index1) {
        getBufPtr().setChar(0, index1);
    }

    public char generation() {
        return getBufPtr().getChar(2);
    }

    public void generation(char generation) {
        getBufPtr().setChar(2, generation);
    }

    public static final class b2WorldIdPointer extends StackElementPointer<b2WorldId> {

        public b2WorldIdPointer(VoidPointer pointer) {
            super(pointer);
        }

        public b2WorldIdPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2WorldIdPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2WorldIdPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2WorldIdPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2WorldIdPointer() {
            this(1, true);
        }

        public b2WorldIdPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2WorldId createStackElement(long ptr, boolean freeOnGC) {
            return new b2WorldId(ptr, freeOnGC);
        }
    }
}
