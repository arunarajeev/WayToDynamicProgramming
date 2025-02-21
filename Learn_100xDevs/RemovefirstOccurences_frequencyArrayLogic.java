package Learn_100xDevs;

/*
 * You are given a string containing lower-case english alphabets. 
 * You need to perform the following operation as many times as possible:
 * Take the first occurrence of each alphabet if it exists and remove it from the string. 
 * Eventually the string becomes empty.For example, let's say the string is "ababba".
 * In the first move, we need to remove the first occurrence of each character 'a, 'b' and c.
 *  It becomes"ababba" → "abba"
 * Again, we repeat unless the string becomes empty"abba" → "ba""ba" → "™
 * Find the last non-empty value for the string.
 * Example 1:Input: s = "ababba"Output: "ba"Explanation: ababba → abba → ba → ""
 */
public class RemovefirstOccurences_frequencyArrayLogic {
    public static void main(String[] args) {
        removeOccurences("ababba");
    }

    private static void removeOccurences(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        int ascii = 0;
        while (sb.length() > 0) {
            int[] freqArr = new int[26];
            int i = 0;
            while (i < sb.length()) {
                ascii = Integer.valueOf(sb.charAt(i)) - 97;
                ++freqArr[ascii];
                if (freqArr[ascii] == 1) {
                    sb.deleteCharAt(i);
                } else {
                    i++;
                }
            }
            if (!sb.isEmpty())
                System.out.print(sb.toString() + "->");
            else
                System.out.println("\"\"");
        }

    }

}
