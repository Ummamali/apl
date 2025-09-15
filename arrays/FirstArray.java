public class FirstArray {
    public static void main(String[] args) {
        // There are static arrays in Java
        /*
         * array declaration below, telling compiler that nums is an array of integers.
         * nums is actually a reference which points to an array but declaration does
         * not creates the actual array.
         * You must use null to initialize array reference to tell that there is no
         * array yet. Or you have to give an array like {1, 2, 3}
         * (Java does not alllow acces to uninitialized local variables, so you must
         * initialize them before accessing )
         */
        int[] nums; // only declaration, no initialization

        nums = null; // initializing to null to state there is no array yet

        /*
         * the nums (reference) is in stack but JVM has allocated 5 integer places in
         * the HEAP (Important!)
         */
        nums = new int[5]; // creating an array of 5 contiguous int places and storing reference to nums

        System.out.println(nums); // printing out the type [I for int array and identity hash code

        System.out.printf("Array has %d elements\n", nums.length); // getting length, unlike C, java stores the length
        // as an attribute

        System.out.printf("First Item is %d\n", nums[1]); // Indexing. every element is initialized to 0

        // printing the array
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
