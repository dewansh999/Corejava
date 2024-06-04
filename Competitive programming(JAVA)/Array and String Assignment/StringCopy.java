public class StringCopy {
    public static void main(String[] args) {
        // Input string
        String inputString = "This is a string to be copied";

        // Create a character array to store the copied string
        char[] copiedString = new char[inputString.length()];

        // Copy the characters from the input string to the copied string
        for (int i = 0; i < inputString.length(); i++) {
            copiedString[i] = inputString.charAt(i);
        }

        // Create a new string from the character array
        String copiedStringResult = new String(copiedString);

        // Display the original and copied strings
        System.out.println("The First string is: " + inputString);
        System.out.println("The Second string is: " + copiedStringResult);
        System.out.println("Number of characters copied: " + inputString.length());
    }
}
