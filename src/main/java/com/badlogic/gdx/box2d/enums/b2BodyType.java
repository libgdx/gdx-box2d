package com.badlogic.gdx.box2d.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

/**
 * The body simulation type.
 * Each body is one of these three types. The type determines how the body behaves in the simulation.
 * @ingroup body
 */
public enum b2BodyType implements CEnum {

    /**
     * zero mass, zero velocity, may be manually moved
     */
    b2_staticBody(0),
    /**
     * zero mass, velocity set by user, moved by solver
     */
    b2_kinematicBody(1),
    /**
     * positive mass, velocity determined by forces, moved by solver
     */
    b2_dynamicBody(2),
    /**
     * number of body types
     */
    b2_bodyTypeCount(3);

    private static final int __size = 4;

    private final int index;

    b2BodyType(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static b2BodyType getByIndex(int index) {
        switch(index) {
            case 0:
                return b2_staticBody;
            case 1:
                return b2_kinematicBody;
            case 2:
                return b2_dynamicBody;
            case 3:
                return b2_bodyTypeCount;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class b2BodyTypePointer extends EnumPointer<b2BodyType> {

        public b2BodyTypePointer(VoidPointer pointer) {
            super(pointer);
        }

        public b2BodyTypePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2BodyTypePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2BodyTypePointer() {
            this(1, true);
        }

        public b2BodyTypePointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public b2BodyType getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(b2BodyType value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }

        public int getSize() {
            return __size;
        }
    }
}
