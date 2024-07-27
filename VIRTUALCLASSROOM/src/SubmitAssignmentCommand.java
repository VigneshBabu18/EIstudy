// Implementing the Command interface for handling the submission of assignments
public class SubmitAssignmentCommand implements Command {
    // Field to hold the reference to the ClassroomManager instance
    private ClassroomManager classroomManager;
    
    // Field to hold the command string, which likely contains the details of the submission
    private String command;

    // Constructor to initialize the fields with provided values
    public SubmitAssignmentCommand(ClassroomManager classroomManager, String command) {
        // Initialize the ClassroomManager instance
        this.classroomManager = classroomManager;
        // Initialize the command string
        this.command = command;
    }

    // Implementation of the execute method from the Command interface
    @Override
    public void execute() {
        // Call the submitAssignment method on the ClassroomManager instance
        // to handle the assignment submission using the provided command
        classroomManager.submitAssignment(command);
    }
}
