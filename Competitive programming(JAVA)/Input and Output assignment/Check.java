import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter two numbers");
        Scanner sk = new Scanner(System.in);
        a = sk.nextInt();
        b = sk.nextInt();
        c = a + b;
        if (a == 30 || b == 30 || c == 30) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        sk.close();

    }
}
