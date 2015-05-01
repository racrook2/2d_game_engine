package Tiles;

/**
 * House1CarpetNE tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class House1CarpetNE extends Tile
{
    public House1CarpetNE()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/House1CarpetNE.png")));
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