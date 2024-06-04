import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        char d;
        int a, b, c;
        System.out.println("Enter your Choice");
        System.out.println("===============================");
        System.out.println("Press + for Addition ");
        System.out.println("Press - for Subtraction ");
        System.out.println("Press * for Multiplication ");
        System.out.println("Press / for Division ");
        System.out.println("===============================");
        Scanner sk = new Scanner(System.in);
        d = sk.next().charAt(0);
        System.out.println("Enter Number 1 :");
        a = sk.nextInt();
        System.out.println("Enter Number 2 :");
        b = sk.nextInt();
        switch (d) {
            case '+':
                c = a + b;
                System.out.println("Sum of number 1 and 2 = " + c);
                break;
            case '-':
                c = a - b;
                System.out.println("Subtraction of number 1 and 2 = " + c);
                break;
            case '*':
                c = a * b;
                System.out.println("Multiplication of number 1 and 2 = " + c);
                break;
            case '/':
                c = a / b;
                System.out.println("Division of number 1 and 2 = " + c);
                break;

            default:
                System.out.println("Enter wrong choice");
                break;
        }
        sk.close();
    }
}