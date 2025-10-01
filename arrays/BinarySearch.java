public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 7, 8, 10, 19, 55 };

        int key = 100;
        int result = search(nums, key, 0, nums.length - 1);

        System.out.printf("%d found at index %d\n", key, result);

    }

    // searches key from sorted sub-array [p ... q]
    public static int search(int[] items, int key, int p, int q) {
        // Code below is only for debugging
        System.out.printf("Searching %d in space ", key);
        Utils.printSubArray(items, p, q);

        // real algorithm starts from here
        if (p > q) {
            // its an empty search space
            return -1;
        }

        int mid = (p + q) / 2;

        if (key > items[mid]) {
            return search(items, key, mid + 1, q);
        } else if (key < items[mid]) {
            return search(items, key, p, mid - 1);
        } else {
            return mid;
        }
    }
}
