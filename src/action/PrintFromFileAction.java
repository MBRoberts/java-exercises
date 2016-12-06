package action;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by M.Ben_Roberts on 12/5/16.
 */
public class PrintFromFileAction implements Action {
    private final Path filePath;

    public PrintFromFileAction(String folder, String filename) {
        this.filePath = Paths.get(folder, filename);
    }

    @Override
    public void execute() throws IOException {
        System.out.println("\n\u001B[33m----------------------------\u001B[0m");
        try (
            FileReader fileReader = new FileReader(filePath.toFile());
            BufferedReader input = new BufferedReader(fileReader)
        ) {
            String line = input.readLine();
            while (line != null) {
                System.out.println(line);
                line = input.readLine();
            }
            System.out.println("\u001B[33m----------------------------\u001B[0m\n");
        }
    }
}
