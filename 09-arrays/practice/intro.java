public class intro {
    public static void main(String[] args) {
        int[] rollnumbers = new int[5]; // int rollnumbers[] = new int[5] => both are supported
        rollnumbers[0] = 100;
        rollnumbers[1] = 150;
        rollnumbers[2] = 200;
        rollnumbers[3] = 300;
        rollnumbers[4] = 400;

        // printing all values
        for (int i = 0; i < rollnumbers.length; i++) {
            System.err.print(rollnumbers[i] + " ");
        }
    }
}