package NeetCodeJava;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        int count = fact(n-2) / fact(n - 4) * fact(2);
        return count;
    }

    private static int fact(int n) {
        if (n == 1||n==0)
            return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }
}
