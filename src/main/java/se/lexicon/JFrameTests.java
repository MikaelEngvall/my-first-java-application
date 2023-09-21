package se.lexicon;

import javax.swing.*;

public class JFrameTests {
    public static void main(String[] args) {
        //Better safe than sorry in case of I'll run multi threads
        SwingUtilities.invokeLater(MainFrame::new); // Calling my own frame
    }
}
