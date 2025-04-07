package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2ShapeProxy;
import com.badlogic.gdx.box2d.structs.b2Transform;

/**
 * Input for b2ShapeDistance
 */
public final class b2DistanceInput extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(30).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2DistanceInput(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2DistanceInput() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2DistanceInput.b2DistanceInputPointer asPointer() {
        return new b2DistanceInput.b2DistanceInputPointer(getPointer(), false, this);
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
     * The world transform for shape A
     */
    public b2Transform transformA() {
        return __transformA;
    }

    private static final int __transformA_offset = 144;

    private final b2Transform __transformA = new b2Transform(getPointer() + __transformA_offset, false);

    /**
     * The world transform for shape B
     */
    public b2Transform transformB() {
        return __transformB;
    }

    private static final int __transformB_offset = 160;

    private final b2Transform __transformB = new b2Transform(getPointer() + __transformB_offset, false);

    /**
     * Should the proxy radius be considered?
     */
    public boolean useRadii() {
        return getBufPtr().getBoolean(176);
    }

    /**
     * Should the proxy radius be considered?
     */
    public void useRadii(boolean useRadii) {
        getBufPtr().setBoolean(176, useRadii);
    }

    public static final class b2DistanceInputPointer extends StackElementPointer<b2DistanceInput> {

        public b2DistanceInputPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2DistanceInputPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2DistanceInputPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2DistanceInputPointer() {
            this(1, true);
        }

        public b2DistanceInputPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2DistanceInput createStackElement(long ptr, boolean freeOnGC) {
            return new b2DistanceInput(ptr, freeOnGC);
        }
    }
}
