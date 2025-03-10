/*Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.
Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0
 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100 */

class L1512_NumberofGoodPairs_revise {

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1, 1, 3 };
        System.out.println(numIdenticalPairs_usingPrefix(nums));
        System.out.println(numIdenticalPairs_usingAltitude(nums));

    }

    // This code logic beats 100% in runtime and 79% in memory on Leetcode
    private static int numIdenticalPairs_usingAltitude(int[] nums) {
        int count = 0;
        // nums = [1,2,3,1,1,3]
        int freqArr[] = new int[101];
        for (int i = 0; i < nums.length; i++) {
            ++freqArr[nums[i]];
            if (freqArr[nums[i]] > 1)
                count += freqArr[nums[i]] - 1;
        }

        return count;
    }

    // This code logic beats 87% in runtime and 27% in memory on Leetcode
    public static int numIdenticalPairs_usingPrefix(int[] nums) {
        int count = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

}
