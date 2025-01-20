package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * A line segment with two-sided collision.
 */
public final class b2Segment extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(53).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2Segment(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2Segment() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2Segment.b2SegmentPointer asPointer() {
        return new b2Segment.b2SegmentPointer(getPointer(), getsGCFreed());
    }

    /**
     * The first point
     */
    public b2Vec2 point1() {
        return __point1;
    }

    private static final int __point1_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __point1 = new b2Vec2(getPointer() + __point1_offset, false);

    /**
     * The second point
     */
    public b2Vec2 point2() {
        return __point2;
    }

    private static final int __point2_offset = CHandler.getOffsetForField(__ffi_type, 1);

    private final b2Vec2 __point2 = new b2Vec2(getPointer() + __point2_offset, false);

    public static final class b2SegmentPointer extends StackElementPointer<b2Segment> {

        public b2SegmentPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2SegmentPointer() {
            this(1, true, true);
        }

        public b2SegmentPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2Segment.b2SegmentPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2Segment createStackElement(long ptr, boolean freeOnGC) {
            return new b2Segment(ptr, freeOnGC);
        }
    }
}
