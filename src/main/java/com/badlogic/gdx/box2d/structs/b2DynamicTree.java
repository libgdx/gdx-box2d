package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2TreeNode;
import com.badlogic.gdx.jnigen.runtime.pointer.CSizedIntPointer;
import com.badlogic.gdx.box2d.structs.b2AABB;
import com.badlogic.gdx.box2d.structs.b2Vec2;

public final class b2DynamicTree extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(34).getFfiType();
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

    public b2TreeNode.b2TreeNodePointer nodes() {
        return new b2TreeNode.b2TreeNodePointer(getValue(0), false);
    }

    public void nodes(b2TreeNode.b2TreeNodePointer nodes) {
        setValue(nodes.getPointer(), 0);
    }

    public int root() {
        return (int) getValue(1);
    }

    public void root(int root) {
        setValue(root, 1);
    }

    public int nodeCount() {
        return (int) getValue(2);
    }

    public void nodeCount(int nodeCount) {
        setValue(nodeCount, 2);
    }

    public int nodeCapacity() {
        return (int) getValue(3);
    }

    public void nodeCapacity(int nodeCapacity) {
        setValue(nodeCapacity, 3);
    }

    public int freeList() {
        return (int) getValue(4);
    }

    public void freeList(int freeList) {
        setValue(freeList, 4);
    }

    public int proxyCount() {
        return (int) getValue(5);
    }

    public void proxyCount(int proxyCount) {
        setValue(proxyCount, 5);
    }

    public CSizedIntPointer leafIndices() {
        return new CSizedIntPointer(getValue(6), false, "int32_t");
    }

    public void leafIndices(CSizedIntPointer leafIndices) {
        setValue(leafIndices.getPointer(), 6);
    }

    public b2AABB.b2AABBPointer leafBoxes() {
        return new b2AABB.b2AABBPointer(getValue(7), false);
    }

    public void leafBoxes(b2AABB.b2AABBPointer leafBoxes) {
        setValue(leafBoxes.getPointer(), 7);
    }

    public b2Vec2.b2Vec2Pointer leafCenters() {
        return new b2Vec2.b2Vec2Pointer(getValue(8), false);
    }

    public void leafCenters(b2Vec2.b2Vec2Pointer leafCenters) {
        setValue(leafCenters.getPointer(), 8);
    }

    public CSizedIntPointer binIndices() {
        return new CSizedIntPointer(getValue(9), false, "int32_t");
    }

    public void binIndices(CSizedIntPointer binIndices) {
        setValue(binIndices.getPointer(), 9);
    }

    public int rebuildCapacity() {
        return (int) getValue(10);
    }

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
