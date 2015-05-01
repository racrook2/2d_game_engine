package Types;

import java.util.*;

/**
 * Class for the Psychic type
 * @author Ran Crook
 */

public class Psychic extends Type
{
    public Psychic()
    {
        super(new LinkedList<String>(Arrays.asList("Dark", "Ghost", "Bug")),
                new LinkedList<String>(Arrays.asList("Fighting", "Psychic")),
                new LinkedList<String>());
    }

    public String getName()
    {
        return "Psychic";
    }
}