import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Input the string: ");
        String inputString = scanner.nextLine();

        // Counting words
        int wordCount = countWords(inputString);

        // Output
        System.out.println("Total number of words in the string is : " + wordCount);
        scanner.close();
    }

    // Function to count words in a string
    public static int countWords(String str) {
        String[] words = str.split("\\s+"); // Split the string by spaces
        return words.length;
    }
}
