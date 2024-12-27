package com.badlogic.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.box2d.FFITypes;

public final class b2Profile extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(47).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2Profile(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2Profile() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2Profile.b2ProfilePointer asPointer() {
        return new b2Profile.b2ProfilePointer(getPointer(), getsGCFreed());
    }

    public float step() {
        return (float) getValueFloat(0);
    }

    public void step(float step) {
        setValue(step, 0);
    }

    public float pairs() {
        return (float) getValueFloat(1);
    }

    public void pairs(float pairs) {
        setValue(pairs, 1);
    }

    public float collide() {
        return (float) getValueFloat(2);
    }

    public void collide(float collide) {
        setValue(collide, 2);
    }

    public float solve() {
        return (float) getValueFloat(3);
    }

    public void solve(float solve) {
        setValue(solve, 3);
    }

    public float buildIslands() {
        return (float) getValueFloat(4);
    }

    public void buildIslands(float buildIslands) {
        setValue(buildIslands, 4);
    }

    public float solveConstraints() {
        return (float) getValueFloat(5);
    }

    public void solveConstraints(float solveConstraints) {
        setValue(solveConstraints, 5);
    }

    public float prepareTasks() {
        return (float) getValueFloat(6);
    }

    public void prepareTasks(float prepareTasks) {
        setValue(prepareTasks, 6);
    }

    public float solverTasks() {
        return (float) getValueFloat(7);
    }

    public void solverTasks(float solverTasks) {
        setValue(solverTasks, 7);
    }

    public float prepareConstraints() {
        return (float) getValueFloat(8);
    }

    public void prepareConstraints(float prepareConstraints) {
        setValue(prepareConstraints, 8);
    }

    public float integrateVelocities() {
        return (float) getValueFloat(9);
    }

    public void integrateVelocities(float integrateVelocities) {
        setValue(integrateVelocities, 9);
    }

    public float warmStart() {
        return (float) getValueFloat(10);
    }

    public void warmStart(float warmStart) {
        setValue(warmStart, 10);
    }

    public float solveVelocities() {
        return (float) getValueFloat(11);
    }

    public void solveVelocities(float solveVelocities) {
        setValue(solveVelocities, 11);
    }

    public float integratePositions() {
        return (float) getValueFloat(12);
    }

    public void integratePositions(float integratePositions) {
        setValue(integratePositions, 12);
    }

    public float relaxVelocities() {
        return (float) getValueFloat(13);
    }

    public void relaxVelocities(float relaxVelocities) {
        setValue(relaxVelocities, 13);
    }

    public float applyRestitution() {
        return (float) getValueFloat(14);
    }

    public void applyRestitution(float applyRestitution) {
        setValue(applyRestitution, 14);
    }

    public float storeImpulses() {
        return (float) getValueFloat(15);
    }

    public void storeImpulses(float storeImpulses) {
        setValue(storeImpulses, 15);
    }

    public float finalizeBodies() {
        return (float) getValueFloat(16);
    }

    public void finalizeBodies(float finalizeBodies) {
        setValue(finalizeBodies, 16);
    }

    public float splitIslands() {
        return (float) getValueFloat(17);
    }

    public void splitIslands(float splitIslands) {
        setValue(splitIslands, 17);
    }

    public float sleepIslands() {
        return (float) getValueFloat(18);
    }

    public void sleepIslands(float sleepIslands) {
        setValue(sleepIslands, 18);
    }

    public float hitEvents() {
        return (float) getValueFloat(19);
    }

    public void hitEvents(float hitEvents) {
        setValue(hitEvents, 19);
    }

    public float broadphase() {
        return (float) getValueFloat(20);
    }

    public void broadphase(float broadphase) {
        setValue(broadphase, 20);
    }

    public float continuous() {
        return (float) getValueFloat(21);
    }

    public void continuous(float continuous) {
        setValue(continuous, 21);
    }

    public static final class b2ProfilePointer extends StackElementPointer<b2Profile> {

        public b2ProfilePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ProfilePointer() {
            this(1, true, true);
        }

        public b2ProfilePointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2Profile.b2ProfilePointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2Profile createStackElement(long ptr, boolean freeOnGC) {
            return new b2Profile(ptr, freeOnGC);
        }
    }
}
