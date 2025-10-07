import java.io.IOException;
import java.util.Scanner;

public class Utils {
    // This class contains utilities for doing useful stuff

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    // prints out array from [p...q]
    public static void printSubArray(int[] arr, int p, int q) {
        System.out.print("{");

        for (int i = p; i < q + 1; i++) {
            System.out.print(arr[i]);

            if (i < q) {
                System.out.print(", ");
            }
        }

        System.out.print("}\n");
    }

    public static void printArray(int[] arr) {
        System.out.print("{");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.print("}\n");
    }

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
