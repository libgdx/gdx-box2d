package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
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
        __ffi_type = FFITypes.getCTypeInfo(60).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ShapeDef(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
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
        return new b2ShapeDef.b2ShapeDefPointer(getPointer(), false, this);
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
     * The Coulomb (dry) friction coefficient, usually in the range [0,1].
     */
    public float friction() {
        return getBufPtr().getFloat(CHandler.IS_32_BIT ? 4 : 8);
    }

    /**
     * The Coulomb (dry) friction coefficient, usually in the range [0,1].
     */
    public void friction(float friction) {
        getBufPtr().setFloat(CHandler.IS_32_BIT ? 4 : 8, friction);
    }

    /**
     * The restitution (bounce) usually in the range [0,1].
     */
    public float restitution() {
        return getBufPtr().getFloat(CHandler.IS_32_BIT ? 8 : 12);
    }

    /**
     * The restitution (bounce) usually in the range [0,1].
     */
    public void restitution(float restitution) {
        getBufPtr().setFloat(CHandler.IS_32_BIT ? 8 : 12, restitution);
    }

    /**
     * The rolling resistance usually in the range [0,1].
     */
    public float rollingResistance() {
        return getBufPtr().getFloat(CHandler.IS_32_BIT ? 12 : 16);
    }

    /**
     * The rolling resistance usually in the range [0,1].
     */
    public void rollingResistance(float rollingResistance) {
        getBufPtr().setFloat(CHandler.IS_32_BIT ? 12 : 16, rollingResistance);
    }

    /**
     * The density, usually in kg/m^2.
     */
    public float density() {
        return getBufPtr().getFloat(CHandler.IS_32_BIT ? 16 : 20);
    }

    /**
     * The density, usually in kg/m^2.
     */
    public void density(float density) {
        getBufPtr().setFloat(CHandler.IS_32_BIT ? 16 : 20, density);
    }

    /**
     * Collision filtering data.
     */
    public b2Filter filter() {
        return __filter;
    }

    private static final int __filter_offset = 24;

    private final b2Filter __filter = new b2Filter(getPointer() + __filter_offset, false);

    /**
     * Custom debug draw color.
     */
    public long customColor() {
        return getBufPtr().getUInt(48);
    }

    /**
     * Custom debug draw color.
     */
    public void customColor(long customColor) {
        getBufPtr().setUInt(48, customColor);
    }

    /**
     *  A sensor shape generates overlap events but never generates a collision response.
     * 	 Sensors do not collide with other sensors and do not have continuous collision.
     * 	 Instead, use a ray or shape cast for those scenarios.
     */
    public boolean isSensor() {
        return getBufPtr().getBoolean(52);
    }

    /**
     *  A sensor shape generates overlap events but never generates a collision response.
     * 	 Sensors do not collide with other sensors and do not have continuous collision.
     * 	 Instead, use a ray or shape cast for those scenarios.
     */
    public void isSensor(boolean isSensor) {
        getBufPtr().setBoolean(52, isSensor);
    }

    /**
     * Enable contact events for this shape. Only applies to kinematic and dynamic bodies. Ignored for sensors.
     */
    public boolean enableContactEvents() {
        return getBufPtr().getBoolean(53);
    }

    /**
     * Enable contact events for this shape. Only applies to kinematic and dynamic bodies. Ignored for sensors.
     */
    public void enableContactEvents(boolean enableContactEvents) {
        getBufPtr().setBoolean(53, enableContactEvents);
    }

    /**
     * Enable hit events for this shape. Only applies to kinematic and dynamic bodies. Ignored for sensors.
     */
    public boolean enableHitEvents() {
        return getBufPtr().getBoolean(54);
    }

    /**
     * Enable hit events for this shape. Only applies to kinematic and dynamic bodies. Ignored for sensors.
     */
    public void enableHitEvents(boolean enableHitEvents) {
        getBufPtr().setBoolean(54, enableHitEvents);
    }

    /**
     *  Enable pre-solve contact events for this shape. Only applies to dynamic bodies. These are expensive
     * 	 and must be carefully handled due to threading. Ignored for sensors.
     */
    public boolean enablePreSolveEvents() {
        return getBufPtr().getBoolean(55);
    }

    /**
     *  Enable pre-solve contact events for this shape. Only applies to dynamic bodies. These are expensive
     * 	 and must be carefully handled due to threading. Ignored for sensors.
     */
    public void enablePreSolveEvents(boolean enablePreSolveEvents) {
        getBufPtr().setBoolean(55, enablePreSolveEvents);
    }

    /**
     *  Normally shapes on static bodies don't invoke contact creation when they are added to the world. This overrides
     * 	 that behavior and causes contact creation. This significantly slows down static body creation which can be important
     * 	 when there are many static shapes.
     * 	 This is implicitly always true for sensors, dynamic bodies, and kinematic bodies.
     */
    public boolean invokeContactCreation() {
        return getBufPtr().getBoolean(56);
    }

    /**
     *  Normally shapes on static bodies don't invoke contact creation when they are added to the world. This overrides
     * 	 that behavior and causes contact creation. This significantly slows down static body creation which can be important
     * 	 when there are many static shapes.
     * 	 This is implicitly always true for sensors, dynamic bodies, and kinematic bodies.
     */
    public void invokeContactCreation(boolean invokeContactCreation) {
        getBufPtr().setBoolean(56, invokeContactCreation);
    }

    /**
     * Should the body update the mass properties when this shape is created. Default is true.
     */
    public boolean updateBodyMass() {
        return getBufPtr().getBoolean(57);
    }

    /**
     * Should the body update the mass properties when this shape is created. Default is true.
     */
    public void updateBodyMass(boolean updateBodyMass) {
        getBufPtr().setBoolean(57, updateBodyMass);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int internalValue() {
        return getBufPtr().getInt(60);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void internalValue(int internalValue) {
        getBufPtr().setInt(60, internalValue);
    }

    public static final class b2ShapeDefPointer extends StackElementPointer<b2ShapeDef> {

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
