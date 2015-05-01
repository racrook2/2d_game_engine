package Main;

/**
 * Encompasses the main game functionality
 * @author Ran Crook
 */

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;

public class Game extends GUIFrame
{
    private Maps.Map currMap;                               // area player is currently in
    private Sprite player = null;                           // player character
    private boolean allowMovement = true;                   // whether or not keyboard input currently accepted
    private int XOffset = 0;                                // used for incremental movement animation
    private int YOffset = 0;                                // used for incremental movement animation
    private int direction;                                  // direction the player is facing
    private boolean stepRight = true;                       // allows stepping animation to alternate feet
    private String message;                                 // text associated with object player interacts with
    private boolean inBattle = false;                       // whether or not player currently engaged in battle
    private Pokemon.Pokemon myPokemon = null;               // player's Pokemon
    private Pokemon.Pokemon enemyPokemon = null;            // foe
    private java.util.Timer timer = new java.util.Timer();  // used for animations
    private static Graphics g;                              // graphics initially drawn into here
    private static Image offscreen;                         // used for double buffer implementation
    private Game game;                                      // instance of this game
    private static HashMap eventLog = new HashMap();        // dictionary of all events and their completion status

    // battle assets
    private Image dialogBox = null;
    private Image allyInfoBox = null;
    private Image enemyInfoBox = null;
    private Image maleIcon = null;
    private Image femaleIcon = null;
    private Image optionBox = null;
    private Image pointer = null;
    private Point pointerCoords = new Point(132, 149);
    private boolean inMoveMenu = false;
    private Image moveMenu = null;
    private int prevHPLength = 0;
    private int currHPLength = 0;
    private int diff = 0;
    private boolean showOptionBox = true;
    private boolean myPokemonDamaged = false;
    private boolean enemyPokemonDamaged = false;
    private String battleMessage = null;
    private boolean moveMissed = false;

    public static void main(String[] args)
    {
        // provides player images, starting point, movement vector and starting area
        Game game = new Game(new Point(14, 11), new Point(0, 0), new Maps.PalletTown(null));
        game.setSize(246, 188);
        game.setVisible(true);
        game.setResizable(false);
        offscreen = game.createImage(game.getWidth(), game.getHeight());
        g = offscreen.getGraphics();
        initEventLog();
    }

    /**
     * Constructor for the game
     * @param loc starting location
     * @param delta movement vector
     * @param map starting area
     */
    public Game(Point loc, Point delta, Maps.Map map)
    {
        super("Main Game");
        game = this;

        currMap = map;
        try {
            player = new Sprite(loc, delta, map);
            myPokemon = new Pokemon.Pikachu();
            myPokemon.setGender("male");
            dialogBox = ImageIO.read(getClass().getResource("/Battle/DialogBox.png"));
            allyInfoBox = ImageIO.read(getClass().getResource("/Battle/AllyInfoBox.png"));
            enemyInfoBox = ImageIO.read(getClass().getResource("/Battle/EnemyInfoBox.png"));
            maleIcon = ImageIO.read(getClass().getResource("/Battle/Male.png"));
            femaleIcon = ImageIO.read(getClass().getResource("/Battle/Female.png"));
            optionBox = ImageIO.read(getClass().getResource("/Battle/OptionBox.png"));
            pointer = ImageIO.read(getClass().getResource("/Battle/Pointer.png"));
            moveMenu = ImageIO.read(getClass().getResource("/Battle/MoveMenu.png"));
        }
        catch (IOException ex) {}

        addKeyListener(new KeyAdapter() {
            public void keyPressed (KeyEvent ke)
            {
                if (allowMovement && !inBattle) {
                    // keyboard input for out of battle
                    int col = 0;
                    int row = 0;
                    message = null;

                    if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
                        if (player.getDirection() == 0) {
                            row++;
                        }
                        direction = 0;
                    }
                    else if (ke.getKeyCode() == KeyEvent.VK_UP) {
                        if (player.getDirection() == 1) {
                            row--;
                        }
                        direction = 1;
                    }
                    else if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
                        if (player.getDirection() == 2) {
                            col--;
                        }
                        direction = 2;
                    }
                    else if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
                        if (player.getDirection() == 3) {
                            col++;
                        }
                        direction = 3;
                    }
                    else if (ke.getKeyCode() == KeyEvent.VK_Z) {
                        Tiles.Tile adjTile;
                        if ((adjTile = player.getAdjacentBottomTile()) != null && adjTile.getMessage() != null) {
                            // retrieves message from tile interacted with
                            message = adjTile.getMessage();
                        }
                        else if ((adjTile = player.getAdjacentTopTile()) != null && adjTile.getMessage() != null) {
                            if (adjTile instanceof Tiles.NPC) {
                                // turns NPC to face player when spoken with
                                ((Tiles.NPC)adjTile).setImage(player.getDirection());
                                ((Tiles.NPC)player.getTileAboveAdjacentTopTile()).setImage(player.getDirection());
                                repaint();
                            }

                            // retrieves message from tile interacted with
                            message = adjTile.getMessage();
                        }
                        repaint();
                    }
                    else if (ke.getKeyCode() == KeyEvent.VK_S) {
                        if (JOptionPane.showConfirmDialog(null, "Would you like to save the game?", "SAVE", JOptionPane.YES_NO_OPTION) == 0) {
                            save();
                        }
                    }
                    else if (ke.getKeyCode() == KeyEvent.VK_L) {
                        if (JOptionPane.showConfirmDialog(null, "Would you like to load a save file?", "LOAD", JOptionPane.YES_NO_OPTION) == 0) {
                            try {
                                load();
                            }
                            catch (IOException ex) {
                                System.out.println(ex.getLocalizedMessage());
                            }
                        }
                    }

                    if (ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_UP ||
                        ke.getKeyCode() == KeyEvent.VK_LEFT || ke.getKeyCode() == KeyEvent.VK_RIGHT && !inBattle) {
                        // moves player
                        timer.schedule(new drawPlayerMovement(direction, new Point(row, col)), 0);
                    }
                }
                else if (allowMovement) {
                    // keyboard input during battle
                    if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
                        if (!inMoveMenu && pointerCoords.y == 149) {
                            pointerCoords.y = 165;
                            repaint();
                        }
                        else if (inMoveMenu && pointerCoords.y == 150) {
                            pointerCoords.y = 166;
                            repaint();
                        }
                    }
                    else if (ke.getKeyCode() == KeyEvent.VK_UP) {
                        if (!inMoveMenu && pointerCoords.y == 165) {
                            pointerCoords.y = 149;
                            repaint();
                        }
                        else if (inMoveMenu && pointerCoords.y == 166) {
                            pointerCoords.y = 150;
                            repaint();
                        }
                    }
                    else if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
                        if (!inMoveMenu && pointerCoords.x == 188) {
                            pointerCoords.x = 132;
                            repaint();
                        }
                        else if (inMoveMenu && pointerCoords.x == 85) {
                            pointerCoords.x = 13;
                            repaint();
                        }

                    }
                    else if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
                        if (!inMoveMenu && pointerCoords.x == 132) {
                            pointerCoords.x = 188;
                            repaint();
                        }
                        else if (inMoveMenu && pointerCoords.x == 13) {
                            pointerCoords.x = 85;
                            repaint();
                        }
                    }
                    else if (ke.getKeyCode() == KeyEvent.VK_Z) {
                        // 'z' key used for confirmation
                        if (!inMoveMenu) {
                            if (pointerCoords.x == 188 && pointerCoords.y == 165) {
                                // run option selected, ends battle
                                inBattle = false;
                                pointerCoords.x = 132;
                                pointerCoords.y = 149;
                                repaint();
                            }
                            else if (pointerCoords.x == 132 && pointerCoords.y == 149) {
                                // enter move selection menu
                                inMoveMenu = true;
                                pointerCoords.x = 13;
                                pointerCoords.y = 150;
                                repaint();
                            }
                        }
                        else {
                            // player and foe select moves which are then performed
                            Moves.Move selectedMove;
                            if (pointerCoords.x == 13 && pointerCoords.y == 150) {
                                selectedMove = myPokemon.getCurrMoveset()[0];
                            }
                            else if (pointerCoords.x == 85 && pointerCoords.y == 150) {
                                selectedMove = myPokemon.getCurrMoveset()[1];
                            }
                            else if (pointerCoords.x == 13 && pointerCoords.y == 166) {
                                selectedMove = myPokemon.getCurrMoveset()[2];
                            }
                            else {
                                selectedMove = myPokemon.getCurrMoveset()[3];
                            }

                            if (selectedMove != null) {
                                // player has selected a valid move, enemy now picks one at random
                                int index = (new Random()).nextInt(4);
                                while (enemyPokemon.getCurrMoveset()[index] == null) {
                                    index = (new Random()).nextInt(4);
                                }
                                Moves.Move enemyMove = enemyPokemon.getCurrMoveset()[index];

                                inMoveMenu = false;
                                pointerCoords.x = 132;
                                pointerCoords.y = 149;

                                int turnOrder;
                                if (myPokemon.getSpe() > enemyPokemon.getSpe()) {
                                    // player's Pokemon is faster
                                    turnOrder = 0;
                                }
                                else if (myPokemon.getSpe() < enemyPokemon.getSpe()) {
                                    // enemy Pokemon is faster
                                    turnOrder = 1;
                                }
                                else {
                                    // speed tie means movement order is selected randomly
                                    turnOrder = (new Random()).nextInt(2);
                                }

                                // schedule threads to animate move performances
                                if (turnOrder == 0) {
                                    timer.schedule(new drawBattleMove(selectedMove, enemyPokemon, myPokemon, false), 0);
                                    timer.schedule(new drawBattleMove(enemyMove, myPokemon, enemyPokemon, true), 0);
                                }
                                else {
                                    timer.schedule(new drawBattleMove(enemyMove, myPokemon, enemyPokemon, false), 0);
                                    timer.schedule(new drawBattleMove(selectedMove, enemyPokemon, myPokemon, true), 0);
                                }
                            }
                        }
                    }
                    else if (ke.getKeyCode() == KeyEvent.VK_X) {
                        if (inMoveMenu) {
                            // back our of move menu
                            inMoveMenu = false;
                            pointerCoords.x = 132;
                            pointerCoords.y = 149;
                            repaint();
                        }
                    }
                }
            }
        });
    }

    /**
     * Initializes all events to incomplete
     */
    public static void initEventLog()
    {
        eventLog.put("GetFirstPokemon", false);
    }

    public class drawDialog extends TimerTask
    {
        private String dialog;

        /**
         * Constructor for drawDialog
         * @param dialog the dialog to be displayed
         */
        public drawDialog(String dialog)
        {
            this.dialog = dialog;
        }

        /**
         * Animates a dialog box
         */
        public void run()
        {
            allowMovement = false;
            message = dialog;
            if (message != null) {
                repaint();

                // delay induced to give player enough time to read
                try {
                    Thread.sleep(2000);
                }
                catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }

                message = null;
                repaint();
            }
            allowMovement = true;
        }
    }

    public class drawBattleMove extends TimerTask
    {
        Moves.Move move = null;
        Pokemon.Pokemon target = null;
        Pokemon.Pokemon attacker = null;
        boolean goingSecond = false;

        /**
         * Constructor for drawBattleMove
         * @param move the move that was chosen by the attacker
         * @param target the Pokemon on which the move is being used
         * @param attacker the Pokemon which is using the move
         * @param goingSecond whether or not this is the second move performed this turn
         */
        public drawBattleMove(Moves.Move move, Pokemon.Pokemon target, Pokemon.Pokemon attacker, boolean goingSecond) {
            this.move = move;
            this.target = target;
            this.attacker = attacker;
            this.goingSecond = goingSecond;
        }

        /**
         * Calculates damage inflicted on target by attacker's selected move
         */
        public void doDamageCalculations()
        {
            // accounting for type effectiveness
            double multiplier = 1;
            if (target.getType1().getWeaknesses().contains(move.getType().getName())) {
                multiplier *= 2;
            }
            else if (target.getType1().getResistances().contains(move.getType().getName())) {
                multiplier *= 0.5;
            }
            else if (target.getType1().getImmunities().contains(move.getType().getName())) {
                multiplier *= 0;
            }

            if (target.getType2() != null) {
                if (target.getType2().getWeaknesses().contains(move.getType().getName())) {
                    multiplier *= 2;
                }
                else if (target.getType2().getResistances().contains(move.getType().getName())) {
                    multiplier *= 0.5;
                }
                else if (target.getType2().getImmunities().contains(move.getType().getName())) {
                    multiplier *= 0;
                }
            }

            // apply the correct message depending on the damage multiplier
            battleMessage = attacker.getName() + " used " + move.getName() + "!";
            if (multiplier == 0) {
                battleMessage += " It doesn't affect " + target.getName() + "...";
            }
            else if (multiplier == 2 || multiplier == 4) {
                battleMessage += " It's super effective!";
            }
            else if (multiplier == 0.5 || multiplier == 0.25) {
                battleMessage += " It's not very effective...";
            }

            // accounting for same type attack bonus
            if (attacker.getType1() == move.getType()) {
                multiplier *= 1.5;
            }
            else if (attacker.getType2() == move.getType()) {
                multiplier *= 1.5;
            }

            // damage output varies between 85% and 100%
            multiplier *= ((double)(new Random()).nextInt(16) + 85)/100;

            // if the attack is non-damaging neither conditional will be fulfilled and damage will remain at zero
            int damage = 0;
            if (move.getCategory().equals("physical")) {
                damage = (int)(((210. / 250.) * ((double) attacker.getAtk() / target.getDef()) * move.getPower() + 2) * multiplier);
            }
            else if (move.getCategory().equals("special")) {
                damage = (int)(((210. / 250.) * ((double) attacker.getSpA() / target.getSpD()) * move.getPower() + 2) * multiplier);
            }

            // calculating before and after HP for use in animation
            prevHPLength = (int)(48*target.getHPPercent());
            target.decrementCurrHP(damage);
            currHPLength = (int)(48*target.getHPPercent());
        }

        /**
         * Animates a Pokemon's HP draining
         */
        public void run()
        {
            int randNbr = (new Random()).nextInt(100) + 1;
            if (randNbr <= move.getAccuracy()) { // move lands
                // don't perform the attack if the Pokemon was already knocked out that turn
                if (attacker.getCurrHP() == 0) {
                    return;
                }

                doDamageCalculations();

                allowMovement = false;
                showOptionBox = false;
                if (target == myPokemon) {
                    myPokemonDamaged = true;
                }
                else {
                    enemyPokemonDamaged = true;
                }

                for (int i = prevHPLength - currHPLength; i >= 0; i--) {
                    // delay induced so that animation moves at consistent speed
                    try {
                        Thread.sleep(100);
                    }
                    catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                    diff = i;
                    repaint();
                }

                // delay induced so that message lingers for a bit
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                if (goingSecond) {
                    repaint();
                }

                if (myPokemon.getCurrHP() == 0 || enemyPokemon.getCurrHP() == 0) {
                    // exit battle and reset pointer location
                    inBattle = false;
                    pointerCoords.x = 132;
                    pointerCoords.y = 149;

                    if (myPokemon.getCurrHP() == 0) {
                        // replenish player's Pokemon's health if knocked out
                        myPokemon.setCurrHP(myPokemon.getHP());
                    }
                    repaint();
                }

                battleMessage = null;
                allowMovement = true;
                showOptionBox = true;
                if (target == myPokemon) {
                    myPokemonDamaged = false;
                } else {
                    enemyPokemonDamaged = false;
                }
            }
            else { // move misses
                battleMessage = attacker.getName() + " used " + move.getName() + "!";
                battleMessage += " " + attacker.getName() + "'s attack missed!";
                moveMissed = true;
                repaint();

                // delay induced so that message lingers for a bit
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }

                battleMessage = null;
                moveMissed = false;
                repaint();
            }
        }
    }

    public class drawPlayerMovement extends TimerTask
    {
        private int direction;
        private Point delta;

        /**
         * Constructor for drawPlayerMovement
         * @param direction the direction in which the player is facing
         * @param delta the movement vector of the player
         */
        public drawPlayerMovement(int direction, Point delta)
        {
            this.direction = direction;
            this.delta = delta;
        }

        /**
         * Animates player movement
         */
        public void run()
        {
            player.setDeltaPoint(delta);
            XOffset = 0;
            YOffset = 0;
            allowMovement = false; // do not allow for key input mid-animation
            if (player.canUpdate()) {
                // sets up half tile increment mid-animation
                if (direction == player.getDirection()) {
                    if (direction == 0) {
                        YOffset = -8;
                    }
                    else if (direction == 1) {
                        YOffset = 8;
                    }
                    else if (direction == 2) {
                        XOffset = 8;
                    }
                    else {
                        XOffset = -8;
                    }
                }
            }

            // sets the correct frame for the player depending on movement direction
            if (direction == 0) {
                if (stepRight) {
                    player.setDirection(4);
                }
                else {
                    player.setDirection(5);
                }
            }
            else if (direction == 1) {
                if (stepRight) {
                    player.setDirection(6);
                }
                else {
                    player.setDirection(7);
                }
            }
            else if (direction == 2) {
                if (stepRight) {
                    player.setDirection(8);
                }
                else {
                    player.setDirection(9);
                }
            }
            else {
                if (stepRight) {
                    player.setDirection(10);
                }
                else {
                    player.setDirection(11);
                }
            }

            // alternates between stepping with left and right foot
            stepRight = !stepRight;
            repaint();

            // delay induced so that animation moves at consistent speed
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            player.update(direction); // translates sprite location
            if (direction == player.getDirection()) {
                if (direction == 0) {
                    YOffset = 0;
                }
                else if (direction == 1) {
                    YOffset = 0;
                }
                else if (direction == 2) {
                    XOffset = 0;
                }
                else {
                    XOffset = 0;
                }
            }
            repaint();

            // segment responsible for triggering an event associated with the tile
            Tiles.Tile currTile = player.getCurrentBottomTile();
            Events.Event event = currTile.getEvent();
            if (event != null && !(Boolean)eventLog.get(event.getName()) && event.prerequisitesCompleted()) {
                currTile.getEvent().runEvent(game, timer);
                eventLog.replace(event.getName(), true);
            }

            // segment responsible for warping player if stepping through a door, etc.
            if (currTile.getWarpPoint() != null && currTile.getWarpArea() != null) {
                player.setLocation(currTile.getWarpPoint());
                currMap = currTile.getWarpArea();
                player.setArea(currMap);
                currMap.setVariableTileProperties(eventLog);
                repaint();
            }

            // delay induced so that animation moves at consistent speed
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            // determine if random encounter occurs
            if (player.getCurrentBottomTile() instanceof Tiles.TallGrass && currMap.getPossibleEncounters() != null) {
                int randNbr = (new Random()).nextInt(100) + 1;
                if (randNbr <= 10) {
                    inBattle = true;
                    LinkedList<Pokemon.Pokemon> possibleEncounters = currMap.getPossibleEncounters();
                    if (possibleEncounters != null) {
                        enemyPokemon = possibleEncounters.get((new Random()).nextInt(possibleEncounters.size()));
                    }
                    repaint();

                    // delay induced so that pointer animation in battle is not rushed
                    try {
                        Thread.sleep(300);
                    }
                    catch(InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            allowMovement = true; // allow for key input again
        }
    }

    /**
     * Saves the current game state to file
     */
    public void save()
    {
        // Creates the file writer in the right directory
        PrintWriter writer;
        try {
            writer = new PrintWriter("src/Main/SaveFile.txt", "UTF-8");
        }
        catch (UnsupportedEncodingException ex) {
            System.out.println(ex.getLocalizedMessage());

            return;
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getLocalizedMessage());

            return;
        }

        // write the save file in the correct format
        writer.println("myPokemon");
        writer.println(myPokemon.getName());
        writer.println(myPokemon.getGender());
        writer.println(myPokemon.getCurrHP());
        writer.println(myPokemon.getHPEV());
        writer.println(myPokemon.getAtkEV());
        writer.println(myPokemon.getDefEV());
        writer.println(myPokemon.getSpAEV());
        writer.println(myPokemon.getSpDEV());
        writer.println(myPokemon.getSpeEV());
        writer.println("player");
        writer.println(player.getLocation().x);
        writer.println(player.getLocation().y);
        writer.println(player.getDirection());
        writer.println("eventLog");
        for (Object eventCompleted : eventLog.values()) {
            writer.println(eventCompleted);
        }
        writer.println("currMap");
        writer.println(currMap.getName());
        for (int row = 0; row < currMap.getRowNumber(); row++) {
            for (int col = 0; col < currMap.getColNumber(); col++) {
                if (currMap.getTopTile(new Point(row, col)) instanceof Tiles.NPC) {
                    writer.println("NPC");
                    writer.println(row);
                    writer.println(col);
                    writer.println(((Tiles.NPC)currMap.getTopTile(new Point(row, col))).getDirection());
                }
            }
        }
        writer.close();
    }

    /**
     * Loads a game state from a save file
     */
    public void load() throws IOException
    {
        // create the reader for the file so we can iterate line by line
        FileInputStream file = new FileInputStream("src/Main/SaveFile.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(file));

        // iterate through the file line by line, loading each value to its corresponding variable
        String line;
        GameDictionary dict = new GameDictionary();
        while ((line = reader.readLine()) != null) {
            if (line.equals("myPokemon")) {
                myPokemon = (Pokemon.Pokemon)dict.get(reader.readLine());
                myPokemon.setGender(reader.readLine());
                myPokemon.setCurrHP(Integer.parseInt(reader.readLine()));
                int[] EVs = new int[6];
                for (int i = 0; i < 6; i++) {
                    EVs[i] = Integer.parseInt(reader.readLine());
                }
                myPokemon.setEVs(EVs[0], EVs[1], EVs[2], EVs[3], EVs[4], EVs[5]);
            }
            else if (line.equals("player")) {
                int row = Integer.parseInt(reader.readLine());
                int col = Integer.parseInt(reader.readLine());
                player.setLocation(new Point(row, col));
                player.setDirection(Integer.parseInt(reader.readLine()));
            }
            else if (line.equals("eventLog")) {
                for (Object eventName : eventLog.keySet()) {
                    eventLog.replace(eventName, Boolean.valueOf(reader.readLine()));
                }
            }
            else if (line.equals("currMap")) {
                currMap = (Maps.Map)dict.get(reader.readLine());
                player.setArea(currMap);
                currMap.setVariableTileProperties(eventLog);
            }
            else if (line.equals("NPC")) {
                int row = Integer.parseInt(reader.readLine());
                int col = Integer.parseInt(reader.readLine());
                ((Tiles.NPC)currMap.getTopTile(new Point(row, col))).setDirection(Integer.parseInt(reader.readLine()));
            }
        }
        reader.close();

        repaint();
    }

    public void paint(Graphics graphics)
    {
        g.setColor(SystemColor.control);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setFont(new Font(g.getFont().getName(), Font.PLAIN, 9));

        if (!inBattle) {
            // draws the bottom layer of the area map
            Point loc = player.getLocation();
            for (int row = loc.x - 5; row <= loc.x + 5; row++) {
                for (int col = loc.y - 8; col <= loc.y + 8; col++) {
                    Point currLoc = new Point(row, col);
                    Tiles.Tile bottomTile = currMap.getBottomTile(currLoc);
                    if (bottomTile != null) {
                        g.drawImage(bottomTile.getImage(), 16 * (col - loc.y) + 115 + XOffset, 16 * (row - loc.x) + 98 + YOffset, this);
                    }
                }
            }

            // draws the player character
            g.drawImage(player.getCurrentImage(), 115, 98, this);

            // draws the top layer of the area map
            for (int row = loc.x - 5; row <= loc.x + 5; row++) {
                for (int col = loc.y - 8; col <= loc.y + 8; col++) {
                    Point currLoc = new Point(row, col);
                    Tiles.Tile topTile = currMap.getTopTile(currLoc);
                    if (topTile != null) {
                        g.drawImage(topTile.getImage(), 16 * (col - loc.y) + 115 + XOffset, 16 * (row - loc.x) + 98 + YOffset, this);
                    }
                }
            }

            // draws the appropriate hat for the player character depending on direction faced
            if (player.getDirection() == 0 || player.getDirection() == 1) {
                g.drawImage(player.getHat(0), 115, 82, this);
            }
            else if (player.getDirection() == 2) {
                g.drawImage(player.getHat(1), 115, 82, this);
            }
            else if (player.getDirection() == 3) {
                g.drawImage(player.getHat(2), 115, 82, this);
            }
            else if (player.getDirection() >= 4 || player.getDirection() <= 7) {
                g.drawImage(player.getHat(3), 115, 82, this);
            }
            else if (player.getDirection() == 8 || player.getDirection() == 9) {
                g.drawImage(player.getHat(4), 115, 82, this);
            }
            else {
                g.drawImage(player.getHat(5), 115, 82, this);
            }

            if (message != null) {
                g.drawImage(dialogBox, 3, 138, this);
                g.setColor(Color.WHITE);
                g.drawString(message, 19, 166);
            }
        }
        else {
            // draws the battle scene
            try {
                g.drawImage(currMap.getBattleBackground(), 3, 25, this);
            }
            catch (IOException ex) {
                super.paintComponents(g);
            }
            g.drawImage(myPokemon.getBackSprite(), 43, 73, this);
            g.drawImage(enemyPokemon.getFrontSprite(), 147, 47, this);
            g.drawImage(enemyInfoBox, 16, 41, this);
            g.drawImage(allyInfoBox, 129, 99, this);

            // fills in player's Pokemon's HP bar
            double HPPercent = myPokemon.getHPPercent();
            if (!myPokemonDamaged) {
                if (HPPercent >= 0.5) {
                    g.setColor(new Color(88, 208, 128));
                }
                else if (HPPercent >= 0.25) {
                    g.setColor(new Color(200, 168, 9));
                }
                else {
                    g.setColor(new Color(168, 64, 72));
                }
                g.fillRect(177, 116, (int)(48*HPPercent), 1);
            }
            else {
                if (((int)(48*HPPercent) + diff)/48. >= 0.5) {
                    g.setColor(new Color(88, 208, 128));
                }
                else if (((int)(48*HPPercent) + diff)/48. >= 0.25) {
                    g.setColor(new Color(200, 168, 9));
                }
                else {
                    g.setColor(new Color(168, 64, 72));
                }
                g.fillRect(177, 116, (int)(48*HPPercent) + diff, 1);
            }

            if (!myPokemonDamaged) {
                if (HPPercent >= 0.5) {
                    g.setColor(new Color(112, 248, 168));
                }
                else if (HPPercent >= 0.25) {
                    g.setColor(new Color(248, 224, 56));
                }
                else {
                    g.setColor(new Color(248, 88, 56));
                }
                g.fillRect(177, 117, (int)(48*HPPercent), 2);
            }
            else {
                if (((int)(48*HPPercent) + diff)/48. >= 0.5) {
                    g.setColor(new Color(112, 248, 168));
                }
                else if (((int)(48*HPPercent) + diff)/48. >= 0.25) {
                    g.setColor(new Color(248, 224, 56));
                }
                else {
                    g.setColor(new Color(248, 88, 56));
                }
                g.fillRect(177, 117, (int)(48*HPPercent) + diff, 2);
            }

            // fills in enemy Pokemon's HP bar
            HPPercent = enemyPokemon.getHPPercent();
            if (!enemyPokemonDamaged) {
                if (HPPercent >= 0.5) {
                    g.setColor(new Color(88, 208, 128));
                }
                else if (HPPercent >= 0.25) {
                    g.setColor(new Color(200, 168, 9));
                }
                else {
                    g.setColor(new Color(168, 64, 72));
                }
                g.fillRect(55, 58, (int)(48*HPPercent), 1);
            }
            else {
                if (((int)(48*HPPercent) + diff)/48. >= 0.5) {
                    g.setColor(new Color(88, 208, 128));
                }
                else if (((int)(48*HPPercent) + diff)/48. >= 0.25) {
                    g.setColor(new Color(200, 168, 9));
                }
                else {
                    g.setColor(new Color(168, 64, 72));
                }
                g.fillRect(55, 58, (int)(48*HPPercent) + diff, 1);
            }

            if (!enemyPokemonDamaged) {
                if (HPPercent >= 0.5) {
                    g.setColor(new Color(112, 248, 168));
                }
                else if (HPPercent >= 0.25) {
                    g.setColor(new Color(248, 224, 56));
                }
                else {
                    g.setColor(new Color(248, 88, 56));
                }
                g.fillRect(55, 59, (int)(48*HPPercent), 2);
            }
            else {
                if (((int)(48*HPPercent) + diff)/48. >= 0.5) {
                    g.setColor(new Color(112, 248, 168));
                }
                else if (((int)(48*HPPercent) + diff)/48. >= 0.25) {
                    g.setColor(new Color(248, 224, 56));
                }
                else {
                    g.setColor(new Color(248, 88, 56));
                }
                g.fillRect(55, 59, (int)(48*HPPercent) + diff, 2);
            }

            g.setColor(Color.BLACK);
            if (!inMoveMenu && !moveMissed) {
                g.drawImage(dialogBox, 3, 137, this);
                if (showOptionBox) {
                    g.drawImage(optionBox, 123, 137, this);
                    g.drawImage(pointer, pointerCoords.x, pointerCoords.y, this);
                }
            }
            else if (!moveMissed) {
                g.drawImage(moveMenu, 3, 137, this);
                g.drawImage(pointer, pointerCoords.x, pointerCoords.y, this);

                if (myPokemon.getCurrMoveset()[0] != null) {
                    g.drawString(myPokemon.getCurrMoveset()[0].getName(), 20, 158);
                    if (pointerCoords.x == 13 && pointerCoords.y == 150) {
                        g.drawString(myPokemon.getCurrMoveset()[0].getType().getName(), 193, 158);
                    }
                }
                else {
                    g.drawString("---", 20, 158);
                }

                // write out all of the player's Pokemon's moves when in the move selection menu
                if (myPokemon.getCurrMoveset()[1] != null) {
                    g.drawString(myPokemon.getCurrMoveset()[1].getName(), 92, 158);
                    if (pointerCoords.x == 85 && pointerCoords.y == 150) {
                        g.drawString(myPokemon.getCurrMoveset()[1].getType().getName(), 193, 158);
                    }
                }
                else {
                    g.drawString("---", 92, 158);
                }

                if (myPokemon.getCurrMoveset()[2] != null) {
                    g.drawString(myPokemon.getCurrMoveset()[2].getName(), 20, 174);
                    if (pointerCoords.x == 13 && pointerCoords.y == 166) {
                        g.drawString(myPokemon.getCurrMoveset()[2].getType().getName(), 193, 158);
                    }
                }
                else {
                    g.drawString("---", 20, 174);
                }

                if (myPokemon.getCurrMoveset()[3] != null) {
                    g.drawString(myPokemon.getCurrMoveset()[3].getName(), 92, 174);
                    if (pointerCoords.x == 85 && pointerCoords.y == 166) {
                        g.drawString(myPokemon.getCurrMoveset()[3].getType().getName(), 193, 158);
                    }
                }
                else {
                    g.drawString("---", 92, 174);
                }
            }
            else {
                g.drawImage(dialogBox, 3, 137, this);
            }

            // write out each Pokemon's name
            g.drawString(myPokemon.getName(), 146, 112);
            g.drawString(enemyPokemon.getName(), 24, 54);
            if (battleMessage != null) {
                g.setColor(Color.WHITE);
                g.drawString(battleMessage, 19, 165);
            }
            FontMetrics fontMetrics = g.getFontMetrics();

            // draw each Pokemon's corresponding gender icon
            if (myPokemon.getGender().equals("male")) {
                g.drawImage(maleIcon, 146 + fontMetrics.stringWidth(myPokemon.getName()), 104, this);
            }
            else if (myPokemon.getGender().equals("female")) {
                g.drawImage(femaleIcon, 146 + fontMetrics.stringWidth(myPokemon.getName()), 104, this);
            }

            if (enemyPokemon.getGender().equals("male")) {
                g.drawImage(maleIcon, 24 + fontMetrics.stringWidth(enemyPokemon.getName()), 46, this);
            }
            else if (enemyPokemon.getGender().equals("female")) {
                g.drawImage(femaleIcon, 24 + fontMetrics.stringWidth(enemyPokemon.getName()), 46, this);
            }
        }

        // draws image all at once to eliminate flickering
        graphics.drawImage(offscreen, 0, -1, this);
    }
}