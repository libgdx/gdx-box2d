package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;

/**
 * This is used to filter collision on shapes. It affects shape-vs-shape collision
 * and shape-versus-query collision (such as b2World_CastRay).
 * @ingroup shape
 */
public final class b2Filter extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(35).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2Filter(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2Filter() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2Filter.b2FilterPointer asPointer() {
        return new b2Filter.b2FilterPointer(getPointer(), getsGCFreed());
    }

    /**
     *  The collision category bits. Normally you would just set one bit. The category bits should
     * 	 represent your application object types. For example:
     * 	 @code{.cpp}
     * 	 enum MyCategories
     * 	 {
     * 	    Static  = 0x00000001,
     * 	    Dynamic = 0x00000002,
     * 	    Debris  = 0x00000004,
     * 	    Player  = 0x00000008,
     * 	    // etc
     * 	 };
     * 	 @endcode
     */
    public long categoryBits() {
        return (long) getValue(0);
    }

    /**
     *  The collision category bits. Normally you would just set one bit. The category bits should
     * 	 represent your application object types. For example:
     * 	 @code{.cpp}
     * 	 enum MyCategories
     * 	 {
     * 	    Static  = 0x00000001,
     * 	    Dynamic = 0x00000002,
     * 	    Debris  = 0x00000004,
     * 	    Player  = 0x00000008,
     * 	    // etc
     * 	 };
     * 	 @endcode
     */
    public void categoryBits(long categoryBits) {
        setValue(categoryBits, 0);
    }

    /**
     *  The collision mask bits. This states the categories that this
     * 	 shape would accept for collision.
     * 	 For example, you may want your player to only collide with static objects
     * 	 and other players.
     * 	 @code{.c}
     * 	 maskBits = Static | Player;
     * 	 @endcode
     */
    public long maskBits() {
        return (long) getValue(1);
    }

    /**
     *  The collision mask bits. This states the categories that this
     * 	 shape would accept for collision.
     * 	 For example, you may want your player to only collide with static objects
     * 	 and other players.
     * 	 @code{.c}
     * 	 maskBits = Static | Player;
     * 	 @endcode
     */
    public void maskBits(long maskBits) {
        setValue(maskBits, 1);
    }

    /**
     *  Collision groups allow a certain group of objects to never collide (negative)
     * 	 or always collide (positive). A group index of zero has no effect. Non-zero group filtering
     * 	 always wins against the mask bits.
     * 	 For example, you may want ragdolls to collide with other ragdolls but you don't want
     * 	 ragdoll self-collision. In this case you would give each ragdoll a unique negative group index
     * 	 and apply that group index to all shapes on the ragdoll.
     */
    public int groupIndex() {
        return (int) getValue(2);
    }

    /**
     *  Collision groups allow a certain group of objects to never collide (negative)
     * 	 or always collide (positive). A group index of zero has no effect. Non-zero group filtering
     * 	 always wins against the mask bits.
     * 	 For example, you may want ragdolls to collide with other ragdolls but you don't want
     * 	 ragdoll self-collision. In this case you would give each ragdoll a unique negative group index
     * 	 and apply that group index to all shapes on the ragdoll.
     */
    public void groupIndex(int groupIndex) {
        setValue(groupIndex, 2);
    }

    public static final class b2FilterPointer extends StackElementPointer<b2Filter> {

        public b2FilterPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2FilterPointer() {
            this(1, true, true);
        }

        public b2FilterPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2Filter.b2FilterPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2Filter createStackElement(long ptr, boolean freeOnGC) {
            return new b2Filter(ptr, freeOnGC);
        }
    }
}
