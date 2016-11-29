package students; /**
 * Created by M.Ben_Roberts on 11/28/16.
 */

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.*;

class StudentRecordApp {

    private static PrintStream output = System.out;

    static ArrayList<Student> students = new ArrayList<>();

    static void main(String[] args) {

        String anotherStudent;
        String firstName;
        String lastName;
        Student student;
        int score;

        do{
            output.print("Please enter student's first name: ");
            firstName = StudentIO.studentNameInput();

            output.print("Please enter student's last name: ");
            lastName = StudentIO.studentNameInput();

            output.print("Please enter student's score: ");
            score = StudentIO.studentScoreInput();

            student = new Student(firstName, lastName, score);

            students.add(student);

            output.print("Another students.Student(y/n): ");
            anotherStudent = StudentIO.anotherStudentInput();

            output.println();

        }while (anotherStudent.equalsIgnoreCase("y"));

        Collections.sort(students);

            StudentIO.studentOutput();

    }
}