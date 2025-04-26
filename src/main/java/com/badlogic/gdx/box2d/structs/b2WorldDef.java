package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import com.badlogic.gdx.box2d.Box2d.b2FrictionCallback;
import com.badlogic.gdx.box2d.Box2d_Internal.b2FrictionCallback_Internal;
import com.badlogic.gdx.box2d.Box2d.b2RestitutionCallback;
import com.badlogic.gdx.box2d.Box2d_Internal.b2RestitutionCallback_Internal;
import com.badlogic.gdx.box2d.Box2d.b2EnqueueTaskCallback;
import com.badlogic.gdx.box2d.Box2d_Internal.b2EnqueueTaskCallback_Internal;
import com.badlogic.gdx.box2d.Box2d.b2FinishTaskCallback;
import com.badlogic.gdx.box2d.Box2d_Internal.b2FinishTaskCallback_Internal;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

/**
 * World definition used to create a simulation world.
 * Must be initialized using b2DefaultWorldDef().
 * @ingroup world
 */
public final class b2WorldDef extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(81).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2WorldDef(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2WorldDef(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2WorldDef() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2WorldDef.b2WorldDefPointer asPointer() {
        return new b2WorldDef.b2WorldDefPointer(getPointer(), false, 1, this);
    }

    /**
     * Gravity vector. Box2D has no up-vector defined.
     */
    public b2Vec2 gravity() {
        return new b2Vec2(getPointer(), false);
    }

    /**
     * Gravity vector. Box2D has no up-vector defined.
     */
    public void gravity(b2Vec2 toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    /**
     * Gravity vector. Box2D has no up-vector defined.
     */
    public b2Vec2 getGravity() {
        return new b2Vec2(getBufPtr().duplicate(0, 8), true);
    }

    /**
     * Gravity vector. Box2D has no up-vector defined.
     */
    public void getGravity(b2Vec2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    /**
     * Gravity vector. Box2D has no up-vector defined.
     */
    public void setGravity(b2Vec2 toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    /**
     *  Restitution speed threshold, usually in m/s. Collisions above this
     * 	 speed have restitution applied (will bounce).
     */
    public float restitutionThreshold() {
        return getBufPtr().getFloat(8);
    }

    /**
     *  Restitution speed threshold, usually in m/s. Collisions above this
     * 	 speed have restitution applied (will bounce).
     */
    public void restitutionThreshold(float restitutionThreshold) {
        getBufPtr().setFloat(8, restitutionThreshold);
    }

    /**
     * Threshold speed for hit events. Usually meters per second.
     */
    public float hitEventThreshold() {
        return getBufPtr().getFloat(12);
    }

    /**
     * Threshold speed for hit events. Usually meters per second.
     */
    public void hitEventThreshold(float hitEventThreshold) {
        getBufPtr().setFloat(12, hitEventThreshold);
    }

    /**
     * Contact stiffness. Cycles per second. Increasing this increases the speed of overlap recovery, but can introduce jitter.
     */
    public float contactHertz() {
        return getBufPtr().getFloat(16);
    }

    /**
     * Contact stiffness. Cycles per second. Increasing this increases the speed of overlap recovery, but can introduce jitter.
     */
    public void contactHertz(float contactHertz) {
        getBufPtr().setFloat(16, contactHertz);
    }

    /**
     *  Contact bounciness. Non-dimensional. You can speed up overlap recovery by decreasing this with
     * 	 the trade-off that overlap resolution becomes more energetic.
     */
    public float contactDampingRatio() {
        return getBufPtr().getFloat(20);
    }

    /**
     *  Contact bounciness. Non-dimensional. You can speed up overlap recovery by decreasing this with
     * 	 the trade-off that overlap resolution becomes more energetic.
     */
    public void contactDampingRatio(float contactDampingRatio) {
        getBufPtr().setFloat(20, contactDampingRatio);
    }

    /**
     *  This parameter controls how fast overlap is resolved and usually has units of meters per second. This only
     * 	 puts a cap on the resolution speed. The resolution speed is increased by increasing the hertz and/or
     * 	 decreasing the damping ratio.
     */
    public float maxContactPushSpeed() {
        return getBufPtr().getFloat(24);
    }

    /**
     *  This parameter controls how fast overlap is resolved and usually has units of meters per second. This only
     * 	 puts a cap on the resolution speed. The resolution speed is increased by increasing the hertz and/or
     * 	 decreasing the damping ratio.
     */
    public void maxContactPushSpeed(float maxContactPushSpeed) {
        getBufPtr().setFloat(24, maxContactPushSpeed);
    }

    /**
     * Joint stiffness. Cycles per second.
     */
    public float jointHertz() {
        return getBufPtr().getFloat(28);
    }

    /**
     * Joint stiffness. Cycles per second.
     */
    public void jointHertz(float jointHertz) {
        getBufPtr().setFloat(28, jointHertz);
    }

    /**
     * Joint bounciness. Non-dimensional.
     */
    public float jointDampingRatio() {
        return getBufPtr().getFloat(32);
    }

    /**
     * Joint bounciness. Non-dimensional.
     */
    public void jointDampingRatio(float jointDampingRatio) {
        getBufPtr().setFloat(32, jointDampingRatio);
    }

    /**
     * Maximum linear speed. Usually meters per second.
     */
    public float maximumLinearSpeed() {
        return getBufPtr().getFloat(36);
    }

    /**
     * Maximum linear speed. Usually meters per second.
     */
    public void maximumLinearSpeed(float maximumLinearSpeed) {
        getBufPtr().setFloat(36, maximumLinearSpeed);
    }

    /**
     * Optional mixing callback for friction. The default uses sqrt(frictionA * frictionB).
     */
    public ClosureObject<b2FrictionCallback> frictionCallback() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(40), b2FrictionCallback_Internal::b2FrictionCallback_downcall);
    }

    /**
     * Optional mixing callback for friction. The default uses sqrt(frictionA * frictionB).
     */
    public void frictionCallback(ClosureObject<b2FrictionCallback> frictionCallback) {
        getBufPtr().setNativePointer(40, frictionCallback.getPointer());
    }

    /**
     * Optional mixing callback for restitution. The default uses max(restitutionA, restitutionB).
     */
    public ClosureObject<b2RestitutionCallback> restitutionCallback() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 44 : 48), b2RestitutionCallback_Internal::b2RestitutionCallback_downcall);
    }

    /**
     * Optional mixing callback for restitution. The default uses max(restitutionA, restitutionB).
     */
    public void restitutionCallback(ClosureObject<b2RestitutionCallback> restitutionCallback) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 44 : 48, restitutionCallback.getPointer());
    }

    /**
     * Can bodies go to sleep to improve performance
     */
    public boolean enableSleep() {
        return getBufPtr().getBoolean(CHandler.IS_32_BIT ? 48 : 56);
    }

    /**
     * Can bodies go to sleep to improve performance
     */
    public void enableSleep(boolean enableSleep) {
        getBufPtr().setBoolean(CHandler.IS_32_BIT ? 48 : 56, enableSleep);
    }

    /**
     * Enable continuous collision
     */
    public boolean enableContinuous() {
        return getBufPtr().getBoolean(CHandler.IS_32_BIT ? 49 : 57);
    }

    /**
     * Enable continuous collision
     */
    public void enableContinuous(boolean enableContinuous) {
        getBufPtr().setBoolean(CHandler.IS_32_BIT ? 49 : 57, enableContinuous);
    }

    /**
     *  Number of workers to use with the provided task system. Box2D performs best when using only
     * 	 performance cores and accessing a single L2 cache. Efficiency cores and hyper-threading provide
     * 	 little benefit and may even harm performance.
     * 	 @note Box2D does not create threads. This is the number of threads your applications has created
     * 	 that you are allocating to b2World_Step.
     * 	 @warning Do not modify the default value unless you are also providing a task system and providing
     * 	 task callbacks (enqueueTask and finishTask).
     */
    public int workerCount() {
        return getBufPtr().getInt(CHandler.IS_32_BIT ? 52 : 60);
    }

    /**
     *  Number of workers to use with the provided task system. Box2D performs best when using only
     * 	 performance cores and accessing a single L2 cache. Efficiency cores and hyper-threading provide
     * 	 little benefit and may even harm performance.
     * 	 @note Box2D does not create threads. This is the number of threads your applications has created
     * 	 that you are allocating to b2World_Step.
     * 	 @warning Do not modify the default value unless you are also providing a task system and providing
     * 	 task callbacks (enqueueTask and finishTask).
     */
    public void workerCount(int workerCount) {
        getBufPtr().setInt(CHandler.IS_32_BIT ? 52 : 60, workerCount);
    }

    /**
     * Function to spawn tasks
     */
    public ClosureObject<b2EnqueueTaskCallback> enqueueTask() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 56 : 64), b2EnqueueTaskCallback_Internal::b2EnqueueTaskCallback_downcall);
    }

    /**
     * Function to spawn tasks
     */
    public void enqueueTask(ClosureObject<b2EnqueueTaskCallback> enqueueTask) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 56 : 64, enqueueTask.getPointer());
    }

    /**
     * Function to finish a task
     */
    public ClosureObject<b2FinishTaskCallback> finishTask() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 60 : 72), b2FinishTaskCallback_Internal::b2FinishTaskCallback_downcall);
    }

    /**
     * Function to finish a task
     */
    public void finishTask(ClosureObject<b2FinishTaskCallback> finishTask) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 60 : 72, finishTask.getPointer());
    }

    /**
     * User context that is provided to enqueueTask and finishTask
     */
    public VoidPointer userTaskContext() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 64 : 80), false);
    }

    /**
     * User context that is provided to enqueueTask and finishTask
     */
    public void userTaskContext(VoidPointer userTaskContext) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 64 : 80, userTaskContext.getPointer());
    }

    /**
     * User data
     */
    public VoidPointer userData() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 68 : 88), false);
    }

    /**
     * User data
     */
    public void userData(VoidPointer userData) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 68 : 88, userData.getPointer());
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int internalValue() {
        return getBufPtr().getInt(CHandler.IS_32_BIT ? 72 : 96);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void internalValue(int internalValue) {
        getBufPtr().setInt(CHandler.IS_32_BIT ? 72 : 96, internalValue);
    }

    public static final class b2WorldDefPointer extends StackElementPointer<b2WorldDef> {

        public b2WorldDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2WorldDefPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2WorldDefPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2WorldDefPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2WorldDefPointer() {
            this(1, true);
        }

        public b2WorldDefPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2WorldDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2WorldDef(ptr, freeOnGC);
        }
    }
}
