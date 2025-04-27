package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.box2d.structs.b2ManifoldPoint;

/**
 * A contact manifold describes the contact points between colliding shapes.
 * @note Box2D uses speculative collision so some contact points may be separated.
 */
public final class b2Manifold extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(40).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2Manifold(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2Manifold(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
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
        return new b2Manifold.b2ManifoldPointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2Manifold.b2ManifoldPointer ptr) {
        ptr.setPointer(this);
    }

    /**
     * The unit normal vector in world space, points from shape A to bodyB
     */
    public b2Vec2 normal() {
        return new b2Vec2(getPointer(), false);
    }

    /**
     * The unit normal vector in world space, points from shape A to bodyB
     */
    public void normal(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    /**
     * The unit normal vector in world space, points from shape A to bodyB
     */
    public b2Vec2 getNormal() {
        return new b2Vec2(getBufPtr().duplicate(0, 8), true);
    }

    /**
     * The unit normal vector in world space, points from shape A to bodyB
     */
    public void getNormal(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    /**
     * The unit normal vector in world space, points from shape A to bodyB
     */
    public void setNormal(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * Angular impulse applied for rolling resistance. N * m * s = kg * m^2 / s
     */
    public float rollingImpulse() {
        return getBufPtr().getFloat(8);
    }

    /**
     * Angular impulse applied for rolling resistance. N * m * s = kg * m^2 / s
     */
    public void rollingImpulse(float rollingImpulse) {
        getBufPtr().setFloat(8, rollingImpulse);
    }

    /**
     * The manifold points, up to two are possible in 2D
     */
    public b2ManifoldPoint.b2ManifoldPointPointer points() {
        return new b2ManifoldPoint.b2ManifoldPointPointer(getPointer() + (12), false, 2);
    }

    /**
     * The manifold points, up to two are possible in 2D
     */
    public void points(b2ManifoldPoint.b2ManifoldPointPointer toSetPtr) {
        toSetPtr.setPointer(getPointer() + (12), 96, this);
    }

    /**
     * The manifold points, up to two are possible in 2D
     */
    public b2ManifoldPoint.b2ManifoldPointPointer getPoints() {
        return new b2ManifoldPoint.b2ManifoldPointPointer(getBufPtr().duplicate(12, 96), false, 2);
    }

    /**
     * The manifold points, up to two are possible in 2D
     */
    public void getPoints(b2ManifoldPoint.b2ManifoldPointPointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 12, 96);
    }

    /**
     * The manifold points, up to two are possible in 2D
     */
    public void setPoints(b2ManifoldPoint.b2ManifoldPointPointer toCopyFrom) {
        getBufPtr().copyFrom(12, toCopyFrom.getBufPtr(), 0, 96);
    }

    /**
     * The number of contacts points, will be 0, 1, or 2
     */
    public int pointCount() {
        return getBufPtr().getInt(108);
    }

    /**
     * The number of contacts points, will be 0, 1, or 2
     */
    public void pointCount(int pointCount) {
        getBufPtr().setInt(108, pointCount);
    }

    public static final class b2ManifoldPointer extends StackElementPointer<b2Manifold> {

        public b2ManifoldPointer(VoidPointer pointer) {
            super(pointer);
        }

        public b2ManifoldPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ManifoldPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2ManifoldPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2ManifoldPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2ManifoldPointer() {
            this(1, true);
        }

        public b2ManifoldPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2Manifold createStackElement(long ptr, boolean freeOnGC) {
            return new b2Manifold(ptr, freeOnGC);
        }
    }
}
