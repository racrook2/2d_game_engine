package Tiles;

/**
 * NPC tile
 * @author Ran Crook
 */

import java.awt.*;

public abstract class NPC extends Tile
{
    private Image[] imgs;
    private int direction;

    public NPC(Image [] imgs, int direction) {
        super(imgs[direction]);
        this.direction = direction;
        this.imgs = imgs;
    }

    public abstract boolean canBeTraversed();

    public Image getImage()
    {
        return imgs[direction];
    }

    public void setImage(int direction)
    {
        this.direction = direction;
    }

    public void setImages(Image[] imgs)
    {
        this.imgs = imgs;
    }

    public int getDirection()
    {
        return direction;
    }

    public void setDirection(int direction)
    {
        this.direction = direction;
    }
}