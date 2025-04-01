package NeetCodeJava;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 2, 4, 6, 8 };
        System.out.println(binarySearch(nums, 4));
    }

    private static int binarySearch(int[] nums, int target) {
        return recursivebinarySearch(nums, target, 0, nums.length - 1);
    }

    private static int recursivebinarySearch(int[] nums, int target, int l, int r) {
        if (l > r)
            return -1;
        int m = (l + r) / 2;
        if (nums[m] == target)
            return m;
        if (target < nums[m])
            return recursivebinarySearch(nums, target, l, m - 1);
        return recursivebinarySearch(nums, target, m + 1, r);

    }
}
