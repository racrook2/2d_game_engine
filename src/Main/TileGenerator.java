package Main;

/**
 * Generates a file for a tile
 * @author Ran Crook
 */

import javax.swing.*;
import java.io.*;

public class TileGenerator
{
    private static String filename = null;
    private static String canBeTraversed = null;
    private static PrintWriter writer = null;

    public static void main(String[] args) throws IOException
    {
        // Will continue until user cancels out
        while (true) {
            // Asks for the tile's name as input
            filename = JOptionPane.showInputDialog(null, "Enter name for the tile:", "INPUT1", JOptionPane.QUESTION_MESSAGE);
            if (filename == null || filename.isEmpty()) {
                break;
            }

            // Asks for whether or not the tile can be traversed
            canBeTraversed = JOptionPane.showInputDialog(null, "Enter 'true' or 'false' for canBeTraversed:", "INPUT2", JOptionPane.QUESTION_MESSAGE);
            if (canBeTraversed == null || canBeTraversed.isEmpty()) {
                break;
            }

            // canBeTraversed defaults to "false" in case of typos
            if (!canBeTraversed.equals("false")) {
                canBeTraversed = "true";
            }

            // Creates the file writer in the right directory
            try {
                writer = new PrintWriter("src/Tiles/" + filename + ".java", "UTF-8");
            }
            catch (UnsupportedEncodingException ex) {
                System.out.println(ex.getLocalizedMessage());
            }
            catch (FileNotFoundException ex) {
                System.out.println(ex.getLocalizedMessage());
            }

            // Generates the file in the correct format
            writer.print(
                    "package Tiles;\n" +
                            "\n" +
                            "/**\n" +
                            " * " + filename + " tile\n" +
                            " * @author Ran Crook\n" +
                            " */\n" +
                            "\n" +
                            "import javax.imageio.ImageIO;\n" +
                            "import java.io.IOException;\n" +
                            "\n" +
                            "public class " + filename + " extends Tile\n" +
                            "{\n" +
                            "    public " + filename + "()\n" +
                            "    {\n" +
                            "        super(null);\n" +
                            "        try {\n" +
                            "            setImage(ImageIO.read(getClass().getResource(\"/Tiles/Tile Images/" + filename + ".png\")));\n" +
                            "        }\n" +
                            "        catch (IOException ex) {\n" +
                            "            setImage(null);\n" +
                            "        }\n" +
                            "    }\n" +
                            "\n" +
                            "    public boolean canBeTraversed()\n" +
                            "    {\n" +
                            "        return " + canBeTraversed + ";\n" +
                            "    }\n" +
                            "}"
            );
            writer.close();
        }
    }
}