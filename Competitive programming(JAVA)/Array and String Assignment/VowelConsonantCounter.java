import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input a string from the user
        System.out.print("Input the string: ");
        String inputString = input.nextLine().toLowerCase(); // Convert the string to lowercase for easier comparison

        int vowelCount = 0;
        int consonantCount = 0;

        // Iterate through each character in the string
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        // Output the results
        System.out.println("The total number of vowel in the string is: " + vowelCount);
        System.out.println("The total number of consonant in the string is: " + consonantCount);

        input.close();
    }
}
