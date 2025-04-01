package NeetCodeJava;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
            
            HashMap<Integer,Integer> numMap = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                int diff = target - nums[i];
                if(numMap.containsKey(diff)){
                    return new int[]{numMap.get(diff),i};
                }
                numMap.put(nums[i],i);
            }
            return null;
        }
    //[3,4,5,6], target = 7
        public static void main(String[] args) {
            int[] nums = {3,4,5,6};
            int target = 7;
            System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}
