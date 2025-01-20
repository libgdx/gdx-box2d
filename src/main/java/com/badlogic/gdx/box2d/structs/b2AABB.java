package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * Axis-aligned bounding box
 */
public final class b2AABB extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(11).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2AABB(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2AABB() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2AABB.b2AABBPointer asPointer() {
        return new b2AABB.b2AABBPointer(getPointer(), getsGCFreed());
    }

    public b2Vec2 lowerBound() {
        return __lowerBound;
    }

    private static final int __lowerBound_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __lowerBound = new b2Vec2(getPointer() + __lowerBound_offset, false);

    public b2Vec2 upperBound() {
        return __upperBound;
    }

    private static final int __upperBound_offset = CHandler.getOffsetForField(__ffi_type, 1);

    private final b2Vec2 __upperBound = new b2Vec2(getPointer() + __upperBound_offset, false);

    public static final class b2AABBPointer extends StackElementPointer<b2AABB> {

        public b2AABBPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2AABBPointer() {
            this(1, true, true);
        }

        public b2AABBPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2AABB.b2AABBPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2AABB createStackElement(long ptr, boolean freeOnGC) {
            return new b2AABB(ptr, freeOnGC);
        }
    }
}
