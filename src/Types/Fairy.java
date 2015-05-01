package Types;

import java.util.*;

/**
 * Class for the Fairy type
 * @author Ran Crook
 */

public class Fairy extends Type
{
    public Fairy()
    {
        super(new LinkedList<String>(Arrays.asList("Poison", "Steel")),
                new LinkedList<String>(Arrays.asList("Bug", "Dark", "Fighting")),
                new LinkedList<String>(Arrays.asList("Dragon")));
    }

    public String getName()
    {
        return "Fairy";
    }
}