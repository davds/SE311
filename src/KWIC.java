import java.util.ArrayList;
import java.util.Scanner;

public class KWIC {
    private LineStorage storage;
    private LineShifter shifter;
    private LineSorter sorter;
    public KWIC(Input input, Output output) {
        input.readInput();

        storage = new LineStorage(input);

        shifter = new LineShifter(storage);
        shifter.performCircularShift();

        sorter = new LineSorter(shifter.getShifts());
        sorter.sort();
        ArrayList<String> sorted = sorter.getLines();

        output.setOutputData(sorted);
        output.writeOutput();
    }

    public ArrayList<String> getKWIC() {
        return sorter.getLines();
    }


}
