public class StackLinkedList {
    // Node class represents each element in the stack
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedStack class represents the stack using linked list
    class LinkedStack {
        private Node top;  // The top of the stack

        public LinkedStack() {
            this.top = null;
        }

        // Check if the stack is empty
        public boolean isEmpty() {
            return top == null;
        }

        // Add an element to the stack
        public void push(int data) {
            Node newNode = new Node(data);  // Create a new node
            newNode.next = top;             // Link the new node with the current top
            top = newNode;                  // Update top to be the new node
        }

        // Remove and return the top element from the stack
        public int pop() {
            if (isEmpty()) {                // If the stack is empty
                System.out.println("Stack is empty.");
                return -1;
            }
            int value = top.data;           // Store the top value
            top = top.next;                 // Move top down to the next node
            return value;                   // Return the popped value
        }

        // View the top element of the stack without removing it
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return -1;
            }
            return top.data;
        }
    }

    // Main method to test stack operations
    public static void main(String[] args) {
        StackLinkedList outer = new StackLinkedList();  // Create an instance of the outer class
        LinkedStack stack = outer.new LinkedStack();    // Create a stack instance

        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println("Top element is: " + stack.peek()); // View the top element
        System.out.println("Popped element: " + stack.pop());  // Remove an element from the stack
        System.out.println("Top element after pop: " + stack.peek()); // View the new top after popping
    }
}
