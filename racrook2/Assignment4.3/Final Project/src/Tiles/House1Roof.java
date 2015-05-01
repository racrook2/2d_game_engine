package Tiles;

/**
 * House1Roof tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class House1Roof extends Tile
{
    public House1Roof()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/House1Roof.png")));
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