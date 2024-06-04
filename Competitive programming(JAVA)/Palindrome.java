public class Palindrome {
    public static void main(String[] args) {

        // Original string
        String originalStr = "NAMAN";

        // String to store the reversed version
        String reversedStr = "";

        // Reversing the original string
        for (int i = originalStr.length() - 1; i >= 0; i--) {
            char ch = originalStr.charAt(i);
            reversedStr = reversedStr + ch;
        }

        // Printing the reversed string
        System.out.println("Reversed string: " + reversedStr);

        // Checking if the original string is equal to its reversed version
        if (originalStr.equals(reversedStr)) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }
}
