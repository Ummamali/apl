public class Initializing {
    public static void main(String[] args) {
        int[] nums = new int[20];

        nums[0] = 3;
        nums[1] = 7;
        nums[2] = 9;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 0;

        printArray(nums);

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
