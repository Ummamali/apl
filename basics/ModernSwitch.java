import java.util.Scanner;

public class ModernSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Do you accept? ");
        String accept = input.nextLine();

        char a = accept.charAt(0);

        switch (a) {
            case 'y', 'Y' -> System.out.println("Accepted");
            default -> System.out.println("Not Accepted");
        }
    }
}
