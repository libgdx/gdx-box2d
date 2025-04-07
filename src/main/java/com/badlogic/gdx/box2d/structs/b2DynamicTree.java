package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2TreeNode;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.SIntPointer;
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
        return new b2DynamicTree.b2DynamicTreePointer(getPointer(), false, this);
    }

    /**
     * The tree nodes
     */
    public b2TreeNode.b2TreeNodePointer nodes() {
        return new b2TreeNode.b2TreeNodePointer(getBufPtr().getNativePointer(0), false);
    }

    /**
     * The tree nodes
     */
    public void nodes(b2TreeNode.b2TreeNodePointer nodes) {
        getBufPtr().setNativePointer(0, nodes.getPointer());
    }

    /**
     * The root index
     */
    public int root() {
        return getBufPtr().getInt(CHandler.IS_32_BIT ? 4 : 8);
    }

    /**
     * The root index
     */
    public void root(int root) {
        getBufPtr().setInt(CHandler.IS_32_BIT ? 4 : 8, root);
    }

    /**
     * The number of nodes
     */
    public int nodeCount() {
        return getBufPtr().getInt(CHandler.IS_32_BIT ? 8 : 12);
    }

    /**
     * The number of nodes
     */
    public void nodeCount(int nodeCount) {
        getBufPtr().setInt(CHandler.IS_32_BIT ? 8 : 12, nodeCount);
    }

    /**
     * The allocated node space
     */
    public int nodeCapacity() {
        return getBufPtr().getInt(CHandler.IS_32_BIT ? 12 : 16);
    }

    /**
     * The allocated node space
     */
    public void nodeCapacity(int nodeCapacity) {
        getBufPtr().setInt(CHandler.IS_32_BIT ? 12 : 16, nodeCapacity);
    }

    /**
     * Node free list
     */
    public int freeList() {
        return getBufPtr().getInt(CHandler.IS_32_BIT ? 16 : 20);
    }

    /**
     * Node free list
     */
    public void freeList(int freeList) {
        getBufPtr().setInt(CHandler.IS_32_BIT ? 16 : 20, freeList);
    }

    /**
     * Number of proxies created
     */
    public int proxyCount() {
        return getBufPtr().getInt(CHandler.IS_32_BIT ? 20 : 24);
    }

    /**
     * Number of proxies created
     */
    public void proxyCount(int proxyCount) {
        getBufPtr().setInt(CHandler.IS_32_BIT ? 20 : 24, proxyCount);
    }

    /**
     * Leaf indices for rebuild
     */
    public SIntPointer leafIndices() {
        return new SIntPointer(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 24 : 32), false);
    }

    /**
     * Leaf indices for rebuild
     */
    public void leafIndices(SIntPointer leafIndices) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 24 : 32, leafIndices.getPointer());
    }

    /**
     * Leaf bounding boxes for rebuild
     */
    public b2AABB.b2AABBPointer leafBoxes() {
        return new b2AABB.b2AABBPointer(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 28 : 40), false);
    }

    /**
     * Leaf bounding boxes for rebuild
     */
    public void leafBoxes(b2AABB.b2AABBPointer leafBoxes) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 28 : 40, leafBoxes.getPointer());
    }

    /**
     * Leaf bounding box centers for rebuild
     */
    public b2Vec2.b2Vec2Pointer leafCenters() {
        return new b2Vec2.b2Vec2Pointer(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 32 : 48), false);
    }

    /**
     * Leaf bounding box centers for rebuild
     */
    public void leafCenters(b2Vec2.b2Vec2Pointer leafCenters) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 32 : 48, leafCenters.getPointer());
    }

    /**
     * Bins for sorting during rebuild
     */
    public SIntPointer binIndices() {
        return new SIntPointer(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 36 : 56), false);
    }

    /**
     * Bins for sorting during rebuild
     */
    public void binIndices(SIntPointer binIndices) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 36 : 56, binIndices.getPointer());
    }

    /**
     * Allocated space for rebuilding
     */
    public int rebuildCapacity() {
        return getBufPtr().getInt(CHandler.IS_32_BIT ? 40 : 64);
    }

    /**
     * Allocated space for rebuilding
     */
    public void rebuildCapacity(int rebuildCapacity) {
        getBufPtr().setInt(CHandler.IS_32_BIT ? 40 : 64, rebuildCapacity);
    }

    public static final class b2DynamicTreePointer extends StackElementPointer<b2DynamicTree> {

        public b2DynamicTreePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2DynamicTreePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2DynamicTreePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2DynamicTreePointer() {
            this(1, true);
        }

        public b2DynamicTreePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2DynamicTree createStackElement(long ptr, boolean freeOnGC) {
            return new b2DynamicTree(ptr, freeOnGC);
        }
    }
}
