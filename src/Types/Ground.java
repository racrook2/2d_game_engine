package Types;

import java.util.*;

/**
 * Class for the Ground type
 * @author Ran Crook
 */

public class Ground extends Type
{
    public Ground()
    {
        super(new LinkedList<String>(Arrays.asList("Ice", "Grass", "Water")),
                new LinkedList<String>(Arrays.asList("Rock", "Poison")),
                new LinkedList<String>(Arrays.asList("Electric")));
    }

    public String getName()
    {
        return "Ground";
    }
}