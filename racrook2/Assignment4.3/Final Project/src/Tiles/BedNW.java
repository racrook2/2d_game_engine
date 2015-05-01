package Tiles;

/**
 * BedNW tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class BedNW extends Tile
{
    public BedNW()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/BedNW.png")));
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