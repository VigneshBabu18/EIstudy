// File: SubscriptionFineStrategy.java
// Package declaration should match your directory structure
package lib;

// SubscriptionFineStrategy: No fine for subscribers
public class SubscriptionFineStrategy implements FineStrategy {
    @Override
    public double calculateFine(int overdueDays, String bookType) {
        // No fine for subscribers
        return 0;
    }
}
