import java.util.ArrayList;

public abstract class AbstractSearch {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    protected ArrayList<String> records;
    protected ArrayList<String> results;
    protected int numResults = 0;

    public abstract void query(String keyword);

    protected void search(String keyword) {
        results = new ArrayList<String>();
        numResults = 0;
        for (String line : records) {
            if (line.contains(keyword)) results.add(line.replace(keyword, ANSI_RED + keyword + ANSI_RESET));
        }

        if (results.isEmpty()) results.add("[" + keyword + "] not found.");
        else numResults = results.size();
    }

    public void displayResults() {
        for (String result : results) {
            System.out.println(result);
        }
    }

    public int getNumResults() {
        return numResults;
    }

    public int getRecords() {
        return records.size();
    }
}
