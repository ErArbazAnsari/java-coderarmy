package code;
public class pasisingRef {
    public static void main(String[] args) {
        Random r1 = new Random(4, 5);
        System.out.println(r1.x);
        System.out.println(r1.y);
        updateValue(r1);
        System.out.println(r1.x);
        System.out.println(r1.y);
    }

    static void updateValue(Random r) {
        r.x = r.x + 10;
        r.y = r.y + 10;
    }
}

class Random {
    int x;
    int y;

    Random(int x, int y) {
        this.x = x;
        this.y = y;
    }
}