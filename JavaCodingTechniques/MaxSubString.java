public class MaxSubString {

    public static void main(String[] args) {
        System.out.println(subs("abcabcdebd"));
    }

    private static int subs(String s) {

        int left = 0, right = 0;
        int maxLength = 0;

        while (right < s.length()) {
            char current = s.charAt(right);

            // Check if the character already exists between left and right
            for (int i = left; i < right; i++) {
                if (s.charAt(i) == current) {
                    // Move left pointer to the next of the first occurrence of duplicate
                    left = i + 1;
                    break;
                }
            }

            // Update maxLength
            maxLength = Math.max(maxLength, right - left + 1);
            right++; // Expand the window
        }

        return maxLength;
    }
}
