package Pokemon;

/**
 * Contains all data necessary to represent a Pidgey
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.*;

public class Pidgey extends Pokemon
{
    public Pidgey() throws IOException
    {
        super(40, 45, 40, 35, 35, 56, null, null, null, null, new Types.Normal(), new Types.Flying());
        assignGender(50);
        LinkedList<Moves.Move> movepool = new LinkedList<Moves.Move>(Arrays.asList(new Moves.Tackle()));
        setMovepool(movepool);
        setFrontSprite(ImageIO.read(getClass().getResource("/Pokemon/Front Sprites/Pidgey.png")));
        setBackSprite(ImageIO.read(getClass().getResource("/Pokemon/Back Sprites/Pidgey.png")));
    }

    public String getName()
    {
        return "Pidgey";
    }
}