package medium;

import java.util.regex.Pattern;

/**
 * Have the function CaesarCipher(str,num) take the str parameter and perform a
 * Caesar Cipher shift on it using
 * the num parameter as the shifting number. A Caesar Cipher works by shifting
 * each letter in the string N places
 * down in the alphabet (in this case N will be num). Punctuation, spaces, and
 * capitalization should remain intact.
 * For example if the string is "Caesar Cipher" and num is 2 the output should
 * be "Ecguct Ekrjgt".
 *
 */

public class CaesarCipher {
    public static void main(String[] args) {
        System.out.println(caesarCipher("za4esa!rCiph(eY", 4));
    }

    private static String caesarCipher(String str, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int ascii = Integer.valueOf(str.charAt(i));
            n = n % 26;
            ascii = (ascii + n);
            if (Pattern.compile("[a-z]").matcher(String.valueOf(str.charAt(i))).matches()) {
                if (ascii > 122)
                    ascii = ascii - 26;
                sb.append((char) ascii);
            } else if (Pattern.compile("[A-Z]").matcher(String.valueOf(str.charAt(i))).matches()) {
                if (ascii > 90)
                    ascii = ascii - 26;
                sb.append((char) ascii);
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();

    }
}
