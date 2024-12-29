package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2AABB;

public final class b2TreeNode extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(72).getFfiType();
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

    public b2AABB aabb() {
        return __aabb;
    }

    private static final int __aabb_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2AABB __aabb = new b2AABB(getPointer() + __aabb_offset, false);

    public long categoryBits() {
        return (long) getValue(1);
    }

    public void categoryBits(long categoryBits) {
        setValue(categoryBits, 1);
    }

    public int parent() {
        return (int) getValue(2);
    }

    public void parent(int parent) {
        setValue(parent, 2);
    }

    public int next() {
        return (int) getValue(3);
    }

    public void next(int next) {
        setValue(next, 3);
    }

    public int child1() {
        return (int) getValue(4);
    }

    public void child1(int child1) {
        setValue(child1, 4);
    }

    public int child2() {
        return (int) getValue(5);
    }

    public void child2(int child2) {
        setValue(child2, 5);
    }

    public int userData() {
        return (int) getValue(6);
    }

    public void userData(int userData) {
        setValue(userData, 6);
    }

    public char height() {
        return (char) getValue(7);
    }

    public void height(char height) {
        setValue(height, 7);
    }

    public char flags() {
        return (char) getValue(8);
    }

    public void flags(char flags) {
        setValue(flags, 8);
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
