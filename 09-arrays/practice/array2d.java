public class array2d {
    public static void main(String[] args) {
        int[][] rollnumbers = new int[3][3];
        rollnumbers[0][0] = 50;
        rollnumbers[0][1] = 80;
        rollnumbers[0][2] = 90;

        rollnumbers[1][0] = 60;
        rollnumbers[1][1] = 90;
        rollnumbers[1][2] = 75;

        rollnumbers[2][0] = 50;
        rollnumbers[2][1] = 80;
        rollnumbers[2][2] = 99;

        // printing all values
        for (int i = 0; i < rollnumbers.length; i++) {
            for (int j = 0; j < rollnumbers[i].length; j++) {
                System.err.print(rollnumbers[i][j] + " ");
            }
            System.err.println("");
        }
    }
}