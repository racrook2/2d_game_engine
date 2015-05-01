package Main;

/**
 * Streamlines Frame functionality
 * @author Ran Crook
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIFrame extends JFrame {
    /**
     * Constructor for a Main.GUIFrame
     * @param title shows up at top of window
     */
    public GUIFrame (String title) {
        super(title); // title that shows up at top of window
        setBackground(SystemColor.control);

        addWindowListener(new WindowAdapter() {
            // method runs when window is closed
            public void windowClosing (WindowEvent evt) {
                dispose();
                // exits window
                System.exit(0);
            }
        });
    }

    /**
     * Allows us to hide or show the window
     * @param visible whether or not we want to show the window
     */
    public void setVisible (boolean visible) {
        if (visible) {
            // determines size of window and centers it on screen
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            setLocation(d.width/2 - super.getSize().width/2, Math.max(d.height/2 - super.getSize().height/2, 0));
        }

        // sets visible using method from Frame
        super.setVisible(visible);
    }
}