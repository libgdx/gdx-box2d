package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.box2d.structs.b2SurfaceMaterial;
import com.badlogic.gdx.box2d.structs.b2Filter;

/**
 * Used to create a chain of line segments. This is designed to eliminate ghost collisions with some limitations.
 * - chains are one-sided
 * - chains have no mass and should be used on static bodies
 * - chains have a counter-clockwise winding order (normal points right of segment direction)
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

    public b2ChainDef(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
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
        return new b2ChainDef.b2ChainDefPointer(getPointer(), false, 1, this);
    }

    /**
     * Use this to store application specific shape data.
     */
    public VoidPointer userData() {
        return new VoidPointer(getBufPtr().getNativePointer(0), false);
    }

    /**
     * Use this to store application specific shape data.
     */
    public void userData(VoidPointer userData) {
        getBufPtr().setNativePointer(0, userData.getPointer());
    }

    /**
     * An array of at least 4 points. These are cloned and may be temporary.
     */
    public b2Vec2.b2Vec2Pointer points() {
        return new b2Vec2.b2Vec2Pointer(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 4 : 8), false);
    }

    /**
     * An array of at least 4 points. These are cloned and may be temporary.
     */
    public void points(b2Vec2.b2Vec2Pointer points) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 4 : 8, points.getPointer());
    }

    /**
     * The point count, must be 4 or more.
     */
    public int count() {
        return getBufPtr().getInt(CHandler.IS_32_BIT ? 8 : 16);
    }

    /**
     * The point count, must be 4 or more.
     */
    public void count(int count) {
        getBufPtr().setInt(CHandler.IS_32_BIT ? 8 : 16, count);
    }

    /**
     * Surface materials for each segment. These are cloned.
     */
    public b2SurfaceMaterial.b2SurfaceMaterialPointer materials() {
        return new b2SurfaceMaterial.b2SurfaceMaterialPointer(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 12 : 24), false);
    }

    /**
     * Surface materials for each segment. These are cloned.
     */
    public void materials(b2SurfaceMaterial.b2SurfaceMaterialPointer materials) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 12 : 24, materials.getPointer());
    }

    /**
     *  The material count. Must be 1 or count. This allows you to provide one
     * 	 material for all segments or a unique material per segment.
     */
    public int materialCount() {
        return getBufPtr().getInt(CHandler.IS_32_BIT ? 16 : 32);
    }

    /**
     *  The material count. Must be 1 or count. This allows you to provide one
     * 	 material for all segments or a unique material per segment.
     */
    public void materialCount(int materialCount) {
        getBufPtr().setInt(CHandler.IS_32_BIT ? 16 : 32, materialCount);
    }

    /**
     * Contact filtering data.
     */
    public b2Filter filter() {
        return new b2Filter(getPointer() + (CHandler.IS_32_BIT ? 24 : 40), false);
    }

    /**
     * Contact filtering data.
     */
    public void filter(b2Filter toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_32_BIT ? 24 : 40), 24, this);
    }

    /**
     * Contact filtering data.
     */
    public b2Filter getFilter() {
        return new b2Filter(getBufPtr().duplicate(CHandler.IS_32_BIT ? 24 : 40, 24), true);
    }

    /**
     * Contact filtering data.
     */
    public void getFilter(b2Filter toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_32_BIT ? 24 : 40, 24);
    }

    /**
     * Contact filtering data.
     */
    public void setFilter(b2Filter toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_32_BIT ? 24 : 40, toCopyFrom.getBufPtr(), 0, 24);
    }

    /**
     * Indicates a closed chain formed by connecting the first and last points
     */
    public boolean isLoop() {
        return getBufPtr().getBoolean(CHandler.IS_32_BIT ? 48 : 64);
    }

    /**
     * Indicates a closed chain formed by connecting the first and last points
     */
    public void isLoop(boolean isLoop) {
        getBufPtr().setBoolean(CHandler.IS_32_BIT ? 48 : 64, isLoop);
    }

    /**
     * Enable sensors to detect this chain. False by default.
     */
    public boolean enableSensorEvents() {
        return getBufPtr().getBoolean(CHandler.IS_32_BIT ? 49 : 65);
    }

    /**
     * Enable sensors to detect this chain. False by default.
     */
    public void enableSensorEvents(boolean enableSensorEvents) {
        getBufPtr().setBoolean(CHandler.IS_32_BIT ? 49 : 65, enableSensorEvents);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int internalValue() {
        return getBufPtr().getInt(CHandler.IS_32_BIT ? 52 : 68);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void internalValue(int internalValue) {
        getBufPtr().setInt(CHandler.IS_32_BIT ? 52 : 68, internalValue);
    }

    public static final class b2ChainDefPointer extends StackElementPointer<b2ChainDef> {

        public b2ChainDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ChainDefPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2ChainDefPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2ChainDefPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2ChainDefPointer() {
            this(1, true);
        }

        public b2ChainDefPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2ChainDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2ChainDef(ptr, freeOnGC);
        }
    }
}
