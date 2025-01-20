package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2TreeNode;
import com.badlogic.gdx.jnigen.runtime.pointer.CSizedIntPointer;
import com.badlogic.gdx.box2d.structs.b2AABB;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * The dynamic tree structure. This should be considered private data.
 * It is placed here for performance reasons.
 */
public final class b2DynamicTree extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(33).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2DynamicTree(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2DynamicTree() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2DynamicTree.b2DynamicTreePointer asPointer() {
        return new b2DynamicTree.b2DynamicTreePointer(getPointer(), getsGCFreed());
    }

    /**
     * The tree nodes
     */
    public b2TreeNode.b2TreeNodePointer nodes() {
        return new b2TreeNode.b2TreeNodePointer(getValue(0), false);
    }

    /**
     * The tree nodes
     */
    public void nodes(b2TreeNode.b2TreeNodePointer nodes) {
        setValue(nodes.getPointer(), 0);
    }

    /**
     * The root index
     */
    public int root() {
        return (int) getValue(1);
    }

    /**
     * The root index
     */
    public void root(int root) {
        setValue(root, 1);
    }

    /**
     * The number of nodes
     */
    public int nodeCount() {
        return (int) getValue(2);
    }

    /**
     * The number of nodes
     */
    public void nodeCount(int nodeCount) {
        setValue(nodeCount, 2);
    }

    /**
     * The allocated node space
     */
    public int nodeCapacity() {
        return (int) getValue(3);
    }

    /**
     * The allocated node space
     */
    public void nodeCapacity(int nodeCapacity) {
        setValue(nodeCapacity, 3);
    }

    /**
     * Node free list
     */
    public int freeList() {
        return (int) getValue(4);
    }

    /**
     * Node free list
     */
    public void freeList(int freeList) {
        setValue(freeList, 4);
    }

    /**
     * Number of proxies created
     */
    public int proxyCount() {
        return (int) getValue(5);
    }

    /**
     * Number of proxies created
     */
    public void proxyCount(int proxyCount) {
        setValue(proxyCount, 5);
    }

    /**
     * Leaf indices for rebuild
     */
    public CSizedIntPointer leafIndices() {
        return new CSizedIntPointer(getValue(6), false, "int");
    }

    /**
     * Leaf indices for rebuild
     */
    public void leafIndices(CSizedIntPointer leafIndices) {
        setValue(leafIndices.getPointer(), 6);
    }

    /**
     * Leaf bounding boxes for rebuild
     */
    public b2AABB.b2AABBPointer leafBoxes() {
        return new b2AABB.b2AABBPointer(getValue(7), false);
    }

    /**
     * Leaf bounding boxes for rebuild
     */
    public void leafBoxes(b2AABB.b2AABBPointer leafBoxes) {
        setValue(leafBoxes.getPointer(), 7);
    }

    /**
     * Leaf bounding box centers for rebuild
     */
    public b2Vec2.b2Vec2Pointer leafCenters() {
        return new b2Vec2.b2Vec2Pointer(getValue(8), false);
    }

    /**
     * Leaf bounding box centers for rebuild
     */
    public void leafCenters(b2Vec2.b2Vec2Pointer leafCenters) {
        setValue(leafCenters.getPointer(), 8);
    }

    /**
     * Bins for sorting during rebuild
     */
    public CSizedIntPointer binIndices() {
        return new CSizedIntPointer(getValue(9), false, "int");
    }

    /**
     * Bins for sorting during rebuild
     */
    public void binIndices(CSizedIntPointer binIndices) {
        setValue(binIndices.getPointer(), 9);
    }

    /**
     * Allocated space for rebuilding
     */
    public int rebuildCapacity() {
        return (int) getValue(10);
    }

    /**
     * Allocated space for rebuilding
     */
    public void rebuildCapacity(int rebuildCapacity) {
        setValue(rebuildCapacity, 10);
    }

    public static final class b2DynamicTreePointer extends StackElementPointer<b2DynamicTree> {

        public b2DynamicTreePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2DynamicTreePointer() {
            this(1, true, true);
        }

        public b2DynamicTreePointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2DynamicTree.b2DynamicTreePointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2DynamicTree createStackElement(long ptr, boolean freeOnGC) {
            return new b2DynamicTree(ptr, freeOnGC);
        }
    }
}
