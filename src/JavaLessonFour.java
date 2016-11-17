/**
 * Created by M.Ben_Roberts on 11/17/16.
 */

import java.util.Scanner;

public class JavaLessonFour {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        String contYorN = "Y";

        int h = 1;

        while (contYorN.equalsIgnoreCase("y")) {

            System.out.println(h++);
            System.out.print("Continue y or n? ");
            contYorN = userInput.nextLine();

        }

        for(int l = 10; l >= 1; l--) {
            System.out.println(l);
        }
    }
}
