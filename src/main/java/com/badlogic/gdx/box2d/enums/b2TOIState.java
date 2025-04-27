package com.badlogic.gdx.box2d.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

/**
 * Describes the TOI output
 */
public enum b2TOIState implements CEnum {

    b2_toiStateUnknown(0), b2_toiStateFailed(1), b2_toiStateOverlapped(2), b2_toiStateHit(3), b2_toiStateSeparated(4);

    private static final int __size = 4;

    private final int index;

    b2TOIState(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static b2TOIState getByIndex(int index) {
        switch(index) {
            case 0:
                return b2_toiStateUnknown;
            case 1:
                return b2_toiStateFailed;
            case 2:
                return b2_toiStateOverlapped;
            case 3:
                return b2_toiStateHit;
            case 4:
                return b2_toiStateSeparated;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class b2TOIStatePointer extends EnumPointer<b2TOIState> {

        public b2TOIStatePointer(VoidPointer pointer) {
            super(pointer);
        }

        public b2TOIStatePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2TOIStatePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2TOIStatePointer() {
            this(1, true);
        }

        public b2TOIStatePointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public b2TOIState getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(b2TOIState value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }

        public int getSize() {
            return __size;
        }
    }
}
