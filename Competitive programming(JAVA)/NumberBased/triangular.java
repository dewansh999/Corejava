import java.util.Scanner;

public class triangular {
  public static void main(String[] args) {
    System.out.println("Enter the value of n:");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    System.out.println("Triangular numbers from 3 to " + n + ":");

    for (int i = 3; i <= n; i++) {
      int triangularNumber = calculateTriangularNumber(i);

      System.out.println(triangularNumber);
    }

    scanner.close();
  }

  private static int calculateTriangularNumber(int n) {
    return n * (n + 1) / 2;
  }
}
