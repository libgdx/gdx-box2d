package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import com.badlogic.gdx.box2d.structs.b2AABB;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.jnigen.runtime.closure.Closure;
import com.badlogic.gdx.jnigen.runtime.ffi.JavaTypeWrapper;
import com.badlogic.gdx.jnigen.runtime.c.CTypeInfo;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.box2d.enums.b2HexColor;
import com.badlogic.gdx.box2d.structs.b2Transform;
import com.badlogic.gdx.jnigen.runtime.pointer.CSizedIntPointer;

public final class b2DebugDraw extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(30).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2DebugDraw(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2DebugDraw() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2DebugDraw.b2DebugDrawPointer asPointer() {
        return new b2DebugDraw.b2DebugDrawPointer(getPointer(), getsGCFreed());
    }

    public ClosureObject<DrawPolygon> DrawPolygon() {
        return CHandler.getClosureObject(getValue(0));
    }

    public void DrawPolygon(ClosureObject<DrawPolygon> DrawPolygon) {
        setValue(DrawPolygon.getFnPtr(), 0);
    }

    public ClosureObject<DrawSolidPolygon> DrawSolidPolygon() {
        return CHandler.getClosureObject(getValue(1));
    }

    public void DrawSolidPolygon(ClosureObject<DrawSolidPolygon> DrawSolidPolygon) {
        setValue(DrawSolidPolygon.getFnPtr(), 1);
    }

    public ClosureObject<DrawCircle> DrawCircle() {
        return CHandler.getClosureObject(getValue(2));
    }

    public void DrawCircle(ClosureObject<DrawCircle> DrawCircle) {
        setValue(DrawCircle.getFnPtr(), 2);
    }

    public ClosureObject<DrawSolidCircle> DrawSolidCircle() {
        return CHandler.getClosureObject(getValue(3));
    }

    public void DrawSolidCircle(ClosureObject<DrawSolidCircle> DrawSolidCircle) {
        setValue(DrawSolidCircle.getFnPtr(), 3);
    }

    public ClosureObject<DrawSolidCapsule> DrawSolidCapsule() {
        return CHandler.getClosureObject(getValue(4));
    }

    public void DrawSolidCapsule(ClosureObject<DrawSolidCapsule> DrawSolidCapsule) {
        setValue(DrawSolidCapsule.getFnPtr(), 4);
    }

    public ClosureObject<DrawSegment> DrawSegment() {
        return CHandler.getClosureObject(getValue(5));
    }

    public void DrawSegment(ClosureObject<DrawSegment> DrawSegment) {
        setValue(DrawSegment.getFnPtr(), 5);
    }

    public ClosureObject<DrawTransform> DrawTransform() {
        return CHandler.getClosureObject(getValue(6));
    }

    public void DrawTransform(ClosureObject<DrawTransform> DrawTransform) {
        setValue(DrawTransform.getFnPtr(), 6);
    }

    public ClosureObject<DrawPoint> DrawPoint() {
        return CHandler.getClosureObject(getValue(7));
    }

    public void DrawPoint(ClosureObject<DrawPoint> DrawPoint) {
        setValue(DrawPoint.getFnPtr(), 7);
    }

    public ClosureObject<DrawString> DrawString() {
        return CHandler.getClosureObject(getValue(8));
    }

    public void DrawString(ClosureObject<DrawString> DrawString) {
        setValue(DrawString.getFnPtr(), 8);
    }

    public b2AABB drawingBounds() {
        return __drawingBounds;
    }

    private static final int __drawingBounds_offset = CHandler.getOffsetForField(__ffi_type, 9);

    private final b2AABB __drawingBounds = new b2AABB(getPointer() + __drawingBounds_offset, false);

    public boolean useDrawingBounds() {
        return getValue(9) != 0;
    }

    public void useDrawingBounds(boolean useDrawingBounds) {
        setValue(useDrawingBounds, 9);
    }

    public boolean drawShapes() {
        return getValue(10) != 0;
    }

    public void drawShapes(boolean drawShapes) {
        setValue(drawShapes, 10);
    }

    public boolean drawJoints() {
        return getValue(11) != 0;
    }

    public void drawJoints(boolean drawJoints) {
        setValue(drawJoints, 11);
    }

    public boolean drawJointExtras() {
        return getValue(12) != 0;
    }

    public void drawJointExtras(boolean drawJointExtras) {
        setValue(drawJointExtras, 12);
    }

    public boolean drawAABBs() {
        return getValue(13) != 0;
    }

    public void drawAABBs(boolean drawAABBs) {
        setValue(drawAABBs, 13);
    }

    public boolean drawMass() {
        return getValue(14) != 0;
    }

    public void drawMass(boolean drawMass) {
        setValue(drawMass, 14);
    }

    public boolean drawContacts() {
        return getValue(15) != 0;
    }

    public void drawContacts(boolean drawContacts) {
        setValue(drawContacts, 15);
    }

    public boolean drawGraphColors() {
        return getValue(16) != 0;
    }

    public void drawGraphColors(boolean drawGraphColors) {
        setValue(drawGraphColors, 16);
    }

    public boolean drawContactNormals() {
        return getValue(17) != 0;
    }

    public void drawContactNormals(boolean drawContactNormals) {
        setValue(drawContactNormals, 17);
    }

    public boolean drawContactImpulses() {
        return getValue(18) != 0;
    }

    public void drawContactImpulses(boolean drawContactImpulses) {
        setValue(drawContactImpulses, 18);
    }

    public boolean drawFrictionImpulses() {
        return getValue(19) != 0;
    }

    public void drawFrictionImpulses(boolean drawFrictionImpulses) {
        setValue(drawFrictionImpulses, 19);
    }

    public VoidPointer context() {
        return new VoidPointer(getValue(20), false);
    }

    public void context(VoidPointer context) {
        setValue(context.getPointer(), 20);
    }

    public static final class b2DebugDrawPointer extends StackElementPointer<b2DebugDraw> {

        public b2DebugDrawPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2DebugDrawPointer() {
            this(1, true, true);
        }

        public b2DebugDrawPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2DebugDraw.b2DebugDrawPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2DebugDraw createStackElement(long ptr, boolean freeOnGC) {
            return new b2DebugDraw(ptr, freeOnGC);
        }
    }

    public interface DrawPolygon extends com.badlogic.gdx.jnigen.runtime.closure.Closure {

        com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] __ffi_cache = new com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

        void DrawPolygon_call(b2Vec2.b2Vec2Pointer arg0, int arg1, b2HexColor arg2, VoidPointer arg3);

        default com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(com.badlogic.gdx.jnigen.runtime.ffi.JavaTypeWrapper[] parameters, com.badlogic.gdx.jnigen.runtime.ffi.JavaTypeWrapper returnType) {
            DrawPolygon_call(new b2Vec2.b2Vec2Pointer(parameters[0].asLong(), false), (int) parameters[1].asLong(), b2HexColor.getByIndex((int) parameters[2].asLong()), new VoidPointer(parameters[3].asLong(), false));
        }
    }

    public interface DrawSolidPolygon extends com.badlogic.gdx.jnigen.runtime.closure.Closure {

        com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] __ffi_cache = new com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(71), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

        void DrawSolidPolygon_call(b2Transform arg0, b2Vec2.b2Vec2Pointer arg1, int arg2, float arg3, b2HexColor arg4, VoidPointer arg5);

        default com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(com.badlogic.gdx.jnigen.runtime.ffi.JavaTypeWrapper[] parameters, com.badlogic.gdx.jnigen.runtime.ffi.JavaTypeWrapper returnType) {
            DrawSolidPolygon_call(new b2Transform(parameters[0].asLong(), true), new b2Vec2.b2Vec2Pointer(parameters[1].asLong(), false), (int) parameters[2].asLong(), (float) parameters[3].asFloat(), b2HexColor.getByIndex((int) parameters[4].asLong()), new VoidPointer(parameters[5].asLong(), false));
        }
    }

    public interface DrawCircle extends com.badlogic.gdx.jnigen.runtime.closure.Closure {

        com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] __ffi_cache = new com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(74), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

        void DrawCircle_call(b2Vec2 arg0, float arg1, b2HexColor arg2, VoidPointer arg3);

        default com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(com.badlogic.gdx.jnigen.runtime.ffi.JavaTypeWrapper[] parameters, com.badlogic.gdx.jnigen.runtime.ffi.JavaTypeWrapper returnType) {
            DrawCircle_call(new b2Vec2(parameters[0].asLong(), true), (float) parameters[1].asFloat(), b2HexColor.getByIndex((int) parameters[2].asLong()), new VoidPointer(parameters[3].asLong(), false));
        }
    }

    public interface DrawSolidCircle extends com.badlogic.gdx.jnigen.runtime.closure.Closure {

        com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] __ffi_cache = new com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(71), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

        void DrawSolidCircle_call(b2Transform arg0, float arg1, b2HexColor arg2, VoidPointer arg3);

        default com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(com.badlogic.gdx.jnigen.runtime.ffi.JavaTypeWrapper[] parameters, com.badlogic.gdx.jnigen.runtime.ffi.JavaTypeWrapper returnType) {
            DrawSolidCircle_call(new b2Transform(parameters[0].asLong(), true), (float) parameters[1].asFloat(), b2HexColor.getByIndex((int) parameters[2].asLong()), new VoidPointer(parameters[3].asLong(), false));
        }
    }

    public interface DrawSolidCapsule extends com.badlogic.gdx.jnigen.runtime.closure.Closure {

        com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] __ffi_cache = new com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(74), FFITypes.getCTypeInfo(74), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

        void DrawSolidCapsule_call(b2Vec2 arg0, b2Vec2 arg1, float arg2, b2HexColor arg3, VoidPointer arg4);

        default com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(com.badlogic.gdx.jnigen.runtime.ffi.JavaTypeWrapper[] parameters, com.badlogic.gdx.jnigen.runtime.ffi.JavaTypeWrapper returnType) {
            DrawSolidCapsule_call(new b2Vec2(parameters[0].asLong(), true), new b2Vec2(parameters[1].asLong(), true), (float) parameters[2].asFloat(), b2HexColor.getByIndex((int) parameters[3].asLong()), new VoidPointer(parameters[4].asLong(), false));
        }
    }

    public interface DrawSegment extends com.badlogic.gdx.jnigen.runtime.closure.Closure {

        com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] __ffi_cache = new com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(74), FFITypes.getCTypeInfo(74), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

        void DrawSegment_call(b2Vec2 arg0, b2Vec2 arg1, b2HexColor arg2, VoidPointer arg3);

        default com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(com.badlogic.gdx.jnigen.runtime.ffi.JavaTypeWrapper[] parameters, com.badlogic.gdx.jnigen.runtime.ffi.JavaTypeWrapper returnType) {
            DrawSegment_call(new b2Vec2(parameters[0].asLong(), true), new b2Vec2(parameters[1].asLong(), true), b2HexColor.getByIndex((int) parameters[2].asLong()), new VoidPointer(parameters[3].asLong(), false));
        }
    }

    public interface DrawTransform extends com.badlogic.gdx.jnigen.runtime.closure.Closure {

        com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] __ffi_cache = new com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(71), FFITypes.getCTypeInfo(-1) };

        void DrawTransform_call(b2Transform arg0, VoidPointer arg1);

        default com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(com.badlogic.gdx.jnigen.runtime.ffi.JavaTypeWrapper[] parameters, com.badlogic.gdx.jnigen.runtime.ffi.JavaTypeWrapper returnType) {
            DrawTransform_call(new b2Transform(parameters[0].asLong(), true), new VoidPointer(parameters[1].asLong(), false));
        }
    }

    public interface DrawPoint extends com.badlogic.gdx.jnigen.runtime.closure.Closure {

        com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] __ffi_cache = new com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(74), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

        void DrawPoint_call(b2Vec2 arg0, float arg1, b2HexColor arg2, VoidPointer arg3);

        default com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(com.badlogic.gdx.jnigen.runtime.ffi.JavaTypeWrapper[] parameters, com.badlogic.gdx.jnigen.runtime.ffi.JavaTypeWrapper returnType) {
            DrawPoint_call(new b2Vec2(parameters[0].asLong(), true), (float) parameters[1].asFloat(), b2HexColor.getByIndex((int) parameters[2].asLong()), new VoidPointer(parameters[3].asLong(), false));
        }
    }

    public interface DrawString extends com.badlogic.gdx.jnigen.runtime.closure.Closure {

        com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] __ffi_cache = new com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(74), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

        void DrawString_call(b2Vec2 arg0, CSizedIntPointer arg1, VoidPointer arg2);

        default com.badlogic.gdx.jnigen.runtime.c.CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(com.badlogic.gdx.jnigen.runtime.ffi.JavaTypeWrapper[] parameters, com.badlogic.gdx.jnigen.runtime.ffi.JavaTypeWrapper returnType) {
            DrawString_call(new b2Vec2(parameters[0].asLong(), true), new CSizedIntPointer(parameters[1].asLong(), false, "const char"), new VoidPointer(parameters[2].asLong(), false));
        }
    }
}
