package Pokemon;

/**
 * Contains all data necessary to represent a Rattata
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.*;

public class Rattata extends Pokemon
{
    public Rattata() throws IOException
    {
        super(30, 56, 35, 25, 35, 72, null, null, null, null, new Types.Normal(), null);
        assignGender(50);
        LinkedList<Moves.Move> movepool = new LinkedList<Moves.Move>(Arrays.asList(new Moves.Tackle()));
        setMovepool(movepool);
        setFrontSprite(ImageIO.read(getClass().getResource("/Pokemon/Front Sprites/Rattata.png")));
        setBackSprite(ImageIO.read(getClass().getResource("/Pokemon/Back Sprites/Rattata.png")));
    }

    public String getName()
    {
        return "Rattata";
    }
}