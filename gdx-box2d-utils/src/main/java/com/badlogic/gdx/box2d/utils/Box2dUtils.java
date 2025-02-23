package com.badlogic.gdx.box2d.utils;

import com.badlogic.gdx.box2d.enums.b2HexColor;
import com.badlogic.gdx.graphics.Color;


public class Box2dUtils {

    public static Color box2dColorToGDXColor(b2HexColor b2Color) {
        Color c = new Color();
        Color.argb8888ToColor(c, b2Color.getIndex());
        return c;
    }

    public static void box2dColorToGDXColor(Color color, b2HexColor b2Color) {
        Color.argb8888ToColor(color, b2Color.getIndex());
    }
}
