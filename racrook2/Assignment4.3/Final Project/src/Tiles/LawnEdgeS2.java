package Tiles;

/**
 * LawnEdgeS2 tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class LawnEdgeS2 extends Tile
{
    public LawnEdgeS2()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/LawnEdgeS2.png")));
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