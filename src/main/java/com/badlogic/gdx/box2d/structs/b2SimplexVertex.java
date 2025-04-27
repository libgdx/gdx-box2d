package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * Simplex vertex for debugging the GJK algorithm
 */
public final class b2SimplexVertex extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(69).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2SimplexVertex(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2SimplexVertex(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
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
        return new b2SimplexVertex.b2SimplexVertexPointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2SimplexVertex.b2SimplexVertexPointer ptr) {
        ptr.setPointer(this);
    }

    /**
     * support point in proxyA
     */
    public b2Vec2 wA() {
        return new b2Vec2(getPointer(), false);
    }

    /**
     * support point in proxyA
     */
    public void wA(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    /**
     * support point in proxyA
     */
    public b2Vec2 getWA() {
        return new b2Vec2(getBufPtr().duplicate(0, 8), true);
    }

    /**
     * support point in proxyA
     */
    public void getWA(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    /**
     * support point in proxyA
     */
    public void setWA(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * support point in proxyB
     */
    public b2Vec2 wB() {
        return new b2Vec2(getPointer() + (8), false);
    }

    /**
     * support point in proxyB
     */
    public void wB(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (8), 8, this);
    }

    /**
     * support point in proxyB
     */
    public b2Vec2 getWB() {
        return new b2Vec2(getBufPtr().duplicate(8, 8), true);
    }

    /**
     * support point in proxyB
     */
    public void getWB(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 8, 8);
    }

    /**
     * support point in proxyB
     */
    public void setWB(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(8, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * wB - wA
     */
    public b2Vec2 w() {
        return new b2Vec2(getPointer() + (16), false);
    }

    /**
     * wB - wA
     */
    public void w(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (16), 8, this);
    }

    /**
     * wB - wA
     */
    public b2Vec2 getW() {
        return new b2Vec2(getBufPtr().duplicate(16, 8), true);
    }

    /**
     * wB - wA
     */
    public void getW(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 16, 8);
    }

    /**
     * wB - wA
     */
    public void setW(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(16, toCopyFrom.getBufPtr(), 0, 8);
    }

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

        public b2SimplexVertexPointer(VoidPointer pointer) {
            super(pointer);
        }

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

        public b2SimplexVertexPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
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
