public class Stringreverse {

    public static void main(String[] args) {
        // Initialize the original string
        String originalStr = "ABCDE";
        String reversedStr = ""; // Initialize the reversed string as an empty string

        // Loop through the original string in reverse order
        for (int i = originalStr.length() - 1; i >= 0; i--) {
            char ch = originalStr.charAt(i); // Get the current character
            reversedStr = reversedStr + ch; // Add the character to the reversed string
        }

        // Another way to reverse the string using string concatenation
        // for (int i = 0; i < originalStr.length(); i++) {
        // reversedStr = originalStr.charAt(i) + reversedStr;
        // }

        System.out.println("Reversed string: " + reversedStr); // Print the reversed string
    }
}