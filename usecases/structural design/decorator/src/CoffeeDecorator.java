// CoffeeDecorator.java
/**
 * CoffeeDecorator is an abstract class that implements the Coffee interface.
 * It contains a reference to a Coffee object and delegates calls to this object.
 */
public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    /**
     * Constructs a CoffeeDecorator with the specified Coffee object.
     * @param coffee The Coffee object to be decorated.
     */
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double cost() {
        return coffee.cost();
    }
}
