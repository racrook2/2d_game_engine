package Types;

import java.util.*;

/**
 * Class for the Dark type
 * @author Ran Crook
 */

public class Dark extends Type
{
    public Dark()
    {
        super(new LinkedList<String>(Arrays.asList("Bug", "Fighting", "Fairy")),
                new LinkedList<String>(Arrays.asList("Dark", "Ghost")),
                new LinkedList<String>(Arrays.asList("Psychic")));
    }

    public String getName()
    {
        return "Dark";
    }
}