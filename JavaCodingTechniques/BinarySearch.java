public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 5, 7, 8, 9 };
        System.out.println(binarySearch(nums, 3));
    }

    private static int binarySearch(int[] nums, int k) {
        int l = 0, r = nums.length - 1;
        int index = -1, m = 0;

        while (l <= r) {
            m = (l + r) / 2;
            if (nums[m] == k)
                return m+1;
            if (k < nums[m]) {
                r = m - 1;
            }
            if (k > nums[m]) {
                l = m + 1;
            }
        }
        return -1;
    }
}
