import java.util.Scanner;

public class Evilno {
  public static void main(String[] args) {
    // Prompt the user to enter a number
    System.out.println("Enter any number:");

    // Create an array to store the binary digits
    int[] binaryDigits = new int[20];

    // Create a Scanner object to read user input
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int index = 0;

    // Convert the decimal number to binary
    while (number != 0) {
      int remainder = number % 2;
      binaryDigits[index++] = remainder;
      number = number / 2;
    }

    // Print the binary number
    System.out.println("Binary number:");
    for (int i = index - 1; i >= 0; i--) {
      System.out.print(binaryDigits[i]);
    }

    // Close the Scanner object
    scanner.close();
  }
}
