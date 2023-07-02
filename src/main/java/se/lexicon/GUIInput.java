package se.lexicon;
import javax.swing.*;
/**
 * Just testing the Graphical user interface
 */
public class GUIInput {
    public static void main(String[] args) {
        double number1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number:"));
        double number2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number:"));
        double diff = number1-number2;
        double sum = number1+number2;
        JOptionPane.showMessageDialog(null, "Product: " + number1*number2 + "\nDivision: " + number1/number2 + "\nSum: " + sum + "\nDifference: " + diff);
    }
}
