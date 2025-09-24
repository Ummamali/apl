import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Number: ");

            nums[i] = input.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.printf("nums[%d] = %d\n", i, nums[i]);
        }

        System.out.print("Reversed: ");
        for (int i = nums.length - 1; i > -1; i--) {
            System.out.printf("nums[%d] = %d  ", i, nums[i]);
        }
    }
}
