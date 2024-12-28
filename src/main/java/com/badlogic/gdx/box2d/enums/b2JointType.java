package com.badlogic.gdx.box2d.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;

public enum b2JointType implements com.badlogic.gdx.jnigen.runtime.c.CEnum {

    b2_distanceJoint(0),
    b2_motorJoint(1),
    b2_mouseJoint(2),
    b2_nullJoint(3),
    b2_prismaticJoint(4),
    b2_revoluteJoint(5),
    b2_weldJoint(6),
    b2_wheelJoint(7);

    private final int index;

    b2JointType(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public static b2JointType getByIndex(int index) {
        return _values[index];
    }

    private final static b2JointType[] _values = { b2_distanceJoint, b2_motorJoint, b2_mouseJoint, b2_nullJoint, b2_prismaticJoint, b2_revoluteJoint, b2_weldJoint, b2_wheelJoint };

    public static final class b2JointTypePointer extends EnumPointer<b2JointType> {

        public b2JointTypePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2JointTypePointer() {
            this(1, true, true);
        }

        public b2JointTypePointer(int count, boolean freeOnGC, boolean guard) {
            super(count, freeOnGC, guard);
        }

        public b2JointType.b2JointTypePointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        protected b2JointType getEnum(int index) {
            return getByIndex(index);
        }
    }
}
