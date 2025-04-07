package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
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
        return new b2SimplexVertex.b2SimplexVertexPointer(getPointer(), false, this);
    }

    /**
     * support point in proxyA
     */
    public b2Vec2 wA() {
        return __wA;
    }

    private static final int __wA_offset = 0;

    private final b2Vec2 __wA = new b2Vec2(getPointer() + __wA_offset, false);

    /**
     * support point in proxyB
     */
    public b2Vec2 wB() {
        return __wB;
    }

    private static final int __wB_offset = 8;

    private final b2Vec2 __wB = new b2Vec2(getPointer() + __wB_offset, false);

    /**
     * wB - wA
     */
    public b2Vec2 w() {
        return __w;
    }

    private static final int __w_offset = 16;

    private final b2Vec2 __w = new b2Vec2(getPointer() + __w_offset, false);

    /**
     * barycentric coordinate for closest point
     */
    public float a() {
        return getBufPtr().getFloat(24);
    }

    /**
     * barycentric coordinate for closest point
     */
    public void a(float a) {
        getBufPtr().setFloat(24, a);
    }

    /**
     * wA index
     */
    public int indexA() {
        return getBufPtr().getInt(28);
    }

    /**
     * wA index
     */
    public void indexA(int indexA) {
        getBufPtr().setInt(28, indexA);
    }

    /**
     * wB index
     */
    public int indexB() {
        return getBufPtr().getInt(32);
    }

    /**
     * wB index
     */
    public void indexB(int indexB) {
        getBufPtr().setInt(32, indexB);
    }

    public static final class b2SimplexVertexPointer extends StackElementPointer<b2SimplexVertex> {

        public b2SimplexVertexPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2SimplexVertexPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2SimplexVertexPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2SimplexVertexPointer() {
            this(1, true);
        }

        public b2SimplexVertexPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2SimplexVertex createStackElement(long ptr, boolean freeOnGC) {
            return new b2SimplexVertex(ptr, freeOnGC);
        }
    }
}
