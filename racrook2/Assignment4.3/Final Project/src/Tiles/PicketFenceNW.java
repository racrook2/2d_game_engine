package Tiles;

/**
 * PicketFenceNW tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class PicketFenceNW extends Tile
{
    public PicketFenceNW()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/PicketFenceNW.png")));
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