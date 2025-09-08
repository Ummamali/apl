public class Lossy {
    public static void main(String[] args) {
        // Decimal literals are treated as doubles

        // float pi = 3.1415; (Compile Error)

        float pi = 3.1415f;

        System.out.printf("(float) pi = %.4f\n", pi);

        // or use a double type

        double e = 2.718282;

        System.out.printf("(double) e = %f\n", e);
    }
}
