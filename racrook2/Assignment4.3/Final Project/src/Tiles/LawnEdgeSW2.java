package Tiles;

/**
 * LawnEdgeSW2 tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class LawnEdgeSW2 extends Tile
{
    public LawnEdgeSW2()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/LawnEdgeSW2.png")));
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