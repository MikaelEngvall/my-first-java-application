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
        double prod = number1*number2;
        double quota = number1/number2;
        JOptionPane.showMessageDialog(null, "Product: " + prod + "\nDivision: " + quota + "\nSum: " + sum + "\nDifference: " + diff);
    }
}
