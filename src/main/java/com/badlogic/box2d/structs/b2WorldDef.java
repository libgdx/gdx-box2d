package com.badlogic.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.box2d.FFITypes;
import com.badlogic.box2d.structs.b2Vec2;
import com.badlogic.box2d.enums.b2MixingRule;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import com.badlogic.box2d.Box2d.b2EnqueueTaskCallback;
import com.badlogic.box2d.Box2d.b2FinishTaskCallback;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public final class b2WorldDef extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(78).getFfiType();
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

    public b2Vec2 gravity() {
        return __gravity;
    }

    private static final int __gravity_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __gravity = new b2Vec2(getPointer() + __gravity_offset, false);

    public float restitutionThreshold() {
        return (float) getValueFloat(0);
    }

    public void restitutionThreshold(float restitutionThreshold) {
        setValue(restitutionThreshold, 0);
    }

    public float contactPushSpeed() {
        return (float) getValueFloat(1);
    }

    public void contactPushSpeed(float contactPushSpeed) {
        setValue(contactPushSpeed, 1);
    }

    public float hitEventThreshold() {
        return (float) getValueFloat(2);
    }

    public void hitEventThreshold(float hitEventThreshold) {
        setValue(hitEventThreshold, 2);
    }

    public float contactHertz() {
        return (float) getValueFloat(3);
    }

    public void contactHertz(float contactHertz) {
        setValue(contactHertz, 3);
    }

    public float contactDampingRatio() {
        return (float) getValueFloat(4);
    }

    public void contactDampingRatio(float contactDampingRatio) {
        setValue(contactDampingRatio, 4);
    }

    public float jointHertz() {
        return (float) getValueFloat(5);
    }

    public void jointHertz(float jointHertz) {
        setValue(jointHertz, 5);
    }

    public float jointDampingRatio() {
        return (float) getValueFloat(6);
    }

    public void jointDampingRatio(float jointDampingRatio) {
        setValue(jointDampingRatio, 6);
    }

    public float maximumLinearSpeed() {
        return (float) getValueFloat(7);
    }

    public void maximumLinearSpeed(float maximumLinearSpeed) {
        setValue(maximumLinearSpeed, 7);
    }

    public b2MixingRule frictionMixingRule() {
        return b2MixingRule.getByIndex((int) getValue(8));
    }

    public void frictionMixingRule(b2MixingRule frictionMixingRule) {
        setValue(frictionMixingRule.getIndex(), 8);
    }

    public b2MixingRule restitutionMixingRule() {
        return b2MixingRule.getByIndex((int) getValue(9));
    }

    public void restitutionMixingRule(b2MixingRule restitutionMixingRule) {
        setValue(restitutionMixingRule.getIndex(), 9);
    }

    public boolean enableSleep() {
        return getValue(10) != 0;
    }

    public void enableSleep(boolean enableSleep) {
        setValue(enableSleep, 10);
    }

    public boolean enableContinuous() {
        return getValue(11) != 0;
    }

    public void enableContinuous(boolean enableContinuous) {
        setValue(enableContinuous, 11);
    }

    public int workerCount() {
        return (int) getValue(12);
    }

    public void workerCount(int workerCount) {
        setValue(workerCount, 12);
    }

    public ClosureObject<b2EnqueueTaskCallback> enqueueTask() {
        return CHandler.getClosureObject(getValue(13));
    }

    public void enqueueTask(ClosureObject<b2EnqueueTaskCallback> enqueueTask) {
        setValue(enqueueTask.getFnPtr(), 13);
    }

    public ClosureObject<b2FinishTaskCallback> finishTask() {
        return CHandler.getClosureObject(getValue(14));
    }

    public void finishTask(ClosureObject<b2FinishTaskCallback> finishTask) {
        setValue(finishTask.getFnPtr(), 14);
    }

    public VoidPointer userTaskContext() {
        return new VoidPointer(getValue(15), false);
    }

    public void userTaskContext(VoidPointer userTaskContext) {
        setValue(userTaskContext.getPointer(), 15);
    }

    public VoidPointer userData() {
        return new VoidPointer(getValue(16), false);
    }

    public void userData(VoidPointer userData) {
        setValue(userData.getPointer(), 16);
    }

    public int internalValue() {
        return (int) getValue(17);
    }

    public void internalValue(int internalValue) {
        setValue(internalValue, 17);
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
