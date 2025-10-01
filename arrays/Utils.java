import java.io.IOException;
import java.util.Scanner;

public class Utils {
    // This class contains utilities for doing useful stuff

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
