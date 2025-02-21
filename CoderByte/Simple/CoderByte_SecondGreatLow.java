package Simple;

import java.util.Arrays;

/**
 * Have the function SecondGreatLow(arr) take the array of
 * numbers stored in arr and return the second lowest and
 * second greatest numbers, respectively, separated by a space.
 * For example: if arr contains [7, 7, 12, 98, 106] the output should be 12 98.
 * The array will not be empty and will contain at least 2 numbers.
 * It can get tricky if there's just two numbers!
 */

public class CoderByte_SecondGreatLow {
    public static void main(String[] args) {
        int[] arr = { 7, 7, 12, 98, 106};
        Arrays.sort(arr);
        System.out.println(secondGreatLow(arr));
    }

    private static String secondGreatLow(int[] arr) {
        int lowest = arr[0];
        boolean secondLowest = false;
        boolean secondHighest = false;
        int highest = arr[arr.length - 1];
        int second_lowest = Integer.MAX_VALUE;
        int second_highest = Integer.MIN_VALUE;
        int i = 0;

        while ( i < arr.length && (secondLowest == false || secondHighest == false)) {
            if (arr[i] > lowest && secondLowest == false) {
                second_lowest = arr[i];
                secondLowest = true;
            }
            if (arr[arr.length - i-1] < highest && secondHighest == false) {
                second_highest = arr[arr.length - i-1];
                secondHighest = true;
            }
            i++;
        }

        return second_lowest + " " + second_highest;
    }
}
