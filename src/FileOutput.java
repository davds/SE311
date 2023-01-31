import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileOutput extends Output {

    @Override
    public void writeOutput() {
        String fileName;
        System.out.println("Please enter the output file name:");

        try {
            Scanner kb = new Scanner(System.in);
            fileName = kb.nextLine();
            //kb.close();

            FileWriter outputFile = new FileWriter(fileName);
            for (String line : outputData) {
                outputFile.write(line);
            }
            outputFile.close();

        } catch (Exception ex) {
            System.out.println("An error occurred while trying to write output from the FileOutput class." + ex);
        }
    }
}
