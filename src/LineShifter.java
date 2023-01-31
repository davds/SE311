import java.util.ArrayList;
import java.util.Arrays;

public class LineShifter {
    private LineStorage storage;
    private ArrayList<String> shifts = new ArrayList<String>();

    public LineShifter(LineStorage storage) {
        this.storage = storage;
    }

    public void addShift(String line) {
        shifts.add(line);
    }

    public ArrayList<String> getShifts() {
        return shifts;
    }

    public void performCircularShift() {
        for (String line : storage.getLines()) {

            line = line.trim();
            String[] arrayWords = line.split(" ");
            ArrayList<String> words = new ArrayList<>(Arrays.asList(arrayWords));

            for (int wordIndex = 0; wordIndex < words.size(); wordIndex++) {
                String shift = "";
                words.add(words.get(0));
                words.remove(0);

                for (int i = 0; i < words.size(); i++)
                    shift += words.get(i) + " ";

                addShift(shift);
            }
        }
    }
}
