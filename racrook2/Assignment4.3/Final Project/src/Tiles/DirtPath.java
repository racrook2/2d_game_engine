package Tiles;

/**
 * DirtPath tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class DirtPath extends Tile
{
    public DirtPath()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/DirtPath.png")));
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