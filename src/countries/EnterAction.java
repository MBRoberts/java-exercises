package countries;

import console.Action;
import console.Console;
import validation.NonEmptyString;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Scanner;

/**
 * Created by M.Ben_Roberts on 12/5/16.
 */
public class EnterAction implements Action {
    private final Path folderPath;
    private final Path filePath;

    public EnterAction(String folder, String filename) {
        this.folderPath = Paths.get(folder);
        this.filePath = Paths.get(folder, filename);
    }

    @Override
    public void execute() throws IOException {
        if (Files.notExists(folderPath)) {
            Files.createDirectory(folderPath);
        }
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        }

        try (
                FileWriter fileWriter = new FileWriter(filePath.toFile(), true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                PrintWriter output = new PrintWriter(bufferedWriter);
        ) {
            Console console = new Console(new Scanner(System.in), new PrintStream(System.out));
            String input = console.promptForText("Enter Country: ", new NonEmptyString());

            output.println(input);

        }
    }
}
