public class EmptyFor {
    public static void main(String[] args) {
        /*
         * 
         * This is valid java syntax, there is no initialization statement, no iteration
         * conclusion statement. The loop condition is always true
         */
        for (;;)
            System.out.println("Hello");
    }
}
