package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.box2d.structs.b2Filter;

/**
 * Used to create a chain of line segments. This is designed to eliminate ghost collisions with some limitations.
 * - chains are one-sided
 * - chains have no mass and should be used on static bodies
 * - chains have a counter-clockwise winding order
 * - chains are either a loop or open
 * - a chain must have at least 4 points
 * - the distance between any two points must be greater than B2_LINEAR_SLOP
 * - a chain shape should not self intersect (this is not validated)
 * - an open chain shape has NO COLLISION on the first and final edge
 * - you may overlap two open chains on their first three and/or last three points to get smooth collision
 * - a chain shape creates multiple line segment shapes on the body
 * https://en.wikipedia.org/wiki/Polygonal_chain
 * Must be initialized using b2DefaultChainDef().
 * @warning Do not use chain shapes unless you understand the limitations. This is an advanced feature.
 * @ingroup shape
 */
public final class b2ChainDef extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(18).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ChainDef(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2ChainDef() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2ChainDef.b2ChainDefPointer asPointer() {
        return new b2ChainDef.b2ChainDefPointer(getPointer(), getsGCFreed());
    }

    /**
     * Use this to store application specific shape data.
     */
    public VoidPointer userData() {
        return new VoidPointer(getValue(0), false);
    }

    /**
     * Use this to store application specific shape data.
     */
    public void userData(VoidPointer userData) {
        setValue(userData.getPointer(), 0);
    }

    /**
     * An array of at least 4 points. These are cloned and may be temporary.
     */
    public b2Vec2.b2Vec2Pointer points() {
        return new b2Vec2.b2Vec2Pointer(getValue(1), false);
    }

    /**
     * An array of at least 4 points. These are cloned and may be temporary.
     */
    public void points(b2Vec2.b2Vec2Pointer points) {
        setValue(points.getPointer(), 1);
    }

    /**
     * The point count, must be 4 or more.
     */
    public int count() {
        return (int) getValue(2);
    }

    /**
     * The point count, must be 4 or more.
     */
    public void count(int count) {
        setValue(count, 2);
    }

    /**
     * The friction coefficient, usually in the range [0,1].
     */
    public float friction() {
        return (float) getValueFloat(3);
    }

    /**
     * The friction coefficient, usually in the range [0,1].
     */
    public void friction(float friction) {
        setValue(friction, 3);
    }

    /**
     * The restitution (elasticity) usually in the range [0,1].
     */
    public float restitution() {
        return (float) getValueFloat(4);
    }

    /**
     * The restitution (elasticity) usually in the range [0,1].
     */
    public void restitution(float restitution) {
        setValue(restitution, 4);
    }

    /**
     * Contact filtering data.
     */
    public b2Filter filter() {
        return __filter;
    }

    private static final int __filter_offset = CHandler.getOffsetForField(__ffi_type, 5);

    private final b2Filter __filter = new b2Filter(getPointer() + __filter_offset, false);

    /**
     * Custom debug draw color.
     */
    public long customColor() {
        return (long) getValue(6);
    }

    /**
     * Custom debug draw color.
     */
    public void customColor(long customColor) {
        setValue(customColor, 6);
    }

    /**
     * Indicates a closed chain formed by connecting the first and last points
     */
    public boolean isLoop() {
        return getValue(7) != 0;
    }

    /**
     * Indicates a closed chain formed by connecting the first and last points
     */
    public void isLoop(boolean isLoop) {
        setValue(isLoop, 7);
    }

    /**
     * Generate events when a sensor overlaps this chain
     */
    public boolean enableSensorEvents() {
        return getValue(8) != 0;
    }

    /**
     * Generate events when a sensor overlaps this chain
     */
    public void enableSensorEvents(boolean enableSensorEvents) {
        setValue(enableSensorEvents, 8);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int internalValue() {
        return (int) getValue(9);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void internalValue(int internalValue) {
        setValue(internalValue, 9);
    }

    public static final class b2ChainDefPointer extends StackElementPointer<b2ChainDef> {

        public b2ChainDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ChainDefPointer() {
            this(1, true, true);
        }

        public b2ChainDefPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2ChainDef.b2ChainDefPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2ChainDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2ChainDef(ptr, freeOnGC);
        }
    }
}
