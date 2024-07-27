// File: FineStrategy.java
// Package declaration should match your directory structure
package lib;

// FineStrategy Interface
public interface FineStrategy {
    // Method to calculate fine based on overdue days and book type
    double calculateFine(int overdueDays, String bookType);
}
