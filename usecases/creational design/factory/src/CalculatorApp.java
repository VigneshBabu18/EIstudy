// CalculatorApp.java
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the operation
        System.out.println("Enter operation (add, subtract, multiply, divide):");
        String operationType = scanner.nextLine();

        // Get user input for numbers
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        try {
            // Create the operation using the factory
            Operation operation = OperationFactory.getOperation(operationType);
            // Perform the calculation
            double result = operation.calculate(num1, num2);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
