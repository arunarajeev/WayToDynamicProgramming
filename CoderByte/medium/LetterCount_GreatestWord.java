package medium;
/* 
 * Have the function LetterCountI(str) take the str parameter being passed 
and return the first word with the greatest
 * number of repeated letters. For example: "Today, is the greatest day ever!" 
 * should return greatest because it has
 * 2 e's (and 2 t's) and it comes before ever which also has 2 e's. 
 * If there are no words with repeating letters
 * return -1. Words will be separated by spaces.
 * */

import java.util.HashMap;

public class LetterCount_GreatestWord {
    public static void main(String[] args) {
        String str = "Our ;mission,inform'ation universally,ac-cessible-";
        System.out.println(letterCount(str));
    }

    private static String letterCount(String str) {
        str = str.replaceAll("[^a-zA-Z ,]", "");
        //System.out.println(str);
        String arr[] = str.split("[ ,]");
        //System.out.println(arr.length);
        HashMap<Integer, String> map = new HashMap<>();
        int greatestLettersCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int letterCount = repeatLetters(arr[i].toLowerCase());
            if (letterCount > greatestLettersCount && !map.containsKey(letterCount)) {
                map.put(letterCount, arr[i]);
                greatestLettersCount = letterCount;
            }
        }
        System.out.println(greatestLettersCount);
        return map.get(greatestLettersCount);
    }

    private static int repeatLetters(String str) {
        int[] alphabets = new int[26];
        int repeatCount = 0;
        for (int i = 0; i < str.length(); i++) {
            int ascii = (int) str.charAt(i)-97;
            alphabets[ascii]++;
            if (alphabets[ascii] > 1)
                repeatCount++;
        }
        return repeatCount;
    }

}
