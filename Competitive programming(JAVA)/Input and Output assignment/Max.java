
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        int a, b, sum = 0, max = 0;
        System.out.println("Enter the number ");
        Scanner sl = new Scanner(System.in);
        a = sl.nextInt();
        while (a != 0) {
            b = a % 10;
            if (b > max) {
                max = b;
            }
            sum += b;
            a = a / 10;
        }
        System.out.println(sum);
        System.out.println(max);
    }
}
