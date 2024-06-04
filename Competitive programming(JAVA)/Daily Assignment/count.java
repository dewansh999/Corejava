import java.util.Scanner;

public class count {
  public static void main(String[] args) {
    int n, c = 0;
    System.out.println("Enter the number");
    Scanner sl = new Scanner(System.in);
    n = sl.nextInt();
    while (n != 0) {
      int l = n % 10;
      c++;
      if (l % 2 == 1) {
        System.out.println("The number contains odd number of digits");
      }
      n = n / 10;
    }
    System.out.println("Number of digits " + c);
  }
}
