package Types;

import java.util.*;

/**
 * Class for the Grass type
 * @author Ran Crook
 */

public class Grass extends Type
{
    public Grass()
    {
        super(new LinkedList<String>(Arrays.asList("Flying", "Fire", "Bug", "Ice", "Poison")),
                new LinkedList<String>(Arrays.asList("Electric", "Grass", "Ground", "Water")),
                new LinkedList<String>());
    }

    public String getName()
    {
        return "Grass";
    }
}