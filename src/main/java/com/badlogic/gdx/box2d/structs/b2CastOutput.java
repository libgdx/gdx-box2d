package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * Low level ray cast or shape-cast output data
 */
public final class b2CastOutput extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(17).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2CastOutput(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2CastOutput() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2CastOutput.b2CastOutputPointer asPointer() {
        return new b2CastOutput.b2CastOutputPointer(getPointer(), getsGCFreed());
    }

    /**
     * The surface normal at the hit point
     */
    public b2Vec2 normal() {
        return __normal;
    }

    private static final int __normal_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __normal = new b2Vec2(getPointer() + __normal_offset, false);

    /**
     * The surface hit point
     */
    public b2Vec2 point() {
        return __point;
    }

    private static final int __point_offset = CHandler.getOffsetForField(__ffi_type, 1);

    private final b2Vec2 __point = new b2Vec2(getPointer() + __point_offset, false);

    /**
     * The fraction of the input translation at collision
     */
    public float fraction() {
        return (float) getValueFloat(2);
    }

    /**
     * The fraction of the input translation at collision
     */
    public void fraction(float fraction) {
        setValue(fraction, 2);
    }

    /**
     * The number of iterations used
     */
    public int iterations() {
        return (int) getValue(3);
    }

    /**
     * The number of iterations used
     */
    public void iterations(int iterations) {
        setValue(iterations, 3);
    }

    /**
     * Did the cast hit?
     */
    public boolean hit() {
        return getValue(4) != 0;
    }

    /**
     * Did the cast hit?
     */
    public void hit(boolean hit) {
        setValue(hit, 4);
    }

    public static final class b2CastOutputPointer extends StackElementPointer<b2CastOutput> {

        public b2CastOutputPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2CastOutputPointer() {
            this(1, true, true);
        }

        public b2CastOutputPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2CastOutput.b2CastOutputPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2CastOutput createStackElement(long ptr, boolean freeOnGC) {
            return new b2CastOutput(ptr, freeOnGC);
        }
    }
}
