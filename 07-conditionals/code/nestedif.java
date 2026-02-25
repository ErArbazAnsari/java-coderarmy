
public class nestedif {
    public static void main(String[] args) {
        int temp = 60;
        if (temp > 25 && temp < 60) {
            if (temp > 50) {
                System.err.println("this is hell 😭");
            }
            System.err.println("high temperature");
        } else if (temp < 0) { // if-else-if lader
            System.err.println("temperature is extremely low");
        } else {
            System.err.println("normal temperature");
        }
    }
}
