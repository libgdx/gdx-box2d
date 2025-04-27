package com.badlogic.gdx.box2d.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

/**
 * Shape type
 * @ingroup shape
 */
public enum b2ShapeType implements CEnum {

    /**
     * A circle with an offset
     */
    b2_circleShape(0),
    /**
     * A capsule is an extruded circle
     */
    b2_capsuleShape(1),
    /**
     * A line segment
     */
    b2_segmentShape(2),
    /**
     * A convex polygon
     */
    b2_polygonShape(3),
    /**
     * A line segment owned by a chain shape
     */
    b2_chainSegmentShape(4),
    /**
     * The number of shape types
     */
    b2_shapeTypeCount(5);

    private static final int __size = 4;

    private final int index;

    b2ShapeType(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static b2ShapeType getByIndex(int index) {
        switch(index) {
            case 0:
                return b2_circleShape;
            case 1:
                return b2_capsuleShape;
            case 2:
                return b2_segmentShape;
            case 3:
                return b2_polygonShape;
            case 4:
                return b2_chainSegmentShape;
            case 5:
                return b2_shapeTypeCount;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class b2ShapeTypePointer extends EnumPointer<b2ShapeType> {

        public b2ShapeTypePointer(VoidPointer pointer) {
            super(pointer);
        }

        public b2ShapeTypePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ShapeTypePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2ShapeTypePointer() {
            this(1, true);
        }

        public b2ShapeTypePointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public b2ShapeType getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(b2ShapeType value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
