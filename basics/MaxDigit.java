import java.util.Scanner;

public class MaxDigit {
    // gets an integer from user and prints the maximum digit with its place
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("number: ");
        int number = input.nextInt();

        if (number < 1) {
            System.out.println("Numbers less than 1 are not allowed");
            input.close();
            return;
        }

        /*
         * digits seen keeps track of how many digits have been seen so far.
         * When the loop finishes, we can know the total number of digits. We can
         * also know the placement of maximum digit through digitsSeen and maxIdx
         */

        // -1 means there is no max digit, any first digit observed will become maxDigit
        int maxDigit = -1, maxIdx = -1, digitsSeen = 0;

        int x = number; // copy of original number

        // loops as long as a single digit is present
        while (x >= 1) {
            int u = x % 10; // units place

            if (u > maxDigit) {
                // we have found a new maximum digit
                maxDigit = u;
                maxIdx = digitsSeen; // index of a digit is actually the number of digits at its right
            }
            digitsSeen++; // a new digit has been seen, digitsSeen increments
            x /= 10; // dropping units place to get next integer
        }

        // digitsSeen - maxIdx is the location of maximum digit (like if there are 4
        // digits and maxIdx is 0, then 4 - 0 = 4th is the location of maximum digit)
        System.out.printf("%d is maximum digit at location %d\n", maxDigit, digitsSeen - maxIdx);

        input.close();
    }
}
