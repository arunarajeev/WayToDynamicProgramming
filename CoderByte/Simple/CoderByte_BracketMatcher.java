package Simple;
/* Bracket Matcher
Have the function BracketMatcher(str) take the str parameter being passed and return 1 if the brackets are correctly matched and each one is accounted for. Otherwise return 0. For example: if str is "(hello (world))", then the output should be 1, but if str is "((hello (world))" the the output should be 0 because the brackets do not correctly match up. Only "(" and ")" will be used as brackets. If str contains no brackets return 1.
Examples
Input: "(coder)(byte))"
Output: 0
Input: "(c(oder)) b(yte)"
Output: 1 */

import java.util.Stack;

public class CoderByte_BracketMatcher {
    public static String BracketMatcher(String str) {
        Stack<Character> stack = new Stack<Character>();
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){

            if(arr[i]=='('){
                stack.add('(');
            }
            if(arr[i]==')'){

                if(!stack.isEmpty()){
                    if(stack.peek()=='('){
                        stack.pop();
                    }
                    else{
                        return "0";
                    } 
                }
                else{
                    return "0";
                }
                              
            }
        }
        if(stack.isEmpty())
            return "1";
        return "0";
      }

   public static void main (String[] args) {  
    // keep this function call here     
    //Scanner s = new Scanner(System.in);
    System.out.print(BracketMatcher("(c(oder)) b(yte)")); 
  }
}
