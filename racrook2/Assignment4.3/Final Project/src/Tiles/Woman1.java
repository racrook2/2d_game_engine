package Tiles;

/**
 * Woman1 tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Woman1 extends NPC
{
    public Woman1(int direction)
    {
        super(new Image[]{null, null, null, null}, direction);
        Image[] imgs = new Image[4];
        try {
            imgs[0] = ImageIO.read(getClass().getResource("/Tiles/NPC Images/Woman1Up.png"));
        }
        catch (IOException ex) {
            imgs[0] = null;
        }
        try {
            imgs[1] = ImageIO.read(getClass().getResource("/Tiles/NPC Images/Woman1Down.png"));
        }
        catch (IOException ex) {
            imgs[1] = null;
        }
        try {
            imgs[2] = ImageIO.read(getClass().getResource("/Tiles/NPC Images/Woman1Right.png"));
        }
        catch (IOException ex) {
            imgs[2] = null;
        }
        try {
            imgs[3] = ImageIO.read(getClass().getResource("/Tiles/NPC Images/Woman1Left.png"));
        }
        catch (IOException ex) {
            imgs[3] = null;
        }
        setImages(imgs);
    }

    public boolean canBeTraversed()
    {
        return false;
    }
}