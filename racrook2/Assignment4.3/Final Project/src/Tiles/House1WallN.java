package Tiles;

/**
 * House1WallN tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class House1WallN extends Tile
{
    public House1WallN()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/House1WallN.png")));
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