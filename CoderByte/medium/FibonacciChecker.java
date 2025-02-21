package medium;

public class FibonacciChecker {
    public static void main(String[] args) {
        System.out.println(fibonacciChecker(55));
        printFibonacciSeries(20);
    }

    private static void printFibonacciSeries(int n) {
        int first = 0;
        int second = 1;
        int i = 0;
        System.out.print(first + "  " + second + "  ");
        while (i < n-1) {
            int temp = first + second;
            first = second;
            second = temp;
            i++;
            System.out.print(temp + "  ");
        }
    }

    private static boolean fibonacciChecker(int n) {
        int first = 0;
        int second = 1;
        while (second < n) {
            int temp = first + second;
            first = second;
            second = temp;
        }

        return second == n ? true : false;
    }
}
