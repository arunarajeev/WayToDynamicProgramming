
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Ants";
        String str2 = "TTan";
        System.out.println(Integer.valueOf('a') + ".." + Integer.valueOf('z'));
        System.out.println(isAnagram(str1.toLowerCase(), str2.toLowerCase()));
    }

    private static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            arr1[(int) str1.charAt(i) - 97] += 1;
            arr2[(int) str2.charAt(i) - 97] += 1;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
}
