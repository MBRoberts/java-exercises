package java_tutorials; /**
 * Created by M.Ben_Roberts on 11/17/16.
 */

import java.util.Scanner;

public class JavaLessonFive
{

//    static double myPI = 3.14159; // Class Variable Example

    public static void main(String[] args)
    {
        int d = 5;
        tryToChange(d);
        System.out.println("main d = " + d);


//        System.out.println("1 + 2 = " + addThem(1,2));
    }

/*
public static int addThem(int a, int b)
{
       double smallPI = 3.14; // Local Variable Example
       double myPI = 3.1      // Can overwrite Class Variable by redefining with same name
       System.out.println("Global " + myPI);

return a + b;
}
*/

    public static void tryToChange(int d) // declaring a new version of d
    {
        d = d + 1;
        System.out.println("tryToChange d = " + d);
    }
}
