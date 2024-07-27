public class AddClassroomCommand implements Command {
    // Field to hold the reference to the ClassroomManager instance
    private ClassroomManager classroomManager;
    
    // Field to store the command string containing details for adding a classroom
    private String command;

    // Constructor to initialize the AddClassroomCommand with a ClassroomManager and command
    public AddClassroomCommand(ClassroomManager classroomManager, String command) {
        this.classroomManager = classroomManager;
        this.command = command;
    }

    // Implementation of the execute method from the Command interface
    @Override
    public void execute() {
        // Call the addClassroom method on the ClassroomManager instance
        // to add a classroom using the details provided in the command
        classroomManager.addClassroom(command);
    }
}
