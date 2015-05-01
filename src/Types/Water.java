package Types;

import java.util.*;

/**
 * Class for the Water type
 * @author Ran Crook
 */

public class Water extends Type
{
    public Water()
    {
        super(new LinkedList<String>(Arrays.asList("Grass", "Electric")),
                new LinkedList<String>(Arrays.asList("Fire", "Ice", "Steel", "Water")),
                new LinkedList<String>());
    }

    public String getName()
    {
        return "Water";
    }
}