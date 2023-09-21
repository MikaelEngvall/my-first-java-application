package se.lexicon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JPanel implements ActionListener {
    private JButton helloButton;
    private JButton byeButton;

    public ToolBar() {
        helloButton = new JButton("Hello!");
        byeButton = new JButton("Bye!");

        helloButton.addActionListener(this);
        byeButton.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(helloButton);
        add(byeButton);
    }

    public void setTextPanel(TextPanel textPanel) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        if (clicked == helloButton) {
            System.out.println("Hello!");
        } else {
            System.out.println("Bye!");
        }
    }
}
