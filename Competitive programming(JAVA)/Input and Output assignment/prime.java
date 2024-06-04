// import java.util.Scanner;

// public class prime {
// public static void main(String[] args) {
// int n = 0, factorial = 0;
// Scanner sk = new Scanner(System.in);
// n = sk.nextInt();
// for (int i = 0; i <= n; i++) {
// if (n % i == 0) {
// factorial++;
// }
// }
// if (factorial == 2) {
// System.out.println("This is prime no.");
// } else {
// System.out.println("Not a prime number");
// }
// sk.close();
// }
// }
import java.util.Scanner;

public class prime {
  public static void main(String[] args) {
    int n, factors = 0;
    Scanner sk = new Scanner(System.in);
    System.out.print("Enter a number: ");
    n = sk.nextInt();
    sk.close();

    if (n <= 1) {
      System.out.println("Not a prime number");
      return;
    }

    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        factors++;
        break; // Exit the loop as soon as a factor is found
      }
    }

    if (factors == 0) {
      System.out.println("This is a prime number");
    } else {
      System.out.println("Not a prime number");
    }
  }
}
