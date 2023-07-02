package se.lexicon;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(500) + 1;

        Scanner scanner = new Scanner(System.in);
        int guessCount = 0;
        int userGuess;

        do {
            System.out.print("Guess the number (between 1 and 500): ");
            userGuess = scanner.nextInt();
            guessCount++;

            if (userGuess < targetNumber) {
                System.out.println("Your guess was too small.");
            } else if (userGuess > targetNumber) {
                System.out.println("Your guess was too big.");
            }
        } while (userGuess != targetNumber);

        System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
        System.out.println("Number of guesses: " + guessCount);

        scanner.close();
    }
}
