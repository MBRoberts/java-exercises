import java.util.Scanner;

public class JavaLessonTwo
{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Your favorite number: ");

        if(userInput.hasNextInt()){

            int numberEntered = userInput.nextInt();
            System.out.println("You entered: " + numberEntered);

            int numberEnteredTimes2 = numberEntered + numberEntered;
            System.out.println(numberEntered + " + " + numberEntered + " = " + numberEnteredTimes2);

            int numberEnteredMinus2 = numberEntered - 2;
            System.out.println(numberEntered + " - 2 = " + numberEnteredMinus2);

            int numberEnteredTimesSelf = numberEntered * numberEntered;
            System.out.println(numberEntered + " * " + numberEntered + " = " + numberEnteredTimesSelf);

            int numberEnteredDivided2 = numberEntered / 2;
            System.out.println(numberEntered + " / 2 = " + numberEnteredDivided2);

            // Math Methods
            int numberABS = Math.abs(numberEntered);// Absolute Value of Number Entered
            int whichIsBigger = Math.max(5, 7);     // returns larger #
            int whichIsSmaller = Math.min(5,7);     // returns smaller #
            double numSqrt = Math.sqrt(5.23);       // Square root
            int numCeiling = (int) Math.ceil(5.23); // Rounds Up
            int numFloor = (int) Math.floor(5.23);  // Rounds Down
            int numRound = (int) Math.round(5.23);  // Rounds Up and Down according to decimal
            int randomNumber = (int) Math.random(); // Returns a random number between .0 - .9

        } else {

            System.out.println("Next Time enter a number!!");

        }
    }
}