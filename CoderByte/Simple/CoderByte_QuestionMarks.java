package Simple;
/* Questions Marks
Have the function QuestionsMarks(str) take the str string parameter,
 which will contain single digit numbers, letters, and question marks, 
 and check if there are exactly 3 question marks between every pair of
  two numbers that add up to 10. If so, then your program should return 
  the string true, otherwise it should return the string false. 
  If there aren't any two numbers that add up to 10 in the string,
   then your program should return false as well.

For example: if str is "arrb6???4xxbl5???eee5" then your program should
 return true because there are exactly 3 question marks between 6 and 4,
  and 3 question marks between 5 and 5 at the end of the string.

Examples
Input: "aa6?9"
Output: false
Input: "acc?7??sss?3rr1??????5"
Output: true  */

import java.util.Scanner;

public class CoderByte_QuestionMarks {
    public static String CodelandUsernameValidation(String str) {
       // Pattern pattern = Pattern.compile("[0-9]([a-zA-z]*[?][a-zA-z]*){3}[0-9]");                                         
       int prevNum = -1; // Store the previous number
        int questionMarkCount = 0; // Count question marks between numbers
        boolean foundValidPair = false; // Flag to check at least one valid pair

       for(char ch:str.toCharArray()){
        if(Character.isDigit(ch)){
                int currentNum = Character.getNumericValue(ch);

                // Check if the previous number + current number equals 10
                if (prevNum != -1 && prevNum + currentNum == 10) {
                    if (questionMarkCount == 3) {
                        foundValidPair = true; // Valid pair found
                    } else {
                        return "false"; // Not exactly 3 question marks
                    }
                }

                // Reset question mark count and update previous number
                prevNum = currentNum;
                questionMarkCount = 0;
            } else if (ch == '?') {
                questionMarkCount++;
            }
        }

        return String.valueOf(foundValidPair); 
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(CodelandUsernameValidation(s.nextLine()));
    } 
}
