public class Promotion {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;

        // Small types like byte short and char are automatically promoted to ints
        // during arithmatic

        // byte c = a + b; (Compilation Error)

        int c = a + b;

        System.out.println(c);

        // Similarly, operations promote to wider type (int + double = double)

    }
}
