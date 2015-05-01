package Tiles;

/**
 * Void tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class Void extends Tile
{
    public Void()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/Void.png")));
        }
        catch (IOException ex) {
            setImage(null);
        }
    }

    public boolean canBeTraversed()
    {
        return false;
    }
}