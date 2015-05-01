package Tiles;

/**
 * LabFace@ tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class LabFace2 extends Tile
{
    public LabFace2()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/LabFace2.png")));
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