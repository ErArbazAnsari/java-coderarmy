
public class function_overloading {
    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void sum(String name) {
        System.out.println("hi, " + name);
    }

    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        System.out.println(sum(a, b));
        System.out.println(sum(a, b, c));
        sum("arbaz");
    }
}
