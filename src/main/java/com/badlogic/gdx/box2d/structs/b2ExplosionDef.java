package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * The explosion definition is used to configure options for explosions. Explosions
 * consider shape geometry when computing the impulse.
 * @ingroup world
 */
public final class b2ExplosionDef extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(34).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ExplosionDef(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2ExplosionDef() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2ExplosionDef.b2ExplosionDefPointer asPointer() {
        return new b2ExplosionDef.b2ExplosionDefPointer(getPointer(), getsGCFreed());
    }

    /**
     * Mask bits to filter shapes
     */
    public long maskBits() {
        return (long) getValue(0);
    }

    /**
     * Mask bits to filter shapes
     */
    public void maskBits(long maskBits) {
        setValue(maskBits, 0);
    }

    /**
     * The center of the explosion in world space
     */
    public b2Vec2 position() {
        return __position;
    }

    private static final int __position_offset = CHandler.getOffsetForField(__ffi_type, 1);

    private final b2Vec2 __position = new b2Vec2(getPointer() + __position_offset, false);

    /**
     * The radius of the explosion
     */
    public float radius() {
        return (float) getValueFloat(2);
    }

    /**
     * The radius of the explosion
     */
    public void radius(float radius) {
        setValue(radius, 2);
    }

    /**
     * The falloff distance beyond the radius. Impulse is reduced to zero at this distance.
     */
    public float falloff() {
        return (float) getValueFloat(3);
    }

    /**
     * The falloff distance beyond the radius. Impulse is reduced to zero at this distance.
     */
    public void falloff(float falloff) {
        setValue(falloff, 3);
    }

    /**
     *  Impulse per unit length. This applies an impulse according to the shape perimeter that
     * 	 is facing the explosion. Explosions only apply to circles, capsules, and polygons. This
     * 	 may be negative for implosions.
     */
    public float impulsePerLength() {
        return (float) getValueFloat(4);
    }

    /**
     *  Impulse per unit length. This applies an impulse according to the shape perimeter that
     * 	 is facing the explosion. Explosions only apply to circles, capsules, and polygons. This
     * 	 may be negative for implosions.
     */
    public void impulsePerLength(float impulsePerLength) {
        setValue(impulsePerLength, 4);
    }

    public static final class b2ExplosionDefPointer extends StackElementPointer<b2ExplosionDef> {

        public b2ExplosionDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ExplosionDefPointer() {
            this(1, true, true);
        }

        public b2ExplosionDefPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2ExplosionDef.b2ExplosionDefPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2ExplosionDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2ExplosionDef(ptr, freeOnGC);
        }
    }
}
