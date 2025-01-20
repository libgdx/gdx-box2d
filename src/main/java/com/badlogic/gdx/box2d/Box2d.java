package com.badlogic.gdx.box2d;

import com.badlogic.gdx.jnigen.loader.SharedLibraryLoader;
import com.badlogic.gdx.jnigen.runtime.c.CXXException;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.CSizedIntPointer;
import com.badlogic.gdx.box2d.structs.b2Version;
import com.badlogic.gdx.box2d.structs.b2CosSin;
import com.badlogic.gdx.box2d.structs.b2Vec2;
import com.badlogic.gdx.jnigen.runtime.pointer.FloatPointer;
import com.badlogic.gdx.box2d.structs.b2Rot;
import com.badlogic.gdx.box2d.structs.b2Transform;
import com.badlogic.gdx.box2d.structs.b2Mat22;
import com.badlogic.gdx.box2d.structs.b2AABB;
import com.badlogic.gdx.box2d.structs.b2RayCastInput;
import com.badlogic.gdx.box2d.structs.b2Polygon;
import com.badlogic.gdx.box2d.structs.b2Hull;
import com.badlogic.gdx.box2d.structs.b2MassData;
import com.badlogic.gdx.box2d.structs.b2Circle;
import com.badlogic.gdx.box2d.structs.b2Capsule;
import com.badlogic.gdx.box2d.structs.b2Segment;
import com.badlogic.gdx.box2d.structs.b2CastOutput;
import com.badlogic.gdx.box2d.structs.b2ShapeCastInput;
import com.badlogic.gdx.box2d.structs.b2SegmentDistanceResult;
import com.badlogic.gdx.box2d.structs.b2DistanceOutput;
import com.badlogic.gdx.box2d.structs.b2SimplexCache;
import com.badlogic.gdx.box2d.structs.b2DistanceInput;
import com.badlogic.gdx.box2d.structs.b2Simplex;
import com.badlogic.gdx.box2d.structs.b2ShapeCastPairInput;
import com.badlogic.gdx.box2d.structs.b2ShapeProxy;
import com.badlogic.gdx.box2d.structs.b2Sweep;
import com.badlogic.gdx.box2d.structs.b2TOIOutput;
import com.badlogic.gdx.box2d.structs.b2TOIInput;
import com.badlogic.gdx.box2d.structs.b2Manifold;
import com.badlogic.gdx.box2d.structs.b2ChainSegment;
import com.badlogic.gdx.box2d.structs.b2DynamicTree;
import com.badlogic.gdx.box2d.structs.b2TreeStats;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import com.badlogic.gdx.box2d.structs.b2BodyId;
import com.badlogic.gdx.box2d.structs.b2ShapeId;
import com.badlogic.gdx.box2d.structs.b2ChainId;
import com.badlogic.gdx.box2d.structs.b2JointId;
import com.badlogic.gdx.box2d.structs.b2WorldDef;
import com.badlogic.gdx.box2d.structs.b2BodyDef;
import com.badlogic.gdx.box2d.structs.b2Filter;
import com.badlogic.gdx.box2d.structs.b2QueryFilter;
import com.badlogic.gdx.box2d.structs.b2ShapeDef;
import com.badlogic.gdx.box2d.structs.b2ChainDef;
import com.badlogic.gdx.box2d.structs.b2DistanceJointDef;
import com.badlogic.gdx.box2d.structs.b2MotorJointDef;
import com.badlogic.gdx.box2d.structs.b2MouseJointDef;
import com.badlogic.gdx.box2d.structs.b2NullJointDef;
import com.badlogic.gdx.box2d.structs.b2PrismaticJointDef;
import com.badlogic.gdx.box2d.structs.b2RevoluteJointDef;
import com.badlogic.gdx.box2d.structs.b2WeldJointDef;
import com.badlogic.gdx.box2d.structs.b2WheelJointDef;
import com.badlogic.gdx.box2d.structs.b2ExplosionDef;
import com.badlogic.gdx.box2d.structs.b2DebugDraw;
import com.badlogic.gdx.box2d.structs.b2WorldId;
import com.badlogic.gdx.box2d.structs.b2BodyEvents;
import com.badlogic.gdx.box2d.structs.b2SensorEvents;
import com.badlogic.gdx.box2d.structs.b2ContactEvents;
import com.badlogic.gdx.box2d.structs.b2RayResult;
import com.badlogic.gdx.box2d.structs.b2Profile;
import com.badlogic.gdx.box2d.structs.b2Counters;
import com.badlogic.gdx.box2d.enums.b2BodyType;
import com.badlogic.gdx.box2d.structs.b2ContactData;
import com.badlogic.gdx.box2d.enums.b2ShapeType;
import com.badlogic.gdx.box2d.enums.b2JointType;
import com.badlogic.gdx.jnigen.runtime.closure.Closure;
import com.badlogic.gdx.box2d.Box2d_Internal.b2OverlapResultFcn_Internal;
import com.badlogic.gdx.box2d.Box2d_Internal.b2TreeQueryCallbackFcn_Internal;
import com.badlogic.gdx.box2d.Box2d_Internal.b2TaskCallback_Internal;
import com.badlogic.gdx.box2d.Box2d_Internal.b2EnqueueTaskCallback_Internal;
import com.badlogic.gdx.box2d.Box2d_Internal.b2CastResultFcn_Internal;
import com.badlogic.gdx.box2d.Box2d_Internal.b2TreeShapeCastCallbackFcn_Internal;
import com.badlogic.gdx.box2d.Box2d_Internal.b2PreSolveFcn_Internal;
import com.badlogic.gdx.box2d.Box2d_Internal.b2AllocFcn_Internal;
import com.badlogic.gdx.box2d.Box2d_Internal.b2AssertFcn_Internal;
import com.badlogic.gdx.box2d.Box2d_Internal.b2CustomFilterFcn_Internal;
import com.badlogic.gdx.box2d.Box2d_Internal.b2TreeRayCastCallbackFcn_Internal;
import com.badlogic.gdx.box2d.Box2d_Internal.b2FreeFcn_Internal;
import com.badlogic.gdx.box2d.Box2d_Internal.b2FinishTaskCallback_Internal;

@SuppressWarnings("unused")
public final class Box2d {

    static {
        new SharedLibraryLoader().load("gdx-box2d");
        CHandler.init();
        FFITypes.init();
        init(IllegalArgumentException.class, CXXException.class);

        // Yes, this technically leaks, but this is expected to live for the entire program lifetime
        b2SetAssertFcn(ClosureObject.fromClosure((condition, fileName, lineNumber) -> {
            throw new Box2dAssertionError("BOX2D ASSERTION: " + condition.getString() + ", " + fileName.getString() + ", line " + lineNumber);
        }));
    }

    public static void initialize() {
    }

    /*JNI
#include <jnigen.h>
#include <box2d/box2d.h>

static jclass illegalArgumentExceptionClass = NULL;
static jclass cxxExceptionClass = NULL;
*/
    private static native void init(Class<?> illegalArgumentException, Class<?> cxxException);/*
    	illegalArgumentExceptionClass = (jclass)env->NewGlobalRef(illegalArgumentException);
    	cxxExceptionClass = (jclass)env->NewGlobalRef(cxxException);
    */

    /**
     * This allows the user to override the allocation functions. These should be
     * set during application startup.
     */
    public static void b2SetAllocator(ClosureObject<b2AllocFcn> allocFcn, ClosureObject<b2FreeFcn> freeFcn) {
        b2SetAllocator_internal(allocFcn.getPointer(), freeFcn.getPointer());
    }

    static private native void b2SetAllocator_internal(long allocFcn, long freeFcn);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2SetAllocator((b2AllocFcn *)allocFcn, (b2FreeFcn *)freeFcn);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * @return the total bytes allocated by Box2D
     */
    public static int b2GetByteCount() {
        return b2GetByteCount_internal();
    }

    static private native int b2GetByteCount_internal();/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)b2GetByteCount();
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Override the default assert callback
     * @param assertFcn a non-null assert callback
     */
    public static void b2SetAssertFcn(ClosureObject<b2AssertFcn> assertFcn) {
        b2SetAssertFcn_internal(assertFcn.getPointer());
    }

    static private native void b2SetAssertFcn_internal(long assertFcn);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2SetAssertFcn((b2AssertFcn *)assertFcn);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static int b2InternalAssertFcn(CSizedIntPointer condition, CSizedIntPointer fileName, int lineNumber) {
        condition.assertHasCTypeBacking("const char");
        fileName.assertHasCTypeBacking("const char");
        return b2InternalAssertFcn_internal(condition.getPointer(), fileName.getPointer(), lineNumber);
    }

    static private native int b2InternalAssertFcn_internal(long condition, long fileName, int lineNumber);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, int, lineNumber, 2, return 0);
    	return (jint)b2InternalAssertFcn((const char *)condition, (const char *)fileName, (int)lineNumber);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the current version of Box2D
     */
    public static b2Version b2GetVersion() {
        return new b2Version(b2GetVersion_internal(), true);
    }

    static private native long b2GetVersion_internal();/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Version* _ret = (b2Version*)malloc(sizeof(b2Version));
    	*_ret = b2GetVersion();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the absolute number of system ticks. The value is platform specific.
     */
    public static long b2GetTicks() {
        return b2GetTicks_internal();
    }

    static private native long b2GetTicks_internal();/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)b2GetTicks();
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the milliseconds passed from an initial tick value.
     */
    public static float b2GetMilliseconds(long ticks) {
        return b2GetMilliseconds_internal(ticks);
    }

    static private native float b2GetMilliseconds_internal(long ticks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, uint64_t, ticks, 0, return 0);
    	return (jfloat)b2GetMilliseconds((uint64_t)ticks);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the milliseconds passed from an initial tick value.
     */
    public static float b2GetMillisecondsAndReset(CSizedIntPointer ticks) {
        ticks.assertHasCTypeBacking("uint64_t");
        return b2GetMillisecondsAndReset_internal(ticks.getPointer());
    }

    static private native float b2GetMillisecondsAndReset_internal(long ticks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2GetMillisecondsAndReset((uint64_t *)ticks);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Yield to be used in a busy loop.
     */
    public static void b2Yield() {
        b2Yield_internal();
    }

    static private native void b2Yield_internal();/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Yield();
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static long b2Hash(long hash, CSizedIntPointer data, int count) {
        data.assertHasCTypeBacking("const uint8_t");
        return b2Hash_internal(hash, data.getPointer(), count);
    }

    static private native long b2Hash_internal(long hash, long data, int count);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, int, count, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, uint32_t, hash, 0, return 0);
    	return (jlong)b2Hash((uint32_t)hash, (const uint8_t *)data, (int)count);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * @return the minimum of two integers
     */
    public static int b2MinInt(int a, int b) {
        return b2MinInt_internal(a, b);
    }

    static private native int b2MinInt_internal(int a, int b);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, int, b, 1, return 0);
    	CHECK_AND_THROW_C_TYPE(env, int, a, 0, return 0);
    	return (jint)b2MinInt((int)a, (int)b);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * @return the maximum of two integers
     */
    public static int b2MaxInt(int a, int b) {
        return b2MaxInt_internal(a, b);
    }

    static private native int b2MaxInt_internal(int a, int b);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, int, b, 1, return 0);
    	CHECK_AND_THROW_C_TYPE(env, int, a, 0, return 0);
    	return (jint)b2MaxInt((int)a, (int)b);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * @return the absolute value of an integer
     */
    public static int b2AbsInt(int a) {
        return b2AbsInt_internal(a);
    }

    static private native int b2AbsInt_internal(int a);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, int, a, 0, return 0);
    	return (jint)b2AbsInt((int)a);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * @return an integer clamped between a lower and upper bound
     */
    public static int b2ClampInt(int a, int lower, int upper) {
        return b2ClampInt_internal(a, lower, upper);
    }

    static private native int b2ClampInt_internal(int a, int lower, int upper);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, int, upper, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, int, lower, 1, return 0);
    	CHECK_AND_THROW_C_TYPE(env, int, a, 0, return 0);
    	return (jint)b2ClampInt((int)a, (int)lower, (int)upper);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * @return the minimum of two floats
     */
    public static float b2MinFloat(float a, float b) {
        return b2MinFloat_internal(a, b);
    }

    static private native float b2MinFloat_internal(float a, float b);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2MinFloat((float)a, (float)b);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * @return the maximum of two floats
     */
    public static float b2MaxFloat(float a, float b) {
        return b2MaxFloat_internal(a, b);
    }

    static private native float b2MaxFloat_internal(float a, float b);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2MaxFloat((float)a, (float)b);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * @return the absolute value of a float
     */
    public static float b2AbsFloat(float a) {
        return b2AbsFloat_internal(a);
    }

    static private native float b2AbsFloat_internal(float a);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2AbsFloat((float)a);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * @return a float clamped between a lower and upper bound
     */
    public static float b2ClampFloat(float a, float lower, float upper) {
        return b2ClampFloat_internal(a, lower, upper);
    }

    static private native float b2ClampFloat_internal(float a, float lower, float upper);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2ClampFloat((float)a, (float)lower, (float)upper);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     *  Compute an approximate arctangent in the range [-pi, pi]
     *  This is hand coded for cross-platform determinism. The atan2f
     *  function in the standard library is not cross-platform deterministic.
     * 	Accurate to around 0.0023 degrees
     */
    public static float b2Atan2(float y, float x) {
        return b2Atan2_internal(y, x);
    }

    static private native float b2Atan2_internal(float y, float x);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2Atan2((float)y, (float)x);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Compute the cosine and sine of an angle in radians. Implemented
     * for cross-platform determinism.
     */
    public static b2CosSin b2ComputeCosSin(float radians) {
        return new b2CosSin(b2ComputeCosSin_internal(radians), true);
    }

    static private native long b2ComputeCosSin_internal(float radians);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2CosSin* _ret = (b2CosSin*)malloc(sizeof(b2CosSin));
    	*_ret = b2ComputeCosSin((float)radians);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Vector dot product
     */
    public static float b2Dot(b2Vec2 a, b2Vec2 b) {
        return b2Dot_internal(a.getPointer(), b.getPointer());
    }

    static private native float b2Dot_internal(long a, long b);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2Dot(*(b2Vec2*)a, *(b2Vec2*)b);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Vector cross product. In 2D this yields a scalar.
     */
    public static float b2Cross(b2Vec2 a, b2Vec2 b) {
        return b2Cross_internal(a.getPointer(), b.getPointer());
    }

    static private native float b2Cross_internal(long a, long b);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2Cross(*(b2Vec2*)a, *(b2Vec2*)b);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Perform the cross product on a vector and a scalar. In 2D this produces a vector.
     */
    public static b2Vec2 b2CrossVS(b2Vec2 v, float s) {
        return new b2Vec2(b2CrossVS_internal(v.getPointer(), s), true);
    }

    static private native long b2CrossVS_internal(long v, float s);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2CrossVS(*(b2Vec2*)v, (float)s);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Perform the cross product on a scalar and a vector. In 2D this produces a vector.
     */
    public static b2Vec2 b2CrossSV(float s, b2Vec2 v) {
        return new b2Vec2(b2CrossSV_internal(s, v.getPointer()), true);
    }

    static private native long b2CrossSV_internal(float s, long v);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2CrossSV((float)s, *(b2Vec2*)v);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get a left pointing perpendicular vector. Equivalent to b2CrossSV(1.0f, v)
     */
    public static b2Vec2 b2LeftPerp(b2Vec2 v) {
        return new b2Vec2(b2LeftPerp_internal(v.getPointer()), true);
    }

    static private native long b2LeftPerp_internal(long v);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2LeftPerp(*(b2Vec2*)v);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get a right pointing perpendicular vector. Equivalent to b2CrossVS(v, 1.0f)
     */
    public static b2Vec2 b2RightPerp(b2Vec2 v) {
        return new b2Vec2(b2RightPerp_internal(v.getPointer()), true);
    }

    static private native long b2RightPerp_internal(long v);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2RightPerp(*(b2Vec2*)v);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Vector addition
     */
    public static b2Vec2 b2Add(b2Vec2 a, b2Vec2 b) {
        return new b2Vec2(b2Add_internal(a.getPointer(), b.getPointer()), true);
    }

    static private native long b2Add_internal(long a, long b);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Add(*(b2Vec2*)a, *(b2Vec2*)b);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Vector subtraction
     */
    public static b2Vec2 b2Sub(b2Vec2 a, b2Vec2 b) {
        return new b2Vec2(b2Sub_internal(a.getPointer(), b.getPointer()), true);
    }

    static private native long b2Sub_internal(long a, long b);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Sub(*(b2Vec2*)a, *(b2Vec2*)b);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Vector negation
     */
    public static b2Vec2 b2Neg(b2Vec2 a) {
        return new b2Vec2(b2Neg_internal(a.getPointer()), true);
    }

    static private native long b2Neg_internal(long a);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Neg(*(b2Vec2*)a);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Vector linear interpolation
     * https://fgiesen.wordpress.com/2012/08/15/linear-interpolation-past-present-and-future/
     */
    public static b2Vec2 b2Lerp(b2Vec2 a, b2Vec2 b, float t) {
        return new b2Vec2(b2Lerp_internal(a.getPointer(), b.getPointer(), t), true);
    }

    static private native long b2Lerp_internal(long a, long b, float t);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Lerp(*(b2Vec2*)a, *(b2Vec2*)b, (float)t);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Component-wise multiplication
     */
    public static b2Vec2 b2Mul(b2Vec2 a, b2Vec2 b) {
        return new b2Vec2(b2Mul_internal(a.getPointer(), b.getPointer()), true);
    }

    static private native long b2Mul_internal(long a, long b);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Mul(*(b2Vec2*)a, *(b2Vec2*)b);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Multiply a scalar and vector
     */
    public static b2Vec2 b2MulSV(float s, b2Vec2 v) {
        return new b2Vec2(b2MulSV_internal(s, v.getPointer()), true);
    }

    static private native long b2MulSV_internal(float s, long v);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2MulSV((float)s, *(b2Vec2*)v);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * a + s * b
     */
    public static b2Vec2 b2MulAdd(b2Vec2 a, float s, b2Vec2 b) {
        return new b2Vec2(b2MulAdd_internal(a.getPointer(), s, b.getPointer()), true);
    }

    static private native long b2MulAdd_internal(long a, float s, long b);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2MulAdd(*(b2Vec2*)a, (float)s, *(b2Vec2*)b);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * a - s * b
     */
    public static b2Vec2 b2MulSub(b2Vec2 a, float s, b2Vec2 b) {
        return new b2Vec2(b2MulSub_internal(a.getPointer(), s, b.getPointer()), true);
    }

    static private native long b2MulSub_internal(long a, float s, long b);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2MulSub(*(b2Vec2*)a, (float)s, *(b2Vec2*)b);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Component-wise absolute vector
     */
    public static b2Vec2 b2Abs(b2Vec2 a) {
        return new b2Vec2(b2Abs_internal(a.getPointer()), true);
    }

    static private native long b2Abs_internal(long a);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Abs(*(b2Vec2*)a);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Component-wise minimum vector
     */
    public static b2Vec2 b2Min(b2Vec2 a, b2Vec2 b) {
        return new b2Vec2(b2Min_internal(a.getPointer(), b.getPointer()), true);
    }

    static private native long b2Min_internal(long a, long b);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Min(*(b2Vec2*)a, *(b2Vec2*)b);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Component-wise maximum vector
     */
    public static b2Vec2 b2Max(b2Vec2 a, b2Vec2 b) {
        return new b2Vec2(b2Max_internal(a.getPointer(), b.getPointer()), true);
    }

    static private native long b2Max_internal(long a, long b);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Max(*(b2Vec2*)a, *(b2Vec2*)b);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Component-wise clamp vector v into the range [a, b]
     */
    public static b2Vec2 b2Clamp(b2Vec2 v, b2Vec2 a, b2Vec2 b) {
        return new b2Vec2(b2Clamp_internal(v.getPointer(), a.getPointer(), b.getPointer()), true);
    }

    static private native long b2Clamp_internal(long v, long a, long b);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Clamp(*(b2Vec2*)v, *(b2Vec2*)a, *(b2Vec2*)b);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the length of this vector (the norm)
     */
    public static float b2Length(b2Vec2 v) {
        return b2Length_internal(v.getPointer());
    }

    static private native float b2Length_internal(long v);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2Length(*(b2Vec2*)v);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the distance between two points
     */
    public static float b2Distance(b2Vec2 a, b2Vec2 b) {
        return b2Distance_internal(a.getPointer(), b.getPointer());
    }

    static private native float b2Distance_internal(long a, long b);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2Distance(*(b2Vec2*)a, *(b2Vec2*)b);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Convert a vector into a unit vector if possible, otherwise returns the zero vector.
     */
    public static b2Vec2 b2Normalize(b2Vec2 v) {
        return new b2Vec2(b2Normalize_internal(v.getPointer()), true);
    }

    static private native long b2Normalize_internal(long v);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Normalize(*(b2Vec2*)v);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Convert a vector into a unit vector if possible, otherwise returns the zero vector. Also
     * outputs the length.
     */
    public static b2Vec2 b2GetLengthAndNormalize(FloatPointer length, b2Vec2 v) {
        return new b2Vec2(b2GetLengthAndNormalize_internal(length.getPointer(), v.getPointer()), true);
    }

    static private native long b2GetLengthAndNormalize_internal(long length, long v);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2GetLengthAndNormalize((float *)length, *(b2Vec2*)v);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Normalize rotation
     */
    public static b2Rot b2NormalizeRot(b2Rot q) {
        return new b2Rot(b2NormalizeRot_internal(q.getPointer()), true);
    }

    static private native long b2NormalizeRot_internal(long q);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Rot* _ret = (b2Rot*)malloc(sizeof(b2Rot));
    	*_ret = b2NormalizeRot(*(b2Rot*)q);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Integrate rotation from angular velocity
     * @param q1 initial rotation
     * @param deltaAngle the angular displacement in radians
     */
    public static b2Rot b2IntegrateRotation(b2Rot q1, float deltaAngle) {
        return new b2Rot(b2IntegrateRotation_internal(q1.getPointer(), deltaAngle), true);
    }

    static private native long b2IntegrateRotation_internal(long q1, float deltaAngle);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Rot* _ret = (b2Rot*)malloc(sizeof(b2Rot));
    	*_ret = b2IntegrateRotation(*(b2Rot*)q1, (float)deltaAngle);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the length squared of this vector
     */
    public static float b2LengthSquared(b2Vec2 v) {
        return b2LengthSquared_internal(v.getPointer());
    }

    static private native float b2LengthSquared_internal(long v);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2LengthSquared(*(b2Vec2*)v);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the distance squared between points
     */
    public static float b2DistanceSquared(b2Vec2 a, b2Vec2 b) {
        return b2DistanceSquared_internal(a.getPointer(), b.getPointer());
    }

    static private native float b2DistanceSquared_internal(long a, long b);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2DistanceSquared(*(b2Vec2*)a, *(b2Vec2*)b);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Make a rotation using an angle in radians
     */
    public static b2Rot b2MakeRot(float radians) {
        return new b2Rot(b2MakeRot_internal(radians), true);
    }

    static private native long b2MakeRot_internal(float radians);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Rot* _ret = (b2Rot*)malloc(sizeof(b2Rot));
    	*_ret = b2MakeRot((float)radians);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Compute the rotation between two unit vectors
     */
    public static b2Rot b2ComputeRotationBetweenUnitVectors(b2Vec2 v1, b2Vec2 v2) {
        return new b2Rot(b2ComputeRotationBetweenUnitVectors_internal(v1.getPointer(), v2.getPointer()), true);
    }

    static private native long b2ComputeRotationBetweenUnitVectors_internal(long v1, long v2);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Rot* _ret = (b2Rot*)malloc(sizeof(b2Rot));
    	*_ret = b2ComputeRotationBetweenUnitVectors(*(b2Vec2*)v1, *(b2Vec2*)v2);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Is this rotation normalized?
     */
    public static boolean b2IsNormalized(b2Rot q) {
        return b2IsNormalized_internal(q.getPointer());
    }

    static private native boolean b2IsNormalized_internal(long q);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2IsNormalized(*(b2Rot*)q);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     *  Normalized linear interpolation
     *  https://fgiesen.wordpress.com/2012/08/15/linear-interpolation-past-present-and-future/
     * 	https://web.archive.org/web/20170825184056/http://number-none.com/product/Understanding%20Slerp,%20Then%20Not%20Using%20It/
     */
    public static b2Rot b2NLerp(b2Rot q1, b2Rot q2, float t) {
        return new b2Rot(b2NLerp_internal(q1.getPointer(), q2.getPointer(), t), true);
    }

    static private native long b2NLerp_internal(long q1, long q2, float t);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Rot* _ret = (b2Rot*)malloc(sizeof(b2Rot));
    	*_ret = b2NLerp(*(b2Rot*)q1, *(b2Rot*)q2, (float)t);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Compute the angular velocity necessary to rotate between two rotations over a give time
     * @param q1 initial rotation
     * @param q2 final rotation
     * @param inv_h inverse time step
     */
    public static float b2ComputeAngularVelocity(b2Rot q1, b2Rot q2, float inv_h) {
        return b2ComputeAngularVelocity_internal(q1.getPointer(), q2.getPointer(), inv_h);
    }

    static private native float b2ComputeAngularVelocity_internal(long q1, long q2, float inv_h);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2ComputeAngularVelocity(*(b2Rot*)q1, *(b2Rot*)q2, (float)inv_h);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the angle in radians in the range [-pi, pi]
     */
    public static float b2Rot_GetAngle(b2Rot q) {
        return b2Rot_GetAngle_internal(q.getPointer());
    }

    static private native float b2Rot_GetAngle_internal(long q);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2Rot_GetAngle(*(b2Rot*)q);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the x-axis
     */
    public static b2Vec2 b2Rot_GetXAxis(b2Rot q) {
        return new b2Vec2(b2Rot_GetXAxis_internal(q.getPointer()), true);
    }

    static private native long b2Rot_GetXAxis_internal(long q);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Rot_GetXAxis(*(b2Rot*)q);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the y-axis
     */
    public static b2Vec2 b2Rot_GetYAxis(b2Rot q) {
        return new b2Vec2(b2Rot_GetYAxis_internal(q.getPointer()), true);
    }

    static private native long b2Rot_GetYAxis_internal(long q);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Rot_GetYAxis(*(b2Rot*)q);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Multiply two rotations: q * r
     */
    public static b2Rot b2MulRot(b2Rot q, b2Rot r) {
        return new b2Rot(b2MulRot_internal(q.getPointer(), r.getPointer()), true);
    }

    static private native long b2MulRot_internal(long q, long r);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Rot* _ret = (b2Rot*)malloc(sizeof(b2Rot));
    	*_ret = b2MulRot(*(b2Rot*)q, *(b2Rot*)r);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Transpose multiply two rotations: qT * r
     */
    public static b2Rot b2InvMulRot(b2Rot q, b2Rot r) {
        return new b2Rot(b2InvMulRot_internal(q.getPointer(), r.getPointer()), true);
    }

    static private native long b2InvMulRot_internal(long q, long r);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Rot* _ret = (b2Rot*)malloc(sizeof(b2Rot));
    	*_ret = b2InvMulRot(*(b2Rot*)q, *(b2Rot*)r);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * relative angle between b and a (rot_b * inv(rot_a))
     */
    public static float b2RelativeAngle(b2Rot b, b2Rot a) {
        return b2RelativeAngle_internal(b.getPointer(), a.getPointer());
    }

    static private native float b2RelativeAngle_internal(long b, long a);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2RelativeAngle(*(b2Rot*)b, *(b2Rot*)a);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Convert an angle in the range [-2*pi, 2*pi] into the range [-pi, pi]
     */
    public static float b2UnwindAngle(float radians) {
        return b2UnwindAngle_internal(radians);
    }

    static private native float b2UnwindAngle_internal(float radians);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2UnwindAngle((float)radians);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Convert any into the range [-pi, pi] (slow)
     */
    public static float b2UnwindLargeAngle(float radians) {
        return b2UnwindLargeAngle_internal(radians);
    }

    static private native float b2UnwindLargeAngle_internal(float radians);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2UnwindLargeAngle((float)radians);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Rotate a vector
     */
    public static b2Vec2 b2RotateVector(b2Rot q, b2Vec2 v) {
        return new b2Vec2(b2RotateVector_internal(q.getPointer(), v.getPointer()), true);
    }

    static private native long b2RotateVector_internal(long q, long v);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2RotateVector(*(b2Rot*)q, *(b2Vec2*)v);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Inverse rotate a vector
     */
    public static b2Vec2 b2InvRotateVector(b2Rot q, b2Vec2 v) {
        return new b2Vec2(b2InvRotateVector_internal(q.getPointer(), v.getPointer()), true);
    }

    static private native long b2InvRotateVector_internal(long q, long v);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2InvRotateVector(*(b2Rot*)q, *(b2Vec2*)v);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Transform a point (e.g. local space to world space)
     */
    public static b2Vec2 b2TransformPoint(b2Transform t, b2Vec2 p) {
        return new b2Vec2(b2TransformPoint_internal(t.getPointer(), p.getPointer()), true);
    }

    static private native long b2TransformPoint_internal(long t, long p);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2TransformPoint(*(b2Transform*)t, *(b2Vec2*)p);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Inverse transform a point (e.g. world space to local space)
     */
    public static b2Vec2 b2InvTransformPoint(b2Transform t, b2Vec2 p) {
        return new b2Vec2(b2InvTransformPoint_internal(t.getPointer(), p.getPointer()), true);
    }

    static private native long b2InvTransformPoint_internal(long t, long p);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2InvTransformPoint(*(b2Transform*)t, *(b2Vec2*)p);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Multiply two transforms. If the result is applied to a point p local to frame B,
     * the transform would first convert p to a point local to frame A, then into a point
     * in the world frame.
     * v2 = A.q.Rot(B.q.Rot(v1) + B.p) + A.p
     *    = (A.q * B.q).Rot(v1) + A.q.Rot(B.p) + A.p
     */
    public static b2Transform b2MulTransforms(b2Transform A, b2Transform B) {
        return new b2Transform(b2MulTransforms_internal(A.getPointer(), B.getPointer()), true);
    }

    static private native long b2MulTransforms_internal(long A, long B);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Transform* _ret = (b2Transform*)malloc(sizeof(b2Transform));
    	*_ret = b2MulTransforms(*(b2Transform*)A, *(b2Transform*)B);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Creates a transform that converts a local point in frame B to a local point in frame A.
     * v2 = A.q' * (B.q * v1 + B.p - A.p)
     *    = A.q' * B.q * v1 + A.q' * (B.p - A.p)
     */
    public static b2Transform b2InvMulTransforms(b2Transform A, b2Transform B) {
        return new b2Transform(b2InvMulTransforms_internal(A.getPointer(), B.getPointer()), true);
    }

    static private native long b2InvMulTransforms_internal(long A, long B);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Transform* _ret = (b2Transform*)malloc(sizeof(b2Transform));
    	*_ret = b2InvMulTransforms(*(b2Transform*)A, *(b2Transform*)B);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Multiply a 2-by-2 matrix times a 2D vector
     */
    public static b2Vec2 b2MulMV(b2Mat22 A, b2Vec2 v) {
        return new b2Vec2(b2MulMV_internal(A.getPointer(), v.getPointer()), true);
    }

    static private native long b2MulMV_internal(long A, long v);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2MulMV(*(b2Mat22*)A, *(b2Vec2*)v);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the inverse of a 2-by-2 matrix
     */
    public static b2Mat22 b2GetInverse22(b2Mat22 A) {
        return new b2Mat22(b2GetInverse22_internal(A.getPointer()), true);
    }

    static private native long b2GetInverse22_internal(long A);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Mat22* _ret = (b2Mat22*)malloc(sizeof(b2Mat22));
    	*_ret = b2GetInverse22(*(b2Mat22*)A);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Solve A * x = b, where b is a column vector. This is more efficient
     * than computing the inverse in one-shot cases.
     */
    public static b2Vec2 b2Solve22(b2Mat22 A, b2Vec2 b) {
        return new b2Vec2(b2Solve22_internal(A.getPointer(), b.getPointer()), true);
    }

    static private native long b2Solve22_internal(long A, long b);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Solve22(*(b2Mat22*)A, *(b2Vec2*)b);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Does a fully contain b
     */
    public static boolean b2AABB_Contains(b2AABB a, b2AABB b) {
        return b2AABB_Contains_internal(a.getPointer(), b.getPointer());
    }

    static private native boolean b2AABB_Contains_internal(long a, long b);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2AABB_Contains(*(b2AABB*)a, *(b2AABB*)b);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the center of the AABB.
     */
    public static b2Vec2 b2AABB_Center(b2AABB a) {
        return new b2Vec2(b2AABB_Center_internal(a.getPointer()), true);
    }

    static private native long b2AABB_Center_internal(long a);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2AABB_Center(*(b2AABB*)a);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the extents of the AABB (half-widths).
     */
    public static b2Vec2 b2AABB_Extents(b2AABB a) {
        return new b2Vec2(b2AABB_Extents_internal(a.getPointer()), true);
    }

    static private native long b2AABB_Extents_internal(long a);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2AABB_Extents(*(b2AABB*)a);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Union of two AABBs
     */
    public static b2AABB b2AABB_Union(b2AABB a, b2AABB b) {
        return new b2AABB(b2AABB_Union_internal(a.getPointer(), b.getPointer()), true);
    }

    static private native long b2AABB_Union_internal(long a, long b);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2AABB* _ret = (b2AABB*)malloc(sizeof(b2AABB));
    	*_ret = b2AABB_Union(*(b2AABB*)a, *(b2AABB*)b);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Is this a valid number? Not NaN or infinity.
     */
    public static boolean b2IsValidFloat(float a) {
        return b2IsValidFloat_internal(a);
    }

    static private native boolean b2IsValidFloat_internal(float a);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2IsValidFloat((float)a);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Is this a valid vector? Not NaN or infinity.
     */
    public static boolean b2IsValidVec2(b2Vec2 v) {
        return b2IsValidVec2_internal(v.getPointer());
    }

    static private native boolean b2IsValidVec2_internal(long v);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2IsValidVec2(*(b2Vec2*)v);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Is this a valid rotation? Not NaN or infinity. Is normalized.
     */
    public static boolean b2IsValidRotation(b2Rot q) {
        return b2IsValidRotation_internal(q.getPointer());
    }

    static private native boolean b2IsValidRotation_internal(long q);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2IsValidRotation(*(b2Rot*)q);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Is this a valid bounding box? Not Nan or infinity. Upper bound greater than or equal to lower bound.
     */
    public static boolean b2IsValidAABB(b2AABB aabb) {
        return b2IsValidAABB_internal(aabb.getPointer());
    }

    static private native boolean b2IsValidAABB_internal(long aabb);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2IsValidAABB(*(b2AABB*)aabb);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Box2D bases all length units on meters, but you may need different units for your game.
     * You can set this value to use different units. This should be done at application startup
     * and only modified once. Default value is 1.
     * For example, if your game uses pixels for units you can use pixels for all length values
     * sent to Box2D. There should be no extra cost. However, Box2D has some internal tolerances
     * and thresholds that have been tuned for meters. By calling this function, Box2D is able
     * to adjust those tolerances and thresholds to improve accuracy.
     * A good rule of thumb is to pass the height of your player character to this function. So
     * if your player character is 32 pixels high, then pass 32 to this function. Then you may
     * confidently use pixels for all the length values sent to Box2D. All length values returned
     * from Box2D will also be pixels because Box2D does not do any scaling internally.
     * However, you are now on the hook for coming up with good values for gravity, density, and
     * forces.
     * @warning This must be modified before any calls to Box2D
     */
    public static void b2SetLengthUnitsPerMeter(float lengthUnits) {
        b2SetLengthUnitsPerMeter_internal(lengthUnits);
    }

    static private native void b2SetLengthUnitsPerMeter_internal(float lengthUnits);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2SetLengthUnitsPerMeter((float)lengthUnits);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the current length units per meter.
     */
    public static float b2GetLengthUnitsPerMeter() {
        return b2GetLengthUnitsPerMeter_internal();
    }

    static private native float b2GetLengthUnitsPerMeter_internal();/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2GetLengthUnitsPerMeter();
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Validate ray cast input data (NaN, etc)
     */
    public static boolean b2IsValidRay(b2RayCastInput.b2RayCastInputPointer input) {
        return b2IsValidRay_internal(input.getPointer());
    }

    static private native boolean b2IsValidRay_internal(long input);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2IsValidRay((const b2RayCastInput *)input);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Make a convex polygon from a convex hull. This will assert if the hull is not valid.
     * @warning Do not manually fill in the hull data, it must come directly from b2ComputeHull
     */
    public static b2Polygon b2MakePolygon(b2Hull.b2HullPointer hull, float radius) {
        return new b2Polygon(b2MakePolygon_internal(hull.getPointer(), radius), true);
    }

    static private native long b2MakePolygon_internal(long hull, float radius);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Polygon* _ret = (b2Polygon*)malloc(sizeof(b2Polygon));
    	*_ret = b2MakePolygon((const b2Hull *)hull, (float)radius);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Make an offset convex polygon from a convex hull. This will assert if the hull is not valid.
     * @warning Do not manually fill in the hull data, it must come directly from b2ComputeHull
     */
    public static b2Polygon b2MakeOffsetPolygon(b2Hull.b2HullPointer hull, b2Vec2 position, b2Rot rotation) {
        return new b2Polygon(b2MakeOffsetPolygon_internal(hull.getPointer(), position.getPointer(), rotation.getPointer()), true);
    }

    static private native long b2MakeOffsetPolygon_internal(long hull, long position, long rotation);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Polygon* _ret = (b2Polygon*)malloc(sizeof(b2Polygon));
    	*_ret = b2MakeOffsetPolygon((const b2Hull *)hull, *(b2Vec2*)position, *(b2Rot*)rotation);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Make an offset convex polygon from a convex hull. This will assert if the hull is not valid.
     * @warning Do not manually fill in the hull data, it must come directly from b2ComputeHull
     */
    public static b2Polygon b2MakeOffsetRoundedPolygon(b2Hull.b2HullPointer hull, b2Vec2 position, b2Rot rotation, float radius) {
        return new b2Polygon(b2MakeOffsetRoundedPolygon_internal(hull.getPointer(), position.getPointer(), rotation.getPointer(), radius), true);
    }

    static private native long b2MakeOffsetRoundedPolygon_internal(long hull, long position, long rotation, float radius);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Polygon* _ret = (b2Polygon*)malloc(sizeof(b2Polygon));
    	*_ret = b2MakeOffsetRoundedPolygon((const b2Hull *)hull, *(b2Vec2*)position, *(b2Rot*)rotation, (float)radius);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Make a square polygon, bypassing the need for a convex hull.
     * @param halfWidth the half-width
     */
    public static b2Polygon b2MakeSquare(float halfWidth) {
        return new b2Polygon(b2MakeSquare_internal(halfWidth), true);
    }

    static private native long b2MakeSquare_internal(float halfWidth);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Polygon* _ret = (b2Polygon*)malloc(sizeof(b2Polygon));
    	*_ret = b2MakeSquare((float)halfWidth);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Make a box (rectangle) polygon, bypassing the need for a convex hull.
     * @param halfWidth the half-width (x-axis)
     * @param halfHeight the half-height (y-axis)
     */
    public static b2Polygon b2MakeBox(float halfWidth, float halfHeight) {
        return new b2Polygon(b2MakeBox_internal(halfWidth, halfHeight), true);
    }

    static private native long b2MakeBox_internal(float halfWidth, float halfHeight);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Polygon* _ret = (b2Polygon*)malloc(sizeof(b2Polygon));
    	*_ret = b2MakeBox((float)halfWidth, (float)halfHeight);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Make a rounded box, bypassing the need for a convex hull.
     * @param halfWidth the half-width (x-axis)
     * @param halfHeight the half-height (y-axis)
     * @param radius the radius of the rounded extension
     */
    public static b2Polygon b2MakeRoundedBox(float halfWidth, float halfHeight, float radius) {
        return new b2Polygon(b2MakeRoundedBox_internal(halfWidth, halfHeight, radius), true);
    }

    static private native long b2MakeRoundedBox_internal(float halfWidth, float halfHeight, float radius);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Polygon* _ret = (b2Polygon*)malloc(sizeof(b2Polygon));
    	*_ret = b2MakeRoundedBox((float)halfWidth, (float)halfHeight, (float)radius);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Make an offset box, bypassing the need for a convex hull.
     * @param halfWidth the half-width (x-axis)
     * @param halfHeight the half-height (y-axis)
     * @param center the local center of the box
     * @param rotation the local rotation of the box
     */
    public static b2Polygon b2MakeOffsetBox(float halfWidth, float halfHeight, b2Vec2 center, b2Rot rotation) {
        return new b2Polygon(b2MakeOffsetBox_internal(halfWidth, halfHeight, center.getPointer(), rotation.getPointer()), true);
    }

    static private native long b2MakeOffsetBox_internal(float halfWidth, float halfHeight, long center, long rotation);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Polygon* _ret = (b2Polygon*)malloc(sizeof(b2Polygon));
    	*_ret = b2MakeOffsetBox((float)halfWidth, (float)halfHeight, *(b2Vec2*)center, *(b2Rot*)rotation);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Make an offset rounded box, bypassing the need for a convex hull.
     * @param halfWidth the half-width (x-axis)
     * @param halfHeight the half-height (y-axis)
     * @param center the local center of the box
     * @param rotation the local rotation of the box
     * @param radius the radius of the rounded extension
     */
    public static b2Polygon b2MakeOffsetRoundedBox(float halfWidth, float halfHeight, b2Vec2 center, b2Rot rotation, float radius) {
        return new b2Polygon(b2MakeOffsetRoundedBox_internal(halfWidth, halfHeight, center.getPointer(), rotation.getPointer(), radius), true);
    }

    static private native long b2MakeOffsetRoundedBox_internal(float halfWidth, float halfHeight, long center, long rotation, float radius);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Polygon* _ret = (b2Polygon*)malloc(sizeof(b2Polygon));
    	*_ret = b2MakeOffsetRoundedBox((float)halfWidth, (float)halfHeight, *(b2Vec2*)center, *(b2Rot*)rotation, (float)radius);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Transform a polygon. This is useful for transferring a shape from one body to another.
     */
    public static b2Polygon b2TransformPolygon(b2Transform transform, b2Polygon.b2PolygonPointer polygon) {
        return new b2Polygon(b2TransformPolygon_internal(transform.getPointer(), polygon.getPointer()), true);
    }

    static private native long b2TransformPolygon_internal(long transform, long polygon);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Polygon* _ret = (b2Polygon*)malloc(sizeof(b2Polygon));
    	*_ret = b2TransformPolygon(*(b2Transform*)transform, (const b2Polygon *)polygon);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Compute mass properties of a circle
     */
    public static b2MassData b2ComputeCircleMass(b2Circle.b2CirclePointer shape, float density) {
        return new b2MassData(b2ComputeCircleMass_internal(shape.getPointer(), density), true);
    }

    static private native long b2ComputeCircleMass_internal(long shape, float density);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2MassData* _ret = (b2MassData*)malloc(sizeof(b2MassData));
    	*_ret = b2ComputeCircleMass((const b2Circle *)shape, (float)density);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Compute mass properties of a capsule
     */
    public static b2MassData b2ComputeCapsuleMass(b2Capsule.b2CapsulePointer shape, float density) {
        return new b2MassData(b2ComputeCapsuleMass_internal(shape.getPointer(), density), true);
    }

    static private native long b2ComputeCapsuleMass_internal(long shape, float density);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2MassData* _ret = (b2MassData*)malloc(sizeof(b2MassData));
    	*_ret = b2ComputeCapsuleMass((const b2Capsule *)shape, (float)density);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Compute mass properties of a polygon
     */
    public static b2MassData b2ComputePolygonMass(b2Polygon.b2PolygonPointer shape, float density) {
        return new b2MassData(b2ComputePolygonMass_internal(shape.getPointer(), density), true);
    }

    static private native long b2ComputePolygonMass_internal(long shape, float density);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2MassData* _ret = (b2MassData*)malloc(sizeof(b2MassData));
    	*_ret = b2ComputePolygonMass((const b2Polygon *)shape, (float)density);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Compute the bounding box of a transformed circle
     */
    public static b2AABB b2ComputeCircleAABB(b2Circle.b2CirclePointer shape, b2Transform transform) {
        return new b2AABB(b2ComputeCircleAABB_internal(shape.getPointer(), transform.getPointer()), true);
    }

    static private native long b2ComputeCircleAABB_internal(long shape, long transform);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2AABB* _ret = (b2AABB*)malloc(sizeof(b2AABB));
    	*_ret = b2ComputeCircleAABB((const b2Circle *)shape, *(b2Transform*)transform);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Compute the bounding box of a transformed capsule
     */
    public static b2AABB b2ComputeCapsuleAABB(b2Capsule.b2CapsulePointer shape, b2Transform transform) {
        return new b2AABB(b2ComputeCapsuleAABB_internal(shape.getPointer(), transform.getPointer()), true);
    }

    static private native long b2ComputeCapsuleAABB_internal(long shape, long transform);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2AABB* _ret = (b2AABB*)malloc(sizeof(b2AABB));
    	*_ret = b2ComputeCapsuleAABB((const b2Capsule *)shape, *(b2Transform*)transform);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Compute the bounding box of a transformed polygon
     */
    public static b2AABB b2ComputePolygonAABB(b2Polygon.b2PolygonPointer shape, b2Transform transform) {
        return new b2AABB(b2ComputePolygonAABB_internal(shape.getPointer(), transform.getPointer()), true);
    }

    static private native long b2ComputePolygonAABB_internal(long shape, long transform);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2AABB* _ret = (b2AABB*)malloc(sizeof(b2AABB));
    	*_ret = b2ComputePolygonAABB((const b2Polygon *)shape, *(b2Transform*)transform);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Compute the bounding box of a transformed line segment
     */
    public static b2AABB b2ComputeSegmentAABB(b2Segment.b2SegmentPointer shape, b2Transform transform) {
        return new b2AABB(b2ComputeSegmentAABB_internal(shape.getPointer(), transform.getPointer()), true);
    }

    static private native long b2ComputeSegmentAABB_internal(long shape, long transform);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2AABB* _ret = (b2AABB*)malloc(sizeof(b2AABB));
    	*_ret = b2ComputeSegmentAABB((const b2Segment *)shape, *(b2Transform*)transform);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Test a point for overlap with a circle in local space
     */
    public static boolean b2PointInCircle(b2Vec2 point, b2Circle.b2CirclePointer shape) {
        return b2PointInCircle_internal(point.getPointer(), shape.getPointer());
    }

    static private native boolean b2PointInCircle_internal(long point, long shape);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2PointInCircle(*(b2Vec2*)point, (const b2Circle *)shape);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Test a point for overlap with a capsule in local space
     */
    public static boolean b2PointInCapsule(b2Vec2 point, b2Capsule.b2CapsulePointer shape) {
        return b2PointInCapsule_internal(point.getPointer(), shape.getPointer());
    }

    static private native boolean b2PointInCapsule_internal(long point, long shape);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2PointInCapsule(*(b2Vec2*)point, (const b2Capsule *)shape);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Test a point for overlap with a convex polygon in local space
     */
    public static boolean b2PointInPolygon(b2Vec2 point, b2Polygon.b2PolygonPointer shape) {
        return b2PointInPolygon_internal(point.getPointer(), shape.getPointer());
    }

    static private native boolean b2PointInPolygon_internal(long point, long shape);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2PointInPolygon(*(b2Vec2*)point, (const b2Polygon *)shape);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Ray cast versus circle shape in local space. Initial overlap is treated as a miss.
     */
    public static b2CastOutput b2RayCastCircle(b2RayCastInput.b2RayCastInputPointer input, b2Circle.b2CirclePointer shape) {
        return new b2CastOutput(b2RayCastCircle_internal(input.getPointer(), shape.getPointer()), true);
    }

    static private native long b2RayCastCircle_internal(long input, long shape);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2CastOutput* _ret = (b2CastOutput*)malloc(sizeof(b2CastOutput));
    	*_ret = b2RayCastCircle((const b2RayCastInput *)input, (const b2Circle *)shape);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Ray cast versus capsule shape in local space. Initial overlap is treated as a miss.
     */
    public static b2CastOutput b2RayCastCapsule(b2RayCastInput.b2RayCastInputPointer input, b2Capsule.b2CapsulePointer shape) {
        return new b2CastOutput(b2RayCastCapsule_internal(input.getPointer(), shape.getPointer()), true);
    }

    static private native long b2RayCastCapsule_internal(long input, long shape);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2CastOutput* _ret = (b2CastOutput*)malloc(sizeof(b2CastOutput));
    	*_ret = b2RayCastCapsule((const b2RayCastInput *)input, (const b2Capsule *)shape);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Ray cast versus segment shape in local space. Optionally treat the segment as one-sided with hits from
     * the left side being treated as a miss.
     */
    public static b2CastOutput b2RayCastSegment(b2RayCastInput.b2RayCastInputPointer input, b2Segment.b2SegmentPointer shape, boolean oneSided) {
        return new b2CastOutput(b2RayCastSegment_internal(input.getPointer(), shape.getPointer(), oneSided), true);
    }

    static private native long b2RayCastSegment_internal(long input, long shape, boolean oneSided);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, oneSided, 2, return 0);
    	b2CastOutput* _ret = (b2CastOutput*)malloc(sizeof(b2CastOutput));
    	*_ret = b2RayCastSegment((const b2RayCastInput *)input, (const b2Segment *)shape, (bool)oneSided);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Ray cast versus polygon shape in local space. Initial overlap is treated as a miss.
     */
    public static b2CastOutput b2RayCastPolygon(b2RayCastInput.b2RayCastInputPointer input, b2Polygon.b2PolygonPointer shape) {
        return new b2CastOutput(b2RayCastPolygon_internal(input.getPointer(), shape.getPointer()), true);
    }

    static private native long b2RayCastPolygon_internal(long input, long shape);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2CastOutput* _ret = (b2CastOutput*)malloc(sizeof(b2CastOutput));
    	*_ret = b2RayCastPolygon((const b2RayCastInput *)input, (const b2Polygon *)shape);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Shape cast versus a circle. Initial overlap is treated as a miss.
     */
    public static b2CastOutput b2ShapeCastCircle(b2ShapeCastInput.b2ShapeCastInputPointer input, b2Circle.b2CirclePointer shape) {
        return new b2CastOutput(b2ShapeCastCircle_internal(input.getPointer(), shape.getPointer()), true);
    }

    static private native long b2ShapeCastCircle_internal(long input, long shape);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2CastOutput* _ret = (b2CastOutput*)malloc(sizeof(b2CastOutput));
    	*_ret = b2ShapeCastCircle((const b2ShapeCastInput *)input, (const b2Circle *)shape);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Shape cast versus a capsule. Initial overlap is treated as a miss.
     */
    public static b2CastOutput b2ShapeCastCapsule(b2ShapeCastInput.b2ShapeCastInputPointer input, b2Capsule.b2CapsulePointer shape) {
        return new b2CastOutput(b2ShapeCastCapsule_internal(input.getPointer(), shape.getPointer()), true);
    }

    static private native long b2ShapeCastCapsule_internal(long input, long shape);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2CastOutput* _ret = (b2CastOutput*)malloc(sizeof(b2CastOutput));
    	*_ret = b2ShapeCastCapsule((const b2ShapeCastInput *)input, (const b2Capsule *)shape);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Shape cast versus a line segment. Initial overlap is treated as a miss.
     */
    public static b2CastOutput b2ShapeCastSegment(b2ShapeCastInput.b2ShapeCastInputPointer input, b2Segment.b2SegmentPointer shape) {
        return new b2CastOutput(b2ShapeCastSegment_internal(input.getPointer(), shape.getPointer()), true);
    }

    static private native long b2ShapeCastSegment_internal(long input, long shape);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2CastOutput* _ret = (b2CastOutput*)malloc(sizeof(b2CastOutput));
    	*_ret = b2ShapeCastSegment((const b2ShapeCastInput *)input, (const b2Segment *)shape);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Shape cast versus a convex polygon. Initial overlap is treated as a miss.
     */
    public static b2CastOutput b2ShapeCastPolygon(b2ShapeCastInput.b2ShapeCastInputPointer input, b2Polygon.b2PolygonPointer shape) {
        return new b2CastOutput(b2ShapeCastPolygon_internal(input.getPointer(), shape.getPointer()), true);
    }

    static private native long b2ShapeCastPolygon_internal(long input, long shape);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2CastOutput* _ret = (b2CastOutput*)malloc(sizeof(b2CastOutput));
    	*_ret = b2ShapeCastPolygon((const b2ShapeCastInput *)input, (const b2Polygon *)shape);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Compute the convex hull of a set of points. Returns an empty hull if it fails.
     * Some failure cases:
     * - all points very close together
     * - all points on a line
     * - less than 3 points
     * - more than B2_MAX_POLYGON_VERTICES points
     * This welds close points and removes collinear points.
     * @warning Do not modify a hull once it has been computed
     */
    public static b2Hull b2ComputeHull(b2Vec2.b2Vec2Pointer points, int count) {
        return new b2Hull(b2ComputeHull_internal(points.getPointer(), count), true);
    }

    static private native long b2ComputeHull_internal(long points, int count);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, int, count, 1, return 0);
    	b2Hull* _ret = (b2Hull*)malloc(sizeof(b2Hull));
    	*_ret = b2ComputeHull((const b2Vec2 *)points, (int)count);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * This determines if a hull is valid. Checks for:
     * - convexity
     * - collinear points
     * This is expensive and should not be called at runtime.
     */
    public static boolean b2ValidateHull(b2Hull.b2HullPointer hull) {
        return b2ValidateHull_internal(hull.getPointer());
    }

    static private native boolean b2ValidateHull_internal(long hull);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2ValidateHull((const b2Hull *)hull);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Compute the distance between two line segments, clamping at the end points if needed.
     */
    public static b2SegmentDistanceResult b2SegmentDistance(b2Vec2 p1, b2Vec2 q1, b2Vec2 p2, b2Vec2 q2) {
        return new b2SegmentDistanceResult(b2SegmentDistance_internal(p1.getPointer(), q1.getPointer(), p2.getPointer(), q2.getPointer()), true);
    }

    static private native long b2SegmentDistance_internal(long p1, long q1, long p2, long q2);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2SegmentDistanceResult* _ret = (b2SegmentDistanceResult*)malloc(sizeof(b2SegmentDistanceResult));
    	*_ret = b2SegmentDistance(*(b2Vec2*)p1, *(b2Vec2*)q1, *(b2Vec2*)p2, *(b2Vec2*)q2);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Compute the closest points between two shapes represented as point clouds.
     * b2SimplexCache cache is input/output. On the first call set b2SimplexCache.count to zero.
     * The underlying GJK algorithm may be debugged by passing in debug simplexes and capacity. You may pass in NULL and 0 for these.
     */
    public static b2DistanceOutput b2ShapeDistance(b2SimplexCache.b2SimplexCachePointer cache, b2DistanceInput.b2DistanceInputPointer input, b2Simplex.b2SimplexPointer simplexes, int simplexCapacity) {
        return new b2DistanceOutput(b2ShapeDistance_internal(cache.getPointer(), input.getPointer(), simplexes.getPointer(), simplexCapacity), true);
    }

    static private native long b2ShapeDistance_internal(long cache, long input, long simplexes, int simplexCapacity);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, int, simplexCapacity, 3, return 0);
    	b2DistanceOutput* _ret = (b2DistanceOutput*)malloc(sizeof(b2DistanceOutput));
    	*_ret = b2ShapeDistance((b2SimplexCache *)cache, (const b2DistanceInput *)input, (b2Simplex *)simplexes, (int)simplexCapacity);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Perform a linear shape cast of shape B moving and shape A fixed. Determines the hit point, normal, and translation fraction.
     */
    public static b2CastOutput b2ShapeCast(b2ShapeCastPairInput.b2ShapeCastPairInputPointer input) {
        return new b2CastOutput(b2ShapeCast_internal(input.getPointer()), true);
    }

    static private native long b2ShapeCast_internal(long input);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2CastOutput* _ret = (b2CastOutput*)malloc(sizeof(b2CastOutput));
    	*_ret = b2ShapeCast((const b2ShapeCastPairInput *)input);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Make a proxy for use in GJK and related functions.
     */
    public static b2ShapeProxy b2MakeProxy(b2Vec2.b2Vec2Pointer vertices, int count, float radius) {
        return new b2ShapeProxy(b2MakeProxy_internal(vertices.getPointer(), count, radius), true);
    }

    static private native long b2MakeProxy_internal(long vertices, int count, float radius);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, int, count, 1, return 0);
    	b2ShapeProxy* _ret = (b2ShapeProxy*)malloc(sizeof(b2ShapeProxy));
    	*_ret = b2MakeProxy((const b2Vec2 *)vertices, (int)count, (float)radius);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Evaluate the transform sweep at a specific time.
     */
    public static b2Transform b2GetSweepTransform(b2Sweep.b2SweepPointer sweep, float time) {
        return new b2Transform(b2GetSweepTransform_internal(sweep.getPointer(), time), true);
    }

    static private native long b2GetSweepTransform_internal(long sweep, float time);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Transform* _ret = (b2Transform*)malloc(sizeof(b2Transform));
    	*_ret = b2GetSweepTransform((const b2Sweep *)sweep, (float)time);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Compute the upper bound on time before two shapes penetrate. Time is represented as
     * a fraction between [0,tMax]. This uses a swept separating axis and may miss some intermediate,
     * non-tunneling collisions. If you change the time interval, you should call this function
     * again.
     */
    public static b2TOIOutput b2TimeOfImpact(b2TOIInput.b2TOIInputPointer input) {
        return new b2TOIOutput(b2TimeOfImpact_internal(input.getPointer()), true);
    }

    static private native long b2TimeOfImpact_internal(long input);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2TOIOutput* _ret = (b2TOIOutput*)malloc(sizeof(b2TOIOutput));
    	*_ret = b2TimeOfImpact((const b2TOIInput *)input);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Compute the contact manifold between two circles
     */
    public static b2Manifold b2CollideCircles(b2Circle.b2CirclePointer circleA, b2Transform xfA, b2Circle.b2CirclePointer circleB, b2Transform xfB) {
        return new b2Manifold(b2CollideCircles_internal(circleA.getPointer(), xfA.getPointer(), circleB.getPointer(), xfB.getPointer()), true);
    }

    static private native long b2CollideCircles_internal(long circleA, long xfA, long circleB, long xfB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Manifold* _ret = (b2Manifold*)malloc(sizeof(b2Manifold));
    	*_ret = b2CollideCircles((const b2Circle *)circleA, *(b2Transform*)xfA, (const b2Circle *)circleB, *(b2Transform*)xfB);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Compute the contact manifold between a capsule and circle
     */
    public static b2Manifold b2CollideCapsuleAndCircle(b2Capsule.b2CapsulePointer capsuleA, b2Transform xfA, b2Circle.b2CirclePointer circleB, b2Transform xfB) {
        return new b2Manifold(b2CollideCapsuleAndCircle_internal(capsuleA.getPointer(), xfA.getPointer(), circleB.getPointer(), xfB.getPointer()), true);
    }

    static private native long b2CollideCapsuleAndCircle_internal(long capsuleA, long xfA, long circleB, long xfB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Manifold* _ret = (b2Manifold*)malloc(sizeof(b2Manifold));
    	*_ret = b2CollideCapsuleAndCircle((const b2Capsule *)capsuleA, *(b2Transform*)xfA, (const b2Circle *)circleB, *(b2Transform*)xfB);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Compute the contact manifold between an segment and a circle
     */
    public static b2Manifold b2CollideSegmentAndCircle(b2Segment.b2SegmentPointer segmentA, b2Transform xfA, b2Circle.b2CirclePointer circleB, b2Transform xfB) {
        return new b2Manifold(b2CollideSegmentAndCircle_internal(segmentA.getPointer(), xfA.getPointer(), circleB.getPointer(), xfB.getPointer()), true);
    }

    static private native long b2CollideSegmentAndCircle_internal(long segmentA, long xfA, long circleB, long xfB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Manifold* _ret = (b2Manifold*)malloc(sizeof(b2Manifold));
    	*_ret = b2CollideSegmentAndCircle((const b2Segment *)segmentA, *(b2Transform*)xfA, (const b2Circle *)circleB, *(b2Transform*)xfB);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Compute the contact manifold between a polygon and a circle
     */
    public static b2Manifold b2CollidePolygonAndCircle(b2Polygon.b2PolygonPointer polygonA, b2Transform xfA, b2Circle.b2CirclePointer circleB, b2Transform xfB) {
        return new b2Manifold(b2CollidePolygonAndCircle_internal(polygonA.getPointer(), xfA.getPointer(), circleB.getPointer(), xfB.getPointer()), true);
    }

    static private native long b2CollidePolygonAndCircle_internal(long polygonA, long xfA, long circleB, long xfB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Manifold* _ret = (b2Manifold*)malloc(sizeof(b2Manifold));
    	*_ret = b2CollidePolygonAndCircle((const b2Polygon *)polygonA, *(b2Transform*)xfA, (const b2Circle *)circleB, *(b2Transform*)xfB);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Compute the contact manifold between a capsule and circle
     */
    public static b2Manifold b2CollideCapsules(b2Capsule.b2CapsulePointer capsuleA, b2Transform xfA, b2Capsule.b2CapsulePointer capsuleB, b2Transform xfB) {
        return new b2Manifold(b2CollideCapsules_internal(capsuleA.getPointer(), xfA.getPointer(), capsuleB.getPointer(), xfB.getPointer()), true);
    }

    static private native long b2CollideCapsules_internal(long capsuleA, long xfA, long capsuleB, long xfB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Manifold* _ret = (b2Manifold*)malloc(sizeof(b2Manifold));
    	*_ret = b2CollideCapsules((const b2Capsule *)capsuleA, *(b2Transform*)xfA, (const b2Capsule *)capsuleB, *(b2Transform*)xfB);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Compute the contact manifold between an segment and a capsule
     */
    public static b2Manifold b2CollideSegmentAndCapsule(b2Segment.b2SegmentPointer segmentA, b2Transform xfA, b2Capsule.b2CapsulePointer capsuleB, b2Transform xfB) {
        return new b2Manifold(b2CollideSegmentAndCapsule_internal(segmentA.getPointer(), xfA.getPointer(), capsuleB.getPointer(), xfB.getPointer()), true);
    }

    static private native long b2CollideSegmentAndCapsule_internal(long segmentA, long xfA, long capsuleB, long xfB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Manifold* _ret = (b2Manifold*)malloc(sizeof(b2Manifold));
    	*_ret = b2CollideSegmentAndCapsule((const b2Segment *)segmentA, *(b2Transform*)xfA, (const b2Capsule *)capsuleB, *(b2Transform*)xfB);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Compute the contact manifold between a polygon and capsule
     */
    public static b2Manifold b2CollidePolygonAndCapsule(b2Polygon.b2PolygonPointer polygonA, b2Transform xfA, b2Capsule.b2CapsulePointer capsuleB, b2Transform xfB) {
        return new b2Manifold(b2CollidePolygonAndCapsule_internal(polygonA.getPointer(), xfA.getPointer(), capsuleB.getPointer(), xfB.getPointer()), true);
    }

    static private native long b2CollidePolygonAndCapsule_internal(long polygonA, long xfA, long capsuleB, long xfB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Manifold* _ret = (b2Manifold*)malloc(sizeof(b2Manifold));
    	*_ret = b2CollidePolygonAndCapsule((const b2Polygon *)polygonA, *(b2Transform*)xfA, (const b2Capsule *)capsuleB, *(b2Transform*)xfB);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Compute the contact manifold between two polygons
     */
    public static b2Manifold b2CollidePolygons(b2Polygon.b2PolygonPointer polygonA, b2Transform xfA, b2Polygon.b2PolygonPointer polygonB, b2Transform xfB) {
        return new b2Manifold(b2CollidePolygons_internal(polygonA.getPointer(), xfA.getPointer(), polygonB.getPointer(), xfB.getPointer()), true);
    }

    static private native long b2CollidePolygons_internal(long polygonA, long xfA, long polygonB, long xfB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Manifold* _ret = (b2Manifold*)malloc(sizeof(b2Manifold));
    	*_ret = b2CollidePolygons((const b2Polygon *)polygonA, *(b2Transform*)xfA, (const b2Polygon *)polygonB, *(b2Transform*)xfB);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Compute the contact manifold between an segment and a polygon
     */
    public static b2Manifold b2CollideSegmentAndPolygon(b2Segment.b2SegmentPointer segmentA, b2Transform xfA, b2Polygon.b2PolygonPointer polygonB, b2Transform xfB) {
        return new b2Manifold(b2CollideSegmentAndPolygon_internal(segmentA.getPointer(), xfA.getPointer(), polygonB.getPointer(), xfB.getPointer()), true);
    }

    static private native long b2CollideSegmentAndPolygon_internal(long segmentA, long xfA, long polygonB, long xfB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Manifold* _ret = (b2Manifold*)malloc(sizeof(b2Manifold));
    	*_ret = b2CollideSegmentAndPolygon((const b2Segment *)segmentA, *(b2Transform*)xfA, (const b2Polygon *)polygonB, *(b2Transform*)xfB);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Compute the contact manifold between a chain segment and a circle
     */
    public static b2Manifold b2CollideChainSegmentAndCircle(b2ChainSegment.b2ChainSegmentPointer segmentA, b2Transform xfA, b2Circle.b2CirclePointer circleB, b2Transform xfB) {
        return new b2Manifold(b2CollideChainSegmentAndCircle_internal(segmentA.getPointer(), xfA.getPointer(), circleB.getPointer(), xfB.getPointer()), true);
    }

    static private native long b2CollideChainSegmentAndCircle_internal(long segmentA, long xfA, long circleB, long xfB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Manifold* _ret = (b2Manifold*)malloc(sizeof(b2Manifold));
    	*_ret = b2CollideChainSegmentAndCircle((const b2ChainSegment *)segmentA, *(b2Transform*)xfA, (const b2Circle *)circleB, *(b2Transform*)xfB);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Compute the contact manifold between a chain segment and a capsule
     */
    public static b2Manifold b2CollideChainSegmentAndCapsule(b2ChainSegment.b2ChainSegmentPointer segmentA, b2Transform xfA, b2Capsule.b2CapsulePointer capsuleB, b2Transform xfB, b2SimplexCache.b2SimplexCachePointer cache) {
        return new b2Manifold(b2CollideChainSegmentAndCapsule_internal(segmentA.getPointer(), xfA.getPointer(), capsuleB.getPointer(), xfB.getPointer(), cache.getPointer()), true);
    }

    static private native long b2CollideChainSegmentAndCapsule_internal(long segmentA, long xfA, long capsuleB, long xfB, long cache);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Manifold* _ret = (b2Manifold*)malloc(sizeof(b2Manifold));
    	*_ret = b2CollideChainSegmentAndCapsule((const b2ChainSegment *)segmentA, *(b2Transform*)xfA, (const b2Capsule *)capsuleB, *(b2Transform*)xfB, (b2SimplexCache *)cache);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Compute the contact manifold between a chain segment and a rounded polygon
     */
    public static b2Manifold b2CollideChainSegmentAndPolygon(b2ChainSegment.b2ChainSegmentPointer segmentA, b2Transform xfA, b2Polygon.b2PolygonPointer polygonB, b2Transform xfB, b2SimplexCache.b2SimplexCachePointer cache) {
        return new b2Manifold(b2CollideChainSegmentAndPolygon_internal(segmentA.getPointer(), xfA.getPointer(), polygonB.getPointer(), xfB.getPointer(), cache.getPointer()), true);
    }

    static private native long b2CollideChainSegmentAndPolygon_internal(long segmentA, long xfA, long polygonB, long xfB, long cache);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Manifold* _ret = (b2Manifold*)malloc(sizeof(b2Manifold));
    	*_ret = b2CollideChainSegmentAndPolygon((const b2ChainSegment *)segmentA, *(b2Transform*)xfA, (const b2Polygon *)polygonB, *(b2Transform*)xfB, (b2SimplexCache *)cache);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Constructing the tree initializes the node pool.
     */
    public static b2DynamicTree b2DynamicTree_Create() {
        return new b2DynamicTree(b2DynamicTree_Create_internal(), true);
    }

    static private native long b2DynamicTree_Create_internal();/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2DynamicTree* _ret = (b2DynamicTree*)malloc(sizeof(b2DynamicTree));
    	*_ret = b2DynamicTree_Create();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Destroy the tree, freeing the node pool.
     */
    public static void b2DynamicTree_Destroy(b2DynamicTree.b2DynamicTreePointer tree) {
        b2DynamicTree_Destroy_internal(tree.getPointer());
    }

    static private native void b2DynamicTree_Destroy_internal(long tree);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2DynamicTree_Destroy((b2DynamicTree *)tree);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Create a proxy. Provide an AABB and a userData value.
     */
    public static int b2DynamicTree_CreateProxy(b2DynamicTree.b2DynamicTreePointer tree, b2AABB aabb, long categoryBits, int userData) {
        return b2DynamicTree_CreateProxy_internal(tree.getPointer(), aabb.getPointer(), categoryBits, userData);
    }

    static private native int b2DynamicTree_CreateProxy_internal(long tree, long aabb, long categoryBits, int userData);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, int, userData, 3, return 0);
    	CHECK_AND_THROW_C_TYPE(env, uint64_t, categoryBits, 2, return 0);
    	return (jint)b2DynamicTree_CreateProxy((b2DynamicTree *)tree, *(b2AABB*)aabb, (uint64_t)categoryBits, (int)userData);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Destroy a proxy. This asserts if the id is invalid.
     */
    public static void b2DynamicTree_DestroyProxy(b2DynamicTree.b2DynamicTreePointer tree, int proxyId) {
        b2DynamicTree_DestroyProxy_internal(tree.getPointer(), proxyId);
    }

    static private native void b2DynamicTree_DestroyProxy_internal(long tree, int proxyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, int, proxyId, 1, return);
    	b2DynamicTree_DestroyProxy((b2DynamicTree *)tree, (int)proxyId);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Move a proxy to a new AABB by removing and reinserting into the tree.
     */
    public static void b2DynamicTree_MoveProxy(b2DynamicTree.b2DynamicTreePointer tree, int proxyId, b2AABB aabb) {
        b2DynamicTree_MoveProxy_internal(tree.getPointer(), proxyId, aabb.getPointer());
    }

    static private native void b2DynamicTree_MoveProxy_internal(long tree, int proxyId, long aabb);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, int, proxyId, 1, return);
    	b2DynamicTree_MoveProxy((b2DynamicTree *)tree, (int)proxyId, *(b2AABB*)aabb);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Enlarge a proxy and enlarge ancestors as necessary.
     */
    public static void b2DynamicTree_EnlargeProxy(b2DynamicTree.b2DynamicTreePointer tree, int proxyId, b2AABB aabb) {
        b2DynamicTree_EnlargeProxy_internal(tree.getPointer(), proxyId, aabb.getPointer());
    }

    static private native void b2DynamicTree_EnlargeProxy_internal(long tree, int proxyId, long aabb);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, int, proxyId, 1, return);
    	b2DynamicTree_EnlargeProxy((b2DynamicTree *)tree, (int)proxyId, *(b2AABB*)aabb);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     *  Query an AABB for overlapping proxies. The callback class is called for each proxy that overlaps the supplied AABB.
     * 	@return performance data
     */
    public static b2TreeStats b2DynamicTree_Query(b2DynamicTree.b2DynamicTreePointer tree, b2AABB aabb, long maskBits, ClosureObject<b2TreeQueryCallbackFcn> callback, VoidPointer context) {
        return new b2TreeStats(b2DynamicTree_Query_internal(tree.getPointer(), aabb.getPointer(), maskBits, callback.getPointer(), context.getPointer()), true);
    }

    static private native long b2DynamicTree_Query_internal(long tree, long aabb, long maskBits, long callback, long context);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, uint64_t, maskBits, 2, return 0);
    	b2TreeStats* _ret = (b2TreeStats*)malloc(sizeof(b2TreeStats));
    	*_ret = b2DynamicTree_Query((const b2DynamicTree *)tree, *(b2AABB*)aabb, (uint64_t)maskBits, (b2TreeQueryCallbackFcn *)callback, (void *)context);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     *  Ray cast against the proxies in the tree. This relies on the callback
     *  to perform a exact ray cast in the case were the proxy contains a shape.
     *  The callback also performs the any collision filtering. This has performance
     *  roughly equal to k * log(n), where k is the number of collisions and n is the
     *  number of proxies in the tree.
     *  Bit-wise filtering using mask bits can greatly improve performance in some scenarios.
     * 	However, this filtering may be approximate, so the user should still apply filtering to results.
     *  @param tree the dynamic tree to ray cast
     *  @param input the ray cast input data. The ray extends from p1 to p1 + maxFraction * (p2 - p1)
     *  @param maskBits mask bit hint: `bool accept = (maskBits & node->categoryBits) != 0;`
     *  @param callback a callback class that is called for each proxy that is hit by the ray
     *  @param context user context that is passed to the callback
     * 	@return performance data
     */
    public static b2TreeStats b2DynamicTree_RayCast(b2DynamicTree.b2DynamicTreePointer tree, b2RayCastInput.b2RayCastInputPointer input, long maskBits, ClosureObject<b2TreeRayCastCallbackFcn> callback, VoidPointer context) {
        return new b2TreeStats(b2DynamicTree_RayCast_internal(tree.getPointer(), input.getPointer(), maskBits, callback.getPointer(), context.getPointer()), true);
    }

    static private native long b2DynamicTree_RayCast_internal(long tree, long input, long maskBits, long callback, long context);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, uint64_t, maskBits, 2, return 0);
    	b2TreeStats* _ret = (b2TreeStats*)malloc(sizeof(b2TreeStats));
    	*_ret = b2DynamicTree_RayCast((const b2DynamicTree *)tree, (const b2RayCastInput *)input, (uint64_t)maskBits, (b2TreeRayCastCallbackFcn *)callback, (void *)context);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     *  Ray cast against the proxies in the tree. This relies on the callback
     *  to perform a exact ray cast in the case were the proxy contains a shape.
     *  The callback also performs the any collision filtering. This has performance
     *  roughly equal to k * log(n), where k is the number of collisions and n is the
     *  number of proxies in the tree.
     *  @param tree the dynamic tree to ray cast
     *  @param input the ray cast input data. The ray extends from p1 to p1 + maxFraction * (p2 - p1).
     *  @param maskBits filter bits: `bool accept = (maskBits & node->categoryBits) != 0;`
     *  @param callback a callback class that is called for each proxy that is hit by the shape
     *  @param context user context that is passed to the callback
     * 	@return performance data
     */
    public static b2TreeStats b2DynamicTree_ShapeCast(b2DynamicTree.b2DynamicTreePointer tree, b2ShapeCastInput.b2ShapeCastInputPointer input, long maskBits, ClosureObject<b2TreeShapeCastCallbackFcn> callback, VoidPointer context) {
        return new b2TreeStats(b2DynamicTree_ShapeCast_internal(tree.getPointer(), input.getPointer(), maskBits, callback.getPointer(), context.getPointer()), true);
    }

    static private native long b2DynamicTree_ShapeCast_internal(long tree, long input, long maskBits, long callback, long context);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, uint64_t, maskBits, 2, return 0);
    	b2TreeStats* _ret = (b2TreeStats*)malloc(sizeof(b2TreeStats));
    	*_ret = b2DynamicTree_ShapeCast((const b2DynamicTree *)tree, (const b2ShapeCastInput *)input, (uint64_t)maskBits, (b2TreeShapeCastCallbackFcn *)callback, (void *)context);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the height of the binary tree.
     */
    public static int b2DynamicTree_GetHeight(b2DynamicTree.b2DynamicTreePointer tree) {
        return b2DynamicTree_GetHeight_internal(tree.getPointer());
    }

    static private native int b2DynamicTree_GetHeight_internal(long tree);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)b2DynamicTree_GetHeight((const b2DynamicTree *)tree);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the ratio of the sum of the node areas to the root area.
     */
    public static float b2DynamicTree_GetAreaRatio(b2DynamicTree.b2DynamicTreePointer tree) {
        return b2DynamicTree_GetAreaRatio_internal(tree.getPointer());
    }

    static private native float b2DynamicTree_GetAreaRatio_internal(long tree);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2DynamicTree_GetAreaRatio((const b2DynamicTree *)tree);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the number of proxies created
     */
    public static int b2DynamicTree_GetProxyCount(b2DynamicTree.b2DynamicTreePointer tree) {
        return b2DynamicTree_GetProxyCount_internal(tree.getPointer());
    }

    static private native int b2DynamicTree_GetProxyCount_internal(long tree);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)b2DynamicTree_GetProxyCount((const b2DynamicTree *)tree);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Rebuild the tree while retaining subtrees that haven't changed. Returns the number of boxes sorted.
     */
    public static int b2DynamicTree_Rebuild(b2DynamicTree.b2DynamicTreePointer tree, boolean fullBuild) {
        return b2DynamicTree_Rebuild_internal(tree.getPointer(), fullBuild);
    }

    static private native int b2DynamicTree_Rebuild_internal(long tree, boolean fullBuild);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, fullBuild, 1, return 0);
    	return (jint)b2DynamicTree_Rebuild((b2DynamicTree *)tree, (bool)fullBuild);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the number of bytes used by this tree
     */
    public static int b2DynamicTree_GetByteCount(b2DynamicTree.b2DynamicTreePointer tree) {
        return b2DynamicTree_GetByteCount_internal(tree.getPointer());
    }

    static private native int b2DynamicTree_GetByteCount_internal(long tree);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)b2DynamicTree_GetByteCount((const b2DynamicTree *)tree);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get proxy user data
     */
    public static int b2DynamicTree_GetUserData(b2DynamicTree.b2DynamicTreePointer tree, int proxyId) {
        return b2DynamicTree_GetUserData_internal(tree.getPointer(), proxyId);
    }

    static private native int b2DynamicTree_GetUserData_internal(long tree, int proxyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, int, proxyId, 1, return 0);
    	return (jint)b2DynamicTree_GetUserData((const b2DynamicTree *)tree, (int)proxyId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the AABB of a proxy
     */
    public static b2AABB b2DynamicTree_GetAABB(b2DynamicTree.b2DynamicTreePointer tree, int proxyId) {
        return new b2AABB(b2DynamicTree_GetAABB_internal(tree.getPointer(), proxyId), true);
    }

    static private native long b2DynamicTree_GetAABB_internal(long tree, int proxyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, int, proxyId, 1, return 0);
    	b2AABB* _ret = (b2AABB*)malloc(sizeof(b2AABB));
    	*_ret = b2DynamicTree_GetAABB((const b2DynamicTree *)tree, (int)proxyId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Validate this tree. For testing.
     */
    public static void b2DynamicTree_Validate(b2DynamicTree.b2DynamicTreePointer tree) {
        b2DynamicTree_Validate_internal(tree.getPointer());
    }

    static private native void b2DynamicTree_Validate_internal(long tree);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2DynamicTree_Validate((const b2DynamicTree *)tree);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Validate this tree has no enlarged AABBs. For testing.
     */
    public static void b2DynamicTree_ValidateNoEnlarged(b2DynamicTree.b2DynamicTreePointer tree) {
        b2DynamicTree_ValidateNoEnlarged_internal(tree.getPointer());
    }

    static private native void b2DynamicTree_ValidateNoEnlarged_internal(long tree);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2DynamicTree_ValidateNoEnlarged((const b2DynamicTree *)tree);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Store a body id into a uint64_t.
     */
    public static long b2StoreBodyId(b2BodyId id) {
        return b2StoreBodyId_internal(id.getPointer());
    }

    static private native long b2StoreBodyId_internal(long id);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)b2StoreBodyId(*(b2BodyId*)id);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Load a uint64_t into a body id.
     */
    public static b2BodyId b2LoadBodyId(long x) {
        return new b2BodyId(b2LoadBodyId_internal(x), true);
    }

    static private native long b2LoadBodyId_internal(long x);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, uint64_t, x, 0, return 0);
    	b2BodyId* _ret = (b2BodyId*)malloc(sizeof(b2BodyId));
    	*_ret = b2LoadBodyId((uint64_t)x);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Store a shape id into a uint64_t.
     */
    public static long b2StoreShapeId(b2ShapeId id) {
        return b2StoreShapeId_internal(id.getPointer());
    }

    static private native long b2StoreShapeId_internal(long id);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)b2StoreShapeId(*(b2ShapeId*)id);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Load a uint64_t into a shape id.
     */
    public static b2ShapeId b2LoadShapeId(long x) {
        return new b2ShapeId(b2LoadShapeId_internal(x), true);
    }

    static private native long b2LoadShapeId_internal(long x);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, uint64_t, x, 0, return 0);
    	b2ShapeId* _ret = (b2ShapeId*)malloc(sizeof(b2ShapeId));
    	*_ret = b2LoadShapeId((uint64_t)x);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Store a chain id into a uint64_t.
     */
    public static long b2StoreChainId(b2ChainId id) {
        return b2StoreChainId_internal(id.getPointer());
    }

    static private native long b2StoreChainId_internal(long id);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)b2StoreChainId(*(b2ChainId*)id);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Load a uint64_t into a chain id.
     */
    public static b2ChainId b2LoadChainId(long x) {
        return new b2ChainId(b2LoadChainId_internal(x), true);
    }

    static private native long b2LoadChainId_internal(long x);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, uint64_t, x, 0, return 0);
    	b2ChainId* _ret = (b2ChainId*)malloc(sizeof(b2ChainId));
    	*_ret = b2LoadChainId((uint64_t)x);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Store a joint id into a uint64_t.
     */
    public static long b2StoreJointId(b2JointId id) {
        return b2StoreJointId_internal(id.getPointer());
    }

    static private native long b2StoreJointId_internal(long id);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)b2StoreJointId(*(b2JointId*)id);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Load a uint64_t into a joint id.
     */
    public static b2JointId b2LoadJointId(long x) {
        return new b2JointId(b2LoadJointId_internal(x), true);
    }

    static private native long b2LoadJointId_internal(long x);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, uint64_t, x, 0, return 0);
    	b2JointId* _ret = (b2JointId*)malloc(sizeof(b2JointId));
    	*_ret = b2LoadJointId((uint64_t)x);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Use this to initialize your world definition
     * @ingroup world
     */
    public static b2WorldDef b2DefaultWorldDef() {
        return new b2WorldDef(b2DefaultWorldDef_internal(), true);
    }

    static private native long b2DefaultWorldDef_internal();/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2WorldDef* _ret = (b2WorldDef*)malloc(sizeof(b2WorldDef));
    	*_ret = b2DefaultWorldDef();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Use this to initialize your body definition
     * @ingroup body
     */
    public static b2BodyDef b2DefaultBodyDef() {
        return new b2BodyDef(b2DefaultBodyDef_internal(), true);
    }

    static private native long b2DefaultBodyDef_internal();/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2BodyDef* _ret = (b2BodyDef*)malloc(sizeof(b2BodyDef));
    	*_ret = b2DefaultBodyDef();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Use this to initialize your filter
     * @ingroup shape
     */
    public static b2Filter b2DefaultFilter() {
        return new b2Filter(b2DefaultFilter_internal(), true);
    }

    static private native long b2DefaultFilter_internal();/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Filter* _ret = (b2Filter*)malloc(sizeof(b2Filter));
    	*_ret = b2DefaultFilter();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Use this to initialize your query filter
     * @ingroup shape
     */
    public static b2QueryFilter b2DefaultQueryFilter() {
        return new b2QueryFilter(b2DefaultQueryFilter_internal(), true);
    }

    static private native long b2DefaultQueryFilter_internal();/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2QueryFilter* _ret = (b2QueryFilter*)malloc(sizeof(b2QueryFilter));
    	*_ret = b2DefaultQueryFilter();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Use this to initialize your shape definition
     * @ingroup shape
     */
    public static b2ShapeDef b2DefaultShapeDef() {
        return new b2ShapeDef(b2DefaultShapeDef_internal(), true);
    }

    static private native long b2DefaultShapeDef_internal();/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2ShapeDef* _ret = (b2ShapeDef*)malloc(sizeof(b2ShapeDef));
    	*_ret = b2DefaultShapeDef();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Use this to initialize your chain definition
     * @ingroup shape
     */
    public static b2ChainDef b2DefaultChainDef() {
        return new b2ChainDef(b2DefaultChainDef_internal(), true);
    }

    static private native long b2DefaultChainDef_internal();/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2ChainDef* _ret = (b2ChainDef*)malloc(sizeof(b2ChainDef));
    	*_ret = b2DefaultChainDef();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Use this to initialize your joint definition
     * @ingroup distance_joint
     */
    public static b2DistanceJointDef b2DefaultDistanceJointDef() {
        return new b2DistanceJointDef(b2DefaultDistanceJointDef_internal(), true);
    }

    static private native long b2DefaultDistanceJointDef_internal();/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2DistanceJointDef* _ret = (b2DistanceJointDef*)malloc(sizeof(b2DistanceJointDef));
    	*_ret = b2DefaultDistanceJointDef();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Use this to initialize your joint definition
     * @ingroup motor_joint
     */
    public static b2MotorJointDef b2DefaultMotorJointDef() {
        return new b2MotorJointDef(b2DefaultMotorJointDef_internal(), true);
    }

    static private native long b2DefaultMotorJointDef_internal();/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2MotorJointDef* _ret = (b2MotorJointDef*)malloc(sizeof(b2MotorJointDef));
    	*_ret = b2DefaultMotorJointDef();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Use this to initialize your joint definition
     * @ingroup mouse_joint
     */
    public static b2MouseJointDef b2DefaultMouseJointDef() {
        return new b2MouseJointDef(b2DefaultMouseJointDef_internal(), true);
    }

    static private native long b2DefaultMouseJointDef_internal();/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2MouseJointDef* _ret = (b2MouseJointDef*)malloc(sizeof(b2MouseJointDef));
    	*_ret = b2DefaultMouseJointDef();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Use this to initialize your joint definition
     * @ingroup null_joint
     */
    public static b2NullJointDef b2DefaultNullJointDef() {
        return new b2NullJointDef(b2DefaultNullJointDef_internal(), true);
    }

    static private native long b2DefaultNullJointDef_internal();/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2NullJointDef* _ret = (b2NullJointDef*)malloc(sizeof(b2NullJointDef));
    	*_ret = b2DefaultNullJointDef();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Use this to initialize your joint definition
     * @ingroupd prismatic_joint
     */
    public static b2PrismaticJointDef b2DefaultPrismaticJointDef() {
        return new b2PrismaticJointDef(b2DefaultPrismaticJointDef_internal(), true);
    }

    static private native long b2DefaultPrismaticJointDef_internal();/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2PrismaticJointDef* _ret = (b2PrismaticJointDef*)malloc(sizeof(b2PrismaticJointDef));
    	*_ret = b2DefaultPrismaticJointDef();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Use this to initialize your joint definition.
     * @ingroup revolute_joint
     */
    public static b2RevoluteJointDef b2DefaultRevoluteJointDef() {
        return new b2RevoluteJointDef(b2DefaultRevoluteJointDef_internal(), true);
    }

    static private native long b2DefaultRevoluteJointDef_internal();/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2RevoluteJointDef* _ret = (b2RevoluteJointDef*)malloc(sizeof(b2RevoluteJointDef));
    	*_ret = b2DefaultRevoluteJointDef();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Use this to initialize your joint definition
     * @ingroup weld_joint
     */
    public static b2WeldJointDef b2DefaultWeldJointDef() {
        return new b2WeldJointDef(b2DefaultWeldJointDef_internal(), true);
    }

    static private native long b2DefaultWeldJointDef_internal();/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2WeldJointDef* _ret = (b2WeldJointDef*)malloc(sizeof(b2WeldJointDef));
    	*_ret = b2DefaultWeldJointDef();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Use this to initialize your joint definition
     * @ingroup wheel_joint
     */
    public static b2WheelJointDef b2DefaultWheelJointDef() {
        return new b2WheelJointDef(b2DefaultWheelJointDef_internal(), true);
    }

    static private native long b2DefaultWheelJointDef_internal();/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2WheelJointDef* _ret = (b2WheelJointDef*)malloc(sizeof(b2WheelJointDef));
    	*_ret = b2DefaultWheelJointDef();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Use this to initialize your explosion definition
     * @ingroup world
     */
    public static b2ExplosionDef b2DefaultExplosionDef() {
        return new b2ExplosionDef(b2DefaultExplosionDef_internal(), true);
    }

    static private native long b2DefaultExplosionDef_internal();/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2ExplosionDef* _ret = (b2ExplosionDef*)malloc(sizeof(b2ExplosionDef));
    	*_ret = b2DefaultExplosionDef();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Use this to initialize your drawing interface. This allows you to implement a sub-set
     * of the drawing functions.
     */
    public static b2DebugDraw b2DefaultDebugDraw() {
        return new b2DebugDraw(b2DefaultDebugDraw_internal(), true);
    }

    static private native long b2DefaultDebugDraw_internal();/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2DebugDraw* _ret = (b2DebugDraw*)malloc(sizeof(b2DebugDraw));
    	*_ret = b2DefaultDebugDraw();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Create a world for rigid body simulation. A world contains bodies, shapes, and constraints. You make create
     * up to 128 worlds. Each world is completely independent and may be simulated in parallel.
     * @return the world id.
     */
    public static b2WorldId b2CreateWorld(b2WorldDef.b2WorldDefPointer def) {
        return new b2WorldId(b2CreateWorld_internal(def.getPointer()), true);
    }

    static private native long b2CreateWorld_internal(long def);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2WorldId* _ret = (b2WorldId*)malloc(sizeof(b2WorldId));
    	*_ret = b2CreateWorld((const b2WorldDef *)def);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Destroy a world
     */
    public static void b2DestroyWorld(b2WorldId worldId) {
        b2DestroyWorld_internal(worldId.getPointer());
    }

    static private native void b2DestroyWorld_internal(long worldId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2DestroyWorld(*(b2WorldId*)worldId);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * World id validation. Provides validation for up to 64K allocations.
     */
    public static boolean b2World_IsValid(b2WorldId id) {
        return b2World_IsValid_internal(id.getPointer());
    }

    static private native boolean b2World_IsValid_internal(long id);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2World_IsValid(*(b2WorldId*)id);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Simulate a world for one time step. This performs collision detection, integration, and constraint solution.
     * @param worldId The world to simulate
     * @param timeStep The amount of time to simulate, this should be a fixed number. Usually 1/60.
     * @param subStepCount The number of sub-steps, increasing the sub-step count can increase accuracy. Usually 4.
     */
    public static void b2World_Step(b2WorldId worldId, float timeStep, int subStepCount) {
        b2World_Step_internal(worldId.getPointer(), timeStep, subStepCount);
    }

    static private native void b2World_Step_internal(long worldId, float timeStep, int subStepCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, int, subStepCount, 2, return);
    	b2World_Step(*(b2WorldId*)worldId, (float)timeStep, (int)subStepCount);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Call this to draw shapes and other debug draw data
     */
    public static void b2World_Draw(b2WorldId worldId, b2DebugDraw.b2DebugDrawPointer draw) {
        b2World_Draw_internal(worldId.getPointer(), draw.getPointer());
    }

    static private native void b2World_Draw_internal(long worldId, long draw);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2World_Draw(*(b2WorldId*)worldId, (b2DebugDraw *)draw);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the body events for the current time step. The event data is transient. Do not store a reference to this data.
     */
    public static b2BodyEvents b2World_GetBodyEvents(b2WorldId worldId) {
        return new b2BodyEvents(b2World_GetBodyEvents_internal(worldId.getPointer()), true);
    }

    static private native long b2World_GetBodyEvents_internal(long worldId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2BodyEvents* _ret = (b2BodyEvents*)malloc(sizeof(b2BodyEvents));
    	*_ret = b2World_GetBodyEvents(*(b2WorldId*)worldId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get sensor events for the current time step. The event data is transient. Do not store a reference to this data.
     */
    public static b2SensorEvents b2World_GetSensorEvents(b2WorldId worldId) {
        return new b2SensorEvents(b2World_GetSensorEvents_internal(worldId.getPointer()), true);
    }

    static private native long b2World_GetSensorEvents_internal(long worldId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2SensorEvents* _ret = (b2SensorEvents*)malloc(sizeof(b2SensorEvents));
    	*_ret = b2World_GetSensorEvents(*(b2WorldId*)worldId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get contact events for this current time step. The event data is transient. Do not store a reference to this data.
     */
    public static b2ContactEvents b2World_GetContactEvents(b2WorldId worldId) {
        return new b2ContactEvents(b2World_GetContactEvents_internal(worldId.getPointer()), true);
    }

    static private native long b2World_GetContactEvents_internal(long worldId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2ContactEvents* _ret = (b2ContactEvents*)malloc(sizeof(b2ContactEvents));
    	*_ret = b2World_GetContactEvents(*(b2WorldId*)worldId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Overlap test for all shapes that *potentially* overlap the provided AABB
     */
    public static b2TreeStats b2World_OverlapAABB(b2WorldId worldId, b2AABB aabb, b2QueryFilter filter, ClosureObject<b2OverlapResultFcn> fcn, VoidPointer context) {
        return new b2TreeStats(b2World_OverlapAABB_internal(worldId.getPointer(), aabb.getPointer(), filter.getPointer(), fcn.getPointer(), context.getPointer()), true);
    }

    static private native long b2World_OverlapAABB_internal(long worldId, long aabb, long filter, long fcn, long context);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2TreeStats* _ret = (b2TreeStats*)malloc(sizeof(b2TreeStats));
    	*_ret = b2World_OverlapAABB(*(b2WorldId*)worldId, *(b2AABB*)aabb, *(b2QueryFilter*)filter, (b2OverlapResultFcn *)fcn, (void *)context);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Overlap test for for all shapes that overlap the provided point.
     */
    public static b2TreeStats b2World_OverlapPoint(b2WorldId worldId, b2Vec2 point, b2Transform transform, b2QueryFilter filter, ClosureObject<b2OverlapResultFcn> fcn, VoidPointer context) {
        return new b2TreeStats(b2World_OverlapPoint_internal(worldId.getPointer(), point.getPointer(), transform.getPointer(), filter.getPointer(), fcn.getPointer(), context.getPointer()), true);
    }

    static private native long b2World_OverlapPoint_internal(long worldId, long point, long transform, long filter, long fcn, long context);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2TreeStats* _ret = (b2TreeStats*)malloc(sizeof(b2TreeStats));
    	*_ret = b2World_OverlapPoint(*(b2WorldId*)worldId, *(b2Vec2*)point, *(b2Transform*)transform, *(b2QueryFilter*)filter, (b2OverlapResultFcn *)fcn, (void *)context);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Overlap test for for all shapes that overlap the provided circle. A zero radius may be used for a point query.
     */
    public static b2TreeStats b2World_OverlapCircle(b2WorldId worldId, b2Circle.b2CirclePointer circle, b2Transform transform, b2QueryFilter filter, ClosureObject<b2OverlapResultFcn> fcn, VoidPointer context) {
        return new b2TreeStats(b2World_OverlapCircle_internal(worldId.getPointer(), circle.getPointer(), transform.getPointer(), filter.getPointer(), fcn.getPointer(), context.getPointer()), true);
    }

    static private native long b2World_OverlapCircle_internal(long worldId, long circle, long transform, long filter, long fcn, long context);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2TreeStats* _ret = (b2TreeStats*)malloc(sizeof(b2TreeStats));
    	*_ret = b2World_OverlapCircle(*(b2WorldId*)worldId, (const b2Circle *)circle, *(b2Transform*)transform, *(b2QueryFilter*)filter, (b2OverlapResultFcn *)fcn, (void *)context);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Overlap test for all shapes that overlap the provided capsule
     */
    public static b2TreeStats b2World_OverlapCapsule(b2WorldId worldId, b2Capsule.b2CapsulePointer capsule, b2Transform transform, b2QueryFilter filter, ClosureObject<b2OverlapResultFcn> fcn, VoidPointer context) {
        return new b2TreeStats(b2World_OverlapCapsule_internal(worldId.getPointer(), capsule.getPointer(), transform.getPointer(), filter.getPointer(), fcn.getPointer(), context.getPointer()), true);
    }

    static private native long b2World_OverlapCapsule_internal(long worldId, long capsule, long transform, long filter, long fcn, long context);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2TreeStats* _ret = (b2TreeStats*)malloc(sizeof(b2TreeStats));
    	*_ret = b2World_OverlapCapsule(*(b2WorldId*)worldId, (const b2Capsule *)capsule, *(b2Transform*)transform, *(b2QueryFilter*)filter, (b2OverlapResultFcn *)fcn, (void *)context);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Overlap test for all shapes that overlap the provided polygon
     */
    public static b2TreeStats b2World_OverlapPolygon(b2WorldId worldId, b2Polygon.b2PolygonPointer polygon, b2Transform transform, b2QueryFilter filter, ClosureObject<b2OverlapResultFcn> fcn, VoidPointer context) {
        return new b2TreeStats(b2World_OverlapPolygon_internal(worldId.getPointer(), polygon.getPointer(), transform.getPointer(), filter.getPointer(), fcn.getPointer(), context.getPointer()), true);
    }

    static private native long b2World_OverlapPolygon_internal(long worldId, long polygon, long transform, long filter, long fcn, long context);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2TreeStats* _ret = (b2TreeStats*)malloc(sizeof(b2TreeStats));
    	*_ret = b2World_OverlapPolygon(*(b2WorldId*)worldId, (const b2Polygon *)polygon, *(b2Transform*)transform, *(b2QueryFilter*)filter, (b2OverlapResultFcn *)fcn, (void *)context);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     *  Cast a ray into the world to collect shapes in the path of the ray.
     *  Your callback function controls whether you get the closest point, any point, or n-points.
     *  The ray-cast ignores shapes that contain the starting point.
     *  @note The callback function may receive shapes in any order
     *  @param worldId The world to cast the ray against
     *  @param origin The start point of the ray
     *  @param translation The translation of the ray from the start point to the end point
     *  @param filter Contains bit flags to filter unwanted shapes from the results
     *  @param fcn A user implemented callback function
     *  @param context A user context that is passed along to the callback function
     * 	@return traversal performance counters
     */
    public static b2TreeStats b2World_CastRay(b2WorldId worldId, b2Vec2 origin, b2Vec2 translation, b2QueryFilter filter, ClosureObject<b2CastResultFcn> fcn, VoidPointer context) {
        return new b2TreeStats(b2World_CastRay_internal(worldId.getPointer(), origin.getPointer(), translation.getPointer(), filter.getPointer(), fcn.getPointer(), context.getPointer()), true);
    }

    static private native long b2World_CastRay_internal(long worldId, long origin, long translation, long filter, long fcn, long context);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2TreeStats* _ret = (b2TreeStats*)malloc(sizeof(b2TreeStats));
    	*_ret = b2World_CastRay(*(b2WorldId*)worldId, *(b2Vec2*)origin, *(b2Vec2*)translation, *(b2QueryFilter*)filter, (b2CastResultFcn *)fcn, (void *)context);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Cast a ray into the world to collect the closest hit. This is a convenience function.
     * This is less general than b2World_CastRay() and does not allow for custom filtering.
     */
    public static b2RayResult b2World_CastRayClosest(b2WorldId worldId, b2Vec2 origin, b2Vec2 translation, b2QueryFilter filter) {
        return new b2RayResult(b2World_CastRayClosest_internal(worldId.getPointer(), origin.getPointer(), translation.getPointer(), filter.getPointer()), true);
    }

    static private native long b2World_CastRayClosest_internal(long worldId, long origin, long translation, long filter);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2RayResult* _ret = (b2RayResult*)malloc(sizeof(b2RayResult));
    	*_ret = b2World_CastRayClosest(*(b2WorldId*)worldId, *(b2Vec2*)origin, *(b2Vec2*)translation, *(b2QueryFilter*)filter);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     *  Cast a circle through the world. Similar to a cast ray except that a circle is cast instead of a point.
     * 	@see Box2d#b2World_CastRay
     */
    public static b2TreeStats b2World_CastCircle(b2WorldId worldId, b2Circle.b2CirclePointer circle, b2Transform originTransform, b2Vec2 translation, b2QueryFilter filter, ClosureObject<b2CastResultFcn> fcn, VoidPointer context) {
        return new b2TreeStats(b2World_CastCircle_internal(worldId.getPointer(), circle.getPointer(), originTransform.getPointer(), translation.getPointer(), filter.getPointer(), fcn.getPointer(), context.getPointer()), true);
    }

    static private native long b2World_CastCircle_internal(long worldId, long circle, long originTransform, long translation, long filter, long fcn, long context);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2TreeStats* _ret = (b2TreeStats*)malloc(sizeof(b2TreeStats));
    	*_ret = b2World_CastCircle(*(b2WorldId*)worldId, (const b2Circle *)circle, *(b2Transform*)originTransform, *(b2Vec2*)translation, *(b2QueryFilter*)filter, (b2CastResultFcn *)fcn, (void *)context);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     *  Cast a capsule through the world. Similar to a cast ray except that a capsule is cast instead of a point.
     * 	@see Box2d#b2World_CastRay
     */
    public static b2TreeStats b2World_CastCapsule(b2WorldId worldId, b2Capsule.b2CapsulePointer capsule, b2Transform originTransform, b2Vec2 translation, b2QueryFilter filter, ClosureObject<b2CastResultFcn> fcn, VoidPointer context) {
        return new b2TreeStats(b2World_CastCapsule_internal(worldId.getPointer(), capsule.getPointer(), originTransform.getPointer(), translation.getPointer(), filter.getPointer(), fcn.getPointer(), context.getPointer()), true);
    }

    static private native long b2World_CastCapsule_internal(long worldId, long capsule, long originTransform, long translation, long filter, long fcn, long context);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2TreeStats* _ret = (b2TreeStats*)malloc(sizeof(b2TreeStats));
    	*_ret = b2World_CastCapsule(*(b2WorldId*)worldId, (const b2Capsule *)capsule, *(b2Transform*)originTransform, *(b2Vec2*)translation, *(b2QueryFilter*)filter, (b2CastResultFcn *)fcn, (void *)context);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     *  Cast a polygon through the world. Similar to a cast ray except that a polygon is cast instead of a point.
     * 	@see Box2d#b2World_CastRay
     */
    public static b2TreeStats b2World_CastPolygon(b2WorldId worldId, b2Polygon.b2PolygonPointer polygon, b2Transform originTransform, b2Vec2 translation, b2QueryFilter filter, ClosureObject<b2CastResultFcn> fcn, VoidPointer context) {
        return new b2TreeStats(b2World_CastPolygon_internal(worldId.getPointer(), polygon.getPointer(), originTransform.getPointer(), translation.getPointer(), filter.getPointer(), fcn.getPointer(), context.getPointer()), true);
    }

    static private native long b2World_CastPolygon_internal(long worldId, long polygon, long originTransform, long translation, long filter, long fcn, long context);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2TreeStats* _ret = (b2TreeStats*)malloc(sizeof(b2TreeStats));
    	*_ret = b2World_CastPolygon(*(b2WorldId*)worldId, (const b2Polygon *)polygon, *(b2Transform*)originTransform, *(b2Vec2*)translation, *(b2QueryFilter*)filter, (b2CastResultFcn *)fcn, (void *)context);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Enable/disable sleep. If your application does not need sleeping, you can gain some performance
     * by disabling sleep completely at the world level.
     * @see b2WorldDef
     */
    public static void b2World_EnableSleeping(b2WorldId worldId, boolean flag) {
        b2World_EnableSleeping_internal(worldId.getPointer(), flag);
    }

    static private native void b2World_EnableSleeping_internal(long worldId, boolean flag);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, flag, 1, return);
    	b2World_EnableSleeping(*(b2WorldId*)worldId, (bool)flag);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Is body sleeping enabled?
     */
    public static boolean b2World_IsSleepingEnabled(b2WorldId worldId) {
        return b2World_IsSleepingEnabled_internal(worldId.getPointer());
    }

    static private native boolean b2World_IsSleepingEnabled_internal(long worldId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2World_IsSleepingEnabled(*(b2WorldId*)worldId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Enable/disable continuous collision between dynamic and static bodies. Generally you should keep continuous
     * collision enabled to prevent fast moving objects from going through static objects. The performance gain from
     * disabling continuous collision is minor.
     * @see b2WorldDef
     */
    public static void b2World_EnableContinuous(b2WorldId worldId, boolean flag) {
        b2World_EnableContinuous_internal(worldId.getPointer(), flag);
    }

    static private native void b2World_EnableContinuous_internal(long worldId, boolean flag);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, flag, 1, return);
    	b2World_EnableContinuous(*(b2WorldId*)worldId, (bool)flag);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Is continuous collision enabled?
     */
    public static boolean b2World_IsContinuousEnabled(b2WorldId worldId) {
        return b2World_IsContinuousEnabled_internal(worldId.getPointer());
    }

    static private native boolean b2World_IsContinuousEnabled_internal(long worldId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2World_IsContinuousEnabled(*(b2WorldId*)worldId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Adjust the restitution threshold. It is recommended not to make this value very small
     * because it will prevent bodies from sleeping. Usually in meters per second.
     * @see b2WorldDef
     */
    public static void b2World_SetRestitutionThreshold(b2WorldId worldId, float value) {
        b2World_SetRestitutionThreshold_internal(worldId.getPointer(), value);
    }

    static private native void b2World_SetRestitutionThreshold_internal(long worldId, float value);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2World_SetRestitutionThreshold(*(b2WorldId*)worldId, (float)value);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the the restitution speed threshold. Usually in meters per second.
     */
    public static float b2World_GetRestitutionThreshold(b2WorldId worldId) {
        return b2World_GetRestitutionThreshold_internal(worldId.getPointer());
    }

    static private native float b2World_GetRestitutionThreshold_internal(long worldId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2World_GetRestitutionThreshold(*(b2WorldId*)worldId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Adjust the hit event threshold. This controls the collision speed needed to generate a b2ContactHitEvent.
     * Usually in meters per second.
     * @see b2WorldDef::hitEventThreshold
     */
    public static void b2World_SetHitEventThreshold(b2WorldId worldId, float value) {
        b2World_SetHitEventThreshold_internal(worldId.getPointer(), value);
    }

    static private native void b2World_SetHitEventThreshold_internal(long worldId, float value);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2World_SetHitEventThreshold(*(b2WorldId*)worldId, (float)value);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the the hit event speed threshold. Usually in meters per second.
     */
    public static float b2World_GetHitEventThreshold(b2WorldId worldId) {
        return b2World_GetHitEventThreshold_internal(worldId.getPointer());
    }

    static private native float b2World_GetHitEventThreshold_internal(long worldId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2World_GetHitEventThreshold(*(b2WorldId*)worldId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Register the custom filter callback. This is optional.
     */
    public static void b2World_SetCustomFilterCallback(b2WorldId worldId, ClosureObject<b2CustomFilterFcn> fcn, VoidPointer context) {
        b2World_SetCustomFilterCallback_internal(worldId.getPointer(), fcn.getPointer(), context.getPointer());
    }

    static private native void b2World_SetCustomFilterCallback_internal(long worldId, long fcn, long context);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2World_SetCustomFilterCallback(*(b2WorldId*)worldId, (b2CustomFilterFcn *)fcn, (void *)context);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Register the pre-solve callback. This is optional.
     */
    public static void b2World_SetPreSolveCallback(b2WorldId worldId, ClosureObject<b2PreSolveFcn> fcn, VoidPointer context) {
        b2World_SetPreSolveCallback_internal(worldId.getPointer(), fcn.getPointer(), context.getPointer());
    }

    static private native void b2World_SetPreSolveCallback_internal(long worldId, long fcn, long context);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2World_SetPreSolveCallback(*(b2WorldId*)worldId, (b2PreSolveFcn *)fcn, (void *)context);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Set the gravity vector for the entire world. Box2D has no concept of an up direction and this
     * is left as a decision for the application. Usually in m/s^2.
     * @see b2WorldDef
     */
    public static void b2World_SetGravity(b2WorldId worldId, b2Vec2 gravity) {
        b2World_SetGravity_internal(worldId.getPointer(), gravity.getPointer());
    }

    static private native void b2World_SetGravity_internal(long worldId, long gravity);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2World_SetGravity(*(b2WorldId*)worldId, *(b2Vec2*)gravity);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the gravity vector
     */
    public static b2Vec2 b2World_GetGravity(b2WorldId worldId) {
        return new b2Vec2(b2World_GetGravity_internal(worldId.getPointer()), true);
    }

    static private native long b2World_GetGravity_internal(long worldId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2World_GetGravity(*(b2WorldId*)worldId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Apply a radial explosion
     * @param worldId The world id
     * @param explosionDef The explosion definition
     */
    public static void b2World_Explode(b2WorldId worldId, b2ExplosionDef.b2ExplosionDefPointer explosionDef) {
        b2World_Explode_internal(worldId.getPointer(), explosionDef.getPointer());
    }

    static private native void b2World_Explode_internal(long worldId, long explosionDef);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2World_Explode(*(b2WorldId*)worldId, (const b2ExplosionDef *)explosionDef);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Adjust contact tuning parameters
     * @param worldId The world id
     * @param hertz The contact stiffness (cycles per second)
     * @param dampingRatio The contact bounciness with 1 being critical damping (non-dimensional)
     * @param pushSpeed The maximum contact constraint push out speed (meters per second)
     * @note Advanced feature
     */
    public static void b2World_SetContactTuning(b2WorldId worldId, float hertz, float dampingRatio, float pushSpeed) {
        b2World_SetContactTuning_internal(worldId.getPointer(), hertz, dampingRatio, pushSpeed);
    }

    static private native void b2World_SetContactTuning_internal(long worldId, float hertz, float dampingRatio, float pushSpeed);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2World_SetContactTuning(*(b2WorldId*)worldId, (float)hertz, (float)dampingRatio, (float)pushSpeed);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Adjust joint tuning parameters
     * @param worldId The world id
     * @param hertz The contact stiffness (cycles per second)
     * @param dampingRatio The contact bounciness with 1 being critical damping (non-dimensional)
     * @note Advanced feature
     */
    public static void b2World_SetJointTuning(b2WorldId worldId, float hertz, float dampingRatio) {
        b2World_SetJointTuning_internal(worldId.getPointer(), hertz, dampingRatio);
    }

    static private native void b2World_SetJointTuning_internal(long worldId, float hertz, float dampingRatio);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2World_SetJointTuning(*(b2WorldId*)worldId, (float)hertz, (float)dampingRatio);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Set the maximum linear speed. Usually in m/s.
     */
    public static void b2World_SetMaximumLinearSpeed(b2WorldId worldId, float maximumLinearSpeed) {
        b2World_SetMaximumLinearSpeed_internal(worldId.getPointer(), maximumLinearSpeed);
    }

    static private native void b2World_SetMaximumLinearSpeed_internal(long worldId, float maximumLinearSpeed);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2World_SetMaximumLinearSpeed(*(b2WorldId*)worldId, (float)maximumLinearSpeed);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the maximum linear speed. Usually in m/s.
     */
    public static float b2World_GetMaximumLinearSpeed(b2WorldId worldId) {
        return b2World_GetMaximumLinearSpeed_internal(worldId.getPointer());
    }

    static private native float b2World_GetMaximumLinearSpeed_internal(long worldId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2World_GetMaximumLinearSpeed(*(b2WorldId*)worldId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Enable/disable constraint warm starting. Advanced feature for testing. Disabling
     * sleeping greatly reduces stability and provides no performance gain.
     */
    public static void b2World_EnableWarmStarting(b2WorldId worldId, boolean flag) {
        b2World_EnableWarmStarting_internal(worldId.getPointer(), flag);
    }

    static private native void b2World_EnableWarmStarting_internal(long worldId, boolean flag);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, flag, 1, return);
    	b2World_EnableWarmStarting(*(b2WorldId*)worldId, (bool)flag);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Is constraint warm starting enabled?
     */
    public static boolean b2World_IsWarmStartingEnabled(b2WorldId worldId) {
        return b2World_IsWarmStartingEnabled_internal(worldId.getPointer());
    }

    static private native boolean b2World_IsWarmStartingEnabled_internal(long worldId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2World_IsWarmStartingEnabled(*(b2WorldId*)worldId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the number of awake bodies.
     */
    public static int b2World_GetAwakeBodyCount(b2WorldId worldId) {
        return b2World_GetAwakeBodyCount_internal(worldId.getPointer());
    }

    static private native int b2World_GetAwakeBodyCount_internal(long worldId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)b2World_GetAwakeBodyCount(*(b2WorldId*)worldId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the current world performance profile
     */
    public static b2Profile b2World_GetProfile(b2WorldId worldId) {
        return new b2Profile(b2World_GetProfile_internal(worldId.getPointer()), true);
    }

    static private native long b2World_GetProfile_internal(long worldId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Profile* _ret = (b2Profile*)malloc(sizeof(b2Profile));
    	*_ret = b2World_GetProfile(*(b2WorldId*)worldId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get world counters and sizes
     */
    public static b2Counters b2World_GetCounters(b2WorldId worldId) {
        return new b2Counters(b2World_GetCounters_internal(worldId.getPointer()), true);
    }

    static private native long b2World_GetCounters_internal(long worldId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Counters* _ret = (b2Counters*)malloc(sizeof(b2Counters));
    	*_ret = b2World_GetCounters(*(b2WorldId*)worldId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the user data pointer.
     */
    public static void b2World_SetUserData(b2WorldId worldId, VoidPointer userData) {
        b2World_SetUserData_internal(worldId.getPointer(), userData.getPointer());
    }

    static private native void b2World_SetUserData_internal(long worldId, long userData);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2World_SetUserData(*(b2WorldId*)worldId, (void *)userData);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the user data pointer.
     */
    public static VoidPointer b2World_GetUserData(b2WorldId worldId) {
        return new VoidPointer(b2World_GetUserData_internal(worldId.getPointer()), false);
    }

    static private native long b2World_GetUserData_internal(long worldId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)b2World_GetUserData(*(b2WorldId*)worldId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Dump memory stats to box2d_memory.txt
     */
    public static void b2World_DumpMemoryStats(b2WorldId worldId) {
        b2World_DumpMemoryStats_internal(worldId.getPointer());
    }

    static private native void b2World_DumpMemoryStats_internal(long worldId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2World_DumpMemoryStats(*(b2WorldId*)worldId);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * This is for internal testing
     */
    public static void b2World_RebuildStaticTree(b2WorldId worldId) {
        b2World_RebuildStaticTree_internal(worldId.getPointer());
    }

    static private native void b2World_RebuildStaticTree_internal(long worldId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2World_RebuildStaticTree(*(b2WorldId*)worldId);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * This is for internal testing
     */
    public static void b2World_EnableSpeculative(b2WorldId worldId, boolean flag) {
        b2World_EnableSpeculative_internal(worldId.getPointer(), flag);
    }

    static private native void b2World_EnableSpeculative_internal(long worldId, boolean flag);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, flag, 1, return);
    	b2World_EnableSpeculative(*(b2WorldId*)worldId, (bool)flag);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Create a rigid body given a definition. No reference to the definition is retained. So you can create the definition
     * on the stack and pass it as a pointer.
     * @code{.c}
     * b2BodyDef bodyDef = b2DefaultBodyDef();
     * b2BodyId myBodyId = b2CreateBody(myWorldId, &bodyDef);
     * @endcode
     * @warning This function is locked during callbacks.
     */
    public static b2BodyId b2CreateBody(b2WorldId worldId, b2BodyDef.b2BodyDefPointer def) {
        return new b2BodyId(b2CreateBody_internal(worldId.getPointer(), def.getPointer()), true);
    }

    static private native long b2CreateBody_internal(long worldId, long def);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2BodyId* _ret = (b2BodyId*)malloc(sizeof(b2BodyId));
    	*_ret = b2CreateBody(*(b2WorldId*)worldId, (const b2BodyDef *)def);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Destroy a rigid body given an id. This destroys all shapes and joints attached to the body.
     * Do not keep references to the associated shapes and joints.
     */
    public static void b2DestroyBody(b2BodyId bodyId) {
        b2DestroyBody_internal(bodyId.getPointer());
    }

    static private native void b2DestroyBody_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2DestroyBody(*(b2BodyId*)bodyId);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Body identifier validation. Can be used to detect orphaned ids. Provides validation for up to 64K allocations.
     */
    public static boolean b2Body_IsValid(b2BodyId id) {
        return b2Body_IsValid_internal(id.getPointer());
    }

    static private native boolean b2Body_IsValid_internal(long id);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2Body_IsValid(*(b2BodyId*)id);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the body type: static, kinematic, or dynamic
     */
    public static b2BodyType b2Body_GetType(b2BodyId bodyId) {
        return b2BodyType.getByIndex((int) b2Body_GetType_internal(bodyId.getPointer()));
    }

    static private native int b2Body_GetType_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)b2Body_GetType(*(b2BodyId*)bodyId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Change the body type. This is an expensive operation. This automatically updates the mass
     * properties regardless of the automatic mass setting.
     */
    public static void b2Body_SetType(b2BodyId bodyId, b2BodyType type) {
        b2Body_SetType_internal(bodyId.getPointer(), type.getIndex());
    }

    static private native void b2Body_SetType_internal(long bodyId, int type);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Body_SetType(*(b2BodyId*)bodyId, (b2BodyType)type);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Set the body name. Up to 31 characters excluding 0 termination.
     */
    public static void b2Body_SetName(b2BodyId bodyId, CSizedIntPointer name) {
        name.assertHasCTypeBacking("const char");
        b2Body_SetName_internal(bodyId.getPointer(), name.getPointer());
    }

    static private native void b2Body_SetName_internal(long bodyId, long name);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Body_SetName(*(b2BodyId*)bodyId, (const char *)name);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the body name. May be null.
     */
    public static CSizedIntPointer b2Body_GetName(b2BodyId bodyId) {
        return new CSizedIntPointer(b2Body_GetName_internal(bodyId.getPointer()), false, "const char");
    }

    static private native long b2Body_GetName_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)b2Body_GetName(*(b2BodyId*)bodyId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the user data for a body
     */
    public static void b2Body_SetUserData(b2BodyId bodyId, VoidPointer userData) {
        b2Body_SetUserData_internal(bodyId.getPointer(), userData.getPointer());
    }

    static private native void b2Body_SetUserData_internal(long bodyId, long userData);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Body_SetUserData(*(b2BodyId*)bodyId, (void *)userData);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the user data stored in a body
     */
    public static VoidPointer b2Body_GetUserData(b2BodyId bodyId) {
        return new VoidPointer(b2Body_GetUserData_internal(bodyId.getPointer()), false);
    }

    static private native long b2Body_GetUserData_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)b2Body_GetUserData(*(b2BodyId*)bodyId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the world position of a body. This is the location of the body origin.
     */
    public static b2Vec2 b2Body_GetPosition(b2BodyId bodyId) {
        return new b2Vec2(b2Body_GetPosition_internal(bodyId.getPointer()), true);
    }

    static private native long b2Body_GetPosition_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Body_GetPosition(*(b2BodyId*)bodyId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the world rotation of a body as a cosine/sine pair (complex number)
     */
    public static b2Rot b2Body_GetRotation(b2BodyId bodyId) {
        return new b2Rot(b2Body_GetRotation_internal(bodyId.getPointer()), true);
    }

    static private native long b2Body_GetRotation_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Rot* _ret = (b2Rot*)malloc(sizeof(b2Rot));
    	*_ret = b2Body_GetRotation(*(b2BodyId*)bodyId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the world transform of a body.
     */
    public static b2Transform b2Body_GetTransform(b2BodyId bodyId) {
        return new b2Transform(b2Body_GetTransform_internal(bodyId.getPointer()), true);
    }

    static private native long b2Body_GetTransform_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Transform* _ret = (b2Transform*)malloc(sizeof(b2Transform));
    	*_ret = b2Body_GetTransform(*(b2BodyId*)bodyId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the world transform of a body. This acts as a teleport and is fairly expensive.
     * @note Generally you should create a body with then intended transform.
     * @see b2BodyDef::position and b2BodyDef::angle
     */
    public static void b2Body_SetTransform(b2BodyId bodyId, b2Vec2 position, b2Rot rotation) {
        b2Body_SetTransform_internal(bodyId.getPointer(), position.getPointer(), rotation.getPointer());
    }

    static private native void b2Body_SetTransform_internal(long bodyId, long position, long rotation);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Body_SetTransform(*(b2BodyId*)bodyId, *(b2Vec2*)position, *(b2Rot*)rotation);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get a local point on a body given a world point
     */
    public static b2Vec2 b2Body_GetLocalPoint(b2BodyId bodyId, b2Vec2 worldPoint) {
        return new b2Vec2(b2Body_GetLocalPoint_internal(bodyId.getPointer(), worldPoint.getPointer()), true);
    }

    static private native long b2Body_GetLocalPoint_internal(long bodyId, long worldPoint);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Body_GetLocalPoint(*(b2BodyId*)bodyId, *(b2Vec2*)worldPoint);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get a world point on a body given a local point
     */
    public static b2Vec2 b2Body_GetWorldPoint(b2BodyId bodyId, b2Vec2 localPoint) {
        return new b2Vec2(b2Body_GetWorldPoint_internal(bodyId.getPointer(), localPoint.getPointer()), true);
    }

    static private native long b2Body_GetWorldPoint_internal(long bodyId, long localPoint);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Body_GetWorldPoint(*(b2BodyId*)bodyId, *(b2Vec2*)localPoint);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get a local vector on a body given a world vector
     */
    public static b2Vec2 b2Body_GetLocalVector(b2BodyId bodyId, b2Vec2 worldVector) {
        return new b2Vec2(b2Body_GetLocalVector_internal(bodyId.getPointer(), worldVector.getPointer()), true);
    }

    static private native long b2Body_GetLocalVector_internal(long bodyId, long worldVector);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Body_GetLocalVector(*(b2BodyId*)bodyId, *(b2Vec2*)worldVector);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get a world vector on a body given a local vector
     */
    public static b2Vec2 b2Body_GetWorldVector(b2BodyId bodyId, b2Vec2 localVector) {
        return new b2Vec2(b2Body_GetWorldVector_internal(bodyId.getPointer(), localVector.getPointer()), true);
    }

    static private native long b2Body_GetWorldVector_internal(long bodyId, long localVector);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Body_GetWorldVector(*(b2BodyId*)bodyId, *(b2Vec2*)localVector);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the linear velocity of a body's center of mass. Usually in meters per second.
     */
    public static b2Vec2 b2Body_GetLinearVelocity(b2BodyId bodyId) {
        return new b2Vec2(b2Body_GetLinearVelocity_internal(bodyId.getPointer()), true);
    }

    static private native long b2Body_GetLinearVelocity_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Body_GetLinearVelocity(*(b2BodyId*)bodyId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the angular velocity of a body in radians per second
     */
    public static float b2Body_GetAngularVelocity(b2BodyId bodyId) {
        return b2Body_GetAngularVelocity_internal(bodyId.getPointer());
    }

    static private native float b2Body_GetAngularVelocity_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2Body_GetAngularVelocity(*(b2BodyId*)bodyId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the linear velocity of a body. Usually in meters per second.
     */
    public static void b2Body_SetLinearVelocity(b2BodyId bodyId, b2Vec2 linearVelocity) {
        b2Body_SetLinearVelocity_internal(bodyId.getPointer(), linearVelocity.getPointer());
    }

    static private native void b2Body_SetLinearVelocity_internal(long bodyId, long linearVelocity);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Body_SetLinearVelocity(*(b2BodyId*)bodyId, *(b2Vec2*)linearVelocity);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Set the angular velocity of a body in radians per second
     */
    public static void b2Body_SetAngularVelocity(b2BodyId bodyId, float angularVelocity) {
        b2Body_SetAngularVelocity_internal(bodyId.getPointer(), angularVelocity);
    }

    static private native void b2Body_SetAngularVelocity_internal(long bodyId, float angularVelocity);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Body_SetAngularVelocity(*(b2BodyId*)bodyId, (float)angularVelocity);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the linear velocity of a local point attached to a body. Usually in meters per second.
     */
    public static b2Vec2 b2Body_GetLocalPointVelocity(b2BodyId bodyId, b2Vec2 localPoint) {
        return new b2Vec2(b2Body_GetLocalPointVelocity_internal(bodyId.getPointer(), localPoint.getPointer()), true);
    }

    static private native long b2Body_GetLocalPointVelocity_internal(long bodyId, long localPoint);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Body_GetLocalPointVelocity(*(b2BodyId*)bodyId, *(b2Vec2*)localPoint);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the linear velocity of a world point attached to a body. Usually in meters per second.
     */
    public static b2Vec2 b2Body_GetWorldPointVelocity(b2BodyId bodyId, b2Vec2 worldPoint) {
        return new b2Vec2(b2Body_GetWorldPointVelocity_internal(bodyId.getPointer(), worldPoint.getPointer()), true);
    }

    static private native long b2Body_GetWorldPointVelocity_internal(long bodyId, long worldPoint);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Body_GetWorldPointVelocity(*(b2BodyId*)bodyId, *(b2Vec2*)worldPoint);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Apply a force at a world point. If the force is not applied at the center of mass,
     * it will generate a torque and affect the angular velocity. This optionally wakes up the body.
     * The force is ignored if the body is not awake.
     * @param bodyId The body id
     * @param force The world force vector, usually in newtons (N)
     * @param point The world position of the point of application
     * @param wake Option to wake up the body
     */
    public static void b2Body_ApplyForce(b2BodyId bodyId, b2Vec2 force, b2Vec2 point, boolean wake) {
        b2Body_ApplyForce_internal(bodyId.getPointer(), force.getPointer(), point.getPointer(), wake);
    }

    static private native void b2Body_ApplyForce_internal(long bodyId, long force, long point, boolean wake);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, wake, 3, return);
    	b2Body_ApplyForce(*(b2BodyId*)bodyId, *(b2Vec2*)force, *(b2Vec2*)point, (bool)wake);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Apply a force to the center of mass. This optionally wakes up the body.
     * The force is ignored if the body is not awake.
     * @param bodyId The body id
     * @param force the world force vector, usually in newtons (N).
     * @param wake also wake up the body
     */
    public static void b2Body_ApplyForceToCenter(b2BodyId bodyId, b2Vec2 force, boolean wake) {
        b2Body_ApplyForceToCenter_internal(bodyId.getPointer(), force.getPointer(), wake);
    }

    static private native void b2Body_ApplyForceToCenter_internal(long bodyId, long force, boolean wake);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, wake, 2, return);
    	b2Body_ApplyForceToCenter(*(b2BodyId*)bodyId, *(b2Vec2*)force, (bool)wake);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Apply a torque. This affects the angular velocity without affecting the linear velocity.
     * This optionally wakes the body. The torque is ignored if the body is not awake.
     * @param bodyId The body id
     * @param torque about the z-axis (out of the screen), usually in N*m.
     * @param wake also wake up the body
     */
    public static void b2Body_ApplyTorque(b2BodyId bodyId, float torque, boolean wake) {
        b2Body_ApplyTorque_internal(bodyId.getPointer(), torque, wake);
    }

    static private native void b2Body_ApplyTorque_internal(long bodyId, float torque, boolean wake);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, wake, 2, return);
    	b2Body_ApplyTorque(*(b2BodyId*)bodyId, (float)torque, (bool)wake);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Apply an impulse at a point. This immediately modifies the velocity.
     * It also modifies the angular velocity if the point of application
     * is not at the center of mass. This optionally wakes the body.
     * The impulse is ignored if the body is not awake.
     * @param bodyId The body id
     * @param impulse the world impulse vector, usually in N*s or kg*m/s.
     * @param point the world position of the point of application.
     * @param wake also wake up the body
     * @warning This should be used for one-shot impulses. If you need a steady force,
     * use a force instead, which will work better with the sub-stepping solver.
     */
    public static void b2Body_ApplyLinearImpulse(b2BodyId bodyId, b2Vec2 impulse, b2Vec2 point, boolean wake) {
        b2Body_ApplyLinearImpulse_internal(bodyId.getPointer(), impulse.getPointer(), point.getPointer(), wake);
    }

    static private native void b2Body_ApplyLinearImpulse_internal(long bodyId, long impulse, long point, boolean wake);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, wake, 3, return);
    	b2Body_ApplyLinearImpulse(*(b2BodyId*)bodyId, *(b2Vec2*)impulse, *(b2Vec2*)point, (bool)wake);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Apply an impulse to the center of mass. This immediately modifies the velocity.
     * The impulse is ignored if the body is not awake. This optionally wakes the body.
     * @param bodyId The body id
     * @param impulse the world impulse vector, usually in N*s or kg*m/s.
     * @param wake also wake up the body
     * @warning This should be used for one-shot impulses. If you need a steady force,
     * use a force instead, which will work better with the sub-stepping solver.
     */
    public static void b2Body_ApplyLinearImpulseToCenter(b2BodyId bodyId, b2Vec2 impulse, boolean wake) {
        b2Body_ApplyLinearImpulseToCenter_internal(bodyId.getPointer(), impulse.getPointer(), wake);
    }

    static private native void b2Body_ApplyLinearImpulseToCenter_internal(long bodyId, long impulse, boolean wake);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, wake, 2, return);
    	b2Body_ApplyLinearImpulseToCenter(*(b2BodyId*)bodyId, *(b2Vec2*)impulse, (bool)wake);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Apply an angular impulse. The impulse is ignored if the body is not awake.
     * This optionally wakes the body.
     * @param bodyId The body id
     * @param impulse the angular impulse, usually in units of kg*m*m/s
     * @param wake also wake up the body
     * @warning This should be used for one-shot impulses. If you need a steady force,
     * use a force instead, which will work better with the sub-stepping solver.
     */
    public static void b2Body_ApplyAngularImpulse(b2BodyId bodyId, float impulse, boolean wake) {
        b2Body_ApplyAngularImpulse_internal(bodyId.getPointer(), impulse, wake);
    }

    static private native void b2Body_ApplyAngularImpulse_internal(long bodyId, float impulse, boolean wake);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, wake, 2, return);
    	b2Body_ApplyAngularImpulse(*(b2BodyId*)bodyId, (float)impulse, (bool)wake);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the mass of the body, usually in kilograms
     */
    public static float b2Body_GetMass(b2BodyId bodyId) {
        return b2Body_GetMass_internal(bodyId.getPointer());
    }

    static private native float b2Body_GetMass_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2Body_GetMass(*(b2BodyId*)bodyId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the rotational inertia of the body, usually in kg*m^2
     */
    public static float b2Body_GetRotationalInertia(b2BodyId bodyId) {
        return b2Body_GetRotationalInertia_internal(bodyId.getPointer());
    }

    static private native float b2Body_GetRotationalInertia_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2Body_GetRotationalInertia(*(b2BodyId*)bodyId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the center of mass position of the body in local space
     */
    public static b2Vec2 b2Body_GetLocalCenterOfMass(b2BodyId bodyId) {
        return new b2Vec2(b2Body_GetLocalCenterOfMass_internal(bodyId.getPointer()), true);
    }

    static private native long b2Body_GetLocalCenterOfMass_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Body_GetLocalCenterOfMass(*(b2BodyId*)bodyId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the center of mass position of the body in world space
     */
    public static b2Vec2 b2Body_GetWorldCenterOfMass(b2BodyId bodyId) {
        return new b2Vec2(b2Body_GetWorldCenterOfMass_internal(bodyId.getPointer()), true);
    }

    static private native long b2Body_GetWorldCenterOfMass_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Body_GetWorldCenterOfMass(*(b2BodyId*)bodyId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Override the body's mass properties. Normally this is computed automatically using the
     * shape geometry and density. This information is lost if a shape is added or removed or if the
     * body type changes.
     */
    public static void b2Body_SetMassData(b2BodyId bodyId, b2MassData massData) {
        b2Body_SetMassData_internal(bodyId.getPointer(), massData.getPointer());
    }

    static private native void b2Body_SetMassData_internal(long bodyId, long massData);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Body_SetMassData(*(b2BodyId*)bodyId, *(b2MassData*)massData);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the mass data for a body
     */
    public static b2MassData b2Body_GetMassData(b2BodyId bodyId) {
        return new b2MassData(b2Body_GetMassData_internal(bodyId.getPointer()), true);
    }

    static private native long b2Body_GetMassData_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2MassData* _ret = (b2MassData*)malloc(sizeof(b2MassData));
    	*_ret = b2Body_GetMassData(*(b2BodyId*)bodyId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * This update the mass properties to the sum of the mass properties of the shapes.
     * This normally does not need to be called unless you called SetMassData to override
     * the mass and you later want to reset the mass.
     * You may also use this when automatic mass computation has been disabled.
     * You should call this regardless of body type.
     */
    public static void b2Body_ApplyMassFromShapes(b2BodyId bodyId) {
        b2Body_ApplyMassFromShapes_internal(bodyId.getPointer());
    }

    static private native void b2Body_ApplyMassFromShapes_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Body_ApplyMassFromShapes(*(b2BodyId*)bodyId);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Adjust the linear damping. Normally this is set in b2BodyDef before creation.
     */
    public static void b2Body_SetLinearDamping(b2BodyId bodyId, float linearDamping) {
        b2Body_SetLinearDamping_internal(bodyId.getPointer(), linearDamping);
    }

    static private native void b2Body_SetLinearDamping_internal(long bodyId, float linearDamping);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Body_SetLinearDamping(*(b2BodyId*)bodyId, (float)linearDamping);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the current linear damping.
     */
    public static float b2Body_GetLinearDamping(b2BodyId bodyId) {
        return b2Body_GetLinearDamping_internal(bodyId.getPointer());
    }

    static private native float b2Body_GetLinearDamping_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2Body_GetLinearDamping(*(b2BodyId*)bodyId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Adjust the angular damping. Normally this is set in b2BodyDef before creation.
     */
    public static void b2Body_SetAngularDamping(b2BodyId bodyId, float angularDamping) {
        b2Body_SetAngularDamping_internal(bodyId.getPointer(), angularDamping);
    }

    static private native void b2Body_SetAngularDamping_internal(long bodyId, float angularDamping);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Body_SetAngularDamping(*(b2BodyId*)bodyId, (float)angularDamping);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the current angular damping.
     */
    public static float b2Body_GetAngularDamping(b2BodyId bodyId) {
        return b2Body_GetAngularDamping_internal(bodyId.getPointer());
    }

    static private native float b2Body_GetAngularDamping_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2Body_GetAngularDamping(*(b2BodyId*)bodyId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Adjust the gravity scale. Normally this is set in b2BodyDef before creation.
     * @see b2BodyDef::gravityScale
     */
    public static void b2Body_SetGravityScale(b2BodyId bodyId, float gravityScale) {
        b2Body_SetGravityScale_internal(bodyId.getPointer(), gravityScale);
    }

    static private native void b2Body_SetGravityScale_internal(long bodyId, float gravityScale);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Body_SetGravityScale(*(b2BodyId*)bodyId, (float)gravityScale);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the current gravity scale
     */
    public static float b2Body_GetGravityScale(b2BodyId bodyId) {
        return b2Body_GetGravityScale_internal(bodyId.getPointer());
    }

    static private native float b2Body_GetGravityScale_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2Body_GetGravityScale(*(b2BodyId*)bodyId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * @return true if this body is awake
     */
    public static boolean b2Body_IsAwake(b2BodyId bodyId) {
        return b2Body_IsAwake_internal(bodyId.getPointer());
    }

    static private native boolean b2Body_IsAwake_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2Body_IsAwake(*(b2BodyId*)bodyId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Wake a body from sleep. This wakes the entire island the body is touching.
     * @warning Putting a body to sleep will put the entire island of bodies touching this body to sleep,
     * which can be expensive and possibly unintuitive.
     */
    public static void b2Body_SetAwake(b2BodyId bodyId, boolean awake) {
        b2Body_SetAwake_internal(bodyId.getPointer(), awake);
    }

    static private native void b2Body_SetAwake_internal(long bodyId, boolean awake);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, awake, 1, return);
    	b2Body_SetAwake(*(b2BodyId*)bodyId, (bool)awake);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Enable or disable sleeping for this body. If sleeping is disabled the body will wake.
     */
    public static void b2Body_EnableSleep(b2BodyId bodyId, boolean enableSleep) {
        b2Body_EnableSleep_internal(bodyId.getPointer(), enableSleep);
    }

    static private native void b2Body_EnableSleep_internal(long bodyId, boolean enableSleep);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, enableSleep, 1, return);
    	b2Body_EnableSleep(*(b2BodyId*)bodyId, (bool)enableSleep);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Returns true if sleeping is enabled for this body
     */
    public static boolean b2Body_IsSleepEnabled(b2BodyId bodyId) {
        return b2Body_IsSleepEnabled_internal(bodyId.getPointer());
    }

    static private native boolean b2Body_IsSleepEnabled_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2Body_IsSleepEnabled(*(b2BodyId*)bodyId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the sleep threshold, usually in meters per second
     */
    public static void b2Body_SetSleepThreshold(b2BodyId bodyId, float sleepThreshold) {
        b2Body_SetSleepThreshold_internal(bodyId.getPointer(), sleepThreshold);
    }

    static private native void b2Body_SetSleepThreshold_internal(long bodyId, float sleepThreshold);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Body_SetSleepThreshold(*(b2BodyId*)bodyId, (float)sleepThreshold);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the sleep threshold, usually in meters per second.
     */
    public static float b2Body_GetSleepThreshold(b2BodyId bodyId) {
        return b2Body_GetSleepThreshold_internal(bodyId.getPointer());
    }

    static private native float b2Body_GetSleepThreshold_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2Body_GetSleepThreshold(*(b2BodyId*)bodyId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Returns true if this body is enabled
     */
    public static boolean b2Body_IsEnabled(b2BodyId bodyId) {
        return b2Body_IsEnabled_internal(bodyId.getPointer());
    }

    static private native boolean b2Body_IsEnabled_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2Body_IsEnabled(*(b2BodyId*)bodyId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Disable a body by removing it completely from the simulation. This is expensive.
     */
    public static void b2Body_Disable(b2BodyId bodyId) {
        b2Body_Disable_internal(bodyId.getPointer());
    }

    static private native void b2Body_Disable_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Body_Disable(*(b2BodyId*)bodyId);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Enable a body by adding it to the simulation. This is expensive.
     */
    public static void b2Body_Enable(b2BodyId bodyId) {
        b2Body_Enable_internal(bodyId.getPointer());
    }

    static private native void b2Body_Enable_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Body_Enable(*(b2BodyId*)bodyId);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Set this body to have fixed rotation. This causes the mass to be reset in all cases.
     */
    public static void b2Body_SetFixedRotation(b2BodyId bodyId, boolean flag) {
        b2Body_SetFixedRotation_internal(bodyId.getPointer(), flag);
    }

    static private native void b2Body_SetFixedRotation_internal(long bodyId, boolean flag);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, flag, 1, return);
    	b2Body_SetFixedRotation(*(b2BodyId*)bodyId, (bool)flag);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Does this body have fixed rotation?
     */
    public static boolean b2Body_IsFixedRotation(b2BodyId bodyId) {
        return b2Body_IsFixedRotation_internal(bodyId.getPointer());
    }

    static private native boolean b2Body_IsFixedRotation_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2Body_IsFixedRotation(*(b2BodyId*)bodyId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set this body to be a bullet. A bullet does continuous collision detection
     * against dynamic bodies (but not other bullets).
     */
    public static void b2Body_SetBullet(b2BodyId bodyId, boolean flag) {
        b2Body_SetBullet_internal(bodyId.getPointer(), flag);
    }

    static private native void b2Body_SetBullet_internal(long bodyId, boolean flag);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, flag, 1, return);
    	b2Body_SetBullet(*(b2BodyId*)bodyId, (bool)flag);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Is this body a bullet?
     */
    public static boolean b2Body_IsBullet(b2BodyId bodyId) {
        return b2Body_IsBullet_internal(bodyId.getPointer());
    }

    static private native boolean b2Body_IsBullet_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2Body_IsBullet(*(b2BodyId*)bodyId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Enable/disable contact events on all shapes.
     * @see b2ShapeDef::enableContactEvents
     * @warning changing this at runtime may cause mismatched begin/end touch events
     */
    public static void b2Body_EnableContactEvents(b2BodyId bodyId, boolean flag) {
        b2Body_EnableContactEvents_internal(bodyId.getPointer(), flag);
    }

    static private native void b2Body_EnableContactEvents_internal(long bodyId, boolean flag);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, flag, 1, return);
    	b2Body_EnableContactEvents(*(b2BodyId*)bodyId, (bool)flag);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Enable/disable hit events on all shapes
     * @see b2ShapeDef::enableHitEvents
     */
    public static void b2Body_EnableHitEvents(b2BodyId bodyId, boolean flag) {
        b2Body_EnableHitEvents_internal(bodyId.getPointer(), flag);
    }

    static private native void b2Body_EnableHitEvents_internal(long bodyId, boolean flag);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, flag, 1, return);
    	b2Body_EnableHitEvents(*(b2BodyId*)bodyId, (bool)flag);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the world that owns this body
     */
    public static b2WorldId b2Body_GetWorld(b2BodyId bodyId) {
        return new b2WorldId(b2Body_GetWorld_internal(bodyId.getPointer()), true);
    }

    static private native long b2Body_GetWorld_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2WorldId* _ret = (b2WorldId*)malloc(sizeof(b2WorldId));
    	*_ret = b2Body_GetWorld(*(b2BodyId*)bodyId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the number of shapes on this body
     */
    public static int b2Body_GetShapeCount(b2BodyId bodyId) {
        return b2Body_GetShapeCount_internal(bodyId.getPointer());
    }

    static private native int b2Body_GetShapeCount_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)b2Body_GetShapeCount(*(b2BodyId*)bodyId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the shape ids for all shapes on this body, up to the provided capacity.
     * @returns the number of shape ids stored in the user array
     */
    public static int b2Body_GetShapes(b2BodyId bodyId, b2ShapeId.b2ShapeIdPointer shapeArray, int capacity) {
        return b2Body_GetShapes_internal(bodyId.getPointer(), shapeArray.getPointer(), capacity);
    }

    static private native int b2Body_GetShapes_internal(long bodyId, long shapeArray, int capacity);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, int, capacity, 2, return 0);
    	return (jint)b2Body_GetShapes(*(b2BodyId*)bodyId, (b2ShapeId *)shapeArray, (int)capacity);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the number of joints on this body
     */
    public static int b2Body_GetJointCount(b2BodyId bodyId) {
        return b2Body_GetJointCount_internal(bodyId.getPointer());
    }

    static private native int b2Body_GetJointCount_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)b2Body_GetJointCount(*(b2BodyId*)bodyId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the joint ids for all joints on this body, up to the provided capacity
     * @returns the number of joint ids stored in the user array
     */
    public static int b2Body_GetJoints(b2BodyId bodyId, b2JointId.b2JointIdPointer jointArray, int capacity) {
        return b2Body_GetJoints_internal(bodyId.getPointer(), jointArray.getPointer(), capacity);
    }

    static private native int b2Body_GetJoints_internal(long bodyId, long jointArray, int capacity);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, int, capacity, 2, return 0);
    	return (jint)b2Body_GetJoints(*(b2BodyId*)bodyId, (b2JointId *)jointArray, (int)capacity);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the maximum capacity required for retrieving all the touching contacts on a body
     */
    public static int b2Body_GetContactCapacity(b2BodyId bodyId) {
        return b2Body_GetContactCapacity_internal(bodyId.getPointer());
    }

    static private native int b2Body_GetContactCapacity_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)b2Body_GetContactCapacity(*(b2BodyId*)bodyId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the touching contact data for a body.
     * @note Box2D uses speculative collision so some contact points may be separated.
     * @returns the number of elements filled in the provided array
     * @warning do not ignore the return value, it specifies the valid number of elements
     */
    public static int b2Body_GetContactData(b2BodyId bodyId, b2ContactData.b2ContactDataPointer contactData, int capacity) {
        return b2Body_GetContactData_internal(bodyId.getPointer(), contactData.getPointer(), capacity);
    }

    static private native int b2Body_GetContactData_internal(long bodyId, long contactData, int capacity);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, int, capacity, 2, return 0);
    	return (jint)b2Body_GetContactData(*(b2BodyId*)bodyId, (b2ContactData *)contactData, (int)capacity);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the current world AABB that contains all the attached shapes. Note that this may not encompass the body origin.
     * If there are no shapes attached then the returned AABB is empty and centered on the body origin.
     */
    public static b2AABB b2Body_ComputeAABB(b2BodyId bodyId) {
        return new b2AABB(b2Body_ComputeAABB_internal(bodyId.getPointer()), true);
    }

    static private native long b2Body_ComputeAABB_internal(long bodyId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2AABB* _ret = (b2AABB*)malloc(sizeof(b2AABB));
    	*_ret = b2Body_ComputeAABB(*(b2BodyId*)bodyId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Create a circle shape and attach it to a body. The shape definition and geometry are fully cloned.
     * Contacts are not created until the next time step.
     * @return the shape id for accessing the shape
     */
    public static b2ShapeId b2CreateCircleShape(b2BodyId bodyId, b2ShapeDef.b2ShapeDefPointer def, b2Circle.b2CirclePointer circle) {
        return new b2ShapeId(b2CreateCircleShape_internal(bodyId.getPointer(), def.getPointer(), circle.getPointer()), true);
    }

    static private native long b2CreateCircleShape_internal(long bodyId, long def, long circle);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2ShapeId* _ret = (b2ShapeId*)malloc(sizeof(b2ShapeId));
    	*_ret = b2CreateCircleShape(*(b2BodyId*)bodyId, (const b2ShapeDef *)def, (const b2Circle *)circle);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Create a line segment shape and attach it to a body. The shape definition and geometry are fully cloned.
     * Contacts are not created until the next time step.
     * @return the shape id for accessing the shape
     */
    public static b2ShapeId b2CreateSegmentShape(b2BodyId bodyId, b2ShapeDef.b2ShapeDefPointer def, b2Segment.b2SegmentPointer segment) {
        return new b2ShapeId(b2CreateSegmentShape_internal(bodyId.getPointer(), def.getPointer(), segment.getPointer()), true);
    }

    static private native long b2CreateSegmentShape_internal(long bodyId, long def, long segment);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2ShapeId* _ret = (b2ShapeId*)malloc(sizeof(b2ShapeId));
    	*_ret = b2CreateSegmentShape(*(b2BodyId*)bodyId, (const b2ShapeDef *)def, (const b2Segment *)segment);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Create a capsule shape and attach it to a body. The shape definition and geometry are fully cloned.
     * Contacts are not created until the next time step.
     * @return the shape id for accessing the shape
     */
    public static b2ShapeId b2CreateCapsuleShape(b2BodyId bodyId, b2ShapeDef.b2ShapeDefPointer def, b2Capsule.b2CapsulePointer capsule) {
        return new b2ShapeId(b2CreateCapsuleShape_internal(bodyId.getPointer(), def.getPointer(), capsule.getPointer()), true);
    }

    static private native long b2CreateCapsuleShape_internal(long bodyId, long def, long capsule);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2ShapeId* _ret = (b2ShapeId*)malloc(sizeof(b2ShapeId));
    	*_ret = b2CreateCapsuleShape(*(b2BodyId*)bodyId, (const b2ShapeDef *)def, (const b2Capsule *)capsule);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Create a polygon shape and attach it to a body. The shape definition and geometry are fully cloned.
     * Contacts are not created until the next time step.
     * @return the shape id for accessing the shape
     */
    public static b2ShapeId b2CreatePolygonShape(b2BodyId bodyId, b2ShapeDef.b2ShapeDefPointer def, b2Polygon.b2PolygonPointer polygon) {
        return new b2ShapeId(b2CreatePolygonShape_internal(bodyId.getPointer(), def.getPointer(), polygon.getPointer()), true);
    }

    static private native long b2CreatePolygonShape_internal(long bodyId, long def, long polygon);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2ShapeId* _ret = (b2ShapeId*)malloc(sizeof(b2ShapeId));
    	*_ret = b2CreatePolygonShape(*(b2BodyId*)bodyId, (const b2ShapeDef *)def, (const b2Polygon *)polygon);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     *  Destroy a shape. You may defer the body mass update which can improve performance if several shapes on a
     * 	body are destroyed at once.
     * 	@see Box2d#b2Body_ApplyMassFromShapes
     */
    public static void b2DestroyShape(b2ShapeId shapeId, boolean updateBodyMass) {
        b2DestroyShape_internal(shapeId.getPointer(), updateBodyMass);
    }

    static private native void b2DestroyShape_internal(long shapeId, boolean updateBodyMass);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, updateBodyMass, 1, return);
    	b2DestroyShape(*(b2ShapeId*)shapeId, (bool)updateBodyMass);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Shape identifier validation. Provides validation for up to 64K allocations.
     */
    public static boolean b2Shape_IsValid(b2ShapeId id) {
        return b2Shape_IsValid_internal(id.getPointer());
    }

    static private native boolean b2Shape_IsValid_internal(long id);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2Shape_IsValid(*(b2ShapeId*)id);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the type of a shape
     */
    public static b2ShapeType b2Shape_GetType(b2ShapeId shapeId) {
        return b2ShapeType.getByIndex((int) b2Shape_GetType_internal(shapeId.getPointer()));
    }

    static private native int b2Shape_GetType_internal(long shapeId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)b2Shape_GetType(*(b2ShapeId*)shapeId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the id of the body that a shape is attached to
     */
    public static b2BodyId b2Shape_GetBody(b2ShapeId shapeId) {
        return new b2BodyId(b2Shape_GetBody_internal(shapeId.getPointer()), true);
    }

    static private native long b2Shape_GetBody_internal(long shapeId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2BodyId* _ret = (b2BodyId*)malloc(sizeof(b2BodyId));
    	*_ret = b2Shape_GetBody(*(b2ShapeId*)shapeId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the world that owns this shape
     */
    public static b2WorldId b2Shape_GetWorld(b2ShapeId shapeId) {
        return new b2WorldId(b2Shape_GetWorld_internal(shapeId.getPointer()), true);
    }

    static private native long b2Shape_GetWorld_internal(long shapeId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2WorldId* _ret = (b2WorldId*)malloc(sizeof(b2WorldId));
    	*_ret = b2Shape_GetWorld(*(b2ShapeId*)shapeId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Returns true If the shape is a sensor
     */
    public static boolean b2Shape_IsSensor(b2ShapeId shapeId) {
        return b2Shape_IsSensor_internal(shapeId.getPointer());
    }

    static private native boolean b2Shape_IsSensor_internal(long shapeId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2Shape_IsSensor(*(b2ShapeId*)shapeId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the user data for a shape
     */
    public static void b2Shape_SetUserData(b2ShapeId shapeId, VoidPointer userData) {
        b2Shape_SetUserData_internal(shapeId.getPointer(), userData.getPointer());
    }

    static private native void b2Shape_SetUserData_internal(long shapeId, long userData);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Shape_SetUserData(*(b2ShapeId*)shapeId, (void *)userData);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the user data for a shape. This is useful when you get a shape id
     * from an event or query.
     */
    public static VoidPointer b2Shape_GetUserData(b2ShapeId shapeId) {
        return new VoidPointer(b2Shape_GetUserData_internal(shapeId.getPointer()), false);
    }

    static private native long b2Shape_GetUserData_internal(long shapeId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)b2Shape_GetUserData(*(b2ShapeId*)shapeId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the mass density of a shape, usually in kg/m^2.
     * This will optionally update the mass properties on the parent body.
     * @see b2ShapeDef::density, b2Body_ApplyMassFromShapes
     */
    public static void b2Shape_SetDensity(b2ShapeId shapeId, float density, boolean updateBodyMass) {
        b2Shape_SetDensity_internal(shapeId.getPointer(), density, updateBodyMass);
    }

    static private native void b2Shape_SetDensity_internal(long shapeId, float density, boolean updateBodyMass);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, updateBodyMass, 2, return);
    	b2Shape_SetDensity(*(b2ShapeId*)shapeId, (float)density, (bool)updateBodyMass);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the density of a shape, usually in kg/m^2
     */
    public static float b2Shape_GetDensity(b2ShapeId shapeId) {
        return b2Shape_GetDensity_internal(shapeId.getPointer());
    }

    static private native float b2Shape_GetDensity_internal(long shapeId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2Shape_GetDensity(*(b2ShapeId*)shapeId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the friction on a shape
     * @see b2ShapeDef::friction
     */
    public static void b2Shape_SetFriction(b2ShapeId shapeId, float friction) {
        b2Shape_SetFriction_internal(shapeId.getPointer(), friction);
    }

    static private native void b2Shape_SetFriction_internal(long shapeId, float friction);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Shape_SetFriction(*(b2ShapeId*)shapeId, (float)friction);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the friction of a shape
     */
    public static float b2Shape_GetFriction(b2ShapeId shapeId) {
        return b2Shape_GetFriction_internal(shapeId.getPointer());
    }

    static private native float b2Shape_GetFriction_internal(long shapeId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2Shape_GetFriction(*(b2ShapeId*)shapeId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the shape restitution (bounciness)
     * @see b2ShapeDef::restitution
     */
    public static void b2Shape_SetRestitution(b2ShapeId shapeId, float restitution) {
        b2Shape_SetRestitution_internal(shapeId.getPointer(), restitution);
    }

    static private native void b2Shape_SetRestitution_internal(long shapeId, float restitution);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Shape_SetRestitution(*(b2ShapeId*)shapeId, (float)restitution);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the shape restitution
     */
    public static float b2Shape_GetRestitution(b2ShapeId shapeId) {
        return b2Shape_GetRestitution_internal(shapeId.getPointer());
    }

    static private native float b2Shape_GetRestitution_internal(long shapeId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2Shape_GetRestitution(*(b2ShapeId*)shapeId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the shape filter
     */
    public static b2Filter b2Shape_GetFilter(b2ShapeId shapeId) {
        return new b2Filter(b2Shape_GetFilter_internal(shapeId.getPointer()), true);
    }

    static private native long b2Shape_GetFilter_internal(long shapeId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Filter* _ret = (b2Filter*)malloc(sizeof(b2Filter));
    	*_ret = b2Shape_GetFilter(*(b2ShapeId*)shapeId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the current filter. This is almost as expensive as recreating the shape. This may cause
     * contacts to be immediately destroyed. However contacts are not created until the next world step.
     * Sensor overlap state is also not updated until the next world step.
     * @see b2ShapeDef::filter
     */
    public static void b2Shape_SetFilter(b2ShapeId shapeId, b2Filter filter) {
        b2Shape_SetFilter_internal(shapeId.getPointer(), filter.getPointer());
    }

    static private native void b2Shape_SetFilter_internal(long shapeId, long filter);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Shape_SetFilter(*(b2ShapeId*)shapeId, *(b2Filter*)filter);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Enable contact events for this shape. Only applies to kinematic and dynamic bodies. Ignored for sensors.
     * @see b2ShapeDef::enableContactEvents
     * @warning changing this at run-time may lead to lost begin/end events
     */
    public static void b2Shape_EnableContactEvents(b2ShapeId shapeId, boolean flag) {
        b2Shape_EnableContactEvents_internal(shapeId.getPointer(), flag);
    }

    static private native void b2Shape_EnableContactEvents_internal(long shapeId, boolean flag);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, flag, 1, return);
    	b2Shape_EnableContactEvents(*(b2ShapeId*)shapeId, (bool)flag);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Returns true if contact events are enabled
     */
    public static boolean b2Shape_AreContactEventsEnabled(b2ShapeId shapeId) {
        return b2Shape_AreContactEventsEnabled_internal(shapeId.getPointer());
    }

    static private native boolean b2Shape_AreContactEventsEnabled_internal(long shapeId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2Shape_AreContactEventsEnabled(*(b2ShapeId*)shapeId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Enable pre-solve contact events for this shape. Only applies to dynamic bodies. These are expensive
     * and must be carefully handled due to multithreading. Ignored for sensors.
     * @see b2PreSolveFcn
     */
    public static void b2Shape_EnablePreSolveEvents(b2ShapeId shapeId, boolean flag) {
        b2Shape_EnablePreSolveEvents_internal(shapeId.getPointer(), flag);
    }

    static private native void b2Shape_EnablePreSolveEvents_internal(long shapeId, boolean flag);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, flag, 1, return);
    	b2Shape_EnablePreSolveEvents(*(b2ShapeId*)shapeId, (bool)flag);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Returns true if pre-solve events are enabled
     */
    public static boolean b2Shape_ArePreSolveEventsEnabled(b2ShapeId shapeId) {
        return b2Shape_ArePreSolveEventsEnabled_internal(shapeId.getPointer());
    }

    static private native boolean b2Shape_ArePreSolveEventsEnabled_internal(long shapeId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2Shape_ArePreSolveEventsEnabled(*(b2ShapeId*)shapeId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Enable contact hit events for this shape. Ignored for sensors.
     * @see b2WorldDef#hitEventThreshold
     */
    public static void b2Shape_EnableHitEvents(b2ShapeId shapeId, boolean flag) {
        b2Shape_EnableHitEvents_internal(shapeId.getPointer(), flag);
    }

    static private native void b2Shape_EnableHitEvents_internal(long shapeId, boolean flag);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, flag, 1, return);
    	b2Shape_EnableHitEvents(*(b2ShapeId*)shapeId, (bool)flag);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Returns true if hit events are enabled
     */
    public static boolean b2Shape_AreHitEventsEnabled(b2ShapeId shapeId) {
        return b2Shape_AreHitEventsEnabled_internal(shapeId.getPointer());
    }

    static private native boolean b2Shape_AreHitEventsEnabled_internal(long shapeId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2Shape_AreHitEventsEnabled(*(b2ShapeId*)shapeId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Test a point for overlap with a shape
     */
    public static boolean b2Shape_TestPoint(b2ShapeId shapeId, b2Vec2 point) {
        return b2Shape_TestPoint_internal(shapeId.getPointer(), point.getPointer());
    }

    static private native boolean b2Shape_TestPoint_internal(long shapeId, long point);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2Shape_TestPoint(*(b2ShapeId*)shapeId, *(b2Vec2*)point);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Ray cast a shape directly
     */
    public static b2CastOutput b2Shape_RayCast(b2ShapeId shapeId, b2RayCastInput.b2RayCastInputPointer input) {
        return new b2CastOutput(b2Shape_RayCast_internal(shapeId.getPointer(), input.getPointer()), true);
    }

    static private native long b2Shape_RayCast_internal(long shapeId, long input);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2CastOutput* _ret = (b2CastOutput*)malloc(sizeof(b2CastOutput));
    	*_ret = b2Shape_RayCast(*(b2ShapeId*)shapeId, (const b2RayCastInput *)input);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get a copy of the shape's circle. Asserts the type is correct.
     */
    public static b2Circle b2Shape_GetCircle(b2ShapeId shapeId) {
        return new b2Circle(b2Shape_GetCircle_internal(shapeId.getPointer()), true);
    }

    static private native long b2Shape_GetCircle_internal(long shapeId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Circle* _ret = (b2Circle*)malloc(sizeof(b2Circle));
    	*_ret = b2Shape_GetCircle(*(b2ShapeId*)shapeId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get a copy of the shape's line segment. Asserts the type is correct.
     */
    public static b2Segment b2Shape_GetSegment(b2ShapeId shapeId) {
        return new b2Segment(b2Shape_GetSegment_internal(shapeId.getPointer()), true);
    }

    static private native long b2Shape_GetSegment_internal(long shapeId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Segment* _ret = (b2Segment*)malloc(sizeof(b2Segment));
    	*_ret = b2Shape_GetSegment(*(b2ShapeId*)shapeId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get a copy of the shape's chain segment. These come from chain shapes.
     * Asserts the type is correct.
     */
    public static b2ChainSegment b2Shape_GetChainSegment(b2ShapeId shapeId) {
        return new b2ChainSegment(b2Shape_GetChainSegment_internal(shapeId.getPointer()), true);
    }

    static private native long b2Shape_GetChainSegment_internal(long shapeId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2ChainSegment* _ret = (b2ChainSegment*)malloc(sizeof(b2ChainSegment));
    	*_ret = b2Shape_GetChainSegment(*(b2ShapeId*)shapeId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get a copy of the shape's capsule. Asserts the type is correct.
     */
    public static b2Capsule b2Shape_GetCapsule(b2ShapeId shapeId) {
        return new b2Capsule(b2Shape_GetCapsule_internal(shapeId.getPointer()), true);
    }

    static private native long b2Shape_GetCapsule_internal(long shapeId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Capsule* _ret = (b2Capsule*)malloc(sizeof(b2Capsule));
    	*_ret = b2Shape_GetCapsule(*(b2ShapeId*)shapeId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get a copy of the shape's convex polygon. Asserts the type is correct.
     */
    public static b2Polygon b2Shape_GetPolygon(b2ShapeId shapeId) {
        return new b2Polygon(b2Shape_GetPolygon_internal(shapeId.getPointer()), true);
    }

    static private native long b2Shape_GetPolygon_internal(long shapeId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Polygon* _ret = (b2Polygon*)malloc(sizeof(b2Polygon));
    	*_ret = b2Shape_GetPolygon(*(b2ShapeId*)shapeId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Allows you to change a shape to be a circle or update the current circle.
     * This does not modify the mass properties.
     * @see Box2d#b2Body_ApplyMassFromShapes
     */
    public static void b2Shape_SetCircle(b2ShapeId shapeId, b2Circle.b2CirclePointer circle) {
        b2Shape_SetCircle_internal(shapeId.getPointer(), circle.getPointer());
    }

    static private native void b2Shape_SetCircle_internal(long shapeId, long circle);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Shape_SetCircle(*(b2ShapeId*)shapeId, (const b2Circle *)circle);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Allows you to change a shape to be a capsule or update the current capsule.
     * This does not modify the mass properties.
     * @see Box2d#b2Body_ApplyMassFromShapes
     */
    public static void b2Shape_SetCapsule(b2ShapeId shapeId, b2Capsule.b2CapsulePointer capsule) {
        b2Shape_SetCapsule_internal(shapeId.getPointer(), capsule.getPointer());
    }

    static private native void b2Shape_SetCapsule_internal(long shapeId, long capsule);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Shape_SetCapsule(*(b2ShapeId*)shapeId, (const b2Capsule *)capsule);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Allows you to change a shape to be a segment or update the current segment.
     */
    public static void b2Shape_SetSegment(b2ShapeId shapeId, b2Segment.b2SegmentPointer segment) {
        b2Shape_SetSegment_internal(shapeId.getPointer(), segment.getPointer());
    }

    static private native void b2Shape_SetSegment_internal(long shapeId, long segment);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Shape_SetSegment(*(b2ShapeId*)shapeId, (const b2Segment *)segment);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Allows you to change a shape to be a polygon or update the current polygon.
     * This does not modify the mass properties.
     * @see Box2d#b2Body_ApplyMassFromShapes
     */
    public static void b2Shape_SetPolygon(b2ShapeId shapeId, b2Polygon.b2PolygonPointer polygon) {
        b2Shape_SetPolygon_internal(shapeId.getPointer(), polygon.getPointer());
    }

    static private native void b2Shape_SetPolygon_internal(long shapeId, long polygon);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Shape_SetPolygon(*(b2ShapeId*)shapeId, (const b2Polygon *)polygon);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the parent chain id if the shape type is a chain segment, otherwise
     * returns b2_nullChainId.
     */
    public static b2ChainId b2Shape_GetParentChain(b2ShapeId shapeId) {
        return new b2ChainId(b2Shape_GetParentChain_internal(shapeId.getPointer()), true);
    }

    static private native long b2Shape_GetParentChain_internal(long shapeId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2ChainId* _ret = (b2ChainId*)malloc(sizeof(b2ChainId));
    	*_ret = b2Shape_GetParentChain(*(b2ShapeId*)shapeId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the maximum capacity required for retrieving all the touching contacts on a shape
     */
    public static int b2Shape_GetContactCapacity(b2ShapeId shapeId) {
        return b2Shape_GetContactCapacity_internal(shapeId.getPointer());
    }

    static private native int b2Shape_GetContactCapacity_internal(long shapeId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)b2Shape_GetContactCapacity(*(b2ShapeId*)shapeId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the touching contact data for a shape. The provided shapeId will be either shapeIdA or shapeIdB on the contact data.
     * @note Box2D uses speculative collision so some contact points may be separated.
     * @returns the number of elements filled in the provided array
     * @warning do not ignore the return value, it specifies the valid number of elements
     */
    public static int b2Shape_GetContactData(b2ShapeId shapeId, b2ContactData.b2ContactDataPointer contactData, int capacity) {
        return b2Shape_GetContactData_internal(shapeId.getPointer(), contactData.getPointer(), capacity);
    }

    static private native int b2Shape_GetContactData_internal(long shapeId, long contactData, int capacity);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, int, capacity, 2, return 0);
    	return (jint)b2Shape_GetContactData(*(b2ShapeId*)shapeId, (b2ContactData *)contactData, (int)capacity);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the maximum capacity required for retrieving all the overlapped shapes on a sensor shape.
     * This returns 0 if the provided shape is not a sensor.
     * @param shapeId the id of a sensor shape
     * @returns the required capacity to get all the overlaps in b2Shape_GetSensorOverlaps
     */
    public static int b2Shape_GetSensorCapacity(b2ShapeId shapeId) {
        return b2Shape_GetSensorCapacity_internal(shapeId.getPointer());
    }

    static private native int b2Shape_GetSensorCapacity_internal(long shapeId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)b2Shape_GetSensorCapacity(*(b2ShapeId*)shapeId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the overlapped shapes for a sensor shape.
     * @param shapeId the id of a sensor shape
     * @param overlaps a user allocated array that is filled with the overlapping shapes
     * @param capacity the capacity of overlappedShapes
     * @returns the number of elements filled in the provided array
     * @warning do not ignore the return value, it specifies the valid number of elements
     * @warning overlaps may contain destroyed shapes so use b2Shape_IsValid to confirm each overlap
     */
    public static int b2Shape_GetSensorOverlaps(b2ShapeId shapeId, b2ShapeId.b2ShapeIdPointer overlaps, int capacity) {
        return b2Shape_GetSensorOverlaps_internal(shapeId.getPointer(), overlaps.getPointer(), capacity);
    }

    static private native int b2Shape_GetSensorOverlaps_internal(long shapeId, long overlaps, int capacity);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, int, capacity, 2, return 0);
    	return (jint)b2Shape_GetSensorOverlaps(*(b2ShapeId*)shapeId, (b2ShapeId *)overlaps, (int)capacity);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the current world AABB
     */
    public static b2AABB b2Shape_GetAABB(b2ShapeId shapeId) {
        return new b2AABB(b2Shape_GetAABB_internal(shapeId.getPointer()), true);
    }

    static private native long b2Shape_GetAABB_internal(long shapeId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2AABB* _ret = (b2AABB*)malloc(sizeof(b2AABB));
    	*_ret = b2Shape_GetAABB(*(b2ShapeId*)shapeId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the mass data for a shape
     */
    public static b2MassData b2Shape_GetMassData(b2ShapeId shapeId) {
        return new b2MassData(b2Shape_GetMassData_internal(shapeId.getPointer()), true);
    }

    static private native long b2Shape_GetMassData_internal(long shapeId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2MassData* _ret = (b2MassData*)malloc(sizeof(b2MassData));
    	*_ret = b2Shape_GetMassData(*(b2ShapeId*)shapeId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the closest point on a shape to a target point. Target and result are in world space.
     * todo need sample
     */
    public static b2Vec2 b2Shape_GetClosestPoint(b2ShapeId shapeId, b2Vec2 target) {
        return new b2Vec2(b2Shape_GetClosestPoint_internal(shapeId.getPointer(), target.getPointer()), true);
    }

    static private native long b2Shape_GetClosestPoint_internal(long shapeId, long target);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Shape_GetClosestPoint(*(b2ShapeId*)shapeId, *(b2Vec2*)target);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Create a chain shape
     * @see b2ChainDef for details
     */
    public static b2ChainId b2CreateChain(b2BodyId bodyId, b2ChainDef.b2ChainDefPointer def) {
        return new b2ChainId(b2CreateChain_internal(bodyId.getPointer(), def.getPointer()), true);
    }

    static private native long b2CreateChain_internal(long bodyId, long def);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2ChainId* _ret = (b2ChainId*)malloc(sizeof(b2ChainId));
    	*_ret = b2CreateChain(*(b2BodyId*)bodyId, (const b2ChainDef *)def);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Destroy a chain shape
     */
    public static void b2DestroyChain(b2ChainId chainId) {
        b2DestroyChain_internal(chainId.getPointer());
    }

    static private native void b2DestroyChain_internal(long chainId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2DestroyChain(*(b2ChainId*)chainId);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the world that owns this chain shape
     */
    public static b2WorldId b2Chain_GetWorld(b2ChainId chainId) {
        return new b2WorldId(b2Chain_GetWorld_internal(chainId.getPointer()), true);
    }

    static private native long b2Chain_GetWorld_internal(long chainId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2WorldId* _ret = (b2WorldId*)malloc(sizeof(b2WorldId));
    	*_ret = b2Chain_GetWorld(*(b2ChainId*)chainId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the number of segments on this chain
     */
    public static int b2Chain_GetSegmentCount(b2ChainId chainId) {
        return b2Chain_GetSegmentCount_internal(chainId.getPointer());
    }

    static private native int b2Chain_GetSegmentCount_internal(long chainId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)b2Chain_GetSegmentCount(*(b2ChainId*)chainId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Fill a user array with chain segment shape ids up to the specified capacity. Returns
     * the actual number of segments returned.
     */
    public static int b2Chain_GetSegments(b2ChainId chainId, b2ShapeId.b2ShapeIdPointer segmentArray, int capacity) {
        return b2Chain_GetSegments_internal(chainId.getPointer(), segmentArray.getPointer(), capacity);
    }

    static private native int b2Chain_GetSegments_internal(long chainId, long segmentArray, int capacity);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, int, capacity, 2, return 0);
    	return (jint)b2Chain_GetSegments(*(b2ChainId*)chainId, (b2ShapeId *)segmentArray, (int)capacity);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the chain friction
     * @see b2ChainDef::friction
     */
    public static void b2Chain_SetFriction(b2ChainId chainId, float friction) {
        b2Chain_SetFriction_internal(chainId.getPointer(), friction);
    }

    static private native void b2Chain_SetFriction_internal(long chainId, float friction);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Chain_SetFriction(*(b2ChainId*)chainId, (float)friction);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the chain friction
     */
    public static float b2Chain_GetFriction(b2ChainId chainId) {
        return b2Chain_GetFriction_internal(chainId.getPointer());
    }

    static private native float b2Chain_GetFriction_internal(long chainId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2Chain_GetFriction(*(b2ChainId*)chainId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the chain restitution (bounciness)
     * @see b2ChainDef::restitution
     */
    public static void b2Chain_SetRestitution(b2ChainId chainId, float restitution) {
        b2Chain_SetRestitution_internal(chainId.getPointer(), restitution);
    }

    static private native void b2Chain_SetRestitution_internal(long chainId, float restitution);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Chain_SetRestitution(*(b2ChainId*)chainId, (float)restitution);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the chain restitution
     */
    public static float b2Chain_GetRestitution(b2ChainId chainId) {
        return b2Chain_GetRestitution_internal(chainId.getPointer());
    }

    static private native float b2Chain_GetRestitution_internal(long chainId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2Chain_GetRestitution(*(b2ChainId*)chainId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Chain identifier validation. Provides validation for up to 64K allocations.
     */
    public static boolean b2Chain_IsValid(b2ChainId id) {
        return b2Chain_IsValid_internal(id.getPointer());
    }

    static private native boolean b2Chain_IsValid_internal(long id);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2Chain_IsValid(*(b2ChainId*)id);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Destroy a joint
     */
    public static void b2DestroyJoint(b2JointId jointId) {
        b2DestroyJoint_internal(jointId.getPointer());
    }

    static private native void b2DestroyJoint_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2DestroyJoint(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Joint identifier validation. Provides validation for up to 64K allocations.
     */
    public static boolean b2Joint_IsValid(b2JointId id) {
        return b2Joint_IsValid_internal(id.getPointer());
    }

    static private native boolean b2Joint_IsValid_internal(long id);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2Joint_IsValid(*(b2JointId*)id);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the joint type
     */
    public static b2JointType b2Joint_GetType(b2JointId jointId) {
        return b2JointType.getByIndex((int) b2Joint_GetType_internal(jointId.getPointer()));
    }

    static private native int b2Joint_GetType_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)b2Joint_GetType(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get body A id on a joint
     */
    public static b2BodyId b2Joint_GetBodyA(b2JointId jointId) {
        return new b2BodyId(b2Joint_GetBodyA_internal(jointId.getPointer()), true);
    }

    static private native long b2Joint_GetBodyA_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2BodyId* _ret = (b2BodyId*)malloc(sizeof(b2BodyId));
    	*_ret = b2Joint_GetBodyA(*(b2JointId*)jointId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get body B id on a joint
     */
    public static b2BodyId b2Joint_GetBodyB(b2JointId jointId) {
        return new b2BodyId(b2Joint_GetBodyB_internal(jointId.getPointer()), true);
    }

    static private native long b2Joint_GetBodyB_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2BodyId* _ret = (b2BodyId*)malloc(sizeof(b2BodyId));
    	*_ret = b2Joint_GetBodyB(*(b2JointId*)jointId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the world that owns this joint
     */
    public static b2WorldId b2Joint_GetWorld(b2JointId jointId) {
        return new b2WorldId(b2Joint_GetWorld_internal(jointId.getPointer()), true);
    }

    static private native long b2Joint_GetWorld_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2WorldId* _ret = (b2WorldId*)malloc(sizeof(b2WorldId));
    	*_ret = b2Joint_GetWorld(*(b2JointId*)jointId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the local anchor on bodyA
     */
    public static b2Vec2 b2Joint_GetLocalAnchorA(b2JointId jointId) {
        return new b2Vec2(b2Joint_GetLocalAnchorA_internal(jointId.getPointer()), true);
    }

    static private native long b2Joint_GetLocalAnchorA_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Joint_GetLocalAnchorA(*(b2JointId*)jointId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the local anchor on bodyB
     */
    public static b2Vec2 b2Joint_GetLocalAnchorB(b2JointId jointId) {
        return new b2Vec2(b2Joint_GetLocalAnchorB_internal(jointId.getPointer()), true);
    }

    static private native long b2Joint_GetLocalAnchorB_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Joint_GetLocalAnchorB(*(b2JointId*)jointId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Toggle collision between connected bodies
     */
    public static void b2Joint_SetCollideConnected(b2JointId jointId, boolean shouldCollide) {
        b2Joint_SetCollideConnected_internal(jointId.getPointer(), shouldCollide);
    }

    static private native void b2Joint_SetCollideConnected_internal(long jointId, boolean shouldCollide);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, shouldCollide, 1, return);
    	b2Joint_SetCollideConnected(*(b2JointId*)jointId, (bool)shouldCollide);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Is collision allowed between connected bodies?
     */
    public static boolean b2Joint_GetCollideConnected(b2JointId jointId) {
        return b2Joint_GetCollideConnected_internal(jointId.getPointer());
    }

    static private native boolean b2Joint_GetCollideConnected_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2Joint_GetCollideConnected(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the user data on a joint
     */
    public static void b2Joint_SetUserData(b2JointId jointId, VoidPointer userData) {
        b2Joint_SetUserData_internal(jointId.getPointer(), userData.getPointer());
    }

    static private native void b2Joint_SetUserData_internal(long jointId, long userData);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Joint_SetUserData(*(b2JointId*)jointId, (void *)userData);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the user data on a joint
     */
    public static VoidPointer b2Joint_GetUserData(b2JointId jointId) {
        return new VoidPointer(b2Joint_GetUserData_internal(jointId.getPointer()), false);
    }

    static private native long b2Joint_GetUserData_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)b2Joint_GetUserData(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Wake the bodies connect to this joint
     */
    public static void b2Joint_WakeBodies(b2JointId jointId) {
        b2Joint_WakeBodies_internal(jointId.getPointer());
    }

    static private native void b2Joint_WakeBodies_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Joint_WakeBodies(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the current constraint force for this joint. Usually in Newtons.
     */
    public static b2Vec2 b2Joint_GetConstraintForce(b2JointId jointId) {
        return new b2Vec2(b2Joint_GetConstraintForce_internal(jointId.getPointer()), true);
    }

    static private native long b2Joint_GetConstraintForce_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2Joint_GetConstraintForce(*(b2JointId*)jointId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the current constraint torque for this joint. Usually in Newton * meters.
     */
    public static float b2Joint_GetConstraintTorque(b2JointId jointId) {
        return b2Joint_GetConstraintTorque_internal(jointId.getPointer());
    }

    static private native float b2Joint_GetConstraintTorque_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2Joint_GetConstraintTorque(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Create a distance joint
     * @see b2DistanceJointDef for details
     */
    public static b2JointId b2CreateDistanceJoint(b2WorldId worldId, b2DistanceJointDef.b2DistanceJointDefPointer def) {
        return new b2JointId(b2CreateDistanceJoint_internal(worldId.getPointer(), def.getPointer()), true);
    }

    static private native long b2CreateDistanceJoint_internal(long worldId, long def);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2JointId* _ret = (b2JointId*)malloc(sizeof(b2JointId));
    	*_ret = b2CreateDistanceJoint(*(b2WorldId*)worldId, (const b2DistanceJointDef *)def);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the rest length of a distance joint
     * @param jointId The id for a distance joint
     * @param length The new distance joint length
     */
    public static void b2DistanceJoint_SetLength(b2JointId jointId, float length) {
        b2DistanceJoint_SetLength_internal(jointId.getPointer(), length);
    }

    static private native void b2DistanceJoint_SetLength_internal(long jointId, float length);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2DistanceJoint_SetLength(*(b2JointId*)jointId, (float)length);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the rest length of a distance joint
     */
    public static float b2DistanceJoint_GetLength(b2JointId jointId) {
        return b2DistanceJoint_GetLength_internal(jointId.getPointer());
    }

    static private native float b2DistanceJoint_GetLength_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2DistanceJoint_GetLength(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Enable/disable the distance joint spring. When disabled the distance joint is rigid.
     */
    public static void b2DistanceJoint_EnableSpring(b2JointId jointId, boolean enableSpring) {
        b2DistanceJoint_EnableSpring_internal(jointId.getPointer(), enableSpring);
    }

    static private native void b2DistanceJoint_EnableSpring_internal(long jointId, boolean enableSpring);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, enableSpring, 1, return);
    	b2DistanceJoint_EnableSpring(*(b2JointId*)jointId, (bool)enableSpring);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Is the distance joint spring enabled?
     */
    public static boolean b2DistanceJoint_IsSpringEnabled(b2JointId jointId) {
        return b2DistanceJoint_IsSpringEnabled_internal(jointId.getPointer());
    }

    static private native boolean b2DistanceJoint_IsSpringEnabled_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2DistanceJoint_IsSpringEnabled(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the spring stiffness in Hertz
     */
    public static void b2DistanceJoint_SetSpringHertz(b2JointId jointId, float hertz) {
        b2DistanceJoint_SetSpringHertz_internal(jointId.getPointer(), hertz);
    }

    static private native void b2DistanceJoint_SetSpringHertz_internal(long jointId, float hertz);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2DistanceJoint_SetSpringHertz(*(b2JointId*)jointId, (float)hertz);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Set the spring damping ratio, non-dimensional
     */
    public static void b2DistanceJoint_SetSpringDampingRatio(b2JointId jointId, float dampingRatio) {
        b2DistanceJoint_SetSpringDampingRatio_internal(jointId.getPointer(), dampingRatio);
    }

    static private native void b2DistanceJoint_SetSpringDampingRatio_internal(long jointId, float dampingRatio);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2DistanceJoint_SetSpringDampingRatio(*(b2JointId*)jointId, (float)dampingRatio);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the spring Hertz
     */
    public static float b2DistanceJoint_GetSpringHertz(b2JointId jointId) {
        return b2DistanceJoint_GetSpringHertz_internal(jointId.getPointer());
    }

    static private native float b2DistanceJoint_GetSpringHertz_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2DistanceJoint_GetSpringHertz(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the spring damping ratio
     */
    public static float b2DistanceJoint_GetSpringDampingRatio(b2JointId jointId) {
        return b2DistanceJoint_GetSpringDampingRatio_internal(jointId.getPointer());
    }

    static private native float b2DistanceJoint_GetSpringDampingRatio_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2DistanceJoint_GetSpringDampingRatio(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Enable joint limit. The limit only works if the joint spring is enabled. Otherwise the joint is rigid
     * and the limit has no effect.
     */
    public static void b2DistanceJoint_EnableLimit(b2JointId jointId, boolean enableLimit) {
        b2DistanceJoint_EnableLimit_internal(jointId.getPointer(), enableLimit);
    }

    static private native void b2DistanceJoint_EnableLimit_internal(long jointId, boolean enableLimit);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, enableLimit, 1, return);
    	b2DistanceJoint_EnableLimit(*(b2JointId*)jointId, (bool)enableLimit);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Is the distance joint limit enabled?
     */
    public static boolean b2DistanceJoint_IsLimitEnabled(b2JointId jointId) {
        return b2DistanceJoint_IsLimitEnabled_internal(jointId.getPointer());
    }

    static private native boolean b2DistanceJoint_IsLimitEnabled_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2DistanceJoint_IsLimitEnabled(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the minimum and maximum length parameters of a distance joint
     */
    public static void b2DistanceJoint_SetLengthRange(b2JointId jointId, float minLength, float maxLength) {
        b2DistanceJoint_SetLengthRange_internal(jointId.getPointer(), minLength, maxLength);
    }

    static private native void b2DistanceJoint_SetLengthRange_internal(long jointId, float minLength, float maxLength);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2DistanceJoint_SetLengthRange(*(b2JointId*)jointId, (float)minLength, (float)maxLength);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the distance joint minimum length
     */
    public static float b2DistanceJoint_GetMinLength(b2JointId jointId) {
        return b2DistanceJoint_GetMinLength_internal(jointId.getPointer());
    }

    static private native float b2DistanceJoint_GetMinLength_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2DistanceJoint_GetMinLength(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the distance joint maximum length
     */
    public static float b2DistanceJoint_GetMaxLength(b2JointId jointId) {
        return b2DistanceJoint_GetMaxLength_internal(jointId.getPointer());
    }

    static private native float b2DistanceJoint_GetMaxLength_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2DistanceJoint_GetMaxLength(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the current length of a distance joint
     */
    public static float b2DistanceJoint_GetCurrentLength(b2JointId jointId) {
        return b2DistanceJoint_GetCurrentLength_internal(jointId.getPointer());
    }

    static private native float b2DistanceJoint_GetCurrentLength_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2DistanceJoint_GetCurrentLength(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Enable/disable the distance joint motor
     */
    public static void b2DistanceJoint_EnableMotor(b2JointId jointId, boolean enableMotor) {
        b2DistanceJoint_EnableMotor_internal(jointId.getPointer(), enableMotor);
    }

    static private native void b2DistanceJoint_EnableMotor_internal(long jointId, boolean enableMotor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, enableMotor, 1, return);
    	b2DistanceJoint_EnableMotor(*(b2JointId*)jointId, (bool)enableMotor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Is the distance joint motor enabled?
     */
    public static boolean b2DistanceJoint_IsMotorEnabled(b2JointId jointId) {
        return b2DistanceJoint_IsMotorEnabled_internal(jointId.getPointer());
    }

    static private native boolean b2DistanceJoint_IsMotorEnabled_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2DistanceJoint_IsMotorEnabled(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the distance joint motor speed, usually in meters per second
     */
    public static void b2DistanceJoint_SetMotorSpeed(b2JointId jointId, float motorSpeed) {
        b2DistanceJoint_SetMotorSpeed_internal(jointId.getPointer(), motorSpeed);
    }

    static private native void b2DistanceJoint_SetMotorSpeed_internal(long jointId, float motorSpeed);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2DistanceJoint_SetMotorSpeed(*(b2JointId*)jointId, (float)motorSpeed);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the distance joint motor speed, usually in meters per second
     */
    public static float b2DistanceJoint_GetMotorSpeed(b2JointId jointId) {
        return b2DistanceJoint_GetMotorSpeed_internal(jointId.getPointer());
    }

    static private native float b2DistanceJoint_GetMotorSpeed_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2DistanceJoint_GetMotorSpeed(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the distance joint maximum motor force, usually in newtons
     */
    public static void b2DistanceJoint_SetMaxMotorForce(b2JointId jointId, float force) {
        b2DistanceJoint_SetMaxMotorForce_internal(jointId.getPointer(), force);
    }

    static private native void b2DistanceJoint_SetMaxMotorForce_internal(long jointId, float force);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2DistanceJoint_SetMaxMotorForce(*(b2JointId*)jointId, (float)force);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the distance joint maximum motor force, usually in newtons
     */
    public static float b2DistanceJoint_GetMaxMotorForce(b2JointId jointId) {
        return b2DistanceJoint_GetMaxMotorForce_internal(jointId.getPointer());
    }

    static private native float b2DistanceJoint_GetMaxMotorForce_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2DistanceJoint_GetMaxMotorForce(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the distance joint current motor force, usually in newtons
     */
    public static float b2DistanceJoint_GetMotorForce(b2JointId jointId) {
        return b2DistanceJoint_GetMotorForce_internal(jointId.getPointer());
    }

    static private native float b2DistanceJoint_GetMotorForce_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2DistanceJoint_GetMotorForce(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Create a motor joint
     * @see b2MotorJointDef for details
     */
    public static b2JointId b2CreateMotorJoint(b2WorldId worldId, b2MotorJointDef.b2MotorJointDefPointer def) {
        return new b2JointId(b2CreateMotorJoint_internal(worldId.getPointer(), def.getPointer()), true);
    }

    static private native long b2CreateMotorJoint_internal(long worldId, long def);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2JointId* _ret = (b2JointId*)malloc(sizeof(b2JointId));
    	*_ret = b2CreateMotorJoint(*(b2WorldId*)worldId, (const b2MotorJointDef *)def);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the motor joint linear offset target
     */
    public static void b2MotorJoint_SetLinearOffset(b2JointId jointId, b2Vec2 linearOffset) {
        b2MotorJoint_SetLinearOffset_internal(jointId.getPointer(), linearOffset.getPointer());
    }

    static private native void b2MotorJoint_SetLinearOffset_internal(long jointId, long linearOffset);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2MotorJoint_SetLinearOffset(*(b2JointId*)jointId, *(b2Vec2*)linearOffset);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the motor joint linear offset target
     */
    public static b2Vec2 b2MotorJoint_GetLinearOffset(b2JointId jointId) {
        return new b2Vec2(b2MotorJoint_GetLinearOffset_internal(jointId.getPointer()), true);
    }

    static private native long b2MotorJoint_GetLinearOffset_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2MotorJoint_GetLinearOffset(*(b2JointId*)jointId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the motor joint angular offset target in radians
     */
    public static void b2MotorJoint_SetAngularOffset(b2JointId jointId, float angularOffset) {
        b2MotorJoint_SetAngularOffset_internal(jointId.getPointer(), angularOffset);
    }

    static private native void b2MotorJoint_SetAngularOffset_internal(long jointId, float angularOffset);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2MotorJoint_SetAngularOffset(*(b2JointId*)jointId, (float)angularOffset);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the motor joint angular offset target in radians
     */
    public static float b2MotorJoint_GetAngularOffset(b2JointId jointId) {
        return b2MotorJoint_GetAngularOffset_internal(jointId.getPointer());
    }

    static private native float b2MotorJoint_GetAngularOffset_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2MotorJoint_GetAngularOffset(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the motor joint maximum force, usually in newtons
     */
    public static void b2MotorJoint_SetMaxForce(b2JointId jointId, float maxForce) {
        b2MotorJoint_SetMaxForce_internal(jointId.getPointer(), maxForce);
    }

    static private native void b2MotorJoint_SetMaxForce_internal(long jointId, float maxForce);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2MotorJoint_SetMaxForce(*(b2JointId*)jointId, (float)maxForce);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the motor joint maximum force, usually in newtons
     */
    public static float b2MotorJoint_GetMaxForce(b2JointId jointId) {
        return b2MotorJoint_GetMaxForce_internal(jointId.getPointer());
    }

    static private native float b2MotorJoint_GetMaxForce_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2MotorJoint_GetMaxForce(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the motor joint maximum torque, usually in newton-meters
     */
    public static void b2MotorJoint_SetMaxTorque(b2JointId jointId, float maxTorque) {
        b2MotorJoint_SetMaxTorque_internal(jointId.getPointer(), maxTorque);
    }

    static private native void b2MotorJoint_SetMaxTorque_internal(long jointId, float maxTorque);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2MotorJoint_SetMaxTorque(*(b2JointId*)jointId, (float)maxTorque);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the motor joint maximum torque, usually in newton-meters
     */
    public static float b2MotorJoint_GetMaxTorque(b2JointId jointId) {
        return b2MotorJoint_GetMaxTorque_internal(jointId.getPointer());
    }

    static private native float b2MotorJoint_GetMaxTorque_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2MotorJoint_GetMaxTorque(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the motor joint correction factor, usually in [0, 1]
     */
    public static void b2MotorJoint_SetCorrectionFactor(b2JointId jointId, float correctionFactor) {
        b2MotorJoint_SetCorrectionFactor_internal(jointId.getPointer(), correctionFactor);
    }

    static private native void b2MotorJoint_SetCorrectionFactor_internal(long jointId, float correctionFactor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2MotorJoint_SetCorrectionFactor(*(b2JointId*)jointId, (float)correctionFactor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the motor joint correction factor, usually in [0, 1]
     */
    public static float b2MotorJoint_GetCorrectionFactor(b2JointId jointId) {
        return b2MotorJoint_GetCorrectionFactor_internal(jointId.getPointer());
    }

    static private native float b2MotorJoint_GetCorrectionFactor_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2MotorJoint_GetCorrectionFactor(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Create a mouse joint
     * @see b2MouseJointDef for details
     */
    public static b2JointId b2CreateMouseJoint(b2WorldId worldId, b2MouseJointDef.b2MouseJointDefPointer def) {
        return new b2JointId(b2CreateMouseJoint_internal(worldId.getPointer(), def.getPointer()), true);
    }

    static private native long b2CreateMouseJoint_internal(long worldId, long def);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2JointId* _ret = (b2JointId*)malloc(sizeof(b2JointId));
    	*_ret = b2CreateMouseJoint(*(b2WorldId*)worldId, (const b2MouseJointDef *)def);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the mouse joint target
     */
    public static void b2MouseJoint_SetTarget(b2JointId jointId, b2Vec2 target) {
        b2MouseJoint_SetTarget_internal(jointId.getPointer(), target.getPointer());
    }

    static private native void b2MouseJoint_SetTarget_internal(long jointId, long target);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2MouseJoint_SetTarget(*(b2JointId*)jointId, *(b2Vec2*)target);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the mouse joint target
     */
    public static b2Vec2 b2MouseJoint_GetTarget(b2JointId jointId) {
        return new b2Vec2(b2MouseJoint_GetTarget_internal(jointId.getPointer()), true);
    }

    static private native long b2MouseJoint_GetTarget_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2Vec2* _ret = (b2Vec2*)malloc(sizeof(b2Vec2));
    	*_ret = b2MouseJoint_GetTarget(*(b2JointId*)jointId);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the mouse joint spring stiffness in Hertz
     */
    public static void b2MouseJoint_SetSpringHertz(b2JointId jointId, float hertz) {
        b2MouseJoint_SetSpringHertz_internal(jointId.getPointer(), hertz);
    }

    static private native void b2MouseJoint_SetSpringHertz_internal(long jointId, float hertz);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2MouseJoint_SetSpringHertz(*(b2JointId*)jointId, (float)hertz);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the mouse joint spring stiffness in Hertz
     */
    public static float b2MouseJoint_GetSpringHertz(b2JointId jointId) {
        return b2MouseJoint_GetSpringHertz_internal(jointId.getPointer());
    }

    static private native float b2MouseJoint_GetSpringHertz_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2MouseJoint_GetSpringHertz(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the mouse joint spring damping ratio, non-dimensional
     */
    public static void b2MouseJoint_SetSpringDampingRatio(b2JointId jointId, float dampingRatio) {
        b2MouseJoint_SetSpringDampingRatio_internal(jointId.getPointer(), dampingRatio);
    }

    static private native void b2MouseJoint_SetSpringDampingRatio_internal(long jointId, float dampingRatio);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2MouseJoint_SetSpringDampingRatio(*(b2JointId*)jointId, (float)dampingRatio);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the mouse joint damping ratio, non-dimensional
     */
    public static float b2MouseJoint_GetSpringDampingRatio(b2JointId jointId) {
        return b2MouseJoint_GetSpringDampingRatio_internal(jointId.getPointer());
    }

    static private native float b2MouseJoint_GetSpringDampingRatio_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2MouseJoint_GetSpringDampingRatio(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the mouse joint maximum force, usually in newtons
     */
    public static void b2MouseJoint_SetMaxForce(b2JointId jointId, float maxForce) {
        b2MouseJoint_SetMaxForce_internal(jointId.getPointer(), maxForce);
    }

    static private native void b2MouseJoint_SetMaxForce_internal(long jointId, float maxForce);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2MouseJoint_SetMaxForce(*(b2JointId*)jointId, (float)maxForce);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the mouse joint maximum force, usually in newtons
     */
    public static float b2MouseJoint_GetMaxForce(b2JointId jointId) {
        return b2MouseJoint_GetMaxForce_internal(jointId.getPointer());
    }

    static private native float b2MouseJoint_GetMaxForce_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2MouseJoint_GetMaxForce(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Create a null joint.
     * @see b2NullJointDef for details
     */
    public static b2JointId b2CreateNullJoint(b2WorldId worldId, b2NullJointDef.b2NullJointDefPointer def) {
        return new b2JointId(b2CreateNullJoint_internal(worldId.getPointer(), def.getPointer()), true);
    }

    static private native long b2CreateNullJoint_internal(long worldId, long def);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2JointId* _ret = (b2JointId*)malloc(sizeof(b2JointId));
    	*_ret = b2CreateNullJoint(*(b2WorldId*)worldId, (const b2NullJointDef *)def);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Create a prismatic (slider) joint.
     * @see b2PrismaticJointDef for details
     */
    public static b2JointId b2CreatePrismaticJoint(b2WorldId worldId, b2PrismaticJointDef.b2PrismaticJointDefPointer def) {
        return new b2JointId(b2CreatePrismaticJoint_internal(worldId.getPointer(), def.getPointer()), true);
    }

    static private native long b2CreatePrismaticJoint_internal(long worldId, long def);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2JointId* _ret = (b2JointId*)malloc(sizeof(b2JointId));
    	*_ret = b2CreatePrismaticJoint(*(b2WorldId*)worldId, (const b2PrismaticJointDef *)def);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Enable/disable the joint spring.
     */
    public static void b2PrismaticJoint_EnableSpring(b2JointId jointId, boolean enableSpring) {
        b2PrismaticJoint_EnableSpring_internal(jointId.getPointer(), enableSpring);
    }

    static private native void b2PrismaticJoint_EnableSpring_internal(long jointId, boolean enableSpring);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, enableSpring, 1, return);
    	b2PrismaticJoint_EnableSpring(*(b2JointId*)jointId, (bool)enableSpring);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Is the prismatic joint spring enabled or not?
     */
    public static boolean b2PrismaticJoint_IsSpringEnabled(b2JointId jointId) {
        return b2PrismaticJoint_IsSpringEnabled_internal(jointId.getPointer());
    }

    static private native boolean b2PrismaticJoint_IsSpringEnabled_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2PrismaticJoint_IsSpringEnabled(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the prismatic joint stiffness in Hertz.
     * This should usually be less than a quarter of the simulation rate. For example, if the simulation
     * runs at 60Hz then the joint stiffness should be 15Hz or less.
     */
    public static void b2PrismaticJoint_SetSpringHertz(b2JointId jointId, float hertz) {
        b2PrismaticJoint_SetSpringHertz_internal(jointId.getPointer(), hertz);
    }

    static private native void b2PrismaticJoint_SetSpringHertz_internal(long jointId, float hertz);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2PrismaticJoint_SetSpringHertz(*(b2JointId*)jointId, (float)hertz);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the prismatic joint stiffness in Hertz
     */
    public static float b2PrismaticJoint_GetSpringHertz(b2JointId jointId) {
        return b2PrismaticJoint_GetSpringHertz_internal(jointId.getPointer());
    }

    static private native float b2PrismaticJoint_GetSpringHertz_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2PrismaticJoint_GetSpringHertz(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the prismatic joint damping ratio (non-dimensional)
     */
    public static void b2PrismaticJoint_SetSpringDampingRatio(b2JointId jointId, float dampingRatio) {
        b2PrismaticJoint_SetSpringDampingRatio_internal(jointId.getPointer(), dampingRatio);
    }

    static private native void b2PrismaticJoint_SetSpringDampingRatio_internal(long jointId, float dampingRatio);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2PrismaticJoint_SetSpringDampingRatio(*(b2JointId*)jointId, (float)dampingRatio);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the prismatic spring damping ratio (non-dimensional)
     */
    public static float b2PrismaticJoint_GetSpringDampingRatio(b2JointId jointId) {
        return b2PrismaticJoint_GetSpringDampingRatio_internal(jointId.getPointer());
    }

    static private native float b2PrismaticJoint_GetSpringDampingRatio_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2PrismaticJoint_GetSpringDampingRatio(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Enable/disable a prismatic joint limit
     */
    public static void b2PrismaticJoint_EnableLimit(b2JointId jointId, boolean enableLimit) {
        b2PrismaticJoint_EnableLimit_internal(jointId.getPointer(), enableLimit);
    }

    static private native void b2PrismaticJoint_EnableLimit_internal(long jointId, boolean enableLimit);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, enableLimit, 1, return);
    	b2PrismaticJoint_EnableLimit(*(b2JointId*)jointId, (bool)enableLimit);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Is the prismatic joint limit enabled?
     */
    public static boolean b2PrismaticJoint_IsLimitEnabled(b2JointId jointId) {
        return b2PrismaticJoint_IsLimitEnabled_internal(jointId.getPointer());
    }

    static private native boolean b2PrismaticJoint_IsLimitEnabled_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2PrismaticJoint_IsLimitEnabled(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the prismatic joint lower limit
     */
    public static float b2PrismaticJoint_GetLowerLimit(b2JointId jointId) {
        return b2PrismaticJoint_GetLowerLimit_internal(jointId.getPointer());
    }

    static private native float b2PrismaticJoint_GetLowerLimit_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2PrismaticJoint_GetLowerLimit(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the prismatic joint upper limit
     */
    public static float b2PrismaticJoint_GetUpperLimit(b2JointId jointId) {
        return b2PrismaticJoint_GetUpperLimit_internal(jointId.getPointer());
    }

    static private native float b2PrismaticJoint_GetUpperLimit_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2PrismaticJoint_GetUpperLimit(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the prismatic joint limits
     */
    public static void b2PrismaticJoint_SetLimits(b2JointId jointId, float lower, float upper) {
        b2PrismaticJoint_SetLimits_internal(jointId.getPointer(), lower, upper);
    }

    static private native void b2PrismaticJoint_SetLimits_internal(long jointId, float lower, float upper);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2PrismaticJoint_SetLimits(*(b2JointId*)jointId, (float)lower, (float)upper);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Enable/disable a prismatic joint motor
     */
    public static void b2PrismaticJoint_EnableMotor(b2JointId jointId, boolean enableMotor) {
        b2PrismaticJoint_EnableMotor_internal(jointId.getPointer(), enableMotor);
    }

    static private native void b2PrismaticJoint_EnableMotor_internal(long jointId, boolean enableMotor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, enableMotor, 1, return);
    	b2PrismaticJoint_EnableMotor(*(b2JointId*)jointId, (bool)enableMotor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Is the prismatic joint motor enabled?
     */
    public static boolean b2PrismaticJoint_IsMotorEnabled(b2JointId jointId) {
        return b2PrismaticJoint_IsMotorEnabled_internal(jointId.getPointer());
    }

    static private native boolean b2PrismaticJoint_IsMotorEnabled_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2PrismaticJoint_IsMotorEnabled(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the prismatic joint motor speed, usually in meters per second
     */
    public static void b2PrismaticJoint_SetMotorSpeed(b2JointId jointId, float motorSpeed) {
        b2PrismaticJoint_SetMotorSpeed_internal(jointId.getPointer(), motorSpeed);
    }

    static private native void b2PrismaticJoint_SetMotorSpeed_internal(long jointId, float motorSpeed);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2PrismaticJoint_SetMotorSpeed(*(b2JointId*)jointId, (float)motorSpeed);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the prismatic joint motor speed, usually in meters per second
     */
    public static float b2PrismaticJoint_GetMotorSpeed(b2JointId jointId) {
        return b2PrismaticJoint_GetMotorSpeed_internal(jointId.getPointer());
    }

    static private native float b2PrismaticJoint_GetMotorSpeed_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2PrismaticJoint_GetMotorSpeed(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the prismatic joint maximum motor force, usually in newtons
     */
    public static void b2PrismaticJoint_SetMaxMotorForce(b2JointId jointId, float force) {
        b2PrismaticJoint_SetMaxMotorForce_internal(jointId.getPointer(), force);
    }

    static private native void b2PrismaticJoint_SetMaxMotorForce_internal(long jointId, float force);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2PrismaticJoint_SetMaxMotorForce(*(b2JointId*)jointId, (float)force);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the prismatic joint maximum motor force, usually in newtons
     */
    public static float b2PrismaticJoint_GetMaxMotorForce(b2JointId jointId) {
        return b2PrismaticJoint_GetMaxMotorForce_internal(jointId.getPointer());
    }

    static private native float b2PrismaticJoint_GetMaxMotorForce_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2PrismaticJoint_GetMaxMotorForce(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the prismatic joint current motor force, usually in newtons
     */
    public static float b2PrismaticJoint_GetMotorForce(b2JointId jointId) {
        return b2PrismaticJoint_GetMotorForce_internal(jointId.getPointer());
    }

    static private native float b2PrismaticJoint_GetMotorForce_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2PrismaticJoint_GetMotorForce(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the current joint translation, usually in meters.
     */
    public static float b2PrismaticJoint_GetTranslation(b2JointId jointId) {
        return b2PrismaticJoint_GetTranslation_internal(jointId.getPointer());
    }

    static private native float b2PrismaticJoint_GetTranslation_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2PrismaticJoint_GetTranslation(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the current joint translation speed, usually in meters per second.
     */
    public static float b2PrismaticJoint_GetSpeed(b2JointId jointId) {
        return b2PrismaticJoint_GetSpeed_internal(jointId.getPointer());
    }

    static private native float b2PrismaticJoint_GetSpeed_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2PrismaticJoint_GetSpeed(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Create a revolute joint
     * @see b2RevoluteJointDef for details
     */
    public static b2JointId b2CreateRevoluteJoint(b2WorldId worldId, b2RevoluteJointDef.b2RevoluteJointDefPointer def) {
        return new b2JointId(b2CreateRevoluteJoint_internal(worldId.getPointer(), def.getPointer()), true);
    }

    static private native long b2CreateRevoluteJoint_internal(long worldId, long def);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2JointId* _ret = (b2JointId*)malloc(sizeof(b2JointId));
    	*_ret = b2CreateRevoluteJoint(*(b2WorldId*)worldId, (const b2RevoluteJointDef *)def);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Enable/disable the revolute joint spring
     */
    public static void b2RevoluteJoint_EnableSpring(b2JointId jointId, boolean enableSpring) {
        b2RevoluteJoint_EnableSpring_internal(jointId.getPointer(), enableSpring);
    }

    static private native void b2RevoluteJoint_EnableSpring_internal(long jointId, boolean enableSpring);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, enableSpring, 1, return);
    	b2RevoluteJoint_EnableSpring(*(b2JointId*)jointId, (bool)enableSpring);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * It the revolute angular spring enabled?
     */
    public static boolean b2RevoluteJoint_IsSpringEnabled(b2JointId jointId) {
        return b2RevoluteJoint_IsSpringEnabled_internal(jointId.getPointer());
    }

    static private native boolean b2RevoluteJoint_IsSpringEnabled_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2RevoluteJoint_IsSpringEnabled(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the revolute joint spring stiffness in Hertz
     */
    public static void b2RevoluteJoint_SetSpringHertz(b2JointId jointId, float hertz) {
        b2RevoluteJoint_SetSpringHertz_internal(jointId.getPointer(), hertz);
    }

    static private native void b2RevoluteJoint_SetSpringHertz_internal(long jointId, float hertz);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2RevoluteJoint_SetSpringHertz(*(b2JointId*)jointId, (float)hertz);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the revolute joint spring stiffness in Hertz
     */
    public static float b2RevoluteJoint_GetSpringHertz(b2JointId jointId) {
        return b2RevoluteJoint_GetSpringHertz_internal(jointId.getPointer());
    }

    static private native float b2RevoluteJoint_GetSpringHertz_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2RevoluteJoint_GetSpringHertz(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the revolute joint spring damping ratio, non-dimensional
     */
    public static void b2RevoluteJoint_SetSpringDampingRatio(b2JointId jointId, float dampingRatio) {
        b2RevoluteJoint_SetSpringDampingRatio_internal(jointId.getPointer(), dampingRatio);
    }

    static private native void b2RevoluteJoint_SetSpringDampingRatio_internal(long jointId, float dampingRatio);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2RevoluteJoint_SetSpringDampingRatio(*(b2JointId*)jointId, (float)dampingRatio);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the revolute joint spring damping ratio, non-dimensional
     */
    public static float b2RevoluteJoint_GetSpringDampingRatio(b2JointId jointId) {
        return b2RevoluteJoint_GetSpringDampingRatio_internal(jointId.getPointer());
    }

    static private native float b2RevoluteJoint_GetSpringDampingRatio_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2RevoluteJoint_GetSpringDampingRatio(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the revolute joint current angle in radians relative to the reference angle
     * @see b2RevoluteJointDef::referenceAngle
     */
    public static float b2RevoluteJoint_GetAngle(b2JointId jointId) {
        return b2RevoluteJoint_GetAngle_internal(jointId.getPointer());
    }

    static private native float b2RevoluteJoint_GetAngle_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2RevoluteJoint_GetAngle(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Enable/disable the revolute joint limit
     */
    public static void b2RevoluteJoint_EnableLimit(b2JointId jointId, boolean enableLimit) {
        b2RevoluteJoint_EnableLimit_internal(jointId.getPointer(), enableLimit);
    }

    static private native void b2RevoluteJoint_EnableLimit_internal(long jointId, boolean enableLimit);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, enableLimit, 1, return);
    	b2RevoluteJoint_EnableLimit(*(b2JointId*)jointId, (bool)enableLimit);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Is the revolute joint limit enabled?
     */
    public static boolean b2RevoluteJoint_IsLimitEnabled(b2JointId jointId) {
        return b2RevoluteJoint_IsLimitEnabled_internal(jointId.getPointer());
    }

    static private native boolean b2RevoluteJoint_IsLimitEnabled_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2RevoluteJoint_IsLimitEnabled(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the revolute joint lower limit in radians
     */
    public static float b2RevoluteJoint_GetLowerLimit(b2JointId jointId) {
        return b2RevoluteJoint_GetLowerLimit_internal(jointId.getPointer());
    }

    static private native float b2RevoluteJoint_GetLowerLimit_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2RevoluteJoint_GetLowerLimit(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the revolute joint upper limit in radians
     */
    public static float b2RevoluteJoint_GetUpperLimit(b2JointId jointId) {
        return b2RevoluteJoint_GetUpperLimit_internal(jointId.getPointer());
    }

    static private native float b2RevoluteJoint_GetUpperLimit_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2RevoluteJoint_GetUpperLimit(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the revolute joint limits in radians
     */
    public static void b2RevoluteJoint_SetLimits(b2JointId jointId, float lower, float upper) {
        b2RevoluteJoint_SetLimits_internal(jointId.getPointer(), lower, upper);
    }

    static private native void b2RevoluteJoint_SetLimits_internal(long jointId, float lower, float upper);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2RevoluteJoint_SetLimits(*(b2JointId*)jointId, (float)lower, (float)upper);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Enable/disable a revolute joint motor
     */
    public static void b2RevoluteJoint_EnableMotor(b2JointId jointId, boolean enableMotor) {
        b2RevoluteJoint_EnableMotor_internal(jointId.getPointer(), enableMotor);
    }

    static private native void b2RevoluteJoint_EnableMotor_internal(long jointId, boolean enableMotor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, enableMotor, 1, return);
    	b2RevoluteJoint_EnableMotor(*(b2JointId*)jointId, (bool)enableMotor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Is the revolute joint motor enabled?
     */
    public static boolean b2RevoluteJoint_IsMotorEnabled(b2JointId jointId) {
        return b2RevoluteJoint_IsMotorEnabled_internal(jointId.getPointer());
    }

    static private native boolean b2RevoluteJoint_IsMotorEnabled_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2RevoluteJoint_IsMotorEnabled(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the revolute joint motor speed in radians per second
     */
    public static void b2RevoluteJoint_SetMotorSpeed(b2JointId jointId, float motorSpeed) {
        b2RevoluteJoint_SetMotorSpeed_internal(jointId.getPointer(), motorSpeed);
    }

    static private native void b2RevoluteJoint_SetMotorSpeed_internal(long jointId, float motorSpeed);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2RevoluteJoint_SetMotorSpeed(*(b2JointId*)jointId, (float)motorSpeed);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the revolute joint motor speed in radians per second
     */
    public static float b2RevoluteJoint_GetMotorSpeed(b2JointId jointId) {
        return b2RevoluteJoint_GetMotorSpeed_internal(jointId.getPointer());
    }

    static private native float b2RevoluteJoint_GetMotorSpeed_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2RevoluteJoint_GetMotorSpeed(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the revolute joint current motor torque, usually in newton-meters
     */
    public static float b2RevoluteJoint_GetMotorTorque(b2JointId jointId) {
        return b2RevoluteJoint_GetMotorTorque_internal(jointId.getPointer());
    }

    static private native float b2RevoluteJoint_GetMotorTorque_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2RevoluteJoint_GetMotorTorque(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the revolute joint maximum motor torque, usually in newton-meters
     */
    public static void b2RevoluteJoint_SetMaxMotorTorque(b2JointId jointId, float torque) {
        b2RevoluteJoint_SetMaxMotorTorque_internal(jointId.getPointer(), torque);
    }

    static private native void b2RevoluteJoint_SetMaxMotorTorque_internal(long jointId, float torque);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2RevoluteJoint_SetMaxMotorTorque(*(b2JointId*)jointId, (float)torque);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the revolute joint maximum motor torque, usually in newton-meters
     */
    public static float b2RevoluteJoint_GetMaxMotorTorque(b2JointId jointId) {
        return b2RevoluteJoint_GetMaxMotorTorque_internal(jointId.getPointer());
    }

    static private native float b2RevoluteJoint_GetMaxMotorTorque_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2RevoluteJoint_GetMaxMotorTorque(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Create a weld joint
     * @see b2WeldJointDef for details
     */
    public static b2JointId b2CreateWeldJoint(b2WorldId worldId, b2WeldJointDef.b2WeldJointDefPointer def) {
        return new b2JointId(b2CreateWeldJoint_internal(worldId.getPointer(), def.getPointer()), true);
    }

    static private native long b2CreateWeldJoint_internal(long worldId, long def);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2JointId* _ret = (b2JointId*)malloc(sizeof(b2JointId));
    	*_ret = b2CreateWeldJoint(*(b2WorldId*)worldId, (const b2WeldJointDef *)def);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the weld joint reference angle in radians
     */
    public static float b2WeldJoint_GetReferenceAngle(b2JointId jointId) {
        return b2WeldJoint_GetReferenceAngle_internal(jointId.getPointer());
    }

    static private native float b2WeldJoint_GetReferenceAngle_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2WeldJoint_GetReferenceAngle(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the weld joint reference angle in radians, must be in [-pi,pi].
     */
    public static void b2WeldJoint_SetReferenceAngle(b2JointId jointId, float angleInRadians) {
        b2WeldJoint_SetReferenceAngle_internal(jointId.getPointer(), angleInRadians);
    }

    static private native void b2WeldJoint_SetReferenceAngle_internal(long jointId, float angleInRadians);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2WeldJoint_SetReferenceAngle(*(b2JointId*)jointId, (float)angleInRadians);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Set the weld joint linear stiffness in Hertz. 0 is rigid.
     */
    public static void b2WeldJoint_SetLinearHertz(b2JointId jointId, float hertz) {
        b2WeldJoint_SetLinearHertz_internal(jointId.getPointer(), hertz);
    }

    static private native void b2WeldJoint_SetLinearHertz_internal(long jointId, float hertz);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2WeldJoint_SetLinearHertz(*(b2JointId*)jointId, (float)hertz);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the weld joint linear stiffness in Hertz
     */
    public static float b2WeldJoint_GetLinearHertz(b2JointId jointId) {
        return b2WeldJoint_GetLinearHertz_internal(jointId.getPointer());
    }

    static private native float b2WeldJoint_GetLinearHertz_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2WeldJoint_GetLinearHertz(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the weld joint linear damping ratio (non-dimensional)
     */
    public static void b2WeldJoint_SetLinearDampingRatio(b2JointId jointId, float dampingRatio) {
        b2WeldJoint_SetLinearDampingRatio_internal(jointId.getPointer(), dampingRatio);
    }

    static private native void b2WeldJoint_SetLinearDampingRatio_internal(long jointId, float dampingRatio);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2WeldJoint_SetLinearDampingRatio(*(b2JointId*)jointId, (float)dampingRatio);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the weld joint linear damping ratio (non-dimensional)
     */
    public static float b2WeldJoint_GetLinearDampingRatio(b2JointId jointId) {
        return b2WeldJoint_GetLinearDampingRatio_internal(jointId.getPointer());
    }

    static private native float b2WeldJoint_GetLinearDampingRatio_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2WeldJoint_GetLinearDampingRatio(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the weld joint angular stiffness in Hertz. 0 is rigid.
     */
    public static void b2WeldJoint_SetAngularHertz(b2JointId jointId, float hertz) {
        b2WeldJoint_SetAngularHertz_internal(jointId.getPointer(), hertz);
    }

    static private native void b2WeldJoint_SetAngularHertz_internal(long jointId, float hertz);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2WeldJoint_SetAngularHertz(*(b2JointId*)jointId, (float)hertz);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the weld joint angular stiffness in Hertz
     */
    public static float b2WeldJoint_GetAngularHertz(b2JointId jointId) {
        return b2WeldJoint_GetAngularHertz_internal(jointId.getPointer());
    }

    static private native float b2WeldJoint_GetAngularHertz_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2WeldJoint_GetAngularHertz(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set weld joint angular damping ratio, non-dimensional
     */
    public static void b2WeldJoint_SetAngularDampingRatio(b2JointId jointId, float dampingRatio) {
        b2WeldJoint_SetAngularDampingRatio_internal(jointId.getPointer(), dampingRatio);
    }

    static private native void b2WeldJoint_SetAngularDampingRatio_internal(long jointId, float dampingRatio);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2WeldJoint_SetAngularDampingRatio(*(b2JointId*)jointId, (float)dampingRatio);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the weld joint angular damping ratio, non-dimensional
     */
    public static float b2WeldJoint_GetAngularDampingRatio(b2JointId jointId) {
        return b2WeldJoint_GetAngularDampingRatio_internal(jointId.getPointer());
    }

    static private native float b2WeldJoint_GetAngularDampingRatio_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2WeldJoint_GetAngularDampingRatio(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Create a wheel joint
     * @see b2WheelJointDef for details
     */
    public static b2JointId b2CreateWheelJoint(b2WorldId worldId, b2WheelJointDef.b2WheelJointDefPointer def) {
        return new b2JointId(b2CreateWheelJoint_internal(worldId.getPointer(), def.getPointer()), true);
    }

    static private native long b2CreateWheelJoint_internal(long worldId, long def);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2JointId* _ret = (b2JointId*)malloc(sizeof(b2JointId));
    	*_ret = b2CreateWheelJoint(*(b2WorldId*)worldId, (const b2WheelJointDef *)def);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Enable/disable the wheel joint spring
     */
    public static void b2WheelJoint_EnableSpring(b2JointId jointId, boolean enableSpring) {
        b2WheelJoint_EnableSpring_internal(jointId.getPointer(), enableSpring);
    }

    static private native void b2WheelJoint_EnableSpring_internal(long jointId, boolean enableSpring);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, enableSpring, 1, return);
    	b2WheelJoint_EnableSpring(*(b2JointId*)jointId, (bool)enableSpring);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Is the wheel joint spring enabled?
     */
    public static boolean b2WheelJoint_IsSpringEnabled(b2JointId jointId) {
        return b2WheelJoint_IsSpringEnabled_internal(jointId.getPointer());
    }

    static private native boolean b2WheelJoint_IsSpringEnabled_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2WheelJoint_IsSpringEnabled(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the wheel joint stiffness in Hertz
     */
    public static void b2WheelJoint_SetSpringHertz(b2JointId jointId, float hertz) {
        b2WheelJoint_SetSpringHertz_internal(jointId.getPointer(), hertz);
    }

    static private native void b2WheelJoint_SetSpringHertz_internal(long jointId, float hertz);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2WheelJoint_SetSpringHertz(*(b2JointId*)jointId, (float)hertz);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the wheel joint stiffness in Hertz
     */
    public static float b2WheelJoint_GetSpringHertz(b2JointId jointId) {
        return b2WheelJoint_GetSpringHertz_internal(jointId.getPointer());
    }

    static private native float b2WheelJoint_GetSpringHertz_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2WheelJoint_GetSpringHertz(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the wheel joint damping ratio, non-dimensional
     */
    public static void b2WheelJoint_SetSpringDampingRatio(b2JointId jointId, float dampingRatio) {
        b2WheelJoint_SetSpringDampingRatio_internal(jointId.getPointer(), dampingRatio);
    }

    static private native void b2WheelJoint_SetSpringDampingRatio_internal(long jointId, float dampingRatio);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2WheelJoint_SetSpringDampingRatio(*(b2JointId*)jointId, (float)dampingRatio);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the wheel joint damping ratio, non-dimensional
     */
    public static float b2WheelJoint_GetSpringDampingRatio(b2JointId jointId) {
        return b2WheelJoint_GetSpringDampingRatio_internal(jointId.getPointer());
    }

    static private native float b2WheelJoint_GetSpringDampingRatio_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2WheelJoint_GetSpringDampingRatio(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Enable/disable the wheel joint limit
     */
    public static void b2WheelJoint_EnableLimit(b2JointId jointId, boolean enableLimit) {
        b2WheelJoint_EnableLimit_internal(jointId.getPointer(), enableLimit);
    }

    static private native void b2WheelJoint_EnableLimit_internal(long jointId, boolean enableLimit);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, enableLimit, 1, return);
    	b2WheelJoint_EnableLimit(*(b2JointId*)jointId, (bool)enableLimit);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Is the wheel joint limit enabled?
     */
    public static boolean b2WheelJoint_IsLimitEnabled(b2JointId jointId) {
        return b2WheelJoint_IsLimitEnabled_internal(jointId.getPointer());
    }

    static private native boolean b2WheelJoint_IsLimitEnabled_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2WheelJoint_IsLimitEnabled(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the wheel joint lower limit
     */
    public static float b2WheelJoint_GetLowerLimit(b2JointId jointId) {
        return b2WheelJoint_GetLowerLimit_internal(jointId.getPointer());
    }

    static private native float b2WheelJoint_GetLowerLimit_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2WheelJoint_GetLowerLimit(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the wheel joint upper limit
     */
    public static float b2WheelJoint_GetUpperLimit(b2JointId jointId) {
        return b2WheelJoint_GetUpperLimit_internal(jointId.getPointer());
    }

    static private native float b2WheelJoint_GetUpperLimit_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2WheelJoint_GetUpperLimit(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the wheel joint limits
     */
    public static void b2WheelJoint_SetLimits(b2JointId jointId, float lower, float upper) {
        b2WheelJoint_SetLimits_internal(jointId.getPointer(), lower, upper);
    }

    static private native void b2WheelJoint_SetLimits_internal(long jointId, float lower, float upper);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2WheelJoint_SetLimits(*(b2JointId*)jointId, (float)lower, (float)upper);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Enable/disable the wheel joint motor
     */
    public static void b2WheelJoint_EnableMotor(b2JointId jointId, boolean enableMotor) {
        b2WheelJoint_EnableMotor_internal(jointId.getPointer(), enableMotor);
    }

    static private native void b2WheelJoint_EnableMotor_internal(long jointId, boolean enableMotor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, bool, enableMotor, 1, return);
    	b2WheelJoint_EnableMotor(*(b2JointId*)jointId, (bool)enableMotor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Is the wheel joint motor enabled?
     */
    public static boolean b2WheelJoint_IsMotorEnabled(b2JointId jointId) {
        return b2WheelJoint_IsMotorEnabled_internal(jointId.getPointer());
    }

    static private native boolean b2WheelJoint_IsMotorEnabled_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jboolean)b2WheelJoint_IsMotorEnabled(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the wheel joint motor speed in radians per second
     */
    public static void b2WheelJoint_SetMotorSpeed(b2JointId jointId, float motorSpeed) {
        b2WheelJoint_SetMotorSpeed_internal(jointId.getPointer(), motorSpeed);
    }

    static private native void b2WheelJoint_SetMotorSpeed_internal(long jointId, float motorSpeed);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2WheelJoint_SetMotorSpeed(*(b2JointId*)jointId, (float)motorSpeed);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the wheel joint motor speed in radians per second
     */
    public static float b2WheelJoint_GetMotorSpeed(b2JointId jointId) {
        return b2WheelJoint_GetMotorSpeed_internal(jointId.getPointer());
    }

    static private native float b2WheelJoint_GetMotorSpeed_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2WheelJoint_GetMotorSpeed(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Set the wheel joint maximum motor torque, usually in newton-meters
     */
    public static void b2WheelJoint_SetMaxMotorTorque(b2JointId jointId, float torque) {
        b2WheelJoint_SetMaxMotorTorque_internal(jointId.getPointer(), torque);
    }

    static private native void b2WheelJoint_SetMaxMotorTorque_internal(long jointId, float torque);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	b2WheelJoint_SetMaxMotorTorque(*(b2JointId*)jointId, (float)torque);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    /**
     * Get the wheel joint maximum motor torque, usually in newton-meters
     */
    public static float b2WheelJoint_GetMaxMotorTorque(b2JointId jointId) {
        return b2WheelJoint_GetMaxMotorTorque_internal(jointId.getPointer());
    }

    static private native float b2WheelJoint_GetMaxMotorTorque_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2WheelJoint_GetMaxMotorTorque(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * Get the wheel joint current motor torque, usually in newton-meters
     */
    public static float b2WheelJoint_GetMotorTorque(b2JointId jointId) {
        return b2WheelJoint_GetMotorTorque_internal(jointId.getPointer());
    }

    static private native float b2WheelJoint_GetMotorTorque_internal(long jointId);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)b2WheelJoint_GetMotorTorque(*(b2JointId*)jointId);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public interface b2OverlapResultFcn extends Closure, b2OverlapResultFcn_Internal {

        /**
         * Prototype callback for overlap queries.
         * Called for each shape found in the query.
         * @see Box2d#b2World_OverlapAABB
         * @return false to terminate the query.
         * @ingroup world
         */
        boolean b2OverlapResultFcn_call(b2ShapeId shapeId, VoidPointer context);
    }

    public interface b2TreeQueryCallbackFcn extends Closure, b2TreeQueryCallbackFcn_Internal {

        /**
         * This function receives proxies found in the AABB query.
         * @return true if the query should continue
         */
        boolean b2TreeQueryCallbackFcn_call(int proxyId, int userData, VoidPointer context);
    }

    public interface b2TaskCallback extends Closure, b2TaskCallback_Internal {

        /**
         * Task interface
         * This is prototype for a Box2D task. Your task system is expected to invoke the Box2D task with these arguments.
         * The task spans a range of the parallel-for: [startIndex, endIndex)
         * The worker index must correctly identify each worker in the user thread pool, expected in [0, workerCount).
         * A worker must only exist on only one thread at a time and is analogous to the thread index.
         * The task context is the context pointer sent from Box2D when it is enqueued.
         * The startIndex and endIndex are expected in the range [0, itemCount) where itemCount is the argument to b2EnqueueTaskCallback
         * below. Box2D expects startIndex < endIndex and will execute a loop like this:
         *
         * @code{.c}
         * for (int i = startIndex; i < endIndex; ++i)
         * {
         * 	DoWork();
         * }
         * @endcode
         * @ingroup world
         */
        void b2TaskCallback_call(int startIndex, int endIndex, long workerIndex, VoidPointer taskContext);
    }

    public interface b2EnqueueTaskCallback extends Closure, b2EnqueueTaskCallback_Internal {

        /**
         * Function to spawn tasks
         */
        VoidPointer b2EnqueueTaskCallback_call(ClosureObject<b2TaskCallback> task, int itemCount, int minRange, VoidPointer taskContext, VoidPointer userContext);
    }

    public interface b2CastResultFcn extends Closure, b2CastResultFcn_Internal {

        /**
         * Prototype callback for ray casts.
         * Called for each shape found in the query. You control how the ray cast
         * proceeds by returning a float:
         * return -1: ignore this shape and continue
         * return 0: terminate the ray cast
         * return fraction: clip the ray to this point
         * return 1: don't clip the ray and continue
         * @param shapeId the shape hit by the ray
         * @param point the point of initial intersection
         * @param normal the normal vector at the point of intersection
         * @param fraction the fraction along the ray at the point of intersection
         * @param context the user context
         * @return -1 to filter, 0 to terminate, fraction to clip the ray for closest hit, 1 to continue
         * @see Box2d#b2World_CastRay
         * @ingroup world
         */
        float b2CastResultFcn_call(b2ShapeId shapeId, b2Vec2 point, b2Vec2 normal, float fraction, VoidPointer context);
    }

    public interface b2TreeShapeCastCallbackFcn extends Closure, b2TreeShapeCastCallbackFcn_Internal {

        /**
         * This function receives clipped ray cast input for a proxy. The function
         * returns the new ray fraction.
         * - return a value of 0 to terminate the ray cast
         * - return a value less than input->maxFraction to clip the ray
         * - return a value of input->maxFraction to continue the ray cast without clipping
         */
        float b2TreeShapeCastCallbackFcn_call(b2ShapeCastInput.b2ShapeCastInputPointer input, int proxyId, int userData, VoidPointer context);
    }

    public interface b2PreSolveFcn extends Closure, b2PreSolveFcn_Internal {

        /**
         * Prototype for a pre-solve callback.
         * This is called after a contact is updated. This allows you to inspect a
         * contact before it goes to the solver. If you are careful, you can modify the
         * contact manifold (e.g. modify the normal).
         * Notes:
         * - this function must be thread-safe
         * - this is only called if the shape has enabled pre-solve events
         * - this is called only for awake dynamic bodies
         * - this is not called for sensors
         * - the supplied manifold has impulse values from the previous step
         * Return false if you want to disable the contact this step
         * @warning Do not attempt to modify the world inside this callback
         * @ingroup world
         */
        boolean b2PreSolveFcn_call(b2ShapeId shapeIdA, b2ShapeId shapeIdB, b2Manifold.b2ManifoldPointer manifold, VoidPointer context);
    }

    public interface b2AllocFcn extends Closure, b2AllocFcn_Internal {

        /**
         * Prototype for user allocation function
         * @param size the allocation size in bytes
         * @param alignment the required alignment, guaranteed to be a power of 2
         */
        VoidPointer b2AllocFcn_call(long size, int alignment);
    }

    public interface b2AssertFcn extends Closure, b2AssertFcn_Internal {

        /**
         * Prototype for the user assert callback. Return 0 to skip the debugger break.
         */
        int b2AssertFcn_call(CSizedIntPointer condition, CSizedIntPointer fileName, int lineNumber);
    }

    public interface b2CustomFilterFcn extends Closure, b2CustomFilterFcn_Internal {

        /**
         * Prototype for a contact filter callback.
         * This is called when a contact pair is considered for collision. This allows you to
         * perform custom logic to prevent collision between shapes. This is only called if
         * one of the two shapes has custom filtering enabled.
         * Notes:
         * - this function must be thread-safe
         * - this is only called if one of the two shapes has enabled custom filtering
         * - this is called only for awake dynamic bodies
         * Return false if you want to disable the collision
         * @see b2ShapeDef
         * @warning Do not attempt to modify the world inside this callback
         * @ingroup world
         */
        boolean b2CustomFilterFcn_call(b2ShapeId shapeIdA, b2ShapeId shapeIdB, VoidPointer context);
    }

    public interface b2TreeRayCastCallbackFcn extends Closure, b2TreeRayCastCallbackFcn_Internal {

        /**
         * This function receives clipped ray cast input for a proxy. The function
         * returns the new ray fraction.
         * - return a value of 0 to terminate the ray cast
         * - return a value less than input->maxFraction to clip the ray
         * - return a value of input->maxFraction to continue the ray cast without clipping
         */
        float b2TreeRayCastCallbackFcn_call(b2RayCastInput.b2RayCastInputPointer input, int proxyId, int userData, VoidPointer context);
    }

    public interface b2FreeFcn extends Closure, b2FreeFcn_Internal {

        /**
         * Prototype for user free function
         * @param mem the memory previously allocated through `b2AllocFcn`
         */
        void b2FreeFcn_call(VoidPointer mem);
    }

    public interface b2FinishTaskCallback extends Closure, b2FinishTaskCallback_Internal {

        /**
         * Function to finish a task
         */
        void b2FinishTaskCallback_call(VoidPointer userTask, VoidPointer userContext);
    }
}
