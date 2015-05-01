package Maps;

/**
 * Contains the information needed to render a map
 * @author Ran Crook
 */

import java.awt.*;
import java.io.IOException;
import java.util.*;

public abstract class Map
{
    private Tiles.Tile[][] bottomMap;       // bottom layer of the map
    private Tiles.Tile[][] topMap;          // top layer of the map
    private Map sourceMap;                  // area from which we entered

    /**
     * Constructor for a map
     * @param sourceMap other areas that link to this one
     */
    public Map(Map sourceMap)
    {
        this.bottomMap = null;
        this.topMap = null;
        this.sourceMap = sourceMap;
    }

    public void setMaps(Tiles.Tile[][] bottomMap, Tiles.Tile[][] topMap)
    {
        this.bottomMap = bottomMap;
        this.topMap = topMap;
    }

    /**
     * Returns the tile from the bottom layer in the given location
     * @param loc location we want to get the tile from
     * @return bottom tile at given location
     */
    public Tiles.Tile getBottomTile(Point loc)
    {
        if (bottomMap == null) {
            return null;
        }
        else if (loc.x < 0 || loc.x >= bottomMap.length) {
            return null;
        }
        else if (loc.y < 0 || loc.y >= bottomMap[0].length) {
            return null;
        }

        return bottomMap[loc.x][loc.y];
    }

    /**
     * Returns the tile from the top layer in the given location
     * @param loc location we want to get the tile from
     * @return top tile at given location
     */
    public Tiles.Tile getTopTile(Point loc)
    {
        if (topMap == null) {
            return null;
        }
        else if (loc.x < 0 || loc.x >= topMap.length) {
            return null;
        }
        else if (loc.y < 0 || loc.y >= topMap[0].length) {
            return null;
        }

        return topMap[loc.x][loc.y];
    }

    /**
     * Returns a list of possible Pokemon encountered in this area
     * @return an array list of Pokemon
     */
    public LinkedList<Pokemon.Pokemon> getPossibleEncounters()
    {
        return null;
    }

    public Image getBattleBackground() throws IOException
    {
        return null;
    }

    /**
     * Lets you set tile properties that remain constant
     * @param sourceMap the area from which we came
     */
    public abstract void setConstantTileProperties(Map sourceMap);

    /**
     * Lets you set tile properties that can change depending on events completed
     * @param eventLog a dictionary of all events mapped to their completion status
     */
    public abstract void setVariableTileProperties(HashMap eventLog);

    public abstract String getName();

    public int getRowNumber()
    {
        return bottomMap.length;
    }

    public int getColNumber()
    {
        if (bottomMap.length == 0) {
            return 0;
        }

        return bottomMap[0].length;
    }
}