public class nestedClass {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        System.out.println(obj.getXValue());
    }
}

class Outer {
    int x;
    static int y;

    static class Inner { // this inner class can implement interface and exten class also

        int getXValue() {
            return y;
        }
    }
}