
import java.util.Stack;

class Stack2

{

public static void main(String[] args) {
   Stack<String> stack = new Stack<>();

        // Use push() to add elements into the Stack
        stack.push("Welcome");
        stack.push("To");
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");

        // Displaying the Stack
        System.out.println("Initial Stack: " + stack);

        // Fetching the element at the head of the Stack
        System.out.println("The element at the top of the"
                           + " stack is: " + stack.peek());
stack.pop();stack.pop();
        // Displaying the Stack after the Operation
        System.out.println("Final Stack: " + stack);
    
}

}