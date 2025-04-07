package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
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
        return new b2Profile.b2ProfilePointer(getPointer(), false, this);
    }

    public float step() {
        return getBufPtr().getFloat(0);
    }

    public void step(float step) {
        getBufPtr().setFloat(0, step);
    }

    public float pairs() {
        return getBufPtr().getFloat(4);
    }

    public void pairs(float pairs) {
        getBufPtr().setFloat(4, pairs);
    }

    public float collide() {
        return getBufPtr().getFloat(8);
    }

    public void collide(float collide) {
        getBufPtr().setFloat(8, collide);
    }

    public float solve() {
        return getBufPtr().getFloat(12);
    }

    public void solve(float solve) {
        getBufPtr().setFloat(12, solve);
    }

    public float mergeIslands() {
        return getBufPtr().getFloat(16);
    }

    public void mergeIslands(float mergeIslands) {
        getBufPtr().setFloat(16, mergeIslands);
    }

    public float prepareStages() {
        return getBufPtr().getFloat(20);
    }

    public void prepareStages(float prepareStages) {
        getBufPtr().setFloat(20, prepareStages);
    }

    public float solveConstraints() {
        return getBufPtr().getFloat(24);
    }

    public void solveConstraints(float solveConstraints) {
        getBufPtr().setFloat(24, solveConstraints);
    }

    public float prepareConstraints() {
        return getBufPtr().getFloat(28);
    }

    public void prepareConstraints(float prepareConstraints) {
        getBufPtr().setFloat(28, prepareConstraints);
    }

    public float integrateVelocities() {
        return getBufPtr().getFloat(32);
    }

    public void integrateVelocities(float integrateVelocities) {
        getBufPtr().setFloat(32, integrateVelocities);
    }

    public float warmStart() {
        return getBufPtr().getFloat(36);
    }

    public void warmStart(float warmStart) {
        getBufPtr().setFloat(36, warmStart);
    }

    public float solveImpulses() {
        return getBufPtr().getFloat(40);
    }

    public void solveImpulses(float solveImpulses) {
        getBufPtr().setFloat(40, solveImpulses);
    }

    public float integratePositions() {
        return getBufPtr().getFloat(44);
    }

    public void integratePositions(float integratePositions) {
        getBufPtr().setFloat(44, integratePositions);
    }

    public float relaxImpulses() {
        return getBufPtr().getFloat(48);
    }

    public void relaxImpulses(float relaxImpulses) {
        getBufPtr().setFloat(48, relaxImpulses);
    }

    public float applyRestitution() {
        return getBufPtr().getFloat(52);
    }

    public void applyRestitution(float applyRestitution) {
        getBufPtr().setFloat(52, applyRestitution);
    }

    public float storeImpulses() {
        return getBufPtr().getFloat(56);
    }

    public void storeImpulses(float storeImpulses) {
        getBufPtr().setFloat(56, storeImpulses);
    }

    public float splitIslands() {
        return getBufPtr().getFloat(60);
    }

    public void splitIslands(float splitIslands) {
        getBufPtr().setFloat(60, splitIslands);
    }

    public float transforms() {
        return getBufPtr().getFloat(64);
    }

    public void transforms(float transforms) {
        getBufPtr().setFloat(64, transforms);
    }

    public float hitEvents() {
        return getBufPtr().getFloat(68);
    }

    public void hitEvents(float hitEvents) {
        getBufPtr().setFloat(68, hitEvents);
    }

    public float refit() {
        return getBufPtr().getFloat(72);
    }

    public void refit(float refit) {
        getBufPtr().setFloat(72, refit);
    }

    public float bullets() {
        return getBufPtr().getFloat(76);
    }

    public void bullets(float bullets) {
        getBufPtr().setFloat(76, bullets);
    }

    public float sleepIslands() {
        return getBufPtr().getFloat(80);
    }

    public void sleepIslands(float sleepIslands) {
        getBufPtr().setFloat(80, sleepIslands);
    }

    public float sensors() {
        return getBufPtr().getFloat(84);
    }

    public void sensors(float sensors) {
        getBufPtr().setFloat(84, sensors);
    }

    public static final class b2ProfilePointer extends StackElementPointer<b2Profile> {

        public b2ProfilePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ProfilePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2ProfilePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2ProfilePointer() {
            this(1, true);
        }

        public b2ProfilePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2Profile createStackElement(long ptr, boolean freeOnGC) {
            return new b2Profile(ptr, freeOnGC);
        }
    }
}
