package se.lexicon;

import java.util.Scanner;

public class SumProdDivDiff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        scanner.close();

        double sum = num1 + num2;
        double division = num1 / num2;
        double product = num1 * num2;
        double difference = num1 - num2;

        System.out.println("Sum: " + sum);
        System.out.println("Division: " + division);
        System.out.println("Product: " + product);
        System.out.println("Difference: " + difference);
    }
}