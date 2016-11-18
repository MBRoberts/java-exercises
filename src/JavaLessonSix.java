/******************************************
*  Created by M.Ben_Roberts on 11/17/16.  *
*  Java tutorials - Catching Exceptions   *
*******************************************/

//import java.util.*;
import java.io.*; // reading and writing to files (input/Output)

public class JavaLessonSix {

//    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
//        getAFile("./somestuff.txt");
//*******************************************************************
//        System.out.print("How old are you? ");
//        int age = checkValidAge();
//
//        if (age != 0) {
//            System.out.println("You are " + age + " years old");
//        }
//*******************************************************************
//        divideByZero(2); // ArithmeticException Example
    }

/******************
 *  Catch Order   *
 ******************/

/*
    public static void getAFile(String fileName)
    {
        try {
            FileInputStream file = new FileInputStream(fileName);
        }

        catch (ClassNotFoundException e) {}  //  If you want to ignore an error do nothing with it

        catch (FileNotFoundException e) {  // First catch will catch a specific exception
            System.out.println("Sorry can't find that file");
        }

        catch (IOException e) {  //  Second catch will catch a less exact exception
            System.out.println("Unknown IO Error");
        }

        catch (Exception e) {  // Last will catch all exceptions
            System.out.println("Some error occurred");
        }

        finally {  // Finally will execute no matter what (used for cleanup duty ie close any connections to DB or any open files)
            System.out.println("");
        }

        catch (ClassNotFoundException | IOException e) {}  // In Java SE 7 + you can use | to combine exception catches

    }
*/

/*************************
 *   Thrown Exceptions   *
 *************************/
/*
    public static void getAfile(String fileName) throws IOException, FileNotFoundException{ // Throws exception back to where the function is called

        FileInputStream file = new FileInputStream(fileName);   //  Wrap function call with try/catch

    }

*/

/**************************
 *  User Input Exception  *
 **************************/

/*
    public static int checkValidAge()
    {
        try {

            return userInput.nextInt();

        }

        catch (InputMismatchException e) {

            userInput.next();
            System.out.print("That isn't a whole number");
            return 0;
        }
    }
*/

/**************************
 *   Exception Messages   *
 **************************/
/*
    public static void divideByZero(int a)
    {
        try {
            System.out.println(a / 0);

        }

        catch (ArithmeticException e) {

            System.out.println("You can't do that");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
*/
}
