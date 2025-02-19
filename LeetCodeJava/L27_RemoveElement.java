
import java.util.ArrayList;
import java.util.stream.IntStream;

//https://leetcode.com/problems/remove-element/description/
class L27_RemoveElement {

    public static int[] nums = {3, 2, 3, 4, 3};

    public static void main(String[] args) {
        int val = 3;
        System.out.println(solution(nums, val));
        System.out.println(new ArrayList<>(IntStream.of(nums).boxed().toList()));
    }

    private static int solution(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
