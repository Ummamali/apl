public class StringType {
    public static void main(String[] args) {
        // Using literals
        String message = "hello world";
        System.out.println(message);

        // Using class constructor
        String userName = new String("johndow");
        System.out.println(userName);

        // Concatenation
        String a = "Hello";
        String b = "World";

        String c = a + " " + b;

        System.out.println(c);

        // Getting length
        String s = "java";

        System.out.printf("%s is %d characters long\n", s, s.length());

        // access character in a string
        System.out.printf("First charater of %s is %c\n", s, s.charAt(0));

        // access substrings

        String name = "John Smith";
        String firstName = name.substring(0, 4);

        System.out.printf("%s first name is %s\n", name, firstName);

        // compare strings
        String x = "one";
        String y = "one";
        String z = "two";

        System.out.printf("x == y ---> %b\n", x.equals(y));
        System.out.printf("x == z ---> %b\n", x.equals(z));

        // check if string contains a substring
        String msg = "Apple Computers";
        System.out.printf("msg contains Computer ---> %b\n", msg.contains("Computer"));

        // Uppercase all charaters

        System.out.printf("toUpperCase: %s ----> %s\n", msg, msg.toUpperCase());
    }
}
