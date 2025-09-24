public class StringPools {
    public static void main(String[] args) {
        // if we use a literal, interning is done. Strings are stored as constants in
        // SCP (String Constant Pool)

        String a = "Hello World";

        System.out.printf("a = \"%s\" has hash %h\n", a, System.identityHashCode(a));

        // exactly same literal as a
        String b = "Hello World";

        System.out.printf("b = \"%s\" has hash %h\n", b, System.identityHashCode(b));

        // So a is b
        System.out.printf("a == b ----> %b\n", a == b);

        // so when we create an object using literal, a new object in heap will be
        // created
        String sObject = new String("Hello World");

        System.out.printf("sObject = \"%s\" has hash %h\n", sObject, System.identityHashCode(sObject));
        System.out.printf("a == sObject ----> %b\n", a == sObject);

    }
}
