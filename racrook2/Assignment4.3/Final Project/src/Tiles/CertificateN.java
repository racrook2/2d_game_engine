package Tiles;

/**
 * CertificateN tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;

public class CertificateN extends Tile
{
    public CertificateN()
    {
        super(null);
        try {
            setImage(ImageIO.read(getClass().getResource("/Tiles/Tile Images/CertificateN.png")));
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