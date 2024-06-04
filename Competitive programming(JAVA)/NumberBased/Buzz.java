import java.util.Scanner;

public class Buzz {
  public static void main(String[] args) {
    int a, n;
    System.out.println("Enter the number");
    Scanner sl = new Scanner(System.in);
    a = sl.nextInt();
    n = a % 10;
    if (a % 7 == 0  &&  n  == 7) {
      System.out.println("This is Buzz number");
    } else {

      System.out.println("Not a Buzz number");
    }
  }
}
