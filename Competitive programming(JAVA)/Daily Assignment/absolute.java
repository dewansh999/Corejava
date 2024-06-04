import java.util.Scanner; // Import Scanner class for user input

public class absolute {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

    System.out.print("Enter a number: ");
    int number = scanner.nextInt(); // Read user input as integer

    int reversedNumber = reverseNumber(number); // Call reverseNumber method to reverse the number
    int absoluteDifference = Math.abs(number - reversedNumber); // Calculate absolute difference

    System.out.println("Reversed Number: " + reversedNumber);
    System.out.println("Absolute Difference: " + absoluteDifference);
  }

  // Method to reverse the digits of a number
  public static int reverseNumber(int number) {
    int reversedNumber = 0;
    while (number != 0) {
      int digit = number % 10; // Get the last digit of the number
      reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
      number /= 10; // Remove the last digit from the original number
    }
    return reversedNumber;
  }
}
