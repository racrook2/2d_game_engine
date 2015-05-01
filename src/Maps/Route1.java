package Maps;

/**
 * Area map of Route1
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.*;

public class Route1 extends Map
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
	Tiles.Tile t118 = new Tiles.LawnEdgeE();
	Tiles.Tile t119 = new Tiles.LawnEdgeN();
	Tiles.Tile t120 = new Tiles.LawnEdgeNE1();
	Tiles.Tile t121 = new Tiles.LawnEdgeNE2();
	Tiles.Tile t122 = new Tiles.LawnEdgeNW();
	Tiles.Tile t123 = new Tiles.LawnEdgeS1();
	Tiles.Tile t124 = new Tiles.LawnEdgeS2();
	Tiles.Tile t125 = new Tiles.LawnEdgeSE1();
	Tiles.Tile t126 = new Tiles.LawnEdgeSE2();
	Tiles.Tile t127 = new Tiles.LawnEdgeSE3();
	Tiles.Tile t128 = new Tiles.LawnEdgeSW1();
	Tiles.Tile t129 = new Tiles.LawnEdgeSW2();
	Tiles.Tile t130 = new Tiles.LawnEdgeSW3();
	Tiles.Tile t131 = new Tiles.LawnEdgeW();
	Tiles.Tile t132 = new Tiles.LawnPath();
	Tiles.Tile t133 = new Tiles.LawnPathE();
	Tiles.Tile t134 = new Tiles.LawnPathNE1();
	Tiles.Tile t135 = new Tiles.LawnPathNE2();
	Tiles.Tile t136 = new Tiles.LawnPathNW();
	Tiles.Tile t137 = new Tiles.LawnPathSE();
	Tiles.Tile t138 = new Tiles.LawnPathSW();
	Tiles.Tile t139 = new Tiles.LawnPathW();
	Tiles.Tile t140 = new Tiles.LedgeS1();
	Tiles.Tile t141 = new Tiles.LedgeS2();
	Tiles.Tile t142 = new Tiles.LedgeS3();
	Tiles.Tile t143 = new Tiles.MailboxN();
	Tiles.Tile t144 = new Tiles.MailboxS();
	Tiles.Tile t145 = new Tiles.PaintingN();
	Tiles.Tile t146 = new Tiles.PaintingS();
	Tiles.Tile t147 = new Tiles.PicketFence();
	Tiles.Tile t148 = new Tiles.PicketFenceNE();
	Tiles.Tile t149 = new Tiles.PicketFenceNW();
	Tiles.Tile t150 = new Tiles.PottedPlantN();
	Tiles.Tile t151 = new Tiles.PottedPlantS();
	Tiles.Tile t152 = new Tiles.RedFlower();
	Tiles.Tile t153 = new Tiles.SinkNE();
	Tiles.Tile t154 = new Tiles.SinkNW();
	Tiles.Tile t155 = new Tiles.SinkSE();
	Tiles.Tile t156 = new Tiles.SinkSW();
	Tiles.Tile t157 = new Tiles.TallGrass();
	Tiles.Tile t158 = new Tiles.Television();
	Tiles.Tile t159 = new Tiles.TelevisionN();
	Tiles.Tile t160 = new Tiles.TelevisionS();
	Tiles.Tile t161 = new Tiles.TreeE1();
	Tiles.Tile t162 = new Tiles.TreeE2();
	Tiles.Tile t163 = new Tiles.TreeEPicketFence();
	Tiles.Tile t164 = new Tiles.TreeNE();
	Tiles.Tile t165 = new Tiles.TreeNEPicketFence();
	Tiles.Tile t166 = new Tiles.TreeNW();
	Tiles.Tile t167 = new Tiles.TreeNWPicketFence();
	Tiles.Tile t168 = new Tiles.TreeSE();
	Tiles.Tile t169 = new Tiles.TreeSW();
	Tiles.Tile t170 = new Tiles.TreeW1();
	Tiles.Tile t171 = new Tiles.TreeW2();
	Tiles.Tile t172 = new Tiles.TreeWPicketFence();
	Tiles.Tile t173 = new Tiles.Void();
	Tiles.Tile t174 = new Tiles.Water();
	Tiles.Tile t175 = new Tiles.WaterLedgeE();
	Tiles.Tile t176 = new Tiles.WaterLedgeN();
	Tiles.Tile t177 = new Tiles.WaterLedgeNE();
	Tiles.Tile t178 = new Tiles.WaterLedgeNW();
	Tiles.Tile t179 = new Tiles.WaterLedgeW();
	Tiles.Tile t180 = new Tiles.WhiteSign();
	Tiles.Tile t181 = new Tiles.WoodenSign();
    Tiles.Tile t182 = new Tiles.Lawn5();
    Tiles.Tile t183 = new Tiles.Lawn6();
    Tiles.Tile t184 = new Tiles.LawnToDirtNE();
    Tiles.Tile t185 = new Tiles.LawnToDirtNW();
    Tiles.Tile t186 = new Tiles.LawnToDirtSE();
    Tiles.Tile t187 = new Tiles.LawnToDirtSW();

    public Route1(Map sourceMap)
    {
        super(sourceMap);
        setConstantTileProperties(sourceMap);
        setVariableTileProperties(null);

        super.setMaps(
                new Tiles.Tile[][] {
						{t162, t171, t162, t171, t162, t171, t162, t171, t162, t171, t162, t171, t162, t171, t161, t031, t023, t023, t024, t170, t162, t171, t162, t171, t162, t171, t162, t171, t162, t171, t162, t171, t162, t171, },
						{t168, t169, t168, t169, t168, t169, t168, t169, t168, t169, t168, t169, t168, t169, t168, t031, t023, t023, t024, t169, t168, t169, t168, t169, t168, t169, t168, t169, t168, t169, t168, t169, t168, t169, },
						{t162, t171, t162, t171, t162, t171, t161, t116, t114, t116, t114, t116, t114, t116, t114, t031, t023, t023, t024, t114, t116, t114, t116, t114, t152, t183, t152, t170, t162, t171, t162, t171, t162, t171, },
						{t168, t169, t168, t169, t168, t169, t168, t182, t115, t182, t115, t182, t115, t182, t115, t031, t023, t023, t187, t025, t025, t025, t025, t025, t025, t025, t026, t169, t168, t169, t168, t169, t168, t169, },
						{t162, t171, t162, t171, t162, t171, t161, t116, t114, t116, t114, t116, t114, t170, t161, t030, t028, t028, t028, t028, t028, t028, t028, t184, t023, t023, t024, t170, t162, t171, t162, t171, t162, t171, },
						{t168, t169, t168, t169, t168, t169, t168, t114, t114, t114, t114, t114, t114, t169, t168, t114, t114, t114, t114, t114, t114, t114, t114, t030, t028, t028, t029, t169, t168, t169, t168, t169, t168, t169, },
						{t162, t171, t162, t171, t162, t171, t161, t183, t152, t182, t115, t183, t152, t170, t161, t157, t157, t157, t157, t157, t157, t157, t157, t157, t157, t157, t157, t170, t162, t171, t162, t171, t162, t171, },
						{t168, t169, t168, t169, t168, t169, t168, t152, t183, t116, t114, t152, t116, t169, t168, t157, t157, t157, t157, t157, t157, t157, t157, t157, t157, t157, t157, t169, t168, t169, t168, t169, t168, t169, },
						{t162, t171, t162, t171, t162, t171, t161, t183, t152, t182, t115, t183, t152, t170, t161, t157, t157, t157, t157, t157, t157, t157, t157, t157, t157, t157, t157, t170, t162, t171, t162, t171, t162, t171, },
						{t168, t169, t168, t169, t168, t169, t168, t152, t183, t116, t114, t152, t183, t169, t168, t157, t157, t157, t157, t157, t157, t157, t157, t157, t157, t157, t157, t169, t168, t169, t168, t169, t168, t169, },
						{t162, t171, t162, t171, t162, t171, t161, t114, t114, t114, t114, t114, t114, t170, t161, t157, t157, t157, t157, t157, t157, t157, t157, t157, t157, t157, t157, t170, t162, t171, t162, t171, t162, t171, },
						{t168, t169, t168, t169, t168, t169, t168, t182, t152, t182, t115, t182, t115, t169, t168, t115, t116, t115, t027, t025, t025, t025, t025, t025, t025, t025, t026, t169, t168, t169, t168, t169, t168, t169, },
						{t162, t171, t162, t171, t162, t171, t161, t152, t182, t116, t182, t116, t182, t115, t116, t114, t114, t116, t031, t023, t185, t028, t028, t028, t028, t028, t029, t170, t162, t171, t162, t171, t162, t171, },
						{t168, t169, t168, t169, t168, t169, t168, t182, t152, t182, t115, t182, t115, t116, t182, t115, t115, t182, t030, t028, t029, t157, t157, t157, t157, t157, t157, t169, t168, t169, t168, t169, t168, t169, },
						{t162, t171, t162, t171, t162, t171, t161, t182, t115, t182, t115, t182, t115, t182, t115, t182, t115, t182, t115, t182, t115, t157, t157, t157, t157, t157, t157, t170, t162, t171, t162, t171, t162, t171, },
						{t168, t169, t168, t169, t168, t169, t168, t170, t161, t114, t114, t114, t114, t114, t114, t170, t161, t170, t161, t170, t161, t157, t157, t157, t157, t157, t157, t169, t168, t169, t168, t169, t168, t169, },
						{t162, t171, t162, t171, t162, t171, t161, t169, t168, t116, t115, t116, t115, t116, t115, t169, t168, t169, t168, t169, t168, t157, t157, t157, t157, t157, t157, t170, t162, t171, t162, t171, t162, t171, },
						{t168, t169, t168, t169, t168, t169, t168, t115, t116, t115, t183, t115, t183, t115, t183, t115, t183, t115, t027, t025, t026, t157, t157, t157, t157, t157, t157, t169, t168, t169, t168, t169, t168, t169, },
						{t162, t171, t162, t171, t162, t171, t161, t182, t115, t182, t027, t025, t025, t025, t025, t025, t025, t025, t186, t023, t024, t115, t116, t115, t152, t116, t152, t170, t162, t171, t162, t171, t162, t171, },
						{t168, t169, t168, t169, t168, t169, t168, t116, t114, t116, t031, t023, t023, t185, t028, t028, t028, t028, t028, t028, t029, t116, t115, t152, t116, t152, t115, t169, t168, t169, t168, t169, t168, t169, },
						{t162, t171, t162, t171, t162, t171, t161, t114, t114, t116, t031, t023, t023, t024, t116, t115, t114, t114, t114, t114, t114, t114, t114, t114, t114, t114, t114, t170, t162, t171, t162, t171, t162, t171, },
						{t168, t169, t168, t169, t168, t169, t168, t116, t114, t116, t031, t023, t023, t187, t025, t025, t025, t025, t025, t025, t025, t025, t025, t025, t025, t025, t026, t169, t168, t169, t168, t169, t168, t169, },
						{t162, t171, t162, t171, t162, t171, t161, t116, t114, t183, t030, t028, t028, t028, t028, t028, t028, t028, t028, t028, t028, t028, t028, t184, t023, t023, t024, t170, t162, t171, t162, t171, t162, t171, },
						{t168, t169, t168, t169, t168, t169, t168, t182, t115, t182, t115, t182, t115, t182, t115, t182, t115, t182, t115, t182, t115, t182, t115, t031, t023, t023, t024, t169, t168, t169, t168, t169, t168, t169, },
						{t162, t171, t162, t171, t162, t171, t161, t116, t115, t116, t115, t116, t115, t116, t115, t116, t115, t157, t157, t157, t157, t157, t157, t031, t023, t023, t024, t170, t162, t171, t162, t171, t162, t171, },
						{t168, t169, t168, t169, t168, t169, t168, t170, t161, t170, t161, t170, t161, t170, t161, t170, t161, t157, t157, t157, t157, t157, t157, t031, t023, t023, t024, t169, t168, t169, t168, t169, t168, t169, },
						{t162, t171, t162, t171, t162, t171, t161, t169, t168, t169, t168, t169, t168, t169, t168, t169, t168, t157, t157, t157, t157, t157, t157, t031, t023, t023, t024, t170, t162, t171, t162, t171, t162, t171, },
						{t168, t169, t168, t169, t168, t169, t168, t182, t152, t182, t152, t182, t114, t116, t114, t116, t114, t157, t157, t157, t157, t157, t157, t031, t023, t023, t024, t169, t168, t169, t168, t169, t168, t169, },
						{t162, t171, t162, t171, t162, t171, t161, t152, t116, t152, t182, t183, t115, t182, t115, t182, t115, t157, t157, t157, t157, t157, t157, t031, t023, t023, t024, t170, t162, t171, t162, t171, t162, t171, },
						{t168, t169, t168, t169, t168, t169, t168, t027, t025, t025, t025, t025, t025, t025, t025, t025, t025, t025, t025, t025, t025, t025, t025, t186, t023, t023, t024, t169, t168, t169, t168, t169, t168, t169, },
						{t162, t171, t162, t171, t162, t171, t161, t030, t028, t028, t028, t028, t028, t028, t028, t028, t184, t023, t023, t185, t028, t028, t028, t028, t028, t028, t029, t170, t162, t171, t162, t171, t162, t171, },
						{t168, t169, t168, t169, t168, t169, t168, t114, t114, t114, t114, t114, t116, t116, t180, t114, t031, t023, t023, t024, t114, t114, t114, t114, t114, t114, t114, t169, t168, t169, t168, t169, t168, t169, },
						{t162, t171, t162, t171, t162, t171, t161, t183, t114, t157, t157, t157, t157, t157, t157, t157, t031, t023, t023, t024, t116, t114, t157, t157, t157, t157, t157, t170, t162, t171, t162, t171, t162, t171, },
						{t168, t169, t168, t169, t168, t169, t168, t183, t115, t157, t157, t157, t157, t157, t157, t157, t031, t023, t023, t024, t116, t115, t157, t157, t157, t157, t157, t169, t168, t169, t168, t169, t168, t169, },
						{t162, t171, t162, t171, t162, t171, t161, t157, t157, t157, t157, t157, t157, t157, t114, t152, t030, t028, t028, t029, t157, t157, t157, t157, t157, t152, t116, t170, t162, t171, t162, t171, t162, t171, },
						{t168, t169, t168, t169, t168, t169, t168, t157, t157, t157, t157, t157, t157, t157, t152, t116, t114, t157, t157, t116, t157, t157, t157, t157, t157, t114, t152, t169, t168, t169, t168, t169, t168, t169, },
						{t162, t171, t162, t171, t162, t171, t161, t115, t115, t115, t115, t115, t115, t115, t115, t115, t115, t157, t157, t115, t115, t115, t115, t115, t115, t115, t115, t170, t162, t171, t162, t171, t162, t171, },
						{t168, t169, t168, t169, t168, t169, t168, t116, t115, t116, t115, t116, t115, t116, t115, t115, t165, t157, t157, t167, t115, t116, t115, t116, t115, t116, t115, t169, t168, t169, t168, t169, t168, t169, },
						{t162, t171, t162, t171, t162, t171, t161, t170, t161, t170, t161, t170, t161, t170, t161, t170, t163, t157, t157, t172, t161, t170, t161, t170, t161, t170, t161, t170, t162, t171, t162, t171, t162, t171, },
						{t168, t169, t168, t169, t168, t169, t168, t169, t168, t169, t168, t169, t168, t169, t168, t169, t168, t157, t157, t169, t168, t169, t168, t169, t168, t169, t168, t169, t168, t169, t168, t169, t168, t169, },
                        {t162, t171, t162, t171, t162, t171, t162, t171, t162, t171, t162, t171, t162, t171, t162, t171, t161, t136, t135, t170, t162, t171, t162, t171, t162, t171, t162, t171, t162, t171, t162, t171, t162, t171, },
                        {t168, t169, t168, t169, t168, t169, t168, t169, t168, t169, t168, t169, t168, t169, t168, t169, t168, t139, t133, t169, t168, t169, t168, t169, t168, t169, t168, t169, t168, t169, t168, t169, t168, t169, },
                        {t162, t171, t162, t171, t162, t171, t161, t136, t123, t123, t123, t123, t123, t123, t123, t123, t123, t126, t129, t123, t123, t123, t123, t123, t123, t123, t134, t170, t162, t171, t162, t171, t162, t171, },
                        {t168, t169, t168, t169, t168, t169, t168, t139, t132, t132, t132, t132, t132, t132, t132, t132, t132, t132, t132, t132, t132, t132, t132, t132, t132, t132, t131, t169, t168, t169, t168, t169, t168, t169, },
                        {t162, t171, t162, t171, t162, t171, t161, t139, t122, t119, t078, t070, t070, t070, t071, t120, t132, t122, t119, t078, t070, t070, t070, t071, t120, t132, t131, t170, t162, t171, t162, t171, t162, t171, },
                        {t168, t169, t168, t169, t168, t169, t168, t139, t131, t115, t077, t075, t075, t075, t076, t118, t132, t131, t115, t077, t075, t075, t075, t076, t118, t132, t131, t169, t168, t169, t168, t169, t168, t169, },
                },
                new Tiles.Tile[][] {
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, },
						{t164, t166, t164, t166, t164, t166, t164, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, t166, t164, t166, t164, t166, t164, t166, },
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, },
						{t164, t166, t164, t166, t164, t166, t164, null, null, null, null, null, null, t166, t164, null, null, null, null, null, null, null, null, null, null, null, null, t166, t164, t166, t164, t166, t164, t166, },
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, },
						{t164, t166, t164, t166, t164, t166, t164, t140, t141, t141, t141, t141, t142, t166, t164, t140, t141, t141, t141, t141, t142, null, null, null, null, null, null, t166, t164, t166, t164, t166, t164, t166, },
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, },
						{t164, t166, t164, t166, t164, t166, t164, null, null, null, null, null, null, t166, t164, null, null, null, null, null, null, null, null, null, null, null, null, t166, t164, t166, t164, t166, t164, t166, },
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, },
						{t164, t166, t164, t166, t164, t166, t164, null, null, null, null, null, null, t166, t164, null, null, null, null, null, null, null, null, null, null, null, null, t166, t164, t166, t164, t166, t164, t166, },
						{null, null, null, null, null, null, null, t140, t141, t141, t141, t141, t142, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, },
						{t164, t166, t164, t166, t164, t166, t164, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, t166, t164, t166, t164, t166, t164, t166, },
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, },
						{t164, t166, t164, t166, t164, t166, t164, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, t166, t164, t166, t164, t166, t164, t166, },
						{null, null, null, null, null, null, null, t166, t164, null, null, null, null, null, null, t166, t164, t166, t164, t166, t164, null, null, null, null, null, null, null, null, null, null, null, null, null, },
						{t164, t166, t164, t166, t164, t166, t164, null, null, t140, t141, t141, t141, t141, t142, null, null, null, null, null, null, null, null, null, null, null, null, t166, t164, t166, t164, t166, t164, t166, },
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, },
						{t164, t166, t164, t166, t164, t166, t164, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, t166, t164, t166, t164, t166, t164, t166, },
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, },
						{t164, t166, t164, t166, t164, t166, t164, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, t166, t164, t166, t164, t166, t164, t166, },
						{null, null, null, null, null, null, null, t140, t142, null, t140, t141, t141, t142, null, null, t140, t141, t141, t141, t141, t141, t141, t141, t141, t141, t142, null, null, null, null, null, null, null, },
						{t164, t166, t164, t166, t164, t166, t164, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, t166, t164, t166, t164, t166, t164, t166, },
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, },
						{t164, t166, t164, t166, t164, t166, t164, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, t166, t164, t166, t164, t166, t164, t166, },
						{null, null, null, null, null, null, null, t166, t164, t166, t164, t166, t164, t166, t164, t166, t164, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, },
						{t164, t166, t164, t166, t164, t166, t164, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, t166, t164, t166, t164, t166, t164, t166, },
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, t140, t141, t141, t142, null, null, null, null, null, null, null, },
						{t164, t166, t164, t166, t164, t166, t164, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, t166, t164, t166, t164, t166, t164, t166, },
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, },
						{t164, t166, t164, t166, t164, t166, t164, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, t166, t164, t166, t164, t166, t164, t166, },
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, },
						{t164, t166, t164, t166, t164, t166, t164, t140, t141, t141, t142, null, null, null, null, t140, t141, t141, t141, t141, t141, t141, t141, t141, t141, t141, t142, t166, t164, t166, t164, t166, t164, t166, },
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, },
						{t164, t166, t164, t166, t164, t166, t164, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, t166, t164, t166, t164, t166, t164, t166, },
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, },
						{t164, t166, t164, t166, t164, t166, t164, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, t166, t164, t166, t164, t166, t164, t166, },
						{null, null, null, null, null, null, null, t147, t147, t147, t147, t147, t147, t147, t147, t147, t148, null, null, t149, t147, t147, t147, t147, t147, t147, t147, null, null, null, null, null, null, null, },
						{t164, t166, t164, t166, t164, t166, t164, t166, t164, t166, t164, t166, t164, t166, t164, t166, null, null, null, null, t164, t166, t164, t166, t164, t166, t164, t166, t164, t166, t164, t166, t164, t166, },
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, },
						{t164, t166, t164, t166, t164, t166, t164, t166, t164, t166, t164, t166, t164, t166, t164, t166, t164, null, null, t166, t164, t166, t164, t166, t164, t166, t164, t166, t164, t166, t164, t166, t164, t166, },
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, },
                        {t164, t166, t164, t166, t164, t166, t164, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, t166, t164, t166, t164, t166, t164, t166, },
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, },
                        {t164, t166, t164, t166, t164, t166, t164, null, null, null, t074, t072, t072, t072, t073, null, null, null, null, t074, t072, t072, t072, t073, null, null, null, t166, t164, t166, t164, t166, t164, t166, },
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, },
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, },
                });
    }

    public void setConstantTileProperties(Map sourceMap)
    {
        if (sourceMap != null) {
            t136.setWarpArea(sourceMap);
            t135.setWarpArea(sourceMap);
        }
        else {
            Map palletTown = new PalletTown(this);
            t136.setWarpArea(palletTown);
            t135.setWarpArea(palletTown);
        }
        t136.setWarpPoint(new Point(6, 17));
        t135.setWarpPoint(new Point(6, 18));
        t180.setMessage("ROUTE 1");
    }

    public void setVariableTileProperties(HashMap eventLog)
    {}

    public String getName()
    {
        return "Route1";
    }

    public LinkedList<Pokemon.Pokemon> getPossibleEncounters()
    {
        Pokemon.Pokemon pidgey;
        Pokemon.Pokemon rattata;

        try {
            pidgey = new Pokemon.Pidgey();
            rattata = new Pokemon.Rattata();
        }
        catch (IOException ex) {
            return null;
        }

        return new LinkedList<Pokemon.Pokemon>(Arrays.asList(pidgey, rattata));
    }

    public Image getBattleBackground() throws IOException
    {
        return ImageIO.read(getClass().getResource("/Battle/TallGrass.png"));
    }
}