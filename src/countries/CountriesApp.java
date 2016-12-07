package countries;

import action.PrintFromFileAction;
import action.RemoveLineFromFileAction;
import action.WriteToFileAction;
import console.Console;
import console.Menu;
import validation.NonEmptyString;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class CountriesApp {

    private static Console console = new Console(new Scanner(System.in), new PrintStream(System.out));

    public static void main(String[] args) {
        Menu menu = new Menu(console, "\t\tCountries");
        System.out.println();
        menu.addOption("Display Countries", new PrintFromFileAction("resources", "countries.txt"));
        menu.addOption("Enter new Country", new WriteToFileAction("resources", "countries.txt", true, "Enter Country: ", new NonEmptyString()));
        menu.addOption("Delete Country", new RemoveLineFromFileAction("resources", "countries.txt", "\nWhich country to remove: "));
        menu.setExitMessage("\nGoodBye");
        try {
            menu.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
