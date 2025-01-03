package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2AABB;

/**
 * A node in the dynamic tree. This is private data placed here for performance reasons.
 */
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

    /**
     * The node bounding box
     */
    public b2AABB aabb() {
        return __aabb;
    }

    private static final int __aabb_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2AABB __aabb = new b2AABB(getPointer() + __aabb_offset, false);

    /**
     * Category bits for collision filtering
     */
    public long categoryBits() {
        return (long) getValue(1);
    }

    /**
     * Category bits for collision filtering
     */
    public void categoryBits(long categoryBits) {
        setValue(categoryBits, 1);
    }

    /**
     * The node parent index (allocated node)
     */
    public int parent() {
        return (int) getValue(2);
    }

    /**
     * The node parent index (allocated node)
     */
    public void parent(int parent) {
        setValue(parent, 2);
    }

    /**
     * The node freelist next index (free node)
     */
    public int next() {
        return (int) getValue(3);
    }

    /**
     * The node freelist next index (free node)
     */
    public void next(int next) {
        setValue(next, 3);
    }

    /**
     * Child 1 index (internal node)
     */
    public int child1() {
        return (int) getValue(4);
    }

    /**
     * Child 1 index (internal node)
     */
    public void child1(int child1) {
        setValue(child1, 4);
    }

    /**
     * Child 2 index (internal node)
     */
    public int child2() {
        return (int) getValue(5);
    }

    /**
     * Child 2 index (internal node)
     */
    public void child2(int child2) {
        setValue(child2, 5);
    }

    /**
     * User data (leaf node)
     */
    public int userData() {
        return (int) getValue(6);
    }

    /**
     * User data (leaf node)
     */
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
