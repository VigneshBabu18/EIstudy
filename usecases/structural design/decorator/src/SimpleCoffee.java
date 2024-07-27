// SimpleCoffee.java
/**
 * SimpleCoffee is a concrete implementation of the Coffee interface.
 * It represents a basic coffee without any added features.
 */
public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
