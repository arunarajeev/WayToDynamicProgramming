
import java.util.Arrays;
//This program needs more work. Right now, the code just returns the middle element as the median. 
//But , I'll have to modify the code to sort the elements of every subArray(window) and 
//then find the median. -using bruteforce.
//optimize the code by comparing the previous median by the newly added element and if the 
//current element falls to the left or right of the previous median and then decide on the median.
/*480. Sliding Window Median
Hard
Topics
Companies
Hint
The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle values.

For examples, if arr = [2,3,4], the median is 3.
For examples, if arr = [1,2,3,4], the median is (2 + 3) / 2 = 2.5.
You are given an integer array nums and an integer k. There is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Return the median array for each window in the original array. Answers within 10-5 of the actual value will be accepted.

 

Example 1:

Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [1.00000,-1.00000,-1.00000,3.00000,5.00000,6.00000]
Explanation: 
Window position                Median
---------------                -----
[1  3  -1] -3  5  3  6  7        1
 1 [3  -1  -3] 5  3  6  7       -1
 1  3 [-1  -3  5] 3  6  7       -1
 1  3  -1 [-3  5  3] 6  7        3
 1  3  -1  -3 [5  3  6] 7        5
 1  3  -1  -3  5 [3  6  7]       6
Example 2:

Input: nums = [1,2,3,4,2,3,1,4,2], k = 3
Output: [2.00000,3.00000,3.00000,3.00000,2.00000,3.00000,2.00000] */

public class L480_SlidingWindowMedian {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 4;
        System.out.println(Arrays.toString(medianSlidingWindow(nums, k)));

    }

    public static double[] medianSlidingWindow(int[] nums, int k) {
        if (nums.length < k) {
            return null;
        }
        int doubleLength = nums.length - k/2 -1;
        double[] medianArr = new double[doubleLength];
        int counter = -1;
        if (nums.length > k) {
            for (int i = k/2; i < nums.length-1; i++) {
                if (k % 2 != 0) {
                    medianArr[++counter] = nums[i-(k / 2) + 1];
                } else {
                    medianArr[++counter] = (nums[i- (k / 2)] + nums[i-(k / 2) + 1]) / 2;
                }
            }
        }
        return medianArr;
    }

}
