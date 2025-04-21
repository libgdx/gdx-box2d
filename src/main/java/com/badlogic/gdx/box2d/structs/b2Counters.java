package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.SIntPointer;

/**
 * Counters that give details of the simulation size.
 */
public final class b2Counters extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(29).getFfiType();
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
        return new b2Counters.b2CountersPointer(getPointer(), false, this);
    }

    public int bodyCount() {
        return getBufPtr().getInt(0);
    }

    public void bodyCount(int bodyCount) {
        getBufPtr().setInt(0, bodyCount);
    }

    public int shapeCount() {
        return getBufPtr().getInt(4);
    }

    public void shapeCount(int shapeCount) {
        getBufPtr().setInt(4, shapeCount);
    }

    public int contactCount() {
        return getBufPtr().getInt(8);
    }

    public void contactCount(int contactCount) {
        getBufPtr().setInt(8, contactCount);
    }

    public int jointCount() {
        return getBufPtr().getInt(12);
    }

    public void jointCount(int jointCount) {
        getBufPtr().setInt(12, jointCount);
    }

    public int islandCount() {
        return getBufPtr().getInt(16);
    }

    public void islandCount(int islandCount) {
        getBufPtr().setInt(16, islandCount);
    }

    public int stackUsed() {
        return getBufPtr().getInt(20);
    }

    public void stackUsed(int stackUsed) {
        getBufPtr().setInt(20, stackUsed);
    }

    public int staticTreeHeight() {
        return getBufPtr().getInt(24);
    }

    public void staticTreeHeight(int staticTreeHeight) {
        getBufPtr().setInt(24, staticTreeHeight);
    }

    public int treeHeight() {
        return getBufPtr().getInt(28);
    }

    public void treeHeight(int treeHeight) {
        getBufPtr().setInt(28, treeHeight);
    }

    public int byteCount() {
        return getBufPtr().getInt(32);
    }

    public void byteCount(int byteCount) {
        getBufPtr().setInt(32, byteCount);
    }

    public int taskCount() {
        return getBufPtr().getInt(36);
    }

    public void taskCount(int taskCount) {
        getBufPtr().setInt(36, taskCount);
    }

    public SIntPointer colorCounts() {
        return __colorCounts;
    }

    private static final int __colorCounts_offset = 40;

    private final SIntPointer __colorCounts = new SIntPointer(getPointer() + __colorCounts_offset, false, 12);

    public static final class b2CountersPointer extends StackElementPointer<b2Counters> {

        public b2CountersPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2CountersPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2CountersPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2CountersPointer() {
            this(1, true);
        }

        public b2CountersPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2Counters createStackElement(long ptr, boolean freeOnGC) {
            return new b2Counters(ptr, freeOnGC);
        }
    }
}
