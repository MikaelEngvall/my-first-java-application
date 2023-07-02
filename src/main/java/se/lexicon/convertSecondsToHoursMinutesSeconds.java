package se.lexicon;
import java.util.Scanner;
public class convertSecondsToHoursMinutesSeconds {
    static int hours;  //Why static??
    static int minutes; // Why static??
    static int secondsLeft; // Why static??
    static int rest; // Why static??
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of seconds: ");
        double seconds = scanner.nextDouble();

        hours = (int) (seconds/3600);
        secondsLeft = (int) (seconds - (hours*3600));
        minutes = secondsLeft/60;
        rest = secondsLeft - (minutes*60);

        System.out.print(seconds + " seconds is " + hours + " hour(s) " + minutes + " minute(s) " + rest + " second(s)");


    }
}
