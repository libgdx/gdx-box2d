package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2SurfaceMaterial;
import com.badlogic.gdx.box2d.structs.b2Filter;

/**
 * Used to create a shape.
 * This is a temporary object used to bundle shape creation parameters. You may use
 * the same shape definition to create multiple shapes.
 * Must be initialized using b2DefaultShapeDef().
 * @ingroup shape
 */
public final class b2ShapeDef extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(64).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ShapeDef(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2ShapeDef(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2ShapeDef() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2ShapeDef.b2ShapeDefPointer asPointer() {
        return new b2ShapeDef.b2ShapeDefPointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2ShapeDef.b2ShapeDefPointer ptr) {
        ptr.setPointer(this);
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
     * The surface material for this shape.
     */
    public b2SurfaceMaterial material() {
        return new b2SurfaceMaterial(getPointer() + (CHandler.IS_64_BIT ? 8 : 4), false);
    }

    /**
     * The surface material for this shape.
     */
    public void material(b2SurfaceMaterial toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 8 : 4), 24, this);
    }

    /**
     * The surface material for this shape.
     */
    public b2SurfaceMaterial getMaterial() {
        return new b2SurfaceMaterial(getBufPtr().duplicate(CHandler.IS_64_BIT ? 8 : 4, 24), true);
    }

    /**
     * The surface material for this shape.
     */
    public void getMaterial(b2SurfaceMaterial toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 8 : 4, 24);
    }

    /**
     * The surface material for this shape.
     */
    public void setMaterial(b2SurfaceMaterial toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 8 : 4, toCopyFrom.getBufPtr(), 0, 24);
    }

    /**
     *  The density, usually in kg/m^2.
     * 	 This is not part of the surface material because this is for the interior, which may have
     * 	 other considerations, such as being hollow. For example a wood barrel may be hollow or full of water.
     */
    public float density() {
        return getBufPtr().getFloat(CHandler.IS_64_BIT ? 32 : 28);
    }

    /**
     *  The density, usually in kg/m^2.
     * 	 This is not part of the surface material because this is for the interior, which may have
     * 	 other considerations, such as being hollow. For example a wood barrel may be hollow or full of water.
     */
    public void density(float density) {
        getBufPtr().setFloat(CHandler.IS_64_BIT ? 32 : 28, density);
    }

    /**
     * Collision filtering data.
     */
    public b2Filter filter() {
        return new b2Filter(getPointer() + (CHandler.IS_64_BIT ? 40 : 32), false);
    }

    /**
     * Collision filtering data.
     */
    public void filter(b2Filter toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 40 : 32), CHandler.IS_COMPILED_ANDROID_X86 ? 20 : 24, this);
    }

    /**
     * Collision filtering data.
     */
    public b2Filter getFilter() {
        return new b2Filter(getBufPtr().duplicate(CHandler.IS_64_BIT ? 40 : 32, CHandler.IS_COMPILED_ANDROID_X86 ? 20 : 24), true);
    }

    /**
     * Collision filtering data.
     */
    public void getFilter(b2Filter toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 40 : 32, CHandler.IS_COMPILED_ANDROID_X86 ? 20 : 24);
    }

    /**
     * Collision filtering data.
     */
    public void setFilter(b2Filter toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 40 : 32, toCopyFrom.getBufPtr(), 0, CHandler.IS_COMPILED_ANDROID_X86 ? 20 : 24);
    }

    /**
     *  A sensor shape generates overlap events but never generates a collision response.
     * 	 Sensors do not have continuous collision. Instead, use a ray or shape cast for those scenarios.
     * 	 Sensors still contribute to the body mass if they have non-zero density.
     * 	 @note Sensor events are disabled by default.
     * 	 @see enableSensorEvents
     */
    public boolean isSensor() {
        return getBufPtr().getBoolean((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 64 : 56);
    }

    /**
     *  A sensor shape generates overlap events but never generates a collision response.
     * 	 Sensors do not have continuous collision. Instead, use a ray or shape cast for those scenarios.
     * 	 Sensors still contribute to the body mass if they have non-zero density.
     * 	 @note Sensor events are disabled by default.
     * 	 @see enableSensorEvents
     */
    public void isSensor(boolean isSensor) {
        getBufPtr().setBoolean((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 64 : 56, isSensor);
    }

    /**
     * Enable sensor events for this shape. This applies to sensors and non-sensors. False by default, even for sensors.
     */
    public boolean enableSensorEvents() {
        return getBufPtr().getBoolean((CHandler.IS_COMPILED_ANDROID_X86) ? 53 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 65 : 57);
    }

    /**
     * Enable sensor events for this shape. This applies to sensors and non-sensors. False by default, even for sensors.
     */
    public void enableSensorEvents(boolean enableSensorEvents) {
        getBufPtr().setBoolean((CHandler.IS_COMPILED_ANDROID_X86) ? 53 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 65 : 57, enableSensorEvents);
    }

    /**
     * Enable contact events for this shape. Only applies to kinematic and dynamic bodies. Ignored for sensors. False by default.
     */
    public boolean enableContactEvents() {
        return getBufPtr().getBoolean((CHandler.IS_COMPILED_ANDROID_X86) ? 54 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 66 : 58);
    }

    /**
     * Enable contact events for this shape. Only applies to kinematic and dynamic bodies. Ignored for sensors. False by default.
     */
    public void enableContactEvents(boolean enableContactEvents) {
        getBufPtr().setBoolean((CHandler.IS_COMPILED_ANDROID_X86) ? 54 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 66 : 58, enableContactEvents);
    }

    /**
     * Enable hit events for this shape. Only applies to kinematic and dynamic bodies. Ignored for sensors. False by default.
     */
    public boolean enableHitEvents() {
        return getBufPtr().getBoolean((CHandler.IS_COMPILED_ANDROID_X86) ? 55 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 67 : 59);
    }

    /**
     * Enable hit events for this shape. Only applies to kinematic and dynamic bodies. Ignored for sensors. False by default.
     */
    public void enableHitEvents(boolean enableHitEvents) {
        getBufPtr().setBoolean((CHandler.IS_COMPILED_ANDROID_X86) ? 55 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 67 : 59, enableHitEvents);
    }

    /**
     *  Enable pre-solve contact events for this shape. Only applies to dynamic bodies. These are expensive
     * 	 and must be carefully handled due to threading. Ignored for sensors.
     */
    public boolean enablePreSolveEvents() {
        return getBufPtr().getBoolean((CHandler.IS_COMPILED_ANDROID_X86) ? 56 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 68 : 60);
    }

    /**
     *  Enable pre-solve contact events for this shape. Only applies to dynamic bodies. These are expensive
     * 	 and must be carefully handled due to threading. Ignored for sensors.
     */
    public void enablePreSolveEvents(boolean enablePreSolveEvents) {
        getBufPtr().setBoolean((CHandler.IS_COMPILED_ANDROID_X86) ? 56 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 68 : 60, enablePreSolveEvents);
    }

    /**
     *  When shapes are created they will scan the environment for collision the next time step. This can significantly slow down
     * 	 static body creation when there are many static shapes.
     * 	 This is flag is ignored for dynamic and kinematic shapes which always invoke contact creation.
     */
    public boolean invokeContactCreation() {
        return getBufPtr().getBoolean((CHandler.IS_COMPILED_ANDROID_X86) ? 57 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 69 : 61);
    }

    /**
     *  When shapes are created they will scan the environment for collision the next time step. This can significantly slow down
     * 	 static body creation when there are many static shapes.
     * 	 This is flag is ignored for dynamic and kinematic shapes which always invoke contact creation.
     */
    public void invokeContactCreation(boolean invokeContactCreation) {
        getBufPtr().setBoolean((CHandler.IS_COMPILED_ANDROID_X86) ? 57 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 69 : 61, invokeContactCreation);
    }

    /**
     * Should the body update the mass properties when this shape is created. Default is true.
     */
    public boolean updateBodyMass() {
        return getBufPtr().getBoolean((CHandler.IS_COMPILED_ANDROID_X86) ? 58 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 70 : 62);
    }

    /**
     * Should the body update the mass properties when this shape is created. Default is true.
     */
    public void updateBodyMass(boolean updateBodyMass) {
        getBufPtr().setBoolean((CHandler.IS_COMPILED_ANDROID_X86) ? 58 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 70 : 62, updateBodyMass);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int internalValue() {
        return getBufPtr().getInt((CHandler.IS_COMPILED_ANDROID_X86) ? 60 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 64 : 72);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void internalValue(int internalValue) {
        getBufPtr().setInt((CHandler.IS_COMPILED_ANDROID_X86) ? 60 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 64 : 72, internalValue);
    }

    public static final class b2ShapeDefPointer extends StackElementPointer<b2ShapeDef> {

        public b2ShapeDefPointer(VoidPointer pointer) {
            super(pointer);
        }

        public b2ShapeDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ShapeDefPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2ShapeDefPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2ShapeDefPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2ShapeDefPointer() {
            this(1, true);
        }

        public b2ShapeDefPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2ShapeDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2ShapeDef(ptr, freeOnGC);
        }
    }
}
