package Types;

import java.util.*;

/**
 * Class for the Flying type
 * @author Ran Crook
 */

public class Flying extends Type
{
    public Flying()
    {
        super(new LinkedList<String>(Arrays.asList("Electric", "Rock", "Ice")),
                new LinkedList<String>(Arrays.asList("Grass", "Fighting", "Bug")),
                new LinkedList<String>(Arrays.asList("Ground")));
    }

    public String getName()
    {
        return "Flying";
    }
}