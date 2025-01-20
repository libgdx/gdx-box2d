package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;

public final class b2TreeNode extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(70).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2TreeNode(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2TreeNode() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2TreeNode.b2TreeNodePointer asPointer() {
        return new b2TreeNode.b2TreeNodePointer(getPointer(), getsGCFreed());
    }

    public static final class b2TreeNodePointer extends StackElementPointer<b2TreeNode> {

        public b2TreeNodePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2TreeNodePointer() {
            this(1, true, true);
        }

        public b2TreeNodePointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2TreeNode.b2TreeNodePointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2TreeNode createStackElement(long ptr, boolean freeOnGC) {
            return new b2TreeNode(ptr, freeOnGC);
        }
    }
}
