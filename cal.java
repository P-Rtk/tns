import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operation;

        boolean doCalculate = true;

        while (doCalculate) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            operation = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operator!");
                    continue;
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to calculate again? (Y/N): ");
            char choice = scanner.next().charAt(0);

            if (Character.toUpperCase(choice) == 'N') {
                doCalculate = false;
            }
        }

        scanner.close();
        System.out.println("Calculator program has been terminated.");
    }
}
