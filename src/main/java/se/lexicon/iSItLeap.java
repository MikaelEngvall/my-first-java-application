package se.lexicon;
import java.util.Scanner;
public class iSItLeap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        scanner.close();

        if (leapOrNot(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static boolean leapOrNot(int year) {
        //First check if Year is divisible by 4
        if (year % 4 == 0) { // If true, check if it is a century
            if (year % 100 == 0) { // If it is a century it checks if it is divisible by 400
                if (year % 400 == 0)
                    return true; //Year is divisible by 4, 100 and 400 then it is true (a leap year)
                else
                    return false; //Year is divisible by 4 and 100 but not by 400 then it is false (not a leap year)
            } else //Not a century and divisible by 4 then it is true (a leap year)
                return true;
        }
        else // Not divisible by 4, don't even bother go further. It isn't a leap year. It returns false.
            return false;
    }
}
