package action;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import console.Console;

/**
 * Created by M.Ben_Roberts on 12/5/16.
 */
public class RemoveLineFromFileAction implements Action {

    private final Path folderPath;
    private final Path filePath;
    private final String prompt;


    public RemoveLineFromFileAction(String folder, String filename, String prompt) {

        this.folderPath = Paths.get(folder);
        this.filePath = Paths.get(folder, filename);
        this.prompt = prompt;

    }

    @Override
    public void execute() throws IOException {
        if (Files.exists(folderPath)) {
            if (Files.exists(filePath)) {
                try (
                        FileReader fileReader = new FileReader(filePath.toFile());
                        BufferedReader input = new BufferedReader(fileReader)
                ) {
                    String line = input.readLine();
                    List<String> fileData = new ArrayList<>();
                    while(line != null) {
                        fileData.add(line.trim());
                        line = input.readLine();
                    }

                    Console console = new Console(new Scanner(System.in), new PrintStream(System.out));
                    int lineToRemove = console.chooseFromList(prompt, fileData);

                    fileData.remove(lineToRemove);

                    try (

                        FileWriter fileWriter = new FileWriter(filePath.toFile());
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        PrintWriter output = new PrintWriter(bufferedWriter)

                    ) {

                        fileData.forEach(output::println);


                    }
                }
            }
        }
    }
}
