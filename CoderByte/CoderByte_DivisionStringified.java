
/**
 * Have the function DivisionStringified(num1,num2) take both parameters being
 * passed,
 * divide num1 by num2, and return
 * the result as a string with properly formatted commas.
 * If an answer is only 3 digits long,
 * return the number with no commas (ie. 2 / 3 should output "1").
 * For example: if num1 is 123456789 and
 * num2 is 10000 the output should be "12,345".
 */

public class CoderByte_DivisionStringified {

    public static void main(String[] args) {
        int num1 = 1944367676;
        int num2 = 3;
        System.out.println(divisionStringified(num1,num2));
    }

    private static String divisionStringified(int num1, int num2){

            return addCommas(num1/num2);
    }
    private static String addCommas(int num) {
        String str = "";
        int counter = 0;
        while (num > 0) {
            if (counter == 3) {
                str = "," + str;
                counter = 0;
            }
            str = String.valueOf(num % 10) + str;
            num/=10;
            counter++;
        }
        return str;
    }
}
