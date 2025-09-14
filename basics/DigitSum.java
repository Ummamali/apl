
import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("number: ");
        int number = input.nextInt();

        System.out.printf("Sum of digits of %d is %d\n", number, addDigits(number));

        input.close();
    }

    // Given an integer the method returns the sum of digits
    public static int addDigits(int number) {
        int sum = 0;

        int x = number;

        while (x >= 1) {
            sum += x % 10; // taking the units place and adding it to the sum
            x /= 10; // performing integral division on original number to discard the previously
                     // added digit at units place
        }

        return sum;
    }
}
