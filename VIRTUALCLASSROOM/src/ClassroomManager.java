import java.util.HashMap;
import java.util.Map;

public class ClassroomManager {
    // Static variable to hold the single instance of ClassroomManager (Singleton pattern)
    private static ClassroomManager instance;
    
    // Map to store classrooms, with class names as keys and Classroom objects as values
    private Map<String, Classroom> classrooms = new HashMap<>();

    // Private constructor to prevent instantiation from outside
    private ClassroomManager() {}

    // Static method to get the single instance of ClassroomManager
    public static synchronized ClassroomManager getInstance() {
        if (instance == null) {
            instance = new ClassroomManager();
        }
        return instance;
    }

    // Method to add a new classroom based on the provided command string
    public void addClassroom(String command) {
        String[] parts = command.split(" ", 2);
        if (parts.length < 2) {
            System.out.println("Usage: add_classroom [Class Name]");
            return;
        }
        String className = parts[1];
        if (classrooms.containsKey(className)) {
            System.out.println("Classroom already exists.");
            return;
        }
        // Create and add a new Classroom object to the map
        classrooms.put(className, new Classroom(className));
        System.out.println("Classroom " + className + " has been created.");
    }

    // Method to add a student to a specified classroom based on the provided command string
    public void addStudent(String command) {
        String[] parts = command.split(" ", 3);
        if (parts.length < 3) {
            System.out.println("Usage: add_student [Student ID] [Class Name]");
            return;
        }
        String studentId = parts[1];
        String className = parts[2];
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            System.out.println("Classroom does not exist.");
            return;
        }
        if (classroom.getStudent(studentId) != null) {
            System.out.println("Student already enrolled in the class.");
            return;
        }
        // Create a new Student object and add it to the classroom
        Student student = new Student(studentId);
        classroom.addStudent(student);
        System.out.println("Student " + studentId + " has been enrolled in " + className + ".");
    }

    // Method to schedule an assignment for a specified classroom based on the provided command string
    public void scheduleAssignment(String command) {
        String[] parts = command.split(" ", 3);
        if (parts.length < 3) {
            System.out.println("Usage: schedule_assignment [Class Name] [Assignment Details]");
            return;
        }
        String className = parts[1];
        String assignmentDetails = parts[2];
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            System.out.println("Classroom does not exist.");
            return;
        }
        // Schedule the assignment for the classroom
        classroom.scheduleAssignment(assignmentDetails);
        System.out.println("Assignment for " + className + " has been scheduled.");
    }
    
    // Method to submit an assignment for a student in a specified classroom based on the provided command string
    public void submitAssignment(String command) {
        String[] parts = command.split(" ", 4);
        if (parts.length < 4) {
            System.out.println("Usage: submit_assignment [Student ID] [Class Name] [Assignment Details]");
            return;
        }
        String studentId = parts[1];
        String className = parts[2];
        String assignmentDetails = parts[3];
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            System.out.println("Classroom does not exist.");
            return;
        }
        Student student = classroom.getStudent(studentId);
        if (student == null) {
            System.out.println("Student is not enrolled in the class.");
            return;
        }
        // Submit the assignment for the student
        student.submitAssignment(assignmentDetails);
        System.out.println("Assignment submitted by Student " + studentId + " in " + className + ".");
    }

    // Method to list all classrooms along with their students and assignments
    public void listClassrooms() {
        if (classrooms.isEmpty()) {
            System.out.println("No classrooms available.");
        } else {
            for (Classroom classroom : classrooms.values()) {
                // Print details of each classroom
                System.out.println("Classroom: " + classroom.getName());
                System.out.println("Students: " + classroom.getStudents());
                System.out.println("Assignments: " + classroom.getAssignments());
            }
        }
    }
}
