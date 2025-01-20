package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.enums.b2BodyType;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.box2d.structs.b2Rot;
import com.badlogic.gdx.jnigen.runtime.pointer.CSizedIntPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

/**
 * A body definition holds all the data needed to construct a rigid body.
 * You can safely re-use body definitions. Shapes are added to a body after construction.
 * Body definitions are temporary objects used to bundle creation parameters.
 * Must be initialized using b2DefaultBodyDef().
 * @ingroup body
 */
public final class b2BodyDef extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(12).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2BodyDef(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2BodyDef() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2BodyDef.b2BodyDefPointer asPointer() {
        return new b2BodyDef.b2BodyDefPointer(getPointer(), getsGCFreed());
    }

    /**
     * The body type: static, kinematic, or dynamic.
     */
    public b2BodyType type() {
        return b2BodyType.getByIndex((int) getValue(0));
    }

    /**
     * The body type: static, kinematic, or dynamic.
     */
    public void type(b2BodyType type) {
        setValue(type.getIndex(), 0);
    }

    /**
     *  The initial world position of the body. Bodies should be created with the desired position.
     * 	 @note Creating bodies at the origin and then moving them nearly doubles the cost of body creation, especially
     * 	 if the body is moved after shapes have been added.
     */
    public b2Vec2 position() {
        return __position;
    }

    private static final int __position_offset = CHandler.getOffsetForField(__ffi_type, 1);

    private final b2Vec2 __position = new b2Vec2(getPointer() + __position_offset, false);

    /**
     * The initial world rotation of the body. Use b2MakeRot() if you have an angle.
     */
    public b2Rot rotation() {
        return __rotation;
    }

    private static final int __rotation_offset = CHandler.getOffsetForField(__ffi_type, 2);

    private final b2Rot __rotation = new b2Rot(getPointer() + __rotation_offset, false);

    /**
     * The initial linear velocity of the body's origin. Usually in meters per second.
     */
    public b2Vec2 linearVelocity() {
        return __linearVelocity;
    }

    private static final int __linearVelocity_offset = CHandler.getOffsetForField(__ffi_type, 3);

    private final b2Vec2 __linearVelocity = new b2Vec2(getPointer() + __linearVelocity_offset, false);

    /**
     * The initial angular velocity of the body. Radians per second.
     */
    public float angularVelocity() {
        return (float) getValueFloat(4);
    }

    /**
     * The initial angular velocity of the body. Radians per second.
     */
    public void angularVelocity(float angularVelocity) {
        setValue(angularVelocity, 4);
    }

    /**
     *  Linear damping is used to reduce the linear velocity. The damping parameter
     * 	 can be larger than 1 but the damping effect becomes sensitive to the
     * 	 time step when the damping parameter is large.
     * 	 Generally linear damping is undesirable because it makes objects move slowly
     * 	 as if they are floating.
     */
    public float linearDamping() {
        return (float) getValueFloat(5);
    }

    /**
     *  Linear damping is used to reduce the linear velocity. The damping parameter
     * 	 can be larger than 1 but the damping effect becomes sensitive to the
     * 	 time step when the damping parameter is large.
     * 	 Generally linear damping is undesirable because it makes objects move slowly
     * 	 as if they are floating.
     */
    public void linearDamping(float linearDamping) {
        setValue(linearDamping, 5);
    }

    /**
     *  Angular damping is used to reduce the angular velocity. The damping parameter
     * 	 can be larger than 1.0f but the damping effect becomes sensitive to the
     * 	 time step when the damping parameter is large.
     * 	 Angular damping can be use slow down rotating bodies.
     */
    public float angularDamping() {
        return (float) getValueFloat(6);
    }

    /**
     *  Angular damping is used to reduce the angular velocity. The damping parameter
     * 	 can be larger than 1.0f but the damping effect becomes sensitive to the
     * 	 time step when the damping parameter is large.
     * 	 Angular damping can be use slow down rotating bodies.
     */
    public void angularDamping(float angularDamping) {
        setValue(angularDamping, 6);
    }

    /**
     * Scale the gravity applied to this body. Non-dimensional.
     */
    public float gravityScale() {
        return (float) getValueFloat(7);
    }

    /**
     * Scale the gravity applied to this body. Non-dimensional.
     */
    public void gravityScale(float gravityScale) {
        setValue(gravityScale, 7);
    }

    /**
     * Sleep speed threshold, default is 0.05 meters per second
     */
    public float sleepThreshold() {
        return (float) getValueFloat(8);
    }

    /**
     * Sleep speed threshold, default is 0.05 meters per second
     */
    public void sleepThreshold(float sleepThreshold) {
        setValue(sleepThreshold, 8);
    }

    /**
     * Optional body name for debugging. Up to 31 characters (excluding null termination)
     */
    public CSizedIntPointer name() {
        return new CSizedIntPointer(getValue(9), false, "const char");
    }

    /**
     * Optional body name for debugging. Up to 31 characters (excluding null termination)
     */
    public void name(CSizedIntPointer name) {
        setValue(name.getPointer(), 9);
    }

    /**
     * Use this to store application specific body data.
     */
    public VoidPointer userData() {
        return new VoidPointer(getValue(10), false);
    }

    /**
     * Use this to store application specific body data.
     */
    public void userData(VoidPointer userData) {
        setValue(userData.getPointer(), 10);
    }

    /**
     * Set this flag to false if this body should never fall asleep.
     */
    public boolean enableSleep() {
        return getValue(11) != 0;
    }

    /**
     * Set this flag to false if this body should never fall asleep.
     */
    public void enableSleep(boolean enableSleep) {
        setValue(enableSleep, 11);
    }

    /**
     * Is this body initially awake or sleeping?
     */
    public boolean isAwake() {
        return getValue(12) != 0;
    }

    /**
     * Is this body initially awake or sleeping?
     */
    public void isAwake(boolean isAwake) {
        setValue(isAwake, 12);
    }

    /**
     * Should this body be prevented from rotating? Useful for characters.
     */
    public boolean fixedRotation() {
        return getValue(13) != 0;
    }

    /**
     * Should this body be prevented from rotating? Useful for characters.
     */
    public void fixedRotation(boolean fixedRotation) {
        setValue(fixedRotation, 13);
    }

    /**
     *  Treat this body as high speed object that performs continuous collision detection
     * 	 against dynamic and kinematic bodies, but not other bullet bodies.
     * 	 @warning Bullets should be used sparingly. They are not a solution for general dynamic-versus-dynamic
     * 	 continuous collision. They may interfere with joint constraints.
     */
    public boolean isBullet() {
        return getValue(14) != 0;
    }

    /**
     *  Treat this body as high speed object that performs continuous collision detection
     * 	 against dynamic and kinematic bodies, but not other bullet bodies.
     * 	 @warning Bullets should be used sparingly. They are not a solution for general dynamic-versus-dynamic
     * 	 continuous collision. They may interfere with joint constraints.
     */
    public void isBullet(boolean isBullet) {
        setValue(isBullet, 14);
    }

    /**
     * Used to disable a body. A disabled body does not move or collide.
     */
    public boolean isEnabled() {
        return getValue(15) != 0;
    }

    /**
     * Used to disable a body. A disabled body does not move or collide.
     */
    public void isEnabled(boolean isEnabled) {
        setValue(isEnabled, 15);
    }

    /**
     *  This allows this body to bypass rotational speed limits. Should only be used
     * 	 for circular objects, like wheels.
     */
    public boolean allowFastRotation() {
        return getValue(16) != 0;
    }

    /**
     *  This allows this body to bypass rotational speed limits. Should only be used
     * 	 for circular objects, like wheels.
     */
    public void allowFastRotation(boolean allowFastRotation) {
        setValue(allowFastRotation, 16);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int internalValue() {
        return (int) getValue(17);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void internalValue(int internalValue) {
        setValue(internalValue, 17);
    }

    public static final class b2BodyDefPointer extends StackElementPointer<b2BodyDef> {

        public b2BodyDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2BodyDefPointer() {
            this(1, true, true);
        }

        public b2BodyDefPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2BodyDef.b2BodyDefPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2BodyDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2BodyDef(ptr, freeOnGC);
        }
    }
}
