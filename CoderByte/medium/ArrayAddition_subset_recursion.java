package medium;

import java.util.Arrays;

public class ArrayAddition_subset_recursion {

    public static void main(String[] args) {
        int[] arr1 = { 4, 6, 23, 10, 1, 3 };
        int[] arr2 = { 5, 7, 16, 1, 2 };

        System.out.println(arrayAdditionI(arr1)); // Output: true
        System.out.println(arrayAdditionI(arr2)); // Output: false
    }

    private static String arrayAdditionI(int[] arr) {
        // Step 1: Find the largest number in the array
        int largest = Arrays.stream(arr).max().getAsInt();

        // Step 2: Remove the largest number from the array
        int[] subArray = Arrays.stream(arr)
                .filter(num -> num != largest)
                .toArray();

        // Step 3: Check if any subset of subArray adds up to the largest number
        if (subsetSum(subArray, largest, 0)) {
            return "true";
        }
        return "false";
    }

    // Helper function to check if a subset sum equals target
    private static boolean subsetSum(int[] arr, int target, int index) {
        // Base case: If target is 0, we've found a valid subset
        if (target == 0) {
            return true;
        }

        // Base case: If we've reached the end of the array
        if (index == arr.length) {
            return false;
        }

        // Include the current element in the subset and check if we can find a valid
        // sum
        if (subsetSum(arr, target - arr[index], index + 1)) {
            return true;
        }

        // Exclude the current element from the subset and check if we can find a valid
        // sum
        return subsetSum(arr, target, index + 1);
    }
}
