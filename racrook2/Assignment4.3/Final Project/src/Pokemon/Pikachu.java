package Pokemon;

/**
 * Contains all data necessary to represent a Pikachu
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.*;

public class Pikachu extends Pokemon
{
    public Pikachu() throws IOException
    {
        super(35, 55, 40, 50, 50, 90, null, null, null, null, new Types.Electric(), null);
        assignGender(50);
        LinkedList<Moves.Move> movepool = new LinkedList<Moves.Move>(Arrays.asList(new Moves.ThunderShock()));
        setMovepool(movepool);
        setFrontSprite(ImageIO.read(getClass().getResource("/Pokemon/Front Sprites/Pikachu.png")));
        setBackSprite(ImageIO.read(getClass().getResource("/Pokemon/Back Sprites/Pikachu.png")));
    }

    public String getName()
    {
        return "Pikachu";
    }
}