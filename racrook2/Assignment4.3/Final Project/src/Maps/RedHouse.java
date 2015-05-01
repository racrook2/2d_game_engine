package Maps;

/**
 * Area map of RedHouse
 * @author Ran Crook
 */

import java.awt.*;
import java.util.*;

public class RedHouse extends Map
{
    Tiles.Tile t001 = new Tiles.SinkNE();
    Tiles.Tile t002 = new Tiles.SinkNW();
    Tiles.Tile t003 = new Tiles.SinkSE();
    Tiles.Tile t004 = new Tiles.SinkSW();
    Tiles.Tile t005 = new Tiles.House1WallN();
    Tiles.Tile t006 = new Tiles.House1WallS();
    Tiles.Tile t007 = new Tiles.House1Floor1();
    Tiles.Tile t008 = new Tiles.House1Floor2();
    Tiles.Tile t009 = new Tiles.House1FloormatS2();
    Tiles.Tile t010 = new Tiles.House1Carpet();
    Tiles.Tile t011 = new Tiles.House1CarpetE();
    Tiles.Tile t012 = new Tiles.House1CarpetN();
    Tiles.Tile t013 = new Tiles.House1CarpetNE();
    Tiles.Tile t014 = new Tiles.House1CarpetNW();
    Tiles.Tile t015 = new Tiles.House1CarpetS();
    Tiles.Tile t016 = new Tiles.House1CarpetSE();
    Tiles.Tile t017 = new Tiles.House1CarpetSW();
    Tiles.Tile t018 = new Tiles.House1CarpetW();
    Tiles.Tile t019 = new Tiles.CoffeeTableNE();
    Tiles.Tile t020 = new Tiles.CoffeeTableNW();
    Tiles.Tile t021 = new Tiles.CoffeeTableSE();
    Tiles.Tile t022 = new Tiles.CoffeeTableSW();
    Tiles.Tile t023 = new Tiles.PottedPlantN();
    Tiles.Tile t024 = new Tiles.PottedPlantS();
    Tiles.Tile t025 = new Tiles.House1Chair1();
    Tiles.Tile t026 = new Tiles.House1Chair2();
    Tiles.Tile t027 = new Tiles.FancyShelfE();
    Tiles.Tile t028 = new Tiles.FancyShelfNE();
    Tiles.Tile t029 = new Tiles.FancyShelfNW();
    Tiles.Tile t030 = new Tiles.FancyShelfSE();
    Tiles.Tile t031 = new Tiles.FancyShelfSW();
    Tiles.Tile t032 = new Tiles.FancyShelfW();
    Tiles.Tile t033 = new Tiles.House1WindowNE();
    Tiles.Tile t034 = new Tiles.House1WindowNW();
    Tiles.Tile t035 = new Tiles.House1WindowSE();
    Tiles.Tile t036 = new Tiles.House1WindowSW();
    Tiles.Tile t037 = new Tiles.Television();
    Tiles.Tile t038 = new Tiles.TelevisionN();
    Tiles.Tile t039 = new Tiles.TelevisionS();
    Tiles.Tile t040 = new Tiles.House1FloormatN();
    Tiles.Tile t041 = new Tiles.House1DoormatN();
    Tiles.Tile t042 = new Tiles.House1DoormatNE();
    Tiles.Tile t043 = new Tiles.House1DoormatNW();
    Tiles.Tile t044 = new Tiles.House1DoormatS();
    Tiles.Tile t045 = new Tiles.House1DoormatSE();
    Tiles.Tile t046 = new Tiles.House1DoormatSW();
    Tiles.Tile t047 = new Tiles.Void();
    Tiles.Tile t048 = new Tiles.Woman1(3);
    Tiles.Tile t049 = new Tiles.Woman1Hair(3);

    public RedHouse(Map sourceMap)
    {
        super(sourceMap);
        setConstantTileProperties(sourceMap);
        setVariableTileProperties(null);

        super.setMaps(
                new Tiles.Tile[][] {
                        {t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047},
                        {t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047},
                        {t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047},
                        {t047, t047, t047, t047, t047, t047, t047, t005, t005, t005, t005, t005, t005, t005, t005, t005, t005, t005, t005, t047, t047, t047, t047, t047, t047, t047},
                        {t047, t047, t047, t047, t047, t047, t047, t006, t006, t006, t006, t006, t037, t006, t006, t006, t006, t006, t006, t047, t047, t047, t047, t047, t047, t047},
                        {t047, t047, t047, t047, t047, t047, t047, t004, t003, t031, t030, t008, t039, t008, t008, t008, t040, t008, t008, t047, t047, t047, t047, t047, t047, t047},
                        {t047, t047, t047, t047, t047, t047, t047, t008, t007, t007, t014, t012, t012, t012, t012, t013, t009, t007, t007, t047, t047, t047, t047, t047, t047, t047},
                        {t047, t047, t047, t047, t047, t047, t047, t008, t007, t007, t018, t026, t010, t010, t025, t011, t007, t007, t007, t047, t047, t047, t047, t047, t047, t047},
                        {t047, t047, t047, t047, t047, t047, t047, t008, t007, t007, t018, t026, t010, t010, t025, t011, t007, t007, t007, t047, t047, t047, t047, t047, t047, t047},
                        {t047, t047, t047, t047, t047, t047, t047, t008, t007, t007, t017, t015, t015, t015, t015, t016, t007, t007, t007, t047, t047, t047, t047, t047, t047, t047},
                        {t047, t047, t047, t047, t047, t047, t047, t008, t007, t007, t007, t007, t007, t007, t007, t007, t007, t007, t007, t047, t047, t047, t047, t047, t047, t047},
                        {t047, t047, t047, t047, t047, t047, t047, t008, t007, t043, t041, t042, t007, t007, t007, t007, t007, t007, t007, t047, t047, t047, t047, t047, t047, t047},
                        {t047, t047, t047, t047, t047, t047, t047, t047, t047, t046, t044, t045, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047},
                        {t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047},
                        {t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047},
                        {t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047},
                        {t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047, t047}
                },
                new Tiles.Tile[][] {
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, t029, t028, null, t038, t034, t033, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, t002, t001, t032, t027, null, null, t036, t035, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, t049, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, t020, t019, t048, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, t022, t021, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, t023, null, null, null, null, null, null, null, null, null, null, t023, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, t024, null, null, null, null, null, null, null, null, null, null, t024, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
                });
    }

    public void setConstantTileProperties(Map sourceMap)
    {
        t044.setWarpPoint(new Point(14, 11));
        if (sourceMap != null) {
            t044.setWarpArea(sourceMap);
        }
        else {
            t044.setWarpArea(new PalletTown(null));
        }
        t037.setMessage("There's a movie on TV. Four boys are walking on railroad tracks. I better go too.");
    }

    public void setVariableTileProperties(HashMap eventLog)
    {
        ((Tiles.NPC)t048).setDirection(3);
        ((Tiles.NPC)t049).setDirection(3);
        if (eventLog == null || !(Boolean)eventLog.get("GetFirstPokemon")) {
            t048.setMessage("Right. All boys leave home some day. It said so on TV. PROF.OAK, next door, is looking for you.");
        }
        else {
            t048.setMessage("RED! You should take a quick rest. Oh good! You and your POKEMON are looking great! Take care now!");
        }
    }

    public String getName()
    {
        return "RedHouse";
    }
}