
import java.util.Scanner;

public class Deletion {
    public static void main(String[] args) {

        int[] nums = new int[5];
        // the number of elements in the array 0 means no elements
        int count = 0;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1 -> Display");
            System.out.println("2 -> Insert");
            System.out.println("3 -> Deletion");
            System.out.println("4 -> Quit");
            int d = input.nextInt();

            if (d == 1) {
                printArray(nums);
            } else if (d == 2) {
                // Insertion
                if (count < nums.length) {
                    System.out.print("Index: ");
                    int idx = input.nextInt();

                    if (idx <= count && idx > -1) {
                        System.out.print("Number: ");
                        int number = input.nextInt();

                        // Shifting
                        for (int i = count - 1; i >= idx; i--) {
                            nums[i + 1] = nums[i];
                        }

                        nums[idx] = number;
                        count++;
                    } else {
                        System.out.printf("Can only insert in range [0, %d]\n", count);
                    }

                } else {
                    System.out.println("Array is full");
                }
            } else if (d == 3) {
                // deleting element
                System.out.print("Index: ");
                int idx = input.nextInt();

                if (idx > -1 && idx < count - 1) {
                    for (int i = idx; i < count; i++) {
                        nums[i] = nums[i + 1];
                    }

                    count--;
                    nums[count] = 0;
                } else {
                    System.out.printf("Can only delete in range [0, %d)\n", count);
                }
            } else if (d == 4) {
                break;
            }
        }
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
}
