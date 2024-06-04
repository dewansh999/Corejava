import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input the 1st number: ");
    double num1 = scanner.nextDouble();

    System.out.print("Input the 2nd number: ");
    double num2 = scanner.nextDouble();

    System.out.print("Input the 3rd number: ");
    double num3 = scanner.nextDouble();

    double maxNum = Math.max(num1, Math.max(num2, num3));

    System.out.println("The greatest: " + maxNum);
  }
}
