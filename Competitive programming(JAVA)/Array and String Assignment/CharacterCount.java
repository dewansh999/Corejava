import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        // Create a Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the string: ");
        String inputString = scanner.nextLine();

        // Initialize counts for alphabets, digits, and special characters
        int alphabetCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;

        // Iterate through each character in the input string
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (Character.isLetter(ch)) {
                // Check if the character is an alphabet
                alphabetCount++;
            } else if (Character.isDigit(ch)) {
                // Check if the character is a digit
                digitCount++;
            } else {
                // If it's not an alphabet or a digit, consider it a special character
                specialCharCount++;
            }
        }

        // Display the results
        System.out.println("Number of Alphabets in the string is : " + alphabetCount);
        System.out.println("Number of Digits in the string is : " + digitCount);
        System.out.println("Number of Special characters in the string is : " + specialCharCount);

        // Close the scanner
        scanner.close();
    }
}
