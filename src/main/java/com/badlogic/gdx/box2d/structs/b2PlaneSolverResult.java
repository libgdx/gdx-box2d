package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * Result returned by b2SolvePlanes
 */
public final class b2PlaneSolverResult extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(48).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2PlaneSolverResult(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2PlaneSolverResult(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2PlaneSolverResult() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2PlaneSolverResult.b2PlaneSolverResultPointer asPointer() {
        return new b2PlaneSolverResult.b2PlaneSolverResultPointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2PlaneSolverResult.b2PlaneSolverResultPointer ptr) {
        ptr.setPointer(this);
    }

    /**
     * The final position of the mover
     */
    public b2Vec2 position() {
        return new b2Vec2(getPointer(), false);
    }

    /**
     * The final position of the mover
     */
    public void position(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    /**
     * The final position of the mover
     */
    public b2Vec2 getPosition() {
        return new b2Vec2(getBufPtr().duplicate(0, 8), true);
    }

    /**
     * The final position of the mover
     */
    public void getPosition(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    /**
     * The final position of the mover
     */
    public void setPosition(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * The number of iterations used by the plane solver. For diagnostics.
     */
    public int iterationCount() {
        return getBufPtr().getInt(8);
    }

    /**
     * The number of iterations used by the plane solver. For diagnostics.
     */
    public void iterationCount(int iterationCount) {
        getBufPtr().setInt(8, iterationCount);
    }

    public static final class b2PlaneSolverResultPointer extends StackElementPointer<b2PlaneSolverResult> {

        public b2PlaneSolverResultPointer(VoidPointer pointer) {
            super(pointer);
        }

        public b2PlaneSolverResultPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2PlaneSolverResultPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2PlaneSolverResultPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2PlaneSolverResultPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2PlaneSolverResultPointer() {
            this(1, true);
        }

        public b2PlaneSolverResultPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2PlaneSolverResult createStackElement(long ptr, boolean freeOnGC) {
            return new b2PlaneSolverResult(ptr, freeOnGC);
        }
    }
}
