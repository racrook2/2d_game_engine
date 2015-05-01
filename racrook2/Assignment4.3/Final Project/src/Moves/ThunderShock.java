package Moves;

/**
 * Move description for ThunderShock
 */

public class ThunderShock extends Move
{
    public ThunderShock()
    {
        super(100, 40, "special", new Types.Electric());
    }

    public String getName()
    {
        return "ThunderShock";
    }
}