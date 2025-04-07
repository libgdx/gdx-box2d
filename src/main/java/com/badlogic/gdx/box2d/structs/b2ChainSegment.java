package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
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
        return new b2ChainSegment.b2ChainSegmentPointer(getPointer(), false, this);
    }

    /**
     * The tail ghost vertex
     */
    public b2Vec2 ghost1() {
        return __ghost1;
    }

    private static final int __ghost1_offset = 0;

    private final b2Vec2 __ghost1 = new b2Vec2(getPointer() + __ghost1_offset, false);

    /**
     * The line segment
     */
    public b2Segment segment() {
        return __segment;
    }

    private static final int __segment_offset = 8;

    private final b2Segment __segment = new b2Segment(getPointer() + __segment_offset, false);

    /**
     * The head ghost vertex
     */
    public b2Vec2 ghost2() {
        return __ghost2;
    }

    private static final int __ghost2_offset = 24;

    private final b2Vec2 __ghost2 = new b2Vec2(getPointer() + __ghost2_offset, false);

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
