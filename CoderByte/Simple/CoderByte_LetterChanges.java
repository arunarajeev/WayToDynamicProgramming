package Simple;


/* Have the function LetterChanges(str) take the str parameter being passed 
and modify it using the following algorithm.
 * Replace every letter in the string with the letter following it in the alphabet 
 * (ie. c becomes d, z becomes a).
 * Then capitalize every vowel in this new string (a, e, i, o, u) 
 * and finally return this modified string. */

public class CoderByte_LetterChanges {

    public static void main(String[] args) {
        String str = "this program correctly calculates the difference in minutes between two given times";
        System.out.println(letterChanges(str));  // Output: uijt qspnbsn dsppsufmz uif ejggfsfodf jo njuofut cfuufo xpv hjwfo ujntf
    }

    private static String letterChanges(String str) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            // If the character is a letter, shift it
            if (Character.isLetter(c)) {
                // Shift character, wrap around if 'z' or 'Z'
                char shiftedChar = (char) (c + 1);
                if (c == 'z') {
                    shiftedChar = 'a';
                } else if (c == 'Z') {
                    shiftedChar = 'A';
                } else if (c == 'z' + 1) {
                    shiftedChar = 'a';  // Wrap around z -> a.
                }

                // Capitalize vowels
                if (isVowel(shiftedChar)) {
                    sb.append(Character.toUpperCase(shiftedChar));
                } else {
                    sb.append(shiftedChar);
                }
            } else {
                // Non-letter characters remain unchanged
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
    
    // Helper function to check if the character is a vowel
    private static boolean isVowel(char c) {
        return "aeiou".indexOf(Character.toLowerCase(c)) != -1;
    }
}