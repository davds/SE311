import java.util.ArrayList;

public abstract class Output {
    protected ArrayList<String> outputData;

    public abstract void writeOutput();

    public void setOutputData(ArrayList<String> lines) {
        this.outputData = lines;
    }
}
