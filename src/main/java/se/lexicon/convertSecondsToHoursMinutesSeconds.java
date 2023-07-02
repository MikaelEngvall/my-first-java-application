package se.lexicon;
import java.util.Scanner;
public class convertSecondsToHoursMinutesSeconds {
    static int hours;  /* Why does it have to be static?? */
    static int minutes; /* Why static?? */
    static int secondsLeft; /* Why static?? */
    static int rest; /* Why static?? */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of seconds: ");
        double seconds = scanner.nextDouble();

        hours = (int) (seconds/3600);
        secondsLeft = (int) (seconds - (hours*3600)); /* Seconds left after have counted the hours */
        minutes = secondsLeft/60;
        rest = secondsLeft - (minutes*60); /* The remaining seconds after have counted the minutes */

        System.out.print(seconds + " seconds is " + hours + " hour(s) " + minutes + " minute(s) " + rest + " second(s)");


    }
}
