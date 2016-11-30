package students;

import validation.Validation;
import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.*;
import static students.StudentRecordApp.*;

/**
 * Created by M.Ben_Roberts on 11/28/16.
 */

class StudentIO {

    private static Scanner input = new Scanner(in);
    private static int i = 0;

    static String studentNameInput(Validation validation){

        try {

            String name = input.nextLine();

            if(!validation.isValid(name)) throw new InputMismatchException();

            return name;

        } catch(InputMismatchException e) {

            out.println(validation.errorMessage());
            out.print("Please re-enter the student's name: ");

            return studentNameInput(validation);
        }
    }

    static int studentScoreInput(Validation validation){

        try {

            int score = input.nextInt();

            if(!validation.isValid(score)) throw new InputMismatchException();

            return score;

        } catch(InputMismatchException e) {

            out.println(validation.errorMessage());
            out.print("Please re-enter student's score: ");
            input.nextLine();

            return studentScoreInput(validation);
        }
    }

    static String anotherStudentInput(Validation validation){

        try {

            String answer = input.next(("[yYnN]"));
            input.nextLine();

            if(!validation.isValid(answer)) throw new InputMismatchException();

            if(answer.equalsIgnoreCase("N")) input.close();

            return answer;

        } catch (InputMismatchException e){

            out.println("Please answer 'y' or 'n'!");
            out.println();
            out.print("Another students.Student(y/n): ");
            input.nextLine();

            return anotherStudentInput(validation);
        }
    }

    static void studentOutput(){

        if(i < students.size()) {

            out.print((i + 1) + ") " + students.get(i).getFullName());
            out.println(" - " + students.get(i).getScore());

            i++;
            studentOutput();
        }
    }
}
