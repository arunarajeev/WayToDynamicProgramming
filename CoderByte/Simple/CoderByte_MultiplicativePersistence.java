package Simple;
/**
 * Have the function MultiplicativePersistence(num) take the num parameter
 * being passed which will always be a
 * positive integer and return its multiplicative persistence
 * which is the number of times you must multiply the digits
 * in num until you reach a single digit.
 * For example: if num is 39 then your program should
 * return 3 because 3 * 9 = 27 then 2 * 7 = 14 and finally 1 * 4 = 4 and you
 * stop at 4.
 */

public class CoderByte_MultiplicativePersistence {

    public static void main(String[] args) {
        System.out.println(multiplicativePersistence(29));
    }

    private static int multiplicativePersistence(int n) {
        if (n < 10) {
            return 0;
        }
        int mulp = 0;
        int product = 1;
        while (n > 9) {
            while (n > 0) {
                product = product * (n % 10);
                n = n / 10;
            }
            mulp++;
            System.out.println(product);
            n = product;
            product = 1;
        }
        return mulp;
    }

}
