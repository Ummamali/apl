public class MergeSort {
    public static void main(String[] args) {

        int[] test = { 18, 16, 14, 9, 22, 30, 6, 1, 4, 90 };

        Utils.printArray(test);
        sort(test, 0, test.length - 1);
        Utils.printArray(test);
    }

    public static void sort(int[] items, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            sort(items, p, q);
            sort(items, q + 1, r);
            merge(items, p, q, r);
        }
    }

    public static void merge(int[] items, int p, int q, int r) {
        // Calculating length of left sub-array and right sub-array
        int n1 = q - p + 1;
        int n2 = r - q;

        // allocate space for left and right sub array
        int[] left = new int[n1 + 1];
        int[] right = new int[n2 + 1];

        // Copy items from p to q into array left
        for (int i = 0; i < n1; i++) {
            left[i] = items[p + i];
        }

        // Copy items from q+1 to r into right array
        for (int j = 0; j < n2; j++) {
            right[j] = items[q + j + 1];
        }

        // place sentinal infinite value at the end
        left[n1] = Integer.MAX_VALUE;
        right[n2] = Integer.MAX_VALUE;

        // now we modify original items array from p to r
        int lTop = 0;
        int rTop = 0;

        for (int k = p; k <= r; k++) {
            // Placing smallest value in items[k]
            if (left[lTop] <= right[rTop]) {
                items[k] = left[lTop];
                lTop++;
            } else {
                items[k] = right[rTop];
                rTop++;
            }
        }

    }
}
