import java.util.Scanner;

public class Multiplid {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter any two numbers ");
        Scanner sk = new Scanner(System.in);
        a = sk.nextInt();
        b = sk.nextInt();
        if (a % b == 0) {
            System.out.println("Multiplied!");
        } else {
            System.out.println("Not Multiplied");
        }
        sk.close();
    }
}