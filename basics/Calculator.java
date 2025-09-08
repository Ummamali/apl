
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            printMenu();
            int choice = input.nextInt();

            if (choice >= 1 && choice <= 5) {
                if (choice == 5)
                    break;

                System.out.print("x: ");
                int x = input.nextInt();

                System.out.print("y: ");
                int y = input.nextInt();

                if (choice == 1) {
                    System.out.printf("%d + %d = %d\n", x, y, add(x, y));
                } else if (choice == 2) {
                    System.out.printf("%d - %d = %d\n", x, y, subtract(x, y));
                } else if (choice == 3) {
                    System.out.printf("%d x %d = %d\n", x, y, multiply(x, y));
                } else if (choice == 4) {
                    System.out.printf("%d / %d = %f\n", x, y, divide(x, y));
                }

            } else {
                System.out.println("Invalid option Provided");
            }
        }
    }

    public static void printMenu() {
        System.out.println("---------------------------");
        System.out.println("Select from given options");
        System.out.println("1 >>> Addition");
        System.out.println("2 >>> Subtraction");
        System.out.println("3 >>> Multiplication");
        System.out.println("4 >>> Division");
        System.out.println("5 >>> Exit");
        System.out.print(":");

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }
}
