import java.util.ArrayList;
import java.util.Scanner;

public class MasterController {
    public static void main(String[] args) {
        System.out.println("David Stone\nSE-311\nHW1\n----------");

        OptionReader.readOptions();
        boolean header = OptionReader.getBoolean("Header");
        boolean footer = OptionReader.getBoolean("Footer");

        Input input = selectInputType();
        Output output = selectOutputType();

        KWIC kwci = new KWIC(input, output);
        ArrayList<String> kwciOutput = kwci.getKWIC();

        AbstractSearch search = new Search(kwciOutput);
        if (header || footer) {
            search = new Header(search);
            if (footer)
                search = new Footer(search);
            if (header && footer)
                search = new HeaderFooter(search);
        }

        SearchController s = new SearchController(search);
        s.run();

        System.out.println("~ Goodbye!");
    }

    private static Input selectInputType() {
        System.out.println("Select Input Type (enter 1 or 2):");
        System.out.println("1. Console Input");
        System.out.println("2. File Input");

        Scanner kb = new Scanner(System.in);
        String selection = kb.nextLine();
        //kb.close();

        if (selection.equals("1")) {
            return new ConsoleInput();
        } else if (selection.equals("2")) {
            return new FileInput();
        } else {
            System.out.println("Invalid Selection...");
            return selectInputType();
        }
    }

    private static Output selectOutputType() {
        System.out.println("Select Output Type (enter 1 or 2):");
        System.out.println("1. Console Output");
        System.out.println("2. File Output");

        Scanner kb = new Scanner(System.in);
        String selection = kb.nextLine();
        //kb.close();

        if (selection.equals("1")) {
            return new ConsoleOutput();
        } else if (selection.equals("2")) {
            return new FileOutput();
        } else {
            System.out.println("Invalid Selection...");
            return selectOutputType();
        }
    }
}