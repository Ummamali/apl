public class Increment {
    public static void main(String[] args) {
        int a = 10;

        // can be incremented using ++ operator

        System.out.printf("Before Increment: %d\n", a);

        a++;

        System.out.printf("After Increment: %d\n", a);

        // We can also use it as an expression
        int b = 100;

        System.out.printf("Current b = %d\n", b++); // postfix increment
        System.out.printf("Current b = %d\n", b);

        int c = 1000;

        System.out.printf("Current c = %d\n", ++c); // Prefix Increment
        System.out.printf("Current c = %d\n", c); // Prefix Increment

        // Similar for decrement operator --
    }
}
