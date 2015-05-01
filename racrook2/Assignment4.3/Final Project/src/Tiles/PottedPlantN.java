package Tiles;

/**
 * PottedPlantN tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class PottedPlantN extends Tile
{
    public PottedPlantN()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/PottedPlantN.png")));
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