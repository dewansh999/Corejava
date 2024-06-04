
import java.util.Scanner;

public class At {
  public static void main(String[] args) {
    int a, n, k;
    System.out.println("Enter the number");
    Scanner sl = new Scanner(System.in);
    a = sl.nextInt();
    n = a * a;
    k = n % 100;
    if (k == a) {
      System.out.println("Automorphic");
    } else {
      System.out.println("Not Automorphic");
    }
  }
}