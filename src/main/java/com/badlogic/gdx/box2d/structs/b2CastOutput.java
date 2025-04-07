package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
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
        return new b2CastOutput.b2CastOutputPointer(getPointer(), false, this);
    }

    /**
     * The surface normal at the hit point
     */
    public b2Vec2 normal() {
        return __normal;
    }

    private static final int __normal_offset = 0;

    private final b2Vec2 __normal = new b2Vec2(getPointer() + __normal_offset, false);

    /**
     * The surface hit point
     */
    public b2Vec2 point() {
        return __point;
    }

    private static final int __point_offset = 8;

    private final b2Vec2 __point = new b2Vec2(getPointer() + __point_offset, false);

    /**
     * The fraction of the input translation at collision
     */
    public float fraction() {
        return getBufPtr().getFloat(16);
    }

    /**
     * The fraction of the input translation at collision
     */
    public void fraction(float fraction) {
        getBufPtr().setFloat(16, fraction);
    }

    /**
     * The number of iterations used
     */
    public int iterations() {
        return getBufPtr().getInt(20);
    }

    /**
     * The number of iterations used
     */
    public void iterations(int iterations) {
        getBufPtr().setInt(20, iterations);
    }

    /**
     * Did the cast hit?
     */
    public boolean hit() {
        return getBufPtr().getBoolean(24);
    }

    /**
     * Did the cast hit?
     */
    public void hit(boolean hit) {
        getBufPtr().setBoolean(24, hit);
    }

    public static final class b2CastOutputPointer extends StackElementPointer<b2CastOutput> {

        public b2CastOutputPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2CastOutputPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2CastOutputPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2CastOutputPointer() {
            this(1, true);
        }

        public b2CastOutputPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2CastOutput createStackElement(long ptr, boolean freeOnGC) {
            return new b2CastOutput(ptr, freeOnGC);
        }
    }
}
