package Simple;
/* Have the function FirstReverse(str) take the str parameter
 being passed and return the string in reversed order. 
 For example: if the input string is "Hello World and Coders" then
  your program should return the string sredoC dna dlroW olleH.
Examples
Input: "coderbyte"
Output: etybredoc
Input: "I Love Code"
Output: edoC evoL I */

import java.util.Scanner;

public class CoderByte_FirstReverse {
    public static String FirstReverse(String str) {
        String rev="";
    String[] strArr = str.split(" ");
    for(int i=0;i<strArr.length;i++){
        StringBuilder sb = new StringBuilder();
        sb.append(strArr[i]);
        rev=sb.reverse()+" "+rev;
        sb.setLength(0);
    }
    return String.valueOf(rev).trim();
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }
}
