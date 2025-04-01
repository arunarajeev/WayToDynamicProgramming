package DSA;

import java.util.Scanner;

public class CollatzConjature3xPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int peak = n;
        int stepCount = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            stepCount++;
            peak = Math.max(peak, n);
        }
        System.out.println("N = " + n + "  Peak-> " + peak + "  Steps -> " + stepCount);
    }
}
