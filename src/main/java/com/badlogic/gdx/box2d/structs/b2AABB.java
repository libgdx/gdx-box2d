package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
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
        return new b2AABB.b2AABBPointer(getPointer(), false, this);
    }

    public b2Vec2 lowerBound() {
        return __lowerBound;
    }

    private static final int __lowerBound_offset = 0;

    private final b2Vec2 __lowerBound = new b2Vec2(getPointer() + __lowerBound_offset, false);

    public b2Vec2 upperBound() {
        return __upperBound;
    }

    private static final int __upperBound_offset = 8;

    private final b2Vec2 __upperBound = new b2Vec2(getPointer() + __upperBound_offset, false);

    public static final class b2AABBPointer extends StackElementPointer<b2AABB> {

        public b2AABBPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2AABBPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2AABBPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2AABBPointer() {
            this(1, true);
        }

        public b2AABBPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2AABB createStackElement(long ptr, boolean freeOnGC) {
            return new b2AABB(ptr, freeOnGC);
        }
    }
}
