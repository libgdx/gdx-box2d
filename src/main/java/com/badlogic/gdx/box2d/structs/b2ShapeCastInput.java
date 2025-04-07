package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * Low level shape cast input in generic form. This allows casting an arbitrary point
 * cloud wrap with a radius. For example, a circle is a single point with a non-zero radius.
 * A capsule is two points with a non-zero radius. A box is four points with a zero radius.
 */
public final class b2ShapeCastInput extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(58).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ShapeCastInput(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2ShapeCastInput() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2ShapeCastInput.b2ShapeCastInputPointer asPointer() {
        return new b2ShapeCastInput.b2ShapeCastInputPointer(getPointer(), false, this);
    }

    /**
     * A point cloud to cast
     */
    public b2Vec2.b2Vec2Pointer points() {
        return __points;
    }

    private static final int __points_offset = 0;

    private final b2Vec2.b2Vec2Pointer __points = new b2Vec2.b2Vec2Pointer(getPointer() + __points_offset, false, 8);

    /**
     * The number of points
     */
    public int count() {
        return getBufPtr().getInt(64);
    }

    /**
     * The number of points
     */
    public void count(int count) {
        getBufPtr().setInt(64, count);
    }

    /**
     * The radius around the point cloud
     */
    public float radius() {
        return getBufPtr().getFloat(68);
    }

    /**
     * The radius around the point cloud
     */
    public void radius(float radius) {
        getBufPtr().setFloat(68, radius);
    }

    /**
     * The translation of the shape cast
     */
    public b2Vec2 translation() {
        return __translation;
    }

    private static final int __translation_offset = 72;

    private final b2Vec2 __translation = new b2Vec2(getPointer() + __translation_offset, false);

    /**
     * The maximum fraction of the translation to consider, typically 1
     */
    public float maxFraction() {
        return getBufPtr().getFloat(80);
    }

    /**
     * The maximum fraction of the translation to consider, typically 1
     */
    public void maxFraction(float maxFraction) {
        getBufPtr().setFloat(80, maxFraction);
    }

    public static final class b2ShapeCastInputPointer extends StackElementPointer<b2ShapeCastInput> {

        public b2ShapeCastInputPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ShapeCastInputPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2ShapeCastInputPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2ShapeCastInputPointer() {
            this(1, true);
        }

        public b2ShapeCastInputPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2ShapeCastInput createStackElement(long ptr, boolean freeOnGC) {
            return new b2ShapeCastInput(ptr, freeOnGC);
        }
    }
}
