import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        int a;
        Scanner sk = new Scanner(System.in);
        System.out.println("Enter any number");
        a = sk.nextInt();
        if (a % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
        sk.close();
    }
}
