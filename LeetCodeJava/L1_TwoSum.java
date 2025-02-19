
import java.util.Arrays;
import java.util.HashMap;
//This logic using hashmap beats 99% in runtime and only 10% in memory
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 10e4
-10e9 <= nums[i] <= 10e9
-10e9 <= target <= 10e9
Only one valid answer exists.
*/

class L1_TwoSum{

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();     
        int temp = 0;
        int[] indexArr = new int[2];
        for (int i = 0;i<nums.length;i++){
            temp = target - nums[i];
            if(map.containsKey(temp)){
                indexArr[0] = map.get(temp);
                indexArr[1] = i;
                 return indexArr;
            }
            else{
                map.put(nums[i], i);
            }
        }
        return null;
    }
}