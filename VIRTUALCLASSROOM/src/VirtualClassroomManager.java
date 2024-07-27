import java.util.Scanner;

// VirtualClassroomManager is the main class that handles user interactions and commands for the virtual classroom system.
public class VirtualClassroomManager {
    // Private fields for managing the classroom and reading user input
    private ClassroomManager classroomManager = ClassroomManager.getInstance(); // Singleton instance of ClassroomManager
    private Scanner scanner = new Scanner(System.in); // Scanner object to read user input from the console

    // The main method serves as the entry point for the application
    public static void main(String[] args) {
        VirtualClassroomManager manager = new VirtualClassroomManager(); // Create an instance of VirtualClassroomManager
        manager.processCommands(); // Start processing commands
    }

    // Method to continuously prompt for and process commands
    private void processCommands() {
        while (true) { // Infinite loop to keep processing commands until 'exit' is entered
            String command = promptForCommand(); // Prompt user for a command and store it
            if (command.equals("exit")) { // Check if the command is 'exit'
                System.out.println("Exiting..."); // Print an exit message
                break; // Exit the loop and terminate the program
            }
            handleCommand(command); // Handle the entered command
        }
    }

    // Method to prompt the user for a command
    private String promptForCommand() {
        System.out.println("Enter command:"); // Ask user to enter a command
        return scanner.nextLine(); // Read and return the user's input
    }

    // Method to handle the entered command
    private void handleCommand(String command) {
        Command cmd = createCommand(command); // Create a Command object based on the user input
        if (cmd != null) { // Check if the command was successfully created
            try {
                cmd.execute(); // Execute the command
            } catch (Exception e) { // Catch any exceptions thrown during command execution
                System.out.println("Error: " + e.getMessage()); // Print error message
            }
        } else { // If no valid command was created
            System.out.println("Unknown command."); // Inform user that the command is unknown
        }
    }

    // Method to create the appropriate Command object based on the user input
    private Command createCommand(String command) {
        if (command.startsWith("add_classroom")) { // Check if the command starts with 'add_classroom'
            return new AddClassroomCommand(classroomManager, command); // Return an AddClassroomCommand object
        } else if (command.startsWith("add_student")) { // Check if the command starts with 'add_student'
            return new AddStudentCommand(classroomManager, command); // Return an AddStudentCommand object
        } else if (command.startsWith("schedule_assignment")) { // Check if the command starts with 'schedule_assignment'
            return new ScheduleAssignmentCommand(classroomManager, command); // Return a ScheduleAssignmentCommand object
        } else if (command.startsWith("submit_assignment")) { // Check if the command starts with 'submit_assignment'
            return new SubmitAssignmentCommand(classroomManager, command); // Return a SubmitAssignmentCommand object
        } else if (command.equals("list_classrooms")) { // Check if the command is 'list_classrooms'
            return new ListClassroomsCommand(classroomManager); // Return a ListClassroomsCommand object
        }
        return null; // If no matching command is found, return null
    }
}
