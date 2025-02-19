/* Min Window Substring
Have the function MinWindowSubstring(strArr) take the array of strings 
stored in strArr, which will contain only two strings, the first parameter
 being the string N and the second parameter being a string K of 
 some characters, and your goal is to determine the smallest substring of N 
 that contains all the characters in K. 
 For example: if strArr is ["aaabaaddae", "aed"] then the smallest 
 substring of N that contains the characters a, e, and d is "dae" located
  at the end of the string. So for this example your program should return the string dae.

Another example: if strArr is ["aabdccdbcacd", "aad"] then the smallest 
substring of N that contains all of the characters in K is "aabd" 
which is located at the beginning of the string. 
Both parameters will be strings ranging in length from 1 to 50 characters 
and all of K's characters will exist somewhere in the string N. 
Both strings will only contains lowercase alphabetic characters.
Examples
Input: new String[] {"ahffaksfajeeubsne", "jefaa"}
Output: aksfaje
Input: new String[] {"aaffhkksemckelloe", "fhea"}
Output: affhkkse

Sliding Window + Two Pointers approach, which is optimal for substring search problems.
Optimal Approach: Sliding Window + Hash Map
Use two pointers (left and right) to expand and contract the window dynamically.
Maintain a frequency map for characters in K.
Expand the right pointer to include characters until all characters of K are in the window.
Contract from the left while maintaining the valid substring to find the smallest possible window.


*/

import java.util.HashMap;
import java.util.Map;

public class CoderByte_MinWindowSubString {
    public static String minWindowSubstring(String[] strArr) {
        String N = strArr[0], K = strArr[1];
        Map<Character, Integer> charCount = new HashMap<>();
        
        // Store frequency of characters in K
        for (char c : K.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int left = 0, minLen = Integer.MAX_VALUE, minStart = 0, requiredChars = K.length();
        
        // Sliding window logic
        for (int right = 0; right < N.length(); right++) {
            char rightChar = N.charAt(right);
            if (charCount.containsKey(rightChar)) {
                if (charCount.get(rightChar) > 0) {
                    requiredChars--; 
                }
                charCount.put(rightChar, charCount.get(rightChar) - 1);
            }

            // Contract the window while it's still valid
            while (requiredChars == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }

                char leftChar = N.charAt(left);
                if (charCount.containsKey(leftChar)) {
                    charCount.put(leftChar, charCount.get(leftChar) + 1);
                    if (charCount.get(leftChar) > 0) {
                        requiredChars++;
                    }
                }
                left++; // Shrink window
            }
        }

        return (minLen == Integer.MAX_VALUE) ? "" : N.substring(minStart, minStart + minLen);
    }

    public static void main(String[] args) {
        String[] input1 = {"ahffaksfajeeubsne", "jefaa"};
        System.out.println(minWindowSubstring(input1)); // Output: aksfaje

        String[] input2 = {"aaffhkksemckelloe", "fhea"};
        System.out.println(minWindowSubstring(input2)); // Output: affhkkse
    }
}
