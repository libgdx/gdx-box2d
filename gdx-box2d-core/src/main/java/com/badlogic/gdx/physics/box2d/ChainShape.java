/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;

public class ChainShape extends Shape {
	// @off
	/*JNI
#include <box2d/box2d.h>
	 */
	boolean isLooped = false;

	public ChainShape () {
		addr = newChainShape();
	}

	private native long newChainShape (); /*
		return (jlong)(new b2ChainShape());
	*/

	ChainShape (long addr) {
		this.addr = addr;
	}

	@Override
	public Type getType () {
		return Type.Chain;
	}

	/** Create a loop. This automatically adjusts connectivity.
	 * @param vertices an array of floats of alternating x, y coordinates. */
	public void createLoop (float[] vertices) {
		jniCreateLoop(addr, vertices, 0, vertices.length / 2);
		isLooped = true;
	}

	/** Create a loop. This automatically adjusts connectivity.
	 * @param vertices an array of floats of alternating x, y coordinates.
	 * @param offset into the vertices array
	 * @param length after offset (in floats, not float-pairs, so even number) */
	public void createLoop (float[] vertices, int offset, int length) {
		jniCreateLoop(addr, vertices, offset, length / 2);
		isLooped = true;
	}

	/** Create a loop. This automatically adjusts connectivity.
	 * @param vertices an array of vertices, these are copied */
	public void createLoop (Vector2[] vertices) {
        float[] verts = JniUtil.arrayOfVec2IntoFloat(vertices);
        jniCreateLoop(addr, verts, 0, verts.length / 2);
		isLooped = true;
	}

	private native void jniCreateLoop (long addr, float[] verts, int offset, int numVertices); /*
		b2ChainShape* chain = (b2ChainShape*)addr;
		b2Vec2* verticesOut = new b2Vec2[numVertices];
		for( int i = 0; i < numVertices; i++ )
			verticesOut[i] = b2Vec2(verts[offset+(i<<1)], verts[offset+(i<<1)+1]);
		chain->CreateLoop( verticesOut, numVertices );
		delete[] verticesOut;
	*/

//	/** Create a chain with isolated end vertices.
//	 * @param vertices an array of floats of alternating x, y coordinates. */
//	public void createChain (float[] vertices) {
//		jniCreateChain(addr, vertices, 0, vertices.length / 2);
//		isLooped = false;
//	}
//
//	/** Create a chain with isolated end vertices.
//	 * @param vertices an array of floats of alternating x, y coordinates.
//	 * @param offset into the vertices array
//	 * @param length after offset (in floats, not float-pairs, so even number) */
//	public void createChain (float[] vertices, int offset, int length) {
//		jniCreateChain(addr, vertices, offset, length / 2);
//		isLooped = false;
//	}

	/** Create a chain with isolated end vertices.
	 * @param vertices an array of vertices, these are copied */
	public void createChain (Vector2[] vertices, Vector2 prevVert, Vector2 nextVert) {
        float[] verts = JniUtil.arrayOfVec2IntoFloat(vertices);
        jniCreateChain(addr, verts, 0, vertices.length, prevVert.x, prevVert.y, nextVert.x, nextVert.y);
		isLooped = false;
	}

	private native void jniCreateChain (long addr, float[] verts, int offset, int numVertices, float prevVertX, float prevVertY, float nextVertX, float nextVertY); /*
		b2ChainShape* chain = (b2ChainShape*)addr;
		b2Vec2* verticesOut = new b2Vec2[numVertices];
		for( int i = 0; i < numVertices; i++ )
			verticesOut[i] = b2Vec2(verts[offset+(i<<1)], verts[offset+(i<<1)+1]);
		b2Vec2 prevVert = b2Vec2(prevVertX, prevVertY);
		b2Vec2 nextVert = b2Vec2(nextVertX, nextVertY);
		chain->CreateChain( verticesOut, numVertices, prevVert, nextVert );
		delete[] verticesOut;
	*/

	/** @return the number of vertices */
	public int getVertexCount () {
		return jniGetVertexCount(addr);
	}

	private native int jniGetVertexCount (long addr); /*
		b2ChainShape* chain = (b2ChainShape*)addr;
		return chain->m_count;
	*/

	private static float[] verts = new float[2];

	public boolean isLooped() {
		return isLooped;
	}

// /// Implement b2Shape. Vertices are cloned using b2Alloc.
// b2Shape* Clone(b2BlockAllocator* allocator) const;
//
// /// @see b2Shape::GetChildCount
// int32 GetChildCount() const;
//
// /// Get a child edge.
// void GetChildEdge(b2EdgeShape* edge, int32 index) const;
//
// /// This always return false.
// /// @see b2Shape::TestPoint
// bool TestPoint(const b2Transform& transform, const b2Vec2& p) const;
//
// /// Implement b2Shape.
// bool RayCast(b2RayCastOutput* output, const b2RayCastInput& input,
// const b2Transform& transform, int32 childIndex) const;
//
// /// @see b2Shape::ComputeAABB
// void ComputeAABB(b2AABB* aabb, const b2Transform& transform, int32 childIndex) const;
//
// /// Chains have zero mass.
// /// @see b2Shape::ComputeMass
// void ComputeMass(b2MassData* massData, float density) const;
//
}
