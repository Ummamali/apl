public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = { 9, 10, 8, 54, 4, 65 };

        int key = 100;
        int result = search(nums, key);

        if (result != -1) {
            System.out.printf("%d found at index %d\n", key, result);
        } else {
            System.out.println("Not Found");
        }
    }

    public static int search(int[] items, int key) {
        // returns the first occurence index of item
        for (int i = 0; i < items.length; i++) {
            if (items[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
