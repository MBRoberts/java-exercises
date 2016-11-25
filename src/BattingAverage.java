/**
 * Created by M.Ben_Roberts on 11/21/16.
 */

import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;

public class BattingAverage {

    private static Scanner scanner = new Scanner(System.in);

    private static DecimalFormat decFormat = new DecimalFormat("#.000");

    private static double getBattingAvg(int[] atBatArray) {

        int numberOfhits = 0;
        double battingAvg;

        for (int hitOrMiss : atBatArray) {

            if (hitOrMiss != 0) {
                numberOfhits++;
            }

        }

        try {

            battingAvg = (100 / (atBatArray.length / numberOfhits)) * .01;

        } catch (ArithmeticException e) {

            battingAvg = 0.000;

        }

        decFormat.format(battingAvg);

        return battingAvg;
    }

    private static double getSluggingAvg(int[] basesArray) {

        double sluggingAvg = 0;

        for (int numOfBases : basesArray) {

            sluggingAvg += numOfBases;

        }

        sluggingAvg /= basesArray.length;
        sluggingAvg = (100 / sluggingAvg) * .01;

        decFormat.format(sluggingAvg);

        return sluggingAvg;

    }

    public static void main(String[] args) {

        int atBatsEntered;
        String userInput;
        int[] enteredBasesArray;

        do {
            System.out.print("How many times at bat: ");
            atBatsEntered = scanner.nextInt();

            enteredBasesArray = new int[atBatsEntered];

            for (int i = 0; i < atBatsEntered; i++) {

                do {

                    System.out.print("How many bases earned on 'at bat' " + (i + 1) + ": ");
                    enteredBasesArray[i] = scanner.nextInt();

                    if (enteredBasesArray[i] < 0 || enteredBasesArray[i] > 4) {
                        System.out.println("Must be a number between 0 and 4. Please try again!");
                    }

                } while (enteredBasesArray[i] < 0 || enteredBasesArray[i] > 4);

            }

            System.out.print("Batting Avg: ");
            System.out.printf("%.3f", getBattingAvg(enteredBasesArray));
            System.out.println();

            System.out.print("Slugging Avg: ");
            System.out.printf("%.3f", getSluggingAvg(enteredBasesArray));
            System.out.println();

            System.out.print("Another Player: ");
            userInput = scanner.next();

        }while(userInput.equalsIgnoreCase("y"));

    }
}
