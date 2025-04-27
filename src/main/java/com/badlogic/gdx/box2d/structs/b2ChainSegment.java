package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.box2d.structs.b2Segment;

/**
 * A line segment with one-sided collision. Only collides on the right side.
 * Several of these are generated for a chain shape.
 * ghost1 -> point1 -> point2 -> ghost2
 */
public final class b2ChainSegment extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(20).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ChainSegment(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2ChainSegment(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2ChainSegment() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2ChainSegment.b2ChainSegmentPointer asPointer() {
        return new b2ChainSegment.b2ChainSegmentPointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2ChainSegment.b2ChainSegmentPointer ptr) {
        ptr.setPointer(this);
    }

    /**
     * The tail ghost vertex
     */
    public b2Vec2 ghost1() {
        return new b2Vec2(getPointer(), false);
    }

    /**
     * The tail ghost vertex
     */
    public void ghost1(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    /**
     * The tail ghost vertex
     */
    public b2Vec2 getGhost1() {
        return new b2Vec2(getBufPtr().duplicate(0, 8), true);
    }

    /**
     * The tail ghost vertex
     */
    public void getGhost1(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    /**
     * The tail ghost vertex
     */
    public void setGhost1(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * The line segment
     */
    public b2Segment segment() {
        return new b2Segment(getPointer() + (8), false);
    }

    /**
     * The line segment
     */
    public void segment(b2Segment toSetPtr) {
        toSetPtr.setPointer(getPointer() + (8), 16, this);
    }

    /**
     * The line segment
     */
    public b2Segment getSegment() {
        return new b2Segment(getBufPtr().duplicate(8, 16), true);
    }

    /**
     * The line segment
     */
    public void getSegment(b2Segment toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 8, 16);
    }

    /**
     * The line segment
     */
    public void setSegment(b2Segment toCopyFrom) {
        getBufPtr().copyFrom(8, toCopyFrom.getBufPtr(), 0, 16);
    }

    /**
     * The head ghost vertex
     */
    public b2Vec2 ghost2() {
        return new b2Vec2(getPointer() + (24), false);
    }

    /**
     * The head ghost vertex
     */
    public void ghost2(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (24), 8, this);
    }

    /**
     * The head ghost vertex
     */
    public b2Vec2 getGhost2() {
        return new b2Vec2(getBufPtr().duplicate(24, 8), true);
    }

    /**
     * The head ghost vertex
     */
    public void getGhost2(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 24, 8);
    }

    /**
     * The head ghost vertex
     */
    public void setGhost2(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(24, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * The owning chain shape index (internal usage only)
     */
    public int chainId() {
        return getBufPtr().getInt(32);
    }

    /**
     * The owning chain shape index (internal usage only)
     */
    public void chainId(int chainId) {
        getBufPtr().setInt(32, chainId);
    }

    public static final class b2ChainSegmentPointer extends StackElementPointer<b2ChainSegment> {

        public b2ChainSegmentPointer(VoidPointer pointer) {
            super(pointer);
        }

        public b2ChainSegmentPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ChainSegmentPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2ChainSegmentPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2ChainSegmentPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2ChainSegmentPointer() {
            this(1, true);
        }

        public b2ChainSegmentPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2ChainSegment createStackElement(long ptr, boolean freeOnGC) {
            return new b2ChainSegment(ptr, freeOnGC);
        }
    }
}
