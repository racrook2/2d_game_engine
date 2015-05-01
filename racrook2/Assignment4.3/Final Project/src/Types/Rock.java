package Types;

import java.util.*;

/**
 * Class for the Rock type
 * @author Ran Crook
 */

public class Rock extends Type
{
    public Rock()
    {
        super(new LinkedList<String>(Arrays.asList("Fighting", "Steel", "Water", "Grass", "Ground")),
                new LinkedList<String>(Arrays.asList("Flying", "Fire", "Normal", "Poison")),
                new LinkedList<String>());
    }

    public String getName()
    {
        return "Rock";
    }
}