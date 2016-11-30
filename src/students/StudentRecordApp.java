package students; /**
 * Created by M.Ben_Roberts on 11/28/16.
 */

import validation.NonEmptyString;
import validation.NumberInRange;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.*;

class StudentRecordApp {

    private static PrintStream output = System.out;

    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        String anotherStudent;
        String firstName;
        String lastName;
        Student student;
        int score;

        do{
            output.print("Please enter student's first name: ");
            firstName = StudentIO.studentNameInput(new NonEmptyString());

            output.print("Please enter student's last name: ");
            lastName = StudentIO.studentNameInput(new NonEmptyString());

            output.print("Please enter student's score: ");
            score = StudentIO.studentScoreInput(new NumberInRange(0, 100));

            student = new Student(firstName, lastName, score);

            students.add(student);

            output.println();
            output.print("Another student(y/n): ");
            anotherStudent = StudentIO.anotherStudentInput(new NonEmptyString());

            output.println();

        }while (anotherStudent.equalsIgnoreCase("y"));

        Collections.sort(students);

            StudentIO.studentOutput();

    }
}