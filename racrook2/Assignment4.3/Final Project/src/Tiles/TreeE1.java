package Tiles;

/**
 * TreeE1 tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class TreeE1 extends Tile
{
    public TreeE1()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/TreeE1.png")));
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