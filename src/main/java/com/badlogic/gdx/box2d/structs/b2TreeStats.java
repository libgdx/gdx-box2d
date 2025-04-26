package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;

/**
 * These are performance results returned by dynamic tree queries.
 */
public final class b2TreeStats extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(76).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2TreeStats(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2TreeStats(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2TreeStats() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2TreeStats.b2TreeStatsPointer asPointer() {
        return new b2TreeStats.b2TreeStatsPointer(getPointer(), false, 1, this);
    }

    /**
     * Number of internal nodes visited during the query
     */
    public int nodeVisits() {
        return getBufPtr().getInt(0);
    }

    /**
     * Number of internal nodes visited during the query
     */
    public void nodeVisits(int nodeVisits) {
        getBufPtr().setInt(0, nodeVisits);
    }

    /**
     * Number of leaf nodes visited during the query
     */
    public int leafVisits() {
        return getBufPtr().getInt(4);
    }

    /**
     * Number of leaf nodes visited during the query
     */
    public void leafVisits(int leafVisits) {
        getBufPtr().setInt(4, leafVisits);
    }

    public static final class b2TreeStatsPointer extends StackElementPointer<b2TreeStats> {

        public b2TreeStatsPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2TreeStatsPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2TreeStatsPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2TreeStatsPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2TreeStatsPointer() {
            this(1, true);
        }

        public b2TreeStatsPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2TreeStats createStackElement(long ptr, boolean freeOnGC) {
            return new b2TreeStats(ptr, freeOnGC);
        }
    }
}
