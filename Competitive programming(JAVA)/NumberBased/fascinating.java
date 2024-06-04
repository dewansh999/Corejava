import java.util.Scanner;

public class fascinating {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    int t, r;
    t = number * 2;
    r = number * 3;
    String s = number + Integer.toString(t) + Integer.toString(r);
    int num = Integer.parseInt(s);
    System.out.println(num);
    int A[] = new int[10];
    while (num != 0) {
      int rm = num % 10;
      A[rm]++;
      num = num / 10;
    }
    System.out.println("Frequency of all numbers:");
    for (int i = 1; i < A.length; i++) {
      if (A[i] == 1) {

        System.out.printf("\nFrequency of %d : %d", i, A[i]);
      }
    }
    System.out.println("frequency of 1 " + A[1]);

  }
}