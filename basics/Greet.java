
import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");

        String name = input.nextLine();

        System.out.printf("Hello, %s\n", name);
    }
}
