import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        System.out.println("Simple Calculator");
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                scanner.close();
                return;
        }

        System.out.printf("Result: %.2f\n", result);
        scanner.close();
    }
}
