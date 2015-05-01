package Tiles;

/**
 * DresserS tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class DresserS extends Tile
{
    public DresserS()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/DresserS.png")));
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