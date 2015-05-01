package Types;

import java.util.*;

/**
 * Class for the Poison type
 * @author Ran Crook
 */

public class Poison extends Type
{
    public Poison()
    {
        super(new LinkedList<String>(Arrays.asList("Ground", "Psychic")),
                new LinkedList<String>(Arrays.asList("Fighting", "Poison", "Bug", "Grass", "Fairy")),
                new LinkedList<String>());
    }

    public String getName()
    {
        return "Poison";
    }
}