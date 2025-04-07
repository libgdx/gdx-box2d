package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2ShapeProxy;
import com.badlogic.gdx.box2d.structs.b2Sweep;

/**
 * Input parameters for b2TimeOfImpact
 */
public final class b2TOIInput extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(67).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2TOIInput(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2TOIInput() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2TOIInput.b2TOIInputPointer asPointer() {
        return new b2TOIInput.b2TOIInputPointer(getPointer(), false, this);
    }

    /**
     * The proxy for shape A
     */
    public b2ShapeProxy proxyA() {
        return __proxyA;
    }

    private static final int __proxyA_offset = 0;

    private final b2ShapeProxy __proxyA = new b2ShapeProxy(getPointer() + __proxyA_offset, false);

    /**
     * The proxy for shape B
     */
    public b2ShapeProxy proxyB() {
        return __proxyB;
    }

    private static final int __proxyB_offset = 72;

    private final b2ShapeProxy __proxyB = new b2ShapeProxy(getPointer() + __proxyB_offset, false);

    /**
     * The movement of shape A
     */
    public b2Sweep sweepA() {
        return __sweepA;
    }

    private static final int __sweepA_offset = 144;

    private final b2Sweep __sweepA = new b2Sweep(getPointer() + __sweepA_offset, false);

    /**
     * The movement of shape B
     */
    public b2Sweep sweepB() {
        return __sweepB;
    }

    private static final int __sweepB_offset = 184;

    private final b2Sweep __sweepB = new b2Sweep(getPointer() + __sweepB_offset, false);

    /**
     * Defines the sweep interval [0, maxFraction]
     */
    public float maxFraction() {
        return getBufPtr().getFloat(224);
    }

    /**
     * Defines the sweep interval [0, maxFraction]
     */
    public void maxFraction(float maxFraction) {
        getBufPtr().setFloat(224, maxFraction);
    }

    public static final class b2TOIInputPointer extends StackElementPointer<b2TOIInput> {

        public b2TOIInputPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2TOIInputPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2TOIInputPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2TOIInputPointer() {
            this(1, true);
        }

        public b2TOIInputPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2TOIInput createStackElement(long ptr, boolean freeOnGC) {
            return new b2TOIInput(ptr, freeOnGC);
        }
    }
}
