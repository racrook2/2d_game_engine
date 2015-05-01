package Tiles;

/**
 * Television tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class Television extends Tile
{
    public Television()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/Television.png")));
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