public class Arguments {
    public static void main(String[] args) {
        System.out.printf("You provided %d command-line arguments\n", args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.printf("  %d ---> %s\n", i, args[i]);
        }
    }
}
