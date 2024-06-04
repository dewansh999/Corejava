import java.util.Scanner;

/**
 * table
 */
public class table {

    public static void main(String[] args) {
        int a;
        System.out.println("Enter the number for table");
        Scanner sk = new Scanner(System.in);
        a = sk.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(a + " * " + i + " = " + a * i);
        }
        sk.close();
    }
}