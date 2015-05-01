package Tiles;

/**
 * DirtPathNE tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class DirtPathNE extends Tile
{
    public DirtPathNE()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/DirtPathNE.png")));
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