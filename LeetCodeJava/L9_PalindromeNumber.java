//This code beats 100% runtime and 75% in memory
//Reverse the number and compare
/*Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1 */

class L9_PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(12721));
        System.out.println(isPalindrome_usingString(12721));
    }

    public static boolean isPalindrome(int x) {
        int rev = 0, temp = x;
        while (temp > 0) {
            rev = (rev * 10) + (temp % 10);
            temp /= 10;
        }
        return (rev == x);
    }

    public static boolean isPalindrome_usingString(int x) {
        String str = Integer.toString(x);  
        int len = str.length();
        int counter = 0;
        while (str.charAt(counter) == (str.charAt(len - counter-1)) && (counter < (len / 2))) {
            counter++;
        }
        if (counter < (len / 2)) {
            return false;
        }
        return true;
    }
}
