public class Indexing {
    public static void main(String[] args) {

        // you can access any item of array in constant time
        int[] nums = { 1, 2, 3, 4, 5, 6 };

        System.out.printf("nums has %d items\n", nums.length);

        // indexing using [] notation
        System.out.printf("third element is %d\n", nums[2]);

        // accessing index out of range (No compilation error)
        // System.out.printf("100th element is %d\n", nums[99]);

        // modifying array elements
        nums[3] = 40000;

        System.out.printf("fourth element is %d\n", nums[3]);

        // here we are passing reference of array to the static method
        doubleElement(nums, 3);

        System.out.printf("fourth element is %d\n", nums[3]);

        int[] marks = { 20, 50, 100 };

        System.out.print("marks before: ");
        printArray(marks);

        // now we are performing an in-place modification
        // it doesn't create a new array, rather modifies the original one
        // This is also known as mapping a function onto an array
        // But this is in-place mapping as original gets mutated
        doubleEvery(marks);

        System.out.print("marks after: ");
        printArray(marks);
    }

    // following method mutates the original array (like a side-effect)
    public static void doubleElement(int[] arr, int index) {
        arr[index] *= 2;
    }

    // similar to doubleElement but doubles every element of the array
    public static void doubleEvery(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
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
