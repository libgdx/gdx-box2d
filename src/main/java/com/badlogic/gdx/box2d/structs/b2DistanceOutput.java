package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
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
        return new b2DistanceOutput.b2DistanceOutputPointer(getPointer(), getsGCFreed());
    }

    /**
     * Closest point on shapeA
     */
    public b2Vec2 pointA() {
        return __pointA;
    }

    private static final int __pointA_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __pointA = new b2Vec2(getPointer() + __pointA_offset, false);

    /**
     * Closest point on shapeB
     */
    public b2Vec2 pointB() {
        return __pointB;
    }

    private static final int __pointB_offset = CHandler.getOffsetForField(__ffi_type, 1);

    private final b2Vec2 __pointB = new b2Vec2(getPointer() + __pointB_offset, false);

    /**
     * The final distance, zero if overlapped
     */
    public float distance() {
        return (float) getValueFloat(2);
    }

    /**
     * The final distance, zero if overlapped
     */
    public void distance(float distance) {
        setValue(distance, 2);
    }

    /**
     * Number of GJK iterations used
     */
    public int iterations() {
        return (int) getValue(3);
    }

    /**
     * Number of GJK iterations used
     */
    public void iterations(int iterations) {
        setValue(iterations, 3);
    }

    /**
     * The number of simplexes stored in the simplex array
     */
    public int simplexCount() {
        return (int) getValue(4);
    }

    /**
     * The number of simplexes stored in the simplex array
     */
    public void simplexCount(int simplexCount) {
        setValue(simplexCount, 4);
    }

    public static final class b2DistanceOutputPointer extends StackElementPointer<b2DistanceOutput> {

        public b2DistanceOutputPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2DistanceOutputPointer() {
            this(1, true, true);
        }

        public b2DistanceOutputPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2DistanceOutput.b2DistanceOutputPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2DistanceOutput createStackElement(long ptr, boolean freeOnGC) {
            return new b2DistanceOutput(ptr, freeOnGC);
        }
    }
}
