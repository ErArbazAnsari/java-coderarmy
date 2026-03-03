
public class chaining {
    static void fun1() {
        fun2();
        System.out.println("fun1 done");
    }

    static void fun2() {
        fun3();
        System.out.println("fun2 done");
    }

    static void fun3() {
        System.out.println("fun3 done");
    }

    public static void main(String[] args) {
        fun1();
    }
}
