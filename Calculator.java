import java.util.Scanner;

public class Calculator {

    // Addition method
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction method
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication method
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division method with zero check
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("⚠️ Error: Division by zero is not allowed.");
            return Double.NaN; // Not a Number
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalc = true;

        System.out.println("=== Java Console Calculator ===");

        while (continueCalc) {
            System.out.print("\nEnter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;
            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("❌ Invalid operator!");
                    continue;
            }

            if (!Double.isNaN(result)) {
                System.out.println("✅ Result: " + result);
            }

            System.out.print("\nDo you want to perform another calculation? (yes/no): ");
            String choice = scanner.next().toLowerCase();
            continueCalc = choice.equals("yes") || choice.equals("y");
        }

        System.out.println("\n🔚 Calculator closed. Thank you!");
        scanner.close();
    }
}
