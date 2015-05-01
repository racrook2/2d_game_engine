package Tiles;

/**
 * FancyShelfW tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;

import java.io.IOException;

public class FancyShelfW extends Tile
{
    public FancyShelfW()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/FancyShelfW.png")));
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