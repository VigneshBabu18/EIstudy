// File: ShoppingCartApp.java
// Package: observer


import java.util.Scanner;

public class ShoppingCartApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        // Create observer objects
        CartTotalDisplay totalDisplay = new CartTotalDisplay(cart);
        CheckoutButton checkoutButton = new CheckoutButton(cart);
        ItemAvailabilityChecker availabilityChecker = new ItemAvailabilityChecker(cart);
        
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter item price: $");
                    double priceToAdd = scanner.nextDouble();
                    cart.addItem(priceToAdd);
                    break;
                case 2:
                    System.out.print("Enter item price: $");
                    double priceToRemove = scanner.nextDouble();
                    cart.removeItem(priceToRemove);
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
        
        scanner.close();
    }
}
