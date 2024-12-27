package com.badlogic.box2d.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;

public enum b2ShapeType implements com.badlogic.gdx.jnigen.runtime.c.CEnum {

    b2_circleShape(0),
    b2_capsuleShape(1),
    b2_segmentShape(2),
    b2_polygonShape(3),
    b2_chainSegmentShape(4),
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
