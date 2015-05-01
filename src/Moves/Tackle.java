package Moves;

/**
 * Move description for Tackle
 */

public class Tackle extends Move
{
    public Tackle()
    {
        super(100, 50, "physical", new Types.Normal());
    }

    public String getName()
    {
        return "Tackle";
    }
}