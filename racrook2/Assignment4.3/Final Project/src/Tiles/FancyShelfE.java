package Tiles;

/**
 * FancyShelfE tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class FancyShelfE extends Tile
{
    public FancyShelfE()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/FancyShelfE.png")));
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