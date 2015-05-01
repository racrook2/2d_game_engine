package Tiles;

/**
 * BookshelfNW tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class BookshelfNW extends Tile
{
    public BookshelfNW()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/BookshelfNW.png")));
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