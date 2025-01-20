package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
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
        return new b2WorldDef.b2WorldDefPointer(getPointer(), getsGCFreed());
    }

    /**
     * Gravity vector. Box2D has no up-vector defined.
     */
    public b2Vec2 gravity() {
        return __gravity;
    }

    private static final int __gravity_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __gravity = new b2Vec2(getPointer() + __gravity_offset, false);

    /**
     *  Restitution speed threshold, usually in m/s. Collisions above this
     * 	 speed have restitution applied (will bounce).
     */
    public float restitutionThreshold() {
        return (float) getValueFloat(1);
    }

    /**
     *  Restitution speed threshold, usually in m/s. Collisions above this
     * 	 speed have restitution applied (will bounce).
     */
    public void restitutionThreshold(float restitutionThreshold) {
        setValue(restitutionThreshold, 1);
    }

    /**
     * Threshold speed for hit events. Usually meters per second.
     */
    public float hitEventThreshold() {
        return (float) getValueFloat(2);
    }

    /**
     * Threshold speed for hit events. Usually meters per second.
     */
    public void hitEventThreshold(float hitEventThreshold) {
        setValue(hitEventThreshold, 2);
    }

    /**
     * Contact stiffness. Cycles per second. Increasing this increases the speed of overlap recovery, but can introduce jitter.
     */
    public float contactHertz() {
        return (float) getValueFloat(3);
    }

    /**
     * Contact stiffness. Cycles per second. Increasing this increases the speed of overlap recovery, but can introduce jitter.
     */
    public void contactHertz(float contactHertz) {
        setValue(contactHertz, 3);
    }

    /**
     *  Contact bounciness. Non-dimensional. You can speed up overlap recovery by decreasing this with
     * 	 the trade-off that overlap resolution becomes more energetic.
     */
    public float contactDampingRatio() {
        return (float) getValueFloat(4);
    }

    /**
     *  Contact bounciness. Non-dimensional. You can speed up overlap recovery by decreasing this with
     * 	 the trade-off that overlap resolution becomes more energetic.
     */
    public void contactDampingRatio(float contactDampingRatio) {
        setValue(contactDampingRatio, 4);
    }

    /**
     *  This parameter controls how fast overlap is resolved and usually has units of meters per second. This only
     * 	 puts a cap on the resolution speed. The resolution speed is increased by increasing the hertz and/or
     * 	 decreasing the damping ratio.
     */
    public float contactPushMaxSpeed() {
        return (float) getValueFloat(5);
    }

    /**
     *  This parameter controls how fast overlap is resolved and usually has units of meters per second. This only
     * 	 puts a cap on the resolution speed. The resolution speed is increased by increasing the hertz and/or
     * 	 decreasing the damping ratio.
     */
    public void contactPushMaxSpeed(float contactPushMaxSpeed) {
        setValue(contactPushMaxSpeed, 5);
    }

    /**
     * Joint stiffness. Cycles per second.
     */
    public float jointHertz() {
        return (float) getValueFloat(6);
    }

    /**
     * Joint stiffness. Cycles per second.
     */
    public void jointHertz(float jointHertz) {
        setValue(jointHertz, 6);
    }

    /**
     * Joint bounciness. Non-dimensional.
     */
    public float jointDampingRatio() {
        return (float) getValueFloat(7);
    }

    /**
     * Joint bounciness. Non-dimensional.
     */
    public void jointDampingRatio(float jointDampingRatio) {
        setValue(jointDampingRatio, 7);
    }

    /**
     * Maximum linear speed. Usually meters per second.
     */
    public float maximumLinearSpeed() {
        return (float) getValueFloat(8);
    }

    /**
     * Maximum linear speed. Usually meters per second.
     */
    public void maximumLinearSpeed(float maximumLinearSpeed) {
        setValue(maximumLinearSpeed, 8);
    }

    /**
     * Mixing rule for friction. Default is b2_mixGeometricMean.
     */
    public b2MixingRule frictionMixingRule() {
        return b2MixingRule.getByIndex((int) getValue(9));
    }

    /**
     * Mixing rule for friction. Default is b2_mixGeometricMean.
     */
    public void frictionMixingRule(b2MixingRule frictionMixingRule) {
        setValue(frictionMixingRule.getIndex(), 9);
    }

    /**
     * Mixing rule for restitution. Default is b2_mixMaximum.
     */
    public b2MixingRule restitutionMixingRule() {
        return b2MixingRule.getByIndex((int) getValue(10));
    }

    /**
     * Mixing rule for restitution. Default is b2_mixMaximum.
     */
    public void restitutionMixingRule(b2MixingRule restitutionMixingRule) {
        setValue(restitutionMixingRule.getIndex(), 10);
    }

    /**
     * Can bodies go to sleep to improve performance
     */
    public boolean enableSleep() {
        return getValue(11) != 0;
    }

    /**
     * Can bodies go to sleep to improve performance
     */
    public void enableSleep(boolean enableSleep) {
        setValue(enableSleep, 11);
    }

    /**
     * Enable continuous collision
     */
    public boolean enableContinuous() {
        return getValue(12) != 0;
    }

    /**
     * Enable continuous collision
     */
    public void enableContinuous(boolean enableContinuous) {
        setValue(enableContinuous, 12);
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
        return (int) getValue(13);
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
        setValue(workerCount, 13);
    }

    /**
     * Function to spawn tasks
     */
    public ClosureObject<b2EnqueueTaskCallback> enqueueTask() {
        return CHandler.getClosureObject(getValue(14), b2EnqueueTaskCallback_Internal::b2EnqueueTaskCallback_downcall);
    }

    /**
     * Function to spawn tasks
     */
    public void enqueueTask(ClosureObject<b2EnqueueTaskCallback> enqueueTask) {
        setValue(enqueueTask.getPointer(), 14);
    }

    /**
     * Function to finish a task
     */
    public ClosureObject<b2FinishTaskCallback> finishTask() {
        return CHandler.getClosureObject(getValue(15), b2FinishTaskCallback_Internal::b2FinishTaskCallback_downcall);
    }

    /**
     * Function to finish a task
     */
    public void finishTask(ClosureObject<b2FinishTaskCallback> finishTask) {
        setValue(finishTask.getPointer(), 15);
    }

    /**
     * User context that is provided to enqueueTask and finishTask
     */
    public VoidPointer userTaskContext() {
        return new VoidPointer(getValue(16), false);
    }

    /**
     * User context that is provided to enqueueTask and finishTask
     */
    public void userTaskContext(VoidPointer userTaskContext) {
        setValue(userTaskContext.getPointer(), 16);
    }

    /**
     * User data
     */
    public VoidPointer userData() {
        return new VoidPointer(getValue(17), false);
    }

    /**
     * User data
     */
    public void userData(VoidPointer userData) {
        setValue(userData.getPointer(), 17);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int internalValue() {
        return (int) getValue(18);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void internalValue(int internalValue) {
        setValue(internalValue, 18);
    }

    public static final class b2WorldDefPointer extends StackElementPointer<b2WorldDef> {

        public b2WorldDefPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2WorldDefPointer() {
            this(1, true, true);
        }

        public b2WorldDefPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2WorldDef.b2WorldDefPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2WorldDef createStackElement(long ptr, boolean freeOnGC) {
            return new b2WorldDef(ptr, freeOnGC);
        }
    }
}
