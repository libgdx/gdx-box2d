package com.badlogic.gdx.box2d;

import com.badlogic.gdx.jnigen.runtime.c.CTypeInfo;
import com.badlogic.gdx.jnigen.runtime.closure.Closure;
import com.badlogic.gdx.jnigen.runtime.mem.BufferPtr;
import com.badlogic.gdx.box2d.structs.b2DebugDraw.DrawPolygonFcn;
import com.badlogic.gdx.jnigen.runtime.ffi.ClosureEncoder;
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
                DrawPolygonFcn_call(new b2Vec2.b2Vec2Pointer(buf.getNativePointer(0), false), buf.getInt(CHandler.IS_32_BIT ? 4 : 8), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_32_BIT ? 8 : 12)), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 12 : 16), false));
            }

            public static DrawPolygonFcn DrawPolygonFcn_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawPolygonFcn_Internal.__ffi_cache);
                return (vertices, vertexCount, color, context) -> {
                    ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                    useEncoder.getBufPtr().setNativePointer(0, vertices.getPointer());
                    useEncoder.getBufPtr().setInt(CHandler.IS_32_BIT ? 4 : 8, vertexCount);
                    useEncoder.getBufPtr().setUInt(CHandler.IS_32_BIT ? 8 : 12, color.getIndex());
                    useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 12 : 16, context.getPointer());
                    useEncoder.invoke();
                };
            }
        }

        public interface DrawSolidPolygonFcn_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(74), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(10), FFITypes.getCTypeInfo(-1) };

            void DrawSolidPolygonFcn_call(b2Transform transform, b2Vec2.b2Vec2Pointer vertices, int vertexCount, float radius, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                DrawSolidPolygonFcn_call(new b2Transform(buf.getNativePointer(0), true), new b2Vec2.b2Vec2Pointer(buf.getNativePointer(CHandler.IS_32_BIT ? 4 : 8), false), buf.getInt(CHandler.IS_32_BIT ? 8 : 16), buf.getFloat(CHandler.IS_32_BIT ? 12 : 20), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_32_BIT ? 16 : 24)), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 20 : 28), false));
            }

            public static DrawSolidPolygonFcn DrawSolidPolygonFcn_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawSolidPolygonFcn_Internal.__ffi_cache);
                return (transform, vertices, vertexCount, radius, color, context) -> {
                    ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                    useEncoder.getBufPtr().setNativePointer(0, transform.getPointer());
                    useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 4 : 8, vertices.getPointer());
                    useEncoder.getBufPtr().setInt(CHandler.IS_32_BIT ? 8 : 16, vertexCount);
                    useEncoder.getBufPtr().setFloat(CHandler.IS_32_BIT ? 12 : 20, radius);
                    useEncoder.getBufPtr().setUInt(CHandler.IS_32_BIT ? 16 : 24, color.getIndex());
                    useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 20 : 28, context.getPointer());
                    useEncoder.invoke();
                };
            }
        }

        public interface DrawCircleFcn_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(77), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(10), FFITypes.getCTypeInfo(-1) };

            void DrawCircleFcn_call(b2Vec2 center, float radius, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                DrawCircleFcn_call(new b2Vec2(buf.getNativePointer(0), true), buf.getFloat(CHandler.IS_32_BIT ? 4 : 8), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_32_BIT ? 8 : 12)), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 12 : 16), false));
            }

            public static DrawCircleFcn DrawCircleFcn_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawCircleFcn_Internal.__ffi_cache);
                return (center, radius, color, context) -> {
                    ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                    useEncoder.getBufPtr().setNativePointer(0, center.getPointer());
                    useEncoder.getBufPtr().setFloat(CHandler.IS_32_BIT ? 4 : 8, radius);
                    useEncoder.getBufPtr().setUInt(CHandler.IS_32_BIT ? 8 : 12, color.getIndex());
                    useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 12 : 16, context.getPointer());
                    useEncoder.invoke();
                };
            }
        }

        public interface DrawSolidCircleFcn_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(74), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(10), FFITypes.getCTypeInfo(-1) };

            void DrawSolidCircleFcn_call(b2Transform transform, float radius, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                DrawSolidCircleFcn_call(new b2Transform(buf.getNativePointer(0), true), buf.getFloat(CHandler.IS_32_BIT ? 4 : 8), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_32_BIT ? 8 : 12)), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 12 : 16), false));
            }

            public static DrawSolidCircleFcn DrawSolidCircleFcn_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawSolidCircleFcn_Internal.__ffi_cache);
                return (transform, radius, color, context) -> {
                    ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                    useEncoder.getBufPtr().setNativePointer(0, transform.getPointer());
                    useEncoder.getBufPtr().setFloat(CHandler.IS_32_BIT ? 4 : 8, radius);
                    useEncoder.getBufPtr().setUInt(CHandler.IS_32_BIT ? 8 : 12, color.getIndex());
                    useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 12 : 16, context.getPointer());
                    useEncoder.invoke();
                };
            }
        }

        public interface DrawSolidCapsuleFcn_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(77), FFITypes.getCTypeInfo(77), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(10), FFITypes.getCTypeInfo(-1) };

            void DrawSolidCapsuleFcn_call(b2Vec2 p1, b2Vec2 p2, float radius, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                DrawSolidCapsuleFcn_call(new b2Vec2(buf.getNativePointer(0), true), new b2Vec2(buf.getNativePointer(CHandler.IS_32_BIT ? 4 : 8), true), buf.getFloat(CHandler.IS_32_BIT ? 8 : 16), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_32_BIT ? 12 : 20)), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 16 : 24), false));
            }

            public static DrawSolidCapsuleFcn DrawSolidCapsuleFcn_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawSolidCapsuleFcn_Internal.__ffi_cache);
                return (p1, p2, radius, color, context) -> {
                    ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                    useEncoder.getBufPtr().setNativePointer(0, p1.getPointer());
                    useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 4 : 8, p2.getPointer());
                    useEncoder.getBufPtr().setFloat(CHandler.IS_32_BIT ? 8 : 16, radius);
                    useEncoder.getBufPtr().setUInt(CHandler.IS_32_BIT ? 12 : 20, color.getIndex());
                    useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 16 : 24, context.getPointer());
                    useEncoder.invoke();
                };
            }
        }

        public interface DrawSegmentFcn_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(77), FFITypes.getCTypeInfo(77), FFITypes.getCTypeInfo(10), FFITypes.getCTypeInfo(-1) };

            void DrawSegmentFcn_call(b2Vec2 p1, b2Vec2 p2, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                DrawSegmentFcn_call(new b2Vec2(buf.getNativePointer(0), true), new b2Vec2(buf.getNativePointer(CHandler.IS_32_BIT ? 4 : 8), true), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_32_BIT ? 8 : 16)), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 12 : 20), false));
            }

            public static DrawSegmentFcn DrawSegmentFcn_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawSegmentFcn_Internal.__ffi_cache);
                return (p1, p2, color, context) -> {
                    ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                    useEncoder.getBufPtr().setNativePointer(0, p1.getPointer());
                    useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 4 : 8, p2.getPointer());
                    useEncoder.getBufPtr().setUInt(CHandler.IS_32_BIT ? 8 : 16, color.getIndex());
                    useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 12 : 20, context.getPointer());
                    useEncoder.invoke();
                };
            }
        }

        public interface DrawTransformFcn_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(74), FFITypes.getCTypeInfo(-1) };

            void DrawTransformFcn_call(b2Transform transform, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                DrawTransformFcn_call(new b2Transform(buf.getNativePointer(0), true), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 4 : 8), false));
            }

            public static DrawTransformFcn DrawTransformFcn_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawTransformFcn_Internal.__ffi_cache);
                return (transform, context) -> {
                    ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                    useEncoder.getBufPtr().setNativePointer(0, transform.getPointer());
                    useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 4 : 8, context.getPointer());
                    useEncoder.invoke();
                };
            }
        }

        public interface DrawPointFcn_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(77), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(10), FFITypes.getCTypeInfo(-1) };

            void DrawPointFcn_call(b2Vec2 p, float size, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                DrawPointFcn_call(new b2Vec2(buf.getNativePointer(0), true), buf.getFloat(CHandler.IS_32_BIT ? 4 : 8), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_32_BIT ? 8 : 12)), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 12 : 16), false));
            }

            public static DrawPointFcn DrawPointFcn_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawPointFcn_Internal.__ffi_cache);
                return (p, size, color, context) -> {
                    ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                    useEncoder.getBufPtr().setNativePointer(0, p.getPointer());
                    useEncoder.getBufPtr().setFloat(CHandler.IS_32_BIT ? 4 : 8, size);
                    useEncoder.getBufPtr().setUInt(CHandler.IS_32_BIT ? 8 : 12, color.getIndex());
                    useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 12 : 16, context.getPointer());
                    useEncoder.invoke();
                };
            }
        }

        public interface DrawStringFcn_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(77), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(10), FFITypes.getCTypeInfo(-1) };

            void DrawStringFcn_call(b2Vec2 p, BytePointer s, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                DrawStringFcn_call(new b2Vec2(buf.getNativePointer(0), true), new BytePointer(buf.getNativePointer(CHandler.IS_32_BIT ? 4 : 8), false), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_32_BIT ? 8 : 16)), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 12 : 20), false));
            }

            public static DrawStringFcn DrawStringFcn_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawStringFcn_Internal.__ffi_cache);
                return (p, s, color, context) -> {
                    ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                    useEncoder.getBufPtr().setNativePointer(0, p.getPointer());
                    useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 4 : 8, s.getPointer());
                    useEncoder.getBufPtr().setUInt(CHandler.IS_32_BIT ? 8 : 16, color.getIndex());
                    useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 12 : 20, context.getPointer());
                    useEncoder.invoke();
                };
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
            buf.setBoolean(0, b2OverlapResultFcn_call(new b2ShapeId(buf.getNativePointer(0), true), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 4 : 8), false)));
        }

        public static b2OverlapResultFcn b2OverlapResultFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2OverlapResultFcn_Internal.__ffi_cache);
            return (shapeId, context) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.getBufPtr().setNativePointer(0, shapeId.getPointer());
                useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 4 : 8, context.getPointer());
                useEncoder.invoke();
                return useEncoder.getBufPtr().getBoolean(0);
            };
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

        public static b2TreeQueryCallbackFcn b2TreeQueryCallbackFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2TreeQueryCallbackFcn_Internal.__ffi_cache);
            return (proxyId, userData, context) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.getBufPtr().setInt(0, proxyId);
                useEncoder.getBufPtr().setLong(4, userData);
                useEncoder.getBufPtr().setNativePointer(12, context.getPointer());
                useEncoder.invoke();
                return useEncoder.getBufPtr().getBoolean(0);
            };
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

        public static b2TaskCallback b2TaskCallback_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2TaskCallback_Internal.__ffi_cache);
            return (startIndex, endIndex, workerIndex, taskContext) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.getBufPtr().setInt(0, startIndex);
                useEncoder.getBufPtr().setInt(4, endIndex);
                useEncoder.getBufPtr().setUInt(8, workerIndex);
                useEncoder.getBufPtr().setNativePointer(12, taskContext.getPointer());
                useEncoder.invoke();
            };
        }
    }

    public interface b2EnqueueTaskCallback_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

        VoidPointer b2EnqueueTaskCallback_call(ClosureObject<b2TaskCallback> task, int itemCount, int minRange, VoidPointer taskContext, VoidPointer userContext);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setNativePointer(0, b2EnqueueTaskCallback_call(CHandler.getClosureObject(buf.getNativePointer(0), b2TaskCallback_Internal::b2TaskCallback_downcall), buf.getInt(CHandler.IS_32_BIT ? 4 : 8), buf.getInt(CHandler.IS_32_BIT ? 8 : 12), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 12 : 16), false), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 16 : 24), false)).getPointer());
        }

        public static b2EnqueueTaskCallback b2EnqueueTaskCallback_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2EnqueueTaskCallback_Internal.__ffi_cache);
            return (task, itemCount, minRange, taskContext, userContext) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.getBufPtr().setNativePointer(0, task.getPointer());
                useEncoder.getBufPtr().setInt(CHandler.IS_32_BIT ? 4 : 8, itemCount);
                useEncoder.getBufPtr().setInt(CHandler.IS_32_BIT ? 8 : 12, minRange);
                useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 12 : 16, taskContext.getPointer());
                useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 16 : 24, userContext.getPointer());
                useEncoder.invoke();
                return new VoidPointer(useEncoder.getBufPtr().getNativePointer(0), false);
            };
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

        public static b2RestitutionCallback b2RestitutionCallback_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2RestitutionCallback_Internal.__ffi_cache);
            return (restitutionA, userMaterialIdA, restitutionB, userMaterialIdB) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.getBufPtr().setFloat(0, restitutionA);
                useEncoder.getBufPtr().setInt(4, userMaterialIdA);
                useEncoder.getBufPtr().setFloat(8, restitutionB);
                useEncoder.getBufPtr().setInt(12, userMaterialIdB);
                useEncoder.invoke();
                return useEncoder.getBufPtr().getFloat(0);
            };
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

        public static b2FrictionCallback b2FrictionCallback_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2FrictionCallback_Internal.__ffi_cache);
            return (frictionA, userMaterialIdA, frictionB, userMaterialIdB) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.getBufPtr().setFloat(0, frictionA);
                useEncoder.getBufPtr().setInt(4, userMaterialIdA);
                useEncoder.getBufPtr().setFloat(8, frictionB);
                useEncoder.getBufPtr().setInt(12, userMaterialIdB);
                useEncoder.invoke();
                return useEncoder.getBufPtr().getFloat(0);
            };
        }
    }

    public interface b2CastResultFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(65), FFITypes.getCTypeInfo(77), FFITypes.getCTypeInfo(77), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(-1) };

        float b2CastResultFcn_call(b2ShapeId shapeId, b2Vec2 point, b2Vec2 normal, float fraction, VoidPointer context);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setFloat(0, b2CastResultFcn_call(new b2ShapeId(buf.getNativePointer(0), true), new b2Vec2(buf.getNativePointer(CHandler.IS_32_BIT ? 4 : 8), true), new b2Vec2(buf.getNativePointer(CHandler.IS_32_BIT ? 8 : 16), true), buf.getFloat(CHandler.IS_32_BIT ? 12 : 24), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 16 : 28), false)));
        }

        public static b2CastResultFcn b2CastResultFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2CastResultFcn_Internal.__ffi_cache);
            return (shapeId, point, normal, fraction, context) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.getBufPtr().setNativePointer(0, shapeId.getPointer());
                useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 4 : 8, point.getPointer());
                useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 8 : 16, normal.getPointer());
                useEncoder.getBufPtr().setFloat(CHandler.IS_32_BIT ? 12 : 24, fraction);
                useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 16 : 28, context.getPointer());
                useEncoder.invoke();
                return useEncoder.getBufPtr().getFloat(0);
            };
        }
    }

    public interface b2TreeShapeCastCallbackFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(8), FFITypes.getCTypeInfo(-1) };

        float b2TreeShapeCastCallbackFcn_call(b2ShapeCastInput.b2ShapeCastInputPointer input, int proxyId, long userData, VoidPointer context);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setFloat(0, b2TreeShapeCastCallbackFcn_call(new b2ShapeCastInput.b2ShapeCastInputPointer(buf.getNativePointer(0), false), buf.getInt(CHandler.IS_32_BIT ? 4 : 8), buf.getLong(CHandler.IS_32_BIT ? 8 : 12), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 16 : 20), false)));
        }

        public static b2TreeShapeCastCallbackFcn b2TreeShapeCastCallbackFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2TreeShapeCastCallbackFcn_Internal.__ffi_cache);
            return (input, proxyId, userData, context) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.getBufPtr().setNativePointer(0, input.getPointer());
                useEncoder.getBufPtr().setInt(CHandler.IS_32_BIT ? 4 : 8, proxyId);
                useEncoder.getBufPtr().setLong(CHandler.IS_32_BIT ? 8 : 12, userData);
                useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 16 : 20, context.getPointer());
                useEncoder.invoke();
                return useEncoder.getBufPtr().getFloat(0);
            };
        }
    }

    public interface b2PreSolveFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(0), FFITypes.getCTypeInfo(65), FFITypes.getCTypeInfo(65), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

        boolean b2PreSolveFcn_call(b2ShapeId shapeIdA, b2ShapeId shapeIdB, b2Manifold.b2ManifoldPointer manifold, VoidPointer context);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setBoolean(0, b2PreSolveFcn_call(new b2ShapeId(buf.getNativePointer(0), true), new b2ShapeId(buf.getNativePointer(CHandler.IS_32_BIT ? 4 : 8), true), new b2Manifold.b2ManifoldPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 8 : 16), false), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 12 : 24), false)));
        }

        public static b2PreSolveFcn b2PreSolveFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2PreSolveFcn_Internal.__ffi_cache);
            return (shapeIdA, shapeIdB, manifold, context) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.getBufPtr().setNativePointer(0, shapeIdA.getPointer());
                useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 4 : 8, shapeIdB.getPointer());
                useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 8 : 16, manifold.getPointer());
                useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 12 : 24, context.getPointer());
                useEncoder.invoke();
                return useEncoder.getBufPtr().getBoolean(0);
            };
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

        public static b2AllocFcn b2AllocFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2AllocFcn_Internal.__ffi_cache);
            return (size, alignment) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.getBufPtr().setUInt(0, size);
                useEncoder.getBufPtr().setInt(4, alignment);
                useEncoder.invoke();
                return new VoidPointer(useEncoder.getBufPtr().getNativePointer(0), false);
            };
        }
    }

    public interface b2AssertFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(4) };

        int b2AssertFcn_call(BytePointer condition, BytePointer fileName, int lineNumber);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setInt(0, b2AssertFcn_call(new BytePointer(buf.getNativePointer(0), false), new BytePointer(buf.getNativePointer(CHandler.IS_32_BIT ? 4 : 8), false), buf.getInt(CHandler.IS_32_BIT ? 8 : 16)));
        }

        public static b2AssertFcn b2AssertFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2AssertFcn_Internal.__ffi_cache);
            return (condition, fileName, lineNumber) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.getBufPtr().setNativePointer(0, condition.getPointer());
                useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 4 : 8, fileName.getPointer());
                useEncoder.getBufPtr().setInt(CHandler.IS_32_BIT ? 8 : 16, lineNumber);
                useEncoder.invoke();
                return useEncoder.getBufPtr().getInt(0);
            };
        }
    }

    public interface b2CustomFilterFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(0), FFITypes.getCTypeInfo(65), FFITypes.getCTypeInfo(65), FFITypes.getCTypeInfo(-1) };

        boolean b2CustomFilterFcn_call(b2ShapeId shapeIdA, b2ShapeId shapeIdB, VoidPointer context);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setBoolean(0, b2CustomFilterFcn_call(new b2ShapeId(buf.getNativePointer(0), true), new b2ShapeId(buf.getNativePointer(CHandler.IS_32_BIT ? 4 : 8), true), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 8 : 16), false)));
        }

        public static b2CustomFilterFcn b2CustomFilterFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2CustomFilterFcn_Internal.__ffi_cache);
            return (shapeIdA, shapeIdB, context) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.getBufPtr().setNativePointer(0, shapeIdA.getPointer());
                useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 4 : 8, shapeIdB.getPointer());
                useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 8 : 16, context.getPointer());
                useEncoder.invoke();
                return useEncoder.getBufPtr().getBoolean(0);
            };
        }
    }

    public interface b2PlaneResultFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(0), FFITypes.getCTypeInfo(65), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

        boolean b2PlaneResultFcn_call(b2ShapeId shapeId, b2PlaneResult.b2PlaneResultPointer plane, VoidPointer context);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setBoolean(0, b2PlaneResultFcn_call(new b2ShapeId(buf.getNativePointer(0), true), new b2PlaneResult.b2PlaneResultPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 4 : 8), false), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 8 : 16), false)));
        }

        public static b2PlaneResultFcn b2PlaneResultFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2PlaneResultFcn_Internal.__ffi_cache);
            return (shapeId, plane, context) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.getBufPtr().setNativePointer(0, shapeId.getPointer());
                useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 4 : 8, plane.getPointer());
                useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 8 : 16, context.getPointer());
                useEncoder.invoke();
                return useEncoder.getBufPtr().getBoolean(0);
            };
        }
    }

    public interface b2TreeRayCastCallbackFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(8), FFITypes.getCTypeInfo(-1) };

        float b2TreeRayCastCallbackFcn_call(b2RayCastInput.b2RayCastInputPointer input, int proxyId, long userData, VoidPointer context);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setFloat(0, b2TreeRayCastCallbackFcn_call(new b2RayCastInput.b2RayCastInputPointer(buf.getNativePointer(0), false), buf.getInt(CHandler.IS_32_BIT ? 4 : 8), buf.getLong(CHandler.IS_32_BIT ? 8 : 12), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 16 : 20), false)));
        }

        public static b2TreeRayCastCallbackFcn b2TreeRayCastCallbackFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2TreeRayCastCallbackFcn_Internal.__ffi_cache);
            return (input, proxyId, userData, context) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.getBufPtr().setNativePointer(0, input.getPointer());
                useEncoder.getBufPtr().setInt(CHandler.IS_32_BIT ? 4 : 8, proxyId);
                useEncoder.getBufPtr().setLong(CHandler.IS_32_BIT ? 8 : 12, userData);
                useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 16 : 20, context.getPointer());
                useEncoder.invoke();
                return useEncoder.getBufPtr().getFloat(0);
            };
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

        public static b2FreeFcn b2FreeFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2FreeFcn_Internal.__ffi_cache);
            return (mem) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.getBufPtr().setNativePointer(0, mem.getPointer());
                useEncoder.invoke();
            };
        }
    }

    public interface b2FinishTaskCallback_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

        void b2FinishTaskCallback_call(VoidPointer userTask, VoidPointer userContext);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            b2FinishTaskCallback_call(new VoidPointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 4 : 8), false));
        }

        public static b2FinishTaskCallback b2FinishTaskCallback_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2FinishTaskCallback_Internal.__ffi_cache);
            return (userTask, userContext) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.getBufPtr().setNativePointer(0, userTask.getPointer());
                useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 4 : 8, userContext.getPointer());
                useEncoder.invoke();
            };
        }
    }
}
