package se.lexicon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class GUIYatzy extends JFrame {

    private static final int DICE_COUNT = 5;
    private static final int MAX_DICE_VALUE = 6;

    private final JButton[] diceButtons;
    private final JTextField[] scoreFields;
    private final int[] scores;
    private final int[] dice;

    public GUIYatzy() {
        super("Yatzy");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1));

        diceButtons = new JButton[DICE_COUNT];
        for (int i = 0; i < DICE_COUNT; i++) {
            JButton button = new JButton();
            int finalI = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Re-roll the die
                    dice[finalI] = new Random().nextInt(MAX_DICE_VALUE) + 1;
                    updateDiceButtons();
                }
            });
            diceButtons[i] = button;
            panel.add(button);
        }

        JButton rollButton = new JButton("Roll");
        rollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Roll all the dice
                for (int i = 0; i < DICE_COUNT; i++) {
                    dice[i] = new Random().nextInt(MAX_DICE_VALUE) + 1;
                }
                updateDiceButtons();
            }
        });
        panel.add(rollButton);

        JButton scoreButton = new JButton("Score");
        scoreButton.addActionListener(e -> {
//             Calculate the score for the current dice roll
            int score = calculateScore();
//             scores[scoreIndex] = score; // Not used
            updateScoreFields();
        });
        panel.add(scoreButton);

        scoreFields = new JTextField[13];
        for (int i = 0; i < scoreFields.length; i++) {
            JTextField field = new JTextField();
            field.setEditable(false);
            scoreFields[i] = field;
            panel.add(field);
        }

        scores = new int[13];
        dice = new int[DICE_COUNT];

        getContentPane().add(panel);
        setVisible(true);
    }

    private void updateDiceButtons() {
        for (int i = 0; i < DICE_COUNT; i++) {
            diceButtons[i].setText(String.valueOf(dice[i]));
        }
    }

    private void updateScoreFields() {
        for (int i = 0; i < scoreFields.length; i++) {
            scoreFields[i].setText(String.valueOf(scores[i]));
        }
    }

    private int calculateScore() {
        // Calculate the score for the current dice roll
        int score = 0;

        // Check for specific combinations
        // ...

        return score;
    }

    public static void main(String[] args) {
        new GUIYatzy();
    }
}
