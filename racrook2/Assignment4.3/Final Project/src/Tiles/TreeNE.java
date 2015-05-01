package Tiles;

/**
 * TreeNE tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class TreeNE extends Tile
{
    public TreeNE()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/TreeNE.png")));
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