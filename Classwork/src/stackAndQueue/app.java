package stackAndQueue;
import java.util.Stack;

public class app {
    public static void main(String[] args) {
        // Creating a Stack of Integer type
        Stack<Integer> stack = new Stack<>();
        
        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        // Peeking the top element
        System.out.println("Top element: " + stack.peek());  // Output: 30
        
        // Popping the top element
        System.out.println("Popped element: " + stack.pop());  // Output: 30
        
        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());  // Output: false
        
        // Searching for an element
        System.out.println("Position of 10: " + stack.search(10));  // Output: 2

        System.out.println("Top element: " + stack.peek());
    }
}
