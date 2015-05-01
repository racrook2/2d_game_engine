package Tiles;

/**
 * ConsoleS tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class ConsoleS extends Tile
{
    public ConsoleS()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/ConsoleS.png")));
        }
        catch (IOException ex) {
            setImage(null);
        }
    }

    public boolean canBeTraversed()
    {
        return true;
    }
}