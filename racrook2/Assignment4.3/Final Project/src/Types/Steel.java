package Types;

import java.util.*;

/**
 * Class for the Steel type
 * @author Ran Crook
 */

public class Steel extends Type
{
    public Steel()
    {
        super(new LinkedList<String>(Arrays.asList("Fighting", "Fire", "Ground")),
                new LinkedList<String>(Arrays.asList("Bug", "Dragon", "Fairy", "Flying", "Grass", "Ice", "Normal", "Psychic", "Rock", "Steel")),
                new LinkedList<String>(Arrays.asList("Poison")));
    }

    public String getName()
    {
        return "Steel";
    }
}