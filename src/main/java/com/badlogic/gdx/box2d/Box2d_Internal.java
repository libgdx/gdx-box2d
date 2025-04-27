package com.badlogic.gdx.box2d;

import com.badlogic.gdx.jnigen.runtime.c.CTypeInfo;
import com.badlogic.gdx.jnigen.runtime.closure.Closure;
import com.badlogic.gdx.jnigen.runtime.mem.BufferPtr;
import com.badlogic.gdx.jnigen.runtime.closure.PointingPoolManager;
import com.badlogic.gdx.box2d.structs.b2DebugDraw.DrawPolygonFcn;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureEncoder;
import com.badlogic.gdx.jnigen.runtime.closure.CClosureObject;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.box2d.enums.b2HexColor;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.structs.b2DebugDraw.DrawSolidPolygonFcn;
import com.badlogic.gdx.box2d.structs.b2Transform;
import com.badlogic.gdx.box2d.structs.b2DebugDraw.DrawCircleFcn;
import com.badlogic.gdx.box2d.structs.b2DebugDraw.DrawSolidCircleFcn;
import com.badlogic.gdx.box2d.structs.b2DebugDraw.DrawSolidCapsuleFcn;
import com.badlogic.gdx.box2d.structs.b2DebugDraw.DrawSegmentFcn;
import com.badlogic.gdx.box2d.structs.b2DebugDraw.DrawTransformFcn;
import com.badlogic.gdx.box2d.structs.b2DebugDraw.DrawPointFcn;
import com.badlogic.gdx.box2d.structs.b2DebugDraw.DrawStringFcn;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.BytePointer;
import com.badlogic.gdx.box2d.Box2d.b2OverlapResultFcn;
import com.badlogic.gdx.box2d.structs.b2ShapeId;
import com.badlogic.gdx.box2d.Box2d.b2TreeQueryCallbackFcn;
import com.badlogic.gdx.box2d.Box2d.b2TaskCallback;
import com.badlogic.gdx.box2d.Box2d.b2EnqueueTaskCallback;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.box2d.Box2d_Internal.b2TaskCallback_Internal;
import com.badlogic.gdx.box2d.Box2d.b2RestitutionCallback;
import com.badlogic.gdx.box2d.Box2d.b2FrictionCallback;
import com.badlogic.gdx.box2d.Box2d.b2CastResultFcn;
import com.badlogic.gdx.box2d.Box2d.b2TreeShapeCastCallbackFcn;
import com.badlogic.gdx.box2d.structs.b2ShapeCastInput;
import com.badlogic.gdx.box2d.Box2d.b2PreSolveFcn;
import com.badlogic.gdx.box2d.structs.b2Manifold;
import com.badlogic.gdx.box2d.Box2d.b2AllocFcn;
import com.badlogic.gdx.box2d.Box2d.b2AssertFcn;
import com.badlogic.gdx.box2d.Box2d.b2CustomFilterFcn;
import com.badlogic.gdx.box2d.Box2d.b2PlaneResultFcn;
import com.badlogic.gdx.box2d.structs.b2PlaneResult;
import com.badlogic.gdx.box2d.Box2d.b2TreeRayCastCallbackFcn;
import com.badlogic.gdx.box2d.structs.b2RayCastInput;
import com.badlogic.gdx.box2d.Box2d.b2FreeFcn;
import com.badlogic.gdx.box2d.Box2d.b2FinishTaskCallback;

public final class Box2d_Internal {

    public final static class b2TreeNode_Internal {
    }

    public final static class b2Sweep_Internal {
    }

    public final static class b2SensorEndTouchEvent_Internal {
    }

    public final static class b2ContactEndTouchEvent_Internal {
    }

    public final static class b2Segment_Internal {
    }

    public final static class b2JointId_Internal {
    }

    public final static class b2ChainSegment_Internal {
    }

    public final static class b2PlaneSolverResult_Internal {
    }

    public final static class b2MotorJointDef_Internal {
    }

    public final static class b2Profile_Internal {
    }

    public final static class b2Counters_Internal {
    }

    public final static class b2SensorEvents_Internal {
    }

    public final static class b2RayResult_Internal {
    }

    public final static class b2CastOutput_Internal {
    }

    public final static class b2ContactBeginTouchEvent_Internal {
    }

    public final static class b2DynamicTree_Internal {
    }

    public final static class b2FilterJointDef_Internal {
    }

    public final static class b2WheelJointDef_Internal {
    }

    public final static class b2ContactData_Internal {
    }

    public final static class b2SegmentDistanceResult_Internal {
    }

    public final static class b2BodyId_Internal {
    }

    public final static class b2WeldJointDef_Internal {
    }

    public final static class b2Manifold_Internal {
    }

    public final static class b2Plane_Internal {
    }

    public final static class b2ShapeCastInput_Internal {
    }

    public final static class b2SurfaceMaterial_Internal {
    }

    public final static class b2RevoluteJointDef_Internal {
    }

    public final static class b2Capsule_Internal {
    }

    public final static class b2Transform_Internal {
    }

    public final static class b2MouseJointDef_Internal {
    }

    public final static class b2Mat22_Internal {
    }

    public final static class b2CollisionPlane_Internal {
    }

    public final static class b2Filter_Internal {
    }

    public final static class b2ShapeProxy_Internal {
    }

    public final static class b2ShapeDef_Internal {
    }

    public final static class b2ShapeId_Internal {
    }

    public final static class b2Polygon_Internal {
    }

    public final static class b2WorldDef_Internal {
    }

    public final static class b2ManifoldPoint_Internal {
    }

    public final static class b2ChainDef_Internal {
    }

    public final static class b2ContactEvents_Internal {
    }

    public final static class b2BodyMoveEvent_Internal {
    }

    public final static class b2MassData_Internal {
    }

    public final static class b2SimplexVertex_Internal {
    }

    public final static class b2TOIOutput_Internal {
    }

    public final static class b2CosSin_Internal {
    }

    public final static class b2WorldId_Internal {
    }

    public final static class b2PrismaticJointDef_Internal {
    }

    public final static class b2Rot_Internal {
    }

    public final static class b2SimplexCache_Internal {
    }

    public final static class b2SensorBeginTouchEvent_Internal {
    }

    public final static class b2Hull_Internal {
    }

    public final static class b2ChainId_Internal {
    }

    public final static class b2RayCastInput_Internal {
    }

    public final static class b2DistanceOutput_Internal {
    }

    public final static class b2TreeStats_Internal {
    }

    public final static class b2Simplex_Internal {
    }

    public final static class b2ContactHitEvent_Internal {
    }

    public final static class b2Vec2_Internal {
    }

    public final static class b2AABB_Internal {
    }

    public final static class b2PlaneResult_Internal {
    }

    public final static class b2DistanceInput_Internal {
    }

    public final static class b2ShapeCastPairInput_Internal {
    }

    public final static class b2BodyEvents_Internal {
    }

    public final static class b2Version_Internal {
    }

    public final static class b2TOIInput_Internal {
    }

    public final static class b2BodyDef_Internal {
    }

    public final static class b2DebugDraw_Internal {

        public interface DrawPolygonFcn_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(10), FFITypes.getCTypeInfo(-1) };

            void DrawPolygonFcn_call(b2Vec2.b2Vec2Pointer vertices, int vertexCount, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                DrawPolygonFcn_call(new b2Vec2.b2Vec2Pointer(buf.getNativePointer(0), false), buf.getInt(CHandler.IS_64_BIT ? 8 : 4), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 12 : 8)), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 12), false));
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                DrawPolygonFcn_call(manager.getPointing(b2Vec2.b2Vec2Pointer.class, buf.getNativePointer(0)), buf.getInt(CHandler.IS_64_BIT ? 8 : 4), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 12 : 8)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 12)));
            }

            public static CClosureObject<DrawPolygonFcn> DrawPolygonFcn_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((vertices, vertexCount, color, context) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, vertices.getPointer());
                    bufPtr.setInt(CHandler.IS_64_BIT ? 8 : 4, vertexCount);
                    bufPtr.setUInt(CHandler.IS_64_BIT ? 12 : 8, color.getIndex());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 12, context.getPointer());
                    encoder.invoke(bufPtr);
                }, fnPtr, encoder);
            }
        }

        public interface DrawSolidPolygonFcn_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(74), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(10), FFITypes.getCTypeInfo(-1) };

            void DrawSolidPolygonFcn_call(b2Transform transform, b2Vec2.b2Vec2Pointer vertices, int vertexCount, float radius, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                DrawSolidPolygonFcn_call(new b2Transform(buf.getNativePointer(0), true), new b2Vec2.b2Vec2Pointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), buf.getInt(CHandler.IS_64_BIT ? 16 : 8), buf.getFloat(CHandler.IS_64_BIT ? 20 : 12), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 24 : 16)), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 28 : 20), false));
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                DrawSolidPolygonFcn_call(manager.getPointing(b2Transform.class, buf.getNativePointer(0)), manager.getPointing(b2Vec2.b2Vec2Pointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), buf.getInt(CHandler.IS_64_BIT ? 16 : 8), buf.getFloat(CHandler.IS_64_BIT ? 20 : 12), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 24 : 16)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 28 : 20)));
            }

            public static CClosureObject<DrawSolidPolygonFcn> DrawSolidPolygonFcn_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((transform, vertices, vertexCount, radius, color, context) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, transform.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, vertices.getPointer());
                    bufPtr.setInt(CHandler.IS_64_BIT ? 16 : 8, vertexCount);
                    bufPtr.setFloat(CHandler.IS_64_BIT ? 20 : 12, radius);
                    bufPtr.setUInt(CHandler.IS_64_BIT ? 24 : 16, color.getIndex());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 28 : 20, context.getPointer());
                    encoder.invoke(bufPtr);
                }, fnPtr, encoder);
            }
        }

        public interface DrawCircleFcn_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(77), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(10), FFITypes.getCTypeInfo(-1) };

            void DrawCircleFcn_call(b2Vec2 center, float radius, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                DrawCircleFcn_call(new b2Vec2(buf.getNativePointer(0), true), buf.getFloat(CHandler.IS_64_BIT ? 8 : 4), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 12 : 8)), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 12), false));
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                DrawCircleFcn_call(manager.getPointing(b2Vec2.class, buf.getNativePointer(0)), buf.getFloat(CHandler.IS_64_BIT ? 8 : 4), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 12 : 8)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 12)));
            }

            public static CClosureObject<DrawCircleFcn> DrawCircleFcn_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((center, radius, color, context) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, center.getPointer());
                    bufPtr.setFloat(CHandler.IS_64_BIT ? 8 : 4, radius);
                    bufPtr.setUInt(CHandler.IS_64_BIT ? 12 : 8, color.getIndex());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 12, context.getPointer());
                    encoder.invoke(bufPtr);
                }, fnPtr, encoder);
            }
        }

        public interface DrawSolidCircleFcn_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(74), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(10), FFITypes.getCTypeInfo(-1) };

            void DrawSolidCircleFcn_call(b2Transform transform, float radius, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                DrawSolidCircleFcn_call(new b2Transform(buf.getNativePointer(0), true), buf.getFloat(CHandler.IS_64_BIT ? 8 : 4), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 12 : 8)), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 12), false));
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                DrawSolidCircleFcn_call(manager.getPointing(b2Transform.class, buf.getNativePointer(0)), buf.getFloat(CHandler.IS_64_BIT ? 8 : 4), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 12 : 8)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 12)));
            }

            public static CClosureObject<DrawSolidCircleFcn> DrawSolidCircleFcn_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((transform, radius, color, context) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, transform.getPointer());
                    bufPtr.setFloat(CHandler.IS_64_BIT ? 8 : 4, radius);
                    bufPtr.setUInt(CHandler.IS_64_BIT ? 12 : 8, color.getIndex());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 12, context.getPointer());
                    encoder.invoke(bufPtr);
                }, fnPtr, encoder);
            }
        }

        public interface DrawSolidCapsuleFcn_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(77), FFITypes.getCTypeInfo(77), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(10), FFITypes.getCTypeInfo(-1) };

            void DrawSolidCapsuleFcn_call(b2Vec2 p1, b2Vec2 p2, float radius, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                DrawSolidCapsuleFcn_call(new b2Vec2(buf.getNativePointer(0), true), new b2Vec2(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), true), buf.getFloat(CHandler.IS_64_BIT ? 16 : 8), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 20 : 12)), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 16), false));
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                DrawSolidCapsuleFcn_call(manager.getPointing(b2Vec2.class, buf.getNativePointer(0)), manager.getPointing(b2Vec2.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), buf.getFloat(CHandler.IS_64_BIT ? 16 : 8), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 20 : 12)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 16)));
            }

            public static CClosureObject<DrawSolidCapsuleFcn> DrawSolidCapsuleFcn_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((p1, p2, radius, color, context) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, p1.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, p2.getPointer());
                    bufPtr.setFloat(CHandler.IS_64_BIT ? 16 : 8, radius);
                    bufPtr.setUInt(CHandler.IS_64_BIT ? 20 : 12, color.getIndex());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 24 : 16, context.getPointer());
                    encoder.invoke(bufPtr);
                }, fnPtr, encoder);
            }
        }

        public interface DrawSegmentFcn_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(77), FFITypes.getCTypeInfo(77), FFITypes.getCTypeInfo(10), FFITypes.getCTypeInfo(-1) };

            void DrawSegmentFcn_call(b2Vec2 p1, b2Vec2 p2, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                DrawSegmentFcn_call(new b2Vec2(buf.getNativePointer(0), true), new b2Vec2(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), true), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 16 : 8)), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 20 : 12), false));
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                DrawSegmentFcn_call(manager.getPointing(b2Vec2.class, buf.getNativePointer(0)), manager.getPointing(b2Vec2.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 16 : 8)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 20 : 12)));
            }

            public static CClosureObject<DrawSegmentFcn> DrawSegmentFcn_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((p1, p2, color, context) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, p1.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, p2.getPointer());
                    bufPtr.setUInt(CHandler.IS_64_BIT ? 16 : 8, color.getIndex());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 20 : 12, context.getPointer());
                    encoder.invoke(bufPtr);
                }, fnPtr, encoder);
            }
        }

        public interface DrawTransformFcn_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(74), FFITypes.getCTypeInfo(-1) };

            void DrawTransformFcn_call(b2Transform transform, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                DrawTransformFcn_call(new b2Transform(buf.getNativePointer(0), true), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false));
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                DrawTransformFcn_call(manager.getPointing(b2Transform.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)));
            }

            public static CClosureObject<DrawTransformFcn> DrawTransformFcn_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((transform, context) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, transform.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, context.getPointer());
                    encoder.invoke(bufPtr);
                }, fnPtr, encoder);
            }
        }

        public interface DrawPointFcn_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(77), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(10), FFITypes.getCTypeInfo(-1) };

            void DrawPointFcn_call(b2Vec2 p, float size, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                DrawPointFcn_call(new b2Vec2(buf.getNativePointer(0), true), buf.getFloat(CHandler.IS_64_BIT ? 8 : 4), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 12 : 8)), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 12), false));
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                DrawPointFcn_call(manager.getPointing(b2Vec2.class, buf.getNativePointer(0)), buf.getFloat(CHandler.IS_64_BIT ? 8 : 4), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 12 : 8)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 12)));
            }

            public static CClosureObject<DrawPointFcn> DrawPointFcn_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((p, size, color, context) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, p.getPointer());
                    bufPtr.setFloat(CHandler.IS_64_BIT ? 8 : 4, size);
                    bufPtr.setUInt(CHandler.IS_64_BIT ? 12 : 8, color.getIndex());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 12, context.getPointer());
                    encoder.invoke(bufPtr);
                }, fnPtr, encoder);
            }
        }

        public interface DrawStringFcn_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(77), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(10), FFITypes.getCTypeInfo(-1) };

            void DrawStringFcn_call(b2Vec2 p, BytePointer s, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                DrawStringFcn_call(new b2Vec2(buf.getNativePointer(0), true), new BytePointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 16 : 8)), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 20 : 12), false));
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                DrawStringFcn_call(manager.getPointing(b2Vec2.class, buf.getNativePointer(0)), manager.getPointing(BytePointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 16 : 8)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 20 : 12)));
            }

            public static CClosureObject<DrawStringFcn> DrawStringFcn_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((p, s, color, context) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, p.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, s.getPointer());
                    bufPtr.setUInt(CHandler.IS_64_BIT ? 16 : 8, color.getIndex());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 20 : 12, context.getPointer());
                    encoder.invoke(bufPtr);
                }, fnPtr, encoder);
            }
        }
    }

    public final static class b2DistanceJointDef_Internal {
    }

    public final static class b2Circle_Internal {
    }

    public final static class b2QueryFilter_Internal {
    }

    public final static class b2ExplosionDef_Internal {
    }

    public interface b2OverlapResultFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(0), FFITypes.getCTypeInfo(65), FFITypes.getCTypeInfo(-1) };

        boolean b2OverlapResultFcn_call(b2ShapeId shapeId, VoidPointer context);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setBoolean(0, b2OverlapResultFcn_call(new b2ShapeId(buf.getNativePointer(0), true), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false)));
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            buf.setBoolean(0, b2OverlapResultFcn_call(manager.getPointing(b2ShapeId.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4))));
        }

        public static CClosureObject<b2OverlapResultFcn> b2OverlapResultFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((shapeId, context) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, shapeId.getPointer());
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, context.getPointer());
                encoder.invoke(bufPtr);
                boolean _retPar = bufPtr.getBoolean(CHandler.IS_64_BIT ? 16 : 8);
                encoder.finish(bufPtr);
                return _retPar;
            }, fnPtr, encoder);
        }
    }

    public interface b2TreeQueryCallbackFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(0), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(8), FFITypes.getCTypeInfo(-1) };

        boolean b2TreeQueryCallbackFcn_call(int proxyId, long userData, VoidPointer context);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setBoolean(0, b2TreeQueryCallbackFcn_call(buf.getInt(0), buf.getLong(4), new VoidPointer(buf.getNativePointer(12), false)));
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            buf.setBoolean(0, b2TreeQueryCallbackFcn_call(buf.getInt(0), buf.getLong(4), manager.getPointing(VoidPointer.class, buf.getNativePointer(12))));
        }

        public static CClosureObject<b2TreeQueryCallbackFcn> b2TreeQueryCallbackFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((proxyId, userData, context) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setInt(0, proxyId);
                bufPtr.setLong(4, userData);
                bufPtr.setNativePointer(12, context.getPointer());
                encoder.invoke(bufPtr);
                boolean _retPar = bufPtr.getBoolean(CHandler.IS_64_BIT ? 20 : 16);
                encoder.finish(bufPtr);
                return _retPar;
            }, fnPtr, encoder);
        }
    }

    public interface b2TaskCallback_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(7), FFITypes.getCTypeInfo(-1) };

        void b2TaskCallback_call(int startIndex, int endIndex, long workerIndex, VoidPointer taskContext);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            b2TaskCallback_call(buf.getInt(0), buf.getInt(4), buf.getUInt(8), new VoidPointer(buf.getNativePointer(12), false));
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            b2TaskCallback_call(buf.getInt(0), buf.getInt(4), buf.getUInt(8), manager.getPointing(VoidPointer.class, buf.getNativePointer(12)));
        }

        public static CClosureObject<b2TaskCallback> b2TaskCallback_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((startIndex, endIndex, workerIndex, taskContext) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setInt(0, startIndex);
                bufPtr.setInt(4, endIndex);
                bufPtr.setUInt(8, workerIndex);
                bufPtr.setNativePointer(12, taskContext.getPointer());
                encoder.invoke(bufPtr);
            }, fnPtr, encoder);
        }
    }

    public interface b2EnqueueTaskCallback_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

        VoidPointer b2EnqueueTaskCallback_call(ClosureObject<b2TaskCallback> task, int itemCount, int minRange, VoidPointer taskContext, VoidPointer userContext);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setNativePointer(0, b2EnqueueTaskCallback_call(CHandler.getClosureObject(buf.getNativePointer(0), b2TaskCallback_Internal::b2TaskCallback_downcall), buf.getInt(CHandler.IS_64_BIT ? 8 : 4), buf.getInt(CHandler.IS_64_BIT ? 12 : 8), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 12), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 16), false)).getPointer());
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            buf.setNativePointer(0, b2EnqueueTaskCallback_call(CHandler.getClosureObject(buf.getNativePointer(0), b2TaskCallback_Internal::b2TaskCallback_downcall), buf.getInt(CHandler.IS_64_BIT ? 8 : 4), buf.getInt(CHandler.IS_64_BIT ? 12 : 8), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 12)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 16))).getPointer());
        }

        public static CClosureObject<b2EnqueueTaskCallback> b2EnqueueTaskCallback_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((task, itemCount, minRange, taskContext, userContext) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, task.getPointer());
                bufPtr.setInt(CHandler.IS_64_BIT ? 8 : 4, itemCount);
                bufPtr.setInt(CHandler.IS_64_BIT ? 12 : 8, minRange);
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 12, taskContext.getPointer());
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 24 : 16, userContext.getPointer());
                encoder.invoke(bufPtr);
                VoidPointer _retPar = new VoidPointer(bufPtr.getNativePointer(CHandler.IS_64_BIT ? 32 : 20), false);
                encoder.finish(bufPtr);
                return _retPar;
            }, fnPtr, encoder);
        }
    }

    public interface b2RestitutionCallback_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(4) };

        float b2RestitutionCallback_call(float restitutionA, int userMaterialIdA, float restitutionB, int userMaterialIdB);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setFloat(0, b2RestitutionCallback_call(buf.getFloat(0), buf.getInt(4), buf.getFloat(8), buf.getInt(12)));
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            buf.setFloat(0, b2RestitutionCallback_call(buf.getFloat(0), buf.getInt(4), buf.getFloat(8), buf.getInt(12)));
        }

        public static CClosureObject<b2RestitutionCallback> b2RestitutionCallback_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((restitutionA, userMaterialIdA, restitutionB, userMaterialIdB) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setFloat(0, restitutionA);
                bufPtr.setInt(4, userMaterialIdA);
                bufPtr.setFloat(8, restitutionB);
                bufPtr.setInt(12, userMaterialIdB);
                encoder.invoke(bufPtr);
                float _retPar = bufPtr.getFloat(16);
                encoder.finish(bufPtr);
                return _retPar;
            }, fnPtr, encoder);
        }
    }

    public interface b2FrictionCallback_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(4) };

        float b2FrictionCallback_call(float frictionA, int userMaterialIdA, float frictionB, int userMaterialIdB);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setFloat(0, b2FrictionCallback_call(buf.getFloat(0), buf.getInt(4), buf.getFloat(8), buf.getInt(12)));
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            buf.setFloat(0, b2FrictionCallback_call(buf.getFloat(0), buf.getInt(4), buf.getFloat(8), buf.getInt(12)));
        }

        public static CClosureObject<b2FrictionCallback> b2FrictionCallback_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((frictionA, userMaterialIdA, frictionB, userMaterialIdB) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setFloat(0, frictionA);
                bufPtr.setInt(4, userMaterialIdA);
                bufPtr.setFloat(8, frictionB);
                bufPtr.setInt(12, userMaterialIdB);
                encoder.invoke(bufPtr);
                float _retPar = bufPtr.getFloat(16);
                encoder.finish(bufPtr);
                return _retPar;
            }, fnPtr, encoder);
        }
    }

    public interface b2CastResultFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(65), FFITypes.getCTypeInfo(77), FFITypes.getCTypeInfo(77), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(-1) };

        float b2CastResultFcn_call(b2ShapeId shapeId, b2Vec2 point, b2Vec2 normal, float fraction, VoidPointer context);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setFloat(0, b2CastResultFcn_call(new b2ShapeId(buf.getNativePointer(0), true), new b2Vec2(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), true), new b2Vec2(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8), true), buf.getFloat(CHandler.IS_64_BIT ? 24 : 12), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 28 : 16), false)));
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            buf.setFloat(0, b2CastResultFcn_call(manager.getPointing(b2ShapeId.class, buf.getNativePointer(0)), manager.getPointing(b2Vec2.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), manager.getPointing(b2Vec2.class, buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8)), buf.getFloat(CHandler.IS_64_BIT ? 24 : 12), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 28 : 16))));
        }

        public static CClosureObject<b2CastResultFcn> b2CastResultFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((shapeId, point, normal, fraction, context) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, shapeId.getPointer());
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, point.getPointer());
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 8, normal.getPointer());
                bufPtr.setFloat(CHandler.IS_64_BIT ? 24 : 12, fraction);
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 28 : 16, context.getPointer());
                encoder.invoke(bufPtr);
                float _retPar = bufPtr.getFloat(CHandler.IS_64_BIT ? 36 : 20);
                encoder.finish(bufPtr);
                return _retPar;
            }, fnPtr, encoder);
        }
    }

    public interface b2TreeShapeCastCallbackFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(8), FFITypes.getCTypeInfo(-1) };

        float b2TreeShapeCastCallbackFcn_call(b2ShapeCastInput.b2ShapeCastInputPointer input, int proxyId, long userData, VoidPointer context);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setFloat(0, b2TreeShapeCastCallbackFcn_call(new b2ShapeCastInput.b2ShapeCastInputPointer(buf.getNativePointer(0), false), buf.getInt(CHandler.IS_64_BIT ? 8 : 4), buf.getLong(CHandler.IS_64_BIT ? 12 : 8), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 20 : 16), false)));
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            buf.setFloat(0, b2TreeShapeCastCallbackFcn_call(manager.getPointing(b2ShapeCastInput.b2ShapeCastInputPointer.class, buf.getNativePointer(0)), buf.getInt(CHandler.IS_64_BIT ? 8 : 4), buf.getLong(CHandler.IS_64_BIT ? 12 : 8), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 20 : 16))));
        }

        public static CClosureObject<b2TreeShapeCastCallbackFcn> b2TreeShapeCastCallbackFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((input, proxyId, userData, context) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, input.getPointer());
                bufPtr.setInt(CHandler.IS_64_BIT ? 8 : 4, proxyId);
                bufPtr.setLong(CHandler.IS_64_BIT ? 12 : 8, userData);
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 20 : 16, context.getPointer());
                encoder.invoke(bufPtr);
                float _retPar = bufPtr.getFloat(CHandler.IS_64_BIT ? 28 : 20);
                encoder.finish(bufPtr);
                return _retPar;
            }, fnPtr, encoder);
        }
    }

    public interface b2PreSolveFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(0), FFITypes.getCTypeInfo(65), FFITypes.getCTypeInfo(65), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

        boolean b2PreSolveFcn_call(b2ShapeId shapeIdA, b2ShapeId shapeIdB, b2Manifold.b2ManifoldPointer manifold, VoidPointer context);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setBoolean(0, b2PreSolveFcn_call(new b2ShapeId(buf.getNativePointer(0), true), new b2ShapeId(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), true), new b2Manifold.b2ManifoldPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 12), false)));
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            buf.setBoolean(0, b2PreSolveFcn_call(manager.getPointing(b2ShapeId.class, buf.getNativePointer(0)), manager.getPointing(b2ShapeId.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), manager.getPointing(b2Manifold.b2ManifoldPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 12))));
        }

        public static CClosureObject<b2PreSolveFcn> b2PreSolveFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((shapeIdA, shapeIdB, manifold, context) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, shapeIdA.getPointer());
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, shapeIdB.getPointer());
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 8, manifold.getPointer());
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 24 : 12, context.getPointer());
                encoder.invoke(bufPtr);
                boolean _retPar = bufPtr.getBoolean(CHandler.IS_64_BIT ? 32 : 16);
                encoder.finish(bufPtr);
                return _retPar;
            }, fnPtr, encoder);
        }
    }

    public interface b2AllocFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(10), FFITypes.getCTypeInfo(4) };

        VoidPointer b2AllocFcn_call(long size, int alignment);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setNativePointer(0, b2AllocFcn_call(buf.getUInt(0), buf.getInt(4)).getPointer());
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            buf.setNativePointer(0, b2AllocFcn_call(buf.getUInt(0), buf.getInt(4)).getPointer());
        }

        public static CClosureObject<b2AllocFcn> b2AllocFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((size, alignment) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setUInt(0, size);
                bufPtr.setInt(4, alignment);
                encoder.invoke(bufPtr);
                VoidPointer _retPar = new VoidPointer(bufPtr.getNativePointer(8), false);
                encoder.finish(bufPtr);
                return _retPar;
            }, fnPtr, encoder);
        }
    }

    public interface b2AssertFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(4) };

        int b2AssertFcn_call(BytePointer condition, BytePointer fileName, int lineNumber);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setInt(0, b2AssertFcn_call(new BytePointer(buf.getNativePointer(0), false), new BytePointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), buf.getInt(CHandler.IS_64_BIT ? 16 : 8)));
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            buf.setInt(0, b2AssertFcn_call(manager.getPointing(BytePointer.class, buf.getNativePointer(0)), manager.getPointing(BytePointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), buf.getInt(CHandler.IS_64_BIT ? 16 : 8)));
        }

        public static CClosureObject<b2AssertFcn> b2AssertFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((condition, fileName, lineNumber) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, condition.getPointer());
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, fileName.getPointer());
                bufPtr.setInt(CHandler.IS_64_BIT ? 16 : 8, lineNumber);
                encoder.invoke(bufPtr);
                int _retPar = bufPtr.getInt(CHandler.IS_64_BIT ? 20 : 12);
                encoder.finish(bufPtr);
                return _retPar;
            }, fnPtr, encoder);
        }
    }

    public interface b2CustomFilterFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(0), FFITypes.getCTypeInfo(65), FFITypes.getCTypeInfo(65), FFITypes.getCTypeInfo(-1) };

        boolean b2CustomFilterFcn_call(b2ShapeId shapeIdA, b2ShapeId shapeIdB, VoidPointer context);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setBoolean(0, b2CustomFilterFcn_call(new b2ShapeId(buf.getNativePointer(0), true), new b2ShapeId(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), true), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false)));
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            buf.setBoolean(0, b2CustomFilterFcn_call(manager.getPointing(b2ShapeId.class, buf.getNativePointer(0)), manager.getPointing(b2ShapeId.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8))));
        }

        public static CClosureObject<b2CustomFilterFcn> b2CustomFilterFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((shapeIdA, shapeIdB, context) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, shapeIdA.getPointer());
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, shapeIdB.getPointer());
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 8, context.getPointer());
                encoder.invoke(bufPtr);
                boolean _retPar = bufPtr.getBoolean(CHandler.IS_64_BIT ? 24 : 12);
                encoder.finish(bufPtr);
                return _retPar;
            }, fnPtr, encoder);
        }
    }

    public interface b2PlaneResultFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(0), FFITypes.getCTypeInfo(65), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

        boolean b2PlaneResultFcn_call(b2ShapeId shapeId, b2PlaneResult.b2PlaneResultPointer plane, VoidPointer context);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setBoolean(0, b2PlaneResultFcn_call(new b2ShapeId(buf.getNativePointer(0), true), new b2PlaneResult.b2PlaneResultPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false)));
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            buf.setBoolean(0, b2PlaneResultFcn_call(manager.getPointing(b2ShapeId.class, buf.getNativePointer(0)), manager.getPointing(b2PlaneResult.b2PlaneResultPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8))));
        }

        public static CClosureObject<b2PlaneResultFcn> b2PlaneResultFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((shapeId, plane, context) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, shapeId.getPointer());
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, plane.getPointer());
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 8, context.getPointer());
                encoder.invoke(bufPtr);
                boolean _retPar = bufPtr.getBoolean(CHandler.IS_64_BIT ? 24 : 12);
                encoder.finish(bufPtr);
                return _retPar;
            }, fnPtr, encoder);
        }
    }

    public interface b2TreeRayCastCallbackFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(8), FFITypes.getCTypeInfo(-1) };

        float b2TreeRayCastCallbackFcn_call(b2RayCastInput.b2RayCastInputPointer input, int proxyId, long userData, VoidPointer context);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setFloat(0, b2TreeRayCastCallbackFcn_call(new b2RayCastInput.b2RayCastInputPointer(buf.getNativePointer(0), false), buf.getInt(CHandler.IS_64_BIT ? 8 : 4), buf.getLong(CHandler.IS_64_BIT ? 12 : 8), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 20 : 16), false)));
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            buf.setFloat(0, b2TreeRayCastCallbackFcn_call(manager.getPointing(b2RayCastInput.b2RayCastInputPointer.class, buf.getNativePointer(0)), buf.getInt(CHandler.IS_64_BIT ? 8 : 4), buf.getLong(CHandler.IS_64_BIT ? 12 : 8), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 20 : 16))));
        }

        public static CClosureObject<b2TreeRayCastCallbackFcn> b2TreeRayCastCallbackFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((input, proxyId, userData, context) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, input.getPointer());
                bufPtr.setInt(CHandler.IS_64_BIT ? 8 : 4, proxyId);
                bufPtr.setLong(CHandler.IS_64_BIT ? 12 : 8, userData);
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 20 : 16, context.getPointer());
                encoder.invoke(bufPtr);
                float _retPar = bufPtr.getFloat(CHandler.IS_64_BIT ? 28 : 20);
                encoder.finish(bufPtr);
                return _retPar;
            }, fnPtr, encoder);
        }
    }

    public interface b2FreeFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(-1) };

        void b2FreeFcn_call(VoidPointer mem);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            b2FreeFcn_call(new VoidPointer(buf.getNativePointer(0), false));
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            b2FreeFcn_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)));
        }

        public static CClosureObject<b2FreeFcn> b2FreeFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((mem) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, mem.getPointer());
                encoder.invoke(bufPtr);
            }, fnPtr, encoder);
        }
    }

    public interface b2FinishTaskCallback_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

        void b2FinishTaskCallback_call(VoidPointer userTask, VoidPointer userContext);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            b2FinishTaskCallback_call(new VoidPointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false));
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            b2FinishTaskCallback_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)));
        }

        public static CClosureObject<b2FinishTaskCallback> b2FinishTaskCallback_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((userTask, userContext) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, userTask.getPointer());
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, userContext.getPointer());
                encoder.invoke(bufPtr);
            }, fnPtr, encoder);
        }
    }
}
