public class CharacterType {
    public static void main(String[] args) {
        System.out.printf("Characters are %d bits long\n  Range [%d, %d]\n", Character.SIZE, (int) Character.MIN_VALUE,
                (int) Character.MAX_VALUE);

        char a = 'H';
        char b = 'I';
        char c = '!';

        System.out.print("\n");

        System.out.printf("%c%c%c\n", a, b, c);
        System.out.printf("%d %d %d\n", (int) a, (int) b, (int) c);
    }
}
