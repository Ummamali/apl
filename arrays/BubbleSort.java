public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = { 7, 2, 5, 4, 1, 6, 0, 3 };

        printArray(numbers);

        sort(numbers);

        printArray(numbers);
    }

    public static void printArray(int[] array) {
        System.out.print("{");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("}\n");
    }

    public static void sort(int[] keys) {
        // our array is [0....n-1]
        // k iterates [n-1, n-2, n-3....3, 2, 1]
        for (int k = keys.length - 1; k > 0; k--) {
            // we make comparisons from l -> [0...k-1]
            for (int l = 0; l < k; l++) {
                // if keys[l] and keys[l+1] are not in order, swap them
                if (keys[l] > keys[l + 1]) {
                    int temp = keys[l];
                    keys[l] = keys[l + 1];
                    keys[l + 1] = temp;
                }
            }
        }

    }
}
