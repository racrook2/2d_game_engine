package Tiles;

/**
 * House1CarpetN tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class House1CarpetN extends Tile
{
    public House1CarpetN()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/House1CarpetN.png")));
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