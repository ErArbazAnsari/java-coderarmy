
public class switchexp {
    public static void main(String[] args) {
        byte dayNumber = 3;
        switch (dayNumber) {
            case 0:
                System.err.println("sunday");
                break;
            case 1:
                System.err.println("monday");
                break;
            case 2:
                System.err.println("tuesday");
                break;
            case 3:
                System.err.println("wednesday");
                break;
            case 4:
                System.err.println("thursday");
                break;
            case 5:
                System.err.println("friday");
                break;
            case 6:
                System.err.println("saturday");
                break;
            default:
                System.err.println("invalid date!!!");
        }
    }
}
