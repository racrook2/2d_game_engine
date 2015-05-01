package Types;

import java.util.*;

/**
 * Class for the Electric type
 * @author Ran Crook
 */

public class Electric extends Type
{
    public Electric()
    {
        super(new LinkedList<String>(Arrays.asList("Ground")),
                new LinkedList<String>(Arrays.asList("Electric", "Flying", "Steel")),
                new LinkedList<String>());
    }

    public String getName()
    {
        return "Electric";
    }
}