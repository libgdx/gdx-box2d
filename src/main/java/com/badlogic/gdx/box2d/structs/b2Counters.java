package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.jnigen.runtime.pointer.CSizedIntPointer;

/**
 * Counters that give details of the simulation size.
 */
public final class b2Counters extends Struct {

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

    public int bodyCount() {
        return (int) getValue(0);
    }

    public void bodyCount(int bodyCount) {
        setValue(bodyCount, 0);
    }

    public int shapeCount() {
        return (int) getValue(1);
    }

    public void shapeCount(int shapeCount) {
        setValue(shapeCount, 1);
    }

    public int contactCount() {
        return (int) getValue(2);
    }

    public void contactCount(int contactCount) {
        setValue(contactCount, 2);
    }

    public int jointCount() {
        return (int) getValue(3);
    }

    public void jointCount(int jointCount) {
        setValue(jointCount, 3);
    }

    public int islandCount() {
        return (int) getValue(4);
    }

    public void islandCount(int islandCount) {
        setValue(islandCount, 4);
    }

    public int stackUsed() {
        return (int) getValue(5);
    }

    public void stackUsed(int stackUsed) {
        setValue(stackUsed, 5);
    }

    public int staticTreeHeight() {
        return (int) getValue(6);
    }

    public void staticTreeHeight(int staticTreeHeight) {
        setValue(staticTreeHeight, 6);
    }

    public int treeHeight() {
        return (int) getValue(7);
    }

    public void treeHeight(int treeHeight) {
        setValue(treeHeight, 7);
    }

    public int byteCount() {
        return (int) getValue(8);
    }

    public void byteCount(int byteCount) {
        setValue(byteCount, 8);
    }

    public int taskCount() {
        return (int) getValue(9);
    }

    public void taskCount(int taskCount) {
        setValue(taskCount, 9);
    }

    public CSizedIntPointer colorCounts() {
        return __colorCounts;
    }

    private static final int __colorCounts_offset = CHandler.getOffsetForField(__ffi_type, 10);

    private final CSizedIntPointer __colorCounts = new CSizedIntPointer(getPointer() + __colorCounts_offset, false, "int").guardCount(12);

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
