import java.util.Scanner;

public class SecondSmallestElement {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number of elements: ");
    int n = scanner.nextInt();

    int[] arr = new int[n];
    System.out.print("Input elements: ");
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;

    for (int i = 0; i < n; i++) {
      if (arr[i] < smallest) {
        secondSmallest = smallest;
        smallest = arr[i];
      } else if (arr[i] < secondSmallest && arr[i] != smallest) {
        secondSmallest = arr[i];
      }
    }

    System.out.println("Second smallest element is: " + secondSmallest);
  }
}
