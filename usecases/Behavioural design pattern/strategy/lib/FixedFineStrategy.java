// File: FixedFineStrategy.java
// Package declaration should match your directory structure
package lib;

// FixedFineStrategy: A fixed fine per day
public class FixedFineStrategy implements FineStrategy {
    private double finePerDay;

    // Constructor to initialize the fixed fine per day
    public FixedFineStrategy(double finePerDay) {
        this.finePerDay = finePerDay;
    }

    @Override
    public double calculateFine(int overdueDays, String bookType) {
        // Calculate fine as a fixed rate per day
        return finePerDay * overdueDays;
    }
}
