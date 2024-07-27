// SugarDecorator.java
/**
 * SugarDecorator adds sugar to the coffee.
 * It extends the CoffeeDecorator class and adds its own functionality.
 */
public class SugarDecorator extends CoffeeDecorator {
    /**
     * Constructs a SugarDecorator with the specified Coffee object.
     * @param coffee The Coffee object to be decorated.
     */
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5; // Adds the cost of sugar
    }
}
