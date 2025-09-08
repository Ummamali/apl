public class IntegerTypes {
    public static void main(String[] args) {

        System.out.printf("Byte is %d bits. \n  Range [%d, %d]\n", Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Short is %d bits\n  Range [%d, %d]\n", Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Integer is %d bits\n  Range [%d, %d]\n", Integer.SIZE, Integer.MIN_VALUE,
                Integer.MAX_VALUE);
        System.out.printf("Long is %d bits\n  Range [%d, %d]\n", Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);

    }
}