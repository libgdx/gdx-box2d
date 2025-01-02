package com.badlogic.gdx.box2d.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;

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

    private final int index;

    b2ShapeType(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public static b2ShapeType getByIndex(int index) {
        return _values[index];
    }

    private final static b2ShapeType[] _values = { b2_circleShape, b2_capsuleShape, b2_segmentShape, b2_polygonShape, b2_chainSegmentShape, b2_shapeTypeCount };

    public static final class b2ShapeTypePointer extends EnumPointer<b2ShapeType> {

        public b2ShapeTypePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2ShapeTypePointer() {
            this(1, true, true);
        }

        public b2ShapeTypePointer(int count, boolean freeOnGC, boolean guard) {
            super(count, freeOnGC, guard);
        }

        public b2ShapeType.b2ShapeTypePointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        protected b2ShapeType getEnum(int index) {
            return getByIndex(index);
        }
    }
}
