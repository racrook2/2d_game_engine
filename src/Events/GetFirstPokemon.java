package Events;

/**
 * Contains script for GetFirstPokemon event
 * @author Ran Crook
 */

import java.awt.*;

public class GetFirstPokemon extends Event
{
    public GetFirstPokemon(int startingPoint)
    {
        super(startingPoint);
    }

    public void runEvent(Main.Game game, java.util.Timer timer)
    {
        initEvent(game, timer);

        movePlayer(0, new Point(0, 0));
        showMessage("Hey! Wait! Don't go out!");
        showMessage("It's unsafe! Wild POKéMON live in tall grass!");
        showMessage("You need your own POKéMON for your protection.");
        showMessage("I know! Here, come with me!");
        movePlayer(0, new Point(1, 0));
        movePlayer(0, new Point(1, 0));
        movePlayer(2, new Point(0, 0));
        movePlayer(2, new Point(0, -1));
        if (getStartingPoint() == 1) {
            movePlayer(2, new Point(0, -1));
        }
        movePlayer(0, new Point(0, 0));
        movePlayer(0, new Point(1, 0));
        movePlayer(0, new Point(1, 0));
        movePlayer(0, new Point(1, 0));
        movePlayer(0, new Point(1, 0));
        movePlayer(0, new Point(1, 0));
        movePlayer(0, new Point(1, 0));
        movePlayer(0, new Point(1, 0));
        movePlayer(0, new Point(1, 0));
        movePlayer(0, new Point(1, 0));
        movePlayer(0, new Point(1, 0));
        movePlayer(0, new Point(1, 0));
        movePlayer(3, new Point(0, 0));
        movePlayer(3, new Point(0, 1));
        movePlayer(3, new Point(0, 1));
        movePlayer(3, new Point(0, 1));
        movePlayer(3, new Point(0, 1));
        movePlayer(3, new Point(0, 1));
        movePlayer(1, new Point(0, 0));
        movePlayer(1, new Point(-1, 0));
    }

    public String getName()
    {
        return "GetFirstPokemon";
    }
}