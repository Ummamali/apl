import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a: ");
        int a = input.nextInt();

        System.out.print("b: ");
        int b = input.nextInt();

        if (a < b) {
            System.out.printf("a (%d) is less than b (%d)\n", a, b);
        } else if (a > b) {
            System.out.printf("a (%d) is greater than b (%d)\n", a, b);
        } else {
            System.out.printf("a (%d) and b (%d) are equal\n", a, b);
        }

    }
}
