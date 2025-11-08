public class MaximumSubarrayDNC {
    public static void main(String[] args) {
        int[] numbers = { 13, -3, -25, 20, -3, -16, -32, 18, 20, -7, 12, -5, -22, 15,
                -4, 7 };

        int[] result = findMaximumSubarray(numbers, 0, numbers.length - 1);

        System.out.print("Input Array: ");
        Utils.printSubArray(numbers, 0, numbers.length - 1);
        System.out.print("Maximum Subarray: ");
        Utils.printSubArray(numbers, result[0], result[1]);
        System.out.printf("Maximum Sum: %d\n", result[2]);
    }

    public static int[] findMaximumSubarray(int[] array, int low, int high) {
        if (low == high) {
            // base case, there is only one element and is maximum subarray
            int[] result = { low, high, array[low] };
            return result;
        } else {
            // recursive case
            // Divide step below in one line
            int mid = Math.floorDiv(low + high, 2);
            // finding the maximum subarray in left division, Conquer Step
            int[] leftResult = findMaximumSubarray(array, low, mid);
            // finding maximum subarray in right division, Conquer Step
            int[] rightResult = findMaximumSubarray(array, mid + 1, high);
            // finding the maximum crossing subarray, Combine step from here till the end
            int[] crossingResult = findMaxCrossingSubarray(array, low, mid, high);

            // result array contain three elements
            // [0] is start of subarray
            // [1] is end of subarray
            // [2] is net sum of subarray
            if (leftResult[2] >= rightResult[2] && leftResult[2] >= crossingResult[2]) {
                // we have maximum array in leftResult
                return leftResult;
            } else if (rightResult[2] >= leftResult[2] && rightResult[2] >= crossingResult[2]) {
                // we have maximum subarray in right result
                return rightResult;
            } else {
                // we have maximum subarray in crossing result
                return crossingResult;
            }
        }
    }

    public static int[] findMaxCrossingSubarray(int[] array, int low, int mid, int high) {
        // now we find the maximum left crossing subarray
        // maxLeft represents index such that array[maxLeft...mid] has maximum sum
        int maxLeft = -1;
        int maxLeftSum = 0;
        // current sum of array[i...mid]
        int sum = 0;
        // i -> mid downto low
        for (int i = mid; i >= low; i--) {
            // now current sum is of array[i...mid]
            sum += array[i];
            if (maxLeft == -1 || sum > maxLeftSum) {
                // we have found a new left sum
                maxLeftSum = sum;
                maxLeft = i;
            }
        }

        // now we do the same for maximum right crossing subarray
        // maxRight is index such that array[mid+1....maxRight] gives maximumRightSum
        int maxRight = -1;
        int maxRightSum = 0;
        // resetting sum
        sum = 0;
        // j -> mid+1 to high
        for (int j = mid + 1; j <= high; j++) {
            sum += array[j];
            if (maxRight == -1 || sum > maxRightSum) {
                maxRightSum = sum;
                maxRight = j;
            }
        }

        int[] result = { maxLeft, maxRight, maxLeftSum + maxRightSum };
        return result;
    }
}
