import java.util.*;
abstract class Person {
    private String id;
    private String name;
    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
   public abstract void displayInfo();
}
class Student extends Person {
    private int totalClasses;
    private int attendedClasses;
    public Student(String id, String name) {
        super(id, name);
        this.totalClasses = 0;
        this.attendedClasses = 0;
    }
    public void markAttendance(boolean isPresent) {
        this.totalClasses++;
        if (isPresent) {
            this.attendedClasses++;
        }
    }
    public double getAttendancePercentage() {
        if (totalClasses == 0) return 0.0;
        return ((double) attendedClasses / totalClasses) * 100;
    }
    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId() + 
                   " | Name: " + getName() + 
                   " | Attendance: " + attendedClasses + "/" + totalClasses + 
                   " (" + getAttendancePercentage() + "%)");
    }
}
class AttendanceManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(String id, String name) {
        if (id.isEmpty() || name.isEmpty()) {
            throw new IllegalArgumentException("ID or Name cannot be empty!");
        }
        students.add(new Student(id, name));
        System.out.println("Student added successfully!");
    }
    public void markDailyAttendance(Scanner scanner) {
        if (students.isEmpty()) {
            System.out.println("No students in the system.");
            return;
        }
         System.out.println("\n--- Marking Attendance ---");
        for (Student student : students) {
            while (true) {
                try {
                    System.out.print("Is " + student.getName() + " (ID: " + student.getId() + ") present? (y/n): ");
                    String input = scanner.nextLine().trim().toLowerCase();
                    if (!input.equals("y") && !input.equals("n")) {
                        throw new Exception("Invalid input! Enter 'y' or 'n'.");
                    }
                    student.markAttendance(input.equals("y"));
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
    }
    System.out.println("Attendance marked for all students.");        
}
 public void generateReport() {
        System.out.println("\n--- Attendance Report ---");
        if (students.isEmpty()) {
            System.out.println("No records found.");
            return;
        }
        for (Student student : students) {
            student.displayInfo();
        }
    }
}
public class Main {
    public static void main(String[] args) {
         System.out.println("Welcome to the Student Attendance System");

        while (true) {
            try {
                System.out.println("\n1. Add New Student");
                System.out.println("2. Mark Daily Attendance");
                System.out.println("3. View Attendance Report");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        try {
                            System.out.print("Enter Student ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Enter Student Name: ");
                            String name = scanner.nextLine();
                            manager.addStudent(id, name);
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 2:
                        manager.markDailyAttendance(scanner);
                        break;
                    case 3:
                        manager.generateReport();
                        break;
                    case 4:
                        System.out.println("Exiting System. Goodbye!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number (1-4).");
            }
        }
  }
}
