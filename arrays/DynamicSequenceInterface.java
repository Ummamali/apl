
import java.io.IOException;
import java.util.Scanner;

public class DynamicSequenceInterface {
    public static void main(String[] args) {

        DynamicSequence sq = new DynamicSequence(10);

        Scanner input = new Scanner(System.in);

        while (true) {
            clearScreen();
            sq.print();
            System.out.println("1 -> Debug");
            System.out.println("2 -> Insert");
            System.out.println("3 -> Deletion");
            System.out.println("4 -> Quit");
            int d = input.nextInt();

            if (d == 1) {
                clearScreen();
                sq.print();
                sq.debugPrint();
                askEnter(input);
            } else if (d == 2) {
                // Insertion
                System.out.print("Index to insert: ");
                int idx = input.nextInt();

                if (idx <= sq.getCount() && idx > -1) {
                    System.out.print("Number: ");
                    int number = input.nextInt();

                    sq.insertAt(number, idx);
                } else {
                    System.out.printf("Can only insert in range [0, %d]\n", sq.getCount());
                    askEnter(input);
                }
            } else if (d == 3) {
                // deleting element
                System.out.print("Index: ");
                int idx = input.nextInt();

                if (idx > -1 && idx < sq.getCount()) {
                    sq.deleteAt(idx);
                } else {
                    System.out.printf("Can only delete in range [0, %d)\n", sq.getCount());
                    askEnter(input);
                }
            } else if (d == 4) {
                break;
            }
        }
    }

    // Primary operations offered by dynamic sequence

    // Interface
    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void askEnter(Scanner input) {
        if (input.hasNextLine()) {
            input.nextLine();
        }
        System.out.println("Press Enter to continue...");
        input.nextLine();
    }
}
