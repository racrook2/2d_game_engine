package Tiles;

/**
 * RedFlower tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class RedFlower extends Tile
{
    public RedFlower()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/RedFlower.png")));
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