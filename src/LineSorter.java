import java.util.ArrayList;
import java.util.Collections;

public class LineSorter {
    private ArrayList<String> lines = new ArrayList<String>();

    public LineSorter(ArrayList<String> lines) {
        this.lines = lines;
    }

    public void sort() {
        Collections.sort(lines, String.CASE_INSENSITIVE_ORDER);
    }

    public ArrayList<String> getLines() {
        return lines;
    }

}
