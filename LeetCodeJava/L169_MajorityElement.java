
import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/problems/majority-element/description/
/* Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. 
You may assume that the majority element always exists in the array.
Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109 */
class L169_MajorityElement {

    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        //System.out.println(solution(nums));
        //System.out.println(solution1(nums));
        System.out.println(solution_optimal(nums));

    }

    private static int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
            if (map.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }
        return Integer.MIN_VALUE;
    }

    private static int solution1(int[] nums) {
        Arrays.sort(nums);
        int element = nums[0];

        int count = 1;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == element) {
                count++;
                if (count > nums.length / 2) {
                    return element;
                }
            } else {
                element = nums[i];
                count = 1;
            }
        }
        if (count > nums.length / 2) {
            return element;
        }
        return Integer.MIN_VALUE;
    }

    /* *Once the array is sorted, the majority element will always be present at index n/2, where n is the size of the array.
This is because the majority element occurs more than n/2 times, and when the array is sorted, it will occupy the middle position.
The code returns the element at index n/2 as the majority element.*/

    private static int solution_optimal(int[] nums) {
        Arrays.sort(nums);      
        return nums[nums.length/2];
    }
}
