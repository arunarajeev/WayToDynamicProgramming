
import java.util.Arrays;

/*  * Have the function ArrayAdditionI(arr) take the array of numbers 
stored in arr and return the string true if any
 * combination of numbers in the array can be added up to equal
 *  the largest number in the array, otherwise return the
 * string false. For example: if arr contains [4, 6, 23, 10, 1, 3] 
 * the output should return true because
 * 4 + 6 + 10 + 3 = 23. The array will not be empty, will not contain all the same elements,
 * and may contain negative numbers. */

public class CoderByte_ArrayAdditionOne {
    public static void main(String[] args) {
        int[] arr1 = { 9, 2, 4, 6, 8 };
        int[] arr2 = { 2, 6, 18, -1, 0, 54 };
        int[] arr3 = { 2, 4, 99, -8, 32 };
        int[] arr4 = { 9, -1, 2, 4 };
        System.out.println(arrayAddOne(arr1));
        System.out.println(arrayAddOne(arr2));
        System.out.println(arrayAddOne(arr3));
        System.out.println(arrayAddOne(arr4));
    }

    private static boolean arrayAddOne(int[] arr) {
        if (arr.length < 2)
            return false;
        if (arr.length == 2) {
            if (arr[0] == arr[1])
                return true;
            else
                return false;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int largest = arr[arr.length - 1];
        //add code logic here
        return true;
    }

    
}
