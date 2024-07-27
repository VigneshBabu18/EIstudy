// File: CartTotalDisplay.java
// Package: observer


public class CartTotalDisplay implements Observer {
    private ShoppingCart cart;

    public CartTotalDisplay(ShoppingCart cart) {
        this.cart = cart;
        cart.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Cart total: $" + cart.getTotal());
    }
}
