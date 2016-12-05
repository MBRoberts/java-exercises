package countries;

/**
 * Created by M.Ben_Roberts on 12/5/16.
 */

import console.Console;
import console.Menu;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class CountriesApp {

    private static Console console = new Console(new Scanner(System.in), new PrintStream(System.out));

    public static void main(String[] args) {
        Menu menu = new Menu(console);
        menu.addOption("Display Countries", new DisplayAction("resources", "countries.txt"));
        menu.addOption("Enter new Country", new EnterAction("resources", "countries.txt"));
        menu.setExitMessage("\nGoodBye");
        try {
            menu.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
