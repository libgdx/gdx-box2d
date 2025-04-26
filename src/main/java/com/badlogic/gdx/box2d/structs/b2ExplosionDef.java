package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
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
        __ffi_type = FFITypes.getCTypeInfo(35).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ExplosionDef(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2ExplosionDef(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
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
        return new b2ExplosionDef.b2ExplosionDefPointer(getPointer(), false, 1, this);
    }

    /**
     * Mask bits to filter shapes
     */
    public long maskBits() {
        return getBufPtr().getLong(0);
    }

    /**
     * Mask bits to filter shapes
     */
    public void maskBits(long maskBits) {
        getBufPtr().setLong(0, maskBits);
    }

    /**
     * The center of the explosion in world space
     */
    public b2Vec2 position() {
        return new b2Vec2(getPointer() + (8), false);
    }

    /**
     * The center of the explosion in world space
     */
    public void position(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (8), 8, this);
    }

    /**
     * The center of the explosion in world space
     */
    public b2Vec2 getPosition() {
        return new b2Vec2(getBufPtr().duplicate(8, 8), true);
    }

    /**
     * The center of the explosion in world space
     */
    public void getPosition(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 8, 8);
    }

    /**
     * The center of the explosion in world space
     */
    public void setPosition(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(8, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * The radius of the explosion
     */
    public float radius() {
        return getBufPtr().getFloat(16);
    }

    /**
     * The radius of the explosion
     */
    public void radius(float radius) {
        getBufPtr().setFloat(16, radius);
    }

    /**
     * The falloff distance beyond the radius. Impulse is reduced to zero at this distance.
     */
    public float falloff() {
        return getBufPtr().getFloat(20);
    }

    /**
     * The falloff distance beyond the radius. Impulse is reduced to zero at this distance.
     */
    public void falloff(float falloff) {
        getBufPtr().setFloat(20, falloff);
    }

    /**
     *  Impulse per unit length. This applies an impulse according to the shape perimeter that
     * 	 is facing the explosion. Explosions only apply to circles, capsules, and polygons. This
     * 	 may be negative for implosions.
     */
    public float impulsePerLength() {
        return getBufPtr().getFloat(24);
    }

    /**
     *  Impulse per unit length. This applies an impulse according to the shape perimeter that
     * 	 is facing the explosion. Explosions only apply to circles, capsules, and polygons. This
     * 	 may be negative for implosions.
     */
    public void impulsePerLength(float impulsePerLength) {
        getBufPtr().setFloat(24, impulsePerLength);
    }

    public static final class b2ExplosionDefPointer extends StackElementPointer<b2ExplosionDef> {

        public b2ExplosionDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ExplosionDefPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2ExplosionDefPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2ExplosionDefPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2ExplosionDefPointer() {
            this(1, true);
        }

        public b2ExplosionDefPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2ExplosionDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2ExplosionDef(ptr, freeOnGC);
        }
    }
}
