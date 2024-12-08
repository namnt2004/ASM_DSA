import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentFunctions manager = new StudentFunctions();
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
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = scanner.nextDouble();
                    manager.push(new Student(id, name, marks));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    Student removedStudent = manager.pop();
                    if (removedStudent != null) {
                        System.out.println("Removed Student: " + removedStudent);
                    }
                    break;

                case 3:
                    Student topStudent = manager.peek();
                    if (topStudent != null) {
                        System.out.println("Top Student: " + topStudent);
                    }
                    break;

                case 4:
                    System.out.println("All students in the stack:");
                    manager.display();
                    break;

                case 5:
                    System.out.println(manager.isEmpty() ? "The stack is empty." : "The stack is not empty.");
                    break;

                case 6:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
