public class Overflow {
    public static void main(String[] args) {
        byte num = 127;

        System.out.printf("num: %d\n", num);

        // incrementing

        num += 1;

        System.out.printf("num + 1: %d\n", num);

        byte negativeNumber = -128;

        System.out.printf("negativeNumber: %d\n", negativeNumber);

        negativeNumber -= 1;

        System.out.printf("negativeNumber - 1: %d\n", negativeNumber);
    }
}
 