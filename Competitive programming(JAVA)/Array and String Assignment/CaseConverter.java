import java.util.Scanner;

public class CaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the string: ");
        String input = scanner.nextLine();

        String convertedString = convertCase(input);

        System.out.println("The given sentence is : " + input);
        System.out.println("After Case changed the string is: " + convertedString);
        scanner.close();
    }

    public static String convertCase(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            }
        }
        return new String(chars);
    }
}
