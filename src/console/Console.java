package console;

import validation.Validation;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by M.Ben_Roberts on 11/30/16.
 */
public class Console {

    private PrintStream output = System.out;
    private Scanner input;

    public Console() {
        this.input = new Scanner(System.in);
    }

    public int getInputNumber(String message, Validation validation){
        int userInput;

        try {
            output.print(message);
            userInput = input.nextInt();

            if (!validation.isValid(userInput)) throw new InputMismatchException();

            return userInput;

        } catch (InputMismatchException e){

            input.nextLine();
            output.println("\n" + validation.errorMessage() + "\n");
            return getInputNumber(message, validation);
        }
    }

    public String getInputString(String message, Validation validation){
        String userInput;

        try {
            output.print(message);
            userInput = input.nextLine();

            if (!validation.isValid(userInput)) throw new InputMismatchException();

            return userInput;

        } catch (InputMismatchException e){

            output.println("\n" + validation.errorMessage() + "\n");

            return getInputString(message, validation);
        }
    }


}
