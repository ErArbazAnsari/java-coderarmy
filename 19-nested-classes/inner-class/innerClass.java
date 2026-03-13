
public class innerClass {
    public static void main(String[] args) {
        // Outer.Inner inner = new Outer.Inner(); // we can't do this because Inner
        // class i not a static class

        // how we can do this
        Outer outer = new Outer();
        // Outer.Inner inner = outer.new Inner(); // using this way we can create Inner
        // class object
        // or
        Outer.Inner inner = new Outer().new Inner();
        inner.print();
    }
}

class Outer {
    int x = 10;

    class Inner {
        int x = 20;

        void print() {
            System.out.println(this.x);
            System.out.println(Outer.this.x);
        }
    }
}