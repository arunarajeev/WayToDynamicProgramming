package Simple;

import java.util.Arrays;

/**
 * Have the function NumberSearch(str) take the str parameter,
 * search for all the numbers in the string,
 * add them together, then return that final number.
 * For example: if str is "88Hello 3World!" the output should be 91.
 * You will have to differentiate between single digit
 * numbers and multiple digit numbers like in the example above.
 * So "55Hello" and "5Hello 5" should return two different answers.
 * Each string will contain at least one letter or symbol.
 */

public class CoderByte_NumberAddition_inStrings {
    public static void main(String[] args) {
        System.out.println(numberAddition("88Hello 3World! "));
    }

    private static int numberAddition(String str) {
        int sum = 0;
        String[] arr = str.replaceAll("[^0-9 ]", "").split("\\s+");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        return sum;
    }

}
