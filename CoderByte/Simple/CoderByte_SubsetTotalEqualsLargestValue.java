package Simple;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoderByte_SubsetTotalEqualsLargestValue {
    
public static List<Integer> getSubsetSumToLargest(int[] arr) {
    if (arr == null || arr.length == 0) {
        return new ArrayList<>();
    }

    int largest = Arrays.stream(arr).max().getAsInt();
    List<Integer> subset = new ArrayList<>();
    int currentSum = 0;

    // Iterate backwards to prioritize larger numbers
    for (int i = arr.length - 1; i >= 0; i--) {
        if (currentSum + arr[i] <= largest) {
            subset.add(arr[i]);
            currentSum += arr[i];
        }
        if (currentSum == largest) {
          break;
        }
    }

    // If a subset summing to the largest value was not found, return an empty list.
    if (currentSum != largest) {
        return new ArrayList<>();
    }
    return subset;
}

public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 10};
    List<Integer> subset = getSubsetSumToLargest(arr);
    System.out.println("Subset summing to largest value: " + subset); // Output: [10]

    int[] arr2 = {8, 2, 3, 7, 5};
     List<Integer> subset2 = getSubsetSumToLargest(arr2);
    System.out.println("Subset summing to largest value: " + subset2); // Output: [8]

    int[] arr3 = {1, 2, 3, 4, 5, 6};
    List<Integer> subset3 = getSubsetSumToLargest(arr3);
    System.out.println("Subset summing to largest value: " + subset3); // Output: [6]

    int[] arr4 = {5, 5, 10, 1, 2};
    List<Integer> subset4 = getSubsetSumToLargest(arr4);
    System.out.println("Subset summing to largest value: " + subset4); // Output: [10]

    int[] arr5 = {1, 2, 3, 7};
    List<Integer> subset5 = getSubsetSumToLargest(arr5);
    System.out.println("Subset summing to largest value: " + subset5); // Output: [7]
}

}