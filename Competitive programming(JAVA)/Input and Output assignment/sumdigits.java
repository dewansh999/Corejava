import java.util.Scanner;

public class sumdigits {
    public static void main(String[] args) {
        int a, b, sum = 0;
        System.out.println("Enter the number ");
        Scanner sl = new Scanner(System.in);
        a = sl.nextInt();
        while (a != 0) {
            b = a % 10;
            sum += b;
            a = a / 10;
        }
        System.out.println(sum);
    }
}
