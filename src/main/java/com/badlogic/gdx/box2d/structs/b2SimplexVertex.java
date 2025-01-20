package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * Simplex vertex for debugging the GJK algorithm
 */
public final class b2SimplexVertex extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(65).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2SimplexVertex(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2SimplexVertex() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2SimplexVertex.b2SimplexVertexPointer asPointer() {
        return new b2SimplexVertex.b2SimplexVertexPointer(getPointer(), getsGCFreed());
    }

    /**
     * support point in proxyA
     */
    public b2Vec2 wA() {
        return __wA;
    }

    private static final int __wA_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __wA = new b2Vec2(getPointer() + __wA_offset, false);

    /**
     * support point in proxyB
     */
    public b2Vec2 wB() {
        return __wB;
    }

    private static final int __wB_offset = CHandler.getOffsetForField(__ffi_type, 1);

    private final b2Vec2 __wB = new b2Vec2(getPointer() + __wB_offset, false);

    /**
     * wB - wA
     */
    public b2Vec2 w() {
        return __w;
    }

    private static final int __w_offset = CHandler.getOffsetForField(__ffi_type, 2);

    private final b2Vec2 __w = new b2Vec2(getPointer() + __w_offset, false);

    /**
     * barycentric coordinate for closest point
     */
    public float a() {
        return (float) getValueFloat(3);
    }

    /**
     * barycentric coordinate for closest point
     */
    public void a(float a) {
        setValue(a, 3);
    }

    /**
     * wA index
     */
    public int indexA() {
        return (int) getValue(4);
    }

    /**
     * wA index
     */
    public void indexA(int indexA) {
        setValue(indexA, 4);
    }

    /**
     * wB index
     */
    public int indexB() {
        return (int) getValue(5);
    }

    /**
     * wB index
     */
    public void indexB(int indexB) {
        setValue(indexB, 5);
    }

    public static final class b2SimplexVertexPointer extends StackElementPointer<b2SimplexVertex> {

        public b2SimplexVertexPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2SimplexVertexPointer() {
            this(1, true, true);
        }

        public b2SimplexVertexPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2SimplexVertex.b2SimplexVertexPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2SimplexVertex createStackElement(long ptr, boolean freeOnGC) {
            return new b2SimplexVertex(ptr, freeOnGC);
        }
    }
}
