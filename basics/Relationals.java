public class Relationals {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.printf("a = %d b = %d\n", a, b);

        System.out.printf("  Equality: %b\n", a == b);
        System.out.printf("  Inequality: %b\n", a != b);

        System.out.printf("  Less Than: %b\n", a < b);
        System.out.printf("  Less Than or Equal: %b\n", a <= b);

        System.out.printf("  Greater Than: %b\n", a > b);
        System.out.printf("  Greater Than or Equal: %b\n", a >= b);
    }
}
