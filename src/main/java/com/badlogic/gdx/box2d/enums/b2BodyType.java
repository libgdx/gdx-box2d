package com.badlogic.gdx.box2d.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;

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

    private final int index;

    b2BodyType(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public static b2BodyType getByIndex(int index) {
        return _values[index];
    }

    private final static b2BodyType[] _values = { b2_staticBody, b2_kinematicBody, b2_dynamicBody, b2_bodyTypeCount };

    public static final class b2BodyTypePointer extends EnumPointer<b2BodyType> {

        public b2BodyTypePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2BodyTypePointer() {
            this(1, true, true);
        }

        public b2BodyTypePointer(int count, boolean freeOnGC, boolean guard) {
            super(count, freeOnGC, guard);
        }

        public b2BodyType.b2BodyTypePointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        protected b2BodyType getEnum(int index) {
            return getByIndex(index);
        }
    }
}
