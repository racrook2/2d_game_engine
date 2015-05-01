package Tiles;

/**
 * Bed tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class Bed extends Tile
{
    public Bed()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/Bed.png")));
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