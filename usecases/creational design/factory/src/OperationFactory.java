// OperationFactory.java
public class OperationFactory {
    public static Operation getOperation(String operationType) {
        switch (operationType) {
            case "add":
                return new Addition();
            case "subtract":
                return new Subtraction();
            case "multiply":
                return new Multiplication();
            case "divide":
                return new Division();
            default:
                throw new IllegalArgumentException("Invalid operation type");
        }
    }
}
