package Tiles;

/**
 * BookshelfW tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class BookshelfW extends Tile
{
    public BookshelfW()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/BookshelfW.png")));
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
        return "Crammed full of POKéMON books!";
    }
}