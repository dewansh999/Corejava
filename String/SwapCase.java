
import java.util.Scanner;

public class SwapCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the string: ");
        String input = scanner.nextLine();
        String output = swapCase(input);
        System.out.println("The given sentence is: " + input);
        System.out.println("After Case changed the string is: " + output);
    }

    public static String swapCase(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}