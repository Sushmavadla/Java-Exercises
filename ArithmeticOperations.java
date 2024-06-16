package junefirstweek;
import java.util.*;
public class ArithmeticOperations {
	public static void performOperation(double num1, double num2, String operation) {
        double result=0;
        boolean validOperation = true;
        switch (operation) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Division by zero is not allowed.");
                 
                }
                break;
            default:
                System.out.println("Invalid operation specified.");
                validOperation = false;
                break;
        }

        // Display the result if the operation is valid
        if (validOperation==true) {
            System.out.println("The result of the operation is: " + result);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user inputs
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        System.out.print("Enter the operation (add, subtract, multiply, divide): ");
        String operation = scanner.next();

        // Performing the operation
        performOperation(number1, number2, operation);

        scanner.close();
    }

}
