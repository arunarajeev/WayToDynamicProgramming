
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "Malayalam";
        System.out.println(isPalindrome(str.toLowerCase()));
        System.out.println(revStr(str));
        int a[] = { 2, 4, 6, 1, 9, 5 };
        Integer[] array = { 1, 2, 3, 4, 5 };

        // Method 1: Using Arrays.asList()
        List<Integer> list1 = Arrays.asList(array);
        Collections.sort(list1);
        System.out.println(list1);
    }


    private static String revStr(String str) {
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i) + rev;
        }
        int len = str.length() - 1;
        while (len > -1) {
            rev += str.charAt(len);
            len--;
        }
        return rev;
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }

        return true;
    }
}
