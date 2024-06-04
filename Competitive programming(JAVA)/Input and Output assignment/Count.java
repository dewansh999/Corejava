import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        int a, b, c, d, e, Counte = 0, Counto = 0;
        System.out.println("Enter the numbers");
        Scanner sk = new Scanner(System.in);
        a = sk.nextInt();
        b = sk.nextInt();
        c = sk.nextInt();
        d = sk.nextInt();
        e = sk.nextInt();
        if (a > 0) {
            Counte++;
        } else {
            Counto++;
        }
        if (b > 0) {
            Counte++;
        } else {
            Counto++;
        }
        if (c > 0) {
            Counte++;
        } else {
            Counto++;
        }
        if (d > 0) {
            Counte++;
        } else {
            Counto++;
        }
        if (e > 0) {
            Counte++;
        } else {
            Counto++;
        }
        System.out.println("Positive Numbers  " + Counte);
        System.out.println("Negative Numbers  " + Counto);
    }
}
