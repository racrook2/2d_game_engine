package Tiles;

/**
 * WaterLedgeE tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class WaterLedgeE extends Tile
{
    public WaterLedgeE()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/WaterLedgeE.png")));
        }
        catch (IOException ex) {
            setImage(null);
        }
    }

    public boolean canBeTraversed()
    {
        return false;
    }

    public String getMessage()
    {
        return "The water is dyed a deep blue...";
    }
}