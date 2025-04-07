package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.box2d.structs.b2Rot;

/**
 * This describes the motion of a body/shape for TOI computation. Shapes are defined with respect to the body origin,
 * which may not coincide with the center of mass. However, to support dynamics we must interpolate the center of mass
 * position.
 */
public final class b2Sweep extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(66).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2Sweep(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2Sweep() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2Sweep.b2SweepPointer asPointer() {
        return new b2Sweep.b2SweepPointer(getPointer(), false, this);
    }

    /**
     * Local center of mass position
     */
    public b2Vec2 localCenter() {
        return __localCenter;
    }

    private static final int __localCenter_offset = 0;

    private final b2Vec2 __localCenter = new b2Vec2(getPointer() + __localCenter_offset, false);

    /**
     * Starting center of mass world position
     */
    public b2Vec2 c1() {
        return __c1;
    }

    private static final int __c1_offset = 8;

    private final b2Vec2 __c1 = new b2Vec2(getPointer() + __c1_offset, false);

    /**
     * Ending center of mass world position
     */
    public b2Vec2 c2() {
        return __c2;
    }

    private static final int __c2_offset = 16;

    private final b2Vec2 __c2 = new b2Vec2(getPointer() + __c2_offset, false);

    /**
     * Starting world rotation
     */
    public b2Rot q1() {
        return __q1;
    }

    private static final int __q1_offset = 24;

    private final b2Rot __q1 = new b2Rot(getPointer() + __q1_offset, false);

    /**
     * Ending world rotation
     */
    public b2Rot q2() {
        return __q2;
    }

    private static final int __q2_offset = 32;

    private final b2Rot __q2 = new b2Rot(getPointer() + __q2_offset, false);

    public static final class b2SweepPointer extends StackElementPointer<b2Sweep> {

        public b2SweepPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2SweepPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2SweepPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2SweepPointer() {
            this(1, true);
        }

        public b2SweepPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2Sweep createStackElement(long ptr, boolean freeOnGC) {
            return new b2Sweep(ptr, freeOnGC);
        }
    }
}
