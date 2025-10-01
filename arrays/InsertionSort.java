public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 1, 10, 8, 99, 16 };

        Utils.printArray(nums);

        sort(nums);

        Utils.printArray(nums);

    }

    public static void sort(int[] items) {
        // itarations: [1, 2, 3 ...... n-1]
        for (int i = 1; i < items.length; i++) {
            int key = items[i];

            /*
             * We will keep iterating (stepping back) until either we reach a smaller (or
             * equal) number or we reach the end (index 0)
             * In worst case j iterates [i-1, i-2, i-3 ....... 1, 0] (reaching end)
             * Before any iteration of while loop, void is at index j + 1
             */
            int j = i - 1;

            while (j > -1 && items[j] > key) {
                // shifting element at j to right
                items[j + 1] = items[j];
                j--;
            }

            // Filling the void
            items[j + 1] = key;
        }
    }
}
