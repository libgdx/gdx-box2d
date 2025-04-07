package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * Output for b2ShapeDistance
 */
public final class b2DistanceOutput extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(32).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2DistanceOutput(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2DistanceOutput() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2DistanceOutput.b2DistanceOutputPointer asPointer() {
        return new b2DistanceOutput.b2DistanceOutputPointer(getPointer(), false, this);
    }

    /**
     * Closest point on shapeA
     */
    public b2Vec2 pointA() {
        return __pointA;
    }

    private static final int __pointA_offset = 0;

    private final b2Vec2 __pointA = new b2Vec2(getPointer() + __pointA_offset, false);

    /**
     * Closest point on shapeB
     */
    public b2Vec2 pointB() {
        return __pointB;
    }

    private static final int __pointB_offset = 8;

    private final b2Vec2 __pointB = new b2Vec2(getPointer() + __pointB_offset, false);

    /**
     * The final distance, zero if overlapped
     */
    public float distance() {
        return getBufPtr().getFloat(16);
    }

    /**
     * The final distance, zero if overlapped
     */
    public void distance(float distance) {
        getBufPtr().setFloat(16, distance);
    }

    /**
     * Number of GJK iterations used
     */
    public int iterations() {
        return getBufPtr().getInt(20);
    }

    /**
     * Number of GJK iterations used
     */
    public void iterations(int iterations) {
        getBufPtr().setInt(20, iterations);
    }

    /**
     * The number of simplexes stored in the simplex array
     */
    public int simplexCount() {
        return getBufPtr().getInt(24);
    }

    /**
     * The number of simplexes stored in the simplex array
     */
    public void simplexCount(int simplexCount) {
        getBufPtr().setInt(24, simplexCount);
    }

    public static final class b2DistanceOutputPointer extends StackElementPointer<b2DistanceOutput> {

        public b2DistanceOutputPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2DistanceOutputPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2DistanceOutputPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2DistanceOutputPointer() {
            this(1, true);
        }

        public b2DistanceOutputPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2DistanceOutput createStackElement(long ptr, boolean freeOnGC) {
            return new b2DistanceOutput(ptr, freeOnGC);
        }
    }
}
