package NeetCodeJava;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
        int left = 0, right = s.length() - 1;
        while (left <= right) {
            if (Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right)))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
}
