package Main;

/**
 * Main.Tests the functionality of all game classes
 * @author Ran Crook
 */

import org.junit.*;
import java.awt.*;
import java.io.IOException;
import java.util.*;

public class Tests
{
    private Image[] imgs;
    private Point loc;
    private Point delta;
    private Maps.Map map;
    private Sprite sprite;
    private Tiles.Tile tile1;
    private Tiles.Tile tile2;
    private Moves.Move move;
    private Types.Type type;
    private Pokemon.Pokemon pokemon;

    @Before
    public void setUp() throws IOException {
        imgs = new Image[12];
        imgs[0] = Toolkit.getDefaultToolkit().getImage("src/Player/Down1.png");
        loc = new Point(14, 11);
        delta = new Point(0, 1);
        map = new Maps.PalletTown(null);
        sprite = new Sprite(loc, delta, map);
        tile1 = new Tiles.Lawn1();
        tile2 = new Tiles.WaterLedgeE();
        tile2.setWarpPoint(loc);
        tile2.setWarpArea(map);
        try {
            pokemon = new Pokemon.Pikachu();
            type = pokemon.getType1();
            move = pokemon.getCurrMoveset()[0];
        }
        catch (IOException ex) {
            pokemon = null;
            type = null;
            move = null;
        }
    }

    @Test
    public void testPokemonGetHP()
    {
        assert(pokemon.getHP() == 211);
    }

    @Test
    public void testPokemonGetAtk()
    {
        assert(pokemon.getAtk() == 146);
    }

    @Test
    public void testPokemonGetCurrHP()
    {
        assert(pokemon.getCurrHP() == 211);
    }

    @Test
    public void testPokemonIncrementCurrHP()
    {
        pokemon.decrementCurrHP(100);
        pokemon.incrementCurrHP(50);
        assert(pokemon.getCurrHP() == 161);
        pokemon.incrementCurrHP(100);
        assert(pokemon.getCurrHP() == 211);
    }

    @Test
    public void testPokemonDecrementCurrHP()
    {
        pokemon.decrementCurrHP(100);
        assert(pokemon.getCurrHP() == 111);
        pokemon.decrementCurrHP(150);
        assert(pokemon.getCurrHP() == 0);
    }

    @Test
    public void testPokemonGetGender()
    {
        assert(pokemon.getGender().equals("male") || pokemon.getGender().equals("female"));
    }

    @Test
    public void testPokemonSetGender()
    {
        pokemon.setGender("male");
        assert(pokemon.getGender().equals("male"));
        pokemon.setGender("female");
        assert(pokemon.getGender().equals("female"));
        pokemon.setGender("hello");
        assert(pokemon.getGender() == null);
    }

    @Test
    public void testPokemonAssignGender()
    {
        pokemon.assignGender(0);
        assert(pokemon.getGender().equals("female"));
        pokemon.assignGender(50);
        assert(pokemon.getGender().equals("male") || pokemon.getGender().equals("female"));
        pokemon.assignGender(100);
        assert(pokemon.getGender().equals("male"));
    }

    @Test
    public void testPokemonGetMovepool()
    {
        assert(pokemon.getMovepool() != null);
        assert(pokemon.getMovepool().size() == 1);
        assert(pokemon.getMovepool().get(0) != null);
    }

    @Test
    public void testPokemonGetCurrMoveset()
    {
        assert(pokemon.getCurrMoveset() != null);
        assert(pokemon.getCurrMoveset().length == 4);
        assert(pokemon.getCurrMoveset()[0] != null);
        assert(pokemon.getCurrMoveset()[1] == null);
        assert(pokemon.getCurrMoveset()[2] == null);
        assert(pokemon.getCurrMoveset()[3] == null);
    }

    @Test
    public void testPokemonSetNewMove()
    {
        pokemon.setNewMove(3, new Moves.Tackle());
        assert(pokemon.getCurrMoveset()[0] != null);
        assert(pokemon.getCurrMoveset()[1] != null);
        assert(pokemon.getCurrMoveset()[2] == null);
        assert(pokemon.getCurrMoveset()[3] == null);
        pokemon.setNewMove(0, null);
        assert(pokemon.getCurrMoveset()[0] != null);
        assert(pokemon.getCurrMoveset()[1] == null);
    }

    @Test
    public void testPokemonGetFrontSprite()
    {
        assert(pokemon.getFrontSprite() != null);
    }

    @Test
    public void testPokemonGetBackSprite()
    {
        assert(pokemon.getBackSprite() != null);
    }

    @Test
    public void testPokemonGetType1()
    {
        assert(pokemon.getType1() != null);
    }

    @Test
    public void testPokemonGetType2()
    {
        assert(pokemon.getType2() == null);
    }

    @Test
    public void testPokemonGetName()
    {
        assert(pokemon.getName().equals("Pikachu"));
    }

    @Test
    public void testMoveGetPower()
    {
        assert(move.getPower() == 40);
    }

    @Test
    public void testMoveGetAccuracy()
    {
        assert(move.getAccuracy() == 100);
    }

    @Test
    public void testMoveGetCategory()
    {
        assert(move.getCategory().equals("special"));
    }

    @Test
    public void testMoveGetType()
    {
        assert(move.getType() != null);
    }

    @Test
    public void testMoveGetName()
    {
        assert(move.getName().equals("ThunderShock"));
    }

    @Test
    public void testTypeGetWeaknesses()
    {
        assert(type.getWeaknesses() != null);
        assert(type.getWeaknesses().size() == 1);
        assert(type.getWeaknesses().get(0) != null);
    }

    @Test
    public void testTypeGetResistances()
    {
        assert(type.getResistances() != null);
        assert(type.getResistances().size() == 3);
        assert(type.getResistances().get(0) != null);
        assert(type.getResistances().get(1) != null);
        assert(type.getResistances().get(2) != null);
    }

    @Test
    public void testTypeGetImmunities()
    {
        assert(type.getImmunities() != null);
        assert(type.getImmunities().size() == 0);
    }

    @Test
    public void testTypeGetName()
    {
        assert(type.getName().equals("Electric"));
    }

    @Test
    public void testTileCanBeTraversed()
    {
        assert(tile1.canBeTraversed());
        assert(!tile2.canBeTraversed());
    }

    @Test
    public void testTileGetMessage()
    {
        assert(tile1.getMessage() == null);
        assert(tile2.getMessage().equals("The water is dyed a deep blue..."));
    }

    @Test
    public void testTileSetMessage()
    {
        tile1.setMessage("message");
        assert(tile1.getMessage().equals("message"));
    }

    @Test
    public void testTileGetImage()
    {
        assert(tile1.getImage() != null);
    }

    @Test
    public void testTileGetWarpPoint()
    {
        assert(tile1.getWarpPoint() == null);
        assert(tile2.getWarpPoint().x == 14 && tile2.getWarpPoint().y == 11);
    }

    @Test
    public void testTileSetWarpPoint()
    {
        tile1.setWarpPoint(loc);
        assert(tile2.getWarpPoint().x == 14 && tile2.getWarpPoint().y == 11);
    }

    @Test
    public void testTileGetWarpArea()
    {
        assert(tile1.getWarpArea() == null);
        assert(tile2.getWarpArea().equals(map));
    }

    @Test
    public void testTileSetWarpArea()
    {
        tile1.setWarpArea(map);
        assert(tile1.getWarpArea().equals(map));
    }

    @Test
    public void testMapSetMaps()
    {
        Tiles.Tile[][] newMap = new Tiles.Tile[1][1];
        newMap[0][0] = new Tiles.Void();
        map.setMaps(newMap, newMap);
        assert(map.getBottomTile(new Point(0, 0)) instanceof Tiles.Void);
    }

    @Test
    public void testMapGetBottomTile()
    {
        assert(map.getBottomTile(new Point(17, 11)) instanceof Tiles.LawnEdgeN);
    }

    @Test
    public void testMapGetTopTile()
    {
        assert(map.getTopTile(new Point(17, 11)) instanceof Tiles.PicketFence);
    }

    @Test
    public void testSpriteGetCurrentImage()
    {
        assert(sprite.getCurrentImage() != null);
    }

    @Test
    public void testSpriteGetDirection()
    {
        assert(sprite.getDirection() == 0);
    }

    @Test
    public void testSpriteSetDirection()
    {
        sprite.setDirection(1);
        assert(sprite.getDirection() == 1);
    }

    @Test
    public void testSpriteUpdate()
    {
        sprite.update(3);
        assert(sprite.getLocation().x == 14 && sprite.getLocation().y == 12);
        assert(sprite.getDirection() == 3);
    }

    @Test
    public void testSpriteCanUpdate()
    {
        assert(sprite.canUpdate());
        sprite.setDeltaPoint(new Point(1, 0));
        sprite.update(0);
        sprite.update(0);
        assert(!sprite.canUpdate());
    }

    @Test
    public void testSpriteGetLocation()
    {
        assert(sprite.getLocation().x == 14 && sprite.getLocation().y == 11);
    }

    @Test
    public void testSpriteSetLocation()
    {
        sprite.setLocation(new Point(0, 0));
        assert(sprite.getLocation().x == 0 && sprite.getLocation().y == 0);
    }

    @Test
    public void testSpriteGetArea()
    {
        assert(sprite.getArea() instanceof Maps.PalletTown);
    }

    @Test
    public void testSpriteSetArea()
    {
        sprite.setArea(new Maps.RedHouse(map));
        assert(sprite.getArea() instanceof Maps.RedHouse);
    }

    @Test
    public void testSpriteGetDeltaPoint()
    {
        assert(sprite.getDeltaPoint().x == 0 && sprite.getDeltaPoint().y == 1);
    }

    @Test
    public void testSpriteSetDeltaPoint()
    {
        sprite.setDeltaPoint(new Point(1, 0));
        assert(sprite.getDeltaPoint().x == 1 && sprite.getDeltaPoint().y == 0);
    }

    @Test
    public void testSpriteGetAdjacentBottomTile()
    {
        assert(sprite.getAdjacentBottomTile() instanceof Tiles.LawnPath);
    }

    @Test
    public void testSpriteGetAdjacentTopTile()
    {
        assert(sprite.getAdjacentTopTile() == null);
    }

    @Test
    public void testSpriteGetTileAboveAdjacentTopTile()
    {
        assert(sprite.getTileAboveAdjacentTopTile() == null);
    }

    @Test
    public void testSpriteGetCurrentBottomTile()
    {
        assert(sprite.getCurrentBottomTile() instanceof Tiles.LawnPath);
    }
}