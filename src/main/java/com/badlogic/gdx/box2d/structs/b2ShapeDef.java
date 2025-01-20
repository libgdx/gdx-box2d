package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
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
        return new b2ShapeDef.b2ShapeDefPointer(getPointer(), getsGCFreed());
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
     * The Coulomb (dry) friction coefficient, usually in the range [0,1].
     */
    public float friction() {
        return (float) getValueFloat(1);
    }

    /**
     * The Coulomb (dry) friction coefficient, usually in the range [0,1].
     */
    public void friction(float friction) {
        setValue(friction, 1);
    }

    /**
     * The restitution (bounce) usually in the range [0,1].
     */
    public float restitution() {
        return (float) getValueFloat(2);
    }

    /**
     * The restitution (bounce) usually in the range [0,1].
     */
    public void restitution(float restitution) {
        setValue(restitution, 2);
    }

    /**
     * The rolling resistance usually in the range [0,1].
     */
    public float rollingResistance() {
        return (float) getValueFloat(3);
    }

    /**
     * The rolling resistance usually in the range [0,1].
     */
    public void rollingResistance(float rollingResistance) {
        setValue(rollingResistance, 3);
    }

    /**
     * The density, usually in kg/m^2.
     */
    public float density() {
        return (float) getValueFloat(4);
    }

    /**
     * The density, usually in kg/m^2.
     */
    public void density(float density) {
        setValue(density, 4);
    }

    /**
     * Collision filtering data.
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
     *  A sensor shape generates overlap events but never generates a collision response.
     * 	 Sensors do not collide with other sensors and do not have continuous collision.
     * 	 Instead, use a ray or shape cast for those scenarios.
     */
    public boolean isSensor() {
        return getValue(7) != 0;
    }

    /**
     *  A sensor shape generates overlap events but never generates a collision response.
     * 	 Sensors do not collide with other sensors and do not have continuous collision.
     * 	 Instead, use a ray or shape cast for those scenarios.
     */
    public void isSensor(boolean isSensor) {
        setValue(isSensor, 7);
    }

    /**
     * Enable contact events for this shape. Only applies to kinematic and dynamic bodies. Ignored for sensors.
     */
    public boolean enableContactEvents() {
        return getValue(8) != 0;
    }

    /**
     * Enable contact events for this shape. Only applies to kinematic and dynamic bodies. Ignored for sensors.
     */
    public void enableContactEvents(boolean enableContactEvents) {
        setValue(enableContactEvents, 8);
    }

    /**
     * Enable hit events for this shape. Only applies to kinematic and dynamic bodies. Ignored for sensors.
     */
    public boolean enableHitEvents() {
        return getValue(9) != 0;
    }

    /**
     * Enable hit events for this shape. Only applies to kinematic and dynamic bodies. Ignored for sensors.
     */
    public void enableHitEvents(boolean enableHitEvents) {
        setValue(enableHitEvents, 9);
    }

    /**
     *  Enable pre-solve contact events for this shape. Only applies to dynamic bodies. These are expensive
     * 	 and must be carefully handled due to threading. Ignored for sensors.
     */
    public boolean enablePreSolveEvents() {
        return getValue(10) != 0;
    }

    /**
     *  Enable pre-solve contact events for this shape. Only applies to dynamic bodies. These are expensive
     * 	 and must be carefully handled due to threading. Ignored for sensors.
     */
    public void enablePreSolveEvents(boolean enablePreSolveEvents) {
        setValue(enablePreSolveEvents, 10);
    }

    /**
     *  Normally shapes on static bodies don't invoke contact creation when they are added to the world. This overrides
     * 	 that behavior and causes contact creation. This significantly slows down static body creation which can be important
     * 	 when there are many static shapes.
     * 	 This is implicitly always true for sensors, dynamic bodies, and kinematic bodies.
     */
    public boolean invokeContactCreation() {
        return getValue(11) != 0;
    }

    /**
     *  Normally shapes on static bodies don't invoke contact creation when they are added to the world. This overrides
     * 	 that behavior and causes contact creation. This significantly slows down static body creation which can be important
     * 	 when there are many static shapes.
     * 	 This is implicitly always true for sensors, dynamic bodies, and kinematic bodies.
     */
    public void invokeContactCreation(boolean invokeContactCreation) {
        setValue(invokeContactCreation, 11);
    }

    /**
     * Should the body update the mass properties when this shape is created. Default is true.
     */
    public boolean updateBodyMass() {
        return getValue(12) != 0;
    }

    /**
     * Should the body update the mass properties when this shape is created. Default is true.
     */
    public void updateBodyMass(boolean updateBodyMass) {
        setValue(updateBodyMass, 12);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int internalValue() {
        return (int) getValue(13);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void internalValue(int internalValue) {
        setValue(internalValue, 13);
    }

    public static final class b2ShapeDefPointer extends StackElementPointer<b2ShapeDef> {

        public b2ShapeDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ShapeDefPointer() {
            this(1, true, true);
        }

        public b2ShapeDefPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2ShapeDef.b2ShapeDefPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2ShapeDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2ShapeDef(ptr, freeOnGC);
        }
    }
}
