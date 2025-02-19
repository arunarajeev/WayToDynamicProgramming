

import java.util.Stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true
 */
class L20_ValidParentheses {

    public static void main(String[] args) {
        String s = "([})";
        System.out.println(isValid_usingStack(s));
        System.out.println(isValid_usingArray(s));
    }
//This code beats 99.7% runtime and 23% in memory
    public static boolean isValid_usingArray(String s) {
        char[] arr = s.toCharArray();
        char[] stack = new char[s.length()];
        int counter = 0;
        int pointer = -1;
        while (counter < arr.length) {

            char c = arr[counter];
            if (c == '(' || c == '[' || c == '{') {

                stack[++pointer] = c;
            } else if (pointer > -1) {
                switch (c) {
                    case ')':
                        if (stack[pointer] == '(') {
                            pointer--;
                        } else {
                            return false;
                        }
                        break;
                    case ']':

                        if (stack[pointer] == '[') {
                            pointer--;
                        } else {
                            return false;
                        }
                        break;
                    case '}':
                        if (stack[pointer] == '{') {
                            pointer--;
                        } else {
                            return false;
                        }
                        break;
                }
            } else {
                return false;
            }
            counter++;
        }
        return pointer < 0;
    }
//This code beats 98% runtime and 25% in memory
    public static boolean isValid_usingStack(String s) {
        Stack<Character> stack = new Stack<>();
        int counter = 0;
        while (counter < s.length()) {

            char c = s.charAt(counter);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                switch (c) {
                    case ')':
                        if (stack.peek() == '(') {
                            stack.pop();
                        } else {
                            return false;
                        }
                        break;
                    case ']':

                        if (stack.peek() == '[') {
                            stack.pop();
                        } else {
                            return false;
                        }
                        break;
                    case '}':
                        if (stack.peek() == '{') {
                            stack.pop();
                        } else {
                            return false;
                        }
                        break;
                }
            } else {
                return false;
            }
            counter++;
        }
        return stack.empty();
    }
}
