package Tiles;

/**
 * WhiteSign tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class WhiteSign extends Tile
{
    public WhiteSign()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/WhiteSign.png")));
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