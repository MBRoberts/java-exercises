package circle;

/**
 * Created by M.Ben_Roberts on 11/30/16.
 */


import validation.NumberIsPositive;
import console.Console;

public class CircleApp {

    public static void main(String[] args) {
        int radius;

        radius = Console.getInputNumber("Please Enter a radius: ", new NumberIsPositive());

        Circle circle = new Circle(radius);

        System.out.println("The circumference is: " + circle.getCircum());
        System.out.println("The area is: " + circle.getArea());
    }
}
