import java.util.Scanner;

public class oddsum {
    public static void main(String[] args) {
        int a, b, c, d, e, sum = 0;
        System.out.println("Enter five numbers");
        Scanner sk = new Scanner(System.in);
        a = sk.nextInt();
        b = sk.nextInt();
        c = sk.nextInt();
        d = sk.nextInt();
        e = sk.nextInt();
        if (a % 2 != 0) {
            sum += a;
        }
        if (b % 2 != 0) {
            sum += b;
        }
        if (c % 2 != 0) {
            sum += c;
        }
        if (d % 2 != 0) {
            sum += d;
        }
        if (e % 2 != 0) {
            sum += e;
        }
        System.out.println("Sum of odd number"   + sum);
    }
}
