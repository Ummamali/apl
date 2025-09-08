public class Tables {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (int a = 0; a < args.length; a++) {
                int num = Integer.parseInt(args[a]);

                System.out.printf("Multiplication Table for %d\n", num);
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("  %d x %d = %d\n", num, i, num * i);
                }
            }

        } else {
            System.out.println("Requires at least one argument");
        }
    }
}
