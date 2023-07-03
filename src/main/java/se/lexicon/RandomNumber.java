package se.lexicon;

import java.lang.Math;

import static java.lang.Math.round;

public class RandomNumber {
    public static void main(String args[]) {
        int max = 5;
        int min = 1;
    // Generating random numbers
        System.out.println("1st Random Number: " + round(Math.random()* (max - min + 1) + min));
        System.out.println("2nd Random Number: " + round(Math.random()* (max - min + 1) + min));
        System.out.println("3rd Random Number: " + round(Math.random()* (max - min + 1) + min));
        System.out.println("4th Random Number: " + round(Math.random()* (max - min + 1) + min));
        System.out.println("5th Random Number: " + round(Math.random()* (max - min + 1) + min));
    }
}