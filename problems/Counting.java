import java.util.HashMap;

public class Counting {

    public static void main(String[] args) {
        // test numbers array
        int[] numbers = { 18, 1, 2, 3, 7, 2, 1, 5, 7, 18 };

        // calling the function to count
        HashMap<Integer, Integer> counts = countOccurences(numbers);

        // printing the occurence of each element
        for (int key : counts.keySet()) {
            System.out.printf("%d --> %d\n", key, counts.get(key));
        }
    }

    public static HashMap<Integer, Integer> countOccurences(int[] numbers) {
        // creating a new hashmap that count occurence of each integer
        HashMap<Integer, Integer> counter = new HashMap<>();

        for (int num : numbers) {
            // if num is already in counter, increment it by 1, otherwise set it to 1
            counter.put(num, counter.containsKey(num) ? counter.get(num) + 1 : 1);
        }

        return counter;
    }
}