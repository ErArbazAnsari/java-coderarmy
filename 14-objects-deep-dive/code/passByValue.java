package code;
class passByValue {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        updateValue(a, b); // pass by value
        System.out.println(a);
        System.out.println(b);
    }

    static void updateValue(int a, int b) {
        a++;
        b++;
    }
}