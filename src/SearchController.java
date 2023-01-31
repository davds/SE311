import java.util.Scanner;

public class SearchController {
    private AbstractSearch search;

    public SearchController(AbstractSearch search) {
        this.search = search;
    }

    public void run() {
        System.out.println("\nWould you like to search the lines? (y/n)");

        Scanner kb = new Scanner(System.in);
        String yesNo = kb.nextLine();

        while (yesNo.equalsIgnoreCase("y")) {
            System.out.println("Enter search keyword:");
            String keyword = kb.nextLine();
            search.query(keyword);
            System.out.println("\nSearch again? (y/n)");
            yesNo = kb.nextLine();
        }
    }
}
