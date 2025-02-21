package Simple;
/*
* Have the function LetterCountI(str) take the str parameter being passed and return the first word with the greatest
 * number of repeated letters. For example: "Today, is the greatest day ever!" should return greatest because it has
 * 2 e's (and 2 t's) and it comes before ever which also has 2 e's. If there are no words with repeating letters
 * return -1. Words will be separated by spaces.
*/

public class CoderByteLetterCountWinningWord {
    public static void main(String[] args) {
        String str = "function calulates expected";
        System.out.println(letterCount(str.toLowerCase()));
    }

    private static String letterCount(String str) {
        String[] arr = str.split(" ");
        int counter = 0;
        int maxCount = 0;
        String winningWord = "";

        for (int j = 0; j < arr.length; j++) {
            String word = arr[j];
            int i = 0;
            int[] alphabet = new int[26];

            while (i < word.length()) {
                char c = word.charAt(i);
                int ascii = ((int) c) - 97;
                alphabet[ascii] += 1;
                if (alphabet[ascii] > 1) {
                    counter++;
                }
                if (counter > maxCount) {
                    maxCount = counter;
                    winningWord = word;
                }
                i++;
            }
            counter = 0;

        }
        System.out.println(maxCount);
        if (maxCount > 0)
            return winningWord;
        else
            return "-1";

    }
}