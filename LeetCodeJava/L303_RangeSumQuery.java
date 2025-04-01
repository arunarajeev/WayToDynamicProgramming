
import java.util.Arrays;

/* Input
["NumArray", "sumRange", "sumRange", "sumRange"]
[[[-2,0,3,-5,2,-1]], [0, 2], [2, 5], [0, 5]]
Output
[null, 1, -1, -3]

Explanation
NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3 */

public class L303_RangeSumQuery {
    private static int prefixSum[];

    L303_RangeSumQuery(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        this.prefixSum = nums;
        System.out.println(Arrays.toString(prefixSum));
    }

    public static int sumRange(int left, int right) {
        if (left == 0) {
            return prefixSum[right];
        }
        return prefixSum[right] - prefixSum[left-1];
    }

    public static void main(String[] args) {
        int[][] array = { { -2, 0, 3, -5, 2, -1 }, { 0, 2 }, { 2, 5 }, { 0, 5 } };
        L303_RangeSumQuery sumQuery = new L303_RangeSumQuery(array[0]);
        for (int i = 1; i < array.length; i++) {
            System.out.println(sumRange(array[i][0], array[i][1]));
        }
    }
}
