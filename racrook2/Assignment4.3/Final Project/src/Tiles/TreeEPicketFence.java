package Tiles;

/**
 * TreeEPicketFence tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class TreeEPicketFence extends Tile
{
    public TreeEPicketFence()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/TreeEPicketFence.png")));
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