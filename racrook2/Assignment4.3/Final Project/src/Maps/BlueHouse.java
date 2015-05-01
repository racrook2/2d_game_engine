package Maps;

/**
 * Area map of BlueHouse
 * @author Ran Crook
 */

import java.awt.*;
import java.util.*;

public class BlueHouse extends Map
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
	Tiles.Tile t023 = new Tiles.DresserN();
	Tiles.Tile t024 = new Tiles.DresserS();
	Tiles.Tile t025 = new Tiles.FancyShelfE();
	Tiles.Tile t026 = new Tiles.FancyShelfNE();
	Tiles.Tile t027 = new Tiles.FancyShelfNW();
	Tiles.Tile t028 = new Tiles.FancyShelfSE();
	Tiles.Tile t029 = new Tiles.FancyShelfSW();
	Tiles.Tile t030 = new Tiles.FancyShelfW();
	Tiles.Tile t031 = new Tiles.House1Carpet();
	Tiles.Tile t032 = new Tiles.House1CarpetE();
	Tiles.Tile t033 = new Tiles.House1CarpetN();
	Tiles.Tile t034 = new Tiles.House1CarpetNE();
	Tiles.Tile t035 = new Tiles.House1CarpetNW();
	Tiles.Tile t036 = new Tiles.House1CarpetS();
	Tiles.Tile t037 = new Tiles.House1CarpetSE();
	Tiles.Tile t038 = new Tiles.House1CarpetSW();
	Tiles.Tile t039 = new Tiles.House1CarpetW();
	Tiles.Tile t040 = new Tiles.House1Chair1();
	Tiles.Tile t041 = new Tiles.House1Chair2();
	Tiles.Tile t042 = new Tiles.House1Door();
	Tiles.Tile t043 = new Tiles.House1DoormatN();
	Tiles.Tile t044 = new Tiles.House1DoormatNE();
	Tiles.Tile t045 = new Tiles.House1DoormatNW();
	Tiles.Tile t046 = new Tiles.House1DoormatS();
	Tiles.Tile t047 = new Tiles.House1DoormatSE();
	Tiles.Tile t048 = new Tiles.House1DoormatSW();
	Tiles.Tile t049 = new Tiles.House1E();
	Tiles.Tile t050 = new Tiles.House1Face1();
	Tiles.Tile t051 = new Tiles.House1Face2();
	Tiles.Tile t052 = new Tiles.House1Face3();
	Tiles.Tile t053 = new Tiles.House1Face4();
	Tiles.Tile t054 = new Tiles.House1Face5();
	Tiles.Tile t055 = new Tiles.House1Floor1();
	Tiles.Tile t056 = new Tiles.House1Floor2();
	Tiles.Tile t057 = new Tiles.House1Floor3();
	Tiles.Tile t058 = new Tiles.House1FloormatN();
	Tiles.Tile t059 = new Tiles.House1FloormatS1();
	Tiles.Tile t060 = new Tiles.House1FloormatS2();
	Tiles.Tile t061 = new Tiles.House1Roof();
	Tiles.Tile t062 = new Tiles.House1RoofE();
	Tiles.Tile t063 = new Tiles.House1RoofN();
	Tiles.Tile t064 = new Tiles.House1RoofNE();
	Tiles.Tile t065 = new Tiles.House1RoofNW();
	Tiles.Tile t066 = new Tiles.House1RoofS();
	Tiles.Tile t067 = new Tiles.House1RoofSE();
	Tiles.Tile t068 = new Tiles.House1RoofSW();
	Tiles.Tile t069 = new Tiles.House1RoofW();
	Tiles.Tile t070 = new Tiles.House1SE();
	Tiles.Tile t071 = new Tiles.House1SW();
	Tiles.Tile t072 = new Tiles.House1W();
	Tiles.Tile t073 = new Tiles.House1WallN();
	Tiles.Tile t074 = new Tiles.House1WallS();
	Tiles.Tile t075 = new Tiles.House1WindowNE();
	Tiles.Tile t076 = new Tiles.House1WindowNW();
	Tiles.Tile t077 = new Tiles.House1WindowSE();
	Tiles.Tile t078 = new Tiles.House1WindowSW();
	Tiles.Tile t079 = new Tiles.LabChimneyE();
	Tiles.Tile t080 = new Tiles.LabChimneyNE();
	Tiles.Tile t081 = new Tiles.LabChimneyNW();
	Tiles.Tile t082 = new Tiles.LabChimneySE();
	Tiles.Tile t083 = new Tiles.LabChimneySW();
	Tiles.Tile t084 = new Tiles.LabChimneyW();
	Tiles.Tile t085 = new Tiles.LabDoor();
	Tiles.Tile t086 = new Tiles.LabE();
	Tiles.Tile t087 = new Tiles.LabFace1();
	Tiles.Tile t088 = new Tiles.LabFace2();
	Tiles.Tile t089 = new Tiles.LabFace3();
	Tiles.Tile t090 = new Tiles.LabFace4();
	Tiles.Tile t091 = new Tiles.LabFace5();
	Tiles.Tile t092 = new Tiles.LabFace6();
	Tiles.Tile t093 = new Tiles.LabFace7();
	Tiles.Tile t094 = new Tiles.LabFace8();
	Tiles.Tile t095 = new Tiles.LabFace9();
	Tiles.Tile t096 = new Tiles.LabRoof();
	Tiles.Tile t097 = new Tiles.LabRoofN();
	Tiles.Tile t098 = new Tiles.LabRoofNW();
	Tiles.Tile t099 = new Tiles.LabRoofS();
	Tiles.Tile t100 = new Tiles.LabRoofSW();
	Tiles.Tile t101 = new Tiles.LabRoofW();
	Tiles.Tile t102 = new Tiles.LabSE();
	Tiles.Tile t103 = new Tiles.LabSW();
	Tiles.Tile t104 = new Tiles.LabW();
	Tiles.Tile t105 = new Tiles.Lawn1();
	Tiles.Tile t106 = new Tiles.Lawn2();
	Tiles.Tile t107 = new Tiles.Lawn3();
	Tiles.Tile t108 = new Tiles.Lawn4();
	Tiles.Tile t109 = new Tiles.LawnEdgeE();
	Tiles.Tile t110 = new Tiles.LawnEdgeN();
	Tiles.Tile t111 = new Tiles.LawnEdgeNE1();
	Tiles.Tile t112 = new Tiles.LawnEdgeNE2();
	Tiles.Tile t113 = new Tiles.LawnEdgeNW();
	Tiles.Tile t114 = new Tiles.LawnEdgeS1();
	Tiles.Tile t115 = new Tiles.LawnEdgeS2();
	Tiles.Tile t116 = new Tiles.LawnEdgeSE1();
	Tiles.Tile t117 = new Tiles.LawnEdgeSE2();
	Tiles.Tile t118 = new Tiles.LawnEdgeSE3();
	Tiles.Tile t119 = new Tiles.LawnEdgeSW1();
	Tiles.Tile t120 = new Tiles.LawnEdgeSW2();
	Tiles.Tile t121 = new Tiles.LawnEdgeSW3();
	Tiles.Tile t122 = new Tiles.LawnEdgeW();
	Tiles.Tile t123 = new Tiles.LawnPath();
	Tiles.Tile t124 = new Tiles.LawnPathE();
	Tiles.Tile t125 = new Tiles.LawnPathNE1();
	Tiles.Tile t126 = new Tiles.LawnPathNE2();
	Tiles.Tile t127 = new Tiles.LawnPathNW();
	Tiles.Tile t128 = new Tiles.LawnPathSE();
	Tiles.Tile t129 = new Tiles.LawnPathSW();
	Tiles.Tile t130 = new Tiles.LawnPathW();
	Tiles.Tile t131 = new Tiles.MailboxN();
	Tiles.Tile t132 = new Tiles.MailboxS();
	Tiles.Tile t133 = new Tiles.PaintingN();
	Tiles.Tile t134 = new Tiles.PaintingS();
	Tiles.Tile t135 = new Tiles.PicketFence();
	Tiles.Tile t136 = new Tiles.PottedPlantN();
	Tiles.Tile t137 = new Tiles.PottedPlantS();
	Tiles.Tile t138 = new Tiles.RedFlower();
	Tiles.Tile t139 = new Tiles.SinkNE();
	Tiles.Tile t140 = new Tiles.SinkNW();
	Tiles.Tile t141 = new Tiles.SinkSE();
	Tiles.Tile t142 = new Tiles.SinkSW();
	Tiles.Tile t143 = new Tiles.Television();
	Tiles.Tile t144 = new Tiles.TelevisionN();
	Tiles.Tile t145 = new Tiles.TelevisionS();
	Tiles.Tile t146 = new Tiles.TreeE1();
	Tiles.Tile t147 = new Tiles.TreeE2();
	Tiles.Tile t148 = new Tiles.TreeNE();
	Tiles.Tile t149 = new Tiles.TreeNW();
	Tiles.Tile t150 = new Tiles.TreeSE();
	Tiles.Tile t151 = new Tiles.TreeSW();
	Tiles.Tile t152 = new Tiles.TreeW1();
	Tiles.Tile t153 = new Tiles.TreeW2();
	Tiles.Tile t154 = new Tiles.Void();
	Tiles.Tile t155 = new Tiles.Water();
	Tiles.Tile t156 = new Tiles.WaterLedgeE();
	Tiles.Tile t157 = new Tiles.WaterLedgeN();
	Tiles.Tile t158 = new Tiles.WaterLedgeNE();
	Tiles.Tile t159 = new Tiles.WaterLedgeNW();
	Tiles.Tile t160 = new Tiles.WaterLedgeW();
	Tiles.Tile t161 = new Tiles.WhiteSign();
	Tiles.Tile t162 = new Tiles.WoodenSign();

    public BlueHouse(Map sourceMap)
    {
        super(sourceMap);
        setConstantTileProperties(sourceMap);
        setVariableTileProperties(null);

        super.setMaps(
                new Tiles.Tile[][] {
                        {t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154},
                        {t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154},
                        {t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154},
						{t154, t154, t154, t154, t154, t154, t154, t073, t073, t073, t073, t073, t073, t073, t073, t073, t073, t073, t073, t073, t154, t154, t154, t154, t154, t154, t154},
						{t154, t154, t154, t154, t154, t154, t154, t074, t074, t074, t074, t074, t143, t074, t074, t074, t074, t074, t074, t074, t154, t154, t154, t154, t154, t154, t154},
						{t154, t154, t154, t154, t154, t154, t154, t142, t141, t029, t028, t056, t145, t056, t056, t056, t056, t056, t013, t012, t154, t154, t154, t154, t154, t154, t154},
						{t154, t154, t154, t154, t154, t154, t154, t056, t055, t055, t055, t035, t033, t033, t033, t033, t034, t055, t055, t055, t154, t154, t154, t154, t154, t154, t154},
						{t154, t154, t154, t154, t154, t154, t154, t056, t055, t055, t055, t039, t041, t031, t031, t040, t032, t055, t055, t055, t154, t154, t154, t154, t154, t154, t154},
						{t154, t154, t154, t154, t154, t154, t154, t056, t055, t055, t055, t039, t041, t031, t031, t040, t032, t055, t055, t055, t154, t154, t154, t154, t154, t154, t154},
						{t154, t154, t154, t154, t154, t154, t154, t056, t055, t055, t055, t038, t036, t036, t036, t036, t037, t055, t055, t055, t154, t154, t154, t154, t154, t154, t154},
						{t154, t154, t154, t154, t154, t154, t154, t056, t055, t055, t055, t055, t055, t055, t055, t055, t055, t055, t055, t055, t154, t154, t154, t154, t154, t154, t154},
						{t154, t154, t154, t154, t154, t154, t154, t056, t055, t055, t045, t043, t044, t055, t055, t055, t055, t055, t055, t055, t154, t154, t154, t154, t154, t154, t154},
						{t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t048, t046, t047, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154},
                        {t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154},
                        {t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154},
                        {t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154},
                        {t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154, t154}
				},
                new Tiles.Tile[][] {
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, t027, t026, null, t144, t076, t075, null, t133, null, t011, t010, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, t140, t139, t030, t025, null, null, t078, t077, null, t134, null, t014, t009, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, t018, t017, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, t020, t019, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, t136, null, null, null, null, null, null, null, null, null, null, null, t136, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, t137, null, null, null, null, null, null, null, null, null, null, null, t137, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
				});
    }

    public void setConstantTileProperties(Map sourceMap)
    {
        t046.setWarpPoint(new Point(14, 20));
        if (sourceMap != null) {
            t046.setWarpArea(sourceMap);
        }
        else {
            t046.setWarpArea(new PalletTown(null));
        }
        t134.setMessage("It's a big map! This is useful!");
    }

    public void setVariableTileProperties(HashMap eventLog)
    {}

    public String getName()
    {
        return "BlueHouse";
    }
}