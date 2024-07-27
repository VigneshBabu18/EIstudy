// MilkDecorator.java
/**
 * MilkDecorator adds milk to the coffee.
 * It extends the CoffeeDecorator class and adds its own functionality.
 */
public class MilkDecorator extends CoffeeDecorator {
    /**
     * Constructs a MilkDecorator with the specified Coffee object.
     * @param coffee The Coffee object to be decorated.
     */
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return coffee.cost() + 1.0; // Adds the cost of milk
    }
}
