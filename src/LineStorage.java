import java.util.ArrayList;

public class LineStorage {
    private Input input;
    private ArrayList<String> lines;

    public LineStorage(Input input) {
        this.input = input;
        this.lines = input.getLines();
    }

    public ArrayList<String> getLines() {
        return this.lines;
    }

    public void setLines(ArrayList<String> lines) {
        this.lines = lines;
    }

}
