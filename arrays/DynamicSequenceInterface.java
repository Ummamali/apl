
import java.util.Scanner;

public class DynamicSequenceInterface {
    public static void main(String[] args) {

        DynamicSequence sq = new DynamicSequence(10);

        Scanner input = new Scanner(System.in);

        loop: while (true) {
            Utils.clearScreen();
            sq.print();
            System.out.println("1 -> Debug");
            System.out.println("2 -> Insert");
            System.out.println("3 -> Deletion");
            System.out.println("4 -> Quit");
            int d = input.nextInt();
            switch (d) {
                case 1 -> {
                    Utils.clearScreen();
                    sq.print();
                    sq.debugPrint();
                    Utils.waitEnter(input);
                }
                case 2 -> {
                    // Insertion
                    System.out.print("Index to insert: ");
                    int idx = input.nextInt();
                    if (idx <= sq.getCount() && idx > -1) {
                        System.out.print("Number: ");
                        int number = input.nextInt();

                        sq.insertAt(number, idx);
                    } else {
                        System.out.printf("Can only insert in range [0, %d]\n", sq.getCount());
                        Utils.waitEnter(input);
                    }
                }
                case 3 -> {
                    // deleting element
                    System.out.print("Index: ");
                    int idx = input.nextInt();
                    if (idx > -1 && idx < sq.getCount()) {
                        sq.deleteAt(idx);
                    } else {
                        System.out.printf("Can only delete in range [0, %d)\n", sq.getCount());
                        Utils.waitEnter(input);
                    }
                }
                case 4 -> {
                    break loop;
                }
                default -> {
                    System.out.println("Invalid Option!");
                    Utils.waitEnter(input);
                }
            }
        }
    }

}
