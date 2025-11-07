public class MaximumSubarray {
    public static void main(String[] args) {
        int[] numbers = { 13, -3, -25, 20, -3, -16, -32, 18, 20, -7, 12, -5, -22, 15,
                -4, 7 };

        int[] result = getMaximumSubarray(numbers);

        System.out.print("Input Array: ");
        Utils.printSubArray(numbers, 0, numbers.length - 1);
        System.out.print("Maximum Subarray: ");
        Utils.printSubArray(numbers, result[0], result[1]);
        System.out.printf("Maximum Sum: %d\n", result[2]);

    }

    public static int[] getMaximumSubarray(int[] array) {
        // Brute force approach to finding the maximum subarray
        // array must contain at least 2 elements!
        int maxStart = -1;
        int maxEnd = -1;
        int maxSum = 0;

        for (int i = 0; i < array.length; i++) {
            // following two line for understanding working of algorithm
            System.out.printf("Checking sub sequences of ");
            Utils.printSubArray(array, i, array.length - 1);
            int sum = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int newSum = sum + array[j];
                // following 3 lines for understanding working of algorithm
                System.out.print("  ");
                System.out.printf("(%d) ", newSum);
                Utils.printSubArray(array, i, j);
                if (maxStart == -1 || maxSum < newSum) {
                    System.out.println("  Above Subsequence selected as new maximum");
                    maxStart = i;
                    maxEnd = j;
                    maxSum = newSum;
                }
                sum = newSum;
            }
            System.out.println();
        }

        int[] result = new int[3];
        result[0] = maxStart;
        result[1] = maxEnd;
        result[2] = maxSum;

        return result;
    }
}