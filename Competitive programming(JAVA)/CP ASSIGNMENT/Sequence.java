import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the sequence: ");
        int n = scanner.nextInt();

        // Generate and display the geometric sequence
        System.out.println("Geometric Sequence:");
        for (int i = 0; i < n; i++) {
            int term = (int) Math.pow(2, i);
            System.out.print(term);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
