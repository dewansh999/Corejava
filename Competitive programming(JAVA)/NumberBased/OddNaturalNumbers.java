import java.util.Scanner;

public class OddNaturalNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input number of terms: ");
    int n = scanner.nextInt();

    System.out.println("The odd numbers are :");
    int sum = 0;
    for (int i = 1; i <= 2 * n; i += 2) {
      System.out.println(i);
      sum += i;
    }

    System.out.println("The Sum of odd Natural Number up to " + n + " terms is: " + sum); // Printing the sum
    scanner.close();
  }
}
