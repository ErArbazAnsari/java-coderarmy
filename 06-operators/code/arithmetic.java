class arithmetic {
    public static void main(String[] args) {

        System.out.println("Arithmetic Operators\n");

        int a = 5;
        int b = 10;

        int c = a + b; // 15
        int d = a - b; // -5
        int e = a * b; // 50
        int f = a / b; // 0 (integer division)
        int g = a % b; // 5

        System.out.println("Addition: " + c);
        System.out.println("Subtraction: " + d);
        System.out.println("Multiplication: " + e);
        System.out.println("Division: " + f);
        System.out.println("Modulus: " + g);

        // Assignment Operators
        a += b; // a = 15
        System.out.println("a += b: " + a);

        a -= b; // a = 5
        System.out.println("a -= b: " + a);

        a *= b; // a = 50
        System.out.println("a *= b: " + a);

        a /= b; // a = 5
        System.out.println("a /= b: " + a);

        a %= b; // a = 5
        System.out.println("a %= b: " + a);

        // Increment & Decrement
        a++; // 6
        System.out.println("a++: " + a);

        a--; // 5
        System.out.println("a--: " + a);
    }
}