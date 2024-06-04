import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        scanner.close();
        // Calculate the result
        double result;
        if (num1 == num2) {
            result = num1 + num2;
        } else {
            result = 2 * (num1 + num2);
        }

        // Display the result
        System.out.println("The result is: " + result);
    }
}
