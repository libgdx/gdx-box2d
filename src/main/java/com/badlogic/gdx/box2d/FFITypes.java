package com.badlogic.gdx.box2d;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.c.CTypeInfo;
import java.util.HashMap;

public class FFITypes {

    /*JNI
		#include <jnigen.h>
		#include <box2d/box2d.h>
*/
    public static void init() {
    }

    private final static HashMap<Integer, CTypeInfo> ffiIdMap = new HashMap<>();

    public static CTypeInfo getCTypeInfo(int id) {
        return ffiIdMap.get(id);
    }

    /*JNI
static native_type* getNativeType(int id) {
native_type* nativeType = (native_type*)malloc(sizeof(native_type));
switch(id) {
	case -2:
		nativeType->type = VOID_TYPE;
		return nativeType;
	case -1:
		nativeType->type = POINTER_TYPE;
		return nativeType;
	case 0:
		GET_NATIVE_TYPE(bool, nativeType);
		return nativeType;
	case 1:
		GET_NATIVE_TYPE(const char, nativeType);
		return nativeType;
	case 2:
		GET_NATIVE_TYPE(const uint8_t, nativeType);
		return nativeType;
	case 3:
		GET_NATIVE_TYPE(float, nativeType);
		return nativeType;
	case 4:
		GET_NATIVE_TYPE(int, nativeType);
		return nativeType;
	case 5:
		GET_NATIVE_TYPE(int32_t, nativeType);
		return nativeType;
	case 6:
		GET_NATIVE_TYPE(uint16_t, nativeType);
		return nativeType;
	case 7:
		GET_NATIVE_TYPE(uint32_t, nativeType);
		return nativeType;
	case 8:
		GET_NATIVE_TYPE(uint64_t, nativeType);
		return nativeType;
	case 9:
		GET_NATIVE_TYPE(uint8_t, nativeType);
		return nativeType;
	case 10:
		GET_NATIVE_TYPE(unsigned int, nativeType);
		return nativeType;
	case 11:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 2;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 2);
		nativeType->fields[0] = getNativeType(72);
		nativeType->fields[1] = getNativeType(72);
		return nativeType;
	case 12:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 18;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 18);
		nativeType->fields[0] = getNativeType(4);
		nativeType->fields[1] = getNativeType(72);
		nativeType->fields[2] = getNativeType(52);
		nativeType->fields[3] = getNativeType(72);
		nativeType->fields[4] = getNativeType(3);
		nativeType->fields[5] = getNativeType(3);
		nativeType->fields[6] = getNativeType(3);
		nativeType->fields[7] = getNativeType(3);
		nativeType->fields[8] = getNativeType(3);
		nativeType->fields[9] = getNativeType(-1);
		nativeType->fields[10] = getNativeType(-1);
		nativeType->fields[11] = getNativeType(0);
		nativeType->fields[12] = getNativeType(0);
		nativeType->fields[13] = getNativeType(0);
		nativeType->fields[14] = getNativeType(0);
		nativeType->fields[15] = getNativeType(0);
		nativeType->fields[16] = getNativeType(0);
		nativeType->fields[17] = getNativeType(4);
		return nativeType;
	case 13:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 2;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 2);
		nativeType->fields[0] = getNativeType(-1);
		nativeType->fields[1] = getNativeType(4);
		return nativeType;
	case 14:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 3;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 3);
		nativeType->fields[0] = getNativeType(5);
		nativeType->fields[1] = getNativeType(6);
		nativeType->fields[2] = getNativeType(6);
		return nativeType;
	case 15:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 4;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 4);
		nativeType->fields[0] = getNativeType(69);
		nativeType->fields[1] = getNativeType(14);
		nativeType->fields[2] = getNativeType(-1);
		nativeType->fields[3] = getNativeType(0);
		return nativeType;
	case 16:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 3;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 3);
		nativeType->fields[0] = getNativeType(72);
		nativeType->fields[1] = getNativeType(72);
		nativeType->fields[2] = getNativeType(3);
		return nativeType;
	case 17:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 5;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 5);
		nativeType->fields[0] = getNativeType(72);
		nativeType->fields[1] = getNativeType(72);
		nativeType->fields[2] = getNativeType(3);
		nativeType->fields[3] = getNativeType(4);
		nativeType->fields[4] = getNativeType(0);
		return nativeType;
	case 18:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 10;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 10);
		nativeType->fields[0] = getNativeType(-1);
		nativeType->fields[1] = getNativeType(-1);
		nativeType->fields[2] = getNativeType(4);
		nativeType->fields[3] = getNativeType(3);
		nativeType->fields[4] = getNativeType(3);
		nativeType->fields[5] = getNativeType(35);
		nativeType->fields[6] = getNativeType(7);
		nativeType->fields[7] = getNativeType(0);
		nativeType->fields[8] = getNativeType(0);
		nativeType->fields[9] = getNativeType(4);
		return nativeType;
	case 19:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 3;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 3);
		nativeType->fields[0] = getNativeType(5);
		nativeType->fields[1] = getNativeType(6);
		nativeType->fields[2] = getNativeType(6);
		return nativeType;
	case 20:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 4;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 4);
		nativeType->fields[0] = getNativeType(72);
		nativeType->fields[1] = getNativeType(53);
		nativeType->fields[2] = getNativeType(72);
		nativeType->fields[3] = getNativeType(4);
		return nativeType;
	case 21:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 2;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 2);
		nativeType->fields[0] = getNativeType(72);
		nativeType->fields[1] = getNativeType(3);
		return nativeType;
	case 22:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 3;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 3);
		nativeType->fields[0] = getNativeType(61);
		nativeType->fields[1] = getNativeType(61);
		nativeType->fields[2] = getNativeType(38);
		return nativeType;
	case 23:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 3;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 3);
		nativeType->fields[0] = getNativeType(61);
		nativeType->fields[1] = getNativeType(61);
		nativeType->fields[2] = getNativeType(38);
		return nativeType;
	case 24:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 2;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 2);
		nativeType->fields[0] = getNativeType(61);
		nativeType->fields[1] = getNativeType(61);
		return nativeType;
	case 25:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 6;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 6);
		nativeType->fields[0] = getNativeType(-1);
		nativeType->fields[1] = getNativeType(-1);
		nativeType->fields[2] = getNativeType(-1);
		nativeType->fields[3] = getNativeType(4);
		nativeType->fields[4] = getNativeType(4);
		nativeType->fields[5] = getNativeType(4);
		return nativeType;
	case 26:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 5;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 5);
		nativeType->fields[0] = getNativeType(61);
		nativeType->fields[1] = getNativeType(61);
		nativeType->fields[2] = getNativeType(72);
		nativeType->fields[3] = getNativeType(72);
		nativeType->fields[4] = getNativeType(3);
		return nativeType;
	case 27:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 2;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 2);
		nativeType->fields[0] = getNativeType(3);
		nativeType->fields[1] = getNativeType(3);
		return nativeType;
	case 28:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 22;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 22);
		nativeType->fields[0] = getNativeType(4);
		nativeType->fields[1] = getNativeType(4);
		nativeType->fields[2] = getNativeType(4);
		nativeType->fields[3] = getNativeType(4);
		nativeType->fields[4] = getNativeType(4);
		nativeType->fields[5] = getNativeType(4);
		nativeType->fields[6] = getNativeType(4);
		nativeType->fields[7] = getNativeType(4);
		nativeType->fields[8] = getNativeType(4);
		nativeType->fields[9] = getNativeType(4);
		nativeType->fields[10] = getNativeType(4);
		nativeType->fields[11] = getNativeType(4);
		nativeType->fields[12] = getNativeType(4);
		nativeType->fields[13] = getNativeType(4);
		nativeType->fields[14] = getNativeType(4);
		nativeType->fields[15] = getNativeType(4);
		nativeType->fields[16] = getNativeType(4);
		nativeType->fields[17] = getNativeType(4);
		nativeType->fields[18] = getNativeType(4);
		nativeType->fields[19] = getNativeType(4);
		nativeType->fields[20] = getNativeType(4);
		nativeType->fields[21] = getNativeType(4);
		return nativeType;
	case 29:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 23;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 23);
		nativeType->fields[0] = getNativeType(-1);
		nativeType->fields[1] = getNativeType(-1);
		nativeType->fields[2] = getNativeType(-1);
		nativeType->fields[3] = getNativeType(-1);
		nativeType->fields[4] = getNativeType(-1);
		nativeType->fields[5] = getNativeType(-1);
		nativeType->fields[6] = getNativeType(-1);
		nativeType->fields[7] = getNativeType(-1);
		nativeType->fields[8] = getNativeType(-1);
		nativeType->fields[9] = getNativeType(11);
		nativeType->fields[10] = getNativeType(0);
		nativeType->fields[11] = getNativeType(0);
		nativeType->fields[12] = getNativeType(0);
		nativeType->fields[13] = getNativeType(0);
		nativeType->fields[14] = getNativeType(0);
		nativeType->fields[15] = getNativeType(0);
		nativeType->fields[16] = getNativeType(0);
		nativeType->fields[17] = getNativeType(0);
		nativeType->fields[18] = getNativeType(0);
		nativeType->fields[19] = getNativeType(0);
		nativeType->fields[20] = getNativeType(0);
		nativeType->fields[21] = getNativeType(0);
		nativeType->fields[22] = getNativeType(-1);
		return nativeType;
	case 30:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 5;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 5);
		nativeType->fields[0] = getNativeType(62);
		nativeType->fields[1] = getNativeType(62);
		nativeType->fields[2] = getNativeType(69);
		nativeType->fields[3] = getNativeType(69);
		nativeType->fields[4] = getNativeType(0);
		return nativeType;
	case 31:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 17;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 17);
		nativeType->fields[0] = getNativeType(14);
		nativeType->fields[1] = getNativeType(14);
		nativeType->fields[2] = getNativeType(72);
		nativeType->fields[3] = getNativeType(72);
		nativeType->fields[4] = getNativeType(3);
		nativeType->fields[5] = getNativeType(0);
		nativeType->fields[6] = getNativeType(3);
		nativeType->fields[7] = getNativeType(3);
		nativeType->fields[8] = getNativeType(0);
		nativeType->fields[9] = getNativeType(3);
		nativeType->fields[10] = getNativeType(3);
		nativeType->fields[11] = getNativeType(0);
		nativeType->fields[12] = getNativeType(3);
		nativeType->fields[13] = getNativeType(3);
		nativeType->fields[14] = getNativeType(0);
		nativeType->fields[15] = getNativeType(-1);
		nativeType->fields[16] = getNativeType(4);
		return nativeType;
	case 32:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 5;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 5);
		nativeType->fields[0] = getNativeType(72);
		nativeType->fields[1] = getNativeType(72);
		nativeType->fields[2] = getNativeType(3);
		nativeType->fields[3] = getNativeType(4);
		nativeType->fields[4] = getNativeType(4);
		return nativeType;
	case 33:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 11;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 11);
		nativeType->fields[0] = getNativeType(-1);
		nativeType->fields[1] = getNativeType(4);
		nativeType->fields[2] = getNativeType(4);
		nativeType->fields[3] = getNativeType(4);
		nativeType->fields[4] = getNativeType(4);
		nativeType->fields[5] = getNativeType(4);
		nativeType->fields[6] = getNativeType(-1);
		nativeType->fields[7] = getNativeType(-1);
		nativeType->fields[8] = getNativeType(-1);
		nativeType->fields[9] = getNativeType(-1);
		nativeType->fields[10] = getNativeType(4);
		return nativeType;
	case 34:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 5;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 5);
		nativeType->fields[0] = getNativeType(8);
		nativeType->fields[1] = getNativeType(72);
		nativeType->fields[2] = getNativeType(3);
		nativeType->fields[3] = getNativeType(3);
		nativeType->fields[4] = getNativeType(3);
		return nativeType;
	case 35:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 3;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 3);
		nativeType->fields[0] = getNativeType(8);
		nativeType->fields[1] = getNativeType(8);
		nativeType->fields[2] = getNativeType(4);
		return nativeType;
	case 36:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 9;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 9);
		nativeType->fields[0] = getNativeType(72);
		nativeType->fields[1] = getNativeType(72);
		nativeType->fields[2] = getNativeType(72);
		nativeType->fields[3] = getNativeType(72);
		nativeType->fields[4] = getNativeType(72);
		nativeType->fields[5] = getNativeType(72);
		nativeType->fields[6] = getNativeType(72);
		nativeType->fields[7] = getNativeType(72);
		nativeType->fields[8] = getNativeType(4);
		return nativeType;
	case 37:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 3;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 3);
		nativeType->fields[0] = getNativeType(5);
		nativeType->fields[1] = getNativeType(6);
		nativeType->fields[2] = getNativeType(6);
		return nativeType;
	case 38:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 4;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 4);
		nativeType->fields[0] = getNativeType(39);
		nativeType->fields[1] = getNativeType(39);
		nativeType->fields[2] = getNativeType(72);
		nativeType->fields[3] = getNativeType(4);
		return nativeType;
	case 39:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 10;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 10);
		nativeType->fields[0] = getNativeType(72);
		nativeType->fields[1] = getNativeType(72);
		nativeType->fields[2] = getNativeType(72);
		nativeType->fields[3] = getNativeType(3);
		nativeType->fields[4] = getNativeType(3);
		nativeType->fields[5] = getNativeType(3);
		nativeType->fields[6] = getNativeType(3);
		nativeType->fields[7] = getNativeType(3);
		nativeType->fields[8] = getNativeType(6);
		nativeType->fields[9] = getNativeType(0);
		return nativeType;
	case 40:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 3;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 3);
		nativeType->fields[0] = getNativeType(3);
		nativeType->fields[1] = getNativeType(72);
		nativeType->fields[2] = getNativeType(3);
		return nativeType;
	case 41:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 2;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 2);
		nativeType->fields[0] = getNativeType(72);
		nativeType->fields[1] = getNativeType(72);
		return nativeType;
	case 42:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 10;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 10);
		nativeType->fields[0] = getNativeType(14);
		nativeType->fields[1] = getNativeType(14);
		nativeType->fields[2] = getNativeType(72);
		nativeType->fields[3] = getNativeType(3);
		nativeType->fields[4] = getNativeType(3);
		nativeType->fields[5] = getNativeType(3);
		nativeType->fields[6] = getNativeType(3);
		nativeType->fields[7] = getNativeType(0);
		nativeType->fields[8] = getNativeType(-1);
		nativeType->fields[9] = getNativeType(4);
		return nativeType;
	case 43:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 9;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 9);
		nativeType->fields[0] = getNativeType(14);
		nativeType->fields[1] = getNativeType(14);
		nativeType->fields[2] = getNativeType(72);
		nativeType->fields[3] = getNativeType(3);
		nativeType->fields[4] = getNativeType(3);
		nativeType->fields[5] = getNativeType(3);
		nativeType->fields[6] = getNativeType(0);
		nativeType->fields[7] = getNativeType(-1);
		nativeType->fields[8] = getNativeType(4);
		return nativeType;
	case 44:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 4;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 4);
		nativeType->fields[0] = getNativeType(14);
		nativeType->fields[1] = getNativeType(14);
		nativeType->fields[2] = getNativeType(-1);
		nativeType->fields[3] = getNativeType(4);
		return nativeType;
	case 45:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 19;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 19);
		nativeType->fields[0] = getNativeType(72);
		nativeType->fields[1] = getNativeType(72);
		nativeType->fields[2] = getNativeType(72);
		nativeType->fields[3] = getNativeType(72);
		nativeType->fields[4] = getNativeType(72);
		nativeType->fields[5] = getNativeType(72);
		nativeType->fields[6] = getNativeType(72);
		nativeType->fields[7] = getNativeType(72);
		nativeType->fields[8] = getNativeType(72);
		nativeType->fields[9] = getNativeType(72);
		nativeType->fields[10] = getNativeType(72);
		nativeType->fields[11] = getNativeType(72);
		nativeType->fields[12] = getNativeType(72);
		nativeType->fields[13] = getNativeType(72);
		nativeType->fields[14] = getNativeType(72);
		nativeType->fields[15] = getNativeType(72);
		nativeType->fields[16] = getNativeType(72);
		nativeType->fields[17] = getNativeType(3);
		nativeType->fields[18] = getNativeType(4);
		return nativeType;
	case 46:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 18;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 18);
		nativeType->fields[0] = getNativeType(14);
		nativeType->fields[1] = getNativeType(14);
		nativeType->fields[2] = getNativeType(72);
		nativeType->fields[3] = getNativeType(72);
		nativeType->fields[4] = getNativeType(72);
		nativeType->fields[5] = getNativeType(3);
		nativeType->fields[6] = getNativeType(0);
		nativeType->fields[7] = getNativeType(3);
		nativeType->fields[8] = getNativeType(3);
		nativeType->fields[9] = getNativeType(0);
		nativeType->fields[10] = getNativeType(3);
		nativeType->fields[11] = getNativeType(3);
		nativeType->fields[12] = getNativeType(0);
		nativeType->fields[13] = getNativeType(3);
		nativeType->fields[14] = getNativeType(3);
		nativeType->fields[15] = getNativeType(0);
		nativeType->fields[16] = getNativeType(-1);
		nativeType->fields[17] = getNativeType(4);
		return nativeType;
	case 47:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 22;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 22);
		nativeType->fields[0] = getNativeType(3);
		nativeType->fields[1] = getNativeType(3);
		nativeType->fields[2] = getNativeType(3);
		nativeType->fields[3] = getNativeType(3);
		nativeType->fields[4] = getNativeType(3);
		nativeType->fields[5] = getNativeType(3);
		nativeType->fields[6] = getNativeType(3);
		nativeType->fields[7] = getNativeType(3);
		nativeType->fields[8] = getNativeType(3);
		nativeType->fields[9] = getNativeType(3);
		nativeType->fields[10] = getNativeType(3);
		nativeType->fields[11] = getNativeType(3);
		nativeType->fields[12] = getNativeType(3);
		nativeType->fields[13] = getNativeType(3);
		nativeType->fields[14] = getNativeType(3);
		nativeType->fields[15] = getNativeType(3);
		nativeType->fields[16] = getNativeType(3);
		nativeType->fields[17] = getNativeType(3);
		nativeType->fields[18] = getNativeType(3);
		nativeType->fields[19] = getNativeType(3);
		nativeType->fields[20] = getNativeType(3);
		nativeType->fields[21] = getNativeType(3);
		return nativeType;
	case 48:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 2;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 2);
		nativeType->fields[0] = getNativeType(8);
		nativeType->fields[1] = getNativeType(8);
		return nativeType;
	case 49:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 3;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 3);
		nativeType->fields[0] = getNativeType(72);
		nativeType->fields[1] = getNativeType(72);
		nativeType->fields[2] = getNativeType(3);
		return nativeType;
	case 50:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 7;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 7);
		nativeType->fields[0] = getNativeType(61);
		nativeType->fields[1] = getNativeType(72);
		nativeType->fields[2] = getNativeType(72);
		nativeType->fields[3] = getNativeType(3);
		nativeType->fields[4] = getNativeType(4);
		nativeType->fields[5] = getNativeType(4);
		nativeType->fields[6] = getNativeType(0);
		return nativeType;
	case 51:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 18;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 18);
		nativeType->fields[0] = getNativeType(14);
		nativeType->fields[1] = getNativeType(14);
		nativeType->fields[2] = getNativeType(72);
		nativeType->fields[3] = getNativeType(72);
		nativeType->fields[4] = getNativeType(3);
		nativeType->fields[5] = getNativeType(0);
		nativeType->fields[6] = getNativeType(3);
		nativeType->fields[7] = getNativeType(3);
		nativeType->fields[8] = getNativeType(0);
		nativeType->fields[9] = getNativeType(3);
		nativeType->fields[10] = getNativeType(3);
		nativeType->fields[11] = getNativeType(0);
		nativeType->fields[12] = getNativeType(3);
		nativeType->fields[13] = getNativeType(3);
		nativeType->fields[14] = getNativeType(3);
		nativeType->fields[15] = getNativeType(0);
		nativeType->fields[16] = getNativeType(-1);
		nativeType->fields[17] = getNativeType(4);
		return nativeType;
	case 52:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 2;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 2);
		nativeType->fields[0] = getNativeType(3);
		nativeType->fields[1] = getNativeType(3);
		return nativeType;
	case 53:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 2;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 2);
		nativeType->fields[0] = getNativeType(72);
		nativeType->fields[1] = getNativeType(72);
		return nativeType;
	case 54:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 5;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 5);
		nativeType->fields[0] = getNativeType(72);
		nativeType->fields[1] = getNativeType(72);
		nativeType->fields[2] = getNativeType(3);
		nativeType->fields[3] = getNativeType(3);
		nativeType->fields[4] = getNativeType(3);
		return nativeType;
	case 55:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 2;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 2);
		nativeType->fields[0] = getNativeType(61);
		nativeType->fields[1] = getNativeType(61);
		return nativeType;
	case 56:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 2;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 2);
		nativeType->fields[0] = getNativeType(61);
		nativeType->fields[1] = getNativeType(61);
		return nativeType;
	case 57:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 4;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 4);
		nativeType->fields[0] = getNativeType(-1);
		nativeType->fields[1] = getNativeType(-1);
		nativeType->fields[2] = getNativeType(4);
		nativeType->fields[3] = getNativeType(4);
		return nativeType;
	case 58:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 12;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 12);
		nativeType->fields[0] = getNativeType(72);
		nativeType->fields[1] = getNativeType(72);
		nativeType->fields[2] = getNativeType(72);
		nativeType->fields[3] = getNativeType(72);
		nativeType->fields[4] = getNativeType(72);
		nativeType->fields[5] = getNativeType(72);
		nativeType->fields[6] = getNativeType(72);
		nativeType->fields[7] = getNativeType(72);
		nativeType->fields[8] = getNativeType(4);
		nativeType->fields[9] = getNativeType(3);
		nativeType->fields[10] = getNativeType(72);
		nativeType->fields[11] = getNativeType(3);
		return nativeType;
	case 59:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 6;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 6);
		nativeType->fields[0] = getNativeType(62);
		nativeType->fields[1] = getNativeType(62);
		nativeType->fields[2] = getNativeType(69);
		nativeType->fields[3] = getNativeType(69);
		nativeType->fields[4] = getNativeType(72);
		nativeType->fields[5] = getNativeType(3);
		return nativeType;
	case 60:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 14;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 14);
		nativeType->fields[0] = getNativeType(-1);
		nativeType->fields[1] = getNativeType(3);
		nativeType->fields[2] = getNativeType(3);
		nativeType->fields[3] = getNativeType(3);
		nativeType->fields[4] = getNativeType(3);
		nativeType->fields[5] = getNativeType(35);
		nativeType->fields[6] = getNativeType(7);
		nativeType->fields[7] = getNativeType(0);
		nativeType->fields[8] = getNativeType(0);
		nativeType->fields[9] = getNativeType(0);
		nativeType->fields[10] = getNativeType(0);
		nativeType->fields[11] = getNativeType(0);
		nativeType->fields[12] = getNativeType(0);
		nativeType->fields[13] = getNativeType(4);
		return nativeType;
	case 61:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 3;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 3);
		nativeType->fields[0] = getNativeType(5);
		nativeType->fields[1] = getNativeType(6);
		nativeType->fields[2] = getNativeType(6);
		return nativeType;
	case 62:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 10;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 10);
		nativeType->fields[0] = getNativeType(72);
		nativeType->fields[1] = getNativeType(72);
		nativeType->fields[2] = getNativeType(72);
		nativeType->fields[3] = getNativeType(72);
		nativeType->fields[4] = getNativeType(72);
		nativeType->fields[5] = getNativeType(72);
		nativeType->fields[6] = getNativeType(72);
		nativeType->fields[7] = getNativeType(72);
		nativeType->fields[8] = getNativeType(4);
		nativeType->fields[9] = getNativeType(3);
		return nativeType;
	case 63:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 4;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 4);
		nativeType->fields[0] = getNativeType(65);
		nativeType->fields[1] = getNativeType(65);
		nativeType->fields[2] = getNativeType(65);
		nativeType->fields[3] = getNativeType(4);
		return nativeType;
	case 64:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 7;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 7);
		nativeType->fields[0] = getNativeType(6);
		nativeType->fields[1] = getNativeType(9);
		nativeType->fields[2] = getNativeType(9);
		nativeType->fields[3] = getNativeType(9);
		nativeType->fields[4] = getNativeType(9);
		nativeType->fields[5] = getNativeType(9);
		nativeType->fields[6] = getNativeType(9);
		return nativeType;
	case 65:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 6;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 6);
		nativeType->fields[0] = getNativeType(72);
		nativeType->fields[1] = getNativeType(72);
		nativeType->fields[2] = getNativeType(72);
		nativeType->fields[3] = getNativeType(3);
		nativeType->fields[4] = getNativeType(4);
		nativeType->fields[5] = getNativeType(4);
		return nativeType;
	case 66:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 5;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 5);
		nativeType->fields[0] = getNativeType(72);
		nativeType->fields[1] = getNativeType(72);
		nativeType->fields[2] = getNativeType(72);
		nativeType->fields[3] = getNativeType(52);
		nativeType->fields[4] = getNativeType(52);
		return nativeType;
	case 67:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 5;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 5);
		nativeType->fields[0] = getNativeType(62);
		nativeType->fields[1] = getNativeType(62);
		nativeType->fields[2] = getNativeType(66);
		nativeType->fields[3] = getNativeType(66);
		nativeType->fields[4] = getNativeType(3);
		return nativeType;
	case 68:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 2;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 2);
		nativeType->fields[0] = getNativeType(4);
		nativeType->fields[1] = getNativeType(3);
		return nativeType;
	case 69:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 2;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 2);
		nativeType->fields[0] = getNativeType(72);
		nativeType->fields[1] = getNativeType(52);
		return nativeType;
	case 70:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 0;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 0);
		return nativeType;
	case 71:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 2;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 2);
		nativeType->fields[0] = getNativeType(4);
		nativeType->fields[1] = getNativeType(4);
		return nativeType;
	case 72:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 2;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 2);
		nativeType->fields[0] = getNativeType(3);
		nativeType->fields[1] = getNativeType(3);
		return nativeType;
	case 73:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 3;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 3);
		nativeType->fields[0] = getNativeType(4);
		nativeType->fields[1] = getNativeType(4);
		nativeType->fields[2] = getNativeType(4);
		return nativeType;
	case 74:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 12;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 12);
		nativeType->fields[0] = getNativeType(14);
		nativeType->fields[1] = getNativeType(14);
		nativeType->fields[2] = getNativeType(72);
		nativeType->fields[3] = getNativeType(72);
		nativeType->fields[4] = getNativeType(3);
		nativeType->fields[5] = getNativeType(3);
		nativeType->fields[6] = getNativeType(3);
		nativeType->fields[7] = getNativeType(3);
		nativeType->fields[8] = getNativeType(3);
		nativeType->fields[9] = getNativeType(0);
		nativeType->fields[10] = getNativeType(-1);
		nativeType->fields[11] = getNativeType(4);
		return nativeType;
	case 75:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 17;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 17);
		nativeType->fields[0] = getNativeType(14);
		nativeType->fields[1] = getNativeType(14);
		nativeType->fields[2] = getNativeType(72);
		nativeType->fields[3] = getNativeType(72);
		nativeType->fields[4] = getNativeType(72);
		nativeType->fields[5] = getNativeType(0);
		nativeType->fields[6] = getNativeType(3);
		nativeType->fields[7] = getNativeType(3);
		nativeType->fields[8] = getNativeType(0);
		nativeType->fields[9] = getNativeType(3);
		nativeType->fields[10] = getNativeType(3);
		nativeType->fields[11] = getNativeType(0);
		nativeType->fields[12] = getNativeType(3);
		nativeType->fields[13] = getNativeType(3);
		nativeType->fields[14] = getNativeType(0);
		nativeType->fields[15] = getNativeType(-1);
		nativeType->fields[16] = getNativeType(4);
		return nativeType;
	case 76:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 19;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 19);
		nativeType->fields[0] = getNativeType(72);
		nativeType->fields[1] = getNativeType(3);
		nativeType->fields[2] = getNativeType(3);
		nativeType->fields[3] = getNativeType(3);
		nativeType->fields[4] = getNativeType(3);
		nativeType->fields[5] = getNativeType(3);
		nativeType->fields[6] = getNativeType(3);
		nativeType->fields[7] = getNativeType(3);
		nativeType->fields[8] = getNativeType(3);
		nativeType->fields[9] = getNativeType(4);
		nativeType->fields[10] = getNativeType(4);
		nativeType->fields[11] = getNativeType(0);
		nativeType->fields[12] = getNativeType(0);
		nativeType->fields[13] = getNativeType(4);
		nativeType->fields[14] = getNativeType(-1);
		nativeType->fields[15] = getNativeType(-1);
		nativeType->fields[16] = getNativeType(-1);
		nativeType->fields[17] = getNativeType(-1);
		nativeType->fields[18] = getNativeType(4);
		return nativeType;
	case 77:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 2;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 2);
		nativeType->fields[0] = getNativeType(6);
		nativeType->fields[1] = getNativeType(6);
		return nativeType;
	default:
		return NULL;
	}
}
*/
    private native static long getNativeType(int id);/*
    	return reinterpret_cast<jlong>(getNativeType(id));
    */

    static {
        ffiIdMap.put(-2, CHandler.constructCTypeFromNativeType("void", getNativeType(-2)));
        ffiIdMap.put(-1, CHandler.constructCTypeFromNativeType("void*", getNativeType(-1)));
        ffiIdMap.put(0, CHandler.constructCTypeFromNativeType("bool", getNativeType(0)));
        CHandler.registerCType(ffiIdMap.get(0));
        ffiIdMap.put(1, CHandler.constructCTypeFromNativeType("const char", getNativeType(1)));
        CHandler.registerCType(ffiIdMap.get(1));
        ffiIdMap.put(2, CHandler.constructCTypeFromNativeType("const uint8_t", getNativeType(2)));
        CHandler.registerCType(ffiIdMap.get(2));
        ffiIdMap.put(3, CHandler.constructCTypeFromNativeType("float", getNativeType(3)));
        CHandler.registerCType(ffiIdMap.get(3));
        ffiIdMap.put(4, CHandler.constructCTypeFromNativeType("int", getNativeType(4)));
        CHandler.registerCType(ffiIdMap.get(4));
        ffiIdMap.put(5, CHandler.constructCTypeFromNativeType("int32_t", getNativeType(5)));
        CHandler.registerCType(ffiIdMap.get(5));
        ffiIdMap.put(6, CHandler.constructCTypeFromNativeType("uint16_t", getNativeType(6)));
        CHandler.registerCType(ffiIdMap.get(6));
        ffiIdMap.put(7, CHandler.constructCTypeFromNativeType("uint32_t", getNativeType(7)));
        CHandler.registerCType(ffiIdMap.get(7));
        ffiIdMap.put(8, CHandler.constructCTypeFromNativeType("uint64_t", getNativeType(8)));
        CHandler.registerCType(ffiIdMap.get(8));
        ffiIdMap.put(9, CHandler.constructCTypeFromNativeType("uint8_t", getNativeType(9)));
        CHandler.registerCType(ffiIdMap.get(9));
        ffiIdMap.put(10, CHandler.constructCTypeFromNativeType("unsigned int", getNativeType(10)));
        CHandler.registerCType(ffiIdMap.get(10));
        ffiIdMap.put(11, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(11)));
        ffiIdMap.put(12, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(12)));
        ffiIdMap.put(13, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(13)));
        ffiIdMap.put(14, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(14)));
        ffiIdMap.put(15, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(15)));
        ffiIdMap.put(16, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(16)));
        ffiIdMap.put(17, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(17)));
        ffiIdMap.put(18, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(18)));
        ffiIdMap.put(19, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(19)));
        ffiIdMap.put(20, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(20)));
        ffiIdMap.put(21, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(21)));
        ffiIdMap.put(22, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(22)));
        ffiIdMap.put(23, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(23)));
        ffiIdMap.put(24, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(24)));
        ffiIdMap.put(25, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(25)));
        ffiIdMap.put(26, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(26)));
        ffiIdMap.put(27, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(27)));
        ffiIdMap.put(28, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(28)));
        ffiIdMap.put(29, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(29)));
        ffiIdMap.put(30, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(30)));
        ffiIdMap.put(31, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(31)));
        ffiIdMap.put(32, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(32)));
        ffiIdMap.put(33, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(33)));
        ffiIdMap.put(34, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(34)));
        ffiIdMap.put(35, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(35)));
        ffiIdMap.put(36, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(36)));
        ffiIdMap.put(37, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(37)));
        ffiIdMap.put(38, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(38)));
        ffiIdMap.put(39, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(39)));
        ffiIdMap.put(40, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(40)));
        ffiIdMap.put(41, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(41)));
        ffiIdMap.put(42, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(42)));
        ffiIdMap.put(43, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(43)));
        ffiIdMap.put(44, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(44)));
        ffiIdMap.put(45, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(45)));
        ffiIdMap.put(46, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(46)));
        ffiIdMap.put(47, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(47)));
        ffiIdMap.put(48, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(48)));
        ffiIdMap.put(49, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(49)));
        ffiIdMap.put(50, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(50)));
        ffiIdMap.put(51, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(51)));
        ffiIdMap.put(52, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(52)));
        ffiIdMap.put(53, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(53)));
        ffiIdMap.put(54, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(54)));
        ffiIdMap.put(55, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(55)));
        ffiIdMap.put(56, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(56)));
        ffiIdMap.put(57, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(57)));
        ffiIdMap.put(58, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(58)));
        ffiIdMap.put(59, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(59)));
        ffiIdMap.put(60, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(60)));
        ffiIdMap.put(61, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(61)));
        ffiIdMap.put(62, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(62)));
        ffiIdMap.put(63, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(63)));
        ffiIdMap.put(64, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(64)));
        ffiIdMap.put(65, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(65)));
        ffiIdMap.put(66, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(66)));
        ffiIdMap.put(67, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(67)));
        ffiIdMap.put(68, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(68)));
        ffiIdMap.put(69, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(69)));
        ffiIdMap.put(70, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(70)));
        ffiIdMap.put(71, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(71)));
        ffiIdMap.put(72, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(72)));
        ffiIdMap.put(73, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(73)));
        ffiIdMap.put(74, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(74)));
        ffiIdMap.put(75, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(75)));
        ffiIdMap.put(76, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(76)));
        ffiIdMap.put(77, CHandler.constructStackElementCTypeFromNativeType(null, getNativeType(77)));
    }
}
