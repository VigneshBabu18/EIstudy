public class ListClassroomsCommand implements Command {
    // Field to hold the reference to the ClassroomManager instance
    private ClassroomManager classroomManager;

    // Constructor to initialize the ListClassroomsCommand with a ClassroomManager
    public ListClassroomsCommand(ClassroomManager classroomManager) {
        this.classroomManager = classroomManager;
    }

    // Implementation of the execute method from the Command interface
    @Override
    public void execute() {
        // Call the listClassrooms method on the ClassroomManager instance
        // to list all classrooms
        classroomManager.listClassrooms();
    }
}
