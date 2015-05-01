package Main;

/**
 * Contains functionality for a player character to move around a map
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Sprite
{
    private Image[] imgs;       // frames for the sprite
    private Image[] hats;       // frames for the sprite's hat
    private Point loc;          // starting location
    private Point delta;        // movement vector
    private int direction;      // index of current frame in imgs array
    private Maps.Map map;       // map the sprite is interacting with

    /**
     * Constructor for a sprite
     * @param loc starting location
     * @param delta movement vector
     * @param map area sprite is in
     */
    public Sprite(Point loc, Point delta, Maps.Map map) throws IOException
    {
        imgs = new Image[12];
        hats = new Image[6];

        imgs[0] = ImageIO.read(getClass().getResource("/Player/Down1.png"));
        imgs[1] = ImageIO.read(getClass().getResource("/Player/Up1.png"));
        imgs[2] = ImageIO.read(getClass().getResource("/Player/Left1.png"));
        imgs[3] = ImageIO.read(getClass().getResource("/Player/Right1.png"));
        imgs[4] = ImageIO.read(getClass().getResource("/Player/Down2.png"));
        imgs[5] = ImageIO.read(getClass().getResource("/Player/Down3.png"));
        imgs[6] = ImageIO.read(getClass().getResource("/Player/Up2.png"));
        imgs[7] = ImageIO.read(getClass().getResource("/Player/Up3.png"));
        imgs[8] = ImageIO.read(getClass().getResource("/Player/Left2.png"));
        imgs[9] = ImageIO.read(getClass().getResource("/Player/Left3.png"));
        imgs[10] = ImageIO.read(getClass().getResource("/Player/Right2.png"));
        imgs[11] = ImageIO.read(getClass().getResource("/Player/Right3.png"));

        hats[0] = ImageIO.read(getClass().getResource("/Player/HatUpDown1.png"));
        hats[1] = ImageIO.read(getClass().getResource("/Player/HatLeft1.png"));
        hats[2] = ImageIO.read(getClass().getResource("/Player/HatRight1.png"));
        hats[3] = ImageIO.read(getClass().getResource("/Player/HatUpDown2.png"));
        hats[4] = ImageIO.read(getClass().getResource("/Player/HatLeft2.png"));
        hats[5] = ImageIO.read(getClass().getResource("/Player/HatRight2.png"));

        this.loc = loc;
        this.delta = delta;
        direction = 0;
        this.map = map;
    }

    public Image getCurrentImage()
    {
        return imgs[direction];
    }

    public int getDirection()
    {
        return direction;
    }

    public void setDirection(int direction)
    {
        this.direction = direction;
    }

    /**
     * Updates the sprite's location in the map
     * @param direction direction we want to move in
     */
    public void update(int direction)
    {
        if (direction == 0) { // down
            this.direction = 0;
        }
        else if (direction == 1) { // up
            this.direction = 1;
        }
        else if (direction == 2) { // left
            this.direction = 2;
        }
        else { // right
            this.direction = 3;
        }

        // checks whether player can walk on adjacent tile or not
        if ((getAdjacentBottomTile() != null && getAdjacentBottomTile().canBeTraversed()) &&
            (getAdjacentTopTile() == null || getAdjacentTopTile().canBeTraversed())) {
            loc = new Point(loc.x + delta.x, loc.y + delta.y);
        }
    }

    /**
     * Checks whether of not the sprite can move in the direction it's facing
     * @return true if it can, false otherwise
     */
    public boolean canUpdate()
    {
        // checks whether player can walk on adjacent tile or not
        return (getAdjacentBottomTile() != null && getAdjacentBottomTile().canBeTraversed()) &&
                (getAdjacentTopTile() == null || getAdjacentTopTile().canBeTraversed());
    }

    public Point getLocation()
    {
        return loc;
    }

    public void setLocation(Point loc)
    {
        this.loc = loc;
    }

    public Maps.Map getArea()
    {
        return map;
    }

    public void setArea(Maps.Map map)
    {
        this.map = map;
    }

    public Point getDeltaPoint()
    {
        return delta;
    }

    public void setDeltaPoint(Point delta)
    {
        this.delta = delta;
    }

    /**
     * Retrieves the tile from the map's bottom layer in the direction the player is facing
     * @return the tile from the map's bottom layer in the direction the player is facing
     */
    public Tiles.Tile getAdjacentBottomTile()
    {
        // returns tile in front of player by checking direction faced
        if (direction == 0 || direction == 4 || direction == 5) { // down
            return map.getBottomTile(new Point(loc.x + 1, loc.y));
        }
        else if (direction == 1 || direction == 6 || direction == 7) { // up
            return map.getBottomTile(new Point(loc.x - 1, loc.y));
        }
        else if (direction == 2 || direction == 8 || direction == 9) { // left
            return map.getBottomTile(new Point(loc.x, loc.y - 1));
        }

        // right
        return map.getBottomTile(new Point(loc.x, loc.y + 1));
    }

    /**
     * Retrieves the tile from the map's top layer in the direction the player is facing
     * @return the tile from the map's top layer in the direction the player is facing
     */
    public Tiles.Tile getAdjacentTopTile()
    {
        // returns tile in front of player by checking direction faced
        if (direction == 0 || direction == 4 || direction == 5) { // down
            return map.getTopTile(new Point(loc.x + 1, loc.y));
        }
        else if (direction == 1 || direction == 6 || direction == 7) { // up
            return map.getTopTile(new Point(loc.x - 1, loc.y));
        }
        else if (direction == 2 || direction == 8 || direction == 9) { // left
            return map.getTopTile(new Point(loc.x, loc.y - 1));
        }

        // right
        return map.getTopTile(new Point(loc.x, loc.y + 1));
    }

    /**
     * Retrieves the tile from the map's top layer above the direction the player is facing
     * @return the tile from the map's top layer above the direction the player is facing
     */
    public Tiles.Tile getTileAboveAdjacentTopTile()
    {
        // Returns tile in front of player by checking direction faced
        if (direction == 0 || direction == 4 || direction == 5) { // Down
            return map.getTopTile(new Point(loc.x, loc.y));
        }
        else if (direction == 1 || direction == 6 || direction == 7) { // Up
            return map.getTopTile(new Point(loc.x - 2, loc.y));
        }
        else if (direction == 2 || direction == 8 || direction == 9) { // Left
            return map.getTopTile(new Point(loc.x - 1, loc.y - 1));
        }

        // Right
        return map.getTopTile(new Point(loc.x - 1, loc.y + 1));
    }

    public Tiles.Tile getCurrentBottomTile()
    {
        return map.getBottomTile(loc);
    }

    public Image getHat(int index)
    {
        return hats[index];
    }
}