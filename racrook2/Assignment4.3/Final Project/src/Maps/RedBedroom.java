package Maps;

/**
 * Area map of RedBedroom
 * @author Ran Crook
 */

import java.awt.*;
import java.util.*;

public class RedBedroom extends Map
{
	Tiles.Tile t000 = new Tiles.Bed();
	Tiles.Tile t001 = new Tiles.BedE();
	Tiles.Tile t002 = new Tiles.BedN();
	Tiles.Tile t003 = new Tiles.BedNE();
	Tiles.Tile t004 = new Tiles.BedNW();
	Tiles.Tile t005 = new Tiles.BedS();
	Tiles.Tile t006 = new Tiles.BedSE();
	Tiles.Tile t007 = new Tiles.BedSW();
	Tiles.Tile t008 = new Tiles.BedW();
	Tiles.Tile t009 = new Tiles.BookshelfE();
	Tiles.Tile t010 = new Tiles.BookshelfNE();
	Tiles.Tile t011 = new Tiles.BookshelfNW();
	Tiles.Tile t012 = new Tiles.BookshelfSE();
	Tiles.Tile t013 = new Tiles.BookshelfSW();
	Tiles.Tile t014 = new Tiles.BookshelfW();
	Tiles.Tile t015 = new Tiles.CertificateN();
	Tiles.Tile t016 = new Tiles.CertificateS();
	Tiles.Tile t017 = new Tiles.CoffeeTableNE();
	Tiles.Tile t018 = new Tiles.CoffeeTableNW();
	Tiles.Tile t019 = new Tiles.CoffeeTableSE();
	Tiles.Tile t020 = new Tiles.CoffeeTableSW();
	Tiles.Tile t021 = new Tiles.ConsoleN();
	Tiles.Tile t022 = new Tiles.ConsoleS();
	Tiles.Tile t023 = new Tiles.DirtPath();
	Tiles.Tile t024 = new Tiles.DirtPathE();
	Tiles.Tile t025 = new Tiles.DirtPathN();
	Tiles.Tile t026 = new Tiles.DirtPathNE();
	Tiles.Tile t027 = new Tiles.DirtPathNW();
	Tiles.Tile t028 = new Tiles.DirtPathS();
	Tiles.Tile t029 = new Tiles.DirtPathSE();
	Tiles.Tile t030 = new Tiles.DirtPathSW();
	Tiles.Tile t031 = new Tiles.DirtPathW();
	Tiles.Tile t032 = new Tiles.DresserN();
	Tiles.Tile t033 = new Tiles.DresserS();
	Tiles.Tile t034 = new Tiles.FancyShelfE();
	Tiles.Tile t035 = new Tiles.FancyShelfNE();
	Tiles.Tile t036 = new Tiles.FancyShelfNW();
	Tiles.Tile t037 = new Tiles.FancyShelfSE();
	Tiles.Tile t038 = new Tiles.FancyShelfSW();
	Tiles.Tile t039 = new Tiles.FancyShelfW();
	Tiles.Tile t040 = new Tiles.House1Carpet();
	Tiles.Tile t041 = new Tiles.House1CarpetE();
	Tiles.Tile t042 = new Tiles.House1CarpetN();
	Tiles.Tile t043 = new Tiles.House1CarpetNE();
	Tiles.Tile t044 = new Tiles.House1CarpetNW();
	Tiles.Tile t045 = new Tiles.House1CarpetS();
	Tiles.Tile t046 = new Tiles.House1CarpetSE();
	Tiles.Tile t047 = new Tiles.House1CarpetSW();
	Tiles.Tile t048 = new Tiles.House1CarpetW();
	Tiles.Tile t049 = new Tiles.House1Chair1();
	Tiles.Tile t050 = new Tiles.House1Chair2();
	Tiles.Tile t051 = new Tiles.House1Door();
	Tiles.Tile t052 = new Tiles.House1DoormatN();
	Tiles.Tile t053 = new Tiles.House1DoormatNE();
	Tiles.Tile t054 = new Tiles.House1DoormatNW();
	Tiles.Tile t055 = new Tiles.House1DoormatS();
	Tiles.Tile t056 = new Tiles.House1DoormatSE();
	Tiles.Tile t057 = new Tiles.House1DoormatSW();
	Tiles.Tile t058 = new Tiles.House1E();
	Tiles.Tile t059 = new Tiles.House1Face1();
	Tiles.Tile t060 = new Tiles.House1Face2();
	Tiles.Tile t061 = new Tiles.House1Face3();
	Tiles.Tile t062 = new Tiles.House1Face4();
	Tiles.Tile t063 = new Tiles.House1Face5();
	Tiles.Tile t064 = new Tiles.House1Floor1();
	Tiles.Tile t065 = new Tiles.House1Floor2();
	Tiles.Tile t066 = new Tiles.House1Floor3();
	Tiles.Tile t067 = new Tiles.House1FloormatN();
	Tiles.Tile t068 = new Tiles.House1FloormatS1();
	Tiles.Tile t069 = new Tiles.House1FloormatS2();
	Tiles.Tile t070 = new Tiles.House1Roof();
	Tiles.Tile t071 = new Tiles.House1RoofE();
	Tiles.Tile t072 = new Tiles.House1RoofN();
	Tiles.Tile t073 = new Tiles.House1RoofNE();
	Tiles.Tile t074 = new Tiles.House1RoofNW();
	Tiles.Tile t075 = new Tiles.House1RoofS();
	Tiles.Tile t076 = new Tiles.House1RoofSE();
	Tiles.Tile t077 = new Tiles.House1RoofSW();
	Tiles.Tile t078 = new Tiles.House1RoofW();
	Tiles.Tile t079 = new Tiles.House1SE();
	Tiles.Tile t080 = new Tiles.House1SW();
	Tiles.Tile t081 = new Tiles.House1W();
	Tiles.Tile t082 = new Tiles.House1WallN();
	Tiles.Tile t083 = new Tiles.House1WallS();
	Tiles.Tile t084 = new Tiles.House1WindowNE();
	Tiles.Tile t085 = new Tiles.House1WindowNW();
	Tiles.Tile t086 = new Tiles.House1WindowSE();
	Tiles.Tile t087 = new Tiles.House1WindowSW();
	Tiles.Tile t088 = new Tiles.LabChimneyE();
	Tiles.Tile t089 = new Tiles.LabChimneyNE();
	Tiles.Tile t090 = new Tiles.LabChimneyNW();
	Tiles.Tile t091 = new Tiles.LabChimneySE();
	Tiles.Tile t092 = new Tiles.LabChimneySW();
	Tiles.Tile t093 = new Tiles.LabChimneyW();
	Tiles.Tile t094 = new Tiles.LabDoor();
	Tiles.Tile t095 = new Tiles.LabE();
	Tiles.Tile t096 = new Tiles.LabFace1();
	Tiles.Tile t097 = new Tiles.LabFace2();
	Tiles.Tile t098 = new Tiles.LabFace3();
	Tiles.Tile t099 = new Tiles.LabFace4();
	Tiles.Tile t100 = new Tiles.LabFace5();
	Tiles.Tile t101 = new Tiles.LabFace6();
	Tiles.Tile t102 = new Tiles.LabFace7();
	Tiles.Tile t103 = new Tiles.LabFace8();
	Tiles.Tile t104 = new Tiles.LabFace9();
	Tiles.Tile t105 = new Tiles.LabRoof();
	Tiles.Tile t106 = new Tiles.LabRoofN();
	Tiles.Tile t107 = new Tiles.LabRoofNW();
	Tiles.Tile t108 = new Tiles.LabRoofS();
	Tiles.Tile t109 = new Tiles.LabRoofSW();
	Tiles.Tile t110 = new Tiles.LabRoofW();
	Tiles.Tile t111 = new Tiles.LabSE();
	Tiles.Tile t112 = new Tiles.LabSW();
	Tiles.Tile t113 = new Tiles.LabW();
	Tiles.Tile t114 = new Tiles.Lawn1();
	Tiles.Tile t115 = new Tiles.Lawn2();
	Tiles.Tile t116 = new Tiles.Lawn3();
	Tiles.Tile t117 = new Tiles.Lawn4();
	Tiles.Tile t118 = new Tiles.Lawn5();
	Tiles.Tile t119 = new Tiles.Lawn6();
	Tiles.Tile t120 = new Tiles.LawnEdgeE();
	Tiles.Tile t121 = new Tiles.LawnEdgeN();
	Tiles.Tile t122 = new Tiles.LawnEdgeNE1();
	Tiles.Tile t123 = new Tiles.LawnEdgeNE2();
	Tiles.Tile t124 = new Tiles.LawnEdgeNW();
	Tiles.Tile t125 = new Tiles.LawnEdgeS1();
	Tiles.Tile t126 = new Tiles.LawnEdgeS2();
	Tiles.Tile t127 = new Tiles.LawnEdgeSE1();
	Tiles.Tile t128 = new Tiles.LawnEdgeSE2();
	Tiles.Tile t129 = new Tiles.LawnEdgeSE3();
	Tiles.Tile t130 = new Tiles.LawnEdgeSW1();
	Tiles.Tile t131 = new Tiles.LawnEdgeSW2();
	Tiles.Tile t132 = new Tiles.LawnEdgeSW3();
	Tiles.Tile t133 = new Tiles.LawnEdgeW();
	Tiles.Tile t134 = new Tiles.LawnPath();
	Tiles.Tile t135 = new Tiles.LawnPathE();
	Tiles.Tile t136 = new Tiles.LawnPathNE1();
	Tiles.Tile t137 = new Tiles.LawnPathNE2();
	Tiles.Tile t138 = new Tiles.LawnPathNW();
	Tiles.Tile t139 = new Tiles.LawnPathSE();
	Tiles.Tile t140 = new Tiles.LawnPathSW();
	Tiles.Tile t141 = new Tiles.LawnPathW();
	Tiles.Tile t142 = new Tiles.LawnToDirtNE();
	Tiles.Tile t143 = new Tiles.LawnToDirtNW();
	Tiles.Tile t144 = new Tiles.LawnToDirtSE();
	Tiles.Tile t145 = new Tiles.LawnToDirtSW();
	Tiles.Tile t146 = new Tiles.LedgeS1();
	Tiles.Tile t147 = new Tiles.LedgeS2();
	Tiles.Tile t148 = new Tiles.LedgeS3();
	Tiles.Tile t149 = new Tiles.MailboxN();
	Tiles.Tile t150 = new Tiles.MailboxS();
	Tiles.Tile t151 = new Tiles.PaintingN();
	Tiles.Tile t152 = new Tiles.PaintingS();
	Tiles.Tile t153 = new Tiles.PicketFence();
	Tiles.Tile t154 = new Tiles.PicketFenceNE();
	Tiles.Tile t155 = new Tiles.PicketFenceNW();
	Tiles.Tile t156 = new Tiles.PottedPlantN();
	Tiles.Tile t157 = new Tiles.PottedPlantS();
	Tiles.Tile t158 = new Tiles.RedFlower();
	Tiles.Tile t159 = new Tiles.SinkNE();
	Tiles.Tile t160 = new Tiles.SinkNW();
	Tiles.Tile t161 = new Tiles.SinkSE();
	Tiles.Tile t162 = new Tiles.SinkSW();
	Tiles.Tile t163 = new Tiles.TallGrass();
	Tiles.Tile t164 = new Tiles.Television();
	Tiles.Tile t165 = new Tiles.TelevisionN();
	Tiles.Tile t166 = new Tiles.TelevisionS();
	Tiles.Tile t167 = new Tiles.TreeE1();
	Tiles.Tile t168 = new Tiles.TreeE2();
	Tiles.Tile t169 = new Tiles.TreeEPicketFence();
	Tiles.Tile t170 = new Tiles.TreeNE();
	Tiles.Tile t171 = new Tiles.TreeNEPicketFence();
	Tiles.Tile t172 = new Tiles.TreeNW();
	Tiles.Tile t173 = new Tiles.TreeNWPicketFence();
	Tiles.Tile t174 = new Tiles.TreeSE();
	Tiles.Tile t175 = new Tiles.TreeSW();
	Tiles.Tile t176 = new Tiles.TreeW1();
	Tiles.Tile t177 = new Tiles.TreeW2();
	Tiles.Tile t178 = new Tiles.TreeWPicketFence();
	Tiles.Tile t179 = new Tiles.Void();
	Tiles.Tile t180 = new Tiles.Water();
	Tiles.Tile t181 = new Tiles.WaterLedgeE();
	Tiles.Tile t182 = new Tiles.WaterLedgeN();
	Tiles.Tile t183 = new Tiles.WaterLedgeNE();
	Tiles.Tile t184 = new Tiles.WaterLedgeNW();
	Tiles.Tile t185 = new Tiles.WaterLedgeW();
	Tiles.Tile t186 = new Tiles.WhiteSign();
	Tiles.Tile t187 = new Tiles.WoodenSign();

    public RedBedroom(Map sourceMap) {
        super(sourceMap);
        setConstantTileProperties(sourceMap);
        setVariableTileProperties(null);

        super.setMaps(
                new Tiles.Tile[][]{
                        {t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179,},
                        {t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179,},
                        {t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179,},
                        {t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179,},
                        {t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179,},
                        {t179, t179, t179, t179, t179, t179, t179, t082, t082, t082, t082, t082, t082, t082, t082, t082, t082, t082, t179, t179, t179, t179, t179, t179, t179,},
                        {t179, t179, t179, t179, t179, t179, t179, t083, t083, t083, t083, t083, t083, t083, t083, t083, t083, t083, t179, t179, t179, t179, t179, t179, t179,},
                        {t179, t179, t179, t179, t179, t179, t179, t065, t065, t065, t013, t012, t065, t065, t065, t065, t067, t065, t179, t179, t179, t179, t179, t179, t179,},
                        {t179, t179, t179, t179, t179, t179, t179, t065, t064, t064, t064, t064, t064, t064, t064, t064, t068, t064, t179, t179, t179, t179, t179, t179, t179,},
                        {t179, t179, t179, t179, t179, t179, t179, t065, t064, t064, t044, t042, t042, t042, t043, t064, t064, t064, t179, t179, t179, t179, t179, t179, t179,},
                        {t179, t179, t179, t179, t179, t179, t179, t065, t064, t066, t048, t040, t040, t040, t041, t064, t064, t064, t179, t179, t179, t179, t179, t179, t179,},
                        {t179, t179, t179, t179, t179, t179, t179, t065, t064, t066, t048, t040, t040, t040, t041, t064, t064, t064, t179, t179, t179, t179, t179, t179, t179,},
                        {t179, t179, t179, t179, t179, t179, t179, t065, t064, t064, t047, t045, t045, t045, t046, t064, t064, t064, t179, t179, t179, t179, t179, t179, t179,},
                        {t179, t179, t179, t179, t179, t179, t179, t065, t064, t064, t064, t064, t064, t064, t064, t064, t064, t064, t179, t179, t179, t179, t179, t179, t179,},
                        {t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179,},
                        {t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179,},
                        {t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179,},
                        {t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179,},
                        {t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179, t179,},
                },
                new Tiles.Tile[][]{
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,},
                        {null, null, null, null, null, null, null, null, null, null, t011, t010, null, null, null, null, null, t015, null, null, null, null, null, null, null,},
                        {null, null, null, null, null, null, null, null, null, t032, t014, t009, null, null, null, null, null, t016, null, null, null, null, null, null, null,},
                        {null, null, null, null, null, null, null, null, null, t033, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,},
                        {null, null, null, null, null, null, null, null, null, null, null, null, t165, null, null, null, null, null, null, null, null, null, null, null, null,},
                        {null, null, null, null, null, null, null, t004, t002, t003, null, null, t164, null, null, null, null, null, null, null, null, null, null, null, null,},
                        {null, null, null, null, null, null, null, t008, t000, t001, null, null, t021, null, null, null, null, null, null, null, null, null, null, null, null,},
                        {null, null, null, null, null, null, null, t007, t005, t006, null, null, t022, null, null, null, null, null, null, null, null, null, null, null, null,},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,},
                });
    }

    public void setConstantTileProperties(Map sourceMap)
    {}

    public void setVariableTileProperties(HashMap eventLog)
    {}

    public String getName()
    {
        return "RedBedroom";
    }
}