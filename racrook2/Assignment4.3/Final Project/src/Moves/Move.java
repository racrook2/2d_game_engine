package Moves;

/**
 * Contains the necessary information for an attack
 * @author Ran Crook
 */

public abstract class Move
{
    private int accuracy;
    private int power;
    private String category;
    private Types.Type type;

    /**
     * Constructor for a move
     * @param accuracy accuracy for a move
     * @param power based dame of a move
     * @param category physical, special or other
     * @param type the elemental attribute of the attack
     */
    public Move(int accuracy, int power, String category, Types.Type type)
    {
        if (accuracy < 0) {
            this.accuracy = 0;
        }
        else if (accuracy > 100) {
            this.accuracy = 100;
        }
        else {
            this.accuracy = accuracy;
        }

        if (power < 0) {
            this.power = 0;
        }
        else {
            this.power = power;
        }

        if (category.equals("physical") || category.equals("special")) {
            this.category = category;
        }
        else {
            // defaults to other
            this.category = "other";
        }

        this.type = type;
    }

    public int getPower()
    {
        return power;
    }

    public int getAccuracy()
    {
        return accuracy;
    }

    public String getCategory()
    {
        return category;
    }

    public Types.Type getType()
    {
        return type;
    }

    public abstract String getName();
}