package NeetCodeJava;

import java.util.Arrays;

/*
 * Input: nums = [2,20,4,10,3,4,5]

Output: 4
 */
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = { 2, 20, 4, 10, 3, 4, 5 };
        System.out.println(sequence(nums));    
    }

    private static int sequence(int[] nums) {
        if(nums.length<1){
            return 0;
        }
        Arrays.sort(nums);
        int count = 0;
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] + 1 == nums[i]) {
                count++;
                max = Math.max(max, count);
            }
            else if(nums[i - 1] == nums[i]){

            }
            else{
                count=0;
            }
        }
        return max+1;
    }

}
