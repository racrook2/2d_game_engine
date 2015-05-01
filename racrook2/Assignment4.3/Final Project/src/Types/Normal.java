package Types;

import java.util.*;

/**
 * Class for the Normal type
 * @author Ran Crook
 */

public class Normal extends Type
{
    public Normal()
    {
        super(new LinkedList<String>(Arrays.asList("Fighting")),
                new LinkedList<String>(),
                new LinkedList<String>(Arrays.asList("Ghost")));
    }

    public String getName()
    {
        return "Normal";
    }
}