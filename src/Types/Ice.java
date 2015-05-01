package Types;

import java.util.*;

/**
 * Class for the Ice type
 * @author Ran Crook
 */

public class Ice extends Type
{
    public Ice()
    {
        super(new LinkedList<String>(Arrays.asList("Fighting", "Fire", "Rock", "Steel")),
                new LinkedList<String>(Arrays.asList("Ice")),
                new LinkedList<String>());
    }

    public String getName()
    {
        return "Ice";
    }
}