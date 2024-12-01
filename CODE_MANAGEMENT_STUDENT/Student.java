import java.util.Scanner;
import java.util.Stack;

class Student {
    int id;
    String name;
    double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String getRank() {
        if (marks < 5.0) return "Fail";
        else if (marks < 6.5) return "Medium";
        else if (marks < 7.5) return "Good";
        else if (marks < 9.0) return "Very Good";
        else return "Excellent";
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Marks: %.2f, Rank: %s", id, name, marks, getRank());
    }
}

class StudentStack {
    private Stack<Student> stack;

    public StudentStack() {
        stack = new Stack<>();
    }

    // Push a new student onto the stack
    public void push(Student student) {
        stack.push(student);
    }

    // Pop the top student from the stack
    public Student pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            System.out.println("Stack is empty.");
            return null;
        }
    }

    // Peek at the top student without removing
    public Student peek() {
        if (!stack.isEmpty()) {
            return stack.peek();
        } else {
            System.out.println("Stack is empty.");
            return null;
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Display all students from top to bottom
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
            // Restore original stack
            while (!tempStack.isEmpty()) {
                stack.push(tempStack.pop());
            }
        }
    }

    public static void main(String[] args) {
        StudentStack manager = new StudentStack();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add a student");
            System.out.println("2. Remove the last student");
            System.out.println("3. View the last student");
            System.out.println("4. Display all students");
            System.out.println("5. Check if stack is empty");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Add a student
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = scanner.nextDouble();
                    manager.push(new Student(id, name, marks));
                    System.out.println("Student added successfully!");
                    break;

                case 2: // Remove the last student
                    Student removedStudent = manager.pop();
                    if (removedStudent != null) {
                        System.out.println("Removed Student: " + removedStudent);
                    }
                    break;

                case 3: // View the last student
                    Student topStudent = manager.peek();
                    if (topStudent != null) {
                        System.out.println("Top Student: " + topStudent);
                    }
                    break;

                case 4: // Display all students
                    System.out.println("All students in the stack:");
                    manager.display();
                    break;

                case 5: // Check if stack is empty
                    System.out.println(manager.isEmpty() ? "The stack is empty." : "The stack is not empty.");
                    break;

                case 6: // Exit
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
