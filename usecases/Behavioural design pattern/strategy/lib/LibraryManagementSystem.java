// File: LibraryManagementSystem.java
// Behaviour pattern -Strategy pattern method
package lib;

import java.util.Scanner;

// Main Class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryContext libraryContext = new LibraryContext();
        Scanner scanner = new Scanner(System.in);

        // Initialize strategies with different fine models
        FineStrategy fixedFine = new FixedFineStrategy(1.5); // $1.5 per day
        FineStrategy variableFine = new VariableFineStrategy(2.0, 1.0); // Fiction $2/day, Non-Fiction $1/day
        FineStrategy subscriptionFine = new SubscriptionFineStrategy(); // No fine for subscribers

        // Show available strategies to the user
        System.out.println("Library Management System");
        System.out.println("Choose Fine Strategy:");
        System.out.println("1. Fixed Fine");
        System.out.println("2. Variable Fine");
        System.out.println("3. Subscription");

        // Get user choice for the fine strategy
        int choice = scanner.nextInt();
        FineStrategy selectedStrategy;

        // Select the strategy based on user input
        switch (choice) {
            case 1:
                selectedStrategy = fixedFine;
                break;
            case 2:
                selectedStrategy = variableFine;
                break;
            case 3:
                selectedStrategy = subscriptionFine;
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Fixed Fine.");
                selectedStrategy = fixedFine;
                break;
        }

        // Set the selected strategy in the context
        libraryContext.setFineStrategy(selectedStrategy);

        // Collect book type and overdue days dynamically
        System.out.println("Enter the book type (e.g., fiction, non-fiction):");
        scanner.nextLine(); // Consume newline left-over
        String bookType = scanner.nextLine();

        System.out.println("Enter overdue days:");
        int overdueDays = scanner.nextInt();

        // Calculate and display the fine using the selected strategy
        double fine = libraryContext.calculateFine(overdueDays, bookType);
        System.out.println("Total fine: $" + fine);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
