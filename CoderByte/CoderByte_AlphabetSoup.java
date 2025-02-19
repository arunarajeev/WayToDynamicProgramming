import java.util.Arrays;
import java.util.Scanner;

/**
 * Have the function AlphabetSoup(str) take the str string parameter being
 * passed and return the string with
 * the letters in alphabetical order (ie. hello becomes ehllo).
 * Assume numbers and punctuation symbols will not be included in the string.
 */

public class CoderByte_AlphabetSoup {
    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(alphabetSoup(s.nextLine()));
    }

    private static String alphabetSoup(String str) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        return String.valueOf(ch);
    }

}
