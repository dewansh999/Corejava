import java.util.Scanner;

public class Amountsir {
    public static void main(String[] args) {
        int a, n, rm;
        Scanner sk = new Scanner(System.in);
        System.out.println("Enter the amount");
        a = sk.nextInt();
        n = a / 100;
        System.out.println("Notes of 100 " + n);
        rm = a - n * 100;
        n = rm / 50;
        System.out.println("Notes of 50 " + n);
        rm = rm - n * 50;
        n = rm / 20;
        System.out.println("notes of 20 " + n);
        rm = rm - n * 20;
        n = rm / 5;
        System.out.println("Notes of 10 " + n);
        sk.close();
    }
}
