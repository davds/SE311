import java.util.ArrayList;

public abstract class Input {
    protected ArrayList<String> inputData = new ArrayList<String>();

    public abstract void readInput();
    public ArrayList<String> getLines() {
        return this.inputData;
    }

    public void addLine(String line) {
        inputData.add(filter(line));
    }

    public String filter(String line) {
        return line.replaceAll("[,.?!]", "");
    }
}
