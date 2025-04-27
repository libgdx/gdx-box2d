package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
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

    public b2Segment(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
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
        return new b2Segment.b2SegmentPointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2Segment.b2SegmentPointer ptr) {
        ptr.setPointer(this);
    }

    /**
     * The first point
     */
    public b2Vec2 point1() {
        return new b2Vec2(getPointer(), false);
    }

    /**
     * The first point
     */
    public void point1(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    /**
     * The first point
     */
    public b2Vec2 getPoint1() {
        return new b2Vec2(getBufPtr().duplicate(0, 8), true);
    }

    /**
     * The first point
     */
    public void getPoint1(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    /**
     * The first point
     */
    public void setPoint1(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * The second point
     */
    public b2Vec2 point2() {
        return new b2Vec2(getPointer() + (8), false);
    }

    /**
     * The second point
     */
    public void point2(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (8), 8, this);
    }

    /**
     * The second point
     */
    public b2Vec2 getPoint2() {
        return new b2Vec2(getBufPtr().duplicate(8, 8), true);
    }

    /**
     * The second point
     */
    public void getPoint2(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 8, 8);
    }

    /**
     * The second point
     */
    public void setPoint2(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(8, toCopyFrom.getBufPtr(), 0, 8);
    }

    public static final class b2SegmentPointer extends StackElementPointer<b2Segment> {

        public b2SegmentPointer(VoidPointer pointer) {
            super(pointer);
        }

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

        public b2SegmentPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
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
