package com.badlogic.gdx.physics.box2d.test;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.physics.box2d.rope.Rope;
import com.badlogic.gdx.physics.box2d.rope.RopeDef;
import com.badlogic.gdx.physics.box2d.rope.RopeTuning;

public class RopeTest extends Box2DTest {
    public Rope rope;
    public Vector2 pos;

    @Override
    protected void createWorld(World world) {
        rope = new Rope();
        RopeDef ropeDef = new RopeDef();
        int N = 25;
        float L = .5f;
        ropeDef.vertices = new Vector2[N];
        ropeDef.masses = new float[N];
        for (int i = 0; i < N; ++i) {
            ropeDef.vertices[i] = new Vector2(0.0f, L * (N - i));
            ropeDef.masses[i] = 1.0f;
        }
        ropeDef.masses[0] = 0.0f;
        ropeDef.masses[1] = 0.0f;

        RopeTuning tuning = ropeDef.tuning;
        tuning.bendHertz = 30.0f;
        tuning.bendDamping = 4.0f;
        tuning.bendStiffness = 1.0f;
        tuning.bendingModel = RopeTuning.BendingModel.PbdTriangle;
        tuning.isometric = true;

        tuning.stretchHertz = 30.0f;
        tuning.stretchDamping = 4.0f;
        tuning.stretchStiffness = 1.0f;
        tuning.stretchingModel = RopeTuning.StretchingModel.Pbd;
        pos = ropeDef.position.set(-5f, 15f);
        ropeDef.gravity.set(0, -10f);
        rope.create(ropeDef);
    }

    @Override
    public void render() {
        super.render();
        rope.step(Gdx.graphics.getDeltaTime(), 8, pos);
        renderer.render(rope.getDrawData());
    }
}
