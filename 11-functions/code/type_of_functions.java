public class type_of_functions {
    // no input, no output
    static void sayHello() {
        System.out.println("hi everyone!");
    }

    // take input, no output
    static void hiMe(String name) {
        System.out.println("hi, " + name + "!");
    }

    // noinput, give output
    static int returnMe() {
        return 10;
    }

    // input, output
    static String bestFunction(String username) {
        System.out.print("say, hi-> " + username + " ==> ");
        return "hi returned";
    }

    public static void main(String[] args) {
        sayHello();
        hiMe("Arbaz");
        System.out.println(returnMe());
        System.out.println(bestFunction("vivek"));
    }
}