//https://leetcode.com/problems/contains-duplicate/description/
/* Given an integer array nums, return true if any value appears 
at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.

Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
All elements are distinct.

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109*/
import java.util.Arrays;

class L217_ContainsDuplicateEasy {

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.out.println(solution(nums));
        //System.out.println(solution1(nums));
        //System.out.println(solution_optimal(nums));
    }

    private static boolean solution(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
