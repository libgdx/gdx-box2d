package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

public final class b2DistanceOutput extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(33).getFfiType();
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

    public b2Vec2 pointA() {
        return __pointA;
    }

    private static final int __pointA_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __pointA = new b2Vec2(getPointer() + __pointA_offset, false);

    public b2Vec2 pointB() {
        return __pointB;
    }

    private static final int __pointB_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __pointB = new b2Vec2(getPointer() + __pointB_offset, false);

    public float distance() {
        return (float) getValueFloat(0);
    }

    public void distance(float distance) {
        setValue(distance, 0);
    }

    public int iterations() {
        return (int) getValue(1);
    }

    public void iterations(int iterations) {
        setValue(iterations, 1);
    }

    public int simplexCount() {
        return (int) getValue(2);
    }

    public void simplexCount(int simplexCount) {
        setValue(simplexCount, 2);
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
