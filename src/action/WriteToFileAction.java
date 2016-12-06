package action;

import console.Console;
import validation.Validator;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Scanner;

/**
 * Created by M.Ben_Roberts on 12/5/16.
 */
public class WriteToFileAction implements Action {
    private final Path folderPath;
    private final Path filePath;
    private final boolean append;
    private final String prompt;
    private final Validator validator;

    public WriteToFileAction(String folder, String filename, boolean append, String prompt, Validator validator) {
        this.folderPath = Paths.get(folder);
        this.filePath = Paths.get(folder, filename);
        this.append = append;
        this.prompt = prompt;
        this.validator = validator;
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
            FileWriter fileWriter = new FileWriter(filePath.toFile(), append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter output = new PrintWriter(bufferedWriter);
        ) {
            Console console = new Console(new Scanner(System.in), new PrintStream(System.out));
            String input = console.promptForText(prompt, validator);

            output.println(input);

        }
    }
}
