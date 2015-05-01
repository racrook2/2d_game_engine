package Tiles;

/**
 * BookshelfE tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class BookshelfE extends Tile
{
    public BookshelfE()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/BookshelfE.png")));
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