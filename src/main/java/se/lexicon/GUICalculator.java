package se.lexicon;

import javax.swing.*;
import java.awt.*;

public class GUICalculator {

    private static String number1 = "";
    private static String number2 = "";
    private static String operator = "";
    private static JTextField displayField;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        displayField = new JTextField();
        displayField.setSize(frame.getWidth(), 100);
        displayField.setFont(new Font("Arial", Font.PLAIN, 20));
        frame.add(displayField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 5)); // 4x5 grid layout

        String[] buttonLabels = {
                "7", "8", "9", "*", "/",
                "4", "5", "6", "+", "-",
                "1", "2", "3", "", "",
                "C", "0", ".", "=", "Q"
        };

        for (String label : buttonLabels) {
            final JButton button = getjButton(label);

            panel.add(button);
        }

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static JButton getjButton(String label) {
        JButton button = new JButton(label);
        button.addActionListener(e -> {
            String command = e.getActionCommand();

            if (command.equals("C")) {
                number1 = "";
                number2 = "";
                operator = "";
                displayField.setText("");
            } else if (command.matches("[0-9.]")) {
                if (operator.isEmpty()) {
                    number1 += command;
                } else {
                    number2 += command;
                }
                displayField.setText(displayField.getText() + command);
            } else if (command.matches("[+\\-*/]")) {
                if (!number1.isEmpty() && !number2.isEmpty()) {
                    calculateResult();
                }
                operator = command;
                displayField.setText(displayField.getText() + operator);
            } else if (command.equals("=")) {
                calculateResult();
            } else if (command.equals("Q")) {
                System.exit(0);
            }
        });
        return button;
    }

    private static void calculateResult() {
        if (number1.isEmpty() || number2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter two numbers.");
            return;
        }

        double number1Double = Double.parseDouble(number1);
        double number2Double = Double.parseDouble(number2);

        double result = 0;
        switch (operator) {
            case "+":
                result = number1Double + number2Double;
                break;
            case "-":
                result = number1Double - number2Double;
                break;
            case "*":
                result = number1Double * number2Double;
                break;
            case "/":
                if (number2Double == 0) {
                    JOptionPane.showMessageDialog(null, "Cannot divide by zero.");
                    return;
                }
                result = number1Double / number2Double;
                break;
        }

        displayField.setText(displayField.getText() + " = " + result);

        number1 = Double.toString(result); // Store the result as number1 for further calculations
        number2 = "";
        operator = "";
    }
}
