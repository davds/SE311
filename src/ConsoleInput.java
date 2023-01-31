import java.util.Scanner;

public class ConsoleInput extends Input {

    @Override
    public void readInput() {
        int numLines;
        System.out.println("How many lines would you like to read?");

        try {
            Scanner kb = new Scanner(System.in);
            numLines = kb.nextInt();

            kb.nextLine(); // move scanner to next line before getting console input

            for (int i = 1; i <= numLines; i++) {
                System.out.println("Enter line #" + i + ":");
                String nextLine = kb.nextLine();
                this.addLine(nextLine);
            }
            //kb.close();
        } catch (Exception ex) {
            System.out.println("An error occurred while trying to read input from the ConsoleInput class." + ex);
        }
    }
}
