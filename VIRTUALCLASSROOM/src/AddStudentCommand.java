public class AddStudentCommand implements Command {
    private ClassroomManager classroomManager;
    private String command;

    public AddStudentCommand(ClassroomManager classroomManager, String command) {
        this.classroomManager = classroomManager;
        this.command = command;
    }

    @Override
    public void execute() {
        classroomManager.addStudent(command);
    }
}
