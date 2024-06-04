import java.util.Scanner;

public class NumberCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer value: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int product = 1;
            int sum = 0;

            while (number != 0) {
                int digit = number % 10;
                sum += digit;
                product *= digit;
                number /= 10;
            }

            System.out.println("The difference between the product and sum of digits is: " + (product - sum));
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        scanner.close();
    }
}
