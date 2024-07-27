// File: VariableFineStrategy.java
// Package declaration should match your directory structure
package lib;

// VariableFineStrategy: Variable fine based on book type
public class VariableFineStrategy implements FineStrategy {
    private double fictionFinePerDay;
    private double nonFictionFinePerDay;

    // Constructor to initialize fines for different book types
    public VariableFineStrategy(double fictionFinePerDay, double nonFictionFinePerDay) {
        this.fictionFinePerDay = fictionFinePerDay;
        this.nonFictionFinePerDay = nonFictionFinePerDay;
    }

    @Override
    public double calculateFine(int overdueDays, String bookType) {
        // Calculate fine based on book type
        if (bookType.equalsIgnoreCase("fiction")) {
            return fictionFinePerDay * overdueDays;
        } else if (bookType.equalsIgnoreCase("non-fiction")) {
            return nonFictionFinePerDay * overdueDays;
        } else {
            return 0; // Default to 0 if book type is unknown
        }
    }
}
