// File: CheckoutButton.java
// Package: observer


public class CheckoutButton implements Observer {
    private ShoppingCart cart;

    public CheckoutButton(ShoppingCart cart) {
        this.cart = cart;
        cart.registerObserver(this);
    }

    @Override
    public void update() {
        if (cart.canCheckout()) {
            System.out.println("Checkout button enabled.");
        } else {
            System.out.println("Checkout button disabled.");
        }
    }
}
