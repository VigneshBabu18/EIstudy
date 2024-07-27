// File: ShoppingCart.java
// Package: observer


import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements Subject {
    private List<Observer> observers;
    private double total;
    private boolean canCheckout;

    public ShoppingCart() {
        observers = new ArrayList<>();
        total = 0.0;
        canCheckout = false;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void addItem(double price) {
        total += price;
        canCheckout = true;
        notifyObservers();
    }

    public void removeItem(double price) {
        total -= price;
        if (total <= 0) {
            total = 0;
            canCheckout = false;
        }
        notifyObservers();
    }

    public double getTotal() {
        return total;
    }

    public boolean canCheckout() {
        return canCheckout;
    }
}
