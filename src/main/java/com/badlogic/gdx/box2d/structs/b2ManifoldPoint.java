package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.box2d.structs.b2Vec2;

/**
 * A manifold point is a contact point belonging to a contact manifold.
 * It holds details related to the geometry and dynamics of the contact points.
 * Box2D uses speculative collision so some contact points may be separated.
 * You may use the maxNormalImpulse to determine if there was an interaction during
 * the time step.
 */
public final class b2ManifoldPoint extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(39).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2ManifoldPoint(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2ManifoldPoint() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2ManifoldPoint.b2ManifoldPointPointer asPointer() {
        return new b2ManifoldPoint.b2ManifoldPointPointer(getPointer(), getsGCFreed());
    }

    /**
     *  Location of the contact point in world space. Subject to precision loss at large coordinates.
     * 	 @note Should only be used for debugging.
     */
    public b2Vec2 point() {
        return __point;
    }

    private static final int __point_offset = CHandler.getOffsetForField(__ffi_type, 0);

    private final b2Vec2 __point = new b2Vec2(getPointer() + __point_offset, false);

    /**
     *  Location of the contact point relative to shapeA's origin in world space
     * 	 @note When used internally to the Box2D solver, this is relative to the body center of mass.
     */
    public b2Vec2 anchorA() {
        return __anchorA;
    }

    private static final int __anchorA_offset = CHandler.getOffsetForField(__ffi_type, 1);

    private final b2Vec2 __anchorA = new b2Vec2(getPointer() + __anchorA_offset, false);

    /**
     *  Location of the contact point relative to shapeB's origin in world space
     * 	 @note When used internally to the Box2D solver, this is relative to the body center of mass.
     */
    public b2Vec2 anchorB() {
        return __anchorB;
    }

    private static final int __anchorB_offset = CHandler.getOffsetForField(__ffi_type, 2);

    private final b2Vec2 __anchorB = new b2Vec2(getPointer() + __anchorB_offset, false);

    /**
     * The separation of the contact point, negative if penetrating
     */
    public float separation() {
        return (float) getValueFloat(3);
    }

    /**
     * The separation of the contact point, negative if penetrating
     */
    public void separation(float separation) {
        setValue(separation, 3);
    }

    /**
     * The impulse along the manifold normal vector.
     */
    public float normalImpulse() {
        return (float) getValueFloat(4);
    }

    /**
     * The impulse along the manifold normal vector.
     */
    public void normalImpulse(float normalImpulse) {
        setValue(normalImpulse, 4);
    }

    /**
     * The friction impulse
     */
    public float tangentImpulse() {
        return (float) getValueFloat(5);
    }

    /**
     * The friction impulse
     */
    public void tangentImpulse(float tangentImpulse) {
        setValue(tangentImpulse, 5);
    }

    /**
     *  The maximum normal impulse applied during sub-stepping. This is important
     * 	 to identify speculative contact points that had an interaction in the time step.
     */
    public float maxNormalImpulse() {
        return (float) getValueFloat(6);
    }

    /**
     *  The maximum normal impulse applied during sub-stepping. This is important
     * 	 to identify speculative contact points that had an interaction in the time step.
     */
    public void maxNormalImpulse(float maxNormalImpulse) {
        setValue(maxNormalImpulse, 6);
    }

    /**
     *  Relative normal velocity pre-solve. Used for hit events. If the normal impulse is
     * 	 zero then there was no hit. Negative means shapes are approaching.
     */
    public float normalVelocity() {
        return (float) getValueFloat(7);
    }

    /**
     *  Relative normal velocity pre-solve. Used for hit events. If the normal impulse is
     * 	 zero then there was no hit. Negative means shapes are approaching.
     */
    public void normalVelocity(float normalVelocity) {
        setValue(normalVelocity, 7);
    }

    /**
     * Uniquely identifies a contact point between two shapes
     */
    public char id() {
        return (char) getValue(8);
    }

    /**
     * Uniquely identifies a contact point between two shapes
     */
    public void id(char id) {
        setValue(id, 8);
    }

    /**
     * Did this contact point exist the previous step?
     */
    public boolean persisted() {
        return getValue(9) != 0;
    }

    /**
     * Did this contact point exist the previous step?
     */
    public void persisted(boolean persisted) {
        setValue(persisted, 9);
    }

    public static final class b2ManifoldPointPointer extends StackElementPointer<b2ManifoldPoint> {

        public b2ManifoldPointPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ManifoldPointPointer() {
            this(1, true, true);
        }

        public b2ManifoldPointPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2ManifoldPoint.b2ManifoldPointPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2ManifoldPoint createStackElement(long ptr, boolean freeOnGC) {
            return new b2ManifoldPoint(ptr, freeOnGC);
        }
    }
}
