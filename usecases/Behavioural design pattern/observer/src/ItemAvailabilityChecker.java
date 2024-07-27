// File: ItemAvailabilityChecker.java
// Package: observer

public class ItemAvailabilityChecker implements Observer {
    private ShoppingCart cart;

    public ItemAvailabilityChecker(ShoppingCart cart) {
        this.cart = cart;
        cart.registerObserver(this);
    }

    @Override
    public void update() {
        // In a real application, you might check availability from a database or API.
        // For simplicity, we just print a message here.
        System.out.println("Checking item availability...");
    }
}
