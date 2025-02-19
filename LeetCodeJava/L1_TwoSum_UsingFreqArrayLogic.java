
import java.util.Arrays;
//using frequency array for array elements between -109 to +109. This method won't work for exponential numbers.
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

class L1_TwoSum_UsingFreqArrayLogic{

    public static void main(String[] args) {
        int[] arr = {2,7,11,5,8};
        int target = 16;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] freqArr = new int [220];
        int temp = 0;
        int[] indexArr = new int[2];
        for (int i = 0;i<nums.length;i++){
            temp = target - nums[i];
            if(freqArr[temp+109]>0){
                 indexArr[0] = freqArr[temp+109]-1;
                indexArr[1] = i;
                 return indexArr;
            }
            freqArr[nums[i]+109]= i+1;
        }
        return null;
    }
}