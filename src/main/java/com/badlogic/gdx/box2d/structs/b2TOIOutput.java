package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.enums.b2TOIState;

/**
 * Output parameters for b2TimeOfImpact.
 */
public final class b2TOIOutput extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(68).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2TOIOutput(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2TOIOutput() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2TOIOutput.b2TOIOutputPointer asPointer() {
        return new b2TOIOutput.b2TOIOutputPointer(getPointer(), getsGCFreed());
    }

    /**
     * The type of result
     */
    public b2TOIState state() {
        return b2TOIState.getByIndex((int) getValue(0));
    }

    /**
     * The type of result
     */
    public void state(b2TOIState state) {
        setValue(state.getIndex(), 0);
    }

    /**
     * The sweep time of the collision
     */
    public float fraction() {
        return (float) getValueFloat(1);
    }

    /**
     * The sweep time of the collision
     */
    public void fraction(float fraction) {
        setValue(fraction, 1);
    }

    public static final class b2TOIOutputPointer extends StackElementPointer<b2TOIOutput> {

        public b2TOIOutputPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2TOIOutputPointer() {
            this(1, true, true);
        }

        public b2TOIOutputPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2TOIOutput.b2TOIOutputPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2TOIOutput createStackElement(long ptr, boolean freeOnGC) {
            return new b2TOIOutput(ptr, freeOnGC);
        }
    }
}
