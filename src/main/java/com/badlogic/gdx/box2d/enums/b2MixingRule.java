package com.badlogic.gdx.box2d.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;

/**
 * Mixing rules for friction and restitution
 */
public enum b2MixingRule implements CEnum {

    b2_mixAverage(0), b2_mixGeometricMean(1), b2_mixMultiply(2), b2_mixMinimum(3), b2_mixMaximum(4);

    private final int index;

    b2MixingRule(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public static b2MixingRule getByIndex(int index) {
        return _values[index];
    }

    private final static b2MixingRule[] _values = { b2_mixAverage, b2_mixGeometricMean, b2_mixMultiply, b2_mixMinimum, b2_mixMaximum };

    public static final class b2MixingRulePointer extends EnumPointer<b2MixingRule> {

        public b2MixingRulePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2MixingRulePointer() {
            this(1, true, true);
        }

        public b2MixingRulePointer(int count, boolean freeOnGC, boolean guard) {
            super(count, freeOnGC, guard);
        }

        public b2MixingRule.b2MixingRulePointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        protected b2MixingRule getEnum(int index) {
            return getByIndex(index);
        }
    }
}
