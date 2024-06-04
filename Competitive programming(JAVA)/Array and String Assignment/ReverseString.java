import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the string: ");
        String original = input.nextLine();

        System.out.println("Expected Output:");
        System.out.print("The characters of the string in reverse are: ");

        for (int i = original.length() - 1; i >= 0; i--) {
            System.out.print(original.charAt(i));
        }
        input.close();
    }
}
