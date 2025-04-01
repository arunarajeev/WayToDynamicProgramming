package NeetCodeJava;

public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = { 9,5,7,4,1,2,3,6,8 };
        System.out.println(missingNumber(nums));
    }

    private static int missingNumber(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += (i+1) - nums[i];
        }
        return sum;
    }
}
