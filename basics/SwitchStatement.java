import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        // switch statement to run for a special case

        Scanner input = new Scanner(System.in);

        System.out.print("Code: ");
        int userCode = input.nextInt();

        switch (userCode) {
            case 1998:
                System.out.println("Accepted: 1998 you are at 0x7765");
                break;
            case 2009:
                System.out.println("Hello user 2009");
                break;
            default:
                System.out.println("Invalid Code");
        }
    }
}
