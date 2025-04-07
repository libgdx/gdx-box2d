package com.badlogic.gdx.box2d;

import com.badlogic.gdx.jnigen.runtime.c.CTypeInfo;
import com.badlogic.gdx.jnigen.runtime.closure.Closure;
import com.badlogic.gdx.jnigen.runtime.mem.BufferPtr;
import com.badlogic.gdx.box2d.structs.b2DebugDraw.DrawPolygon;
import com.badlogic.gdx.jnigen.runtime.ffi.ClosureEncoder;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.box2d.enums.b2HexColor;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.structs.b2DebugDraw.DrawSolidPolygon;
import com.badlogic.gdx.box2d.structs.b2Transform;
import com.badlogic.gdx.box2d.structs.b2DebugDraw.DrawCircle;
import com.badlogic.gdx.box2d.structs.b2DebugDraw.DrawSolidCircle;
import com.badlogic.gdx.box2d.structs.b2DebugDraw.DrawSolidCapsule;
import com.badlogic.gdx.box2d.structs.b2DebugDraw.DrawSegment;
import com.badlogic.gdx.box2d.structs.b2DebugDraw.DrawTransform;
import com.badlogic.gdx.box2d.structs.b2DebugDraw.DrawPoint;
import com.badlogic.gdx.box2d.structs.b2DebugDraw.DrawString;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.BytePointer;
import com.badlogic.gdx.box2d.Box2d.b2OverlapResultFcn;
import com.badlogic.gdx.box2d.structs.b2ShapeId;
import com.badlogic.gdx.box2d.Box2d.b2TreeQueryCallbackFcn;
import com.badlogic.gdx.box2d.Box2d.b2TaskCallback;
import com.badlogic.gdx.box2d.Box2d.b2EnqueueTaskCallback;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.box2d.Box2d_Internal.b2TaskCallback_Internal;
import com.badlogic.gdx.box2d.Box2d.b2CastResultFcn;
import com.badlogic.gdx.box2d.Box2d.b2TreeShapeCastCallbackFcn;
import com.badlogic.gdx.box2d.structs.b2ShapeCastInput;
import com.badlogic.gdx.box2d.Box2d.b2PreSolveFcn;
import com.badlogic.gdx.box2d.structs.b2Manifold;
import com.badlogic.gdx.box2d.Box2d.b2AllocFcn;
import com.badlogic.gdx.box2d.Box2d.b2AssertFcn;
import com.badlogic.gdx.box2d.Box2d.b2CustomFilterFcn;
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

    public final static class b2ShapeCastInput_Internal {
    }

    public final static class b2RevoluteJointDef_Internal {
    }

    public final static class b2Capsule_Internal {
    }

    public final static class b2NullJointDef_Internal {
    }

    public final static class b2Transform_Internal {
    }

    public final static class b2MouseJointDef_Internal {
    }

    public final static class b2Mat22_Internal {
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

        public interface DrawPolygon_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(10), FFITypes.getCTypeInfo(-1) };

            void DrawPolygon_call(b2Vec2.b2Vec2Pointer vertices, int vertexCount, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                DrawPolygon_call(new b2Vec2.b2Vec2Pointer(buf.getNativePointer(0), false), buf.getInt(CHandler.IS_32_BIT ? 4 : 8), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_32_BIT ? 8 : 12)), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 12 : 16), false));
            }

            public static DrawPolygon DrawPolygon_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawPolygon_Internal.__ffi_cache);
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

        public interface DrawSolidPolygon_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(69), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(10), FFITypes.getCTypeInfo(-1) };

            void DrawSolidPolygon_call(b2Transform transform, b2Vec2.b2Vec2Pointer vertices, int vertexCount, float radius, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                DrawSolidPolygon_call(new b2Transform(buf.getNativePointer(0), true), new b2Vec2.b2Vec2Pointer(buf.getNativePointer(CHandler.IS_32_BIT ? 4 : 8), false), buf.getInt(CHandler.IS_32_BIT ? 8 : 16), buf.getFloat(CHandler.IS_32_BIT ? 12 : 20), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_32_BIT ? 16 : 24)), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 20 : 28), false));
            }

            public static DrawSolidPolygon DrawSolidPolygon_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawSolidPolygon_Internal.__ffi_cache);
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

        public interface DrawCircle_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(72), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(10), FFITypes.getCTypeInfo(-1) };

            void DrawCircle_call(b2Vec2 center, float radius, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                DrawCircle_call(new b2Vec2(buf.getNativePointer(0), true), buf.getFloat(CHandler.IS_32_BIT ? 4 : 8), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_32_BIT ? 8 : 12)), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 12 : 16), false));
            }

            public static DrawCircle DrawCircle_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawCircle_Internal.__ffi_cache);
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

        public interface DrawSolidCircle_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(69), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(10), FFITypes.getCTypeInfo(-1) };

            void DrawSolidCircle_call(b2Transform transform, float radius, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                DrawSolidCircle_call(new b2Transform(buf.getNativePointer(0), true), buf.getFloat(CHandler.IS_32_BIT ? 4 : 8), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_32_BIT ? 8 : 12)), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 12 : 16), false));
            }

            public static DrawSolidCircle DrawSolidCircle_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawSolidCircle_Internal.__ffi_cache);
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

        public interface DrawSolidCapsule_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(72), FFITypes.getCTypeInfo(72), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(10), FFITypes.getCTypeInfo(-1) };

            void DrawSolidCapsule_call(b2Vec2 p1, b2Vec2 p2, float radius, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                DrawSolidCapsule_call(new b2Vec2(buf.getNativePointer(0), true), new b2Vec2(buf.getNativePointer(CHandler.IS_32_BIT ? 4 : 8), true), buf.getFloat(CHandler.IS_32_BIT ? 8 : 16), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_32_BIT ? 12 : 20)), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 16 : 24), false));
            }

            public static DrawSolidCapsule DrawSolidCapsule_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawSolidCapsule_Internal.__ffi_cache);
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

        public interface DrawSegment_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(72), FFITypes.getCTypeInfo(72), FFITypes.getCTypeInfo(10), FFITypes.getCTypeInfo(-1) };

            void DrawSegment_call(b2Vec2 p1, b2Vec2 p2, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                DrawSegment_call(new b2Vec2(buf.getNativePointer(0), true), new b2Vec2(buf.getNativePointer(CHandler.IS_32_BIT ? 4 : 8), true), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_32_BIT ? 8 : 16)), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 12 : 20), false));
            }

            public static DrawSegment DrawSegment_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawSegment_Internal.__ffi_cache);
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

        public interface DrawTransform_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(69), FFITypes.getCTypeInfo(-1) };

            void DrawTransform_call(b2Transform transform, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                DrawTransform_call(new b2Transform(buf.getNativePointer(0), true), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 4 : 8), false));
            }

            public static DrawTransform DrawTransform_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawTransform_Internal.__ffi_cache);
                return (transform, context) -> {
                    ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                    useEncoder.getBufPtr().setNativePointer(0, transform.getPointer());
                    useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 4 : 8, context.getPointer());
                    useEncoder.invoke();
                };
            }
        }

        public interface DrawPoint_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(72), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(10), FFITypes.getCTypeInfo(-1) };

            void DrawPoint_call(b2Vec2 p, float size, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                DrawPoint_call(new b2Vec2(buf.getNativePointer(0), true), buf.getFloat(CHandler.IS_32_BIT ? 4 : 8), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_32_BIT ? 8 : 12)), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 12 : 16), false));
            }

            public static DrawPoint DrawPoint_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawPoint_Internal.__ffi_cache);
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

        public interface DrawString_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(72), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(10), FFITypes.getCTypeInfo(-1) };

            void DrawString_call(b2Vec2 p, BytePointer s, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                DrawString_call(new b2Vec2(buf.getNativePointer(0), true), new BytePointer(buf.getNativePointer(CHandler.IS_32_BIT ? 4 : 8), false), b2HexColor.getByIndex((int) buf.getUInt(CHandler.IS_32_BIT ? 8 : 16)), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 12 : 20), false));
            }

            public static DrawString DrawString_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawString_Internal.__ffi_cache);
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

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(0), FFITypes.getCTypeInfo(61), FFITypes.getCTypeInfo(-1) };

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

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(0), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

        boolean b2TreeQueryCallbackFcn_call(int proxyId, int userData, VoidPointer context);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setBoolean(0, b2TreeQueryCallbackFcn_call(buf.getInt(0), buf.getInt(4), new VoidPointer(buf.getNativePointer(8), false)));
        }

        public static b2TreeQueryCallbackFcn b2TreeQueryCallbackFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2TreeQueryCallbackFcn_Internal.__ffi_cache);
            return (proxyId, userData, context) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.getBufPtr().setInt(0, proxyId);
                useEncoder.getBufPtr().setInt(4, userData);
                useEncoder.getBufPtr().setNativePointer(8, context.getPointer());
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

    public interface b2CastResultFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(61), FFITypes.getCTypeInfo(72), FFITypes.getCTypeInfo(72), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(-1) };

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

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

        float b2TreeShapeCastCallbackFcn_call(b2ShapeCastInput.b2ShapeCastInputPointer input, int proxyId, int userData, VoidPointer context);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setFloat(0, b2TreeShapeCastCallbackFcn_call(new b2ShapeCastInput.b2ShapeCastInputPointer(buf.getNativePointer(0), false), buf.getInt(CHandler.IS_32_BIT ? 4 : 8), buf.getInt(CHandler.IS_32_BIT ? 8 : 12), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 12 : 16), false)));
        }

        public static b2TreeShapeCastCallbackFcn b2TreeShapeCastCallbackFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2TreeShapeCastCallbackFcn_Internal.__ffi_cache);
            return (input, proxyId, userData, context) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.getBufPtr().setNativePointer(0, input.getPointer());
                useEncoder.getBufPtr().setInt(CHandler.IS_32_BIT ? 4 : 8, proxyId);
                useEncoder.getBufPtr().setInt(CHandler.IS_32_BIT ? 8 : 12, userData);
                useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 12 : 16, context.getPointer());
                useEncoder.invoke();
                return useEncoder.getBufPtr().getFloat(0);
            };
        }
    }

    public interface b2PreSolveFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(0), FFITypes.getCTypeInfo(61), FFITypes.getCTypeInfo(61), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

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

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(0), FFITypes.getCTypeInfo(61), FFITypes.getCTypeInfo(61), FFITypes.getCTypeInfo(-1) };

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

    public interface b2TreeRayCastCallbackFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

        float b2TreeRayCastCallbackFcn_call(b2RayCastInput.b2RayCastInputPointer input, int proxyId, int userData, VoidPointer context);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setFloat(0, b2TreeRayCastCallbackFcn_call(new b2RayCastInput.b2RayCastInputPointer(buf.getNativePointer(0), false), buf.getInt(CHandler.IS_32_BIT ? 4 : 8), buf.getInt(CHandler.IS_32_BIT ? 8 : 12), new VoidPointer(buf.getNativePointer(CHandler.IS_32_BIT ? 12 : 16), false)));
        }

        public static b2TreeRayCastCallbackFcn b2TreeRayCastCallbackFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2TreeRayCastCallbackFcn_Internal.__ffi_cache);
            return (input, proxyId, userData, context) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.getBufPtr().setNativePointer(0, input.getPointer());
                useEncoder.getBufPtr().setInt(CHandler.IS_32_BIT ? 4 : 8, proxyId);
                useEncoder.getBufPtr().setInt(CHandler.IS_32_BIT ? 8 : 12, userData);
                useEncoder.getBufPtr().setNativePointer(CHandler.IS_32_BIT ? 12 : 16, context.getPointer());
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
