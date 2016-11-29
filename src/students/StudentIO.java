package students;

import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by M.Ben_Roberts on 11/28/16.
 */

class StudentIO {

    private static Scanner input = new Scanner(System.in);
    private static PrintStream output = System.out;
    private static int i = 0;

    static String studentNameInput(){

        Scanner input = new Scanner(System.in);

        try {

            String name = input.nextLine();

            if(name.isEmpty() || !name.matches("[a-zA-Z]+")){
                throw new InputMismatchException();
            }

            return name;

        } catch(InputMismatchException e) {

            output.println("Must be a valid name!");
            output.print("Please re-enter the student's name: ");

            return studentNameInput();
        }
    }

    static int studentScoreInput(){

        try {

            int score = input.nextInt();

            if(score < 0 || score > 100){
                throw new InputMismatchException();

            }

            return score;

        } catch(InputMismatchException e) {

            output.println("Must be a valid number! Try Again");
            output.print("Please re-enter student's score: ");
            input.nextLine();

            return studentScoreInput();
        }
    }

    static String anotherStudentInput(){

        try {

            String answer = input.next(("[yYnN]"));
            input.nextLine();

            if(answer.equalsIgnoreCase("N")){
                input.close();
            }

            return answer;

        } catch (InputMismatchException e){

            output.println("Please answer 'y' or 'n'!");
            output.print("Another students.Student(y/n): ");
            input.nextLine();

            return anotherStudentInput();
        }
    }

    static void studentOutput(){

        if(i < StudentRecordApp.students.size()) {

            output.print((i + 1) + ") " + StudentRecordApp.students.get(i).getFullName());
            output.println(" - " + StudentRecordApp.students.get(i).getScore());

            i++;
            studentOutput();

        }
    }
}
