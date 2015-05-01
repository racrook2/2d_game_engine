package Tiles;

/**
 * Woman1Hair tile
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Woman1Hair extends NPC
{
    public Woman1Hair(int direction)
    {
        super(new Image[]{null, null, null, null}, direction);
        Image[] imgs = new Image[4];
        try {
            imgs[0] = ImageIO.read(getClass().getResource("/Tiles/NPC Images/Woman1HairUpDown.png"));
        }
        catch (IOException ex) {
            imgs[0] = null;
        }
        try {
            imgs[1] = ImageIO.read(getClass().getResource("/Tiles/NPC Images/Woman1HairUpDown.png"));
        }
        catch (IOException ex) {
            imgs[1] = null;
        }
        try {
            imgs[2] = ImageIO.read(getClass().getResource("/Tiles/NPC Images/Woman1HairRight.png"));
        }
        catch (IOException ex) {
            imgs[2] = null;
        }
        try {
            imgs[3] = ImageIO.read(getClass().getResource("/Tiles/NPC Images/Woman1HairLeft.png"));
        }
        catch (IOException ex) {
            imgs[3] = null;
        }
        setImages(imgs);
    }

    public boolean canBeTraversed()
    {
        return true;
    }
}