package medium;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubstring {
    public static String minWindowSubstring(String[] strArr) {
        String N = strArr[0];  // The main string
        String K = strArr[1];  // The target characters

        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : K.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        int left = 0, minLength = Integer.MAX_VALUE, minStart = 0;
        int requiredChars = K.length(), foundChars = 0;

        Map<Character, Integer> windowCounts = new HashMap<>();

        for (int right = 0; right < N.length(); right++) {
            char rightChar = N.charAt(right);
            windowCounts.put(rightChar, windowCounts.getOrDefault(rightChar, 0) + 1);

            if (charCountMap.containsKey(rightChar) && 
                windowCounts.get(rightChar) <= charCountMap.get(rightChar)) {
                foundChars++;
            }

            // Try to shrink the window when all characters are matched
            while (foundChars == requiredChars) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minStart = left;
                }

                char leftChar = N.charAt(left);
                windowCounts.put(leftChar, windowCounts.get(leftChar) - 1);

                if (charCountMap.containsKey(leftChar) && 
                    windowCounts.get(leftChar) < charCountMap.get(leftChar)) {
                    foundChars--;
                }

                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : N.substring(minStart, minStart + minLength);
    }

    public static void main(String[] args) {
        String[] input1 = {"ahffaksfajeeubsne", "jefaa"};
        System.out.println(minWindowSubstring(input1));  // Output: aksfaje

        String[] input2 = {"aaffhkksemckelloe", "fhea"};
        System.out.println(minWindowSubstring(input2));  // Output: affhkkse

        String[] input3 = {"aaabaaddae", "aed"};
        System.out.println(minWindowSubstring(input3));  // Output: dae

        String[] input4 = {"aabdccdbcacd", "aad"};
        System.out.println(minWindowSubstring(input4));  // Output: aabd
    }
}
