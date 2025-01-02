package com.badlogic.gdx.box2d.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;

/**
 * Describes the TOI output
 */
public enum b2TOIState implements CEnum {

    b2_toiStateUnknown(0), b2_toiStateFailed(1), b2_toiStateOverlapped(2), b2_toiStateHit(3), b2_toiStateSeparated(4);

    private final int index;

    b2TOIState(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public static b2TOIState getByIndex(int index) {
        return _values[index];
    }

    private final static b2TOIState[] _values = { b2_toiStateUnknown, b2_toiStateFailed, b2_toiStateOverlapped, b2_toiStateHit, b2_toiStateSeparated };

    public static final class b2TOIStatePointer extends EnumPointer<b2TOIState> {

        public b2TOIStatePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2TOIStatePointer() {
            this(1, true, true);
        }

        public b2TOIStatePointer(int count, boolean freeOnGC, boolean guard) {
            super(count, freeOnGC, guard);
        }

        public b2TOIState.b2TOIStatePointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        protected b2TOIState getEnum(int index) {
            return getByIndex(index);
        }
    }
}
