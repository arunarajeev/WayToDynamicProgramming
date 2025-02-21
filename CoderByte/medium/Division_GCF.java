
package medium;

public class Division_GCF {
    public static void main(String[] args) {
        System.out.println(gcf(1050, 3070));
        System.out.println(gcf_usingEuclidean(1050, 3070));
        

    }

    public static int gcf_usingEuclidean(int a, int b) {
        // Use the Euclidean algorithm
        while (b != 0) {
            int remainder = a % b;  // Get the remainder
            a = b;                  // Update 'a' to 'b'
            b = remainder;          // Update 'b' to the remainder
        }
        return a;  // 'a' will be the GCF when 'b' becomes 0
    }

    private static int gcf(int n1, int n2) {
        if (n1 == n2)
            return n1;
        if (n1 % n2 == 0)
            return n2;
        if (n2 % n1 == 0)
            return n1;
        if (n1 <= 0 || n2 <= 0)
            return -1;
        int divisor = Math.min(n1, n2) / 2;
        while (divisor >= 1) {
            if (n1 % divisor == 0 && n2 % divisor == 0) {
                return divisor;
            }
            divisor--;
        }
        return divisor;
    }
}
