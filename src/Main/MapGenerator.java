package Main;

/**
 * Generates a file for a map
 * @author Ran Crook
 */

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.util.*;

public class MapGenerator extends GUIFrame
{
    private static String filename = null;
    private static String[] tileNames = new File("src/Tiles/Tile Images").list();
    private Point[][] tileCoords = null;                        // On-screen coordinates for tile sidebar
    private Point[][] mapCoords = null;                         // On-screen coordinates for map squares
    private Image[][] bottomMapTiles = null;                    // Bottom map
    private Image[][] topMapTiles = null;                       // Top map
    private Image[][] currMapTiles = null;                      // Current map being edited
    private Image[] tileImgs = new Image[tileNames.length];
    private static int nbrRows = 0;
    private static int nbrCols = 0;
    private int mouseX;
    private int mouseY;
    private Image currImg = null;                               // The tile that user is dragging
    private Image prevImg = null;                               // The tile that user dropped last
    private PrintWriter writer = null;
    private boolean delete = false;                             // Toggles deletion mode
    private static Image offscreen;
    private static Graphics g;

    /**
     * Constructor for a map
     */
    public MapGenerator()
    {
        super(null);

        // Initialize arrays
        tileCoords = new Point[30][(tileNames.length/30) + 1];
        bottomMapTiles = new Image[nbrRows][nbrCols];
        topMapTiles = new Image[nbrRows][nbrCols];
        mapCoords = new Point[nbrRows][nbrCols];

        // Calculate on-screen coordinates for map squares
        for (int row = 0; row < nbrRows; row++) {
            for (int col = 0; col < nbrCols; col++) {
                bottomMapTiles[row][col] = null;
                topMapTiles[row][col] = null;
                mapCoords[row][col] = new Point(4 + 17*col, 26 + 17*row);
            }
        }
        currMapTiles = bottomMapTiles; // Default map to be edited

        // Load all the images based on the names in tileNames
        for (int i = 0; i < tileNames.length; i++) {
            try {
                tileImgs[i] = ImageIO.read(getClass().getResource("/Tiles/Tile Images/" + tileNames[i]));
            }
            catch (IOException ex) {
                tileImgs[i] = null;
            }
        }

        // Calculate on-screen coordinates for tile sidebar
        for (int col = 0; col < (tileNames.length/30) + 1; col++) {
            for (int row = 0; row < 30; row++) {
                if (30*col + row < tileNames.length) {
                    tileCoords[row][col] = new Point(17*nbrCols + 4 + 17*col, 26 + 17*row);
                }
                else {
                    tileCoords[row][col] = null;
                }
            }
        }

        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent me) {
                mouseX = me.getX() + 1;
                mouseY = me.getY() + 1;

                repaint();
            }
        });

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me)
            {
                mouseX = me.getX() + 1;
                mouseY = me.getY() + 1;
                int row = 0;
                int col = 0;

                // Find out which tile corresponds to the location we clicked
                while (row < mapCoords.length && mapCoords[row][0].y < mouseY) {
                    row++;
                }
                while (col < mapCoords[0].length && mapCoords[0][col].x < mouseX) {
                    col++;
                }

                row--;
                col--;
                if (delete) {
                    if (row >= 0 && col >= 0 && mouseX <= mapCoords[row][col].x + 16 && mouseY <= mapCoords[row][col].y + 16) {
                        // Delete tile in this square by setting it to null
                        currMapTiles[row][col] = null;
                    }
                }
                else {
                    if (row >= 0 && col >= 0 && mouseX <= mapCoords[row][col].x + 16 && mouseY <= mapCoords[row][col].y + 16) {
                        // Replicate previous tile dragged
                        currMapTiles[row][col] = prevImg;
                    }
                    else {
                        // Dragging new tile
                        row = 0;
                        col = 0;

                        while (row < tileCoords.length && tileCoords[row][0].y < mouseY) {
                            row++;
                        }
                        while (col < tileCoords[0].length && tileCoords[0][col].x < mouseX) {
                            col++;
                        }

                        row--;
                        col--;
                        if (row + tileCoords.length * col < tileNames.length && row + tileCoords.length * col >= 0) {
                            currImg = tileImgs[row + tileCoords.length * col];
                            prevImg = currImg;
                        }
                    }
                }

                repaint();
            }

            public void mouseReleased(MouseEvent me)
            {
                if (!delete) {
                    int row = 0;
                    int col = 0;

                    // Find out which map square corresponds to the location we dropped the tile at
                    while (row < mapCoords.length && mapCoords[row][0].y < mouseY) {
                        row++;
                    }
                    while (col < mapCoords[0].length && mapCoords[0][col].x < mouseX) {
                        col++;
                    }

                    row--;
                    col--;
                    if (row >= 0 && col >= 0 && mouseX <= mapCoords[row][col].x + 16 && mouseY <= mapCoords[row][col].y + 16) {
                        currMapTiles[row][col] = prevImg;
                    }
                    currImg = null;

                    repaint();
                }
            }
        });

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke)
            {
                if (ke.getKeyCode() == KeyEvent.VK_SPACE) {
                    // Alternate between editing top and bottom maps
                    if (currMapTiles == bottomMapTiles) {
                        currMapTiles = topMapTiles;
                    }
                    else {
                        currMapTiles = bottomMapTiles;
                    }

                    repaint();
                }
                else if (ke.getKeyCode() == KeyEvent.VK_S) {
                    if (JOptionPane.showConfirmDialog(null, "Would you like to save your work so far?", "SAVE", JOptionPane.YES_NO_OPTION) == 0) {
                        save();
                    }
                }
                else if (ke.getKeyCode() == KeyEvent.VK_D) {
                    delete = !delete;
                }
            }
        });
    }

    public static void main(String[] args)
    {
        // Request file name and exit if it's blank
        filename = JOptionPane.showInputDialog(null, "Enter name for the map:", "INPUT1", JOptionPane.QUESTION_MESSAGE);
        if (filename == null || filename.isEmpty()) {
            System.exit(0);
        }

        // Request number of rows and columns for the map
        String input = JOptionPane.showInputDialog(null, "Enter number of rows:", "INPUT2", JOptionPane.QUESTION_MESSAGE);
        nbrRows = Integer.parseInt(input);
        input = JOptionPane.showInputDialog(null, "Enter number of columns:", "INPUT3", JOptionPane.QUESTION_MESSAGE);
        nbrCols = Integer.parseInt(input);

        MapGenerator mg = new MapGenerator();
        mg.setSize(17*(nbrCols + (tileNames.length/30)) + 24, Math.max(539, 17 * nbrRows + 29));
        mg.setVisible(true);
        mg.setResizable(false);
        offscreen = mg.createImage(mg.getWidth(), mg.getHeight());
        g = offscreen.getGraphics();
    }

    /**
     * Saves our map to disk
     */
    public void save()
    {
        // Creates the file writer in the right directory
        try {
            writer = new PrintWriter("src/Maps/" + filename + ".java", "UTF-8");
        }
        catch (UnsupportedEncodingException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getLocalizedMessage());
        }

        // Generate the tile variables as a string
        String tiles = "";
        Map dict = new HashMap();
        for (int i = 0; i < tileNames.length; i++) {
            String buffer = "";
            if (Integer.toString(i).length() == 1) {
                buffer = "00";
            }
            else if (Integer.toString(i).length() == 2) {
                buffer = "0";
            }

            // Add a new variable declaration to the string and match its name to its code
            tiles += "\tTiles.Tile t" + buffer + i + " = new Tiles." + tileNames[i].substring(0, tileNames[i].length() - 4) + "();\n";
            dict.put(tileNames[i].substring(0, tileNames[i].length() - 4), "t" + buffer + i);
        }

        // Generate the two arrays representing both layers of the map as two strings
        String bottomMap = "{\n";
        String topMap = "{\n";
        for (int row = 0; row < nbrRows; row++) {
            bottomMap += "\t\t\t\t\t\t{";
            topMap += "\t\t\t\t\t\t{";
            for (int col = 0; col < nbrCols; col++) {
                boolean bottomTileFound = false;
                boolean topTileFound = false;

                // Mark the appropriate entry in the array with a tile code
                for (int i = 0; i < tileNames.length; i++) {
                    if (bottomMapTiles[row][col] == tileImgs[i]) {
                        bottomMap += dict.get(tileNames[i].substring(0, tileNames[i].length() - 4)) + ", ";
                        bottomTileFound = true;
                    }

                    if (topMapTiles[row][col] == tileImgs[i]) {
                        topMap += dict.get(tileNames[i].substring(0, tileNames[i].length() - 4)) + ", ";
                        topTileFound = true;
                    }
                }

                // If the tile is empty, mark it with null
                if (!bottomTileFound) {
                    bottomMap += "null, ";
                }
                if (!topTileFound) {
                    topMap += "null, ";
                }
            }
            bottomMap += "},\n";
            topMap += "},\n";
        }
        bottomMap += "\t\t\t\t}";
        topMap += "\t\t\t\t}";

        // Generates the file in the correct format
        writer.print(
                "package Maps;\n" +
                        "\n" +
                        "/**\n" +
                        " * Area map of " + filename + "\n" +
                        " * @author Ran Crook\n" +
                        " */\n" +
                        "\n" +
                        "import java.awt.*;\n" +
                        "import java.util.*;\n" +
                        "\n" +
                        "public class " + filename + " extends Map\n" +
                        "{\n" + tiles + "\n" +
                        "    public " + filename + "(LinkedList<Map> sourceMaps)\n" +
                        "    {\n" +
                        "        super(sourceMaps);\n" +
                        "\n" +
                        "        super.setMaps(\n" +
                        "                new Tiles.Tile[][] " + bottomMap + ",\n" +
                        "                new Tiles.Tile[][] " + topMap + ");\n" +
                        "    }\n" +
                        "}"
        );
        writer.close();
    }

    public void paint(Graphics graphics)
    {
        // Set the title for the window
        if (currMapTiles == bottomMapTiles) {
            super.setTitle(filename + ": Bottom Map");
        }
        else {
            super.setTitle(filename + ": Top Map");
        }

        g.setColor(SystemColor.control);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Draw what we currently have for our top and bottom maps
        for (int row = 0; row < nbrRows; row++) {
            for (int col = 0; col < nbrCols; col++) {
                if (bottomMapTiles[row][col] == null) {
                    g.setColor(Color.WHITE);
                    g.fillRect(mapCoords[row][col].x, mapCoords[row][col].y, 16, 16);
                }
                else {
                    g.drawImage(bottomMapTiles[row][col], mapCoords[row][col].x, mapCoords[row][col].y, this);
                }

                if (topMapTiles[row][col] != null) {
                    g.drawImage(topMapTiles[row][col], mapCoords[row][col].x, mapCoords[row][col].y, this);
                }
            }
        }

        // Draw the tile sidebar
        for (int col = 0; col < tileCoords[0].length; col++) {
            for (int row = 0; row < tileCoords.length; row++) {
                if (row + tileCoords.length * col < tileNames.length && tileImgs[row + tileCoords.length * col] != null) {
                    g.drawImage(tileImgs[row + tileCoords.length * col], tileCoords[row][col].x, tileCoords[row][col].y, this);
                }
                else {
                    break;
                }
            }
        }

        // Draw the tile we're dragging
        if (currImg != null) {
            g.drawImage(currImg, mouseX - 8, mouseY - 8, this);
        }

        // draws image all at once to eliminate flickering
        graphics.drawImage(offscreen, 0, 0, this);
    }
}