package Tiles;

/**
 * SinkNE tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class SinkNE extends Tile
{
    public SinkNE()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/SinkNE.png")));
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