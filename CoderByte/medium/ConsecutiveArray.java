
/**
 * Have the function Consecutive(arr) take the array of integers stored in arr and return the minimum number of
 * integers needed to make the contents of arr consecutive from the lowest number to the highest number.
 * For example: If arr contains [4, 8, 6] then the output should be 2 because two numbers need to be added to the
 * array (5 and 7) to make it a consecutive array of numbers from 4 to 8.
 * Negative numbers may be entered as parameters and no array will have less than 2 elements.
 *
 * @author Nick Livens
 */

package medium;

import java.util.Arrays;

public class ConsecutiveArray {
    public static void main(String[] args) {
        int arr[] = { -1, 4, 6, 8 };
        System.out.println(consecutive(arr));
    }

    private static int consecutive(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = arr.length - 2; i >= 0; i--) {
            count += arr[i + 1] - arr[i]-1;
        }
        return count;
    }
}
