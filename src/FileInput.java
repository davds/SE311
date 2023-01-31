import java.io.File;
import java.util.Scanner;

public class FileInput extends Input {

    @Override
    public void readInput() {
        String fileName;

        try {
            Scanner kb = new Scanner(System.in);
            System.out.println("Please enter the input file name:");
            fileName = kb.nextLine();
            //kb.close();

            File inputFile = new File(fileName);
            Scanner fileReader = new Scanner(inputFile);
            while (fileReader.hasNext()) {
                String nextLine = fileReader.nextLine();
                addLine(nextLine);
            }
            fileReader.close();

        } catch (Exception ex) {
            System.out.println("An error occurred while trying to read input from the FileInput class." + ex);
        }
    }
}
