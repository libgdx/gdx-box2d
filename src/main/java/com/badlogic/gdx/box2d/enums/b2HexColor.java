package com.badlogic.gdx.box2d.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;

/**
 * These colors are used for debug draw and mostly match the named SVG colors.
 * See https://www.rapidtables.com/web/color/index.html
 * https://johndecember.com/html/spec/colorsvg.html
 * https://upload.wikimedia.org/wikipedia/commons/2/2b/SVG_Recognized_color_keyword_names.svg
 */
public enum b2HexColor implements CEnum {

    b2_colorBlack(0),
    b2_colorNavy(128),
    b2_colorDarkBlue(139),
    b2_colorMediumBlue(205),
    b2_colorBlue(255),
    b2_colorDarkGreen(25600),
    b2_colorGreen(32768),
    b2_colorTeal(32896),
    b2_colorDarkCyan(35723),
    b2_colorDeepSkyBlue(49151),
    b2_colorDarkTurquoise(52945),
    b2_colorMediumSpringGreen(64154),
    b2_colorLime(65280),
    b2_colorSpringGreen(65407),
    b2_colorAqua_b2_colorCyan(65535),
    b2_colorMidnightBlue(1644912),
    b2_colorDodgerBlue(2003199),
    b2_colorLightSeaGreen(2142890),
    b2_colorForestGreen(2263842),
    b2_colorSeaGreen(3050327),
    b2_colorDarkSlateGray(3100495),
    b2_colorBox2DBlue(3190463),
    b2_colorLimeGreen(3329330),
    b2_colorMediumSeaGreen(3978097),
    b2_colorTurquoise(4251856),
    b2_colorRoyalBlue(4286945),
    b2_colorSteelBlue(4620980),
    b2_colorDarkSlateBlue(4734347),
    b2_colorMediumTurquoise(4772300),
    b2_colorIndigo(4915330),
    b2_colorDarkOliveGreen(5597999),
    b2_colorCadetBlue(6266528),
    b2_colorCornflowerBlue(6591981),
    b2_colorRebeccaPurple(6697881),
    b2_colorMediumAquaMarine(6737322),
    b2_colorDimGray(6908265),
    b2_colorSlateBlue(6970061),
    b2_colorOliveDrab(7048739),
    b2_colorSlateGray(7372944),
    b2_colorLightSlateGray(7833753),
    b2_colorMediumSlateBlue(8087790),
    b2_colorLawnGreen(8190976),
    b2_colorChartreuse(8388352),
    b2_colorAquamarine(8388564),
    b2_colorMaroon(8388608),
    b2_colorPurple(8388736),
    b2_colorOlive(8421376),
    b2_colorGray(8421504),
    b2_colorSkyBlue(8900331),
    b2_colorLightSkyBlue(8900346),
    b2_colorBlueViolet(9055202),
    b2_colorDarkRed(9109504),
    b2_colorDarkMagenta(9109643),
    b2_colorSaddleBrown(9127187),
    b2_colorBox2DGreen(9226532),
    b2_colorDarkSeaGreen(9419919),
    b2_colorLightGreen(9498256),
    b2_colorMediumPurple(9662683),
    b2_colorDarkViolet(9699539),
    b2_colorPaleGreen(10025880),
    b2_colorDarkOrchid(10040012),
    b2_colorYellowGreen(10145074),
    b2_colorSienna(10506797),
    b2_colorBrown(10824234),
    b2_colorDarkGray(11119017),
    b2_colorLightBlue(11393254),
    b2_colorGreenYellow(11403055),
    b2_colorPaleTurquoise(11529966),
    b2_colorLightSteelBlue(11584734),
    b2_colorPowderBlue(11591910),
    b2_colorFireBrick(11674146),
    b2_colorDarkGoldenRod(12092939),
    b2_colorMediumOrchid(12211667),
    b2_colorRosyBrown(12357519),
    b2_colorDarkKhaki(12433259),
    b2_colorSilver(12632256),
    b2_colorMediumVioletRed(13047173),
    b2_colorIndianRed(13458524),
    b2_colorPeru(13468991),
    b2_colorChocolate(13789470),
    b2_colorTan(13808780),
    b2_colorLightGray(13882323),
    b2_colorThistle(14204888),
    b2_colorOrchid(14315734),
    b2_colorGoldenRod(14329120),
    b2_colorPaleVioletRed(14381203),
    b2_colorCrimson(14423100),
    b2_colorBox2DRed(14430514),
    b2_colorGainsboro(14474460),
    b2_colorPlum(14524637),
    b2_colorBurlywood(14596231),
    b2_colorLightCyan(14745599),
    b2_colorLavender(15132410),
    b2_colorDarkSalmon(15308410),
    b2_colorViolet(15631086),
    b2_colorPaleGoldenRod(15657130),
    b2_colorLightCoral(15761536),
    b2_colorKhaki(15787660),
    b2_colorAliceBlue(15792383),
    b2_colorHoneyDew(15794160),
    b2_colorAzure(15794175),
    b2_colorSandyBrown(16032864),
    b2_colorWheat(16113331),
    b2_colorBeige(16119260),
    b2_colorWhiteSmoke(16119285),
    b2_colorMintCream(16121850),
    b2_colorGhostWhite(16316671),
    b2_colorSalmon(16416882),
    b2_colorAntiqueWhite(16444375),
    b2_colorLinen(16445670),
    b2_colorLightGoldenRodYellow(16448210),
    b2_colorOldLace(16643558),
    b2_colorRed(16711680),
    b2_colorFuchsia_b2_colorMagenta(16711935),
    b2_colorDeepPink(16716947),
    b2_colorOrangeRed(16729344),
    b2_colorTomato(16737095),
    b2_colorHotPink(16738740),
    b2_colorCoral(16744272),
    b2_colorDarkOrange(16747520),
    b2_colorLightSalmon(16752762),
    b2_colorOrange(16753920),
    b2_colorLightPink(16758465),
    b2_colorPink(16761035),
    b2_colorGold(16766720),
    b2_colorPeachPuff(16767673),
    b2_colorNavajoWhite(16768685),
    b2_colorMoccasin(16770229),
    b2_colorBisque(16770244),
    b2_colorMistyRose(16770273),
    b2_colorBlanchedAlmond(16772045),
    b2_colorBox2DYellow(16772748),
    b2_colorPapayaWhip(16773077),
    b2_colorLavenderBlush(16773365),
    b2_colorSeaShell(16774638),
    b2_colorCornsilk(16775388),
    b2_colorLemonChiffon(16775885),
    b2_colorFloralWhite(16775920),
    b2_colorSnow(16775930),
    b2_colorYellow(16776960),
    b2_colorLightYellow(16777184),
    b2_colorIvory(16777200),
    b2_colorWhite(16777215);

    private static final int __size = 4;

    private final int index;

    b2HexColor(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static b2HexColor getByIndex(int index) {
        switch(index) {
            case 8421504:
                return b2_colorGray;
            case 6908265:
                return b2_colorDimGray;
            case 8388736:
                return b2_colorPurple;
            case 25600:
                return b2_colorDarkGreen;
            case 0:
                return b2_colorBlack;
            case 11119017:
                return b2_colorDarkGray;
            case 12632256:
                return b2_colorSilver;
            case 10025880:
                return b2_colorPaleGreen;
            case 9498256:
                return b2_colorLightGreen;
            case 13882323:
                return b2_colorLightGray;
            case 9109643:
                return b2_colorDarkMagenta;
            case 9419919:
                return b2_colorDarkSeaGreen;
            case 2263842:
                return b2_colorForestGreen;
            case 3329330:
                return b2_colorLimeGreen;
            case 32768:
                return b2_colorGreen;
            case 65280:
                return b2_colorLime;
            case 16711935:
                return b2_colorFuchsia_b2_colorMagenta;
            case 16119285:
                return b2_colorWhiteSmoke;
            case 16777215:
                return b2_colorWhite;
            case 15794160:
                return b2_colorHoneyDew;
            case 14474460:
                return b2_colorGainsboro;
            case 14204888:
                return b2_colorThistle;
            case 14524637:
                return b2_colorPlum;
            case 15631086:
                return b2_colorViolet;
            case 16775930:
                return b2_colorSnow;
            case 16316671:
                return b2_colorGhostWhite;
            case 16773365:
                return b2_colorLavenderBlush;
            case 14315734:
                return b2_colorOrchid;
            case 15792383:
                return b2_colorAliceBlue;
            case 15794175:
                return b2_colorAzure;
            case 16775920:
                return b2_colorFloralWhite;
            case 16777200:
                return b2_colorIvory;
            case 16121850:
                return b2_colorMintCream;
            case 16774638:
                return b2_colorSeaShell;
            case 16643558:
                return b2_colorOldLace;
            case 15132410:
                return b2_colorLavender;
            case 16445670:
                return b2_colorLinen;
            case 16770273:
                return b2_colorMistyRose;
            case 14745599:
                return b2_colorLightCyan;
            case 16777184:
                return b2_colorLightYellow;
            case 16775388:
                return b2_colorCornsilk;
            case 16448210:
                return b2_colorLightGoldenRodYellow;
            case 16119260:
                return b2_colorBeige;
            case 16773077:
                return b2_colorPapayaWhip;
            case 16444375:
                return b2_colorAntiqueWhite;
            case 16772045:
                return b2_colorBlanchedAlmond;
            case 16775885:
                return b2_colorLemonChiffon;
            case 12357519:
                return b2_colorRosyBrown;
            case 16761035:
                return b2_colorPink;
            case 16770244:
                return b2_colorBisque;
            case 16758465:
                return b2_colorLightPink;
            case 11529966:
                return b2_colorPaleTurquoise;
            case 13047173:
                return b2_colorMediumVioletRed;
            case 15657130:
                return b2_colorPaleGoldenRod;
            case 16767673:
                return b2_colorPeachPuff;
            case 16113331:
                return b2_colorWheat;
            case 9699539:
                return b2_colorDarkViolet;
            case 9662683:
                return b2_colorMediumPurple;
            case 7048739:
                return b2_colorOliveDrab;
            case 14381203:
                return b2_colorPaleVioletRed;
            case 16770229:
                return b2_colorMoccasin;
            case 16738740:
                return b2_colorHotPink;
            case 11393254:
                return b2_colorLightBlue;
            case 3978097:
                return b2_colorMediumSeaGreen;
            case 16768685:
                return b2_colorNavajoWhite;
            case 10040012:
                return b2_colorDarkOrchid;
            case 11591910:
                return b2_colorPowderBlue;
            case 14596231:
                return b2_colorBurlywood;
            case 13808780:
                return b2_colorTan;
            case 3100495:
                return b2_colorDarkSlateGray;
            case 9055202:
                return b2_colorBlueViolet;
            case 12211667:
                return b2_colorMediumOrchid;
            case 1644912:
                return b2_colorMidnightBlue;
            case 16716947:
                return b2_colorDeepPink;
            case 8900331:
                return b2_colorSkyBlue;
            case 11584734:
                return b2_colorLightSteelBlue;
            case 15761536:
                return b2_colorLightCoral;
            case 16772748:
                return b2_colorBox2DYellow;
            case 3050327:
                return b2_colorSeaGreen;
            case 5597999:
                return b2_colorDarkOliveGreen;
            case 15787660:
                return b2_colorKhaki;
            case 8190976:
                return b2_colorLawnGreen;
            case 8900346:
                return b2_colorLightSkyBlue;
            case 8388352:
                return b2_colorChartreuse;
            case 65407:
                return b2_colorSpringGreen;
            case 128:
                return b2_colorNavy;
            case 8421376:
                return b2_colorOlive;
            case 8388608:
                return b2_colorMaroon;
            case 32896:
                return b2_colorTeal;
            case 11403055:
                return b2_colorGreenYellow;
            case 4772300:
                return b2_colorMediumTurquoise;
            case 16752762:
                return b2_colorLightSalmon;
            case 16416882:
                return b2_colorSalmon;
            case 6591981:
                return b2_colorCornflowerBlue;
            case 2142890:
                return b2_colorLightSeaGreen;
            case 139:
                return b2_colorDarkBlue;
            case 35723:
                return b2_colorDarkCyan;
            case 9109504:
                return b2_colorDarkRed;
            case 10506797:
                return b2_colorSienna;
            case 10824234:
                return b2_colorBrown;
            case 3190463:
                return b2_colorBox2DBlue;
            case 11674146:
                return b2_colorFireBrick;
            case 4251856:
                return b2_colorTurquoise;
            case 13458524:
                return b2_colorIndianRed;
            case 15308410:
                return b2_colorDarkSalmon;
            case 16032864:
                return b2_colorSandyBrown;
            case 8087790:
                return b2_colorMediumSlateBlue;
            case 9127187:
                return b2_colorSaddleBrown;
            case 64154:
                return b2_colorMediumSpringGreen;
            case 4286945:
                return b2_colorRoyalBlue;
            case 6970061:
                return b2_colorSlateBlue;
            case 10145074:
                return b2_colorYellowGreen;
            case 9226532:
                return b2_colorBox2DGreen;
            case 8388564:
                return b2_colorAquamarine;
            case 16744272:
                return b2_colorCoral;
            case 12092939:
                return b2_colorDarkGoldenRod;
            case 16737095:
                return b2_colorTomato;
            case 4734347:
                return b2_colorDarkSlateBlue;
            case 4915330:
                return b2_colorIndigo;
            case 13789470:
                return b2_colorChocolate;
            case 6737322:
                return b2_colorMediumAquaMarine;
            case 205:
                return b2_colorMediumBlue;
            case 52945:
                return b2_colorDarkTurquoise;
            case 12433259:
                return b2_colorDarkKhaki;
            case 14423100:
                return b2_colorCrimson;
            case 7372944:
                return b2_colorSlateGray;
            case 2003199:
                return b2_colorDodgerBlue;
            case 7833753:
                return b2_colorLightSlateGray;
            case 14430514:
                return b2_colorBox2DRed;
            case 13468991:
                return b2_colorPeru;
            case 4620980:
                return b2_colorSteelBlue;
            case 14329120:
                return b2_colorGoldenRod;
            case 6697881:
                return b2_colorRebeccaPurple;
            case 65535:
                return b2_colorAqua_b2_colorCyan;
            case 255:
                return b2_colorBlue;
            case 6266528:
                return b2_colorCadetBlue;
            case 16747520:
                return b2_colorDarkOrange;
            case 49151:
                return b2_colorDeepSkyBlue;
            case 16766720:
                return b2_colorGold;
            case 16776960:
                return b2_colorYellow;
            case 16753920:
                return b2_colorOrange;
            case 16729344:
                return b2_colorOrangeRed;
            case 16711680:
                return b2_colorRed;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class b2HexColorPointer extends EnumPointer<b2HexColor> {

        public b2HexColorPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2HexColorPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public b2HexColorPointer() {
            this(1, true);
        }

        public b2HexColorPointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public b2HexColor getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(b2HexColor value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }

        public int getSize() {
            return __size;
        }
    }
}
