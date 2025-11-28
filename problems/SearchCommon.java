
public class SearchCommon {

    public static void main(String[] args) {
        int[] testNumbers = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int[] indices = firstCommon(testNumbers);

        System.out.printf("First common found at index %d and %d\n", indices[0], indices[1]);
    }

    public static int[] firstCommon(int[] numbers) {
        // scans the array and returns an array of two integers containing indices for
        // first common numbers

        // record keeps initial items of numbers that don't have a pair yet
        int[] record = new int[numbers.length];
        int recordLength = 0;

        // iterating through each item of the array
        for (int i = 0; i < numbers.length; i++) {
            int key = numbers[i];
            // checking if key has a common number in record
            for (int j = 0; j < recordLength; j++) {
                if (record[j] == key) {
                    // we found a pair, returning it
                    return new int[] { j, i };
                }
            }
            // after looping through the record and not finding any common, append key to
            // record
            record[recordLength] = key;
            recordLength += 1;
        }

        // looped the whole array and not found any result
        return new int[] { -1, -1 };
    }
}
