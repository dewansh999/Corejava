import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Calculate the factorial
        long factorial = calculateFactorial(num);

        // Display the result
        System.out.println("The factorial of " + num + " is: " + factorial);

        // Close the scanner
        scanner.close();
    }

    // Function to calculate the factorial of a number
    public static long calculateFactorial(int number) {
        if (number < 0) {
            return -1; // Factorial is not defined for negative numbers
        }
        if (number == 0 || number == 1) {
            return 1; // Factorial of 0 and 1 is 1
        }

        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
