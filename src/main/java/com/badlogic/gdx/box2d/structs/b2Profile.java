package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;

/**
 * @cond
 * Profiling data. Times are in milliseconds.
 */
public final class b2Profile extends Struct {

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

    public float mergeIslands() {
        return (float) getValueFloat(4);
    }

    public void mergeIslands(float mergeIslands) {
        setValue(mergeIslands, 4);
    }

    public float prepareStages() {
        return (float) getValueFloat(5);
    }

    public void prepareStages(float prepareStages) {
        setValue(prepareStages, 5);
    }

    public float solveConstraints() {
        return (float) getValueFloat(6);
    }

    public void solveConstraints(float solveConstraints) {
        setValue(solveConstraints, 6);
    }

    public float prepareConstraints() {
        return (float) getValueFloat(7);
    }

    public void prepareConstraints(float prepareConstraints) {
        setValue(prepareConstraints, 7);
    }

    public float integrateVelocities() {
        return (float) getValueFloat(8);
    }

    public void integrateVelocities(float integrateVelocities) {
        setValue(integrateVelocities, 8);
    }

    public float warmStart() {
        return (float) getValueFloat(9);
    }

    public void warmStart(float warmStart) {
        setValue(warmStart, 9);
    }

    public float solveImpulses() {
        return (float) getValueFloat(10);
    }

    public void solveImpulses(float solveImpulses) {
        setValue(solveImpulses, 10);
    }

    public float integratePositions() {
        return (float) getValueFloat(11);
    }

    public void integratePositions(float integratePositions) {
        setValue(integratePositions, 11);
    }

    public float relaxImpulses() {
        return (float) getValueFloat(12);
    }

    public void relaxImpulses(float relaxImpulses) {
        setValue(relaxImpulses, 12);
    }

    public float applyRestitution() {
        return (float) getValueFloat(13);
    }

    public void applyRestitution(float applyRestitution) {
        setValue(applyRestitution, 13);
    }

    public float storeImpulses() {
        return (float) getValueFloat(14);
    }

    public void storeImpulses(float storeImpulses) {
        setValue(storeImpulses, 14);
    }

    public float splitIslands() {
        return (float) getValueFloat(15);
    }

    public void splitIslands(float splitIslands) {
        setValue(splitIslands, 15);
    }

    public float transforms() {
        return (float) getValueFloat(16);
    }

    public void transforms(float transforms) {
        setValue(transforms, 16);
    }

    public float hitEvents() {
        return (float) getValueFloat(17);
    }

    public void hitEvents(float hitEvents) {
        setValue(hitEvents, 17);
    }

    public float refit() {
        return (float) getValueFloat(18);
    }

    public void refit(float refit) {
        setValue(refit, 18);
    }

    public float bullets() {
        return (float) getValueFloat(19);
    }

    public void bullets(float bullets) {
        setValue(bullets, 19);
    }

    public float sleepIslands() {
        return (float) getValueFloat(20);
    }

    public void sleepIslands(float sleepIslands) {
        setValue(sleepIslands, 20);
    }

    public float sensors() {
        return (float) getValueFloat(21);
    }

    public void sensors(float sensors) {
        setValue(sensors, 21);
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
