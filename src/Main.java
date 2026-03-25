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
    private List<Student> students;

    public AttendanceManager() {
        students = new ArrayList<>();
    }

    public void addStudent(String id, String name) {
        students.add(new Student(id, name));
        System.out.println("Student added successfully!");
    }

    public void markDailyAttendance(Scanner scanner) {
        if (students.isEmpty()) {
            System.out.println("No students in the system.");
            return;
        }
    }
}
public class Main {
    public static void main(String[] args) {
  }
}
