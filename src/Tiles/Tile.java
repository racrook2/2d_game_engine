package Tiles;

/**
 * Represents a tile to be displayed as part of a map
 * @author Ran Crook
 */

import java.awt.*;

public abstract class Tile
{
    private Image img;                  // the image associated with the tile
    private Point warpPoint = null;     // the location the tile transports the player to when stepped on
    private Maps.Map warpArea = null;   // the area the tile transports the player to when stepped on
    private String message = null;      // the message shown when interacting with the tile
    private Events.Event event = null;  // the event that's triggered when walking onto this tile

    /**
     * Constructor for a tile
     * @param img picture of the tile
     */
    public Tile (Image img)
    {
        this.img = img;
    }

    /**
     * Whether we can walk on the tile or not
     * @return true if we can, false otherwise
     */
    public abstract boolean canBeTraversed();

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public Image getImage()
    {
        return img;
    }

    public void setImage(Image img)
    {
        this.img = img;
    }

    public Point getWarpPoint()
    {
        return warpPoint;
    }

    public void setWarpPoint(Point warpPoint)
    {
        this.warpPoint = warpPoint;
    }

    public Maps.Map getWarpArea()
    {
        return warpArea;
    }

    public void setWarpArea(Maps.Map warpArea)
    {
        this.warpArea = warpArea;
    }

    public Events.Event getEvent()
    {
        return event;
    }

    public void setEvent(Events.Event event)
    {
        this.event = event;
    }
}