package com.badlogic.gdx.box2d.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;

/**
 * Mixing rules for friction and restitution
 */
public enum b2MixingRule implements CEnum {

    b2_mixAverage(0), b2_mixGeometricMean(1), b2_mixMultiply(2), b2_mixMinimum(3), b2_mixMaximum(4);

    private static final int __size = 4;

    private final int index;

    b2MixingRule(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static b2MixingRule getByIndex(int index) {
        switch(index) {
            case 0:
                return b2_mixAverage;
            case 1:
                return b2_mixGeometricMean;
            case 2:
                return b2_mixMultiply;
            case 3:
                return b2_mixMinimum;
            case 4:
                return b2_mixMaximum;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class b2MixingRulePointer extends EnumPointer<b2MixingRule> {

        public b2MixingRulePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2MixingRulePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2MixingRulePointer() {
            this(1, true);
        }

        public b2MixingRulePointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public b2MixingRule getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(b2MixingRule value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }

        public int getSize() {
            return __size;
        }
    }
}
