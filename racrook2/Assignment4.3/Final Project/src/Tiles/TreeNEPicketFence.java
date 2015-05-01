package Tiles;

/**
 * TreeNEPicketFence tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class TreeNEPicketFence extends Tile
{
    public TreeNEPicketFence()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/TreeNEPicketFence.png")));
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