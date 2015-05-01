package Types;

import java.util.*;

/**
 * Class for the Dragon type
 * @author Ran Crook
 */

public class Dragon extends Type
{
    public Dragon()
    {
        super(new LinkedList<String>(Arrays.asList("Dragon", "Ice", "Fairy")),
                new LinkedList<String>(Arrays.asList("Water", "Grass", "Fire", "Electric")),
                new LinkedList<String>());
    }

    public String getName()
    {
        return "Dragon";
    }
}