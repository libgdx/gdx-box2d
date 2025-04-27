package com.badlogic.gdx.box2d.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

/**
 * Joint type enumeration
 *
 * This is useful because all joint types use b2JointId and sometimes you
 * want to get the type of a joint.
 * @ingroup joint
 */
public enum b2JointType implements CEnum {

    b2_distanceJoint(0),
    b2_filterJoint(1),
    b2_motorJoint(2),
    b2_mouseJoint(3),
    b2_prismaticJoint(4),
    b2_revoluteJoint(5),
    b2_weldJoint(6),
    b2_wheelJoint(7);

    private static final int __size = 4;

    private final int index;

    b2JointType(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static b2JointType getByIndex(int index) {
        switch(index) {
            case 0:
                return b2_distanceJoint;
            case 1:
                return b2_filterJoint;
            case 2:
                return b2_motorJoint;
            case 3:
                return b2_mouseJoint;
            case 4:
                return b2_prismaticJoint;
            case 5:
                return b2_revoluteJoint;
            case 6:
                return b2_weldJoint;
            case 7:
                return b2_wheelJoint;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class b2JointTypePointer extends EnumPointer<b2JointType> {

        public b2JointTypePointer(VoidPointer pointer) {
            super(pointer);
        }

        public b2JointTypePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2JointTypePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2JointTypePointer() {
            this(1, true);
        }

        public b2JointTypePointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public b2JointType getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(b2JointType value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
