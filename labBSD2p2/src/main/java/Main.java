//Trần Đặng Minh Quân - SE180398
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Get Student");
            System.out.println("0. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter Student ID:");
                    String addStudentId = scanner.nextLine();
                    System.out.println("Enter Student Name:");
                    String addStudentName = scanner.nextLine();
                    Student newStudent = new Student(addStudentId, addStudentName);
                    studentManager.addStudent(newStudent);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.println("Enter Student ID to remove:");
                    String removeStudentId = scanner.nextLine();
                    studentManager.removeStudent(removeStudentId);
                    System.out.println("Student removed successfully.");
                    break;

                case 3:
                    studentManager.displayAllStudent();
                    break;

                case 4:
                    System.out.println("Enter Student ID to retrieve:");
                    String getStudentId = scanner.nextLine();
                    Student student = studentManager.getStudent(getStudentId);
                    if (student != null) {
                        System.out.println("Student found - ID: " + student.getStudentID() + ", Name: " + student.getStudentName());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid operation.");
                    break;
            }
            System.out.println();
        }
    }
}
