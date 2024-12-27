package com.badlogic.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.box2d.FFITypes;
import com.badlogic.gdx.jnigen.runtime.pointer.CSizedIntPointer;

public final class b2Counters extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(28).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2Counters(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2Counters() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2Counters.b2CountersPointer asPointer() {
        return new b2Counters.b2CountersPointer(getPointer(), getsGCFreed());
    }

    public int staticBodyCount() {
        return (int) getValue(0);
    }

    public void staticBodyCount(int staticBodyCount) {
        setValue(staticBodyCount, 0);
    }

    public int bodyCount() {
        return (int) getValue(1);
    }

    public void bodyCount(int bodyCount) {
        setValue(bodyCount, 1);
    }

    public int shapeCount() {
        return (int) getValue(2);
    }

    public void shapeCount(int shapeCount) {
        setValue(shapeCount, 2);
    }

    public int contactCount() {
        return (int) getValue(3);
    }

    public void contactCount(int contactCount) {
        setValue(contactCount, 3);
    }

    public int jointCount() {
        return (int) getValue(4);
    }

    public void jointCount(int jointCount) {
        setValue(jointCount, 4);
    }

    public int islandCount() {
        return (int) getValue(5);
    }

    public void islandCount(int islandCount) {
        setValue(islandCount, 5);
    }

    public int stackUsed() {
        return (int) getValue(6);
    }

    public void stackUsed(int stackUsed) {
        setValue(stackUsed, 6);
    }

    public int staticTreeHeight() {
        return (int) getValue(7);
    }

    public void staticTreeHeight(int staticTreeHeight) {
        setValue(staticTreeHeight, 7);
    }

    public int treeHeight() {
        return (int) getValue(8);
    }

    public void treeHeight(int treeHeight) {
        setValue(treeHeight, 8);
    }

    public int byteCount() {
        return (int) getValue(9);
    }

    public void byteCount(int byteCount) {
        setValue(byteCount, 9);
    }

    public int taskCount() {
        return (int) getValue(10);
    }

    public void taskCount(int taskCount) {
        setValue(taskCount, 10);
    }

    public CSizedIntPointer colorCounts() {
        return __colorCounts;
    }

    private static final int __colorCounts_offset = CHandler.getOffsetForField(__ffi_type, 11);

    private final CSizedIntPointer __colorCounts = new CSizedIntPointer(getPointer() + __colorCounts_offset, false, "int32_t").guardCount(12);

    public static final class b2CountersPointer extends StackElementPointer<b2Counters> {

        public b2CountersPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2CountersPointer() {
            this(1, true, true);
        }

        public b2CountersPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2Counters.b2CountersPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2Counters createStackElement(long ptr, boolean freeOnGC) {
            return new b2Counters(ptr, freeOnGC);
        }
    }
}
