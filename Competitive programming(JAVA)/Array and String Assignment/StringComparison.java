import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the 1st string :");
        String string1 = input.nextLine();

        System.out.println("Input the 2nd string :");
        String string2 = input.nextLine();

        // Compare the strings without using library functions
        if (areEqual(string1, string2)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
        input.close();
    }

    // Custom function to compare two strings without library functions
    public static boolean areEqual(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
