package se.lexicon;

import java.util.Scanner;

public class convertSecondsToHoursMinutesSeconds {
    static int days;
    static int hours;
    static int minutes;
    static int rest;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of seconds: ");
        double seconds = scanner.nextDouble();
        days = (int) (seconds / 86400);
        rest = (int) (seconds % 86400);
        hours = rest / 3600;
        rest = (int) (seconds % 3600);
        System.out.println(rest);
        minutes = rest / 60;
        rest = (int) (seconds % 60);

        System.out.print(seconds + " seconds is " + days + " days " + hours + " hour(s) " + minutes + " minute(s) " + rest + " second(s)");


    }
}
