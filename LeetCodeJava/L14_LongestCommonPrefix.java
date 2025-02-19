//This code beats 65 % in runtime and 64 % in memory
/* Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.*/

class L14_LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        System.out.println("String prefix = "+longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        
        int len = strs.length;
        String prefix = strs[0];
        char freqArr[] = new char[prefix.length()];
        for (int i = 0; i < prefix.length(); i++) {
            freqArr[i] = prefix.charAt(i);
        }
        boolean flag = true;
        int prefixLengthCounter = prefix.length();
        for (int i = 1; i < strs.length; i++) {
            int tempPrefix = 0;
            flag = true;
            while (flag && tempPrefix < prefixLengthCounter && tempPrefix<strs[i].length()) {

                if (strs[i].charAt(tempPrefix) == freqArr[tempPrefix]) {
                    tempPrefix++;
                    
                } else {    
                             
                    flag = false;
                }

            }
            prefixLengthCounter = tempPrefix;   
        }

        return prefix.substring(0, prefixLengthCounter);
    }
}
