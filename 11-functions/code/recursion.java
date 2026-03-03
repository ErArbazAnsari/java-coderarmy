public class recursion {
    static int findFibo(int num) {
        if (num <= 1) {
            return num;
        }
        return findFibo(num - 1) + findFibo(num - 2);
    }

    public static void main(String[] args) {
        System.out.println(findFibo(5));
    }
}
