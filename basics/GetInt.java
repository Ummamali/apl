
import java.util.Scanner;

public class GetInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min = 1;
        int max = 100;

        int number;

        do {
            System.out.printf("Enter a number in range %d to %d\n:", min, max);
            number = input.nextInt();
        } while (number < min || number > max);

        System.out.printf("You provided %d\n", number);
    }

}
