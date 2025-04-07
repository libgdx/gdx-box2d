package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.box2d.enums.b2MixingRule;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
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
        __ffi_type = FFITypes.getCTypeInfo(76).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2WorldDef(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
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
        return new b2WorldDef.b2WorldDefPointer(getPointer(), false, this);
    }

    /**
     * Gravity vector. Box2D has no up-vector defined.
     */
    public b2Vec2 gravity() {
        return __gravity;
    }

    private static final int __gravity_offset = 0;

    private final b2Vec2 __gravity = new b2Vec2(getPointer() + __gravity_offset, false);

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
    public float contactPushMaxSpeed() {
        return getBufPtr().getFloat(24);
    }

    /**
     *  This parameter controls how fast overlap is resolved and usually has units of meters per second. This only
     * 	 puts a cap on the resolution speed. The resolution speed is increased by increasing the hertz and/or
     * 	 decreasing the damping ratio.
     */
    public void contactPushMaxSpeed(float contactPushMaxSpeed) {
        getBufPtr().setFloat(24, contactPushMaxSpeed);
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
     * Mixing rule for friction. Default is b2_mixGeometricMean.
     */
    public b2MixingRule frictionMixingRule() {
        return b2MixingRule.getByIndex((int) getBufPtr().getUInt(40));
    }

    /**
     * Mixing rule for friction. Default is b2_mixGeometricMean.
     */
    public void frictionMixingRule(b2MixingRule frictionMixingRule) {
        getBufPtr().setUInt(40, frictionMixingRule.getIndex());
    }

    /**
     * Mixing rule for restitution. Default is b2_mixMaximum.
     */
    public b2MixingRule restitutionMixingRule() {
        return b2MixingRule.getByIndex((int) getBufPtr().getUInt(44));
    }

    /**
     * Mixing rule for restitution. Default is b2_mixMaximum.
     */
    public void restitutionMixingRule(b2MixingRule restitutionMixingRule) {
        getBufPtr().setUInt(44, restitutionMixingRule.getIndex());
    }

    /**
     * Can bodies go to sleep to improve performance
     */
    public boolean enableSleep() {
        return getBufPtr().getBoolean(48);
    }

    /**
     * Can bodies go to sleep to improve performance
     */
    public void enableSleep(boolean enableSleep) {
        getBufPtr().setBoolean(48, enableSleep);
    }

    /**
     * Enable continuous collision
     */
    public boolean enableContinuous() {
        return getBufPtr().getBoolean(49);
    }

    /**
     * Enable continuous collision
     */
    public void enableContinuous(boolean enableContinuous) {
        getBufPtr().setBoolean(49, enableContinuous);
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
        return getBufPtr().getInt(52);
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
        getBufPtr().setInt(52, workerCount);
    }

    /**
     * Function to spawn tasks
     */
    public ClosureObject<b2EnqueueTaskCallback> enqueueTask() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(56), b2EnqueueTaskCallback_Internal::b2EnqueueTaskCallback_downcall);
    }

    /**
     * Function to spawn tasks
     */
    public void enqueueTask(ClosureObject<b2EnqueueTaskCallback> enqueueTask) {
        getBufPtr().setNativePointer(56, enqueueTask.getPointer());
    }

    /**
     * Function to finish a task
     */
    public ClosureObject<b2FinishTaskCallback> finishTask() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 60 : 64), b2FinishTaskCallback_Internal::b2FinishTaskCallback_downcall);
    }

    /**
     * Function to finish a task
     */
    public void finishTask(ClosureObject<b2FinishTaskCallback> finishTask) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 60 : 64, finishTask.getPointer());
    }

    /**
     * User context that is provided to enqueueTask and finishTask
     */
    public VoidPointer userTaskContext() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 64 : 72), false);
    }

    /**
     * User context that is provided to enqueueTask and finishTask
     */
    public void userTaskContext(VoidPointer userTaskContext) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 64 : 72, userTaskContext.getPointer());
    }

    /**
     * User data
     */
    public VoidPointer userData() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_32_BIT ? 68 : 80), false);
    }

    /**
     * User data
     */
    public void userData(VoidPointer userData) {
        getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 68 : 80, userData.getPointer());
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int internalValue() {
        return getBufPtr().getInt(CHandler.IS_32_BIT ? 72 : 88);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void internalValue(int internalValue) {
        getBufPtr().setInt(CHandler.IS_32_BIT ? 72 : 88, internalValue);
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
