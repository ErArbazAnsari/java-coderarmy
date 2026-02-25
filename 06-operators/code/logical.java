public class logical {
    public static void main(String[] args) {

        System.out.println("Logical Operators (&&, ||, !)\n");

        boolean a = true;
        boolean b = false;

        // AND (&&)
        System.out.println("a && b = " + (a && b)); // false

        // OR (||)
        System.out.println("a || b = " + (a || b)); // true

        // NOT (!)
        System.out.println("!a = " + (!a)); // false
        System.out.println("!b = " + (!b)); // true

        System.out.println("\nShort-Circuit Behavior\n");

        int x = 10;

        // Short-circuit AND
        if (x > 5 && x++ > 10) {
            System.out.println("Inside AND block");
        }
        System.out.println("Value of x after && : " + x);

        // Reset x
        x = 10;

        // Short-circuit OR
        if (x > 5 || x++ > 10) {
            System.out.println("Inside OR block");
        }
        System.out.println("Value of x after || : " + x);
    }
}