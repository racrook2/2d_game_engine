package Types;

import java.util.*;

/**
 * Class for the Fire type
 * @author Ran Crook
 */

public class Fire extends Type
{
    public Fire()
    {
        super(new LinkedList<String>(Arrays.asList("Rock", "Water", "Ground")),
                new LinkedList<String>(Arrays.asList("Bug", "Fire", "Grass", "Fairy", "Ice", "Steel")),
                new LinkedList<String>());
    }

    public String getName()
    {
        return "Fire";
    }
}