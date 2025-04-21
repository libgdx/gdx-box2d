package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * A line segment with two-sided collision.
 */
public final class b2Segment extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(57).getFfiType();
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
        return new b2Segment.b2SegmentPointer(getPointer(), false, this);
    }

    /**
     * The first point
     */
    public b2Vec2 point1() {
        return __point1;
    }

    private static final int __point1_offset = 0;

    private final b2Vec2 __point1 = new b2Vec2(getPointer() + __point1_offset, false);

    /**
     * The second point
     */
    public b2Vec2 point2() {
        return __point2;
    }

    private static final int __point2_offset = 8;

    private final b2Vec2 __point2 = new b2Vec2(getPointer() + __point2_offset, false);

    public static final class b2SegmentPointer extends StackElementPointer<b2Segment> {

        public b2SegmentPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2SegmentPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2SegmentPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2SegmentPointer() {
            this(1, true);
        }

        public b2SegmentPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2Segment createStackElement(long ptr, boolean freeOnGC) {
            return new b2Segment(ptr, freeOnGC);
        }
    }
}
