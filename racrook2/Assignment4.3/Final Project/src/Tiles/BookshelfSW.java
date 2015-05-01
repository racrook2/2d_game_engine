package Tiles;

/**
 * BookshelfSW tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class BookshelfSW extends Tile
{
    public BookshelfSW()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/BookshelfSW.png")));
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