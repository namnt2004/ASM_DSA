import java.util.Stack;

public class StudentFunctions {
    private Stack<Student> stack;

    public StudentFunctions() {
        stack = new Stack<>();
    }

    public void push(Student student) {
        stack.push(student);
    }

    public Student pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            System.out.println("Stack is empty.");
            return null;
        }
    }

    public Student peek() {
        if (!stack.isEmpty()) {
            return stack.peek();
        } else {
            System.out.println("Stack is empty.");
            return null;
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            Stack<Student> tempStack = new Stack<>();
            while (!stack.isEmpty()) {
                Student student = stack.pop();
                System.out.println(student);
                tempStack.push(student);
            }
            while (!tempStack.isEmpty()) {
                stack.push(tempStack.pop());
            }
        }
    }
}
