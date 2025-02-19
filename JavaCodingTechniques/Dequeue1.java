
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Stack;

class Dequeue1 {

    public static void main(String[] args) {
        Deque<Integer> deq = new ArrayDeque<>();
        deq.add(10);
        deq.add(9);
        deq.add(8);
        System.out.println(deq.peekFirst());
        System.out.println(deq.peekLast());
        System.out.println(deq);

        Stack<String> stack = new Stack<>();
        stack.push("A");
        System.out.println(stack.peek());
        try {
            stack.pop();
            stack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Stack is Empty");
        }
        Deque<String> d = new ArrayDeque<>();
        d.push("C");
        d.poll();
        d.poll();
        try {
            d.pop();
        } catch (NoSuchElementException e) {
            System.out.println("Queue is Empty");
        }
        System.out.println("Execution completed");
    }
}
