package se.lexicon;

import javax.swing.*;
import java.awt.*;


public class MainFrame extends JFrame {

    public MainFrame() {
        super("Hello World");

        setLayout(new BorderLayout());

        //Adding components
        ToolBar toolBar = new ToolBar();
        JTextArea textArea = new JTextArea();
        TextPanel textPanel = new TextPanel();
        JButton button = new JButton("Click me");

        //We are going to listen to the button. So we can tell it what to do when clicked
//        button.addActionListener(e -> textArea.append("Hi there!\n"));
        button.addActionListener(e -> textPanel.append("Hi there!\n"));

//        add(textArea, BorderLayout.CENTER); //Placing my components in the frame
        add(toolBar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
