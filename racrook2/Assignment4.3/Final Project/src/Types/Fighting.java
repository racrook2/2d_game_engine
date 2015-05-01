package Types;

import java.util.*;

/**
 * Class for the Fighting type
 * @author Ran Crook
 */

public class Fighting extends Type
{
    public Fighting()
    {
        super(new LinkedList<String>(Arrays.asList("Flying", "Psychic", "Fairy")),
                new LinkedList<String>(Arrays.asList("Bug", "Dark", "Rock")),
                new LinkedList<String>());
    }

    public String getName()
    {
        return "Fighting";
    }
}