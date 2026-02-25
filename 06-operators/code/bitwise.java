public class bitwise {
    public static void main(String[] args) {

        System.out.println("Bitwise Operators (&, |, ^, ~, >>, <<, >>>, &=, |=, ^=, >>=, <<=, >>>=)\n");

        int a = 10; // 1010 (binary)
        int b = 20; // 10100 (binary)

        System.err.println("a = " + a + " b = " + b + "\n");
        System.err.println("a = " + Integer.toBinaryString(a) + "\nb = " + Integer.toBinaryString(b) + "\n");

        // Basic Bitwise Operators
        System.out.println("a & b  = " + (a & b)); // AND
        System.out.println("a | b  = " + (a | b)); // OR
        System.out.println("a ^ b  = " + (a ^ b)); // XOR
        System.out.println("~a     = " + (~a)); // NOT => unary operator (apply on only one value)

        // Shift Operators
        System.out.println("a << 1 = " + (a << 1)); // Left Shift
        System.out.println("a >> 1 = " + (a >> 1)); // Right Shift
        System.out.println("a >>> 1 = " + (a >>> 1)); // Unsigned Right Shift

        // Assignment Bitwise Operators
        int x = 10;

        x &= 5;
        System.out.println("x &= 5  -> " + x);

        x |= 5;
        System.out.println("x |= 5  -> " + x);

        x ^= 5;
        System.out.println("x ^= 5  -> " + x);

        x <<= 1;
        System.out.println("x <<= 1 -> " + x);

        x >>= 1;
        System.out.println("x >>= 1 -> " + x);

        x >>>= 1;
        System.out.println("x >>>= 1 -> " + x);
    }
}