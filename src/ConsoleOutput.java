public class ConsoleOutput extends Output {

    @Override
    public void writeOutput() {
        for (String line : outputData) {
            System.out.println(line);
        }
    }
}
