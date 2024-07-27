// Coffee.java
/**
 * Coffee interface defines the common operations for concrete coffee objects and decorators.
 */
public interface Coffee {
    /**
     * Gets the description of the coffee.
     * @return Description of the coffee.
     */
    String getDescription();

    /**
     * Calculates the cost of the coffee.
     * @return Cost of the coffee.
     */
    double cost();
}
