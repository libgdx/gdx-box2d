package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2ManifoldPoint;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * A contact manifold describes the contact points between colliding shapes.
 * @note Box2D uses speculative collision so some contact points may be separated.
 */
public final class b2Manifold extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(38).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2Manifold(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2Manifold() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2Manifold.b2ManifoldPointer asPointer() {
        return new b2Manifold.b2ManifoldPointer(getPointer(), getsGCFreed());
    }

    /**
     * The manifold points, up to two are possible in 2D
     */
    public b2ManifoldPoint.b2ManifoldPointPointer points() {
        return __points;
    }

    private static final int __points_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2ManifoldPoint.b2ManifoldPointPointer __points = new b2ManifoldPoint.b2ManifoldPointPointer(getPointer() + __points_offset, false).guardCount(2);

    /**
     * The unit normal vector in world space, points from shape A to bodyB
     */
    public b2Vec2 normal() {
        return __normal;
    }

    private static final int __normal_offset = CHandler.getOffsetForField(__ffi_type, 2);

    private final b2Vec2 __normal = new b2Vec2(getPointer() + __normal_offset, false);

    /**
     * The number of contacts points, will be 0, 1, or 2
     */
    public int pointCount() {
        return (int) getValue(3);
    }

    /**
     * The number of contacts points, will be 0, 1, or 2
     */
    public void pointCount(int pointCount) {
        setValue(pointCount, 3);
    }

    public static final class b2ManifoldPointer extends StackElementPointer<b2Manifold> {

        public b2ManifoldPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ManifoldPointer() {
            this(1, true, true);
        }

        public b2ManifoldPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2Manifold.b2ManifoldPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2Manifold createStackElement(long ptr, boolean freeOnGC) {
            return new b2Manifold(ptr, freeOnGC);
        }
    }
}
