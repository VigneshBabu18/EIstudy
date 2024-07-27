import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classroom {
    private String name;
    private Map<String, Student> students = new HashMap<>();
    private List<String> assignments = new ArrayList<>();

    public Classroom(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public Student getStudent(String id) {
        return students.get(id);
    }

    public void scheduleAssignment(String assignment) {
        assignments.add(assignment);
    }

    public List<String> getAssignments() {
        return assignments;
    }

    public Map<String, Student> getStudents() {
        return students;
    }
}
