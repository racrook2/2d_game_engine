package Tiles;

/**
 * TreeNWPicketFence tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class TreeNWPicketFence extends Tile
{
    public TreeNWPicketFence()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/TreeNWPicketFence.png")));
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