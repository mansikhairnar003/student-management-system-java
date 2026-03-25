package student;

import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();
        while (true) {
            System.out.println("\n=== Student Management ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    dao.addStudent(new Student(name, email));
                    break;
                case 2:
                    List<Student> students = dao.getAllStudents();
                    System.out.println("\n--- All Students ---");
                    for (Student s : students) {
                        System.out.println(s.getId() + ": " + s.getName() + " | " + s.getEmail());
                    }
                    break;
                case 3:
                    System.out.println("👋 Bye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
