package NeetCodeJava;

import java.util.Scanner;

public class IsAnagram_optimal_frequencyArray {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] alphabetCountArr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alphabetCountArr[s.charAt(i) - 97]++;
            alphabetCountArr[t.charAt(i) - 97]--;

        }
        for (int i = 0; i < 26; i++) {
            if (alphabetCountArr[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        scannerInput();
    }

    public static void scannerInput() {
        Scanner scanner = new Scanner(System.in);
        String[] inputStrArr = new String[2];
        int next = 1;
        while (next == 1) {
            System.out.println("Enter a string array with 2 strings separated by space:  ");
            inputStrArr = scanner.nextLine().split(" ");
            // Validate if two strings are provided
            if (inputStrArr.length != 2) {
                System.out.println("Invalid input! Please enter exactly two words separated by space.");
                continue; // Ask for input again
            }
            System.out.println(isAnagram(inputStrArr[0], inputStrArr[1]));
            System.out.println("Continue? yes-1 no - any other character");
            if (scanner.hasNextInt()) {
                next = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
            } else {
                break; // Exit loop if non-integer input is given
            }
        }
    }
}