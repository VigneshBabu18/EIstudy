import java.util.ArrayList;
import java.util.List;

public class Student {
    // Field to store the student's unique identifier
    private String id;
    
    // List to keep track of assignments submitted by the student
    private List<String> submittedAssignments = new ArrayList<>();

    // Constructor to initialize a Student object with an ID
    public Student(String id) {
        this.id = id;
    }

    // Getter method for retrieving the student's ID
    public String getId() {
        return id;
    }

    // Method to add a submitted assignment to the list
    public void submitAssignment(String assignment) {
        submittedAssignments.add(assignment);
    }

    // Override toString() method to return the student's ID as a string
    @Override
    public String toString() {
        return id;
    }
}
