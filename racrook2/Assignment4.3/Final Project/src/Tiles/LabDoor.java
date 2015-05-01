package Tiles;

/**
 * LabDoor tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class LabDoor extends Tile
{
    public LabDoor()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/LabDoor.png")));
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