
import java.io.IOException;
import java.util.Scanner;

public class QueueRunner {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        Scanner input = new Scanner(System.in);

        LOOP: while (true) {
            clearScreen();
            q.print();
            System.out.println("------------------------------");
            System.out.println("1) Enque");
            System.out.println("2) Deque");
            System.out.println("3) Debug");
            System.out.println("4) Quit");
            System.out.print("Your Choice: ");
            byte ch = input.nextByte();
            switch (ch) {
                case 1 -> {
                    System.out.print("Value to enque: ");
                    int key = input.nextInt();
                    boolean success = q.enque(key);
                    if (!success) {
                        waitEnter(input);
                    }
                }
                case 2 -> {
                    System.out.printf("Value dequed: %d\n", q.deque());
                    waitEnter(input);
                }
                case 3 -> {
                    clearScreen();
                    q.debug();
                    waitEnter(input);
                }
                case 4 -> {
                    break LOOP;
                }
                default -> {
                    System.out.println("Invalid Option");
                    waitEnter(input);
                }
            }
        }
    }

    // Utility Features
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

    public static void waitEnter(Scanner input) {
        if (input.hasNextLine()) {
            input.nextLine();
        }
        System.out.println("Press Enter to continue...");
        input.nextLine();
    }

}
