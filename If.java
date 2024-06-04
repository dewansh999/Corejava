import java.util.*;

public class If {
    public static void main(String[] args) {
        int a, b;
        Scanner sk = new Scanner(System.in);
        System.out.println("Enter the value of A");
        a = sk.nextInt();
        System.out.println("Enter the value of B");
        b = sk.nextInt();
        if (a > b)
            System.out.println("A is greater");
        System.out.println("if-1");
        if (a < b)
            System.out.println("B is greater");
        System.out.println("if-2");
        if (a == b)
            System.out.println("A and B is equal");
        System.out.println("if-3");
        sk.close();
    }
}