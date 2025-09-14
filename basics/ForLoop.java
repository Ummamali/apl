public class ForLoop {
    public static void main(String[] args) {
        int i = 0;
        // You can place any valid java statement in for loop initialization section, it
        // runs only once as loop starts
        // Similarly, loop iteration conclusion statement is also executed AFTER every
        // loop iteration
        for (System.out.println("Loop Initialization"), System.out
                .println("Another statement in loop initialization"); i < 5; System.out
                        .printf(
                                "Loop Iteration Conclusion i = %d\n",
                                i)) {
            // Loop iteration concludes and i is already incremented because increment is in
            // body of the loop
            i++;
        }
    }
}
