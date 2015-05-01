package Types;

/**
 * Holds the necessary information for a type
 * @author Ran Crook
 */

import java.util.*;

public abstract class Type
{
    private LinkedList<String> weaknesses;
    private LinkedList<String> resistances;
    private LinkedList<String> immunities;

    /**
     * Constructor for a type
     * @param weaknesses types whose attacks this type takes extra damage from
     * @param resistances types whose attacks this type takes less damage from
     * @param immunities types whose attacks this type takes no damage from
     */
    public Type(LinkedList<String> weaknesses, LinkedList<String> resistances, LinkedList<String> immunities)
    {
        this.weaknesses = weaknesses;
        this.resistances = resistances;
        this.immunities = immunities;
    }

    public LinkedList<String> getWeaknesses()
    {
        return weaknesses;
    }

    public LinkedList<String> getResistances()
    {
        return resistances;
    }

    public LinkedList<String> getImmunities()
    {
        return immunities;
    }

    public abstract String getName();
}