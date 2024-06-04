import java.util.Scanner;

public class Nestedif {
    public static void main(String[] args) {
        char c;
        Scanner sk = new Scanner(System.in);
        System.out.println("Enter any value");
        c = sk.next().charAt(0);
        if (c >= 'a') {
            if (c <= 'z') {
                System.out.println("Lower case");
            }
        } else if (c >= 'A') {
            if (c <= 'Z') {
                System.out.println("Upper case ");
            }
        }
        sk.close();
    }
}
