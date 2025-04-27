package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.FFITypes;

/**
 * Surface materials allow chain shapes to have per segment surface properties.
 * @ingroup shape
 */
public final class b2SurfaceMaterial extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(70).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2SurfaceMaterial(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2SurfaceMaterial(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public b2SurfaceMaterial() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2SurfaceMaterial.b2SurfaceMaterialPointer asPointer() {
        return new b2SurfaceMaterial.b2SurfaceMaterialPointer(getPointer(), false, 1, this);
    }

    public void asPointer(b2SurfaceMaterial.b2SurfaceMaterialPointer ptr) {
        ptr.setPointer(this);
    }

    /**
     * The Coulomb (dry) friction coefficient, usually in the range [0,1].
     */
    public float friction() {
        return getBufPtr().getFloat(0);
    }

    /**
     * The Coulomb (dry) friction coefficient, usually in the range [0,1].
     */
    public void friction(float friction) {
        getBufPtr().setFloat(0, friction);
    }

    /**
     *  The coefficient of restitution (bounce) usually in the range [0,1].
     * 	 https://en.wikipedia.org/wiki/Coefficient_of_restitution
     */
    public float restitution() {
        return getBufPtr().getFloat(4);
    }

    /**
     *  The coefficient of restitution (bounce) usually in the range [0,1].
     * 	 https://en.wikipedia.org/wiki/Coefficient_of_restitution
     */
    public void restitution(float restitution) {
        getBufPtr().setFloat(4, restitution);
    }

    /**
     * The rolling resistance usually in the range [0,1].
     */
    public float rollingResistance() {
        return getBufPtr().getFloat(8);
    }

    /**
     * The rolling resistance usually in the range [0,1].
     */
    public void rollingResistance(float rollingResistance) {
        getBufPtr().setFloat(8, rollingResistance);
    }

    /**
     * The tangent speed for conveyor belts
     */
    public float tangentSpeed() {
        return getBufPtr().getFloat(12);
    }

    /**
     * The tangent speed for conveyor belts
     */
    public void tangentSpeed(float tangentSpeed) {
        getBufPtr().setFloat(12, tangentSpeed);
    }

    /**
     *  User material identifier. This is passed with query results and to friction and restitution
     * 	 combining functions. It is not used internally.
     */
    public int userMaterialId() {
        return getBufPtr().getInt(16);
    }

    /**
     *  User material identifier. This is passed with query results and to friction and restitution
     * 	 combining functions. It is not used internally.
     */
    public void userMaterialId(int userMaterialId) {
        getBufPtr().setInt(16, userMaterialId);
    }

    /**
     * Custom debug draw color.
     */
    public long customColor() {
        return getBufPtr().getUInt(20);
    }

    /**
     * Custom debug draw color.
     */
    public void customColor(long customColor) {
        getBufPtr().setUInt(20, customColor);
    }

    public static final class b2SurfaceMaterialPointer extends StackElementPointer<b2SurfaceMaterial> {

        public b2SurfaceMaterialPointer(VoidPointer pointer) {
            super(pointer);
        }

        public b2SurfaceMaterialPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2SurfaceMaterialPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2SurfaceMaterialPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public b2SurfaceMaterialPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public b2SurfaceMaterialPointer() {
            this(1, true);
        }

        public b2SurfaceMaterialPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected b2SurfaceMaterial createStackElement(long ptr, boolean freeOnGC) {
            return new b2SurfaceMaterial(ptr, freeOnGC);
        }
    }
}
