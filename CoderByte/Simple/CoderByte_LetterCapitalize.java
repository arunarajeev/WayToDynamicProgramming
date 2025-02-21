package Simple;
/* * Have the function LetterCapitalize(str) take the str parameter 
being passed and capitalize the first letter
 * of each word. Words will be separated by only one space. */

public class CoderByte_LetterCapitalize {
    public static void main(String[] args) {
        String str = "this program correctly calculates the difference in minutes between two given times";
        System.out.println(letterCapitalize(str));
    }

    private static String letterCapitalize(String str) {
        String[] words = str.split(" ");
        if (words.length != 0) {
            StringBuilder sb = new StringBuilder();
            for (String word : words) {
                if (!word.isEmpty()) {
                    sb.append(word.substring(0, 1).toUpperCase() + word.substring(1, word.length()) + " ");
                }
            }

            return sb.toString().trim();
        }
        return "";
    }
}
