package Types;

import java.util.*;

/**
 * Class for the Ghost type
 * @author Ran Crook
 */

public class Ghost extends Type
{
    public Ghost()
    {
        super(new LinkedList<String>(Arrays.asList("Dark", "Ghost")),
                new LinkedList<String>(Arrays.asList("Bug", "Poison")),
                new LinkedList<String>(Arrays.asList("Fighting", "Normal")));
    }

    public String getName()
    {
        return "Ghost";
    }
}