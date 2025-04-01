package NeetCodeJava;

import java.util.HashMap;
import java.util.HashSet;

public class SingleNumber {

    
    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 4, 4 };
        System.out.println(singleNumber(arr));
        System.out.println(singleNumber1(arr));
        System.out.println(singleNumberUsingSet(arr));
    }
    public static int singleNumber1(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int n : nums) {
            if (count.containsKey(n)) {
                count.remove(n);
            } else
                count.put(n, 0);
        }
        return count.keySet().iterator().next();
    }

    public static int singleNumberUsingSet(int[] nums) {
        HashSet<Integer> count = new HashSet<>();
        for (int n : nums) {
            if (count.contains(n)) {
                count.remove(n);
            } else
                count.add(n);
        }
        return count.iterator().next();
    }

}