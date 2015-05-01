package Types;

import java.util.*;

/**
 * Class for the Bug type
 * @author Ran Crook
 */

public class Bug extends Type
{
    public Bug()
    {
        super(new LinkedList<String>(Arrays.asList("Fire", "Flying", "Rock")),
                new LinkedList<String>(Arrays.asList("Fighting", "Grass", "Ground")),
                new LinkedList<String>());
    }

    public String getName()
    {
        return "Bug";
    }
}