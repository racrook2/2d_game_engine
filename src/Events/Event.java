package Events;

/**
 * Allows for scripting of an event
 * @author Ran Crook
 */

import java.awt.*;

public abstract class Event
{
    private Main.Game game;
    private java.util.Timer timer;
    int threadOrder = 0;
    int startingPoint = 0;

    /**
     * Constructor for an event
     * @param startingPoint which number tile we stepped on to trigger the event
     */
    public Event(int startingPoint)
    {
        this.startingPoint = startingPoint;
    }

    /**
     * Animates the event
     * @param game instance of the game we're playing
     * @param timer a timer to schedule animations
     */
    public abstract void runEvent(Main.Game game, java.util.Timer timer);

    /**
     * Find out whether or not the prerequisites for this event have been completed or not
     * @return true if the prerequisites have been met, false otherwise
     */
    public boolean prerequisitesCompleted()
    {
        return true;
    }

    /**
     * Animates player movement
     * @param direction the direction in which the player faces
     * @param delta the movement vector for the player
     */
    public void movePlayer(int direction, Point delta)
    {
        timer.schedule(game.new drawPlayerMovement(direction, delta), threadOrder);
        threadOrder++;
    }

    /**
     * Animates dialog appearing on screen
     * @param dialog the dialog to be displayed
     */
    public void showMessage(String dialog)
    {
        timer.schedule(game.new drawDialog(dialog), threadOrder);
        threadOrder++;
    }

    /**
     * Initializes global variables to parameters
     * @param game instance of the game we're playing
     * @param timer a timer to schedule animations
     */
    public void initEvent(Main.Game game, java.util.Timer timer)
    {
        this.game = game;
        this.timer = timer;
    }

    public abstract String getName();

    public int getStartingPoint()
    {
        return startingPoint;
    }
}