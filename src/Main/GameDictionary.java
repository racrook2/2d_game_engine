package Main;

/**
 * Allows for lookup of Pokemon by name
 * @author Ran Crook
 */

import java.io.IOException;
import java.util.*;

public class GameDictionary
{
    Map dict = new HashMap();

    public GameDictionary() throws IOException
    {
        dict.put("Pidgey", new Pokemon.Pidgey());
        dict.put("Pikachu", new Pokemon.Pikachu());
        dict.put("Rattata", new Pokemon.Rattata());

        dict.put("BlueHouse", new Maps.BlueHouse(null));
        dict.put("PalletTown", new Maps.PalletTown(null));
        dict.put("RedBedroom", new Maps.RedBedroom(null));
        dict.put("RedHouse", new Maps.RedHouse(null));
        dict.put("Route1", new Maps.Route1(null));
    }

    public Object get(String name)
    {
        return dict.get(name);
    }
}