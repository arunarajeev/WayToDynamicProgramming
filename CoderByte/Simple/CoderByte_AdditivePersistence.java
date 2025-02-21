package Simple;
import java.util.Scanner;

/**
 * Have the function AdditivePersistence(num) take the num parameter being
 * passed which will always be a
 * positive integer and return its additive persistence which is the number of
 * times you must add the digits in num
 * until you reach a single digit. For example: if num is 2718 then your program
 * should return 2
 * because 2 + 7 + 1 + 8 = 18 and 1 + 8 = 9 and you stop at 9.
 */

public class CoderByte_AdditivePersistence {
    public static int additivePersistence(int num) {
        if (num >= 0 && num < 10)
            return 1;
        int count = 0;
        while (num > 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            count++;
            num = sum;
        }
        return count;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(additivePersistence(s.nextInt()));
    }
}
