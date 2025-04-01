/* Given an array of integers nums and an integer k, 
return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

 

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2
*/

import java.util.Arrays;
import java.util.HashMap;

public class L560_subarraySum {

    public static int subarraySum(int[] nums, int k) {
        int prefixSum = 0;
        int count = 0;
        HashMap<Integer, Integer> prefixSumFrequency = new HashMap<>();
        prefixSumFrequency.put(0, 1);

        for (int num : nums) {
            prefixSum += num;

            if (prefixSumFrequency.containsKey(prefixSum - k)) {
                count += prefixSumFrequency.get(prefixSum - k);
                System.out.println("prefixSum " + prefixSum + "  count value: " + count);
            }
            prefixSumFrequency.put(prefixSum,
                    prefixSumFrequency.getOrDefault(prefixSum, 0) + 1);
            System.out.println("Iteration of " + num + "  " + prefixSumFrequency);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] numArr = { 1, 2, 3, -2, 4 };
        int k = 5;
        System.out.println(Arrays.toString(numArr));
        System.out.println(subarraySum(numArr, k)); // Expected Output: 2
    }
}