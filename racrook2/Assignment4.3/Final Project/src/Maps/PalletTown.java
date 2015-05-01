package Maps;

/**
 * Area map of PalletTown
 * @author Ran Crook
 */

import Events.GetFirstPokemon;

import java.awt.*;
import java.util.*;

public class PalletTown extends Map
{
    Tiles.Tile t001 = new Tiles.House1Door();
    Tiles.Tile t002 = new Tiles.House1E();
    Tiles.Tile t003 = new Tiles.House1Face1();
    Tiles.Tile t004 = new Tiles.House1Face2();
    Tiles.Tile t005 = new Tiles.House1Face3();
    Tiles.Tile t006 = new Tiles.House1Face4();
    Tiles.Tile t007 = new Tiles.House1Face5();
    Tiles.Tile t008 = new Tiles.House1Roof();
    Tiles.Tile t009 = new Tiles.House1RoofE();
    Tiles.Tile t010 = new Tiles.House1RoofN();
    Tiles.Tile t011 = new Tiles.House1RoofNE();
    Tiles.Tile t012 = new Tiles.House1RoofNW();
    Tiles.Tile t013 = new Tiles.House1RoofS();
    Tiles.Tile t014 = new Tiles.House1RoofSE();
    Tiles.Tile t015 = new Tiles.House1RoofSW();
    Tiles.Tile t016 = new Tiles.House1RoofW();
    Tiles.Tile t017 = new Tiles.House1SE();
    Tiles.Tile t018 = new Tiles.House1SW();
    Tiles.Tile t019 = new Tiles.House1W();
    Tiles.Tile t020 = new Tiles.LabChimneyE();
    Tiles.Tile t021 = new Tiles.LabChimneyNE();
    Tiles.Tile t022 = new Tiles.LabChimneyNW();
    Tiles.Tile t023 = new Tiles.LabChimneySE();
    Tiles.Tile t024 = new Tiles.LabChimneySW();
    Tiles.Tile t025 = new Tiles.LabChimneyW();
    Tiles.Tile t026 = new Tiles.LabDoor();
    Tiles.Tile t027 = new Tiles.LabE();
    Tiles.Tile t028 = new Tiles.LabFace1();
    Tiles.Tile t029 = new Tiles.LabFace2();
    Tiles.Tile t030 = new Tiles.LabFace3();
    Tiles.Tile t031 = new Tiles.LabFace4();
    Tiles.Tile t032 = new Tiles.LabFace5();
    Tiles.Tile t033 = new Tiles.LabFace6();
    Tiles.Tile t034 = new Tiles.LabFace7();
    Tiles.Tile t035 = new Tiles.LabFace8();
    Tiles.Tile t036 = new Tiles.LabFace9();
    Tiles.Tile t037 = new Tiles.LabRoofN();
    Tiles.Tile t038 = new Tiles.LabRoofNW();
    Tiles.Tile t039 = new Tiles.LabRoofS();
    Tiles.Tile t040 = new Tiles.LabRoofSW();
    Tiles.Tile t041 = new Tiles.LabRoofW();
    Tiles.Tile t042 = new Tiles.LabSE();
    Tiles.Tile t043 = new Tiles.LabSW();
    Tiles.Tile t044 = new Tiles.LabW();
    Tiles.Tile t045 = new Tiles.Lawn1();
    Tiles.Tile t046 = new Tiles.Lawn2();
    Tiles.Tile t047 = new Tiles.Lawn3();
    Tiles.Tile t048 = new Tiles.Lawn4();
    Tiles.Tile t049 = new Tiles.LawnEdgeE();
    Tiles.Tile t050 = new Tiles.LawnEdgeN();
    Tiles.Tile t051 = new Tiles.LawnEdgeNE1();
    Tiles.Tile t052 = new Tiles.LawnEdgeNW();
    Tiles.Tile t053 = new Tiles.LawnEdgeS1();
    Tiles.Tile t054 = new Tiles.LawnEdgeSE1();
    Tiles.Tile t055 = new Tiles.LawnEdgeSW1();
    Tiles.Tile t056 = new Tiles.LawnEdgeW();
    Tiles.Tile t057 = new Tiles.LawnPath();
    Tiles.Tile t058 = new Tiles.LawnPathNE1();
    Tiles.Tile t059 = new Tiles.LawnPathNW();
    Tiles.Tile t060 = new Tiles.LawnPathSE();
    Tiles.Tile t061 = new Tiles.LawnPathSW();
    Tiles.Tile t062 = new Tiles.MailboxN();
    Tiles.Tile t063 = new Tiles.MailboxS();
    Tiles.Tile t064 = new Tiles.PicketFence();
    Tiles.Tile t065 = new Tiles.RedFlower();
    Tiles.Tile t066 = new Tiles.TreeE1();
    Tiles.Tile t067 = new Tiles.TreeNE();
    Tiles.Tile t068 = new Tiles.TreeNW();
    Tiles.Tile t069 = new Tiles.TreeSE();
    Tiles.Tile t070 = new Tiles.TreeSW();
    Tiles.Tile t071 = new Tiles.TreeW1();
    Tiles.Tile t072 = new Tiles.Water();
    Tiles.Tile t073 = new Tiles.WaterLedgeE();
    Tiles.Tile t074 = new Tiles.WaterLedgeN();
    Tiles.Tile t075 = new Tiles.WaterLedgeNE();
    Tiles.Tile t076 = new Tiles.WaterLedgeNW();
    Tiles.Tile t077 = new Tiles.WaterLedgeW();
    Tiles.Tile t078 = new Tiles.WhiteSign();
    Tiles.Tile t079 = new Tiles.WoodenSign();
    Tiles.Tile t080 = new Tiles.LawnPathE();
    Tiles.Tile t081 = new Tiles.LawnPathNE2();
    Tiles.Tile t082 = new Tiles.LawnPathW();
    Tiles.Tile t083 = new Tiles.LawnEdgeSE2();
    Tiles.Tile t084 = new Tiles.LawnEdgeSW2();
    Tiles.Tile t085 = new Tiles.TreeE2();
    Tiles.Tile t086 = new Tiles.TreeW2();
    Tiles.Tile t087 = new Tiles.LabRoof();
    Tiles.Tile t088 = new Tiles.LawnEdgeS2();
    Tiles.Tile t089 = new Tiles.LawnEdgeSE3();
    Tiles.Tile t090 = new Tiles.LawnEdgeSW3();
    Tiles.Tile t091 = new Tiles.LawnEdgeNE2();
    Tiles.Tile t092 = new Tiles.House1Door();
    Tiles.Tile t093 = new Tiles.MailboxS();
    Tiles.Tile t094 = new Tiles.WhiteSign();
    Tiles.Tile t096 = new Tiles.TreeEPicketFence();
    Tiles.Tile t097 = new Tiles.TreeWPicketFence();
    Tiles.Tile t098 = new Tiles.LawnPathNW();
    Tiles.Tile t099 = new Tiles.TallGrass();
    Tiles.Tile t100 = new Tiles.TallGrass();
    Tiles.Tile t101 = new Tiles.LawnPathW();
    Tiles.Tile t114 = new Tiles.Lawn1();
    Tiles.Tile t115 = new Tiles.Lawn2();
    Tiles.Tile t116 = new Tiles.Lawn3();
    Tiles.Tile t157 = new Tiles.TallGrass();
    Tiles.Tile t165 = new Tiles.TreeNEPicketFence();
    Tiles.Tile t167 = new Tiles.TreeNWPicketFence();
    Tiles.Tile t148 = new Tiles.PicketFenceNE();
    Tiles.Tile t149 = new Tiles.PicketFenceNW();
    Tiles.Tile t150 = new Tiles.DirtPathS();
    Tiles.Tile t151 = new Tiles.DirtPathSE();
    Tiles.Tile t152 = new Tiles.DirtPathSW();

    public PalletTown(Map sourceMap)
    {
        super(sourceMap);
        setConstantTileProperties(sourceMap);
        setVariableTileProperties(null);

        super.setMaps(
        new Tiles.Tile[][] {
            {t085, t086, t085, t086, t085, t086, t085, t157, t157, t157, t157, t157, t157, t157, t045, t065, t152, t150, t150, t151, t157, t157, t157, t157, t157, t065, t116, t070, t085, t086, t085, t086, t085, t086},
            {t069, t070, t069, t070, t069, t070, t069, t157, t157, t157, t157, t157, t157, t157, t065, t116, t047, t157, t157, t116, t157, t157, t157, t157, t157, t114, t065, t070, t069, t070, t069, t070, t069, t070},
            {t085, t086, t085, t086, t085, t086, t066, t115, t115, t115, t115, t115, t115, t115, t115, t115, t115, t157, t157, t115, t115, t115, t115, t115, t115, t115, t115, t071, t085, t086, t085, t086, t085, t086},
            {t069, t070, t069, t070, t069, t070, t069, t116, t115, t116, t115, t116, t115, t116, t115, t115, t165, t157, t157, t167, t115, t116, t115, t116, t115, t116, t115, t070, t069, t070, t069, t070, t069, t070},
            {t085, t086, t085, t086, t085, t086, t085, t071, t066, t071, t066, t071, t066, t071, t066, t071, t096, t157, t157, t097, t066, t071, t066, t071, t066, t071, t066, t071, t085, t086, t085, t086, t085, t086},
            {t069, t070, t069, t070, t069, t070, t069, t070, t069, t070, t069, t070, t069, t070, t069, t070, t069, t099, t100, t070, t069, t070, t069, t070, t069, t070, t069, t070, t069, t070, t069, t070, t069, t070},
            {t085, t086, t085, t086, t085, t086, t085, t086, t085, t086, t085, t086, t085, t086, t085, t086, t066, t098, t081, t071, t085, t086, t085, t086, t085, t086, t085, t086, t085, t086, t085, t086, t085, t086},
            {t069, t070, t069, t070, t069, t070, t069, t070, t069, t070, t069, t070, t069, t070, t069, t070, t069, t101, t080, t070, t069, t070, t069, t070, t069, t070, t069, t070, t069, t070, t069, t070, t069, t070},
            {t085, t086, t085, t086, t085, t086, t066, t059, t053, t053, t053, t053, t053, t053, t053, t053, t053, t083, t084, t053, t053, t053, t053, t053, t053, t053, t058, t071, t085, t086, t085, t086, t085, t086},
            {t069, t070, t069, t070, t069, t070, t069, t082, t057, t057, t057, t057, t057, t057, t057, t057, t057, t057, t057, t057, t057, t057, t057, t057, t057, t057, t056, t070, t069, t070, t069, t070, t069, t070},
            {t085, t086, t085, t086, t085, t086, t066, t082, t052, t050, t016, t008, t008, t008, t009, t051, t057, t052, t050, t016, t008, t008, t008, t009, t051, t057, t056, t071, t085, t086, t085, t086, t085, t086},
            {t069, t070, t069, t070, t069, t070, t069, t082, t056, t046, t015, t013, t013, t013, t014, t049, t057, t056, t046, t015, t013, t013, t013, t014, t049, t057, t056, t070, t069, t070, t069, t070, t069, t070},
            {t085, t086, t085, t086, t085, t086, t066, t082, t056, t048, t048, t003, t004, t005, t002, t049, t057, t056, t048, t048, t003, t004, t005, t002, t049, t057, t056, t071, t085, t086, t085, t086, t085, t086},
            {t069, t070, t069, t070, t069, t070, t069, t082, t056, t048, t048, t001, t006, t007, t017, t049, t057, t056, t048, t048, t092, t006, t007, t017, t049, t057, t056, t070, t069, t070, t069, t070, t069, t070},
            {t085, t086, t085, t086, t085, t086, t066, t082, t055, t053, t054, t057, t055, t053, t053, t054, t057, t055, t053, t054, t057, t055, t053, t053, t054, t057, t056, t071, t085, t086, t085, t086, t085, t086},
            {t069, t070, t069, t070, t069, t070, t069, t082, t057, t057, t057, t057, t057, t057, t057, t057, t057, t057, t057, t057, t057, t057, t057, t057, t057, t057, t056, t070, t069, t070, t069, t070, t069, t070},
            {t085, t086, t085, t086, t085, t086, t066, t082, t057, t057, t057, t057, t057, t057, t057, t057, t057, t052, t041, t087, t087, t087, t087, t025, t020, t091, t056, t071, t085, t086, t085, t086, t085, t086},
            {t069, t070, t069, t070, t069, t070, t069, t082, t057, t052, t050, t050, t050, t050, t050, t051, t057, t056, t040, t039, t039, t039, t039, t024, t023, t082, t056, t070, t069, t070, t069, t070, t069, t070},
            {t085, t086, t085, t086, t085, t086, t066, t082, t057, t056, t065, t065, t065, t065, t046, t049, t057, t056, t044, t028, t029, t030, t031, t032, t027, t082, t056, t071, t085, t086, t085, t086, t085, t086},
            {t069, t070, t069, t070, t069, t070, t069, t082, t057, t056, t065, t065, t065, t065, t047, t049, t057, t056, t043, t033, t034, t026, t035, t036, t042, t082, t056, t070, t069, t070, t069, t070, t069, t070},
            {t085, t086, t085, t086, t085, t086, t066, t082, t057, t056, t048, t045, t046, t045, t046, t049, t057, t055, t053, t053, t054, t057, t055, t053, t053, t083, t056, t071, t085, t086, t085, t086, t085, t086},
            {t069, t070, t069, t070, t069, t070, t069, t082, t057, t055, t053, t053, t053, t053, t053, t054, t057, t052, t050, t050, t050, t050, t050, t050, t051, t057, t056, t070, t069, t070, t069, t070, t069, t070},
            {t085, t086, t085, t086, t085, t086, t066, t082, t057, t057, t057, t057, t057, t057, t057, t057, t057, t090, t088, t088, t088, t088, t088, t088, t089, t057, t056, t071, t085, t086, t085, t086, t085, t086},
            {t069, t070, t069, t070, t069, t070, t069, t061, t050, t050, t050, t050, t050, t074, t074, t057, t057, t057, t057, t057, t057, t057, t057, t057, t057, t057, t056, t070, t069, t070, t069, t070, t069, t070},
            {t085, t086, t085, t086, t085, t086, t066, t046, t046, t045, t046, t045, t077, t072, t072, t073, t050, t050, t050, t050, t050, t050, t050, t050, t050, t050, t060, t071, t085, t086, t085, t086, t085, t086},
            {t069, t070, t069, t070, t069, t070, t069, t046, t047, t046, t047, t046, t077, t072, t072, t073, t046, t047, t046, t047, t046, t047, t046, t047, t046, t047, t046, t070, t069, t070, t069, t070, t069, t070}
        },
        new Tiles.Tile[][] {
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {t067, t068, t067, t068, t067, t068, t067, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, t068, t067, t068, t067, t068, t067, t068},
            {null, null, null, null, null, null, null, t064, t064, t064, t064, t064, t064, t064, t064, t064, t148, null, null, t149, t064, t064, t064, t064, t064, t064, t064, null, null, null, null, null, null, null},
            {t067, t068, t067, t068, t067, t068, t067, t068, t067, t068, t067, t068, t067, t068, t067, t068, t067, null, null, t068, t067, t068, t067, t068, t067, t068, t067, t068, t067, t068, t067, t068, t067, t068},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {t067, t068, t067, t068, t067, t068, t067, t068, t067, t068, t067, t068, t067, t068, t067, t068, t067, null, null, t068, t067, t068, t067, t068, t067, t068, t067, t068, t067, t068, t067, t068, t067, t068},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {t067, t068, t067, t068, t067, t068, t067, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, t068, t067, t068, t067, t068, t067, t068},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {t067, t068, t067, t068, t067, t068, t067, null, null, null, t012, t010, t010, t010, t011, null, null, null, null, t012, t010, t010, t010, t011, null, null, null, t068, t067, t068, t067, t068, t067, t068},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {t067, t068, t067, t068, t067, t068, t067, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, t068, t067, t068, t067, t068, t067, t068},
            {null, null, null, null, null, null, null, null, null, t062, t019, null, null, null, null, null, null, null, t062, t019, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {t067, t068, t067, t068, t067, t068, t067, null, null, t063, t018, null, null, null, null, null, null, null, t093, t018, null, null, null, null, null, null, null, t068, t067, t068, t067, t068, t067, t068},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {t067, t068, t067, t068, t067, t068, t067, null, null, null, null, null, null, null, null, null, null, null, t038, t037, t037, t037, t037, t022, t021, null, null, t068, t067, t068, t067, t068, t067, t068},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {t067, t068, t067, t068, t067, t068, t067, null, null, null, t064, t064, t064, t064, t078, null, null, null, null, null, null, null, null, null, null, null, null, t068, t067, t068, t067, t068, t067, t068},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {t067, t068, t067, t068, t067, t068, t067, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, t068, t067, t068, t067, t068, t067, t068},
            {null, null, null, null, null, null, null, null, null, null, t079, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {t067, t068, t067, t068, t067, t068, t067, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, t068, t067, t068, t067, t068, t067, t068},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, t064, t064, t064, t094, t064, t064, null, null, null, null, null, null, null, null, null, null},
            {t067, t068, t067, t068, t067, t068, t067, null, null, null, null, null, t076, null, null, t075, null, null, null, null, null, null, null, null, null, null, null, t068, t067, t068, t067, t068, t067, t068},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {t067, t068, t067, t068, t067, t068, t067, t068, t067, t068, t067, null, null, null, null, null, null, null, null, null, null, null, null, t068, t067, t068, t067, t068, t067, t068, t067, t068, t067, t068}
        });
    }

    public void setConstantTileProperties(Map sourceMap)
    {
        t063.setMessage("RED's house");
        t093.setMessage("BLUE's house");
        t078.setMessage("PALLET TOWN");
        t094.setMessage("OAK POKéMON Research Lab");
        t079.setMessage("Press START to open the MENU.");

        if (sourceMap != null) {
            if (sourceMap.getName().equals("RedHouse")) {
                t001.setWarpArea(sourceMap);
                t092.setWarpArea(new BlueHouse(this));
                Map route1 = new Route1(this);
                t100.setWarpArea(route1);
                t099.setWarpArea(route1);
            }
            else if (sourceMap.getName().equals("BlueHouse")) {
                t001.setWarpArea(new RedHouse(this));
                t092.setWarpArea(sourceMap);
                Map route1 = new Route1(this);
                t100.setWarpArea(route1);
                t099.setWarpArea(route1);
            }
            else {
                t001.setWarpArea(new RedHouse(this));
                t092.setWarpArea(new BlueHouse(this));
                t100.setWarpArea(sourceMap);
                t099.setWarpArea(sourceMap);
            }
        }
        else {
            t001.setWarpArea(new RedHouse(this));
            t092.setWarpArea(new BlueHouse(this));
            Map route1 = new Route1(this);
            t100.setWarpArea(route1);
            t099.setWarpArea(route1);
        }
        t001.setWarpPoint(new Point(11, 10));
        t092.setWarpPoint(new Point(11, 11));
        t100.setWarpPoint(new Point(39, 18));
        t099.setWarpPoint(new Point(39, 17));

        t101.setEvent(new GetFirstPokemon(0));
        t080.setEvent(new GetFirstPokemon(1));
    }

    public void setVariableTileProperties(HashMap eventLog)
    {}

    public String getName()
    {
        return "PalletTown";
    }
}