import java.util.Scanner; // Import the Scanner class to read user input

public class cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input

        boolean doCalculate = true; // A flag to control the loop, initially set to true

        while (doCalculate) { // Start a loop that continues as long as doCalculate is true
            System.out.print("Enter first number: ");
            double num1 = scanner.nextInt(); // Read the first number from the user

            System.out.print("Enter operator (+, -, *, /): ");
            char operation = scanner.next().charAt(0); // Read the operator (+, -, *, /) from the user

            System.out.print("Enter second number: ");
            double num2 = scanner.nextInt(); // Read the second number from the user

            double result = 0; // Variable to store the result of the calculation

            switch (operation) { // Use a switch-case to perform the selected operation
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
                        continue; // Restart the loop to allow user to try again
                    }
                    break;
                default:
                    System.out.println("Invalid operator!");
                    continue; // Restart the loop to allow user to try again
            }

            System.out.println("Result: " + result); // Display the calculated result

            System.out.print("Do you want to calculate again? (Y/N): ");
            char choice = scanner.next().charAt(0); // Ask if the user wants to calculate again

            if (Character.toUpperCase(choice) == 'N') {
                doCalculate = false; // If the user enters 'N', set doCalculate to false to exit the loop
            }
        }

        scanner.close(); // Close the Scanner object to release resources
        System.out.println("Calculator program has been terminated."); // Display a termination message
    }
}
