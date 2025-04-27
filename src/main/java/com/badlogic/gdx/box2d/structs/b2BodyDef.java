package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.enums.b2BodyType;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.box2d.structs.b2Rot;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.BytePointer;

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

    public b2BodyDef(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
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
        return new b2BodyDef.b2BodyDefPointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2BodyDef.b2BodyDefPointer ptr) {
        ptr.setPointer(this);
    }

    /**
     * The body type: static, kinematic, or dynamic.
     */
    public b2BodyType type() {
        return b2BodyType.getByIndex((int) getBufPtr().getUInt(0));
    }

    /**
     * The body type: static, kinematic, or dynamic.
     */
    public void type(b2BodyType type) {
        getBufPtr().setUInt(0, type.getIndex());
    }

    /**
     *  The initial world position of the body. Bodies should be created with the desired position.
     * 	 @note Creating bodies at the origin and then moving them nearly doubles the cost of body creation, especially
     * 	 if the body is moved after shapes have been added.
     */
    public b2Vec2 position() {
        return new b2Vec2(getPointer() + (4), false);
    }

    /**
     *  The initial world position of the body. Bodies should be created with the desired position.
     * 	 @note Creating bodies at the origin and then moving them nearly doubles the cost of body creation, especially
     * 	 if the body is moved after shapes have been added.
     */
    public void position(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (4), 8, this);
    }

    /**
     *  The initial world position of the body. Bodies should be created with the desired position.
     * 	 @note Creating bodies at the origin and then moving them nearly doubles the cost of body creation, especially
     * 	 if the body is moved after shapes have been added.
     */
    public b2Vec2 getPosition() {
        return new b2Vec2(getBufPtr().duplicate(4, 8), true);
    }

    /**
     *  The initial world position of the body. Bodies should be created with the desired position.
     * 	 @note Creating bodies at the origin and then moving them nearly doubles the cost of body creation, especially
     * 	 if the body is moved after shapes have been added.
     */
    public void getPosition(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 4, 8);
    }

    /**
     *  The initial world position of the body. Bodies should be created with the desired position.
     * 	 @note Creating bodies at the origin and then moving them nearly doubles the cost of body creation, especially
     * 	 if the body is moved after shapes have been added.
     */
    public void setPosition(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(4, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * The initial world rotation of the body. Use b2MakeRot() if you have an angle.
     */
    public b2Rot rotation() {
        return new b2Rot(getPointer() + (12), false);
    }

    /**
     * The initial world rotation of the body. Use b2MakeRot() if you have an angle.
     */
    public void rotation(b2Rot toSetPtr) {
        toSetPtr.setPointer(getPointer() + (12), 8, this);
    }

    /**
     * The initial world rotation of the body. Use b2MakeRot() if you have an angle.
     */
    public b2Rot getRotation() {
        return new b2Rot(getBufPtr().duplicate(12, 8), true);
    }

    /**
     * The initial world rotation of the body. Use b2MakeRot() if you have an angle.
     */
    public void getRotation(b2Rot toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 12, 8);
    }

    /**
     * The initial world rotation of the body. Use b2MakeRot() if you have an angle.
     */
    public void setRotation(b2Rot toCopyFrom) {
        getBufPtr().copyFrom(12, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * The initial linear velocity of the body's origin. Usually in meters per second.
     */
    public b2Vec2 linearVelocity() {
        return new b2Vec2(getPointer() + (20), false);
    }

    /**
     * The initial linear velocity of the body's origin. Usually in meters per second.
     */
    public void linearVelocity(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (20), 8, this);
    }

    /**
     * The initial linear velocity of the body's origin. Usually in meters per second.
     */
    public b2Vec2 getLinearVelocity() {
        return new b2Vec2(getBufPtr().duplicate(20, 8), true);
    }

    /**
     * The initial linear velocity of the body's origin. Usually in meters per second.
     */
    public void getLinearVelocity(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 20, 8);
    }

    /**
     * The initial linear velocity of the body's origin. Usually in meters per second.
     */
    public void setLinearVelocity(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(20, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     * The initial angular velocity of the body. Radians per second.
     */
    public float angularVelocity() {
        return getBufPtr().getFloat(28);
    }

    /**
     * The initial angular velocity of the body. Radians per second.
     */
    public void angularVelocity(float angularVelocity) {
        getBufPtr().setFloat(28, angularVelocity);
    }

    /**
     *  Linear damping is used to reduce the linear velocity. The damping parameter
     * 	 can be larger than 1 but the damping effect becomes sensitive to the
     * 	 time step when the damping parameter is large.
     * 	 Generally linear damping is undesirable because it makes objects move slowly
     * 	 as if they are floating.
     */
    public float linearDamping() {
        return getBufPtr().getFloat(32);
    }

    /**
     *  Linear damping is used to reduce the linear velocity. The damping parameter
     * 	 can be larger than 1 but the damping effect becomes sensitive to the
     * 	 time step when the damping parameter is large.
     * 	 Generally linear damping is undesirable because it makes objects move slowly
     * 	 as if they are floating.
     */
    public void linearDamping(float linearDamping) {
        getBufPtr().setFloat(32, linearDamping);
    }

    /**
     *  Angular damping is used to reduce the angular velocity. The damping parameter
     * 	 can be larger than 1.0f but the damping effect becomes sensitive to the
     * 	 time step when the damping parameter is large.
     * 	 Angular damping can be use slow down rotating bodies.
     */
    public float angularDamping() {
        return getBufPtr().getFloat(36);
    }

    /**
     *  Angular damping is used to reduce the angular velocity. The damping parameter
     * 	 can be larger than 1.0f but the damping effect becomes sensitive to the
     * 	 time step when the damping parameter is large.
     * 	 Angular damping can be use slow down rotating bodies.
     */
    public void angularDamping(float angularDamping) {
        getBufPtr().setFloat(36, angularDamping);
    }

    /**
     * Scale the gravity applied to this body. Non-dimensional.
     */
    public float gravityScale() {
        return getBufPtr().getFloat(40);
    }

    /**
     * Scale the gravity applied to this body. Non-dimensional.
     */
    public void gravityScale(float gravityScale) {
        getBufPtr().setFloat(40, gravityScale);
    }

    /**
     * Sleep speed threshold, default is 0.05 meters per second
     */
    public float sleepThreshold() {
        return getBufPtr().getFloat(44);
    }

    /**
     * Sleep speed threshold, default is 0.05 meters per second
     */
    public void sleepThreshold(float sleepThreshold) {
        getBufPtr().setFloat(44, sleepThreshold);
    }

    /**
     * Optional body name for debugging. Up to 31 characters (excluding null termination)
     */
    public BytePointer name() {
        return new BytePointer(getBufPtr().getNativePointer(48), false);
    }

    /**
     * Optional body name for debugging. Up to 31 characters (excluding null termination)
     */
    public void name(BytePointer name) {
        getBufPtr().setNativePointer(48, name.getPointer());
    }

    /**
     * Use this to store application specific body data.
     */
    public VoidPointer userData() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 56 : 52), false);
    }

    /**
     * Use this to store application specific body data.
     */
    public void userData(VoidPointer userData) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 56 : 52, userData.getPointer());
    }

    /**
     * Set this flag to false if this body should never fall asleep.
     */
    public boolean enableSleep() {
        return getBufPtr().getBoolean(CHandler.IS_64_BIT ? 64 : 56);
    }

    /**
     * Set this flag to false if this body should never fall asleep.
     */
    public void enableSleep(boolean enableSleep) {
        getBufPtr().setBoolean(CHandler.IS_64_BIT ? 64 : 56, enableSleep);
    }

    /**
     * Is this body initially awake or sleeping?
     */
    public boolean isAwake() {
        return getBufPtr().getBoolean(CHandler.IS_64_BIT ? 65 : 57);
    }

    /**
     * Is this body initially awake or sleeping?
     */
    public void isAwake(boolean isAwake) {
        getBufPtr().setBoolean(CHandler.IS_64_BIT ? 65 : 57, isAwake);
    }

    /**
     * Should this body be prevented from rotating? Useful for characters.
     */
    public boolean fixedRotation() {
        return getBufPtr().getBoolean(CHandler.IS_64_BIT ? 66 : 58);
    }

    /**
     * Should this body be prevented from rotating? Useful for characters.
     */
    public void fixedRotation(boolean fixedRotation) {
        getBufPtr().setBoolean(CHandler.IS_64_BIT ? 66 : 58, fixedRotation);
    }

    /**
     *  Treat this body as high speed object that performs continuous collision detection
     * 	 against dynamic and kinematic bodies, but not other bullet bodies.
     * 	 @warning Bullets should be used sparingly. They are not a solution for general dynamic-versus-dynamic
     * 	 continuous collision. They may interfere with joint constraints.
     */
    public boolean isBullet() {
        return getBufPtr().getBoolean(CHandler.IS_64_BIT ? 67 : 59);
    }

    /**
     *  Treat this body as high speed object that performs continuous collision detection
     * 	 against dynamic and kinematic bodies, but not other bullet bodies.
     * 	 @warning Bullets should be used sparingly. They are not a solution for general dynamic-versus-dynamic
     * 	 continuous collision. They may interfere with joint constraints.
     */
    public void isBullet(boolean isBullet) {
        getBufPtr().setBoolean(CHandler.IS_64_BIT ? 67 : 59, isBullet);
    }

    /**
     * Used to disable a body. A disabled body does not move or collide.
     */
    public boolean isEnabled() {
        return getBufPtr().getBoolean(CHandler.IS_64_BIT ? 68 : 60);
    }

    /**
     * Used to disable a body. A disabled body does not move or collide.
     */
    public void isEnabled(boolean isEnabled) {
        getBufPtr().setBoolean(CHandler.IS_64_BIT ? 68 : 60, isEnabled);
    }

    /**
     *  This allows this body to bypass rotational speed limits. Should only be used
     * 	 for circular objects, like wheels.
     */
    public boolean allowFastRotation() {
        return getBufPtr().getBoolean(CHandler.IS_64_BIT ? 69 : 61);
    }

    /**
     *  This allows this body to bypass rotational speed limits. Should only be used
     * 	 for circular objects, like wheels.
     */
    public void allowFastRotation(boolean allowFastRotation) {
        getBufPtr().setBoolean(CHandler.IS_64_BIT ? 69 : 61, allowFastRotation);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int internalValue() {
        return getBufPtr().getInt(CHandler.IS_64_BIT ? 72 : 64);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void internalValue(int internalValue) {
        getBufPtr().setInt(CHandler.IS_64_BIT ? 72 : 64, internalValue);
    }

    public static final class b2BodyDefPointer extends StackElementPointer<b2BodyDef> {

        public b2BodyDefPointer(VoidPointer pointer) {
            super(pointer);
        }

        public b2BodyDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2BodyDefPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2BodyDefPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2BodyDefPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2BodyDefPointer() {
            this(1, true);
        }

        public b2BodyDefPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2BodyDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2BodyDef(ptr, freeOnGC);
        }
    }
}
