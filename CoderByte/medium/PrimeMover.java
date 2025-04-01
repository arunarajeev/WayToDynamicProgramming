/**
 * Have the function PrimeMover(num) return the numth prime number. The range will be from 1 to 10^4.
 * For example: if num is 16 the output should be 53 as 53 is the 16th prime number.
 *
 * @author Nick Livens
 */
package medium;

public class PrimeMover {
    public static void main(String[] args) {
        System.out.println(printPrimes(100));
    }

    private static int printPrimes(int n) {
        int counter = 1;
        int i = 2;
        while (counter < n) {
            if (isPrime(++i)) {
                counter++;
            }
        }
        return i;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
