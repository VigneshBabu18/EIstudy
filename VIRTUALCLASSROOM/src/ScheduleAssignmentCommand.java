public class ScheduleAssignmentCommand implements Command {
    // Field to hold the reference to the ClassroomManager instance
    private ClassroomManager classroomManager;
    
    // Field to store the command string containing details for scheduling the assignment
    private String command;

    // Constructor to initialize the ScheduleAssignmentCommand with a ClassroomManager and command
    public ScheduleAssignmentCommand(ClassroomManager classroomManager, String command) {
        this.classroomManager = classroomManager;
        this.command = command;
    }

    // Implementation of the execute method from the Command interface
    @Override
    public void execute() {
        // Call the scheduleAssignment method on the ClassroomManager instance
        // to schedule an assignment using the details provided in the command
        classroomManager.scheduleAssignment(command);
    }
}
