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
import com.badlogic.gdx.jnigen.runtime.ffi.ClosureEncoder;
import com.badlogic.gdx.box2d.structs.b2Transform;
import com.badlogic.gdx.jnigen.runtime.pointer.CSizedIntPointer;

public final class b2DebugDraw extends Struct {

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
        return CHandler.getClosureObject(getValue(0), DrawPolygon::DrawPolygon_downcall);
    }

    public void DrawPolygon(ClosureObject<DrawPolygon> DrawPolygon) {
        setValue(DrawPolygon.getPointer(), 0);
    }

    public ClosureObject<DrawSolidPolygon> DrawSolidPolygon() {
        return CHandler.getClosureObject(getValue(1), DrawSolidPolygon::DrawSolidPolygon_downcall);
    }

    public void DrawSolidPolygon(ClosureObject<DrawSolidPolygon> DrawSolidPolygon) {
        setValue(DrawSolidPolygon.getPointer(), 1);
    }

    public ClosureObject<DrawCircle> DrawCircle() {
        return CHandler.getClosureObject(getValue(2), DrawCircle::DrawCircle_downcall);
    }

    public void DrawCircle(ClosureObject<DrawCircle> DrawCircle) {
        setValue(DrawCircle.getPointer(), 2);
    }

    public ClosureObject<DrawSolidCircle> DrawSolidCircle() {
        return CHandler.getClosureObject(getValue(3), DrawSolidCircle::DrawSolidCircle_downcall);
    }

    public void DrawSolidCircle(ClosureObject<DrawSolidCircle> DrawSolidCircle) {
        setValue(DrawSolidCircle.getPointer(), 3);
    }

    public ClosureObject<DrawSolidCapsule> DrawSolidCapsule() {
        return CHandler.getClosureObject(getValue(4), DrawSolidCapsule::DrawSolidCapsule_downcall);
    }

    public void DrawSolidCapsule(ClosureObject<DrawSolidCapsule> DrawSolidCapsule) {
        setValue(DrawSolidCapsule.getPointer(), 4);
    }

    public ClosureObject<DrawSegment> DrawSegment() {
        return CHandler.getClosureObject(getValue(5), DrawSegment::DrawSegment_downcall);
    }

    public void DrawSegment(ClosureObject<DrawSegment> DrawSegment) {
        setValue(DrawSegment.getPointer(), 5);
    }

    public ClosureObject<DrawTransform> DrawTransform() {
        return CHandler.getClosureObject(getValue(6), DrawTransform::DrawTransform_downcall);
    }

    public void DrawTransform(ClosureObject<DrawTransform> DrawTransform) {
        setValue(DrawTransform.getPointer(), 6);
    }

    public ClosureObject<DrawPoint> DrawPoint() {
        return CHandler.getClosureObject(getValue(7), DrawPoint::DrawPoint_downcall);
    }

    public void DrawPoint(ClosureObject<DrawPoint> DrawPoint) {
        setValue(DrawPoint.getPointer(), 7);
    }

    public ClosureObject<DrawString> DrawString() {
        return CHandler.getClosureObject(getValue(8), DrawString::DrawString_downcall);
    }

    public void DrawString(ClosureObject<DrawString> DrawString) {
        setValue(DrawString.getPointer(), 8);
    }

    public b2AABB drawingBounds() {
        return __drawingBounds;
    }

    private static final int __drawingBounds_offset = CHandler.getOffsetForField(__ffi_type, 9);

    private final b2AABB __drawingBounds = new b2AABB(getPointer() + __drawingBounds_offset, false);

    public boolean useDrawingBounds() {
        return getValue(10) != 0;
    }

    public void useDrawingBounds(boolean useDrawingBounds) {
        setValue(useDrawingBounds, 10);
    }

    public boolean drawShapes() {
        return getValue(11) != 0;
    }

    public void drawShapes(boolean drawShapes) {
        setValue(drawShapes, 11);
    }

    public boolean drawJoints() {
        return getValue(12) != 0;
    }

    public void drawJoints(boolean drawJoints) {
        setValue(drawJoints, 12);
    }

    public boolean drawJointExtras() {
        return getValue(13) != 0;
    }

    public void drawJointExtras(boolean drawJointExtras) {
        setValue(drawJointExtras, 13);
    }

    public boolean drawAABBs() {
        return getValue(14) != 0;
    }

    public void drawAABBs(boolean drawAABBs) {
        setValue(drawAABBs, 14);
    }

    public boolean drawMass() {
        return getValue(15) != 0;
    }

    public void drawMass(boolean drawMass) {
        setValue(drawMass, 15);
    }

    public boolean drawContacts() {
        return getValue(16) != 0;
    }

    public void drawContacts(boolean drawContacts) {
        setValue(drawContacts, 16);
    }

    public boolean drawGraphColors() {
        return getValue(17) != 0;
    }

    public void drawGraphColors(boolean drawGraphColors) {
        setValue(drawGraphColors, 17);
    }

    public boolean drawContactNormals() {
        return getValue(18) != 0;
    }

    public void drawContactNormals(boolean drawContactNormals) {
        setValue(drawContactNormals, 18);
    }

    public boolean drawContactImpulses() {
        return getValue(19) != 0;
    }

    public void drawContactImpulses(boolean drawContactImpulses) {
        setValue(drawContactImpulses, 19);
    }

    public boolean drawFrictionImpulses() {
        return getValue(20) != 0;
    }

    public void drawFrictionImpulses(boolean drawFrictionImpulses) {
        setValue(drawFrictionImpulses, 20);
    }

    public VoidPointer context() {
        return new VoidPointer(getValue(21), false);
    }

    public void context(VoidPointer context) {
        setValue(context.getPointer(), 21);
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

    public interface DrawPolygon extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

        void DrawPolygon_call(b2Vec2.b2Vec2Pointer arg0, int arg1, b2HexColor arg2, VoidPointer arg3);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            DrawPolygon_call(new b2Vec2.b2Vec2Pointer(parameters[0].asLong(), false), (int) parameters[1].asLong(), b2HexColor.getByIndex((int) parameters[2].asLong()), new VoidPointer(parameters[3].asLong(), false));
        }

        public static DrawPolygon DrawPolygon_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawPolygon.__ffi_cache);
            return (arg0, arg1, arg2, arg3) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                {
                    useEncoder.setValue(0, arg0);
                    useEncoder.setValue(1, arg1);
                    useEncoder.setValue(2, arg2);
                    useEncoder.setValue(3, arg3);
                }
                JavaTypeWrapper returnConvert = new JavaTypeWrapper(DrawPolygon.__ffi_cache[DrawPolygon.__ffi_cache.length - 1]);
                returnConvert.setValue(useEncoder.invoke());
                return;
            };
        }
    }

    public interface DrawSolidPolygon extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(71), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

        void DrawSolidPolygon_call(b2Transform arg0, b2Vec2.b2Vec2Pointer arg1, int arg2, float arg3, b2HexColor arg4, VoidPointer arg5);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            DrawSolidPolygon_call(new b2Transform(parameters[0].asLong(), true), new b2Vec2.b2Vec2Pointer(parameters[1].asLong(), false), (int) parameters[2].asLong(), (float) parameters[3].asFloat(), b2HexColor.getByIndex((int) parameters[4].asLong()), new VoidPointer(parameters[5].asLong(), false));
        }

        public static DrawSolidPolygon DrawSolidPolygon_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawSolidPolygon.__ffi_cache);
            return (arg0, arg1, arg2, arg3, arg4, arg5) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                {
                    useEncoder.setValue(0, arg0);
                    useEncoder.setValue(1, arg1);
                    useEncoder.setValue(2, arg2);
                    useEncoder.setValue(3, arg3);
                    useEncoder.setValue(4, arg4);
                    useEncoder.setValue(5, arg5);
                }
                JavaTypeWrapper returnConvert = new JavaTypeWrapper(DrawSolidPolygon.__ffi_cache[DrawSolidPolygon.__ffi_cache.length - 1]);
                returnConvert.setValue(useEncoder.invoke());
                return;
            };
        }
    }

    public interface DrawCircle extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(74), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

        void DrawCircle_call(b2Vec2 arg0, float arg1, b2HexColor arg2, VoidPointer arg3);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            DrawCircle_call(new b2Vec2(parameters[0].asLong(), true), (float) parameters[1].asFloat(), b2HexColor.getByIndex((int) parameters[2].asLong()), new VoidPointer(parameters[3].asLong(), false));
        }

        public static DrawCircle DrawCircle_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawCircle.__ffi_cache);
            return (arg0, arg1, arg2, arg3) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                {
                    useEncoder.setValue(0, arg0);
                    useEncoder.setValue(1, arg1);
                    useEncoder.setValue(2, arg2);
                    useEncoder.setValue(3, arg3);
                }
                JavaTypeWrapper returnConvert = new JavaTypeWrapper(DrawCircle.__ffi_cache[DrawCircle.__ffi_cache.length - 1]);
                returnConvert.setValue(useEncoder.invoke());
                return;
            };
        }
    }

    public interface DrawSolidCircle extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(71), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

        void DrawSolidCircle_call(b2Transform arg0, float arg1, b2HexColor arg2, VoidPointer arg3);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            DrawSolidCircle_call(new b2Transform(parameters[0].asLong(), true), (float) parameters[1].asFloat(), b2HexColor.getByIndex((int) parameters[2].asLong()), new VoidPointer(parameters[3].asLong(), false));
        }

        public static DrawSolidCircle DrawSolidCircle_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawSolidCircle.__ffi_cache);
            return (arg0, arg1, arg2, arg3) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                {
                    useEncoder.setValue(0, arg0);
                    useEncoder.setValue(1, arg1);
                    useEncoder.setValue(2, arg2);
                    useEncoder.setValue(3, arg3);
                }
                JavaTypeWrapper returnConvert = new JavaTypeWrapper(DrawSolidCircle.__ffi_cache[DrawSolidCircle.__ffi_cache.length - 1]);
                returnConvert.setValue(useEncoder.invoke());
                return;
            };
        }
    }

    public interface DrawSolidCapsule extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(74), FFITypes.getCTypeInfo(74), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

        void DrawSolidCapsule_call(b2Vec2 arg0, b2Vec2 arg1, float arg2, b2HexColor arg3, VoidPointer arg4);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            DrawSolidCapsule_call(new b2Vec2(parameters[0].asLong(), true), new b2Vec2(parameters[1].asLong(), true), (float) parameters[2].asFloat(), b2HexColor.getByIndex((int) parameters[3].asLong()), new VoidPointer(parameters[4].asLong(), false));
        }

        public static DrawSolidCapsule DrawSolidCapsule_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawSolidCapsule.__ffi_cache);
            return (arg0, arg1, arg2, arg3, arg4) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                {
                    useEncoder.setValue(0, arg0);
                    useEncoder.setValue(1, arg1);
                    useEncoder.setValue(2, arg2);
                    useEncoder.setValue(3, arg3);
                    useEncoder.setValue(4, arg4);
                }
                JavaTypeWrapper returnConvert = new JavaTypeWrapper(DrawSolidCapsule.__ffi_cache[DrawSolidCapsule.__ffi_cache.length - 1]);
                returnConvert.setValue(useEncoder.invoke());
                return;
            };
        }
    }

    public interface DrawSegment extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(74), FFITypes.getCTypeInfo(74), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

        void DrawSegment_call(b2Vec2 arg0, b2Vec2 arg1, b2HexColor arg2, VoidPointer arg3);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            DrawSegment_call(new b2Vec2(parameters[0].asLong(), true), new b2Vec2(parameters[1].asLong(), true), b2HexColor.getByIndex((int) parameters[2].asLong()), new VoidPointer(parameters[3].asLong(), false));
        }

        public static DrawSegment DrawSegment_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawSegment.__ffi_cache);
            return (arg0, arg1, arg2, arg3) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                {
                    useEncoder.setValue(0, arg0);
                    useEncoder.setValue(1, arg1);
                    useEncoder.setValue(2, arg2);
                    useEncoder.setValue(3, arg3);
                }
                JavaTypeWrapper returnConvert = new JavaTypeWrapper(DrawSegment.__ffi_cache[DrawSegment.__ffi_cache.length - 1]);
                returnConvert.setValue(useEncoder.invoke());
                return;
            };
        }
    }

    public interface DrawTransform extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(71), FFITypes.getCTypeInfo(-1) };

        void DrawTransform_call(b2Transform arg0, VoidPointer arg1);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            DrawTransform_call(new b2Transform(parameters[0].asLong(), true), new VoidPointer(parameters[1].asLong(), false));
        }

        public static DrawTransform DrawTransform_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawTransform.__ffi_cache);
            return (arg0, arg1) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                {
                    useEncoder.setValue(0, arg0);
                    useEncoder.setValue(1, arg1);
                }
                JavaTypeWrapper returnConvert = new JavaTypeWrapper(DrawTransform.__ffi_cache[DrawTransform.__ffi_cache.length - 1]);
                returnConvert.setValue(useEncoder.invoke());
                return;
            };
        }
    }

    public interface DrawPoint extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(74), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

        void DrawPoint_call(b2Vec2 arg0, float arg1, b2HexColor arg2, VoidPointer arg3);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            DrawPoint_call(new b2Vec2(parameters[0].asLong(), true), (float) parameters[1].asFloat(), b2HexColor.getByIndex((int) parameters[2].asLong()), new VoidPointer(parameters[3].asLong(), false));
        }

        public static DrawPoint DrawPoint_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawPoint.__ffi_cache);
            return (arg0, arg1, arg2, arg3) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                {
                    useEncoder.setValue(0, arg0);
                    useEncoder.setValue(1, arg1);
                    useEncoder.setValue(2, arg2);
                    useEncoder.setValue(3, arg3);
                }
                JavaTypeWrapper returnConvert = new JavaTypeWrapper(DrawPoint.__ffi_cache[DrawPoint.__ffi_cache.length - 1]);
                returnConvert.setValue(useEncoder.invoke());
                return;
            };
        }
    }

    public interface DrawString extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(74), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

        void DrawString_call(b2Vec2 arg0, CSizedIntPointer arg1, VoidPointer arg2);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            DrawString_call(new b2Vec2(parameters[0].asLong(), true), new CSizedIntPointer(parameters[1].asLong(), false, "const char"), new VoidPointer(parameters[2].asLong(), false));
        }

        public static DrawString DrawString_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawString.__ffi_cache);
            return (arg0, arg1, arg2) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                {
                    useEncoder.setValue(0, arg0);
                    useEncoder.setValue(1, arg1);
                    useEncoder.setValue(2, arg2);
                }
                JavaTypeWrapper returnConvert = new JavaTypeWrapper(DrawString.__ffi_cache[DrawString.__ffi_cache.length - 1]);
                returnConvert.setValue(useEncoder.invoke());
                return;
            };
        }
    }
}
