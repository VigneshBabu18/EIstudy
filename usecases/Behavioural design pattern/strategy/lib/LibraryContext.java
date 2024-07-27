// File: LibraryContext.java
// Package declaration should match your directory structure
package lib;

// LibraryContext Class
public class LibraryContext {
    private FineStrategy fineStrategy;

    // Set the strategy for calculating fines
    public void setFineStrategy(FineStrategy fineStrategy) {
        this.fineStrategy = fineStrategy;
    }

    // Use the strategy to calculate the fine
    public double calculateFine(int overdueDays, String bookType) {
        return fineStrategy.calculateFine(overdueDays, bookType);
    }
}
