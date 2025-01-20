package com.badlogic.gdx.box2d;

import com.badlogic.gdx.jnigen.runtime.ffi.JavaTypeWrapper;
import com.badlogic.gdx.jnigen.runtime.c.CTypeInfo;
import com.badlogic.gdx.jnigen.runtime.closure.Closure;
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
import com.badlogic.gdx.jnigen.runtime.pointer.CSizedIntPointer;
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

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

            void DrawPolygon_call(b2Vec2.b2Vec2Pointer vertices, int vertexCount, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
                DrawPolygon_call(new b2Vec2.b2Vec2Pointer(parameters[0].asLong(), false), (int) parameters[1].asLong(), b2HexColor.getByIndex((int) parameters[2].asLong()), new VoidPointer(parameters[3].asLong(), false));
            }

            public static DrawPolygon DrawPolygon_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawPolygon_Internal.__ffi_cache);
                return (vertices, vertexCount, color, context) -> {
                    ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                    useEncoder.setValue(0, vertices);
                    useEncoder.setValue(1, vertexCount);
                    useEncoder.setValue(2, color);
                    useEncoder.setValue(3, context);
                    useEncoder.invoke();
                };
            }
        }

        public interface DrawSolidPolygon_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(69), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

            void DrawSolidPolygon_call(b2Transform transform, b2Vec2.b2Vec2Pointer vertices, int vertexCount, float radius, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
                DrawSolidPolygon_call(new b2Transform(parameters[0].asLong(), true), new b2Vec2.b2Vec2Pointer(parameters[1].asLong(), false), (int) parameters[2].asLong(), (float) parameters[3].asFloat(), b2HexColor.getByIndex((int) parameters[4].asLong()), new VoidPointer(parameters[5].asLong(), false));
            }

            public static DrawSolidPolygon DrawSolidPolygon_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawSolidPolygon_Internal.__ffi_cache);
                return (transform, vertices, vertexCount, radius, color, context) -> {
                    ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                    useEncoder.setValue(0, transform);
                    useEncoder.setValue(1, vertices);
                    useEncoder.setValue(2, vertexCount);
                    useEncoder.setValue(3, radius);
                    useEncoder.setValue(4, color);
                    useEncoder.setValue(5, context);
                    useEncoder.invoke();
                };
            }
        }

        public interface DrawCircle_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(72), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

            void DrawCircle_call(b2Vec2 center, float radius, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
                DrawCircle_call(new b2Vec2(parameters[0].asLong(), true), (float) parameters[1].asFloat(), b2HexColor.getByIndex((int) parameters[2].asLong()), new VoidPointer(parameters[3].asLong(), false));
            }

            public static DrawCircle DrawCircle_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawCircle_Internal.__ffi_cache);
                return (center, radius, color, context) -> {
                    ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                    useEncoder.setValue(0, center);
                    useEncoder.setValue(1, radius);
                    useEncoder.setValue(2, color);
                    useEncoder.setValue(3, context);
                    useEncoder.invoke();
                };
            }
        }

        public interface DrawSolidCircle_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(69), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

            void DrawSolidCircle_call(b2Transform transform, float radius, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
                DrawSolidCircle_call(new b2Transform(parameters[0].asLong(), true), (float) parameters[1].asFloat(), b2HexColor.getByIndex((int) parameters[2].asLong()), new VoidPointer(parameters[3].asLong(), false));
            }

            public static DrawSolidCircle DrawSolidCircle_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawSolidCircle_Internal.__ffi_cache);
                return (transform, radius, color, context) -> {
                    ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                    useEncoder.setValue(0, transform);
                    useEncoder.setValue(1, radius);
                    useEncoder.setValue(2, color);
                    useEncoder.setValue(3, context);
                    useEncoder.invoke();
                };
            }
        }

        public interface DrawSolidCapsule_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(72), FFITypes.getCTypeInfo(72), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

            void DrawSolidCapsule_call(b2Vec2 p1, b2Vec2 p2, float radius, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
                DrawSolidCapsule_call(new b2Vec2(parameters[0].asLong(), true), new b2Vec2(parameters[1].asLong(), true), (float) parameters[2].asFloat(), b2HexColor.getByIndex((int) parameters[3].asLong()), new VoidPointer(parameters[4].asLong(), false));
            }

            public static DrawSolidCapsule DrawSolidCapsule_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawSolidCapsule_Internal.__ffi_cache);
                return (p1, p2, radius, color, context) -> {
                    ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                    useEncoder.setValue(0, p1);
                    useEncoder.setValue(1, p2);
                    useEncoder.setValue(2, radius);
                    useEncoder.setValue(3, color);
                    useEncoder.setValue(4, context);
                    useEncoder.invoke();
                };
            }
        }

        public interface DrawSegment_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(72), FFITypes.getCTypeInfo(72), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

            void DrawSegment_call(b2Vec2 p1, b2Vec2 p2, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
                DrawSegment_call(new b2Vec2(parameters[0].asLong(), true), new b2Vec2(parameters[1].asLong(), true), b2HexColor.getByIndex((int) parameters[2].asLong()), new VoidPointer(parameters[3].asLong(), false));
            }

            public static DrawSegment DrawSegment_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawSegment_Internal.__ffi_cache);
                return (p1, p2, color, context) -> {
                    ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                    useEncoder.setValue(0, p1);
                    useEncoder.setValue(1, p2);
                    useEncoder.setValue(2, color);
                    useEncoder.setValue(3, context);
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

            default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
                DrawTransform_call(new b2Transform(parameters[0].asLong(), true), new VoidPointer(parameters[1].asLong(), false));
            }

            public static DrawTransform DrawTransform_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawTransform_Internal.__ffi_cache);
                return (transform, context) -> {
                    ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                    useEncoder.setValue(0, transform);
                    useEncoder.setValue(1, context);
                    useEncoder.invoke();
                };
            }
        }

        public interface DrawPoint_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(72), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

            void DrawPoint_call(b2Vec2 p, float size, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
                DrawPoint_call(new b2Vec2(parameters[0].asLong(), true), (float) parameters[1].asFloat(), b2HexColor.getByIndex((int) parameters[2].asLong()), new VoidPointer(parameters[3].asLong(), false));
            }

            public static DrawPoint DrawPoint_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawPoint_Internal.__ffi_cache);
                return (p, size, color, context) -> {
                    ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                    useEncoder.setValue(0, p);
                    useEncoder.setValue(1, size);
                    useEncoder.setValue(2, color);
                    useEncoder.setValue(3, context);
                    useEncoder.invoke();
                };
            }
        }

        public interface DrawString_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(72), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

            void DrawString_call(b2Vec2 p, CSizedIntPointer s, b2HexColor color, VoidPointer context);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
                DrawString_call(new b2Vec2(parameters[0].asLong(), true), new CSizedIntPointer(parameters[1].asLong(), false, "const char"), b2HexColor.getByIndex((int) parameters[2].asLong()), new VoidPointer(parameters[3].asLong(), false));
            }

            public static DrawString DrawString_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, DrawString_Internal.__ffi_cache);
                return (p, s, color, context) -> {
                    ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                    useEncoder.setValue(0, p);
                    useEncoder.setValue(1, s);
                    useEncoder.setValue(2, color);
                    useEncoder.setValue(3, context);
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

        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            returnType.setValue(b2OverlapResultFcn_call(new b2ShapeId(parameters[0].asLong(), true), new VoidPointer(parameters[1].asLong(), false)));
        }

        public static b2OverlapResultFcn b2OverlapResultFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2OverlapResultFcn_Internal.__ffi_cache);
            return (shapeId, context) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.setValue(0, shapeId);
                useEncoder.setValue(1, context);
                JavaTypeWrapper returnConvert = new JavaTypeWrapper(b2OverlapResultFcn_Internal.__ffi_cache[0]);
                returnConvert.setValue(useEncoder.invoke());
                return returnConvert.asLong() != 0;
            };
        }
    }

    public interface b2TreeQueryCallbackFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(0), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

        boolean b2TreeQueryCallbackFcn_call(int proxyId, int userData, VoidPointer context);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            returnType.setValue(b2TreeQueryCallbackFcn_call((int) parameters[0].asLong(), (int) parameters[1].asLong(), new VoidPointer(parameters[2].asLong(), false)));
        }

        public static b2TreeQueryCallbackFcn b2TreeQueryCallbackFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2TreeQueryCallbackFcn_Internal.__ffi_cache);
            return (proxyId, userData, context) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.setValue(0, proxyId);
                useEncoder.setValue(1, userData);
                useEncoder.setValue(2, context);
                JavaTypeWrapper returnConvert = new JavaTypeWrapper(b2TreeQueryCallbackFcn_Internal.__ffi_cache[0]);
                returnConvert.setValue(useEncoder.invoke());
                return returnConvert.asLong() != 0;
            };
        }
    }

    public interface b2TaskCallback_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(7), FFITypes.getCTypeInfo(-1) };

        void b2TaskCallback_call(int startIndex, int endIndex, long workerIndex, VoidPointer taskContext);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            b2TaskCallback_call((int) parameters[0].asLong(), (int) parameters[1].asLong(), (long) parameters[2].asLong(), new VoidPointer(parameters[3].asLong(), false));
        }

        public static b2TaskCallback b2TaskCallback_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2TaskCallback_Internal.__ffi_cache);
            return (startIndex, endIndex, workerIndex, taskContext) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.setValue(0, startIndex);
                useEncoder.setValue(1, endIndex);
                useEncoder.setValue(2, workerIndex);
                useEncoder.setValue(3, taskContext);
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

        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            returnType.setValue(b2EnqueueTaskCallback_call(CHandler.getClosureObject(parameters[0].asLong(), b2TaskCallback_Internal::b2TaskCallback_downcall), (int) parameters[1].asLong(), (int) parameters[2].asLong(), new VoidPointer(parameters[3].asLong(), false), new VoidPointer(parameters[4].asLong(), false)));
        }

        public static b2EnqueueTaskCallback b2EnqueueTaskCallback_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2EnqueueTaskCallback_Internal.__ffi_cache);
            return (task, itemCount, minRange, taskContext, userContext) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.setValue(0, task);
                useEncoder.setValue(1, itemCount);
                useEncoder.setValue(2, minRange);
                useEncoder.setValue(3, taskContext);
                useEncoder.setValue(4, userContext);
                JavaTypeWrapper returnConvert = new JavaTypeWrapper(b2EnqueueTaskCallback_Internal.__ffi_cache[0]);
                returnConvert.setValue(useEncoder.invoke());
                return new VoidPointer(returnConvert.asLong(), false);
            };
        }
    }

    public interface b2CastResultFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(61), FFITypes.getCTypeInfo(72), FFITypes.getCTypeInfo(72), FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(-1) };

        float b2CastResultFcn_call(b2ShapeId shapeId, b2Vec2 point, b2Vec2 normal, float fraction, VoidPointer context);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            returnType.setValue(b2CastResultFcn_call(new b2ShapeId(parameters[0].asLong(), true), new b2Vec2(parameters[1].asLong(), true), new b2Vec2(parameters[2].asLong(), true), (float) parameters[3].asFloat(), new VoidPointer(parameters[4].asLong(), false)));
        }

        public static b2CastResultFcn b2CastResultFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2CastResultFcn_Internal.__ffi_cache);
            return (shapeId, point, normal, fraction, context) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.setValue(0, shapeId);
                useEncoder.setValue(1, point);
                useEncoder.setValue(2, normal);
                useEncoder.setValue(3, fraction);
                useEncoder.setValue(4, context);
                JavaTypeWrapper returnConvert = new JavaTypeWrapper(b2CastResultFcn_Internal.__ffi_cache[0]);
                returnConvert.setValue(useEncoder.invoke());
                return (float) returnConvert.asFloat();
            };
        }
    }

    public interface b2TreeShapeCastCallbackFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

        float b2TreeShapeCastCallbackFcn_call(b2ShapeCastInput.b2ShapeCastInputPointer input, int proxyId, int userData, VoidPointer context);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            returnType.setValue(b2TreeShapeCastCallbackFcn_call(new b2ShapeCastInput.b2ShapeCastInputPointer(parameters[0].asLong(), false), (int) parameters[1].asLong(), (int) parameters[2].asLong(), new VoidPointer(parameters[3].asLong(), false)));
        }

        public static b2TreeShapeCastCallbackFcn b2TreeShapeCastCallbackFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2TreeShapeCastCallbackFcn_Internal.__ffi_cache);
            return (input, proxyId, userData, context) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.setValue(0, input);
                useEncoder.setValue(1, proxyId);
                useEncoder.setValue(2, userData);
                useEncoder.setValue(3, context);
                JavaTypeWrapper returnConvert = new JavaTypeWrapper(b2TreeShapeCastCallbackFcn_Internal.__ffi_cache[0]);
                returnConvert.setValue(useEncoder.invoke());
                return (float) returnConvert.asFloat();
            };
        }
    }

    public interface b2PreSolveFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(0), FFITypes.getCTypeInfo(61), FFITypes.getCTypeInfo(61), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

        boolean b2PreSolveFcn_call(b2ShapeId shapeIdA, b2ShapeId shapeIdB, b2Manifold.b2ManifoldPointer manifold, VoidPointer context);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            returnType.setValue(b2PreSolveFcn_call(new b2ShapeId(parameters[0].asLong(), true), new b2ShapeId(parameters[1].asLong(), true), new b2Manifold.b2ManifoldPointer(parameters[2].asLong(), false), new VoidPointer(parameters[3].asLong(), false)));
        }

        public static b2PreSolveFcn b2PreSolveFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2PreSolveFcn_Internal.__ffi_cache);
            return (shapeIdA, shapeIdB, manifold, context) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.setValue(0, shapeIdA);
                useEncoder.setValue(1, shapeIdB);
                useEncoder.setValue(2, manifold);
                useEncoder.setValue(3, context);
                JavaTypeWrapper returnConvert = new JavaTypeWrapper(b2PreSolveFcn_Internal.__ffi_cache[0]);
                returnConvert.setValue(useEncoder.invoke());
                return returnConvert.asLong() != 0;
            };
        }
    }

    public interface b2AllocFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(10), FFITypes.getCTypeInfo(4) };

        VoidPointer b2AllocFcn_call(long size, int alignment);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            returnType.setValue(b2AllocFcn_call((long) parameters[0].asLong(), (int) parameters[1].asLong()));
        }

        public static b2AllocFcn b2AllocFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2AllocFcn_Internal.__ffi_cache);
            return (size, alignment) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.setValue(0, size);
                useEncoder.setValue(1, alignment);
                JavaTypeWrapper returnConvert = new JavaTypeWrapper(b2AllocFcn_Internal.__ffi_cache[0]);
                returnConvert.setValue(useEncoder.invoke());
                return new VoidPointer(returnConvert.asLong(), false);
            };
        }
    }

    public interface b2AssertFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(4) };

        int b2AssertFcn_call(CSizedIntPointer condition, CSizedIntPointer fileName, int lineNumber);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            returnType.setValue(b2AssertFcn_call(new CSizedIntPointer(parameters[0].asLong(), false, "const char"), new CSizedIntPointer(parameters[1].asLong(), false, "const char"), (int) parameters[2].asLong()));
        }

        public static b2AssertFcn b2AssertFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2AssertFcn_Internal.__ffi_cache);
            return (condition, fileName, lineNumber) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.setValue(0, condition);
                useEncoder.setValue(1, fileName);
                useEncoder.setValue(2, lineNumber);
                JavaTypeWrapper returnConvert = new JavaTypeWrapper(b2AssertFcn_Internal.__ffi_cache[0]);
                returnConvert.setValue(useEncoder.invoke());
                return (int) returnConvert.asLong();
            };
        }
    }

    public interface b2CustomFilterFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(0), FFITypes.getCTypeInfo(61), FFITypes.getCTypeInfo(61), FFITypes.getCTypeInfo(-1) };

        boolean b2CustomFilterFcn_call(b2ShapeId shapeIdA, b2ShapeId shapeIdB, VoidPointer context);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            returnType.setValue(b2CustomFilterFcn_call(new b2ShapeId(parameters[0].asLong(), true), new b2ShapeId(parameters[1].asLong(), true), new VoidPointer(parameters[2].asLong(), false)));
        }

        public static b2CustomFilterFcn b2CustomFilterFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2CustomFilterFcn_Internal.__ffi_cache);
            return (shapeIdA, shapeIdB, context) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.setValue(0, shapeIdA);
                useEncoder.setValue(1, shapeIdB);
                useEncoder.setValue(2, context);
                JavaTypeWrapper returnConvert = new JavaTypeWrapper(b2CustomFilterFcn_Internal.__ffi_cache[0]);
                returnConvert.setValue(useEncoder.invoke());
                return returnConvert.asLong() != 0;
            };
        }
    }

    public interface b2TreeRayCastCallbackFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(3), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(4), FFITypes.getCTypeInfo(-1) };

        float b2TreeRayCastCallbackFcn_call(b2RayCastInput.b2RayCastInputPointer input, int proxyId, int userData, VoidPointer context);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            returnType.setValue(b2TreeRayCastCallbackFcn_call(new b2RayCastInput.b2RayCastInputPointer(parameters[0].asLong(), false), (int) parameters[1].asLong(), (int) parameters[2].asLong(), new VoidPointer(parameters[3].asLong(), false)));
        }

        public static b2TreeRayCastCallbackFcn b2TreeRayCastCallbackFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2TreeRayCastCallbackFcn_Internal.__ffi_cache);
            return (input, proxyId, userData, context) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.setValue(0, input);
                useEncoder.setValue(1, proxyId);
                useEncoder.setValue(2, userData);
                useEncoder.setValue(3, context);
                JavaTypeWrapper returnConvert = new JavaTypeWrapper(b2TreeRayCastCallbackFcn_Internal.__ffi_cache[0]);
                returnConvert.setValue(useEncoder.invoke());
                return (float) returnConvert.asFloat();
            };
        }
    }

    public interface b2FreeFcn_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(-1) };

        void b2FreeFcn_call(VoidPointer mem);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            b2FreeFcn_call(new VoidPointer(parameters[0].asLong(), false));
        }

        public static b2FreeFcn b2FreeFcn_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2FreeFcn_Internal.__ffi_cache);
            return (mem) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.setValue(0, mem);
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

        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            b2FinishTaskCallback_call(new VoidPointer(parameters[0].asLong(), false), new VoidPointer(parameters[1].asLong(), false));
        }

        public static b2FinishTaskCallback b2FinishTaskCallback_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, b2FinishTaskCallback_Internal.__ffi_cache);
            return (userTask, userContext) -> {
                ClosureEncoder useEncoder = encoder.lockOrDuplicate();
                useEncoder.setValue(0, userTask);
                useEncoder.setValue(1, userContext);
                useEncoder.invoke();
            };
        }
    }
}
