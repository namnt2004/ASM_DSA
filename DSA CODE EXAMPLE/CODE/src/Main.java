import java.util.EmptyStackException;
import java.util.Stack;


public class Main {

    // Main method to demonstrate stack operations
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        System.out.println("Top element: " + stack.peek());  // Outputs 20
        System.out.println("Popped element: " + stack.pop()); // Outputs 20
        System.out.println("Top element after pop: " + stack.peek()); // Outputs 10
        System.out.println("Is stack isEmpty ?\n"+stack.isEmpty());
    }
}