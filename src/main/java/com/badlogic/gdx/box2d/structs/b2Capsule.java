package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * A solid capsule can be viewed as two semicircles connected
 * by a rectangle.
 */
public final class b2Capsule extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(16).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2Capsule(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2Capsule() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2Capsule.b2CapsulePointer asPointer() {
        return new b2Capsule.b2CapsulePointer(getPointer(), getsGCFreed());
    }

    /**
     * Local center of the first semicircle
     */
    public b2Vec2 center1() {
        return __center1;
    }

    private static final int __center1_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __center1 = new b2Vec2(getPointer() + __center1_offset, false);

    /**
     * Local center of the second semicircle
     */
    public b2Vec2 center2() {
        return __center2;
    }

    private static final int __center2_offset = CHandler.getOffsetForField(__ffi_type, 1);

    private final b2Vec2 __center2 = new b2Vec2(getPointer() + __center2_offset, false);

    /**
     * The radius of the semicircles
     */
    public float radius() {
        return (float) getValueFloat(2);
    }

    /**
     * The radius of the semicircles
     */
    public void radius(float radius) {
        setValue(radius, 2);
    }

    public static final class b2CapsulePointer extends StackElementPointer<b2Capsule> {

        public b2CapsulePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2CapsulePointer() {
            this(1, true, true);
        }

        public b2CapsulePointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2Capsule.b2CapsulePointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2Capsule createStackElement(long ptr, boolean freeOnGC) {
            return new b2Capsule(ptr, freeOnGC);
        }
    }
}
