public class SelectionSort {
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
        // our array is [0...n-1]
        for (int i = 0; i < keys.length; i++) {
            // selecting the minimum item for index i, this selection is done in array
            // [i....n-1]
            int min = -1;
            for (int j = i; j < keys.length; j++) {
                if (min == -1 || keys[j] < keys[min]) {
                    min = j;
                }
            }
            // now smallest value in [i...n-1] is now at index min
            // swapping values at index i and min
            int temp = keys[i];
            keys[i] = keys[min];
            keys[min] = temp;
        }
    }
}
